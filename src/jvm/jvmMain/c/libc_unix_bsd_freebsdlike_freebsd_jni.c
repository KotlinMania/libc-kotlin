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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhlink(JNIEnv* km_env, jclass km_clazz, jlong fhp, jlong to) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhlink");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (const char*)(uintptr_t)to);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhlinkat(JNIEnv* km_env, jclass km_clazz, jlong fhp, jint tofd, jlong to) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhlinkat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhlinkat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhlinkat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhlinkat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhlinkat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (int32_t)tofd, (const char*)(uintptr_t)to);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhreadlink(JNIEnv* km_env, jclass km_clazz, jlong fhp, jlong buf, jlong bufsize) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhreadlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhreadlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhreadlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhreadlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhreadlink");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (char*)(uintptr_t)buf, (uint64_t)bufsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetfhat(JNIEnv* km_env, jclass km_clazz, jint fd, jlong path, jlong fhp, jint flag) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, char*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getfhat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getfhat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getfhat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getfhat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getfhat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (char*)(uintptr_t)path, (void*)(uintptr_t)fhp, (int32_t)flag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__error");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__error");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__error");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioCancel(JNIEnv* km_env, jclass km_clazz, jint fd, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_cancel");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_cancel");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_cancel");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_cancel");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_cancel");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioError(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_error");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_error");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_error");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_error");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_error");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioFsync(JNIEnv* km_env, jclass km_clazz, jint op, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_fsync");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_fsync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_fsync");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_fsync");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_fsync");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)op, (void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioRead(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_read");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_read");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_read");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_read");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_read");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioReadv(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_readv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_readv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_readv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_readv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_readv");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioReturn(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_return");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_return");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_return");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_return");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_return");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioSuspend(JNIEnv* km_env, jclass km_clazz, jlong aiocbList, jint nitems, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_suspend");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_suspend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_suspend");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_suspend");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_suspend");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbList, (int32_t)nitems, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioWrite(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_write");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_write");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_write");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_write");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_write");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioWritev(JNIEnv* km_env, jclass km_clazz, jlong aiocbp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_writev");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_writev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_writev");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_writev");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_writev");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCopyFileRange(JNIEnv* km_env, jclass km_clazz, jint infd, jlong inoffp, jint outfd, jlong outoffp, jlong len, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "copy_file_range");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_copy_file_range");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "copy_file_range");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_copy_file_range");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "copy_file_range");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)infd, (void*)(uintptr_t)inoffp, (int32_t)outfd, (void*)(uintptr_t)outoffp, (uint64_t)len, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevnameR(JNIEnv* km_env, jclass km_clazz, jint dev, jshort mode, jlong buf, jint len) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(uint32_t, uint16_t, char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devname_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devname_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devname_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devname_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devname_r");
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dev, (uint16_t)mode, (char*)(uintptr_t)buf, (int32_t)len);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(JNIEnv* km_env, jclass km_clazz, jint fd, jint attrnamespace, jlong attrname) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_delete_fd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_delete_fd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_delete_fd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_delete_fd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_delete_fd");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_delete_file");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_delete_file");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_delete_file");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_delete_file");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_delete_file");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_delete_link");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_delete_link");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_delete_link");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_delete_link");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_delete_link");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(JNIEnv* km_env, jclass km_clazz, jint fd, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_get_fd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_get_fd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_get_fd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_get_fd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_get_fd");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_get_file");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_get_file");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_get_file");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_get_file");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_get_file");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_get_link");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_get_link");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_get_link");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_get_link");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_get_link");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrListFd(JNIEnv* km_env, jclass km_clazz, jint fd, jint attrnamespace, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_list_fd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_list_fd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_list_fd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_list_fd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_list_fd");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)attrnamespace, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrListFile(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_list_file");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_list_file");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_list_file");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_list_file");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_list_file");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrListLink(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_list_link");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_list_link");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_list_link");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_list_link");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_list_link");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(JNIEnv* km_env, jclass km_clazz, jint fd, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_set_fd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_set_fd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_set_fd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_set_fd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_set_fd");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_set_file");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_set_file");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_set_file");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_set_file");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_set_file");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(JNIEnv* km_env, jclass km_clazz, jlong path, jint attrnamespace, jlong attrname, jlong data, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_set_link");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_set_link");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_set_link");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_set_link");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_set_link");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)attrnamespace, (const char*)(uintptr_t)attrname, (void*)(uintptr_t)data, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFspacectl(JNIEnv* km_env, jclass km_clazz, jint fd, jint cmd, jlong rqsr, jint flags, jlong rmsr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fspacectl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fspacectl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fspacectl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fspacectl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fspacectl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)cmd, (void*)(uintptr_t)rqsr, (int32_t)flags, (void*)(uintptr_t)rmsr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdJail(JNIEnv* km_env, jclass km_clazz, jlong jail) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "jail");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_jail");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "jail");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_jail");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "jail");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)jail);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdJailAttach(JNIEnv* km_env, jclass km_clazz, jint jid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "jail_attach");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_jail_attach");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "jail_attach");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_jail_attach");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "jail_attach");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)jid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdJailRemove(JNIEnv* km_env, jclass km_clazz, jint jid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "jail_remove");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_jail_remove");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "jail_remove");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_jail_remove");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "jail_remove");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)jid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdJailGet(JNIEnv* km_env, jclass km_clazz, jlong iov, jint niov, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "jail_get");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_jail_get");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "jail_get");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_jail_get");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "jail_get");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iov, (uint32_t)niov, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdJailSet(JNIEnv* km_env, jclass km_clazz, jlong iov, jint niov, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "jail_set");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_jail_set");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "jail_set");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_jail_set");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "jail_set");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iov, (uint32_t)niov, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdLioListio(JNIEnv* km_env, jclass km_clazz, jint mode, jlong aiocbList, jint nitems, jlong sevp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "lio_listio");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_lio_listio");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "lio_listio");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_lio_listio");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "lio_listio");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)mode, (void*)(uintptr_t)aiocbList, (int32_t)nitems, (void*)(uintptr_t)sevp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetutxuser(JNIEnv* km_env, jclass km_clazz, jlong user) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getutxuser");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getutxuser");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getutxuser");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getutxuser");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getutxuser");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)user);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSetutxdb(JNIEnv* km_env, jclass km_clazz, jint type, jlong file) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setutxdb");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setutxdb");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setutxdb");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setutxdb");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setutxdb");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)type, (const char*)(uintptr_t)file);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(JNIEnv* km_env, jclass km_clazz, jlong iocbp, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_waitcomplete");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_waitcomplete");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_waitcomplete");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_waitcomplete");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aio_waitcomplete");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iocbp, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(JNIEnv* km_env, jclass km_clazz, jlong mqd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_getfd_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_getfd_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_getfd_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_getfd_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_getfd_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mqd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdWaitid(JNIEnv* km_env, jclass km_clazz, jint idtype, jlong id, jlong infop, jint options) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint32_t, int64_t, void*, int32_t);
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
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idtype, (int64_t)id, (void*)(uintptr_t)infop, (int32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPtsnameR(JNIEnv* km_env, jclass km_clazz, jint fd, jlong buf, jlong buflen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ptsname_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ptsname_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ptsname_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ptsname_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ptsname_r");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (char*)(uintptr_t)buf, (uint64_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFtok(JNIEnv* km_env, jclass km_clazz, jlong pathname, jint projId) {
    (void)km_env;
    (void)km_clazz;
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
        km_res = km_fn_ptr((const char*)(uintptr_t)pathname, (int32_t)projId);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmget(JNIEnv* km_env, jclass km_clazz, jlong key, jlong size, jint shmflg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmat(JNIEnv* km_env, jclass km_clazz, jint shmid, jlong shmaddr, jint shmflg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmdt(JNIEnv* km_env, jclass km_clazz, jlong shmaddr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmctl(JNIEnv* km_env, jclass km_clazz, jint shmid, jint cmd, jlong buf) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSemget(JNIEnv* km_env, jclass km_clazz, jlong key, jint nsems, jint semflg) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "semget");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_semget");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "semget");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_semget");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "semget");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)key, (int32_t)nsems, (int32_t)semflg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSemctl(JNIEnv* km_env, jclass km_clazz, jint semid, jint semnum, jint cmd, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "semctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_semctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "semctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_semctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "semctl");
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)semid, (int32_t)semnum, (int32_t)cmd); break;
            case 1: km_res = km_fn_ptr((int32_t)semid, (int32_t)semnum, (int32_t)cmd, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)semid, (int32_t)semnum, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)semid, (int32_t)semnum, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)semid, (int32_t)semnum, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSemop(JNIEnv* km_env, jclass km_clazz, jint semid, jlong sops, jlong nsops) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "semop");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_semop");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "semop");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_semop");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "semop");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)semid, (void*)(uintptr_t)sops, (uint64_t)nsops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMsgctl(JNIEnv* km_env, jclass km_clazz, jint msqid, jint cmd, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "msgctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_msgctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "msgctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_msgctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "msgctl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)msqid, (int32_t)cmd, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMsgget(JNIEnv* km_env, jclass km_clazz, jlong key, jint msgflg) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "msgget");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_msgget");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "msgget");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_msgget");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "msgget");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)key, (int32_t)msgflg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMsgsnd(JNIEnv* km_env, jclass km_clazz, jint msqid, jlong msgp, jlong msgsz, jint msgflg) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "msgsnd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_msgsnd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "msgsnd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_msgsnd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "msgsnd");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)msqid, (void*)(uintptr_t)msgp, (uint64_t)msgsz, (int32_t)msgflg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCfmakesane(JNIEnv* km_env, jclass km_clazz, jlong termios) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cfmakesane");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cfmakesane");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cfmakesane");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cfmakesane");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cfmakesane");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)termios);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPdfork(JNIEnv* km_env, jclass km_clazz, jlong fdp, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pdfork");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pdfork");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pdfork");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pdfork");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pdfork");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fdp, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPdgetpid(JNIEnv* km_env, jclass km_clazz, jint fd, jlong pidp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pdgetpid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pdgetpid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pdgetpid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pdgetpid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pdgetpid");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)pidp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPdkill(JNIEnv* km_env, jclass km_clazz, jint fd, jint signum) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pdkill");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pdkill");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pdkill");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pdkill");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pdkill");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)signum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRtprioThread(JNIEnv* km_env, jclass km_clazz, jint function, jint lwpid, jlong rtp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "rtprio_thread");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_rtprio_thread");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "rtprio_thread");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_rtprio_thread");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "rtprio_thread");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)function, (int32_t)lwpid, (void*)(uintptr_t)rtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdUuidgen(JNIEnv* km_env, jclass km_clazz, jlong store, jint count) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "uuidgen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_uuidgen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "uuidgen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_uuidgen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "uuidgen");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)store, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdThrKill(JNIEnv* km_env, jclass km_clazz, jlong id, jint sig) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "thr_kill");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_thr_kill");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "thr_kill");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_thr_kill");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "thr_kill");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)id, (int32_t)sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdThrKill2(JNIEnv* km_env, jclass km_clazz, jint pid, jlong id, jint sig) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "thr_kill2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_thr_kill2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "thr_kill2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_thr_kill2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "thr_kill2");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (int64_t)id, (int32_t)sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdThrSelf(JNIEnv* km_env, jclass km_clazz, jlong tid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "thr_self");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_thr_self");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "thr_self");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_thr_self");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "thr_self");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getthreadid_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getthreadid_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getthreadid_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getthreadid_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_getthreadid_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(JNIEnv* km_env, jclass km_clazz, jlong td, jlong cpusetsize, jlong cpusetp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getaffinity_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getaffinity_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getaffinity_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getaffinity_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_getaffinity_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)td, (uint64_t)cpusetsize, (void*)(uintptr_t)cpusetp);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(JNIEnv* km_env, jclass km_clazz, jlong td, jlong cpusetsize, jlong cpusetp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setaffinity_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setaffinity_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setaffinity_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setaffinity_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_setaffinity_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)td, (uint64_t)cpusetsize, (void*)(uintptr_t)cpusetp);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(JNIEnv* km_env, jclass km_clazz, jint pid, jlong cpusetsz, jlong cpuset) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getaffinity");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getaffinity");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getaffinity");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getaffinity");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_getaffinity");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (uint64_t)cpusetsz, (void*)(uintptr_t)cpuset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(JNIEnv* km_env, jclass km_clazz, jint pid, jlong cpusetsz, jlong cpuset) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_setaffinity");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_setaffinity");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_setaffinity");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_setaffinity");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_setaffinity");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (uint64_t)cpusetsz, (void*)(uintptr_t)cpuset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSchedGetcpu(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getcpu");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getcpu");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getcpu");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getcpu");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_getcpu");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutex_consistent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutex_consistent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutex_consistent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutex_consistent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutex_consistent");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mutex);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong robust) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_getrobust");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getrobust");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getrobust");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getrobust");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutexattr_getrobust");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)robust);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(JNIEnv* km_env, jclass km_clazz, jlong attr, jint robust) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_setrobust");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setrobust");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setrobust");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setrobust");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutexattr_setrobust");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)robust);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(JNIEnv* km_env, jclass km_clazz, jlong lock, jint pshared) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong retval, jlong abstime) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_timedjoin_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_timedjoin_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_timedjoin_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_timedjoin_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_timedjoin_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)retval, (void*)(uintptr_t)abstime);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdStatfs(JNIEnv* km_env, jclass km_clazz, jlong path, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "statfs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_statfs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "statfs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_statfs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "statfs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFstatfs(JNIEnv* km_env, jclass km_clazz, jint fd, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fstatfs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fstatfs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fstatfs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fstatfs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fstatfs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDup3(JNIEnv* km_env, jclass km_clazz, jint src, jint dst, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dup3");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dup3");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dup3");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dup3");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dup3");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)src, (int32_t)dst, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdXuname(JNIEnv* km_env, jclass km_clazz, jint nmln, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__xuname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__xuname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__xuname");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nmln, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSendmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong msgvec, jlong vlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t);
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
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)msgvec, (uint64_t)vlen, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRecvmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong msgvec, jlong vlen, jint flags, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t, void*);
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
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)msgvec, (uint64_t)vlen, (int32_t)flags, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemmem(JNIEnv* km_env, jclass km_clazz, jlong haystack, jlong haystacklen, jlong needle, jlong needlelen) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memmem");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memmem");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memmem");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memmem");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memmem");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)haystack, (uint64_t)haystacklen, (void*)(uintptr_t)needle, (uint64_t)needlelen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhopen(JNIEnv* km_env, jclass km_clazz, jlong fhp, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhopen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhopen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhopen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhopen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhopen");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhstat(JNIEnv* km_env, jclass km_clazz, jlong fhp, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhstat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhstat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhstat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhstat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhstat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFhstatfs(JNIEnv* km_env, jclass km_clazz, jlong fhp, jlong buf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fhstatfs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fhstatfs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fhstatfs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fhstatfs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fhstatfs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fhp, (void*)(uintptr_t)buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetfh(JNIEnv* km_env, jclass km_clazz, jlong path, jlong fhp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getfh");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getfh");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getfh");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getfh");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getfh");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (void*)(uintptr_t)fhp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdLgetfh(JNIEnv* km_env, jclass km_clazz, jlong path, jlong fhp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "lgetfh");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_lgetfh");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "lgetfh");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_lgetfh");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "lgetfh");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (void*)(uintptr_t)fhp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetfsstat(JNIEnv* km_env, jclass km_clazz, jlong buf, jlong bufsize, jint mode) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getfsstat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getfsstat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getfsstat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getfsstat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getfsstat");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buf, (int64_t)bufsize, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetmntinfo(JNIEnv* km_env, jclass km_clazz, jlong mntbufp, jint mode) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getmntinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getmntinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getmntinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getmntinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getmntinfo");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mntbufp, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMount(JNIEnv* km_env, jclass km_clazz, jlong type, jlong dir, jint flags, jlong data) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mount");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mount");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mount");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mount");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mount");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)type, (const char*)(uintptr_t)dir, (int32_t)flags, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdNmount(JNIEnv* km_env, jclass km_clazz, jlong iov, jint niov, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "nmount");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_nmount");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "nmount");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_nmount");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "nmount");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iov, (uint32_t)niov, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSetproctitle(JNIEnv* km_env, jclass km_clazz, jlong fmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(const char*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setproctitle");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setproctitle");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setproctitle");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setproctitle");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setproctitle");
    }
