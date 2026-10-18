// port-lint: source N/A
@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.internal
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.AddrinfoRegistry
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Utsname

@JsFun(
    """() => {
        if (globalThis.__kotlinmania_libc_native) return 1;
        const proc = globalThis.process;
        const modMod = proc.getBuiltinModule("module");
        const path = proc.getBuiltinModule("path");
        const fs = proc.getBuiltinModule("fs");
        const os = proc.getBuiltinModule("os");
        const cp = proc.getBuiltinModule("child_process");
        try {
            const req = modMod.createRequire(path.join(proc.cwd(), "package.json"));
            const loaded = req("@kotlinmania/libc-native-bindings");
            if (loaded && typeof loaded.isatty === "function" && typeof loaded.uname_fields === "function" && typeof loaded.getaddrinfo_str === "function") {
                globalThis.__kotlinmania_libc_native = loaded;
                return 1;
            }
        } catch (_) {}
        const dir = path.join(os.tmpdir(), "kotlinmania-libc-napi-0.1.6-" + proc.platform + "-" + proc.arch);
        const nodeFile = path.join(dir, "libc_native.node");
        if (!fs.existsSync(nodeFile)) {
            fs.mkdirSync(dir, { recursive: true });
            const cFile = path.join(dir, "libc_native.c");
            const cCode = [
                '#include <stdio.h>',
                '#include <stdlib.h>',
                '#include <string.h>',
                '#include <errno.h>',
                '#ifdef _WIN32',
                '#include <winsock2.h>',
                '#include <ws2tcpip.h>',
                '#include <windows.h>',
                '#include <io.h>',
                '#include <process.h>',
                '#define EXPORT __declspec(dllexport)',
                '#else',
                '#include <unistd.h>',
                '#include <dlfcn.h>',
                '#include <pwd.h>',
                '#include <sys/types.h>',
                '#include <sys/socket.h>',
                '#include <netdb.h>',
                '#include <netinet/in.h>',
                '#include <sys/utsname.h>',
                '#define EXPORT',
                'extern char **environ;',
                '#endif',
                'typedef struct napi_env__* napi_env;',
                'typedef struct napi_value__* napi_value;',
                'typedef struct napi_callback_info__* napi_callback_info;',
                'typedef napi_value (*napi_callback)(napi_env, napi_callback_info);',
                'typedef enum { napi_default = 0 } napi_property_attributes;',
                'typedef struct { const char* utf8name; napi_value name; napi_callback method; napi_callback getter; napi_callback setter; napi_value value; napi_property_attributes attributes; void* data; } napi_property_descriptor;',
                'static int (*p_cb)(napi_env, napi_callback_info, size_t*, napi_value*, napi_value*, void**);',
                'static int (*p_get_str)(napi_env, napi_value, char*, size_t, size_t*);',
                'static int (*p_mk_str)(napi_env, const char*, size_t, napi_value*);',
                'static int (*p_get_i32)(napi_env, napi_value, int*);',
                'static int (*p_mk_i32)(napi_env, int, napi_value*);',
                'static int (*p_get_null)(napi_env, napi_value*);',
                'static int (*p_def_props)(napi_env, napi_value, size_t, const napi_property_descriptor*);',
                'static FILE* g_files[256];',
                'static int alloc_file_slot(FILE* fp) {',
                '  if (!fp) return 0;',
                '  for (int i = 1; i < 256; i++) { if (!g_files[i]) { g_files[i] = fp; return i; } }',
                '  fclose(fp); errno = EMFILE; return 0;',
                '}',
                'static FILE* get_file_slot(int slot) {',
                '  if (slot <= 0 || slot >= 256) return NULL;',
                '  return g_files[slot];',
                '}',
                'static void* sym(const char* n) {',
                '#ifdef _WIN32',
                '  return (void*)GetProcAddress(GetModuleHandleA(NULL), n);',
                '#else',
                '  return dlsym(RTLD_DEFAULT, n);',
                '#endif',
                '}',
                'static char* arg_str(napi_env env, napi_value v) {',
                '  size_t len = 0;',
                '  p_get_str(env, v, NULL, 0, &len);',
                '  char* b = (char*)malloc(len + 1);',
                '  p_get_str(env, v, b, len + 1, &len);',
                '  return b;',
                '}',
                'static napi_value mk_str_or_null(napi_env env, const char* s) {',
                '  napi_value r; if (!s) p_get_null(env, &r); else p_mk_str(env, s, strlen(s), &r); return r;',
                '}',
                'static napi_value mk_i32(napi_env env, int v) {',
                '  napi_value r; p_mk_i32(env, v, &r); return r;',
                '}',
                'static napi_value fn_getenv(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);',
                '  char* k = arg_str(env, a[0]); const char* v = getenv(k); free(k);',
                '  return mk_str_or_null(env, v);',
                '}',
                'static napi_value fn_setenv(napi_env env, napi_callback_info info) {',
                '  size_t c = 3; napi_value a[3]; p_cb(env, info, &c, a, NULL, NULL);',
                '  char* k = arg_str(env, a[0]); char* v = arg_str(env, a[1]); int ov = 1; p_get_i32(env, a[2], &ov);',
                '#ifdef _WIN32',
                '  int rc = (!ov && getenv(k) != NULL) ? 0 : (_putenv_s(k, v) == 0 ? 0 : -1);',
                '#else',
                '  int rc = setenv(k, v, ov);',
                '#endif',
                '  free(k); free(v); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_unsetenv(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);',
                '  char* k = arg_str(env, a[0]);',
                '#ifdef _WIN32',
                '  const char empty[1] = {0}; int rc = _putenv_s(k, empty) == 0 ? 0 : -1;',
                '#else',
                '  int rc = unsetenv(k);',
                '#endif',
                '  free(k); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_putenv(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);',
                '  char* s = arg_str(env, a[0]);',
                '#ifdef _WIN32',
                '  int rc = _putenv(s);',
                '#else',
                '  int rc = putenv(s);',
                '#endif',
                '  return mk_i32(env, rc);',
                '}',
                'static napi_value fn_putenv_s(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL);',
                '  char* k = arg_str(env, a[0]); char* v = arg_str(env, a[1]);',
                '#ifdef _WIN32',
                '  int rc = _putenv_s(k, v);',
                '#else',
                '  int rc = (strchr(k, 61) != NULL) ? EINVAL : (v[0] == 0 ? (unsetenv(k) == 0 ? 0 : errno) : (setenv(k, v, 1) == 0 ? 0 : errno));',
                '#endif',
                '  free(k); free(v); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_clearenv(napi_env env, napi_callback_info info) {',
                '  int rc = 0;',
                '#if defined(__linux__) || defined(__ANDROID__)',
                '  rc = clearenv();',
                '#elif !defined(_WIN32)',
                '  if (environ != NULL) { while (environ[0] != NULL) { const char* e = environ[0]; const char* eq = strchr(e, 61); size_t n = eq ? (size_t)(eq - e) : strlen(e); char* k = (char*)malloc(n + 1); memcpy(k, e, n); k[n] = 0; int u = unsetenv(k); free(k); if (u != 0) { rc = -1; break; } } }',
                '#else',
                '  rc = -1;',
                '#endif',
                '  return mk_i32(env, rc);',
                '}',
                'static napi_value fn_isatty(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int fd = 0; p_get_i32(env, a[0], &fd);',
                '#ifdef _WIN32',
                '  int rc = _isatty(fd);',
                '#else',
                '  int rc = isatty(fd);',
                '#endif',
                '  return mk_i32(env, rc);',
                '}',
                'static napi_value fn_get_errno(napi_env env, napi_callback_info info) {',
                '  return mk_i32(env, errno);',
                '}',
                'static napi_value fn_strerror(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int e = 0; p_get_i32(env, a[0], &e);',
                '  return mk_str_or_null(env, strerror(e));',
                '}',
                'static napi_value fn_realpath(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* p = arg_str(env, a[0]);',
                '#ifdef _WIN32',
                '  char* res = _fullpath(NULL, p, 4096);',
                '#else',
                '  char* res = realpath(p, NULL);',
                '#endif',
                '  free(p); napi_value r = mk_str_or_null(env, res); if (res) free(res); return r;',
                '}',
                'static napi_value fn_access(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* p = arg_str(env, a[0]); int m = 0; p_get_i32(env, a[1], &m);',
                '#ifdef _WIN32',
                '  int rc = _access(p, m);',
                '#else',
                '  int rc = access(p, m);',
                '#endif',
                '  free(p); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_unlink(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* p = arg_str(env, a[0]);',
                '#ifdef _WIN32',
                '  int rc = _unlink(p);',
                '#else',
                '  int rc = unlink(p);',
                '#endif',
                '  free(p); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_remove(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* p = arg_str(env, a[0]);',
                '  int rc = remove(p); free(p); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_rename(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* o = arg_str(env, a[0]); char* n = arg_str(env, a[1]);',
                '  int rc = rename(o, n); free(o); free(n); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_getpid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, _getpid());',
                '#else',
                '  return mk_i32(env, (int)getpid());',
                '#endif',
                '}',
                'static napi_value fn_getppid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, 0);',
                '#else',
                '  return mk_i32(env, (int)getppid());',
                '#endif',
                '}',
                'static napi_value fn_geteuid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, 0);',
                '#else',
                '  return mk_i32(env, (int)geteuid());',
                '#endif',
                '}',
                'static napi_value fn_getegid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, 0);',
                '#else',
                '  return mk_i32(env, (int)getegid());',
                '#endif',
                '}',
                'static napi_value fn_getuid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, 0);',
                '#else',
                '  return mk_i32(env, (int)getuid());',
                '#endif',
                '}',
                'static napi_value fn_getgid(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_i32(env, 0);',
                '#else',
                '  return mk_i32(env, (int)getgid());',
                '#endif',
                '}',
                'static napi_value fn_uname_fields(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  return mk_str_or_null(env, NULL);',
                '#else',
                '  struct utsname u; memset(&u, 0, sizeof(u)); if (uname(&u) != 0) return mk_str_or_null(env, NULL);',
                '  char out[2048]; snprintf(out, sizeof(out), "%s%c%s%c%s%c%s%c%s", u.sysname, 10, u.nodename, 10, u.release, 10, u.version, 10, u.machine);',
                '  return mk_str_or_null(env, out);',
                '#endif',
                '}',
                '#ifndef _WIN32',
                'static napi_value format_passwd_napi(napi_env env, int rc, struct passwd* res, struct passwd* pwd) {',
                '  char out[4096];',
                '  if (rc == 0 && res != NULL) {',
                '    snprintf(out, sizeof(out), "0%c1%c%s%c%s%c%u%c%u%c%s%c%s%c%s", 10, 10, pwd->pw_name ? pwd->pw_name : "", 10, pwd->pw_passwd ? pwd->pw_passwd : "", 10, (unsigned int)pwd->pw_uid, 10, (unsigned int)pwd->pw_gid, 10, pwd->pw_gecos ? pwd->pw_gecos : "", 10, pwd->pw_dir ? pwd->pw_dir : "", 10, pwd->pw_shell ? pwd->pw_shell : "");',
                '  } else {',
                '    snprintf(out, sizeof(out), "%d%c0%c%c%c0%c0%c%c%c", rc, 10, 10, 10, 10, 10, 10, 10, 10);',
                '  }',
                '  return mk_str_or_null(env, out);',
                '}',
                '#endif',
                'static napi_value fn_getpwuid_r_str(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  char out[64]; snprintf(out, sizeof(out), "38%c0%c%c%c0%c0%c%c%c", 10, 10, 10, 10, 10, 10, 10, 10); return mk_str_or_null(env, out);',
                '#else',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); int uid = 0; int blen = 4096; p_get_i32(env, a[0], &uid); p_get_i32(env, a[1], &blen);',
                '  size_t len = blen > 0 ? (size_t)blen : 4096; char* buf = (char*)malloc(len);',
                '  if (!buf) { char out[64]; snprintf(out, sizeof(out), "12%c0%c%c%c0%c0%c%c%c", 10, 10, 10, 10, 10, 10, 10, 10); return mk_str_or_null(env, out); }',
                '  struct passwd pwd; memset(&pwd, 0, sizeof(pwd)); struct passwd* res = NULL;',
                '  int rc = getpwuid_r((uid_t)uid, &pwd, buf, len, &res);',
                '  napi_value r = format_passwd_napi(env, rc, res, &pwd); free(buf); return r;',
                '#endif',
                '}',
                'static napi_value fn_getpwnam_r_str(napi_env env, napi_callback_info info) {',
                '#ifdef _WIN32',
                '  char out[64]; snprintf(out, sizeof(out), "38%c0%c%c%c0%c0%c%c%c", 10, 10, 10, 10, 10, 10, 10, 10); return mk_str_or_null(env, out);',
                '#else',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* name = arg_str(env, a[0]); int blen = 4096; p_get_i32(env, a[1], &blen);',
                '  size_t len = blen > 0 ? (size_t)blen : 4096; char* buf = (char*)malloc(len);',
                '  if (!buf) { free(name); char out[64]; snprintf(out, sizeof(out), "12%c0%c%c%c0%c0%c%c%c", 10, 10, 10, 10, 10, 10, 10, 10); return mk_str_or_null(env, out); }',
                '  struct passwd pwd; memset(&pwd, 0, sizeof(pwd)); struct passwd* res = NULL;',
                '  int rc = getpwnam_r(name, &pwd, buf, len, &res);',
                '  napi_value r = format_passwd_napi(env, rc, res, &pwd); free(buf); free(name); return r;',
                '#endif',
                '}',
                'static napi_value fn_fopen(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* p = arg_str(env, a[0]); char* m = arg_str(env, a[1]);',
                '  FILE* fp = fopen(p, m); free(p); free(m); return mk_i32(env, alloc_file_slot(fp));',
                '}',
                'static napi_value fn_fclose(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); if (!fp) { errno = EBADF; return mk_i32(env, -1); } g_files[s] = NULL; return mk_i32(env, fclose(fp));',
                '}',
                'static napi_value fn_fflush(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  if (s == 0) return mk_i32(env, fflush(NULL)); FILE* fp = get_file_slot(s); if (!fp) return mk_i32(env, -1); return mk_i32(env, fflush(fp));',
                '}',
                'static napi_value fn_fgetc(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); if (!fp) return mk_i32(env, -1); return mk_i32(env, fgetc(fp));',
                '}',
                'static napi_value fn_fputc(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); int ch = 0; int s = 0; p_get_i32(env, a[0], &ch); p_get_i32(env, a[1], &s);',
                '  FILE* fp = get_file_slot(s); if (!fp) return mk_i32(env, -1); return mk_i32(env, fputc(ch, fp));',
                '}',
                'static napi_value fn_fgets(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); int n = 0; int s = 0; p_get_i32(env, a[0], &n); p_get_i32(env, a[1], &s);',
                '  FILE* fp = get_file_slot(s); if (!fp || n <= 0) return mk_str_or_null(env, NULL);',
                '  char* buf = (char*)malloc((size_t)n + 1); if (!buf) return mk_str_or_null(env, NULL);',
                '  char* res = fgets(buf, n, fp); napi_value r = mk_str_or_null(env, res); free(buf); return r;',
                '}',
                'static napi_value fn_fputs(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* str = arg_str(env, a[0]); int s = 0; p_get_i32(env, a[1], &s);',
                '  FILE* fp = get_file_slot(s); int rc = fp ? fputs(str, fp) : -1; free(str); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_feof(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); return mk_i32(env, fp ? feof(fp) : 0);',
                '}',
                'static napi_value fn_ferror(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); return mk_i32(env, fp ? ferror(fp) : 0);',
                '}',
                'static napi_value fn_clearerr(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); if (fp) clearerr(fp); return mk_i32(env, 0);',
                '}',
                'static napi_value fn_popen(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* cmd = arg_str(env, a[0]); char* m = arg_str(env, a[1]);',
                '#ifdef _WIN32',
                '  FILE* fp = _popen(cmd, m);',
                '#else',
                '  FILE* fp = popen(cmd, m);',
                '#endif',
                '  free(cmd); free(m); return mk_i32(env, alloc_file_slot(fp));',
                '}',
                'static napi_value fn_pclose(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int s = 0; p_get_i32(env, a[0], &s);',
                '  FILE* fp = get_file_slot(s); if (!fp) { errno = EBADF; return mk_i32(env, -1); } g_files[s] = NULL;',
                '#ifdef _WIN32',
                '  return mk_i32(env, _pclose(fp));',
                '#else',
                '  return mk_i32(env, pclose(fp));',
                '#endif',
                '}',
                'static napi_value fn_close(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int fd = -1; p_get_i32(env, a[0], &fd);',
                '#ifdef _WIN32',
                '  return mk_i32(env, _close(fd));',
                '#else',
                '  return mk_i32(env, close(fd));',
                '#endif',
                '}',
                'static napi_value fn_atoi(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* s = arg_str(env, a[0]);',
                '  int rc = atoi(s); free(s); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_system(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* s = arg_str(env, a[0]);',
                '  int rc = system(s); free(s); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_strcmp(napi_env env, napi_callback_info info) {',
                '  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL); char* s1 = arg_str(env, a[0]); char* s2 = arg_str(env, a[1]);',
                '  int rc = strcmp(s1, s2); free(s1); free(s2); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_strncmp(napi_env env, napi_callback_info info) {',
                '  size_t c = 3; napi_value a[3]; p_cb(env, info, &c, a, NULL, NULL); char* s1 = arg_str(env, a[0]); char* s2 = arg_str(env, a[1]); int n = 0; p_get_i32(env, a[2], &n);',
                '  int rc = strncmp(s1, s2, (size_t)(n < 0 ? 0 : n)); free(s1); free(s2); return mk_i32(env, rc);',
                '}',
                'static napi_value fn_strlen(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); char* s = arg_str(env, a[0]);',
                '  int rc = (int)strlen(s); free(s); return mk_i32(env, rc);',
                '}',
                'static unsigned int napi_hex_nibble(char c) {',
                '  if (c >= 48 && c <= 57) return (unsigned int)(c - 48);',
                '  if (c >= 97 && c <= 102) return (unsigned int)(c - 97 + 10);',
                '  if (c >= 65 && c <= 70) return (unsigned int)(c - 65 + 10);',
                '  return 0;',
                '}',
                'static void napi_ensure_wsa(void) {',
                '#ifdef _WIN32',
                '  static int inited = 0;',
                '  if (!inited) { WSADATA wsa; if (WSAStartup(MAKEWORD(2, 2), &wsa) == 0) inited = 1; }',
                '#endif',
                '}',
                'static napi_value fn_getaddrinfo_str(napi_env env, napi_callback_info info) {',
                '  size_t c = 9; napi_value a[9]; p_cb(env, info, &c, a, NULL, NULL);',
                '  int has_node = 0, has_serv = 0, has_hints = 0, ai_flags = 0, ai_family = 0, ai_socktype = 0, ai_protocol = 0;',
                '  p_get_i32(env, a[0], &has_node); char* node = arg_str(env, a[1]);',
                '  p_get_i32(env, a[2], &has_serv); char* serv = arg_str(env, a[3]);',
                '  p_get_i32(env, a[4], &has_hints); p_get_i32(env, a[5], &ai_flags);',
                '  p_get_i32(env, a[6], &ai_family); p_get_i32(env, a[7], &ai_socktype); p_get_i32(env, a[8], &ai_protocol);',
                '  napi_ensure_wsa();',
                '  struct addrinfo hints; memset(&hints, 0, sizeof(hints));',
                '  if (has_hints) {',
                '    hints.ai_flags = ai_flags;',
                '    int fam = ai_family; if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) fam = AF_INET6;',
                '    hints.ai_family = fam; hints.ai_socktype = ai_socktype; hints.ai_protocol = ai_protocol;',
                '  }',
                '  struct addrinfo* res = NULL;',
                '  int rc = getaddrinfo(has_node ? node : NULL, has_serv ? serv : NULL, has_hints ? &hints : NULL, &res);',
                '  free(node); free(serv);',
                '  char out[16384];',
                '  if (rc != 0) { snprintf(out, sizeof(out), "%d%c0", rc, 10); return mk_str_or_null(env, out); }',
                '  int count = 0; for (struct addrinfo* p = res; p != NULL && count < 64; p = p->ai_next) count++;',
                '  size_t pos = (size_t)snprintf(out, sizeof(out), "0%c%d%c", 10, count, 10);',
                '  static const char hex_digits[] = "0123456789abcdef";',
                '  int idx = 0;',
                '  for (struct addrinfo* p = res; p != NULL && idx < count; p = p->ai_next, idx++) {',
                '    char hex[256]; size_t hex_pos = 0; unsigned int sa_fam = (unsigned int)p->ai_family;',
                '    if (p->ai_addr && p->ai_addrlen >= 2) {',
                '      sa_fam = (unsigned int)p->ai_addr->sa_family;',
                '      const unsigned char* raw = ((const unsigned char*)p->ai_addr) + 2;',
                '      size_t raw_len = (size_t)p->ai_addrlen - 2; if (raw_len > 120) raw_len = 120;',
                '      for (size_t b = 0; b < raw_len; b++) { hex[hex_pos++] = hex_digits[(raw[b] >> 4) & 0x0F]; hex[hex_pos++] = hex_digits[raw[b] & 0x0F]; }',
                '    }',
                '    hex[hex_pos] = 0; const char* canon = p->ai_canonname ? p->ai_canonname : "";',
                '    if (pos < sizeof(out)) {',
                '      int n = snprintf(out + pos, sizeof(out) - pos, "%d%c%d%c%d%c%d%c%u%c%u%c%s%c%s%c", p->ai_flags, 9, p->ai_family, 9, p->ai_socktype, 9, p->ai_protocol, 9, (unsigned int)p->ai_addrlen, 9, sa_fam, 9, hex, 9, canon, 10);',
                '      if (n > 0) pos += (size_t)n;',
                '    }',
                '  }',
                '  freeaddrinfo(res);',
                '  return mk_str_or_null(env, out);',
                '}',
                'static napi_value fn_getnameinfo_str(napi_env env, napi_callback_info info) {',
                '  size_t c = 6; napi_value a[6]; p_cb(env, info, &c, a, NULL, NULL);',
                '  int sa_family = -1, salen = 0, hostlen = 0, servlen = 0, flags = 0;',
                '  p_get_i32(env, a[0], &sa_family); char* chex = arg_str(env, a[1]);',
                '  p_get_i32(env, a[2], &salen); p_get_i32(env, a[3], &hostlen); p_get_i32(env, a[4], &servlen); p_get_i32(env, a[5], &flags);',
                '  char out[2048];',
                '  if (sa_family < 0) { free(chex); snprintf(out, sizeof(out), "%d%c%c", EAI_FAIL, 10, 10); return mk_str_or_null(env, out); }',
                '  napi_ensure_wsa();',
                '  struct sockaddr_storage ss; memset(&ss, 0, sizeof(ss));',
                '  size_t hex_len = chex ? strlen(chex) : 0; size_t data_len = hex_len / 2; if (data_len > sizeof(ss) - 2) data_len = sizeof(ss) - 2;',
                '  unsigned char* dst = ((unsigned char*)&ss) + 2;',
                '  for (size_t i = 0; i < data_len; i++) { dst[i] = (unsigned char)((napi_hex_nibble(chex[i * 2]) << 4) | napi_hex_nibble(chex[i * 2 + 1])); }',
                '  free(chex);',
                '  int fam = sa_family; if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) fam = AF_INET6;',
                '  socklen_t total_len = (socklen_t)(2 + data_len);',
                '  if ((socklen_t)salen > total_len && (size_t)salen <= sizeof(ss)) total_len = (socklen_t)salen;',
                '  if (fam == AF_INET && total_len < (socklen_t)sizeof(struct sockaddr_in)) total_len = (socklen_t)sizeof(struct sockaddr_in);',
                '  else if (fam == AF_INET6 && total_len < (socklen_t)sizeof(struct sockaddr_in6)) total_len = (socklen_t)sizeof(struct sockaddr_in6);',
                '#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)',
                '  ss.ss_len = (uint8_t)total_len; ss.ss_family = (sa_family_t)fam;',
                '#else',
                '  ss.ss_family = (unsigned short)fam;',
                '#endif',
                '  char hbuf[1025]; char sbuf[64]; memset(hbuf, 0, sizeof(hbuf)); memset(sbuf, 0, sizeof(sbuf));',
                '  socklen_t hlen = hostlen > 0 ? ((size_t)hostlen < sizeof(hbuf) ? (socklen_t)hostlen : (socklen_t)(sizeof(hbuf) - 1)) : 0;',
                '  socklen_t slen = servlen > 0 ? ((size_t)servlen < sizeof(sbuf) ? (socklen_t)servlen : (socklen_t)(sizeof(sbuf) - 1)) : 0;',
                '  int rc = getnameinfo((const struct sockaddr*)&ss, total_len, hlen > 0 ? hbuf : NULL, hlen, slen > 0 ? sbuf : NULL, slen, flags);',
                '  snprintf(out, sizeof(out), "%d%c%s%c%s", rc, 10, rc == 0 ? hbuf : "", 10, rc == 0 ? sbuf : "");',
                '  return mk_str_or_null(env, out);',
                '}',
                'static napi_value fn_gai_strerror(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int e = 0; p_get_i32(env, a[0], &e);',
                '#ifdef _WIN32',
                '  return mk_str_or_null(env, gai_strerrorA(e));',
                '#else',
                '  return mk_str_or_null(env, gai_strerror(e));',
                '#endif',
                '}',
                'static napi_value fn_hstrerror(napi_env env, napi_callback_info info) {',
                '  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int e = 0; p_get_i32(env, a[0], &e);',
                '#if !defined(_WIN32) && !defined(__ANDROID__)',
                '  return mk_str_or_null(env, hstrerror(e));',
                '#else',
                '  const char* s = (e == 0) ? "Resolver Error 0 (no error)" : (e == 1 ? "Unknown host" : "Unknown resolver error");',
                '  return mk_str_or_null(env, s);',
                '#endif',
                '}',
                'static napi_value fn_res_init(napi_env env, napi_callback_info info) {',
                '#ifndef _WIN32',
                '  typedef int (*res_init_fn)(void);',
                '  res_init_fn fn = (res_init_fn)dlsym(RTLD_DEFAULT, "res_init");',
                '  if (!fn) fn = (res_init_fn)dlsym(RTLD_DEFAULT, "__res_init");',
                '  if (fn) return mk_i32(env, fn());',
                '#endif',
                '  return mk_i32(env, 0);',
                '}',
                'EXPORT napi_value napi_register_module_v1(napi_env env, napi_value exports) {',
                '  p_cb = sym("napi_get_cb_info"); p_get_str = sym("napi_get_value_string_utf8"); p_mk_str = sym("napi_create_string_utf8"); p_get_i32 = sym("napi_get_value_int32"); p_mk_i32 = sym("napi_create_int32"); p_get_null = sym("napi_get_null"); p_def_props = sym("napi_define_properties");',
                '  napi_property_descriptor d[] = {',
                '    { "getenv", NULL, fn_getenv, NULL, NULL, NULL, napi_default, NULL },',
                '    { "setenv", NULL, fn_setenv, NULL, NULL, NULL, napi_default, NULL },',
                '    { "unsetenv", NULL, fn_unsetenv, NULL, NULL, NULL, napi_default, NULL },',
                '    { "putenv", NULL, fn_putenv, NULL, NULL, NULL, napi_default, NULL },',
                '    { "putenv_s", NULL, fn_putenv_s, NULL, NULL, NULL, napi_default, NULL },',
                '    { "clearenv", NULL, fn_clearenv, NULL, NULL, NULL, napi_default, NULL },',
                '    { "isatty", NULL, fn_isatty, NULL, NULL, NULL, napi_default, NULL },',
                '    { "get_errno", NULL, fn_get_errno, NULL, NULL, NULL, napi_default, NULL },',
                '    { "strerror", NULL, fn_strerror, NULL, NULL, NULL, napi_default, NULL },',
                '    { "realpath", NULL, fn_realpath, NULL, NULL, NULL, napi_default, NULL },',
                '    { "access", NULL, fn_access, NULL, NULL, NULL, napi_default, NULL },',
                '    { "unlink", NULL, fn_unlink, NULL, NULL, NULL, napi_default, NULL },',
                '    { "remove", NULL, fn_remove, NULL, NULL, NULL, napi_default, NULL },',
                '    { "rename", NULL, fn_rename, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getpid", NULL, fn_getpid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getppid", NULL, fn_getppid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "geteuid", NULL, fn_geteuid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getegid", NULL, fn_getegid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getuid", NULL, fn_getuid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getgid", NULL, fn_getgid, NULL, NULL, NULL, napi_default, NULL },',
                '    { "uname_fields", NULL, fn_uname_fields, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getpwuid_r_str", NULL, fn_getpwuid_r_str, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getpwnam_r_str", NULL, fn_getpwnam_r_str, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fopen", NULL, fn_fopen, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fclose", NULL, fn_fclose, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fflush", NULL, fn_fflush, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fgetc", NULL, fn_fgetc, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fputc", NULL, fn_fputc, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fgets", NULL, fn_fgets, NULL, NULL, NULL, napi_default, NULL },',
                '    { "fputs", NULL, fn_fputs, NULL, NULL, NULL, napi_default, NULL },',
                '    { "feof", NULL, fn_feof, NULL, NULL, NULL, napi_default, NULL },',
                '    { "ferror", NULL, fn_ferror, NULL, NULL, NULL, napi_default, NULL },',
                '    { "clearerr", NULL, fn_clearerr, NULL, NULL, NULL, napi_default, NULL },',
                '    { "popen", NULL, fn_popen, NULL, NULL, NULL, napi_default, NULL },',
                '    { "pclose", NULL, fn_pclose, NULL, NULL, NULL, napi_default, NULL },',
                '    { "close", NULL, fn_close, NULL, NULL, NULL, napi_default, NULL },',
                '    { "atoi", NULL, fn_atoi, NULL, NULL, NULL, napi_default, NULL },',
                '    { "system", NULL, fn_system, NULL, NULL, NULL, napi_default, NULL },',
                '    { "strcmp", NULL, fn_strcmp, NULL, NULL, NULL, napi_default, NULL },',
                '    { "strncmp", NULL, fn_strncmp, NULL, NULL, NULL, napi_default, NULL },',
                '    { "strlen", NULL, fn_strlen, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getaddrinfo_str", NULL, fn_getaddrinfo_str, NULL, NULL, NULL, napi_default, NULL },',
                '    { "getnameinfo_str", NULL, fn_getnameinfo_str, NULL, NULL, NULL, napi_default, NULL },',
                '    { "gai_strerror", NULL, fn_gai_strerror, NULL, NULL, NULL, napi_default, NULL },',
                '    { "hstrerror", NULL, fn_hstrerror, NULL, NULL, NULL, napi_default, NULL },',
                '    { "res_init", NULL, fn_res_init, NULL, NULL, NULL, napi_default, NULL }',
                '  };',
                '  p_def_props(env, exports, sizeof(d) / sizeof(d[0]), d); return exports;',
                '}'
            ].join(String.fromCharCode(10));
            fs.writeFileSync(cFile, cCode);
            const args = proc.platform === "win32" ? ["-shared", "-O2", cFile, "-lws2_32", "-o", nodeFile] : ["-shared", "-fPIC", "-O2", cFile, "-o", nodeFile];
            cp.execFileSync("clang", args);
        }
        const m = { exports: {} };
        proc.dlopen(m, nodeFile);
        globalThis.__kotlinmania_libc_native = m.exports;
        return 1;
    }""",
)
private external fun ensureLibcNapiLoaded(): Int

