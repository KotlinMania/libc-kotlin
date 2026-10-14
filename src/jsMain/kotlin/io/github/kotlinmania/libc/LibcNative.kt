// port-lint: source N/A
package io.github.kotlinmania.libc

/**
 * N-API native bindings for libc functions on JS/WASM targets.
 *
 * This object loads the shared C++ N-API addon (`native/node-libc/`) which wraps
 * direct C library calls. Both Kotlin/JS (nodeMain) and Kotlin/WASM (wasmJsMain
 * via Node.js) load the same compiled `.node` binary.
 *
 * The C++ addon is a reusable library — both sides import and use the same object.
 * No insecure NPM dependencies are used. All calls go through Node N-API directly
 * to the system C library.
 */
public external interface LibcNativeBindings {
    // stdio
    public fun fopen(path: String, mode: String): Int

    public fun fclose(fp: Int): Int

    public fun fread(buffer: dynamic, size: Int, count: Int, fp: Int): Int

    public fun fwrite(buffer: dynamic, size: Int, count: Int, fp: Int): Int

    public fun fseek(fp: Int, offset: Int, whence: Int): Int

    public fun ftell(fp: Int): Int

    public fun fflush(fp: Int): Int

    public fun fgetc(fp: Int): Int

    public fun fputc(c: Int, fp: Int): Int

    public fun fgets(n: Int, fp: Int): String?

    public fun fputs(s: String, fp: Int): Int

    public fun feof(fp: Int): Int

    public fun ferror(fp: Int): Int

    public fun clearerr(fp: Int): Int

    public fun popen(command: String, mode: String): Int

    public fun pclose(fp: Int): Int

    public fun remove(filename: String): Int

    public fun rename(oldname: String, newname: String): Int

    public fun printf(str: String): Int

    // unistd
    public fun close(fd: Int): Int

    public fun read(fd: Int, buffer: dynamic, count: Int): Int

    public fun write(fd: Int, buffer: dynamic, count: Int): Int

    public fun lseek(fd: Int, offset: Int, whence: Int): Int

    public fun exit(status: Int)

    public fun access(path: String, mode: Int): Int

    public fun unlink(path: String): Int

    public fun gethostname(): String

    public fun getpid(): Int

    public fun getppid(): Int

    public fun sleep(seconds: Int): Int

    public fun isatty(fd: Int): Int

    // string
    public fun strlen(s: String): Int

    public fun strcmp(a: String, b: String): Int

    public fun strncmp(a: String, b: String, n: Int): Int

    public fun memcpy(dst: dynamic, src: dynamic, n: Int): dynamic

    public fun memset(buf: dynamic, value: Int, n: Int): dynamic

    public fun memcmp(a: dynamic, b: dynamic, n: Int): Int

    public fun strchr(s: String, ch: Int): Int

    public fun strerror(errnum: Int): String?

    // stdlib
    public fun malloc(size: Int): Int

    public fun calloc(nobj: Int, size: Int): Int

    public fun realloc(ptr: Int, size: Int): Int

    public fun free(ptr: Int)

    public fun atoi(s: String): Int

    public fun strtol(s: String, base: Int): Double

    public fun strtod(s: String): Double

    public fun getenv(name: String): String?

    public fun setenv(name: String, value: String, overwrite: Int): Int

    public fun unsetenv(name: String): Int

    public fun putenv(str: String): Int

    public fun putenv_s(name: String, value: String): Int

    public fun clearenv(): Int

    public fun system(cmd: String): Int

    public fun realpath(pathname: String): String?

    // math
    public fun ceil(x: Double): Double

    public fun floor(x: Double): Double

    public fun round(x: Double): Double

    public fun sqrt(x: Double): Double

    public fun pow(base: Double, exp: Double): Double

    public fun abs(x: Int): Int

    public fun fabs(x: Double): Double

    public fun sin(x: Double): Double

    public fun cos(x: Double): Double

    public fun tan(x: Double): Double

    public fun ceilf(x: Float): Float

    public fun floorf(x: Float): Float

    public fun roundf(x: Float): Float

    // errno
    public val errno: Int

    public fun get_errno(): Int

    // uname & passwd
    public fun uname_fields(): String?

    public fun getpwuid_r_str(uid: Int, buflen: Int): String

    public fun getpwnam_r_str(name: String, buflen: Int): String

    // sockets
    public fun socket(domain: Int, type: Int, protocol: Int): Int

    public fun bind(fd: Int, addr: dynamic): Int

    public fun connect(fd: Int, addr: dynamic): Int

    public fun listen(fd: Int, backlog: Int): Int

    public fun accept(fd: Int): dynamic

    public fun getsockopt(fd: Int, level: Int, optname: Int, maxLen: Int = definedExternally): dynamic

    public fun setsockopt(fd: Int, level: Int, optname: Int, optval: dynamic): Int

    public fun shutdown(fd: Int, how: Int): Int

    public fun send(fd: Int, buffer: dynamic, flags: Int = definedExternally): Double

    public fun recv(fd: Int, len: Double, flags: Int = definedExternally): dynamic

    public fun socketpair(domain: Int, type: Int, protocol: Int): dynamic

    // poll & select
    public fun poll(fdsArray: dynamic, timeout: Int): Int

    public fun select(readFds: dynamic, writeFds: dynamic, exceptFds: dynamic, timeoutMs: Double): Int

    // terminal & ioctl
    public fun ioctl(fd: Int, request: Double, argBuffer: dynamic = definedExternally): Int

    public fun ioctlTiocgwinsz(fd: Int): dynamic

    public fun tcgetattr(fd: Int): dynamic

    public fun tcsetattr(fd: Int, optionalActions: Int, termiosBuffer: dynamic): Int

    public fun cfmakeraw(termiosBuffer: dynamic): dynamic

    // sys, memory locking & process
    public fun getpeereid(sockfd: Int): dynamic

    public fun mlock(addr: Double, len: Double): Int

    public fun munlock(addr: Double, len: Double): Int

    public fun sysconf(name: Int): Double

    public fun geteuid(): Int

    public fun getegid(): Int

    public fun getuid(): Int

    public fun getgid(): Int

    public fun kill(pid: Int, sig: Int): Int

    public fun sendmsg(fd: Int, name: dynamic, iov: dynamic, control: dynamic, flags: Int): Double

    public fun recvmsg(fd: Int, name: dynamic, iov: dynamic, control: dynamic, flags: Int): dynamic

    public fun syscall(
        num: Double,
        a1: Double = definedExternally,
        a2: Double = definedExternally,
        a3: Double = definedExternally,
        a4: Double = definedExternally,
        a5: Double = definedExternally,
        a6: Double = definedExternally,
    ): Double

    public fun pidfd_open(pid: Int, flags: Int): Int
}