#endif
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((const char*)(uintptr_t)fmt); break;
            case 1: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRfork(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "rfork");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_rfork");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "rfork");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_rfork");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "rfork");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(JNIEnv* km_env, jclass km_clazz, jint level, jint which, jlong id, jlong setsize, jlong mask) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_getaffinity");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_getaffinity");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_getaffinity");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_getaffinity");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_getaffinity");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)level, (int32_t)which, (int64_t)id, (uint64_t)setsize, (void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(JNIEnv* km_env, jclass km_clazz, jint level, jint which, jlong id, jlong setsize, jlong mask) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_setaffinity");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_setaffinity");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_setaffinity");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_setaffinity");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_setaffinity");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)level, (int32_t)which, (int64_t)id, (uint64_t)setsize, (void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCpuset(JNIEnv* km_env, jclass km_clazz, jlong setid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)setid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCpusetGetid(JNIEnv* km_env, jclass km_clazz, jint level, jint which, jlong id, jlong setid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_getid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_getid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_getid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_getid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_getid");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)level, (int32_t)which, (int64_t)id, (void*)(uintptr_t)setid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCpusetSetid(JNIEnv* km_env, jclass km_clazz, jint which, jlong id, jint setid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_setid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_setid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_setid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_setid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_setid");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (int64_t)id, (int32_t)setid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapEnter(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_enter");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_enter");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_enter");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_enter");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_enter");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapGetmode(JNIEnv* km_env, jclass km_clazz, jlong modep) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_getmode");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_getmode");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_getmode");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_getmode");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_getmode");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)modep);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(JNIEnv* km_env, jclass km_clazz, jint fd, jlong fcntlrightsp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_fcntls_get");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_fcntls_get");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_fcntls_get");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_fcntls_get");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_fcntls_get");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)fcntlrightsp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(JNIEnv* km_env, jclass km_clazz, jint fd, jint fcntlrights) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_fcntls_limit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_fcntls_limit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_fcntls_limit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_fcntls_limit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_fcntls_limit");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (uint32_t)fcntlrights);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(JNIEnv* km_env, jclass km_clazz, jint fd, jlong cmds, jlong maxcmds) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_ioctls_get");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_ioctls_get");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_ioctls_get");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_ioctls_get");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_ioctls_get");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)cmds, (uint64_t)maxcmds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(JNIEnv* km_env, jclass km_clazz, jint fd, jlong cmds, jlong ncmds) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_ioctls_limit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_ioctls_limit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_ioctls_limit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_ioctls_limit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_ioctls_limit");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)cmds, (uint64_t)ncmds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsInit(JNIEnv* km_env, jclass km_clazz, jint version, jlong rights, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__cap_rights_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__cap_rights_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__cap_rights_init");
    }
