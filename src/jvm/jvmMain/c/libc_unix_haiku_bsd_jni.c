#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdDaemon(JNIEnv* km_env, jclass km_clazz, jint nochdir, jint noclose) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "daemon");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_daemon");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "daemon");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_daemon");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "daemon");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "daemon");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "daemon");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nochdir, (int32_t)noclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdGetprogname(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef const char* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getprogname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getprogname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getprogname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getprogname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getprogname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "getprogname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "getprogname");
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdSetprogname(JNIEnv* km_env, jclass km_clazz, jlong progname) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setprogname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setprogname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setprogname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setprogname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setprogname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "setprogname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "setprogname");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((const char*)(uintptr_t)progname);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdArc4random(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "arc4random");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random");
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdArc4randomUniform(JNIEnv* km_env, jclass km_clazz, jint upperBound) {
    (void)km_env;
    (void)km_clazz;
    typedef uint32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random_uniform");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random_uniform");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random_uniform");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random_uniform");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "arc4random_uniform");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random_uniform");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random_uniform");
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)upperBound);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdArc4randomBuf(JNIEnv* km_env, jclass km_clazz, jlong buf, jlong n) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random_buf");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random_buf");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random_buf");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random_buf");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "arc4random_buf");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random_buf");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "arc4random_buf");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)buf, (uint64_t)n);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdMkstemps(JNIEnv* km_env, jclass km_clazz, jlong arg0Template, jint suffixlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkstemps");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkstemps");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkstemps");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkstemps");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mkstemps");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "mkstemps");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "mkstemps");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)arg0Template, (int32_t)suffixlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdStrtonum(JNIEnv* km_env, jclass km_clazz, jlong nptr, jlong minval, jlong maxval, jlong errstr) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strtonum");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strtonum");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strtonum");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strtonum");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "strtonum");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "strtonum");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "strtonum");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)nptr, (int64_t)minval, (int64_t)maxval, (void*)(uintptr_t)errstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdOpenpty(JNIEnv* km_env, jclass km_clazz, jlong amaster, jlong aslave, jlong name, jlong termp, jlong winp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "openpty");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_openpty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "openpty");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_openpty");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "openpty");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "openpty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "openpty");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)amaster, (void*)(uintptr_t)aslave, (char*)(uintptr_t)name, (void*)(uintptr_t)termp, (void*)(uintptr_t)winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdLoginTty(JNIEnv* km_env, jclass km_clazz, jint fd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "login_tty");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_login_tty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "login_tty");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_login_tty");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "login_tty");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "login_tty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "login_tty");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdForkpty(JNIEnv* km_env, jclass km_clazz, jlong amaster, jlong name, jlong termp, jlong winp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "forkpty");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_forkpty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "forkpty");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_forkpty");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "forkpty");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "forkpty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "forkpty");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)amaster, (char*)(uintptr_t)name, (void*)(uintptr_t)termp, (void*)(uintptr_t)winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdStrsep(JNIEnv* km_env, jclass km_clazz, jlong string, jlong delimiters) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strsep");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strsep");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strsep");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strsep");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "strsep");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "strsep");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "strsep");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (const char*)(uintptr_t)delimiters);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdExplicitBzero(JNIEnv* km_env, jclass km_clazz, jlong buf, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "explicit_bzero");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_explicit_bzero");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "explicit_bzero");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_explicit_bzero");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "explicit_bzero");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "explicit_bzero");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "explicit_bzero");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)buf, (uint64_t)len);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdSlInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sl_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_init");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdSlAdd(JNIEnv* km_env, jclass km_clazz, jlong sl, jlong n) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_add");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_add");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_add");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_add");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sl_add");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_add");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_add");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sl, (char*)(uintptr_t)n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdSlFree(JNIEnv* km_env, jclass km_clazz, jlong sl, jint i) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_free");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_free");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_free");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_free");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sl_free");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_free");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_free");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)sl, (int32_t)i);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdSlFind(JNIEnv* km_env, jclass km_clazz, jlong sl, jlong n) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_find");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_find");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_find");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_find");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sl_find");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_find");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "sl_find");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sl, (char*)(uintptr_t)n);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdKqueue(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kqueue");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kqueue");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kqueue");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kqueue");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kqueue");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "kqueue");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "kqueue");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdKevent(JNIEnv* km_env, jclass km_clazz, jint kq, jlong changelist, jint nchanges, jlong eventlist, jint nevents, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kevent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kevent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kevent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kevent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kevent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "kevent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "kevent");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)kq, (void*)(uintptr_t)changelist, (int32_t)nchanges, (void*)(uintptr_t)eventlist, (int32_t)nevents, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdDlIteratePhdr(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong data) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dl_iterate_phdr");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dl_iterate_phdr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dl_iterate_phdr");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dl_iterate_phdr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dl_iterate_phdr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "dl_iterate_phdr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "dl_iterate_phdr");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdLutimes(JNIEnv* km_env, jclass km_clazz, jlong file, jlong times) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "lutimes");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_lutimes");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "lutimes");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_lutimes");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "lutimes");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "lutimes");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "lutimes");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)file, (void*)(uintptr_t)times);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdPreadv(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt, jlong offset) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "preadv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_preadv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "preadv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_preadv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "preadv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "preadv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "preadv");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (int32_t)iovcnt, (int64_t)offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdPwritev(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt, jlong offset) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pwritev");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pwritev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pwritev");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pwritev");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pwritev");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "pwritev");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "pwritev");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (int32_t)iovcnt, (int64_t)offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_haiku_UnixHaikuBsdJniBridge_libcUnixHaikuBsdWait4(JNIEnv* km_env, jclass km_clazz, jint pid, jlong status, jint options, jlong rusage) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "wait4");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_wait4");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "wait4");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_wait4");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "wait4");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "wait4");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_bsd = NULL;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_bsd, "wait4");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)status, (int32_t)options, (void*)(uintptr_t)rusage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

