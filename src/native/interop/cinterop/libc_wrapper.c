#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "libc_wrapper.h"
#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#include <io.h>
#include <direct.h>
#include <process.h>
#include <fcntl.h>
#include <sys/stat.h>
#else
#include <dlfcn.h>
#include <unistd.h>
#include <fcntl.h>
#ifdef __APPLE__
#include <mach/mach_init.h>
#endif
#endif

#if defined(_MSC_VER)
#define KM_TLS __declspec(thread)
#elif defined(__cplusplus)
#define KM_TLS thread_local
#else
#define KM_TLS _Thread_local
#endif
static KM_TLS int32_t km_saved_errno = 0;

static uintptr_t km_c_errno_ptr(void) { return (uintptr_t)&errno; }

#ifdef _WIN32
static int km_c_setenv_win(const char* k, const char* v, int overwrite) {
    if (!k || !v || k[0] == '\0' || strchr(k, '=') != NULL) { errno = EINVAL; return -1; }
    if (!overwrite && getenv(k) != NULL) return 0;
    int err = _putenv_s(k, v);
    if (err != 0) { errno = err; return -1; }
    return 0;
}
static int km_c_unsetenv_win(const char* k) {
    if (!k || k[0] == '\0' || strchr(k, '=') != NULL) { errno = EINVAL; return -1; }
    int err = _putenv_s(k, "");
    if (err != 0) { errno = err; return -1; }
    return 0;
}
static int64_t km_c_lseek64_win(int fd, int64_t offset, int whence) {
    return (int64_t)_lseeki64(fd, (__int64)offset, whence);
}
static int km_c_open_win(const char* path, int oflag, int mode) {
    return _open(path, oflag | _O_BINARY, mode & (_S_IREAD | _S_IWRITE));
}
static void* km_resolve_c_proc(const char* symbol) {
    if (!symbol || symbol[0] == '\0') return NULL;
    if (strcmp(symbol, "setenv") == 0) { void* p = NULL; int (*f)(const char*, const char*, int) = km_c_setenv_win; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "unsetenv") == 0) { void* p = NULL; int (*f)(const char*) = km_c_unsetenv_win; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "lseek") == 0 || strcmp(symbol, "lseek64") == 0 || strcmp(symbol, "_lseeki64") == 0) { void* p = NULL; int64_t (*f)(int, int64_t, int) = km_c_lseek64_win; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "open") == 0) { void* p = NULL; int (*f)(const char*, int, int) = km_c_open_win; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "__error") == 0 || strcmp(symbol, "__errno_location") == 0 || strcmp(symbol, "_errno") == 0) { void* p = NULL; uintptr_t (*f)(void) = km_c_errno_ptr; memcpy(&p, &f, sizeof(p)); return p; }
    static const char* dlls[] = { "ucrtbase.dll", "msvcrt.dll", "kernel32.dll", "ws2_32.dll", "advapi32.dll", "ntdll.dll", "bcrypt.dll", "userenv.dll", "shell32.dll", "ole32.dll" };
    size_t i;
    for (i = 0; i < sizeof(dlls) / sizeof(dlls[0]); ++i) {
        HMODULE mod = GetModuleHandleA(dlls[i]);
        if (!mod) mod = LoadLibraryA(dlls[i]);
        if (mod) {
            FARPROC fp = GetProcAddress(mod, symbol);
            if (fp) { void* out = NULL; memcpy(&out, &fp, sizeof(out)); return out; }
        }
    }
    if (symbol[0] != '_' && strlen(symbol) < 240) {
        char underscored[256];
        underscored[0] = '_';
        strcpy(underscored + 1, symbol);
        for (i = 0; i < 2; ++i) {
            HMODULE mod = GetModuleHandleA(dlls[i]);
            if (!mod) mod = LoadLibraryA(dlls[i]);
            if (mod) {
                FARPROC fp = GetProcAddress(mod, underscored);
                if (fp) { void* out = NULL; memcpy(&out, &fp, sizeof(out)); return out; }
            }
        }
    }
    return NULL;
}
#else
static int km_c_putenv_posix(const char* kv) {
    if (!kv) { errno = EINVAL; return -1; }
    const char* eq = strchr(kv, '=');
    if (!eq) return unsetenv(kv);
    if (eq == kv) { errno = EINVAL; return -1; }
    size_t klen = (size_t)(eq - kv);
    char* key = (char*)malloc(klen + 1u);
    if (!key) { errno = ENOMEM; return -1; }
    memcpy(key, kv, klen);
    key[klen] = '\0';
    int rc = setenv(key, eq + 1, 1);
    free(key);
    return rc;
}
static int km_c_putenv_s_posix(const char* k, const char* v) {
    if (!k || !v || k[0] == '\0' || strchr(k, '=') != NULL) { errno = EINVAL; return EINVAL; }
    if (v[0] == '\0') return unsetenv(k) == 0 ? 0 : errno;
    return setenv(k, v, 1) == 0 ? 0 : errno;
}
#ifdef __APPLE__
static uintptr_t km_c_mach_task_self(void) { return (uintptr_t)mach_task_self(); }
#endif
static void* km_resolve_c_proc(const char* symbol) {
    if (!symbol || symbol[0] == '\0') return NULL;
    if (strcmp(symbol, "putenv") == 0 || strcmp(symbol, "_putenv") == 0) { void* p = NULL; int (*f)(const char*) = km_c_putenv_posix; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "_putenv_s") == 0 || strcmp(symbol, "putenv_s") == 0) { void* p = NULL; int (*f)(const char*, const char*) = km_c_putenv_s_posix; memcpy(&p, &f, sizeof(p)); return p; }
    if (strcmp(symbol, "__error") == 0 || strcmp(symbol, "__errno_location") == 0 || strcmp(symbol, "_errno") == 0) { void* p = NULL; uintptr_t (*f)(void) = km_c_errno_ptr; memcpy(&p, &f, sizeof(p)); return p; }