#endif
    void* km_res = NULL;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)version, (void*)(uintptr_t)rights); break;
            case 1: km_res = km_fn_ptr((int32_t)version, (void*)(uintptr_t)rights, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)version, (void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)version, (void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)version, (void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsGet(JNIEnv* km_env, jclass km_clazz, jint version, jint fd, jlong rightsp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__cap_rights_get");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__cap_rights_get");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__cap_rights_get");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)version, (int32_t)fd, (void*)(uintptr_t)rightsp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsSet(JNIEnv* km_env, jclass km_clazz, jlong rights, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__cap_rights_set");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__cap_rights_set");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__cap_rights_set");
    }
#endif
    void* km_res = NULL;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)rights); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsClear(JNIEnv* km_env, jclass km_clazz, jlong rights, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__cap_rights_clear");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__cap_rights_clear");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__cap_rights_clear");
    }
#endif
    void* km_res = NULL;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)rights); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(JNIEnv* km_env, jclass km_clazz, jlong rights, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef bool (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__cap_rights_is_set");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__cap_rights_is_set");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__cap_rights_is_set");
    }
#endif
    bool km_res = false;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)rights); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)rights, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(JNIEnv* km_env, jclass km_clazz, jlong rights) {
    (void)km_env;
    (void)km_clazz;
    typedef bool (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_rights_is_valid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_rights_is_valid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_rights_is_valid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_rights_is_valid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_rights_is_valid");
    }
#endif
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rights);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(JNIEnv* km_env, jclass km_clazz, jint fd, jlong rights) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_rights_limit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_rights_limit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_rights_limit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_rights_limit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_rights_limit");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)rights);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(JNIEnv* km_env, jclass km_clazz, jlong dst, jlong src) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_rights_merge");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_rights_merge");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_rights_merge");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_rights_merge");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_rights_merge");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dst, (void*)(uintptr_t)src);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(JNIEnv* km_env, jclass km_clazz, jlong dst, jlong src) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_rights_remove");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_rights_remove");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_rights_remove");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_rights_remove");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_rights_remove");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dst, (void*)(uintptr_t)src);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapRightsContains(JNIEnv* km_env, jclass km_clazz, jlong big, jlong little) {
    (void)km_env;
    (void)km_clazz;
    typedef bool (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_rights_contains");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_rights_contains");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_rights_contains");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_rights_contains");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_rights_contains");
    }