@JsFun("(name) => globalThis.__kotlinmania_libc_native.getenv(name)")
private external fun wasmGetenv(name: String): String?

@JsFun("(name, val, overwrite) => globalThis.__kotlinmania_libc_native.setenv(name, val, overwrite)")
private external fun wasmSetenv(name: String, value: String, overwrite: Int): Int

@JsFun("(name) => globalThis.__kotlinmania_libc_native.unsetenv(name)")
private external fun wasmUnsetenv(name: String): Int

@JsFun("(str) => globalThis.__kotlinmania_libc_native.putenv(str)")
private external fun wasmPutenv(str: String): Int

@JsFun("(name, val) => globalThis.__kotlinmania_libc_native.putenv_s(name, val)")
private external fun wasmPutenvS(name: String, value: String): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.clearenv()")
private external fun wasmClearenv(): Int

@JsFun("(fd) => globalThis.__kotlinmania_libc_native.isatty(fd)")
private external fun wasmIsatty(fd: Int): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.get_errno()")
private external fun wasmGetErrno(): Int

@JsFun("(errnum) => globalThis.__kotlinmania_libc_native.strerror(errnum)")
private external fun wasmStrerror(errnum: Int): String?

@JsFun("(path) => globalThis.__kotlinmania_libc_native.realpath(path)")
private external fun wasmRealpath(path: String): String?