private fun loadLibcNative(): LibcNativeBindings =
    js(
        """
        (function() {
            if (globalThis.__kotlinmania_libc_native) return globalThis.__kotlinmania_libc_native;
            var proc = globalThis.process;
            var modMod = proc.getBuiltinModule("module");
            var path = proc.getBuiltinModule("path");
            var fs = proc.getBuiltinModule("fs");
            var os = proc.getBuiltinModule("os");
            var cp = proc.getBuiltinModule("child_process");
            try {
                var req = modMod.createRequire(path.join(proc.cwd(), "package.json"));
                var loaded = req("@kotlinmania/libc-native-bindings");
                if (loaded && typeof loaded.isatty === "function" && typeof loaded.uname_fields === "function") {
                    globalThis.__kotlinmania_libc_native = loaded;
                    return loaded;
                }
            } catch (_) {}
            var dir = path.join(os.tmpdir(), "kotlinmania-libc-napi-0.1.5-" + proc.platform + "-" + proc.arch);
            var nodeFile = path.join(dir, "libc_native.node");
            if (!fs.existsSync(nodeFile)) {
                fs.mkdirSync(dir, { recursive: true });
                var cFile = path.join(dir, "libc_native.c");
                var cCode = [
                    '#include <stdio.h>',
                    '#include <stdlib.h>',
                    '#include <string.h>',
                    '#include <errno.h>',
                    '#ifdef _WIN32',
                    '#include <windows.h>',
                    '#include <io.h>',
                    '#include <process.h>',
                    '#define EXPORT __declspec(dllexport)',
                    '#else',
                    '#include <unistd.h>',
                    '#include <dlfcn.h>',
                    '#include <pwd.h>',
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
                    '    { "pclose", NULL, fn_pclose, NULL, NULL, NULL, napi_default, NULL }',
                    '  };',
                    '  p_def_props(env, exports, 35, d); return exports;',
                    '}'
                ].join(String.fromCharCode(10));
                fs.writeFileSync(cFile, cCode);
                var args = proc.platform === "win32" ? ["-shared", "-O2", cFile, "-o", nodeFile] : ["-shared", "-fPIC", "-O2", cFile, "-o", nodeFile];
                cp.execFileSync("clang", args);
            }
            var m = { exports: {} };
            proc.dlopen(m, nodeFile);
            globalThis.__kotlinmania_libc_native = m.exports;
            return m.exports;
        })()
        """,
    ).unsafeCast<LibcNativeBindings>()

public val LibcNative: LibcNativeBindings = loadLibcNative()