#endif
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)big, (void*)(uintptr_t)little);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCapSandboxed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef bool (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cap_sandboxed");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cap_sandboxed");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cap_sandboxed");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cap_sandboxed");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cap_sandboxed");
    }
#endif
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdReallocarray(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong nmemb, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFfs(JNIEnv* km_env, jclass km_clazz, jint value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ffs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ffs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ffs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ffs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ffs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFfsl(JNIEnv* km_env, jclass km_clazz, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ffsl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ffsl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ffsl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ffsl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ffsl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFfsll(JNIEnv* km_env, jclass km_clazz, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ffsll");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ffsll");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ffsll");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ffsll");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ffsll");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFls(JNIEnv* km_env, jclass km_clazz, jint value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fls");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fls");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fls");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fls");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fls");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFlsl(JNIEnv* km_env, jclass km_clazz, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "flsl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_flsl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "flsl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_flsl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "flsl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFlsll(JNIEnv* km_env, jclass km_clazz, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "flsll");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_flsll");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "flsll");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_flsll");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "flsll");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(JNIEnv* km_env, jclass km_clazz, jlong writeCb, jlong cbopaque, jlong opt) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "malloc_stats_print");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_malloc_stats_print");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "malloc_stats_print");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_malloc_stats_print");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "malloc_stats_print");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)writeCb, (void*)(uintptr_t)cbopaque, (const char*)(uintptr_t)opt);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMallctl(JNIEnv* km_env, jclass km_clazz, jlong name, jlong oldp, jlong oldlenp, jlong newp, jlong newlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mallctl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)name, (void*)(uintptr_t)oldp, (void*)(uintptr_t)oldlenp, (void*)(uintptr_t)newp, (uint64_t)newlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(JNIEnv* km_env, jclass km_clazz, jlong name, jlong mibp, jlong miplen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallctlnametomib");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallctlnametomib");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallctlnametomib");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallctlnametomib");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mallctlnametomib");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)name, (void*)(uintptr_t)mibp, (void*)(uintptr_t)miplen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMallctlbymib(JNIEnv* km_env, jclass km_clazz, jlong mib, jlong mible, jlong oldp, jlong oldlenp, jlong newp, jlong newlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallctlbymib");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallctlbymib");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallctlbymib");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallctlbymib");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mallctlbymib");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mib, (uint64_t)mible, (void*)(uintptr_t)oldp, (void*)(uintptr_t)oldlenp, (void*)(uintptr_t)newp, (uint64_t)newlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMallocx(JNIEnv* km_env, jclass km_clazz, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mallocx");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRallocx(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "rallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_rallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "rallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_rallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "rallocx");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)size, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdXallocx(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong size, jlong extra, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "xallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_xallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "xallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_xallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "xallocx");
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)size, (uint64_t)extra, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSallocx(JNIEnv* km_env, jclass km_clazz, jlong ptr, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sallocx");
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDallocx(JNIEnv* km_env, jclass km_clazz, jlong ptr, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dallocx");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr, (int32_t)flags);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSdallocx(JNIEnv* km_env, jclass km_clazz, jlong ptr, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sdallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sdallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sdallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sdallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sdallocx");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr, (uint64_t)size, (int32_t)flags);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdNallocx(JNIEnv* km_env, jclass km_clazz, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "nallocx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_nallocx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "nallocx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_nallocx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "nallocx");
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcctl(JNIEnv* km_env, jclass km_clazz, jint idtype, jlong id, jint cmd, jlong data) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint32_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procctl");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idtype, (int64_t)id, (int32_t)cmd, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetpagesize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpagesize");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpagesize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpagesize");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpagesize");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpagesize");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetpagesizes(JNIEnv* km_env, jclass km_clazz, jlong pagesize, jint nelem) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpagesizes");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpagesizes");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpagesizes");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpagesizes");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpagesizes");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pagesize, (int32_t)nelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(JNIEnv* km_env, jclass km_clazz, jlong arg1, jint arg2, jlong arg3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getcpuclockid2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getcpuclockid2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getcpuclockid2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getcpuclockid2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_getcpuclockid2");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg1, (int32_t)arg2, (void*)(uintptr_t)arg3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdStrchrnul(JNIEnv* km_env, jclass km_clazz, jlong s, jint c) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strchrnul");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strchrnul");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strchrnul");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strchrnul");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "strchrnul");
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)s, (int32_t)c);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(JNIEnv* km_env, jclass km_clazz, jlong path, jint flags, jint psind, jint allocPolicy, jshort mode) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, int32_t, int32_t, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_create_largepage");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_create_largepage");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_create_largepage");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_create_largepage");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shm_create_largepage");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (int32_t)psind, (int32_t)allocPolicy, (uint16_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdShmRename(JNIEnv* km_env, jclass km_clazz, jlong pathFrom, jlong pathTo, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_rename");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_rename");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_rename");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_rename");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shm_rename");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)pathFrom, (const char*)(uintptr_t)pathTo, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemfdCreate(JNIEnv* km_env, jclass km_clazz, jlong name, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memfd_create");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memfd_create");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memfd_create");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memfd_create");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memfd_create");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)name, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSetaudit(JNIEnv* km_env, jclass km_clazz, jlong auditinfo) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setaudit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setaudit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setaudit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setaudit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setaudit");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)auditinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdEventfd(JNIEnv* km_env, jclass km_clazz, jint initval, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "eventfd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_eventfd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "eventfd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_eventfd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "eventfd");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)initval, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdEventfdRead(JNIEnv* km_env, jclass km_clazz, jint fd, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "eventfd_read");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_eventfd_read");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "eventfd_read");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_eventfd_read");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "eventfd_read");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdEventfdWrite(JNIEnv* km_env, jclass km_clazz, jint fd, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "eventfd_write");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_eventfd_write");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "eventfd_write");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_eventfd_write");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "eventfd_write");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (uint64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFdatasync(JNIEnv* km_env, jclass km_clazz, jint fd) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(JNIEnv* km_env, jclass km_clazz, jint aux, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "elf_aux_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_elf_aux_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "elf_aux_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_elf_aux_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "elf_aux_info");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)aux, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(JNIEnv* km_env, jclass km_clazz, jlong fmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(const char*, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setproctitle_fast");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setproctitle_fast");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setproctitle_fast");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setproctitle_fast");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setproctitle_fast");
    }