@JsFun("(path, mode) => globalThis.__kotlinmania_libc_native.access(path, mode)")
private external fun wasmAccess(path: String, mode: Int): Int

@JsFun("(path) => globalThis.__kotlinmania_libc_native.unlink(path)")
private external fun wasmUnlink(path: String): Int

@JsFun("(path) => globalThis.__kotlinmania_libc_native.remove(path)")
private external fun wasmRemove(path: String): Int

@JsFun("(oldname, newname) => globalThis.__kotlinmania_libc_native.rename(oldname, newname)")
private external fun wasmRename(oldname: String, newname: String): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.getpid()")
private external fun wasmGetpid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.getppid()")
private external fun wasmGetppid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.geteuid()")
private external fun wasmGeteuid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.getegid()")
private external fun wasmGetegid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.getuid()")
private external fun wasmGetuid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.getgid()")
private external fun wasmGetgid(): Int

@JsFun("() => globalThis.__kotlinmania_libc_native.uname_fields()")
private external fun wasmUnameFields(): String?

@JsFun("(uid, buflen) => globalThis.__kotlinmania_libc_native.getpwuid_r_str(uid, buflen)")
private external fun wasmGetpwuidRStr(uid: Int, buflen: Int): String

@JsFun("(name, buflen) => globalThis.__kotlinmania_libc_native.getpwnam_r_str(name, buflen)")
private external fun wasmGetpwnamRStr(name: String, buflen: Int): String

