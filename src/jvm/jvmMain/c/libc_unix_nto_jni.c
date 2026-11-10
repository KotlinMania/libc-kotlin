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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1get_1SYSPAGE_1PTR(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    static void** km_sym_ptr = NULL;
#ifdef _WIN32
    if (km_sym_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_ucrt, "_syspage_ptr");
        if (km_sym_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_msvcrt, "_syspage_ptr");
        }
    }
#else
    if (km_sym_ptr == NULL) {
        km_sym_ptr = (void**)dlsym(RTLD_DEFAULT, "_syspage_ptr");
    }
#endif
    void* km_res = (km_sym_ptr != NULL) ? *km_sym_ptr : NULL;
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1set_1SYSPAGE_1PTR(JNIEnv* km_env, jclass km_clazz, jlong value) {
    (void)km_env;
    (void)km_clazz;
    static void** km_sym_ptr = NULL;
#ifdef _WIN32
    if (km_sym_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_ucrt, "_syspage_ptr");
        if (km_sym_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_msvcrt, "_syspage_ptr");
        }
    }
#else
    if (km_sym_ptr == NULL) {
        km_sym_ptr = (void**)dlsym(RTLD_DEFAULT, "_syspage_ptr");
    }
#endif
    if (km_sym_ptr != NULL) {
        *km_sym_ptr = (void*)(uintptr_t)value;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sendmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong msgvec, jint vlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t);
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
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)msgvec, (uint32_t)vlen, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1recvmmsg(JNIEnv* km_env, jclass km_clazz, jint sockfd, jlong msgvec, jint vlen, jint flags, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*);
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
        km_res = km_fn_ptr((int32_t)sockfd, (void*)(uintptr_t)msgvec, (uint32_t)vlen, (uint32_t)flags, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semDestroy(JNIEnv* km_env, jclass km_clazz, jlong sem) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_destroy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semInit(JNIEnv* km_env, jclass km_clazz, jlong sem, jint pshared, jint value) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_init");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1fdatasync(JNIEnv* km_env, jclass km_clazz, jint fd) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "fdatasync");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "fdatasync");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpriority(JNIEnv* km_env, jclass km_clazz, jint which, jint who) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpriority");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpriority");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (int32_t)who);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setpriority(JNIEnv* km_env, jclass km_clazz, jint which, jint who, jint prio) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setpriority");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setpriority");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (int32_t)who, (int32_t)prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mkfifoat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring pathname, jint mode) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkfifoat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkfifoat");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mknodat(JNIEnv* km_env, jclass km_clazz, jint arg_0_fd, jstring pathname, jint mode, jint dev) {
    (void)km_env;
    (void)km_clazz;
    const char* pathname_utf = (pathname != NULL) ? (*km_env)->GetStringUTFChars(km_env, pathname, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t, uint32_t);
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mknodat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mknodat");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_fd, pathname_utf, (uint32_t)mode, (uint32_t)dev);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (pathname != NULL && pathname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pathname, pathname_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clockGetres(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_getres");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_getres");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clockGettime(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_gettime");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_gettime");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clockSettime(JNIEnv* km_env, jclass km_clazz, jint clk_id, jlong tp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_settime");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_settime");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clockGetcpuclockid(JNIEnv* km_env, jclass km_clazz, jint pid, jlong clk_id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getcpuclockid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getcpuclockid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getcpuclockid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getcpuclockid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_getcpuclockid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_getcpuclockid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_getcpuclockid");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)clk_id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadAttrGetstack(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong stackaddr, jlong stacksize) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getstack");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_getstack");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getstack");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_getstack");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_getstack");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_getstack");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_getstack");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)stackaddr, (void*)(uintptr_t)stacksize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1memalign(JNIEnv* km_env, jclass km_clazz, jlong align, jlong size) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memalign");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memalign");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memalign");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memalign");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memalign");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "memalign");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "memalign");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)align, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setgroups(JNIEnv* km_env, jclass km_clazz, jint ngroups, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setgroups");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setgroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setgroups");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setgroups");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setgroups");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setgroups");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setgroups");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)ngroups, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixFadvise(JNIEnv* km_env, jclass km_clazz, jint fd, jlong offset, jlong len, jint advise) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_fadvise");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_fadvise");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_fadvise");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_fadvise");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_fadvise");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_fadvise");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_fadvise");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int64_t)offset, (int64_t)len, (int32_t)advise);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1futimens(JNIEnv* km_env, jclass km_clazz, jint fd, jlong times) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "futimens");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "futimens");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1nlLanginfo(JNIEnv* km_env, jclass km_clazz, jint item) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "nl_langinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_nl_langinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "nl_langinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_nl_langinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "nl_langinfo");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "nl_langinfo");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "nl_langinfo");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)item);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1utimensat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring path, jlong times, jint flag) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "utimensat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "utimensat");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCondattrGetclock(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong clock_id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_getclock");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_getclock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_getclock");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_getclock");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_condattr_getclock");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_getclock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_getclock");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)clock_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCondattrSetclock(JNIEnv* km_env, jclass km_clazz, jlong attr, jint clock_id) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_setclock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_setclock");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCondattrSetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jint pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_setpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_setpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_setpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_condattr_setpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_setpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_setpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexattrSetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jint pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_setpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutexattr_setpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_setpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_setpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadRwlockattrGetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong val) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_rwlockattr_getpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_getpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_getpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_rwlockattr_getpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_rwlockattr_getpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_rwlockattr_getpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)val);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadRwlockattrSetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jint val) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_rwlockattr_setpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_setpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_setpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_rwlockattr_setpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_rwlockattr_setpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_rwlockattr_setpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)val);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ptsnameR(JNIEnv* km_env, jclass km_clazz, jint fd, jlong buf, jlong buflen) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(int32_t, char*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ptsname_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ptsname_r");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (char*)(uintptr_t)buf, (uint64_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clearenv(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clearenv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clearenv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clearenv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clearenv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clearenv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clearenv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clearenv");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1waitid(JNIEnv* km_env, jclass km_clazz, jint idtype, jint id, jlong infop, jint options) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, int32_t);
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "waitid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "waitid");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idtype, (int32_t)id, (void*)(uintptr_t)infop, (int32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1wait4(JNIEnv* km_env, jclass km_clazz, jint pid, jlong status, jint options, jlong rusage) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "wait4");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "wait4");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1execvpe(JNIEnv* km_env, jclass km_clazz, jstring file, jlong argv, jlong envp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "execvpe");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "execvpe");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getifaddrs(JNIEnv* km_env, jclass km_clazz, jlong ifap) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getifaddrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getifaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getifaddrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getifaddrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getifaddrs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getifaddrs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getifaddrs");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1freeifaddrs(JNIEnv* km_env, jclass km_clazz, jlong ifa) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "freeifaddrs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_freeifaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "freeifaddrs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_freeifaddrs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "freeifaddrs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "freeifaddrs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "freeifaddrs");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ifa);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1bind(JNIEnv* km_env, jclass km_clazz, jint arg_0_socket, jlong address, jint address_len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "bind");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_bind");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "bind");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_bind");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "bind");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "bind");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "bind");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_socket, (void*)(uintptr_t)address, (uint32_t)address_len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1writev(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "writev");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_writev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "writev");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_writev");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "writev");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "writev");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "writev");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (int32_t)iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1readv(JNIEnv* km_env, jclass km_clazz, jint fd, jlong iov, jint iovcnt) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "readv");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_readv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "readv");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_readv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "readv");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "readv");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "readv");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)iov, (int32_t)iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sendmsg(JNIEnv* km_env, jclass km_clazz, jint fd, jlong msg, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sendmsg");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sendmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sendmsg");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sendmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sendmsg");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sendmsg");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sendmsg");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)msg, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1recvmsg(JNIEnv* km_env, jclass km_clazz, jint fd, jlong msg, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "recvmsg");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_recvmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "recvmsg");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_recvmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "recvmsg");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "recvmsg");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "recvmsg");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (void*)(uintptr_t)msg, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1openpty(JNIEnv* km_env, jclass km_clazz, jlong amaster, jlong aslave, jlong name, jlong termp, jlong winp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "openpty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "openpty");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1forkpty(JNIEnv* km_env, jclass km_clazz, jlong amaster, jlong name, jlong termp, jlong winp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "forkpty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "forkpty");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1loginTty(JNIEnv* km_env, jclass km_clazz, jint fd) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "login_tty");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "login_tty");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1uname(JNIEnv* km_env, jclass km_clazz, jlong buf) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "uname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "uname");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpeereid(JNIEnv* km_env, jclass km_clazz, jint arg_0_socket, jlong euid, jlong egid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpeereid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpeereid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpeereid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpeereid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpeereid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpeereid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpeereid");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_socket, (void*)(uintptr_t)euid, (void*)(uintptr_t)egid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1strerrorR(JNIEnv* km_env, jclass km_clazz, jint errnum, jlong buf, jlong buflen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strerror_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strerror_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strerror_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strerror_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "strerror_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "strerror_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "strerror_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)errnum, (char*)(uintptr_t)buf, (uint64_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1abs(JNIEnv* km_env, jclass km_clazz, jint i) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "abs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_abs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "abs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_abs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "abs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "abs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "abs");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1labs(JNIEnv* km_env, jclass km_clazz, jlong i) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "labs");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_labs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "labs");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_labs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "labs");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "labs");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "labs");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1rand(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "rand");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_rand");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "rand");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_rand");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "rand");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "rand");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "rand");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1srand(JNIEnv* km_env, jclass km_clazz, jint seed) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "srand");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_srand");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "srand");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_srand");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "srand");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "srand");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "srand");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)seed);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setpwent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setpwent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setpwent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setpwent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setpwent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setpwent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setpwent");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1endpwent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endpwent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endpwent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endpwent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "endpwent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endpwent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endpwent");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpwent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpwent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwent");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setgrent(JNIEnv* km_env, jclass km_clazz) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setgrent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setgrent");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1endgrent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endgrent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endgrent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endgrent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "endgrent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endgrent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endgrent");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrent");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setspent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setspent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setspent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setspent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setspent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setspent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setspent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setspent");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1endspent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endspent");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endspent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endspent");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endspent");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "endspent");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endspent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "endspent");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1shmOpen(JNIEnv* km_env, jclass km_clazz, jstring name, jint oflag, jint mode) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "shm_open");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "shm_open");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ftok(JNIEnv* km_env, jclass km_clazz, jstring pathname, jint proj_id) {
    (void)km_env;
    (void)km_clazz;
    const char* pathname_utf = (pathname != NULL) ? (*km_env)->GetStringUTFChars(km_env, pathname, NULL) : NULL;
    typedef uint32_t (*km_fn_t)(const char*, int32_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ftok");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ftok");
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(pathname_utf, (int32_t)proj_id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    if (pathname != NULL && pathname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pathname, pathname_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mprotect(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong len, jint prot) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mprotect");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mprotect");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mprotect");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mprotect");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mprotect");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mprotect");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mprotect");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (uint64_t)len, (int32_t)prot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixFallocate(JNIEnv* km_env, jclass km_clazz, jint fd, jlong offset, jlong len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_fallocate");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_fallocate");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_fallocate");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_fallocate");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_fallocate");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_fallocate");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_fallocate");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int64_t)offset, (int64_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mkostemp(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jint flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkostemp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkostemp");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mkostemps(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jint suffixlen, jint flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkostemps");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkostemps");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sigtimedwait(JNIEnv* km_env, jclass km_clazz, jlong set, jlong info, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigtimedwait");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigtimedwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigtimedwait");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigtimedwait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sigtimedwait");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigtimedwait");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigtimedwait");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)set, (void*)(uintptr_t)info, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sigwaitinfo(JNIEnv* km_env, jclass km_clazz, jlong set, jlong info) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigwaitinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigwaitinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigwaitinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigwaitinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sigwaitinfo");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigwaitinfo");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigwaitinfo");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)set, (void*)(uintptr_t)info);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSetschedprio(JNIEnv* km_env, jclass km_clazz, jlong native, jint priority) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setschedprio");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setschedprio");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setschedprio");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setschedprio");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_setschedprio");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setschedprio");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setschedprio");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)native, (int32_t)priority);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ifNameindex(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "if_nameindex");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_if_nameindex");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "if_nameindex");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_if_nameindex");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "if_nameindex");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "if_nameindex");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "if_nameindex");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ifFreenameindex(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "if_freenameindex");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_if_freenameindex");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "if_freenameindex");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_if_freenameindex");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "if_freenameindex");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "if_freenameindex");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "if_freenameindex");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1glob(JNIEnv* km_env, jclass km_clazz, jstring pattern, jint flags, jlong errfunc, jlong pglob) {
    (void)km_env;
    (void)km_clazz;
    const char* pattern_utf = (pattern != NULL) ? (*km_env)->GetStringUTFChars(km_env, pattern, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "glob");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_glob");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "glob");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_glob");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "glob");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "glob");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "glob");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(pattern_utf, (int32_t)flags, (void*)(uintptr_t)errfunc, (void*)(uintptr_t)pglob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (pattern != NULL && pattern_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pattern, pattern_utf);
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1globfree(JNIEnv* km_env, jclass km_clazz, jlong pglob) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "globfree");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_globfree");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "globfree");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_globfree");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "globfree");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "globfree");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "globfree");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pglob);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixMadvise(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong len, jint advice) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_madvise");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_madvise");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_madvise");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_madvise");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "posix_madvise");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_madvise");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_madvise");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (uint64_t)len, (int32_t)advice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1shmUnlink(JNIEnv* km_env, jclass km_clazz, jstring name) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_unlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_unlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_unlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "shm_unlink");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "shm_unlink");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "shm_unlink");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1seekdir(JNIEnv* km_env, jclass km_clazz, jlong dirp, jlong loc) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "seekdir");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_seekdir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "seekdir");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_seekdir");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "seekdir");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "seekdir");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "seekdir");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)dirp, (int64_t)loc);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1telldir(JNIEnv* km_env, jclass km_clazz, jlong dirp) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "telldir");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_telldir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "telldir");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_telldir");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "telldir");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "telldir");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "telldir");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dirp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1msync(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong len, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "msync");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_msync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "msync");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_msync");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "msync");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "msync");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "msync");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (uint64_t)len, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1recvfrom(JNIEnv* km_env, jclass km_clazz, jint arg_0_socket, jlong buf, jlong len, jint flags, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "recvfrom");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_recvfrom");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "recvfrom");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_recvfrom");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "recvfrom");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "recvfrom");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "recvfrom");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_socket, (void*)(uintptr_t)buf, (uint64_t)len, (int32_t)flags, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mkstemps(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jint suffixlen) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkstemps");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mkstemps");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)arg_0_template, (int32_t)suffixlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getdomainname(JNIEnv* km_env, jclass km_clazz, jlong name, jlong len) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getdomainname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getdomainname");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setdomainname(JNIEnv* km_env, jclass km_clazz, jstring name, jlong len) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setdomainname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setdomainname");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sync(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sync");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sync");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sync");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sync");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sync");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sync");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadGetschedparam(JNIEnv* km_env, jclass km_clazz, jlong native, jlong policy, jlong param) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getschedparam");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1umount(JNIEnv* km_env, jclass km_clazz, jstring target, jint flags) {
    (void)km_env;
    (void)km_clazz;
    const char* target_utf = (target != NULL) ? (*km_env)->GetStringUTFChars(km_env, target, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "umount");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_umount");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "umount");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_umount");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "umount");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "umount");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "umount");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(target_utf, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (target != NULL && target_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, target, target_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedGetPriorityMax(JNIEnv* km_env, jclass km_clazz, jint policy) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_get_priority_max");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_get_priority_max");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_get_priority_max");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_get_priority_max");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_get_priority_max");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_get_priority_max");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_get_priority_max");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1settimeofday(JNIEnv* km_env, jclass km_clazz, jlong tv, jlong tz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "settimeofday");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_settimeofday");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "settimeofday");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_settimeofday");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "settimeofday");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "settimeofday");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "settimeofday");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tv, (void*)(uintptr_t)tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedRrGetInterval(JNIEnv* km_env, jclass km_clazz, jint pid, jlong tp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_rr_get_interval");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_rr_get_interval");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_rr_get_interval");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_rr_get_interval");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_rr_get_interval");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_rr_get_interval");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_rr_get_interval");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semTimedwait(JNIEnv* km_env, jclass km_clazz, jlong sem, jlong abstime) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_timedwait");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_timedwait");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semGetvalue(JNIEnv* km_env, jclass km_clazz, jlong sem, jlong sval) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_getvalue");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_getvalue");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedSetparam(JNIEnv* km_env, jclass km_clazz, jint pid, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_setparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_setparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_setparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_setparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_setparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_setparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_setparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mount(JNIEnv* km_env, jclass km_clazz, jstring special_device, jstring mount_directory, jint flags, jstring mount_type, jlong mount_data, jint mount_datalen) {
    (void)km_env;
    (void)km_clazz;
    const char* special_device_utf = (special_device != NULL) ? (*km_env)->GetStringUTFChars(km_env, special_device, NULL) : NULL;
    const char* mount_directory_utf = (mount_directory != NULL) ? (*km_env)->GetStringUTFChars(km_env, mount_directory, NULL) : NULL;
    const char* mount_type_utf = (mount_type != NULL) ? (*km_env)->GetStringUTFChars(km_env, mount_type, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, const char*, void*, int32_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mount");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mount");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(special_device_utf, mount_directory_utf, (int32_t)flags, mount_type_utf, (void*)(uintptr_t)mount_data, (int32_t)mount_datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (special_device != NULL && special_device_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, special_device, special_device_utf);
    if (mount_directory != NULL && mount_directory_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, mount_directory, mount_directory_utf);
    if (mount_type != NULL && mount_type_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, mount_type, mount_type_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedGetparam(JNIEnv* km_env, jclass km_clazz, jint pid, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getparam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getparam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getparam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_getparam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_getparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_getparam");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexConsistent(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutex_consistent");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutex_consistent");
        }
#endif
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexTimedlock(JNIEnv* km_env, jclass km_clazz, jlong lock, jlong abstime) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutex_timedlock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutex_timedlock");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSpinInit(JNIEnv* km_env, jclass km_clazz, jlong lock, jint pshared) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_init");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSpinDestroy(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_destroy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSpinLock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_lock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_lock");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSpinTrylock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_trylock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_trylock");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSpinUnlock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_unlock");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_spin_unlock");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierattrInit(JNIEnv* km_env, jclass km_clazz, jlong arg_0_attr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrierattr_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierattrDestroy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_attr) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrierattr_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierattrGetpshared(JNIEnv* km_env, jclass km_clazz, jlong arg_0_attr, jlong arg_1_pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_getpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_getpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_getpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrierattr_getpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_getpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_getpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_attr, (void*)(uintptr_t)arg_1_pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierattrSetpshared(JNIEnv* km_env, jclass km_clazz, jlong arg_0_attr, jint arg_1_pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_setpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_setpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_setpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrierattr_setpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_setpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrierattr_setpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_attr, (int32_t)arg_1_pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierInit(JNIEnv* km_env, jclass km_clazz, jlong arg_0_barrier, jlong arg_1_attr, jint arg_2_count) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrier_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_init");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_barrier, (void*)(uintptr_t)arg_1_attr, (uint32_t)arg_2_count);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierDestroy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_barrier) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_destroy");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_destroy");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_destroy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrier_destroy");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_destroy");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadBarrierWait(JNIEnv* km_env, jclass km_clazz, jlong arg_0_barrier) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_wait");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_wait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_wait");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_wait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_barrier_wait");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_wait");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_barrier_wait");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedGetscheduler(JNIEnv* km_env, jclass km_clazz, jint pid) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getscheduler");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getscheduler");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getscheduler");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getscheduler");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_getscheduler");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_getscheduler");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_getscheduler");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1clockNanosleep(JNIEnv* km_env, jclass km_clazz, jint clk_id, jint flags, jlong rqtp, jlong rmtp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_nanosleep");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_nanosleep");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_nanosleep");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_nanosleep");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_nanosleep");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_nanosleep");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "clock_nanosleep");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)clk_id, (int32_t)flags, (void*)(uintptr_t)rqtp, (void*)(uintptr_t)rmtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadAttrGetguardsize(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong guardsize) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getguardsize");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_getguardsize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getguardsize");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_getguardsize");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_getguardsize");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_getguardsize");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_getguardsize");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadAttrSetguardsize(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong guardsize) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_setguardsize");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_setguardsize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_setguardsize");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_setguardsize");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_setguardsize");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_setguardsize");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_attr_setguardsize");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (uint64_t)guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sethostname(JNIEnv* km_env, jclass km_clazz, jstring name, jlong len) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sethostname");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sethostname");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedGetPriorityMin(JNIEnv* km_env, jclass km_clazz, jint policy) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_get_priority_min");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_get_priority_min");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_get_priority_min");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_get_priority_min");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_get_priority_min");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_get_priority_min");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_get_priority_min");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCondattrGetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_getpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_getpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_getpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_condattr_getpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_getpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_condattr_getpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSetschedparam(JNIEnv* km_env, jclass km_clazz, jlong native, jint policy, jlong param) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setschedparam");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1schedSetscheduler(JNIEnv* km_env, jclass km_clazz, jint pid, jint policy, jlong param) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_setscheduler");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_setscheduler");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_setscheduler");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_setscheduler");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sched_setscheduler");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_setscheduler");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sched_setscheduler");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pid, (int32_t)policy, (void*)(uintptr_t)param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sigsuspend(JNIEnv* km_env, jclass km_clazz, jlong mask) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigsuspend");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigsuspend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigsuspend");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigsuspend");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sigsuspend");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigsuspend");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigsuspend");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrgidR(JNIEnv* km_env, jclass km_clazz, jshort gid, jlong grp, jlong buf, jlong buflen, jlong result) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrgid_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrgid_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrgid_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrgid_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrgid_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrgid_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrgid_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)gid, (void*)(uintptr_t)grp, (char*)(uintptr_t)buf, (uint64_t)buflen, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semClose(JNIEnv* km_env, jclass km_clazz, jlong sem) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_close");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_close");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_close");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_close");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_close");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getdtablesize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getdtablesize");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getdtablesize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getdtablesize");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getdtablesize");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getdtablesize");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getdtablesize");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getdtablesize");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrnamR(JNIEnv* km_env, jclass km_clazz, jstring name, jlong grp, jlong buf, jlong buflen, jlong result) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrnam_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrnam_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrnam_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrnam_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrnam_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrnam_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrnam_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (void*)(uintptr_t)grp, (char*)(uintptr_t)buf, (uint64_t)buflen, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1initgroups(JNIEnv* km_env, jclass km_clazz, jstring user, jshort group) {
    (void)km_env;
    (void)km_clazz;
    const char* user_utf = (user != NULL) ? (*km_env)->GetStringUTFChars(km_env, user, NULL) : NULL;
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "initgroups");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "initgroups");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(user_utf, (uint16_t)group);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (user != NULL && user_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, user, user_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSigmask(JNIEnv* km_env, jclass km_clazz, jint how, jlong set, jlong oldset) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_sigmask");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_sigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_sigmask");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_sigmask");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_sigmask");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_sigmask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_sigmask");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)how, (void*)(uintptr_t)set, (void*)(uintptr_t)oldset);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semOpen(JNIEnv* km_env, jclass km_clazz, jstring name, jint oflag, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_open");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_open");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_open");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_open");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_open");
        }
