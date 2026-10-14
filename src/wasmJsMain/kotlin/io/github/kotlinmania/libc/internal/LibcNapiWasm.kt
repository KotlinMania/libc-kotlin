// port-lint: source N/A
@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.internal

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
            if (loaded && typeof loaded.isatty === "function") {
                globalThis.__kotlinmania_libc_native = loaded;
                return 1;
            }
        } catch (_) {}
        const dir = path.join(os.tmpdir(), "kotlinmania-libc-napi-0.1.4-" + proc.platform + "-" + proc.arch);
        const nodeFile = path.join(dir, "libc_native.node");
        if (!fs.existsSync(nodeFile)) {
            fs.mkdirSync(dir, { recursive: true });
            const cFile = path.join(dir, "libc_native.c");
            const cCode = [
                "#include <stdlib.h>",
                "#include <string.h>",
                "#include <errno.h>",
                "#ifdef _WIN32",
                "#include <windows.h>",
                "#include <io.h>",
                "#define EXPORT __declspec(dllexport)",
                "#else",
                "#include <unistd.h>",
                "#include <dlfcn.h>",
                "#define EXPORT",
                "extern char **environ;",
                "#endif",
                "typedef struct napi_env__* napi_env;",
                "typedef struct napi_value__* napi_value;",
                "typedef struct napi_callback_info__* napi_callback_info;",
                "typedef napi_value (*napi_callback)(napi_env, napi_callback_info);",
                "typedef enum { napi_default = 0 } napi_property_attributes;",
                "typedef struct { const char* utf8name; napi_value name; napi_callback method; napi_callback getter; napi_callback setter; napi_value value; napi_property_attributes attributes; void* data; } napi_property_descriptor;",
                "static int (*p_cb)(napi_env, napi_callback_info, size_t*, napi_value*, napi_value*, void**);",
                "static int (*p_get_str)(napi_env, napi_value, char*, size_t, size_t*);",
                "static int (*p_mk_str)(napi_env, const char*, size_t, napi_value*);",
                "static int (*p_get_i32)(napi_env, napi_value, int*);",
                "static int (*p_mk_i32)(napi_env, int, napi_value*);",
                "static int (*p_get_null)(napi_env, napi_value*);",
                "static int (*p_def_props)(napi_env, napi_value, size_t, const napi_property_descriptor*);",
                "static void* sym(const char* n) {",
                "#ifdef _WIN32",
                "  return (void*)GetProcAddress(GetModuleHandleA(NULL), n);",
                "#else",
                "  return dlsym(RTLD_DEFAULT, n);",
                "#endif",
                "}",
                "static char* arg_str(napi_env env, napi_value v) {",
                "  size_t len = 0;",
                "  p_get_str(env, v, NULL, 0, &len);",
                "  char* b = (char*)malloc(len + 1);",
                "  p_get_str(env, v, b, len + 1, &len);",
                "  return b;",
                "}",
                "static napi_value fn_getenv(napi_env env, napi_callback_info info) {",
                "  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);",
                "  char* k = arg_str(env, a[0]); const char* v = getenv(k); free(k);",
                "  napi_value r; if (!v) p_get_null(env, &r); else p_mk_str(env, v, strlen(v), &r); return r;",
                "}",
                "static napi_value fn_setenv(napi_env env, napi_callback_info info) {",
                "  size_t c = 3; napi_value a[3]; p_cb(env, info, &c, a, NULL, NULL);",
                "  char* k = arg_str(env, a[0]); char* v = arg_str(env, a[1]); int ov = 1; p_get_i32(env, a[2], &ov);",
                "#ifdef _WIN32",
                "  int rc = (!ov && getenv(k) != NULL) ? 0 : (_putenv_s(k, v) == 0 ? 0 : -1);",
                "#else",
                "  int rc = setenv(k, v, ov);",
                "#endif",
                "  free(k); free(v); napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static napi_value fn_unsetenv(napi_env env, napi_callback_info info) {",
                "  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);",
                "  char* k = arg_str(env, a[0]);",
                "#ifdef _WIN32",
                "  const char empty[1] = {0}; int rc = _putenv_s(k, empty) == 0 ? 0 : -1;",
                "#else",
                "  int rc = unsetenv(k);",
                "#endif",
                "  free(k); napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static napi_value fn_putenv(napi_env env, napi_callback_info info) {",
                "  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL);",
                "  char* s = arg_str(env, a[0]);",
                "#ifdef _WIN32",
                "  int rc = _putenv(s);",
                "#else",
                "  int rc = putenv(s);",
                "#endif",
                "  napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static napi_value fn_putenv_s(napi_env env, napi_callback_info info) {",
                "  size_t c = 2; napi_value a[2]; p_cb(env, info, &c, a, NULL, NULL);",
                "  char* k = arg_str(env, a[0]); char* v = arg_str(env, a[1]);",
                "#ifdef _WIN32",
                "  int rc = _putenv_s(k, v);",
                "#else",
                "  int rc = (strchr(k, 61) != NULL) ? EINVAL : (v[0] == 0 ? (unsetenv(k) == 0 ? 0 : errno) : (setenv(k, v, 1) == 0 ? 0 : errno));",
                "#endif",
                "  free(k); free(v); napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static napi_value fn_clearenv(napi_env env, napi_callback_info info) {",
                "  int rc = 0;",
                "#if defined(__linux__) || defined(__ANDROID__)",
                "  rc = clearenv();",
                "#elif !defined(_WIN32)",
                "  if (environ != NULL) { while (environ[0] != NULL) { const char* e = environ[0]; const char* eq = strchr(e, 61); size_t n = eq ? (size_t)(eq - e) : strlen(e); char* k = (char*)malloc(n + 1); memcpy(k, e, n); k[n] = 0; int u = unsetenv(k); free(k); if (u != 0) { rc = -1; break; } } }",
                "#else",
                "  rc = -1;",
                "#endif",
                "  napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static napi_value fn_isatty(napi_env env, napi_callback_info info) {",
                "  size_t c = 1; napi_value a[1]; p_cb(env, info, &c, a, NULL, NULL); int fd = 0; p_get_i32(env, a[0], &fd);",
                "#ifdef _WIN32",
                "  int rc = _isatty(fd);",
                "#else",
                "  int rc = isatty(fd);",
                "#endif",
                "  napi_value r; p_mk_i32(env, rc, &r); return r;",
                "}",
                "static const char N_CB[] = {110,97,112,105,95,103,101,116,95,99,98,95,105,110,102,111,0};",
                "static const char N_GS[] = {110,97,112,105,95,103,101,116,95,118,97,108,117,101,95,115,116,114,105,110,103,95,117,116,102,56,0};",
                "static const char N_MS[] = {110,97,112,105,95,99,114,101,97,116,101,95,115,116,114,105,110,103,95,117,116,102,56,0};",
                "static const char N_GI[] = {110,97,112,105,95,103,101,116,95,118,97,108,117,101,95,105,110,116,51,50,0};",
                "static const char N_MI[] = {110,97,112,105,95,99,114,101,97,116,101,95,105,110,116,51,50,0};",
                "static const char N_GN[] = {110,97,112,105,95,103,101,116,95,110,117,108,108,0};",
                "static const char N_DP[] = {110,97,112,105,95,100,101,102,105,110,101,95,112,114,111,112,101,114,116,105,101,115,0};",
                "static const char K_GE[] = {103,101,116,101,110,118,0};",
                "static const char K_SE[] = {115,101,116,101,110,118,0};",
                "static const char K_UE[] = {117,110,115,101,116,101,110,118,0};",
                "static const char K_PE[] = {112,117,116,101,110,118,0};",
                "static const char K_PS[] = {112,117,116,101,110,118,95,115,0};",
                "static const char K_CE[] = {99,108,101,97,114,101,110,118,0};",
                "static const char K_IA[] = {105,115,97,116,116,121,0};",
                "EXPORT napi_value napi_register_module_v1(napi_env env, napi_value exports) {",
                "  p_cb = sym(N_CB); p_get_str = sym(N_GS); p_mk_str = sym(N_MS); p_get_i32 = sym(N_GI); p_mk_i32 = sym(N_MI); p_get_null = sym(N_GN); p_def_props = sym(N_DP);",
                "  napi_property_descriptor d[] = {",
                "    { K_GE, NULL, fn_getenv, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_SE, NULL, fn_setenv, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_UE, NULL, fn_unsetenv, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_PE, NULL, fn_putenv, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_PS, NULL, fn_putenv_s, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_CE, NULL, fn_clearenv, NULL, NULL, NULL, napi_default, NULL },",
                "    { K_IA, NULL, fn_isatty, NULL, NULL, NULL, napi_default, NULL }",
                "  };",
                "  p_def_props(env, exports, 7, d); return exports;",
                "}"
            ].join("\n");
            fs.writeFileSync(cFile, cCode);
            const args = proc.platform === "win32" ? ["-shared", "-O2", cFile, "-o", nodeFile] : ["-shared", "-fPIC", "-O2", cFile, "-o", nodeFile];
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
}