@JsFun("(path, mode) => globalThis.__kotlinmania_libc_native.fopen(path, mode)")
private external fun wasmFopen(path: String, mode: String): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.fclose(fp)")
private external fun wasmFclose(fp: Int): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.fflush(fp)")
private external fun wasmFflush(fp: Int): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.fgetc(fp)")
private external fun wasmFgetc(fp: Int): Int

@JsFun("(c, fp) => globalThis.__kotlinmania_libc_native.fputc(c, fp)")
private external fun wasmFputc(c: Int, fp: Int): Int

@JsFun("(n, fp) => globalThis.__kotlinmania_libc_native.fgets(n, fp)")
private external fun wasmFgets(n: Int, fp: Int): String?

@JsFun("(s, fp) => globalThis.__kotlinmania_libc_native.fputs(s, fp)")
private external fun wasmFputs(s: String, fp: Int): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.feof(fp)")
private external fun wasmFeof(fp: Int): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.ferror(fp)")
private external fun wasmFerror(fp: Int): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.clearerr(fp)")
private external fun wasmClearerr(fp: Int): Int

@JsFun("(command, mode) => globalThis.__kotlinmania_libc_native.popen(command, mode)")
private external fun wasmPopen(command: String, mode: String): Int

@JsFun("(fp) => globalThis.__kotlinmania_libc_native.pclose(fp)")
private external fun wasmPclose(fp: Int): Int