#endif
    }
#endif
    void* km_res = NULL;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(name_utf, (int32_t)oflag); break;
            case 1: km_res = km_fn_ptr(name_utf, (int32_t)oflag, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr(name_utf, (int32_t)oflag, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr(name_utf, (int32_t)oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr(name_utf, (int32_t)oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrnam(JNIEnv* km_env, jclass km_clazz, jstring name) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrnam");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrnam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrnam");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrnam");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrnam");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrnam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrnam");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCancel(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_cancel");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_cancel");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_cancel");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_cancel");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_cancel");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_cancel");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_cancel");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadKill(JNIEnv* km_env, jclass km_clazz, jlong thread, jint sig) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_kill");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_kill");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_kill");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_kill");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_kill");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_kill");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_kill");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (int32_t)sig);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1semUnlink(JNIEnv* km_env, jclass km_clazz, jstring name) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_unlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_unlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_unlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_unlink");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_unlink");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sem_unlink");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1daemon(JNIEnv* km_env, jclass km_clazz, jint nochdir, jint noclose) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "daemon");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "daemon");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpwnamR(JNIEnv* km_env, jclass km_clazz, jstring name, jlong pwd, jlong buf, jlong buflen, jlong result) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwnam_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwnam_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwnam_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwnam_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpwnam_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwnam_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwnam_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(name_utf, (void*)(uintptr_t)pwd, (char*)(uintptr_t)buf, (uint64_t)buflen, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpwuidR(JNIEnv* km_env, jclass km_clazz, jshort uid, jlong pwd, jlong buf, jlong buflen, jlong result) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwuid_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwuid_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwuid_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwuid_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpwuid_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwuid_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwuid_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uid, (void*)(uintptr_t)pwd, (char*)(uintptr_t)buf, (uint64_t)buflen, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sigwait(JNIEnv* km_env, jclass km_clazz, jlong set, jlong sig) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigwait");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigwait");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigwait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sigwait");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigwait");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sigwait");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)set, (void*)(uintptr_t)sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadAtfork(JNIEnv* km_env, jclass km_clazz, jlong prepare, jlong parent, jlong child) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_atfork");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_atfork");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_atfork");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_atfork");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_atfork");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_atfork");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_atfork");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prepare, (void*)(uintptr_t)parent, (void*)(uintptr_t)child);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrgid(JNIEnv* km_env, jclass km_clazz, jshort gid) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrgid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrgid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrgid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrgid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getgrgid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrgid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrgid");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)gid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getgrouplist(JNIEnv* km_env, jclass km_clazz, jstring user, jshort group, jlong groups, jlong ngroups) {
    (void)km_env;
    (void)km_clazz;
    const char* user_utf = (user != NULL) ? (*km_env)->GetStringUTFChars(km_env, user, NULL) : NULL;
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrouplist");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getgrouplist");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(user_utf, (uint16_t)group, (void*)(uintptr_t)groups, (void*)(uintptr_t)ngroups);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (user != NULL && user_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, user, user_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexattrGetpshared(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong pshared) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_getpshared");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getpshared");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getpshared");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_mutexattr_getpshared");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_getpshared");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_getpshared");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexattrGetrobust(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong robustness) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_getrobust");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_getrobust");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (void*)(uintptr_t)robustness);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadMutexattrSetrobust(JNIEnv* km_env, jclass km_clazz, jlong attr, jint robustness) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_setrobust");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_mutexattr_setrobust");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)attr, (int32_t)robustness);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadCreate(JNIEnv* km_env, jclass km_clazz, jlong native, jlong attr, jlong f, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_create");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_create");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_create");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_create");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_create");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_create");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_create");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)native, (void*)(uintptr_t)attr, (void*)(uintptr_t)f, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getitimer(JNIEnv* km_env, jclass km_clazz, jint which, jlong curr_value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getitimer");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getitimer");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getitimer");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getitimer");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getitimer");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getitimer");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getitimer");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (void*)(uintptr_t)curr_value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setitimer(JNIEnv* km_env, jclass km_clazz, jint which, jlong value, jlong ovalue) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setitimer");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setitimer");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setitimer");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setitimer");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setitimer");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setitimer");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setitimer");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)which, (void*)(uintptr_t)value, (void*)(uintptr_t)ovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawn(JNIEnv* km_env, jclass km_clazz, jlong pid, jstring path, jlong file_actions, jlong attrp, jlong argv, jlong envp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnp(JNIEnv* km_env, jclass km_clazz, jlong pid, jstring file, jlong file_actions, jlong attrp, jlong argv, jlong envp) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnp");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrInit(JNIEnv* km_env, jclass km_clazz, jlong attr) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_init");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrDestroy(JNIEnv* km_env, jclass km_clazz, jlong attr) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_destroy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetsigdefault(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getsigdefault");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getsigdefault");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetsigdefault(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setsigdefault");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setsigdefault");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetsigmask(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getsigmask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getsigmask");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetsigmask(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong arg_1_default) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setsigmask");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setsigmask");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetflags(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getflags");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getflags");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetflags(JNIEnv* km_env, jclass km_clazz, jlong attr, jshort flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setflags");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setflags");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetpgroup(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getpgroup");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getpgroup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetpgroup(JNIEnv* km_env, jclass km_clazz, jlong attr, jint flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setpgroup");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setpgroup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetschedpolicy(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getschedpolicy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getschedpolicy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetschedpolicy(JNIEnv* km_env, jclass km_clazz, jlong attr, jint flags) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setschedpolicy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setschedpolicy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrGetschedparam(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong param) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_getschedparam");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnattrSetschedparam(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong param) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setschedparam");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawnattr_setschedparam");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnFileActionsInit(JNIEnv* km_env, jclass km_clazz, jlong actions) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_init");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnFileActionsDestroy(JNIEnv* km_env, jclass km_clazz, jlong actions) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_destroy");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_destroy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnFileActionsAddopen(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd, jstring path, jint oflag, jint mode) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_addopen");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_addopen");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnFileActionsAddclose(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_addclose");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_addclose");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1posixSpawnFileActionsAdddup2(JNIEnv* km_env, jclass km_clazz, jlong actions, jint fd, jint newfd) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_adddup2");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "posix_spawn_file_actions_adddup2");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1popen(JNIEnv* km_env, jclass km_clazz, jstring command, jstring mode) {
    (void)km_env;
    (void)km_clazz;
    const char* command_utf = (command != NULL) ? (*km_env)->GetStringUTFChars(km_env, command, NULL) : NULL;
    const char* mode_utf = (mode != NULL) ? (*km_env)->GetStringUTFChars(km_env, mode, NULL) : NULL;
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "popen");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_popen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "popen");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_popen");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "popen");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "popen");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "popen");
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(command_utf, mode_utf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    if (command != NULL && command_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, command, command_utf);
    if (mode != NULL && mode_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, mode, mode_utf);
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1faccessat(JNIEnv* km_env, jclass km_clazz, jint dirfd, jstring pathname, jint mode, jint flags) {
    (void)km_env;
    (void)km_clazz;
    const char* pathname_utf = (pathname != NULL) ? (*km_env)->GetStringUTFChars(km_env, pathname, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "faccessat");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_faccessat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "faccessat");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_faccessat");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "faccessat");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "faccessat");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "faccessat");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dirfd, pathname_utf, (int32_t)mode, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (pathname != NULL && pathname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pathname, pathname_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1inotifyRmWatch(JNIEnv* km_env, jclass km_clazz, jint fd, jint wd) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_rm_watch");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_rm_watch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_rm_watch");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_rm_watch");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "inotify_rm_watch");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_rm_watch");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_rm_watch");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, (int32_t)wd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1inotifyInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_init");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_init");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_init");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "inotify_init");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_init");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_init");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1inotifyAddWatch(JNIEnv* km_env, jclass km_clazz, jint fd, jstring path, jint mask) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_add_watch");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_add_watch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_add_watch");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_add_watch");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "inotify_add_watch");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_add_watch");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "inotify_add_watch");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fd, path_utf, (uint32_t)mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1gettid(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gettid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gettid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gettid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gettid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "gettid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "gettid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "gettid");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadGetcpuclockid(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong clk_id) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getcpuclockid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getcpuclockid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getcpuclockid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getcpuclockid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_getcpuclockid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getcpuclockid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getcpuclockid");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)clk_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getnameinfo(JNIEnv* km_env, jclass km_clazz, jlong sa, jint salen, jlong host, jint hostlen, jlong serv, jint servlen, jint flags) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, char*, uint32_t, char*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getnameinfo");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getnameinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getnameinfo");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getnameinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getnameinfo");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getnameinfo");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getnameinfo");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sa, (uint32_t)salen, (char*)(uintptr_t)host, (uint32_t)hostlen, (char*)(uintptr_t)serv, (uint32_t)servlen, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mallopt(JNIEnv* km_env, jclass km_clazz, jint param, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallopt");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallopt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallopt");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallopt");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mallopt");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mallopt");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mallopt");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)param, (int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1gettimeofday(JNIEnv* km_env, jclass km_clazz, jlong tp, jlong tz) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gettimeofday");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gettimeofday");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gettimeofday");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gettimeofday");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "gettimeofday");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "gettimeofday");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "gettimeofday");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tp, (void*)(uintptr_t)tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ctermid(JNIEnv* km_env, jclass km_clazz, jlong s) {
    (void)km_env;
    (void)km_clazz;
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ctermid");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ctermid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ctermid");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ctermid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ctermid");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ctermid");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ctermid");
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((char*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1ioctl(JNIEnv* km_env, jclass km_clazz, jint fd, jint request, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ioctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ioctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ioctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ioctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "ioctl");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ioctl");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "ioctl");
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)fd, (int32_t)request); break;
            case 1: km_res = km_fn_ptr((int32_t)fd, (int32_t)request, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)fd, (int32_t)request, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)fd, (int32_t)request, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)fd, (int32_t)request, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getpwentR(JNIEnv* km_env, jclass km_clazz, jlong pwd, jlong buf, jint arg_2_bufsize, jlong arg_3_result) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, char*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwent_r");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwent_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwent_r");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwent_r");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getpwent_r");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwent_r");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getpwent_r");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwd, (char*)(uintptr_t)buf, (int32_t)arg_2_bufsize, (void*)(uintptr_t)arg_3_result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadGetnameNp(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong name, jint len) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getname_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getname_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getname_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getname_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_getname_np");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getname_np");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_getname_np");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (char*)(uintptr_t)name, (int32_t)len);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1pthreadSetnameNp(JNIEnv* km_env, jclass km_clazz, jlong thread, jstring name) {
    (void)km_env;
    (void)km_clazz;
    const char* name_utf = (name != NULL) ? (*km_env)->GetStringUTFChars(km_env, name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setname_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setname_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setname_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setname_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_setname_np");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setname_np");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "pthread_setname_np");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, name_utf);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    if (name != NULL && name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, name, name_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1sysctl(JNIEnv* km_env, jclass km_clazz, jlong arg0, jint arg1, jlong arg2, jlong arg3, jlong arg4, jlong arg5) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sysctl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sysctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sysctl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sysctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sysctl");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sysctl");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "sysctl");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0, (uint32_t)arg1, (void*)(uintptr_t)arg2, (void*)(uintptr_t)arg3, (void*)(uintptr_t)arg4, (uint64_t)arg5);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getrlimit(JNIEnv* km_env, jclass km_clazz, jint resource, jlong rlim) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getrlimit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getrlimit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getrlimit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getrlimit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getrlimit");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getrlimit");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "getrlimit");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)resource, (void*)(uintptr_t)rlim);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1setrlimit(JNIEnv* km_env, jclass km_clazz, jint resource, jlong rlp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setrlimit");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setrlimit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setrlimit");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setrlimit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "setrlimit");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setrlimit");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "setrlimit");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)resource, (void*)(uintptr_t)rlp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1lioListio(JNIEnv* km_env, jclass km_clazz, jint arg_0_mode, jlong arg_1_list, jint arg_2_nent, jlong arg_3_sig) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "lio_listio");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "lio_listio");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_mode, (void*)(uintptr_t)arg_1_list, (int32_t)arg_2_nent, (void*)(uintptr_t)arg_3_sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1dlIteratePhdr(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong data) {
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
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dl_iterate_phdr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dl_iterate_phdr");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1memsetS(JNIEnv* km_env, jclass km_clazz, jlong s, jlong smax, jint c, jlong n) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memset_s");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memset_s");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memset_s");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memset_s");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "memset_s");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "memset_s");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "memset_s");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (uint64_t)smax, (int32_t)c, (uint64_t)n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1regcomp(JNIEnv* km_env, jclass km_clazz, jlong arg_0_preg, jstring arg_1_pattern, jint arg_2_cflags) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_1_pattern_utf = (arg_1_pattern != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_1_pattern, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regcomp");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regcomp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regcomp");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regcomp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "regcomp");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regcomp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regcomp");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_preg, arg_1_pattern_utf, (int32_t)arg_2_cflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (arg_1_pattern != NULL && arg_1_pattern_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_1_pattern, arg_1_pattern_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1regexec(JNIEnv* km_env, jclass km_clazz, jlong arg_0_preg, jstring arg_1_str, jlong arg_2_nmatch, jlong arg_3_pmatch, jint arg_4_eflags) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_1_str_utf = (arg_1_str != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_1_str, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regexec");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regexec");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regexec");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regexec");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "regexec");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regexec");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regexec");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_preg, arg_1_str_utf, (uint64_t)arg_2_nmatch, (void*)(uintptr_t)arg_3_pmatch, (int32_t)arg_4_eflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (arg_1_str != NULL && arg_1_str_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_1_str, arg_1_str_utf);
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1regerror(JNIEnv* km_env, jclass km_clazz, jint arg_0_errcode, jlong arg_1_preg, jlong arg_2_errbuf, jlong arg_3_errbuf_size) {
    (void)km_env;
    (void)km_clazz;
    typedef uint64_t (*km_fn_t)(int32_t, void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regerror");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regerror");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regerror");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regerror");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "regerror");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regerror");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regerror");
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_errcode, (void*)(uintptr_t)arg_1_preg, (char*)(uintptr_t)arg_2_errbuf, (uint64_t)arg_3_errbuf_size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1regfree(JNIEnv* km_env, jclass km_clazz, jlong arg_0_preg) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regfree");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regfree");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regfree");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regfree");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "regfree");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regfree");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "regfree");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)arg_0_preg);
    } else {
        errno = ENOSYS;
    }
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1dirfd(JNIEnv* km_env, jclass km_clazz, jlong arg_0_dirp) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dirfd");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dirfd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dirfd");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dirfd");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dirfd");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dirfd");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dirfd");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_dirp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1dircntl(JNIEnv* km_env, jclass km_clazz, jlong dir, jint cmd, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dircntl");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dircntl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dircntl");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dircntl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dircntl");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dircntl");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "dircntl");
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)dir, (int32_t)cmd); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)dir, (int32_t)cmd, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)dir, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)dir, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)dir, (int32_t)cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioCancel(JNIEnv* km_env, jclass km_clazz, jint arg_0_fd, jlong arg_1_aiocbp) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_cancel");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_cancel");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_fd, (void*)(uintptr_t)arg_1_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioError(JNIEnv* km_env, jclass km_clazz, jlong arg_0_aiocbp) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_error");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_error");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioFsync(JNIEnv* km_env, jclass km_clazz, jint arg_0_operation, jlong arg_1_aiocbp) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_fsync");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_fsync");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)arg_0_operation, (void*)(uintptr_t)arg_1_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioRead(JNIEnv* km_env, jclass km_clazz, jlong arg_0_aiocbp) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_read");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_read");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioReturn(JNIEnv* km_env, jclass km_clazz, jlong arg_0_aiocpb) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_return");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_return");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioSuspend(JNIEnv* km_env, jclass km_clazz, jlong arg_0_list, jint arg_1_nent, jlong arg_2_timeout) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_suspend");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_suspend");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_list, (int32_t)arg_1_nent, (void*)(uintptr_t)arg_2_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1aioWrite(JNIEnv* km_env, jclass km_clazz, jlong arg_0_aiocpb) {
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
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_write");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "aio_write");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqClose(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_close");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_close");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_close");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_close");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_close");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqGetattr(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jlong arg_1_mqstat) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_getattr");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_getattr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_getattr");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_getattr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_getattr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_getattr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_getattr");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, (void*)(uintptr_t)arg_1_mqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqNotify(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jlong arg_1_notification) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_notify");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_notify");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_notify");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_notify");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_notify");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_notify");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_notify");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, (void*)(uintptr_t)arg_1_notification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqOpen(JNIEnv* km_env, jclass km_clazz, jstring arg_0_name, jint arg_1_oflag, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_0_name_utf = (arg_0_name != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_0_name, NULL) : NULL;
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_open");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_open");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_open");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_open");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_open");
        }
