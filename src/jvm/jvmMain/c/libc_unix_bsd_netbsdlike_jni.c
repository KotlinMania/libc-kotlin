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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1setgrent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setgrent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setgrent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setgrent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setgrent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setgrent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setgrent");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1semDestroy(JNIEnv* km_env, jclass km_clazz, jlong sem) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1semInit(JNIEnv* km_env, jclass km_clazz, jlong sem, jint pshared, jint value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sem, (int32_t)pshared, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1daemon(JNIEnv* km_env, jclass km_clazz, jint nochdir, jint noclose) {
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
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "daemon");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "daemon");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1accept4(JNIEnv* km_env, jclass km_clazz, jint s, jlong addr, jlong addrlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "accept4");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_accept4");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "accept4");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_accept4");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "accept4");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "accept4");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "accept4");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1mincore(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong len, jlong vec) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mincore");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mincore");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mincore");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mincore");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mincore");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mincore");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mincore");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (uint64_t)len, (char*)(uintptr_t)vec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1clockGetres(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getres");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getres");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getres");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getres");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_getres");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_getres");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_getres");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clk_id, (void*)(uintptr_t)tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1clockGettime(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_gettime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_gettime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_gettime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_gettime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_gettime");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_gettime");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_gettime");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clk_id, (void*)(uintptr_t)tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1clockSettime(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_settime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_settime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_settime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_settime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_settime");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_settime");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "clock_settime");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clk_id, (void*)(uintptr_t)tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1errno(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__errno");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__errno");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__errno");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "__errno");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "__errno");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1shmOpen(JNIEnv* km_env, jclass km_clazz, jstring name, jint oflag, jint mode) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_open");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_open");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shm_open");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shm_open");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shm_open");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (int32_t)oflag, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1memrchr(JNIEnv* km_env, jclass km_clazz, jlong cx, jint c, jlong n) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memrchr");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memrchr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memrchr");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memrchr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memrchr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "memrchr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "memrchr");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cx, (int32_t)c, (uint64_t)n);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1mkostemp(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkostemp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkostemp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkostemp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkostemp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mkostemp");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkostemp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkostemp");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)arg_0_template, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1mkostemps(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jint suffixlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkostemps");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkostemps");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkostemps");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkostemps");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mkostemps");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkostemps");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkostemps");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)arg_0_template, (int32_t)suffixlen, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pwritev(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt, jlong offset) {
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
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pwritev");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pwritev");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1preadv(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt, jlong offset) {
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
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "preadv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "preadv");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1futimens(JNIEnv* km_env, jclass km_clazz, jint fd, jlong times) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "futimens");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_futimens");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "futimens");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_futimens");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "futimens");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "futimens");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "futimens");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)times);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1utimensat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring path, jlong times, jint flag) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "utimensat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_utimensat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "utimensat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_utimensat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "utimensat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "utimensat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "utimensat");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dirfd, path_utf, (void*)(uintptr_t)times, (int32_t)flag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1fdatasync(JNIEnv* km_env, jclass km_clazz, jint fd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fdatasync");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fdatasync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fdatasync");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fdatasync");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fdatasync");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "fdatasync");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "fdatasync");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1loginTty(JNIEnv* km_env, jclass km_clazz, jint fd) {
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
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "login_tty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "login_tty");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1getpriority(JNIEnv* km_env, jclass km_clazz, jint which, jint who) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpriority");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpriority");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpriority");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpriority");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpriority");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getpriority");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getpriority");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (uint32_t)who);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1setpriority(JNIEnv* km_env, jclass km_clazz, jint which, jint who, jint prio) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setpriority");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setpriority");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setpriority");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setpriority");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setpriority");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setpriority");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setpriority");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (uint32_t)who, (int32_t)prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1mknodat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring pathname, jint mode, jint dev) {
    (void)km_env;
    (void)km_clazz;
    const char* pathname_utf = (pathname != NULL) ? (*km_env)->GetStringUTFChars(km_env, pathname, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mknodat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mknodat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mknodat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mknodat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mknodat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mknodat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mknodat");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dirfd, pathname_utf, (uint32_t)mode, (int32_t)dev);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (pathname != NULL && pathname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pathname, pathname_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1mkfifoat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring pathname, jint mode) {
    (void)km_env;
    (void)km_clazz;
    const char* pathname_utf = (pathname != NULL) ? (*km_env)->GetStringUTFChars(km_env, pathname, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkfifoat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkfifoat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkfifoat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkfifoat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mkfifoat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkfifoat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "mkfifoat");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dirfd, pathname_utf, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (pathname != NULL && pathname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pathname, pathname_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1semTimedwait(JNIEnv* km_env, jclass km_clazz, jlong sem, jlong abstime) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_timedwait");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_timedwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_timedwait");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_timedwait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_timedwait");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_timedwait");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_timedwait");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sem, (void*)(uintptr_t)abstime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1semGetvalue(JNIEnv* km_env, jclass km_clazz, jlong sem, jlong sval) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_getvalue");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_getvalue");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_getvalue");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_getvalue");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_getvalue");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_getvalue");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sem_getvalue");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sem, (void*)(uintptr_t)sval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadCondattrSetclock(JNIEnv* km_env, jclass km_clazz, jlong attr, jint clock_id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_setclock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_setclock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_setclock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_setclock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_condattr_setclock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_condattr_setclock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_condattr_setclock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)clock_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1sethostname(JNIEnv* km_env, jclass km_clazz, jstring name, jlong len) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sethostname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sethostname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sethostname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sethostname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sethostname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sethostname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "sethostname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadMutexTimedlock(JNIEnv* km_env, jclass km_clazz, jlong lock, jlong abstime) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutex_timedlock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutex_timedlock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutex_timedlock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutex_timedlock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutex_timedlock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_mutex_timedlock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_mutex_timedlock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock, (void*)(uintptr_t)abstime);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSpinInit(JNIEnv* km_env, jclass km_clazz, jlong lock, jint pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_spin_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock, (int32_t)pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSpinDestroy(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_spin_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSpinLock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_lock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_lock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_lock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_lock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_spin_lock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_lock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_lock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSpinTrylock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_trylock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_trylock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_trylock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_trylock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_spin_trylock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_trylock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_trylock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSpinUnlock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_unlock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_unlock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_unlock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_unlock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_spin_unlock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_unlock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_spin_unlock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadSetschedparam(JNIEnv* km_env, jclass km_clazz, jlong native, jint policy, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setschedparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setschedparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setschedparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_setschedparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_setschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_setschedparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)native, (int32_t)policy, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pthreadGetschedparam(JNIEnv* km_env, jclass km_clazz, jlong native, jlong policy, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getschedparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getschedparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getschedparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_getschedparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_getschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pthread_getschedparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)native, (void*)(uintptr_t)policy, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1pipe2(JNIEnv* km_env, jclass km_clazz, jlong fds, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pipe2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pipe2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pipe2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pipe2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pipe2");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pipe2");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pipe2");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fds, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1ppoll(JNIEnv* km_env, jclass km_clazz, jlong fds, jint nfds, jlong ts, jlong sigmask) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ppoll");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ppoll");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ppoll");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ppoll");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ppoll");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "ppoll");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "ppoll");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fds, (uint32_t)nfds, (void*)(uintptr_t)ts, (void*)(uintptr_t)sigmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1getgrouplist(JNIEnv* km_env, jclass km_clazz, jstring name, jshort basegid, jlong groups, jlong ngroups) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrouplist");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrouplist");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrouplist");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrouplist");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrouplist");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getgrouplist");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getgrouplist");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (uint16_t)basegid, (void*)(uintptr_t)groups, (void*)(uintptr_t)ngroups);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1initgroups(JNIEnv* km_env, jclass km_clazz, jstring name, jshort basegid) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "initgroups");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_initgroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "initgroups");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_initgroups");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "initgroups");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "initgroups");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "initgroups");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (uint16_t)basegid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1getdomainname(JNIEnv* km_env, jclass km_clazz, jlong name, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getdomainname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getdomainname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getdomainname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getdomainname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getdomainname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getdomainname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getdomainname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)name, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1setdomainname(JNIEnv* km_env, jclass km_clazz, jstring name, jlong len) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setdomainname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setdomainname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setdomainname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setdomainname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setdomainname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setdomainname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "setdomainname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1uname(JNIEnv* km_env, jclass km_clazz, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "uname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_uname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "uname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_uname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "uname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "uname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "uname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1shmget(JNIEnv* km_env, jclass km_clazz, jlong key, jlong size, jint shmflg) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmget");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmget");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmget");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmget");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shmget");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmget");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmget");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)key, (uint64_t)size, (int32_t)shmflg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1shmat(JNIEnv* km_env, jclass km_clazz, jint shmid, jlong shmaddr, jint shmflg) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shmat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmat");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)shmid, (void*)(uintptr_t)shmaddr, (int32_t)shmflg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1shmdt(JNIEnv* km_env, jclass km_clazz, jlong shmaddr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmdt");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmdt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmdt");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmdt");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shmdt");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmdt");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmdt");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)shmaddr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1shmctl(JNIEnv* km_env, jclass km_clazz, jint shmid, jint cmd, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shmctl");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmctl");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "shmctl");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)shmid, (int32_t)cmd, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1execvpe(JNIEnv* km_env, jclass km_clazz, jstring file, jlong argv, jlong envp) {
    (void)km_env;
    (void)km_clazz;
    const char* file_utf = (file != NULL) ? (*km_env)->GetStringUTFChars(km_env, file, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "execvpe");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_execvpe");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "execvpe");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_execvpe");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "execvpe");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "execvpe");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "execvpe");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(file_utf, (void*)(uintptr_t)argv, (void*)(uintptr_t)envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (file != NULL && file_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, file, file_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1waitid(JNIEnv* km_env, jclass km_clazz, jint idtype, jint id, jlong infop, jint options) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "waitid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_waitid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "waitid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_waitid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "waitid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "waitid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "waitid");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)idtype, (uint32_t)id, (void*)(uintptr_t)infop, (int32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawn(JNIEnv* km_env, jclass km_clazz, jlong pid, jstring path, jlong file_actions, jlong attrp, jlong argv, jlong envp) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pid, path_utf, (void*)(uintptr_t)file_actions, (void*)(uintptr_t)attrp, (void*)(uintptr_t)argv, (void*)(uintptr_t)envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnp(JNIEnv* km_env, jclass km_clazz, jlong pid, jstring file, jlong file_actions, jlong attrp, jlong argv, jlong envp) {
    (void)km_env;
    (void)km_clazz;
    const char* file_utf = (file != NULL) ? (*km_env)->GetStringUTFChars(km_env, file, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnp");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnp");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pid, file_utf, (void*)(uintptr_t)file_actions, (void*)(uintptr_t)attrp, (void*)(uintptr_t)argv, (void*)(uintptr_t)envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (file != NULL && file_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, file, file_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrInit(JNIEnv* km_env, jclass km_clazz, jlong attr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrDestroy(JNIEnv* km_env, jclass km_clazz, jlong attr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetsigdefault(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigdefault");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigdefault");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigdefault");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigdefault");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigdefault");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getsigdefault");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getsigdefault");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetsigdefault(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigdefault");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigdefault");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigdefault");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigdefault");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigdefault");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setsigdefault");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setsigdefault");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetsigmask(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigmask");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigmask");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigmask");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigmask");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getsigmask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getsigmask");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetsigmask(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigmask");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigmask");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigmask");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigmask");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setsigmask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setsigmask");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetflags(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getflags");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getflags");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getflags");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getflags");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getflags");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getflags");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getflags");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetflags(JNIEnv* km_env, jclass km_clazz, jlong attr, jshort flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setflags");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setflags");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setflags");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setflags");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setflags");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setflags");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setflags");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int16_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetpgroup(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getpgroup");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getpgroup");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getpgroup");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getpgroup");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getpgroup");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getpgroup");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getpgroup");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetpgroup(JNIEnv* km_env, jclass km_clazz, jlong attr, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setpgroup");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setpgroup");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setpgroup");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setpgroup");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setpgroup");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setpgroup");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setpgroup");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetschedpolicy(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedpolicy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedpolicy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedpolicy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedpolicy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getschedpolicy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getschedpolicy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getschedpolicy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetschedpolicy(JNIEnv* km_env, jclass km_clazz, jlong attr, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedpolicy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedpolicy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedpolicy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedpolicy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setschedpolicy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setschedpolicy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setschedpolicy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrGetschedparam(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_getschedparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_getschedparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnattrSetschedparam(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawnattr_setschedparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawnattr_setschedparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnFileActionsInit(JNIEnv* km_env, jclass km_clazz, jlong actions) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)actions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnFileActionsDestroy(JNIEnv* km_env, jclass km_clazz, jlong actions) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)actions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnFileActionsAddopen(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd, jstring path, jint oflag, jint mode) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, int32_t, const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addopen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addopen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addopen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addopen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addopen");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_addopen");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_addopen");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)actions, (int32_t)fd, path_utf, (int32_t)oflag, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnFileActionsAddclose(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addclose");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addclose");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addclose");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addclose");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addclose");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_addclose");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_addclose");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)actions, (int32_t)fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1posixSpawnFileActionsAdddup2(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd, jint newfd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_adddup2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_adddup2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_adddup2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_adddup2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_adddup2");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_adddup2");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "posix_spawn_file_actions_adddup2");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)actions, (int32_t)fd, (int32_t)newfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1reallocarray(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong nmemb, jlong size) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "reallocarray");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_reallocarray");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "reallocarray");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_reallocarray");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "reallocarray");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)nmemb, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1gethostid(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gethostid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gethostid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gethostid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gethostid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "gethostid");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1sethostid(JNIEnv* km_env, jclass km_clazz, jlong hostid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sethostid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sethostid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sethostid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sethostid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sethostid");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hostid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1ftok(JNIEnv* km_env, jclass km_clazz, jstring path, jint id) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
    typedef int64_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ftok");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ftok");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ftok");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ftok");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ftok");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(path_utf, (int32_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1dirname(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dirname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dirname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dirname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dirname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dirname");
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1basename(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "basename");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_basename");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "basename");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_basename");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "basename");
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1getentropy(JNIEnv* km_env, jclass km_clazz, jlong buf, jlong buflen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getentropy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getentropy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getentropy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getentropy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getentropy");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buf, (uint64_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1sendmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong mmsg, jint vlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sendmmsg");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sendmmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sendmmsg");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sendmmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sendmmsg");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)mmsg, (uint32_t)vlen, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1recvmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong mmsg, jint vlen, jint flags, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "recvmmsg");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_recvmmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "recvmmsg");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_recvmmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "recvmmsg");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)mmsg, (uint32_t)vlen, (int32_t)flags, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_netbsdlike_UnixBsdNetbsdlikeJniBridge_libc_1unix_1bsd_1netbsdlike_1closefrom(JNIEnv* km_env, jclass km_clazz, jint lowfd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "closefrom");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_closefrom");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "closefrom");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_closefrom");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "closefrom");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lowfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