@JsFun("(fd) => globalThis.__kotlinmania_libc_native.close(fd)")
private external fun wasmClose(fd: Int): Int

@JsFun("(s) => globalThis.__kotlinmania_libc_native.atoi(s)")
private external fun wasmAtoi(s: String): Int

@JsFun("(s) => globalThis.__kotlinmania_libc_native.system(s)")
private external fun wasmSystem(s: String): Int

@JsFun("(cs, ct) => globalThis.__kotlinmania_libc_native.strcmp(cs, ct)")
private external fun wasmStrcmp(cs: String, ct: String): Int

@JsFun("(cs, ct, n) => globalThis.__kotlinmania_libc_native.strncmp(cs, ct, n)")
private external fun wasmStrncmp(cs: String, ct: String, n: Int): Int

@JsFun("(cs) => globalThis.__kotlinmania_libc_native.strlen(cs)")
private external fun wasmStrlen(cs: String): Int

@JsFun("(hasNode, node, hasServ, serv, hasHints, aiFlags, aiFamily, aiSocktype, aiProtocol) => globalThis.__kotlinmania_libc_native.getaddrinfo_str(hasNode, node, hasServ, serv, hasHints, aiFlags, aiFamily, aiSocktype, aiProtocol)")
private external fun wasmGetaddrinfoStr(
    hasNode: Int,
    node: String,
    hasServ: Int,
    serv: String,
    hasHints: Int,
    aiFlags: Int,
    aiFamily: Int,
    aiSocktype: Int,
    aiProtocol: Int,
): String