#endif
    }
#endif
    void* km_res = NULL;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg_0_name_utf, (int32_t)arg_1_oflag); break;
            case 1: km_res = km_fn_ptr(arg_0_name_utf, (int32_t)arg_1_oflag, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr(arg_0_name_utf, (int32_t)arg_1_oflag, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr(arg_0_name_utf, (int32_t)arg_1_oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr(arg_0_name_utf, (int32_t)arg_1_oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
    if (arg_0_name != NULL && arg_0_name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_0_name, arg_0_name_utf);
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqReceive(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jlong arg_1_msg_ptr, jlong arg_2_msg_len, jlong arg_3_msg_prio) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_receive");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_receive");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_receive");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_receive");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_receive");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_receive");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_receive");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, (char*)(uintptr_t)arg_1_msg_ptr, (uint64_t)arg_2_msg_len, (void*)(uintptr_t)arg_3_msg_prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqSend(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jstring arg_1_msg_ptr, jlong arg_2_msg_len, jint arg_3_msg_prio) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_1_msg_ptr_utf = (arg_1_msg_ptr != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_1_msg_ptr, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_send");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_send");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_send");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_send");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_send");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_send");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_send");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, arg_1_msg_ptr_utf, (uint64_t)arg_2_msg_len, (uint32_t)arg_3_msg_prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (arg_1_msg_ptr != NULL && arg_1_msg_ptr_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_1_msg_ptr, arg_1_msg_ptr_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqSetattr(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jlong arg_1_mqstat, jlong arg_2_omqstat) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_setattr");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_setattr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_setattr");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_setattr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_setattr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_setattr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_setattr");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, (void*)(uintptr_t)arg_1_mqstat, (void*)(uintptr_t)arg_2_omqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqTimedreceive(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jlong arg_1_msg_ptr, jlong arg_2_msg_len, jlong arg_3_msg_prio, jlong arg_4_abs_timeout) {
    (void)km_env;
    (void)km_clazz;
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_timedreceive");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_timedreceive");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_timedreceive");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_timedreceive");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_timedreceive");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_timedreceive");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_timedreceive");
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, (char*)(uintptr_t)arg_1_msg_ptr, (uint64_t)arg_2_msg_len, (void*)(uintptr_t)arg_3_msg_prio, (void*)(uintptr_t)arg_4_abs_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqTimedsend(JNIEnv* km_env, jclass km_clazz, jlong arg_0_mqdes, jstring arg_1_msg_ptr, jlong arg_2_msg_len, jint arg_3_msg_prio, jlong arg_4_abs_timeout) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_1_msg_ptr_utf = (arg_1_msg_ptr != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_1_msg_ptr, NULL) : NULL;
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_timedsend");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_timedsend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_timedsend");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_timedsend");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_timedsend");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_timedsend");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_timedsend");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_mqdes, arg_1_msg_ptr_utf, (uint64_t)arg_2_msg_len, (uint32_t)arg_3_msg_prio, (void*)(uintptr_t)arg_4_abs_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (arg_1_msg_ptr != NULL && arg_1_msg_ptr_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_1_msg_ptr, arg_1_msg_ptr_utf);
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1mqUnlink(JNIEnv* km_env, jclass km_clazz, jstring arg_0_name) {
    (void)km_env;
    (void)km_clazz;
    const char* arg_0_name_utf = (arg_0_name != NULL) ? (*km_env)->GetStringUTFChars(km_env, arg_0_name, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_unlink");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_unlink");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_unlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mq_unlink");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_unlink");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "mq_unlink");
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr(arg_0_name_utf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    if (arg_0_name != NULL && arg_0_name_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, arg_0_name, arg_0_name_utf);
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1getErrnoPtr(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__get_errno_ptr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__get_errno_ptr");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__get_errno_ptr");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "__get_errno_ptr");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "__get_errno_ptr");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_nto_UnixNtoJniBridge_libc_1unix_1nto_1myThreadExit(JNIEnv* km_env, jclass km_clazz, jlong value_ptr) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__my_thread_exit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__my_thread_exit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__my_thread_exit");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "__my_thread_exit");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_socket = NULL;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_socket, "__my_thread_exit");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)value_ptr);
    } else {
        errno = ENOSYS;
    }
}

