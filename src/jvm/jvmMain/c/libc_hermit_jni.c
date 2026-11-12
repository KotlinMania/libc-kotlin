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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitAlloc(JNIEnv* km_env, jclass km_clazz, jlong size, jlong align) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_alloc");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_alloc");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_alloc");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_alloc");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_alloc");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size, (uint64_t)align);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitAllocZeroed(JNIEnv* km_env, jclass km_clazz, jlong size, jlong align) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_alloc_zeroed");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_alloc_zeroed");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_alloc_zeroed");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_alloc_zeroed");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_alloc_zeroed");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size, (uint64_t)align);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitRealloc(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong size, jlong align, jlong newSize) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_realloc");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_realloc");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_realloc");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_realloc");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_realloc");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)size, (uint64_t)align, (uint64_t)newSize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitDealloc(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong size, jlong align) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_dealloc");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_dealloc");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_dealloc");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_dealloc");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_dealloc");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)size, (uint64_t)align);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitExit(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_exit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_exit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_exit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_exit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_exit");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitAbort(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_abort");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_abort");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_abort");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_abort");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_abort");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitErrno(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_errno");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_errno");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_errno");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_errno");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_errno");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitClockGettime(JNIEnv* km_env, jclass km_clazz, jint clockid, jlong tp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_clock_gettime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_clock_gettime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_clock_gettime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_clock_gettime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_clock_gettime");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clockid, (void*)(uintptr_t)tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitNanosleep(JNIEnv* km_env, jclass km_clazz, jlong req) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_nanosleep");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_nanosleep");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_nanosleep");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_nanosleep");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_nanosleep");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)req);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitAvailableParallelism(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_available_parallelism");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_available_parallelism");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_available_parallelism");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_available_parallelism");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_available_parallelism");
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitFutexWait(JNIEnv* km_env, jclass km_clazz, jlong address, jint expected, jlong timeout, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_futex_wait");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_futex_wait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_futex_wait");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_futex_wait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_futex_wait");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint32_t)expected, (void*)(uintptr_t)timeout, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitFutexWake(JNIEnv* km_env, jclass km_clazz, jlong address, jint count) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_futex_wake");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_futex_wake");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_futex_wake");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_futex_wake");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_futex_wake");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitStat(JNIEnv* km_env, jclass km_clazz, jlong path, jlong arg1Stat) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_stat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_stat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_stat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_stat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_stat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (void*)(uintptr_t)arg1Stat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitFstat(JNIEnv* km_env, jclass km_clazz, jint fd, jlong arg1Stat) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_fstat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_fstat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_fstat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_fstat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_fstat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)arg1Stat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitLstat(JNIEnv* km_env, jclass km_clazz, jlong path, jlong arg1Stat) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_lstat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_lstat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_lstat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_lstat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_lstat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (void*)(uintptr_t)arg1Stat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitOpen(JNIEnv* km_env, jclass km_clazz, jlong path, jint flags, jint mode) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_open");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_open");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_open");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitUnlink(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_unlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_unlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_unlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_unlink");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitMkdir(JNIEnv* km_env, jclass km_clazz, jlong path, jint mode) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_mkdir");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_mkdir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_mkdir");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_mkdir");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_mkdir");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitRmdir(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_rmdir");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_rmdir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_rmdir");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_rmdir");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_rmdir");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitRead(JNIEnv* km_env, jclass km_clazz, jint fd, jlong buf, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_read");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_read");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_read");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_read");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_read");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)buf, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitWrite(JNIEnv* km_env, jclass km_clazz, jint fd, jlong buf, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_write");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_write");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_write");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_write");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_write");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)buf, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitReadv(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jlong iovcnt) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_readv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_readv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_readv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_readv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_readv");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (uint64_t)iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitWritev(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jlong iovcnt) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_writev");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_writev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_writev");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_writev");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_writev");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (uint64_t)iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitClose(JNIEnv* km_env, jclass km_clazz, jint fd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_close");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_close");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_close");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitDup(JNIEnv* km_env, jclass km_clazz, jint fd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_dup");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_dup");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_dup");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_dup");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_dup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitFcntl(JNIEnv* km_env, jclass km_clazz, jint fd, jint cmd, jint arg) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_fcntl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_fcntl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_fcntl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_fcntl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_fcntl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)cmd, (int32_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitGetdents64(JNIEnv* km_env, jclass km_clazz, jint fd, jlong dirp, jlong count) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_getdents64");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_getdents64");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_getdents64");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_getdents64");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getdents64");
#if defined(__ANDROID__) && defined(__LP64__)
        if (km_fn_ptr == NULL) {
            km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getdents");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)dirp, (uint64_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitGetaddrinfo(JNIEnv* km_env, jclass km_clazz, jlong nodename, jlong servname, jlong hints, jlong res) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_getaddrinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_getaddrinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_getaddrinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_getaddrinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getaddrinfo");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)nodename, (const char*)(uintptr_t)servname, (void*)(uintptr_t)hints, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitFreeaddrinfo(JNIEnv* km_env, jclass km_clazz, jlong ai) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_freeaddrinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_freeaddrinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_freeaddrinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_freeaddrinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_freeaddrinfo");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ai);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitSocket(JNIEnv* km_env, jclass km_clazz, jint domain, jint ty, jint protocol) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_socket");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_socket");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_socket");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_socket");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_socket");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)domain, (int32_t)ty, (int32_t)protocol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitBind(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong addr, jint addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_bind");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_bind");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_bind");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_bind");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_bind");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)addr, (uint32_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitListen(JNIEnv* km_env, jclass km_clazz, jint sockfd, jint backlog) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_listen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_listen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_listen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_listen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_listen");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (int32_t)backlog);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitAccept(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_accept");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_accept");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_accept");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_accept");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_accept");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitConnect(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong addr, jint addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_connect");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_connect");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_connect");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_connect");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_connect");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)addr, (uint32_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitRecv(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong buf, jlong len, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_recv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_recv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_recv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_recv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_recv");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)buf, (uint64_t)len, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitRecvfrom(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong buf, jlong len, jint flags, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_recvfrom");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_recvfrom");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_recvfrom");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_recvfrom");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_recvfrom");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)buf, (uint64_t)len, (int32_t)flags, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitSend(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong buf, jlong len, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_send");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_send");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_send");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_send");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_send");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)buf, (uint64_t)len, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitSendto(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong buf, jlong len, jint flags, jlong to, jint tolen) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_sendto");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_sendto");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_sendto");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_sendto");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_sendto");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)buf, (uint64_t)len, (int32_t)flags, (void*)(uintptr_t)to, (uint32_t)tolen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitGetpeername(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_getpeername");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_getpeername");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_getpeername");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_getpeername");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getpeername");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitGetsockname(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_getsockname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_getsockname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_getsockname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_getsockname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getsockname");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitGetsockopt(JNIEnv* km_env, jclass km_clazz, jint sockfd, jint level, jint optname, jlong optval, jlong optlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_getsockopt");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_getsockopt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_getsockopt");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_getsockopt");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_getsockopt");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (void*)(uintptr_t)optlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitSetsockopt(JNIEnv* km_env, jclass km_clazz, jint sockfd, jint level, jint optname, jlong optval, jint optlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_setsockopt");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_setsockopt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_setsockopt");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_setsockopt");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_setsockopt");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (uint32_t)optlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitIoctl(JNIEnv* km_env, jclass km_clazz, jint sockfd, jint cmd, jlong argp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_ioctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_ioctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_ioctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_ioctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_ioctl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (int32_t)cmd, (void*)(uintptr_t)argp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitShutdown(JNIEnv* km_env, jclass km_clazz, jint sockfd, jint how) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_shutdown");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_shutdown");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_shutdown");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_shutdown");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_shutdown");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (int32_t)how);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitEventfd(JNIEnv* km_env, jclass km_clazz, jlong initval, jshort flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint64_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_eventfd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_eventfd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_eventfd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_eventfd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_eventfd");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)initval, (int16_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_hermit_HermitJniBridge_libcHermitPoll(JNIEnv* km_env, jclass km_clazz, jlong fds, jlong nfds, jint timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sys_poll");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sys_poll");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sys_poll");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sys_poll");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sys_poll");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fds, (uint64_t)nfds, (int32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