@JsFun("(saFamily, saDataHex, salen, hostlen, servlen, flags) => globalThis.__kotlinmania_libc_native.getnameinfo_str(saFamily, saDataHex, salen, hostlen, servlen, flags)")
private external fun wasmGetnameinfoStr(
    saFamily: Int,
    saDataHex: String,
    salen: Int,
    hostlen: Int,
    servlen: Int,
    flags: Int,
): String

@JsFun("(errcode) => globalThis.__kotlinmania_libc_native.gai_strerror(errcode)")
private external fun wasmGaiStrerror(errcode: Int): String?

@JsFun("(errcode) => globalThis.__kotlinmania_libc_native.hstrerror(errcode)")
private external fun wasmHstrerror(errcode: Int): String?

@JsFun("() => globalThis.__kotlinmania_libc_native.res_init()")
private external fun wasmResInit(): Int

internal object LibcNapiWasm {
    init {
        ensureLibcNapiLoaded()
    }

    fun getenv(name: String?): String? = if (name == null) null else wasmGetenv(name)

    fun setenv(name: String?, value: String?, overwrite: Int): Int =
        if (name == null || value == null) -1 else wasmSetenv(name, value, overwrite)

    fun unsetenv(name: String?): Int = if (name == null) -1 else wasmUnsetenv(name)