#ifdef __APPLE__
    if (strcmp(symbol, "mach_task_self") == 0) { void* p = NULL; uintptr_t (*f)(void) = km_c_mach_task_self; memcpy(&p, &f, sizeof(p)); return p; }
#endif
    void* p = dlsym(RTLD_DEFAULT, symbol);
    if (!p && symbol[0] == '_' && symbol[1] != '\0') {
        p = dlsym(RTLD_DEFAULT, symbol + 1);
    }
    return p;
}
#endif

static uintptr_t km_call_c_proc(void* proc, int32_t fixed_argc, int32_t argc, const int64_t* a) {
    uintptr_t u[16];
    int32_t i;
    for (i = 0; i < 16; ++i) u[i] = (a && i < argc) ? (uintptr_t)a[i] : 0;
    if (fixed_argc >= 1 && fixed_argc <= 6) {
        int32_t extra = argc - fixed_argc;
        if (extra < 0) extra = 0;
        if (extra > 4) extra = 4;
        switch (fixed_argc) {
            case 1: {
                typedef uintptr_t (*vfn_t)(uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0]);
                    case 1: return fn(u[0], u[1]);
                    case 2: return fn(u[0], u[1], u[2]);
                    case 3: return fn(u[0], u[1], u[2], u[3]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4]);
                    default: return 0;
                }
            }
            case 2: {
                typedef uintptr_t (*vfn_t)(uintptr_t, uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0], u[1]);
                    case 1: return fn(u[0], u[1], u[2]);
                    case 2: return fn(u[0], u[1], u[2], u[3]);
                    case 3: return fn(u[0], u[1], u[2], u[3], u[4]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4], u[5]);
                    default: return 0;
                }
            }
            case 3: {
                typedef uintptr_t (*vfn_t)(uintptr_t, uintptr_t, uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0], u[1], u[2]);
                    case 1: return fn(u[0], u[1], u[2], u[3]);
                    case 2: return fn(u[0], u[1], u[2], u[3], u[4]);
                    case 3: return fn(u[0], u[1], u[2], u[3], u[4], u[5]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]);
                    default: return 0;
                }
            }
            case 4: {
                typedef uintptr_t (*vfn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0], u[1], u[2], u[3]);
                    case 1: return fn(u[0], u[1], u[2], u[3], u[4]);
                    case 2: return fn(u[0], u[1], u[2], u[3], u[4], u[5]);
                    case 3: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]);
                    default: return 0;
                }
            }
            case 5: {
                typedef uintptr_t (*vfn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0], u[1], u[2], u[3], u[4]);
                    case 1: return fn(u[0], u[1], u[2], u[3], u[4], u[5]);
                    case 2: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]);
                    case 3: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8]);
                    default: return 0;
                }
            }
            case 6: {
                typedef uintptr_t (*vfn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, ...);
                vfn_t fn = NULL;
                memcpy(&fn, &proc, sizeof(fn));
                switch (extra) {
                    case 0: return fn(u[0], u[1], u[2], u[3], u[4], u[5]);
                    case 1: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]);
                    case 2: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]);
                    case 3: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8]);
                    case 4: return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9]);
                    default: return 0;
                }
            }
            default: break;
        }
    }
    switch (argc <= 0 ? 0 : (argc > 16 ? 16 : argc)) {
        case 0: { typedef uintptr_t (*fn_t)(void); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(); }
        case 1: { typedef uintptr_t (*fn_t)(uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0]); }
        case 2: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1]); }
        case 3: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2]); }
        case 4: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3]); }
        case 5: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4]); }
        case 6: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5]); }
        case 7: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]); }
        case 8: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        case 9: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8]); }
        case 10: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9]); }
        case 11: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10]); }
        case 12: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11]); }
        case 13: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12]); }
        case 14: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13]); }
        case 15: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14]); }
        case 16: { typedef uintptr_t (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14], u[15]); }
        default: return 0;
    }
}

static double km_c_bits_to_f64(int64_t bits) { double d = 0.0; memcpy(&d, &bits, sizeof(d)); return d; }
static float km_c_bits_to_f32(int64_t bits) { uint32_t b = (uint32_t)bits; float f = 0.0f; memcpy(&f, &b, sizeof(f)); return f; }