#endif
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((const char*)(uintptr_t)fmt); break;
            case 1: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((const char*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(JNIEnv* km_env, jclass km_clazz, jlong a, jlong b, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timingsafe_bcmp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timingsafe_bcmp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timingsafe_bcmp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timingsafe_bcmp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timingsafe_bcmp");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)a, (void*)(uintptr_t)b, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(JNIEnv* km_env, jclass km_clazz, jlong a, jlong b, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timingsafe_memcmp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timingsafe_memcmp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timingsafe_memcmp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timingsafe_memcmp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timingsafe_memcmp");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)a, (void*)(uintptr_t)b, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdUmtxOp(JNIEnv* km_env, jclass km_clazz, jlong obj, jint op, jlong val, jlong uaddr, jlong uaddr2) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_umtx_op");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_umtx_op");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "_umtx_op");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)obj, (int32_t)op, (uint64_t)val, (void*)(uintptr_t)uaddr, (void*)(uintptr_t)uaddr2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(JNIEnv* km_env, jclass km_clazz, jint s, jint id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_peeloff");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_peeloff");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_peeloff");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_peeloff");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_peeloff");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (uint32_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpBindx(JNIEnv* km_env, jclass km_clazz, jint s, jlong addrs, jint num, jint tpe) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_bindx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_bindx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_bindx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_bindx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_bindx");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (void*)(uintptr_t)addrs, (int32_t)num, (int32_t)tpe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpConnectx(JNIEnv* km_env, jclass km_clazz, jint s, jlong addrs, jint addrcnt, jlong id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_connectx");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_connectx");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_connectx");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_connectx");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_connectx");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (void*)(uintptr_t)addrs, (int32_t)addrcnt, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(JNIEnv* km_env, jclass km_clazz, jbyte family) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_getaddrlen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_getaddrlen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_getaddrlen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_getaddrlen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_getaddrlen");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)family);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(JNIEnv* km_env, jclass km_clazz, jint s, jint asocid, jlong addrs) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_getpaddrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_getpaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_getpaddrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_getpaddrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_getpaddrs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (uint32_t)asocid, (void*)(uintptr_t)addrs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(JNIEnv* km_env, jclass km_clazz, jlong addrs) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_freepaddrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_freepaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_freepaddrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_freepaddrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_freepaddrs");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)addrs);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(JNIEnv* km_env, jclass km_clazz, jint s, jint asocid, jlong addrs) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_getladdrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_getladdrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_getladdrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_getladdrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_getladdrs");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (uint32_t)asocid, (void*)(uintptr_t)addrs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(JNIEnv* km_env, jclass km_clazz, jlong addrs) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_freeladdrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_freeladdrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_freeladdrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_freeladdrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_freeladdrs");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)addrs);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(JNIEnv* km_env, jclass km_clazz, jint s, jint id, jint opt, jlong arg, jlong size) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_opt_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_opt_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_opt_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_opt_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_opt_info");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)s, (uint32_t)id, (int32_t)opt, (void*)(uintptr_t)arg, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpSendv(JNIEnv* km_env, jclass km_clazz, jint sd, jlong iov, jint iovcnt, jlong addrs, jint addrcnt, jlong info, jint infolen, jint infotype, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, void*, int32_t, void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_sendv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_sendv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_sendv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_sendv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_sendv");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sd, (void*)(uintptr_t)iov, (int32_t)iovcnt, (void*)(uintptr_t)addrs, (int32_t)addrcnt, (void*)(uintptr_t)info, (uint32_t)infolen, (uint32_t)infotype, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdSctpRecvv(JNIEnv* km_env, jclass km_clazz, jint sd, jlong iov, jint iovcnt, jlong from, jlong fromlen, jlong info, jlong infolen, jlong infotype, jlong flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sctp_recvv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sctp_recvv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sctp_recvv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sctp_recvv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sctp_recvv");
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sd, (void*)(uintptr_t)iov, (int32_t)iovcnt, (void*)(uintptr_t)from, (void*)(uintptr_t)fromlen, (void*)(uintptr_t)info, (void*)(uintptr_t)infolen, (void*)(uintptr_t)infotype, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(JNIEnv* km_env, jclass km_clazz, jint clockid, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timerfd_create");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timerfd_create");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timerfd_create");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timerfd_create");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timerfd_create");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clockid, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(JNIEnv* km_env, jclass km_clazz, jint fd, jlong currValue) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timerfd_gettime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timerfd_gettime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timerfd_gettime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timerfd_gettime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timerfd_gettime");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)currValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(JNIEnv* km_env, jclass km_clazz, jint fd, jint flags, jlong newValue, jlong oldValue) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timerfd_settime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timerfd_settime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timerfd_settime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timerfd_settime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timerfd_settime");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)flags, (void*)(uintptr_t)newValue, (void*)(uintptr_t)oldValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdClosefrom(JNIEnv* km_env, jclass km_clazz, jint lowfd) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(int32_t);
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
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)lowfd);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdCloseRange(JNIEnv* km_env, jclass km_clazz, jint lowfd, jint highfd, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "close_range");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_close_range");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "close_range");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_close_range");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "close_range");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)lowfd, (uint32_t)highfd, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExecvpe(JNIEnv* km_env, jclass km_clazz, jlong file, jlong argv, jlong envp) {
    (void)km_env;
    (void)km_clazz;
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
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)file, (void*)(uintptr_t)argv, (void*)(uintptr_t)envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKcmp(JNIEnv* km_env, jclass km_clazz, jint pid1, jint pid2, jint type, jlong idx1, jlong idx2) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kcmp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kcmp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kcmp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kcmp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kcmp");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid1, (int32_t)pid2, (int32_t)type, (uint64_t)idx1, (uint64_t)idx2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDlvsym(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong symbol, jlong version) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, const char*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dlvsym");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dlvsym");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dlvsym");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dlvsym");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dlvsym");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (const char*)(uintptr_t)symbol, (const char*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(JNIEnv* km_env, jclass km_clazz, jint error) {
    (void)km_env;
    (void)km_clazz;
    typedef const char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_strerror");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_strerror");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_strerror");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_strerror");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_strerror");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_strerror");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_strerror");
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)error);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_alloc");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_alloc");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_alloc");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_alloc");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_alloc");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_alloc");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_alloc");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(JNIEnv* km_env, jclass km_clazz, jlong list) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_first");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_first");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_first");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_first");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_first");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_first");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_first");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)list);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(JNIEnv* km_env, jclass km_clazz, jlong mtp) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_next");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_next");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_next");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_next");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_next");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_next");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_next");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mtp);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(JNIEnv* km_env, jclass km_clazz, jlong list, jint allocator, jlong name) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, int32_t, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_find");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_find");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_find");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_find");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_find");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_find");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_find");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)list, (int32_t)allocator, (const char*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(JNIEnv* km_env, jclass km_clazz, jlong list) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_free");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_free");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_free");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_free");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_free");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_free");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_free");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)list);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(JNIEnv* km_env, jclass km_clazz, jlong list) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_mtl_geterror");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_mtl_geterror");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_mtl_geterror");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_mtl_geterror");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_mtl_geterror");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_geterror");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_mtl_geterror");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)list);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdMemstatGetName(JNIEnv* km_env, jclass km_clazz, jlong mtp) {
    (void)km_env;
    (void)km_clazz;
    typedef const char* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memstat_get_name");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memstat_get_name");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memstat_get_name");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memstat_get_name");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memstat_get_name");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("/usr/lib/libmemstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_get_name");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_memstat = NULL;
            static bool km_h_memstat_init = false;
            if (!km_h_memstat_init) {
                km_h_memstat_init = true;
                km_h_memstat = dlopen("libmemstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_memstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_memstat, "memstat_get_name");
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mtp);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(JNIEnv* km_env, jclass km_clazz, jlong kd, jint cpu) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_dpcpu_setcpu");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_dpcpu_setcpu");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_dpcpu_setcpu");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_dpcpu_setcpu");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_dpcpu_setcpu");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_dpcpu_setcpu");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_dpcpu_setcpu");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (uint32_t)cpu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetargv(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong p, jint nchr) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getargv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getargv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getargv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getargv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getargv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getargv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getargv");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)p, (int32_t)nchr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong cpTime) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getcptime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getcptime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getcptime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getcptime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getcptime");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getcptime");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getcptime");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)cpTime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong p, jint nchr) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getenvv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getenvv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getenvv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getenvv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getenvv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getenvv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getenvv");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)p, (int32_t)nchr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGeterr(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_geterr");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_geterr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_geterr");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_geterr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_geterr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_geterr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_geterr");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getmaxcpu");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getmaxcpu");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getmaxcpu");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getmaxcpu");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getmaxcpu");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getmaxcpu");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getmaxcpu");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getncpus");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getncpus");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getncpus");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getncpus");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getncpus");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getncpus");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getncpus");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(JNIEnv* km_env, jclass km_clazz, jlong kd, jint cpu) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getpcpu");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getpcpu");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getpcpu");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getpcpu");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getpcpu");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getpcpu");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getpcpu");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (int32_t)cpu);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong base) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_counter_u64_fetch");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_counter_u64_fetch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_counter_u64_fetch");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_counter_u64_fetch");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_counter_u64_fetch");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_counter_u64_fetch");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_counter_u64_fetch");
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (uint64_t)base);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong info, jint maxswap, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_getswapinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_getswapinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_getswapinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_getswapinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_getswapinfo");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getswapinfo");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_getswapinfo");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)info, (int32_t)maxswap, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmNative(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_native");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_native");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_native");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_native");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_native");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_native");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_native");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmNlist(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong nl) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_nlist");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_nlist");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_nlist");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_nlist");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_nlist");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_nlist");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_nlist");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)nl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmNlist2(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong nl) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_nlist2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_nlist2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_nlist2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_nlist2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_nlist2");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_nlist2");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_nlist2");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (void*)(uintptr_t)nl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong base, jlong buf, jlong size, jint cpu) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*, uint64_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_read_zpcpu");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_read_zpcpu");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_read_zpcpu");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_read_zpcpu");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_read_zpcpu");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_read_zpcpu");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_read_zpcpu");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (uint64_t)base, (void*)(uintptr_t)buf, (uint64_t)size, (int32_t)cpu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKvmRead2(JNIEnv* km_env, jclass km_clazz, jlong kd, jlong addr, jlong buf, jlong nbytes) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_read2");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_read2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_read2");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_read2");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_read2");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_read2");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_read2");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd, (uint64_t)addr, (void*)(uintptr_t)buf, (uint64_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(JNIEnv* km_env, jclass km_clazz, jint attrnamespace, jlong string) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_namespace_to_string");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_namespace_to_string");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_namespace_to_string");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_namespace_to_string");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_namespace_to_string");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "extattr_namespace_to_string");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "extattr_namespace_to_string");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)attrnamespace, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(JNIEnv* km_env, jclass km_clazz, jlong string, jlong attrnamespace) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "extattr_string_to_namespace");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_extattr_string_to_namespace");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "extattr_string_to_namespace");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_extattr_string_to_namespace");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "extattr_string_to_namespace");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "extattr_string_to_namespace");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "extattr_string_to_namespace");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)string, (void*)(uintptr_t)attrnamespace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRealhostname(JNIEnv* km_env, jclass km_clazz, jlong host, jlong hsize, jlong ip) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "realhostname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_realhostname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "realhostname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_realhostname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "realhostname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "realhostname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "realhostname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)host, (uint64_t)hsize, (void*)(uintptr_t)ip);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(JNIEnv* km_env, jclass km_clazz, jlong host, jlong hsize, jlong addr, jint addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "realhostname_sa");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_realhostname_sa");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "realhostname_sa");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_realhostname_sa");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "realhostname_sa");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "realhostname_sa");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "realhostname_sa");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)host, (uint64_t)hsize, (void*)(uintptr_t)addr, (int32_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKldIsloaded(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kld_isloaded");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kld_isloaded");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kld_isloaded");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kld_isloaded");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kld_isloaded");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kld_isloaded");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kld_isloaded");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKldLoad(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kld_load");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kld_load");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kld_load");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kld_load");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kld_load");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kld_load");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kld_load");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(JNIEnv* km_env, jclass km_clazz, jint pid, jlong cntp) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kinfo_getvmmap");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kinfo_getvmmap");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kinfo_getvmmap");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kinfo_getvmmap");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kinfo_getvmmap");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kinfo_getvmmap");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "kinfo_getvmmap");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)cntp);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdHexdump(JNIEnv* km_env, jclass km_clazz, jlong ptr, jint length, jlong hdr, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, int32_t, const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "hexdump");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_hexdump");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "hexdump");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_hexdump");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "hexdump");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "hexdump");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "hexdump");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr, (int32_t)length, (const char*)(uintptr_t)hdr, (int32_t)flags);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(JNIEnv* km_env, jclass km_clazz, jlong buf, jlong len, jlong number, jlong suffix, jint scale, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, uint64_t, int64_t, const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "humanize_number");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_humanize_number");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "humanize_number");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_humanize_number");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "humanize_number");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "humanize_number");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "humanize_number");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)buf, (uint64_t)len, (int64_t)number, (const char*)(uintptr_t)suffix, (int32_t)scale, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFlopen(JNIEnv* km_env, jclass km_clazz, jlong path, jint flags, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "flopen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_flopen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "flopen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_flopen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "flopen");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "flopen");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "flopen");
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags); break;
            case 1: km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdFlopenat(JNIEnv* km_env, jclass km_clazz, jint fd, jlong path, jint flags, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "flopenat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_flopenat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "flopenat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_flopenat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "flopenat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "flopenat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "flopenat");
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)fd, (const char*)(uintptr_t)path, (int32_t)flags); break;
            case 1: km_res = km_fn_ptr((int32_t)fd, (const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)fd, (const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)fd, (const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)fd, (const char*)(uintptr_t)path, (int32_t)flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdGetlocalbase(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef const char* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getlocalbase");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getlocalbase");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getlocalbase");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getlocalbase");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getlocalbase");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getlocalbase");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "getlocalbase");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPidfileOpen(JNIEnv* km_env, jclass km_clazz, jlong path, jshort mode, jlong pidptr) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(const char*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pidfile_open");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pidfile_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pidfile_open");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pidfile_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pidfile_open");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_open");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_open");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)path, (uint16_t)mode, (void*)(uintptr_t)pidptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPidfileWrite(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pidfile_write");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pidfile_write");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pidfile_write");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pidfile_write");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pidfile_write");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_write");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_write");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPidfileClose(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pidfile_close");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pidfile_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pidfile_close");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pidfile_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pidfile_close");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_close");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_close");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPidfileRemove(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pidfile_remove");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pidfile_remove");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pidfile_remove");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pidfile_remove");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pidfile_remove");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_remove");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_remove");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdPidfileFileno(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pidfile_fileno");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pidfile_fileno");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pidfile_fileno");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pidfile_fileno");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pidfile_fileno");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_fileno");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_util = NULL;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_util, "pidfile_fileno");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_open_sysctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_open_sysctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_open_sysctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_open_sysctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_open_sysctl");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_sysctl");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_sysctl");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jint mmapped) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getfiles");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getfiles");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getfiles");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getfiles");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getfiles");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getfiles");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getfiles");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (int32_t)mmapped);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong head) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freefiles");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freefiles");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freefiles");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freefiles");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freefiles");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freefiles");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freefiles");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)head);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(JNIEnv* km_env, jclass km_clazz, jlong procstat, jint what, jint arg, jlong count) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getprocs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getprocs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getprocs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getprocs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getprocs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getprocs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getprocs");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (int32_t)what, (int32_t)arg, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong p) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freeprocs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freeprocs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freeprocs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freeprocs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freeprocs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeprocs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeprocs");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)p);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong count) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getvmmap");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getvmmap");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getvmmap");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getvmmap");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getvmmap");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getvmmap");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getvmmap");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong vmmap) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freevmmap");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freevmmap");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freevmmap");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freevmmap");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freevmmap");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freevmmap");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freevmmap");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)vmmap);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatClose(JNIEnv* km_env, jclass km_clazz, jlong procstat) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_close");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_close");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_close");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_close");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_close");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(JNIEnv* km_env, jclass km_clazz, jlong procstat) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freeargv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freeargv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freeargv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freeargv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freeargv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeargv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeargv");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(JNIEnv* km_env, jclass km_clazz, jlong procstat) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freeenvv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freeenvv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freeenvv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freeenvv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freeenvv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeenvv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeenvv");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong groups) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freegroups");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freegroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freegroups");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freegroups");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freegroups");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freegroups");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freegroups");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)groups);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong pl) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_freeptlwpinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_freeptlwpinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_freeptlwpinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_freeptlwpinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_freeptlwpinfo");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeptlwpinfo");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_freeptlwpinfo");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)pl);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong nchr) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getargv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getargv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getargv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getargv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getargv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getargv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getargv");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (uint64_t)nchr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong nchr) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getenvv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getenvv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getenvv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getenvv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getenvv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getenvv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getenvv");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (uint64_t)nchr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong count) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getgroups");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getgroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getgroups");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getgroups");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getgroups");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getgroups");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getgroups");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong osrelp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getosrel");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getosrel");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getosrel");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getosrel");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getosrel");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getosrel");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getosrel");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (void*)(uintptr_t)osrelp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong pathname, jlong maxlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getpathname");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getpathname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getpathname");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getpathname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getpathname");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getpathname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getpathname");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (char*)(uintptr_t)pathname, (uint64_t)maxlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jint which, jlong rlimit) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getrlimit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getrlimit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getrlimit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getrlimit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getrlimit");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getrlimit");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getrlimit");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (int32_t)which, (void*)(uintptr_t)rlimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(JNIEnv* km_env, jclass km_clazz, jlong procstat, jlong kp, jlong maskp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_getumask");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_getumask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_getumask");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_getumask");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_getumask");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getumask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_getumask");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)procstat, (void*)(uintptr_t)kp, (void*)(uintptr_t)maskp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(JNIEnv* km_env, jclass km_clazz, jlong filename) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_open_core");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_open_core");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_open_core");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_open_core");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_open_core");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_core");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_core");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)filename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(JNIEnv* km_env, jclass km_clazz, jlong nlistf, jlong memf) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_open_kvm");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_open_kvm");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_open_kvm");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_open_kvm");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_open_kvm");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_kvm");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_open_kvm");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((const char*)(uintptr_t)nlistf, (const char*)(uintptr_t)memf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(JNIEnv* km_env, jclass km_clazz, jlong proc, jlong fst, jlong sock, jlong errbuf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_get_socket_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_get_socket_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_get_socket_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_get_socket_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_get_socket_info");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_socket_info");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_socket_info");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proc, (void*)(uintptr_t)fst, (void*)(uintptr_t)sock, (char*)(uintptr_t)errbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(JNIEnv* km_env, jclass km_clazz, jlong proc, jlong fst, jlong vn, jlong errbuf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_get_vnode_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_get_vnode_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_get_vnode_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_get_vnode_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_get_vnode_info");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_vnode_info");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_vnode_info");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proc, (void*)(uintptr_t)fst, (void*)(uintptr_t)vn, (char*)(uintptr_t)errbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(JNIEnv* km_env, jclass km_clazz, jlong proc, jlong fst, jlong pts, jlong errbuf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_get_pts_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_get_pts_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_get_pts_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_get_pts_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_get_pts_info");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_pts_info");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_pts_info");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proc, (void*)(uintptr_t)fst, (void*)(uintptr_t)pts, (char*)(uintptr_t)errbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(JNIEnv* km_env, jclass km_clazz, jlong proc, jlong fst, jlong shm, jlong errbuf) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "procstat_get_shm_info");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_procstat_get_shm_info");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "procstat_get_shm_info");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_procstat_get_shm_info");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "procstat_get_shm_info");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("/usr/lib/libprocstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_shm_info");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_procstat = NULL;
            static bool km_h_procstat_init = false;
            if (!km_h_procstat_init) {
                km_h_procstat_init = true;
                km_h_procstat = dlopen("libprocstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_procstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_procstat, "procstat_get_shm_info");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proc, (void*)(uintptr_t)fst, (void*)(uintptr_t)shm, (char*)(uintptr_t)errbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerCreate(JNIEnv* km_env, jclass km_clazz, jint clockId, jlong evp, jlong timerid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timer_create");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timer_create");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timer_create");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timer_create");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timer_create");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clockId, (void*)(uintptr_t)evp, (void*)(uintptr_t)timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerDelete(JNIEnv* km_env, jclass km_clazz, jlong timerid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timer_delete");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timer_delete");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timer_delete");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timer_delete");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timer_delete");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(JNIEnv* km_env, jclass km_clazz, jlong timerid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timer_getoverrun");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timer_getoverrun");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timer_getoverrun");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timer_getoverrun");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timer_getoverrun");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerGettime(JNIEnv* km_env, jclass km_clazz, jlong timerid, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timer_gettime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timer_gettime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timer_gettime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timer_gettime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timer_gettime");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerid, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdTimerSettime(JNIEnv* km_env, jclass km_clazz, jlong timerid, jint flags, jlong value, jlong ovalue) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "timer_settime");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_timer_settime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "timer_settime");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_timer_settime");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "timer_settime");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerid, (int32_t)flags, (void*)(uintptr_t)value, (void*)(uintptr_t)ovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devstat_getnumdevs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devstat_getnumdevs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devstat_getnumdevs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devstat_getnumdevs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devstat_getnumdevs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("/usr/lib/libdevstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getnumdevs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("libdevstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getnumdevs");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devstat_getgeneration");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devstat_getgeneration");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devstat_getgeneration");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devstat_getgeneration");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devstat_getgeneration");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("/usr/lib/libdevstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getgeneration");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("libdevstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getgeneration");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devstat_getversion");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devstat_getversion");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devstat_getversion");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devstat_getversion");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devstat_getversion");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("/usr/lib/libdevstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getversion");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("libdevstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_getversion");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(JNIEnv* km_env, jclass km_clazz, jlong kd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devstat_checkversion");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devstat_checkversion");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devstat_checkversion");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devstat_checkversion");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devstat_checkversion");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("/usr/lib/libdevstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_checkversion");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("libdevstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_checkversion");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_freebsdlike_freebsd_UnixBsdFreebsdlikeFreebsdJniBridge_libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(JNIEnv* km_env, jclass km_clazz, jlong matchStr, jlong matches, jlong numMatches) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "devstat_buildmatch");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_devstat_buildmatch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "devstat_buildmatch");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_devstat_buildmatch");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "devstat_buildmatch");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("/usr/lib/libdevstat.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_buildmatch");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_devstat = NULL;
            static bool km_h_devstat_init = false;
            if (!km_h_devstat_init) {
                km_h_devstat_init = true;
                km_h_devstat = dlopen("libdevstat.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_devstat != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_devstat, "devstat_buildmatch");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)matchStr, (void*)(uintptr_t)matches, (void*)(uintptr_t)numMatches);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