    fun putenv(str: String?): Int = if (str == null) -1 else wasmPutenv(str)

    fun putenvS(name: String?, value: String?): Int =
        if (name == null || value == null) 22 else wasmPutenvS(name, value)

    fun clearenv(): Int = wasmClearenv()

    fun isatty(fd: Int): Int = wasmIsatty(fd)

    fun getErrno(): Int = wasmGetErrno()

    fun strerror(errnum: Int): String? = wasmStrerror(errnum)

    fun realpath(pathname: String?): String? = if (pathname == null) null else wasmRealpath(pathname)

    fun access(path: String?, mode: Int): Int = if (path == null) -1 else wasmAccess(path, mode)

    fun unlink(path: String?): Int = if (path == null) -1 else wasmUnlink(path)

    fun remove(filename: String?): Int = if (filename == null) -1 else wasmRemove(filename)

    fun rename(oldname: String?, newname: String?): Int =
        if (oldname == null || newname == null) -1 else wasmRename(oldname, newname)

    fun close(fd: Int): Int = wasmClose(fd)

    fun atoi(s: String?): Int = if (s == null) 0 else wasmAtoi(s)

    fun system(s: String?): Int = if (s == null) 1 else wasmSystem(s)

    fun strcmp(cs: String?, ct: String?): Int =
        if (cs == null || ct == null) 0 else wasmStrcmp(cs, ct)

    fun strncmp(cs: String?, ct: String?, n: ULong): Int =
        if (cs == null || ct == null) 0 else wasmStrncmp(cs, ct, n.toLong().coerceIn(0L, Int.MAX_VALUE.toLong()).toInt())

    fun strlen(cs: String?): ULong =
        if (cs == null) 0uL else wasmStrlen(cs).toULong()

    fun getpid(): Int = wasmGetpid()