static double km_call_c_fp_proc(void* proc, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* a) {
    uintptr_t u[8];
    int32_t i;
    for (i = 0; i < 8; ++i) u[i] = (a && i < argc) ? (uintptr_t)a[i] : 0;
    int32_t m0 = fp_mask & 3;
    int32_t m1 = (fp_mask >> 2) & 3;
    if (ret_f32) {
        if (m0 == 1 && m1 == 1) { typedef float (*fn_t)(float, float, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_c_bits_to_f32(a ? a[0] : 0), km_c_bits_to_f32(a && argc > 1 ? a[1] : 0), u[2], u[3]); }
        if (m0 == 1) { typedef float (*fn_t)(float, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_c_bits_to_f32(a ? a[0] : 0), u[1], u[2], u[3]); }
        if (m0 == 2) { typedef float (*fn_t)(double, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_c_bits_to_f64(a ? a[0] : 0), u[1], u[2], u[3]); }
        { typedef float (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
    } else {
        if (m0 == 2 && m1 == 2) { typedef double (*fn_t)(double, double, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_c_bits_to_f64(a ? a[0] : 0), km_c_bits_to_f64(a && argc > 1 ? a[1] : 0), u[2], u[3]); }
        if (m0 == 2) { typedef double (*fn_t)(double, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_c_bits_to_f64(a ? a[0] : 0), u[1], u[2], u[3]); }
        if (m0 == 1) { typedef double (*fn_t)(float, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_c_bits_to_f32(a ? a[0] : 0), u[1], u[2], u[3]); }
        { typedef double (*fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
    }
}

int32_t libc_is_host_available(void) { return 1; }

int64_t libc_invoke(const char* symbol, int32_t fixed_argc, int32_t argc, const int64_t* argv, int32_t* status_out) {
    void* proc = km_resolve_c_proc(symbol);
    if (!proc) { if (status_out) *status_out = -2; return 0; }
    if (status_out) *status_out = 0;
    errno = km_saved_errno;
    uintptr_t res = km_call_c_proc(proc, fixed_argc, argc, argv);
    km_saved_errno = (int32_t)errno;
    return (int64_t)res;
}

double libc_invoke_fp(const char* symbol, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* argv, int32_t* status_out) {
    void* proc = km_resolve_c_proc(symbol);
    if (!proc) { if (status_out) *status_out = -2; return 0.0; }
    if (status_out) *status_out = 0;
    errno = km_saved_errno;
    double res = km_call_c_fp_proc(proc, fp_mask, ret_f32, argc, argv);
    km_saved_errno = (int32_t)errno;
    return res;
}

int64_t libc_resolve_symbol_address(const char* symbol) {
    if (!symbol || symbol[0] == '\0') return 0;
#ifdef _WIN32
    static const char* dlls[] = { "ucrtbase.dll", "msvcrt.dll", "kernel32.dll", "ws2_32.dll" };
    size_t i;
    for (i = 0; i < sizeof(dlls) / sizeof(dlls[0]); ++i) {
        HMODULE mod = GetModuleHandleA(dlls[i]);
        if (!mod) mod = LoadLibraryA(dlls[i]);
        if (mod) {
            FARPROC fp = GetProcAddress(mod, symbol);
            if (fp) return (int64_t)(uintptr_t)fp;
        }
    }
    return 0;
#else
#ifdef __APPLE__
    if (strcmp(symbol, "mach_task_self_") == 0) {
        void* p = dlsym(RTLD_DEFAULT, "mach_task_self_");
        if (p) return (int64_t)(uintptr_t)p;
        return (int64_t)(uintptr_t)&mach_task_self_;
    }
#endif
    return (int64_t)(uintptr_t)dlsym(RTLD_DEFAULT, symbol);
#endif
}

int32_t libc_last_error_number(void) {
    return km_saved_errno;
}

int32_t libc_strlen_at(int64_t addr) {
    if (addr == 0) return 0;
    return (int32_t)strlen((const char*)(uintptr_t)addr);
}

int64_t libc_alloc_zeroed(int32_t size) {
    size_t n = size > 0 ? (size_t)size : 1u;
    void* p = calloc(1u, n);
    return (int64_t)(uintptr_t)p;
}

void libc_free_mem(int64_t addr) {
    if (addr != 0) free((void*)(uintptr_t)addr);
}

void libc_read_bytes(int64_t addr, int32_t len, uint8_t* dst) {
    if (addr != 0 && len > 0 && dst) memcpy(dst, (const void*)(uintptr_t)addr, (size_t)len);
}

void libc_write_bytes(int64_t addr, int32_t len, const uint8_t* src) {
    if (addr != 0 && len > 0 && src) {
        memcpy((void*)(uintptr_t)addr, src, (size_t)len);
        if ((uintptr_t)addr == (uintptr_t)&errno && len == (int32_t)sizeof(int)) {
            km_saved_errno = (int32_t)errno;
        }
    }
}