    fun getppid(): Int = wasmGetppid()

    fun geteuid(): UInt = wasmGeteuid().toUInt()

    fun getegid(): UInt = wasmGetegid().toUInt()

    fun getuid(): UInt = wasmGetuid().toUInt()

    fun getgid(): UInt = wasmGetgid().toUInt()

    fun fopen(filename: String?, mode: String?): FILE? {
        if (filename == null || mode == null) return null
        val h = wasmFopen(filename, mode)
        return if (h > 0) FILE(h.toLong()) else null
    }

    fun fclose(file: FILE?): Int =
        if (file == null || file.handle <= 0L) -1 else wasmFclose(file.handle.toInt())

    fun fflush(file: FILE?): Int =
        if (file == null) {
            wasmFflush(0)
        } else if (file.handle <= 0L) {
            -1
        } else {
            wasmFflush(file.handle.toInt())
        }

    fun fgetc(stream: FILE?): Int =
        if (stream == null || stream.handle <= 0L) -1 else wasmFgetc(stream.handle.toInt())

    fun fputc(c: Int, stream: FILE?): Int =
        if (stream == null || stream.handle <= 0L) -1 else wasmFputc(c, stream.handle.toInt())

    fun fgets(n: Int, stream: FILE?): String? =
        if (stream == null || stream.handle <= 0L || n <= 0) null else wasmFgets(n, stream.handle.toInt())

    fun fputs(s: String?, stream: FILE?): Int =
        if (s == null || stream == null || stream.handle <= 0L) -1 else wasmFputs(s, stream.handle.toInt())

    fun feof(stream: FILE?): Int =
        if (stream == null || stream.handle <= 0L) 0 else wasmFeof(stream.handle.toInt())

    fun ferror(stream: FILE?): Int =
        if (stream == null || stream.handle <= 0L) 0 else wasmFerror(stream.handle.toInt())

    fun clearerr(stream: FILE?) {
        if (stream != null && stream.handle > 0L) {
            wasmClearerr(stream.handle.toInt())
        }
    }

    fun popen(command: String?, mode: String?): FILE? {
        if (command == null || mode == null) return null
        val h = wasmPopen(command, mode)
        return if (h > 0) FILE(h.toLong()) else null
    }

    fun pclose(stream: FILE?): Int =
        if (stream == null || stream.handle <= 0L) -1 else wasmPclose(stream.handle.toInt())

    private fun copyCStringInto(src: String, dst: ByteArray) {
        dst.fill(0)
        val bytes = src.encodeToByteArray()
        val copyLen = minOf(bytes.size, (dst.size - 1).coerceAtLeast(0))
        for (i in 0 until copyLen) {
            dst[i] = bytes[i]
        }
    }

    fun uname(buf: Utsname?): Int {
        if (buf == null) return -1
        val raw = wasmUnameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.bsd.Utsname?): Int {
        if (buf == null) return -1
        val raw = wasmUnameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    private fun applyPasswdRResult(raw: String, pwd: Passwd?, result: COpaquePointer?): Int {
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1)?.toIntOrNull() ?: 0
        if (rc == 0 && found != 0 && pwd != null && lines.size >= 9) {
            pwd.pwName = lines[2]
            pwd.pwPasswd = lines[3]
            pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
            pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
            pwd.pwGecos = lines[6]
            pwd.pwDir = lines[7]
            pwd.pwShell = lines[8]
            result?.value = 1L
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwuidR(uid: UInt, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
        val len = buflen.toLong().coerceIn(1L, 1048576L).toInt()
        return applyPasswdRResult(wasmGetpwuidRStr(uid.toInt(), len), pwd, result)
    }

    fun getpwnamR(name: String?, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        val len = buflen.toLong().coerceIn(1L, 1048576L).toInt()
        return applyPasswdRResult(wasmGetpwnamRStr(name, len), pwd, result)
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwuidR(uid, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwnamR(name, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    fun getpwuid(uid: UInt): Passwd? {
        val pwd = Passwd()
        val res = COpaquePointer(0L)
        val rc = getpwuidR(uid, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getpwnam(name: String?): Passwd? {
        if (name == null) return null
        val pwd = Passwd()
        val res = COpaquePointer(0L)
        val rc = getpwnamR(name, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getaddrinfo(
        node: String?,
        service: String?,
        hints: Addrinfo?,
        res: COpaquePointer?,
    ): Int {
        val raw =
            wasmGetaddrinfoStr(
                if (node != null) 1 else 0,
                node.orEmpty(),
                if (service != null) 1 else 0,
                service.orEmpty(),
                if (hints != null) 1 else 0,
                hints?.aiFlags ?: 0,
                hints?.aiFamily ?: 0,
                hints?.aiSocktype ?: 0,
                hints?.aiProtocol ?: 0,
            )
        return AddrinfoRegistry.parsePackedResult(raw, hints, res)
    }

    fun freeaddrinfo(res: Addrinfo?) {
        AddrinfoRegistry.freeChain(res)
    }

    fun getnameinfo(
        sa: Sockaddr?,
        salen: UInt,
        host: ByteArray?,
        hostlen: UInt,
        serv: ByteArray?,
        servlen: UInt,
        flags: Int,
    ): Int {
        if (sa == null) return -1
        val hex = AddrinfoRegistry.encodeHex(sa.saData)
        val raw =
            wasmGetnameinfoStr(
                sa.saFamily.toInt(),
                hex,
                salen.toInt(),
                if (host != null) hostlen.toInt() else 0,
                if (serv != null) servlen.toInt() else 0,
                flags,
            )
        return AddrinfoRegistry.applyGetnameinfoResult(raw, host, hostlen, serv, servlen)
    }

    fun gaiStrerror(errcode: Int): String? = wasmGaiStrerror(errcode)

    fun hstrerror(errcode: Int): String? = wasmHstrerror(errcode)

    fun resInit(): Int = wasmResInit()
}
