#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "unix_nto_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#include <sys/mman.h>
#endif
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

void* libcUnixNtoGetSYSPAGEPTR(void) {
    static void** km_sym_ptr = NULL;
#ifdef _WIN32
    if (km_sym_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_msvcrt, "_syspage_ptr");
        if (km_sym_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_ucrt, "_syspage_ptr");
        }
    }
#else
    if (km_sym_ptr == NULL) {
        km_sym_ptr = (void**)dlsym(RTLD_DEFAULT, "_syspage_ptr");
    }
#endif
    if (km_sym_ptr != NULL) {
        return *km_sym_ptr;
    }
    return NULL;
}

void libcUnixNtoSetSYSPAGEPTR(void* km_val) {
    static void** km_sym_ptr = NULL;
#ifdef _WIN32
    if (km_sym_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_msvcrt, "_syspage_ptr");
        if (km_sym_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_sym_ptr = (void**)(void*)GetProcAddress(km_h_ucrt, "_syspage_ptr");
        }
    }
#else
    if (km_sym_ptr == NULL) {
        km_sym_ptr = (void**)dlsym(RTLD_DEFAULT, "_syspage_ptr");
    }
#endif
    if (km_sym_ptr != NULL) {
        *km_sym_ptr = km_val;
    }
}

int32_t libcUnixNtoSendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags) {
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sendmmsg");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sendmmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sendmmsg");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sendmmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sendmmsg");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sockfd, msgvec, vlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoRecvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout) {
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "recvmmsg");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_recvmmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "recvmmsg");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_recvmmsg");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "recvmmsg");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sockfd, msgvec, vlen, flags, timeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSemDestroy(void* sem) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSemInit(void* sem, int32_t pshared, uint32_t value) {
    typedef int32_t (*km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, pshared, value);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoFdatasync(int32_t fd) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fdatasync");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fdatasync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fdatasync");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fdatasync");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetpriority(int32_t which, int32_t who) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpriority");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpriority");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpriority");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpriority");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, who);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSetpriority(int32_t which, int32_t who, int32_t prio) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setpriority");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setpriority");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setpriority");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setpriority");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, who, prio);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkfifoat");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkfifoat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkfifoat");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkfifoat");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, pathname, mode);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMknodat(int32_t fd, const char* pathname, uint32_t mode, uint32_t dev) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mknodat");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mknodat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mknodat");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mknodat");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, pathname, mode, dev);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoClockGetres(int32_t clkId, void* tp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getres");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getres");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getres");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getres");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clkId, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoClockGettime(int32_t clkId, void* tp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_gettime");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_gettime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_gettime");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_gettime");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clkId, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoClockSettime(int32_t clkId, void* tp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_settime");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_settime");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_settime");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_settime");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clkId, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoClockGetcpuclockid(int32_t pid, void* clkId) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getcpuclockid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getcpuclockid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getcpuclockid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getcpuclockid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, clkId);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getstack");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_getstack");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getstack");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_getstack");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, stackaddr, stacksize);
    }
    errno = ENOSYS;
    return ENOSYS;
}

void* libcUnixNtoMemalign(uint64_t align, uint64_t size) {
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memalign");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memalign");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memalign");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memalign");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(align, size);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoSetgroups(int32_t ngroups, void* ptr) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setgroups");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setgroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setgroups");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setgroups");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ngroups, ptr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixFadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_fadvise");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_fadvise");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_fadvise");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_fadvise");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, offset, len, advise);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoFutimens(int32_t fd, void* times) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "futimens");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_futimens");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "futimens");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_futimens");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, times);
    }
    errno = ENOSYS;
    return -1;
}

char* libcUnixNtoNlLanginfo(int32_t item) {
    typedef char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "nl_langinfo");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_nl_langinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "nl_langinfo");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_nl_langinfo");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(item);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoUtimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "utimensat");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_utimensat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "utimensat");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_utimensat");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, path, times, flag);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadCondattrGetclock(void* attr, void* clockId) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_getclock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_getclock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_getclock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_getclock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, clockId);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadCondattrSetclock(void* attr, int32_t clockId) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_setclock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_setclock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_setclock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_setclock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, clockId);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadCondattrSetpshared(void* attr, int32_t pshared) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_setpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_setpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_setpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadMutexattrSetpshared(void* attr, int32_t pshared) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_setpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadRwlockattrGetpshared(void* attr, void* val) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_getpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_rwlockattr_getpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_getpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, val);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadRwlockattrSetpshared(void* attr, int32_t val) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_setpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_rwlockattr_setpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_setpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, val);
    }
    errno = ENOSYS;
    return ENOSYS;
}

char* libcUnixNtoPtsnameR(int32_t fd, char* buf, uint64_t buflen) {
    typedef char* (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ptsname_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ptsname_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ptsname_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ptsname_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoClearenv(void) {
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clearenv");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clearenv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clearenv");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clearenv");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoWaitid(uint32_t idtype, int32_t id, void* infop, int32_t options) {
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "waitid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_waitid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "waitid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_waitid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idtype, id, infop, options);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoWait4(int32_t pid, void* status, int32_t options, void* rusage) {
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "wait4");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_wait4");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "wait4");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_wait4");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, status, options, rusage);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoExecvpe(const char* file, void* argv, void* envp) {
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "execvpe");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_execvpe");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "execvpe");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_execvpe");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetifaddrs(void* ifap) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getifaddrs");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getifaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getifaddrs");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getifaddrs");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifap);
    }
    errno = ENOSYS;
    return -1;
}

void libcUnixNtoFreeifaddrs(void* ifa) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "freeifaddrs");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_freeifaddrs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "freeifaddrs");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_freeifaddrs");
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
        km_fn_ptr(ifa);
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoBind(int32_t arg0Socket, void* address, uint32_t addressLen) {
    return (int32_t)bind(arg0Socket, address, addressLen);
}

int64_t libcUnixNtoWritev(int32_t fd, void* iov, int32_t iovcnt) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "writev");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_writev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "writev");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_writev");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libcUnixNtoReadv(int32_t fd, void* iov, int32_t iovcnt) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "readv");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_readv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "readv");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_readv");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libcUnixNtoSendmsg(int32_t fd, void* msg, int32_t flags) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sendmsg");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sendmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sendmsg");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sendmsg");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, msg, flags);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libcUnixNtoRecvmsg(int32_t fd, void* msg, int32_t flags) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "recvmsg");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_recvmsg");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "recvmsg");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_recvmsg");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, msg, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    typedef int32_t (*km_fn_t)(void*, void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "openpty");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_openpty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "openpty");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_openpty");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(amaster, aslave, name, termp, winp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoForkpty(void* amaster, char* name, void* termp, void* winp) {
    typedef int32_t (*km_fn_t)(void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "forkpty");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_forkpty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "forkpty");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_forkpty");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(amaster, name, termp, winp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoLoginTty(int32_t fd) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "login_tty");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_login_tty");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "login_tty");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_login_tty");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoUname(void* buf) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "uname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_uname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "uname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_uname");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buf);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetpeereid(int32_t arg0Socket, void* euid, void* egid) {
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpeereid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpeereid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpeereid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpeereid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Socket, euid, egid);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoStrerrorR(int32_t errnum, char* buf, uint64_t buflen) {
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strerror_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strerror_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strerror_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strerror_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errnum, buf, buflen);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAbs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libcUnixNtoLabs(int64_t i) {
    typedef int64_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "labs");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_labs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "labs");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_labs");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoRand(void) {
    return (int32_t)rand();
}

void libcUnixNtoSrand(uint32_t seed) {
    srand(seed);
}

void libcUnixNtoSetpwent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setpwent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setpwent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setpwent");
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
        return;
    }
    errno = ENOSYS;
}

void libcUnixNtoEndpwent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endpwent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endpwent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endpwent");
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
        return;
    }
    errno = ENOSYS;
}

void* libcUnixNtoGetpwent(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwent");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

void libcUnixNtoSetgrent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setgrent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setgrent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setgrent");
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
        return;
    }
    errno = ENOSYS;
}

void libcUnixNtoEndgrent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endgrent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endgrent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endgrent");
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
        return;
    }
    errno = ENOSYS;
}

void* libcUnixNtoGetgrent(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrent");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

void libcUnixNtoSetspent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setspent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setspent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setspent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setspent");
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
        return;
    }
    errno = ENOSYS;
}

void libcUnixNtoEndspent(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "endspent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_endspent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "endspent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_endspent");
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
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoShmOpen(const char* name, int32_t oflag, uint32_t mode) {
    typedef int32_t (*km_fn_t)(const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_open");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_open");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_open");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, oflag, mode);
    }
    errno = ENOSYS;
    return -1;
}

uint32_t libcUnixNtoFtok(const char* pathname, int32_t projId) {
    typedef uint32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ftok");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ftok");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ftok");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ftok");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pathname, projId);
    }
    errno = ENOSYS;
    return 0;
}

int32_t libcUnixNtoMprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libcUnixNtoPosixFallocate(int32_t fd, int64_t offset, int64_t len) {
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_fallocate");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_fallocate");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_fallocate");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_fallocate");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, offset, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMkostemp(char* arg0Template, int32_t flags) {
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkostemp");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkostemp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkostemp");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkostemp");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Template, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMkostemps(char* arg0Template, int32_t suffixlen, int32_t flags) {
    typedef int32_t (*km_fn_t)(char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkostemps");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkostemps");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkostemps");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkostemps");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Template, suffixlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSigtimedwait(void* set, void* info, void* timeout) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigtimedwait");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigtimedwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigtimedwait");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigtimedwait");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, info, timeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSigwaitinfo(void* set, void* info) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigwaitinfo");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigwaitinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigwaitinfo");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigwaitinfo");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, info);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadSetschedprio(void* native, int32_t priority) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setschedprio");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setschedprio");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setschedprio");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setschedprio");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, priority);
    }
    errno = ENOSYS;
    return ENOSYS;
}

void* libcUnixNtoIfNameindex(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "if_nameindex");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_if_nameindex");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "if_nameindex");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_if_nameindex");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

void libcUnixNtoIfFreenameindex(void* ptr) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "if_freenameindex");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_if_freenameindex");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "if_freenameindex");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_if_freenameindex");
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
        km_fn_ptr(ptr);
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoGlob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    typedef int32_t (*km_fn_t)(const char*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "glob");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_glob");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "glob");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_glob");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, flags, errfunc, pglob);
    }
    errno = ENOSYS;
    return -1;
}

void libcUnixNtoGlobfree(void* pglob) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "globfree");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_globfree");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "globfree");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_globfree");
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
        km_fn_ptr(pglob);
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoPosixMadvise(void* addr, uint64_t len, int32_t advice) {
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_madvise");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_madvise");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_madvise");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_madvise");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, len, advice);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoShmUnlink(const char* name) {
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shm_unlink");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shm_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shm_unlink");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shm_unlink");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return -1;
}

void libcUnixNtoSeekdir(void* dirp, int64_t loc) {
    typedef void (*km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "seekdir");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_seekdir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "seekdir");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_seekdir");
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
        km_fn_ptr(dirp, loc);
        return;
    }
    errno = ENOSYS;
}

int64_t libcUnixNtoTelldir(void* dirp) {
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "telldir");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_telldir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "telldir");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_telldir");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMsync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libcUnixNtoRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(arg0Socket, buf, len, flags, addr, addrlen);
}

int32_t libcUnixNtoMkstemps(char* arg0Template, int32_t suffixlen) {
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkstemps");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkstemps");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkstemps");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkstemps");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Template, suffixlen);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetdomainname(char* name, uint64_t len) {
    typedef int32_t (*km_fn_t)(char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getdomainname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getdomainname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getdomainname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getdomainname");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSetdomainname(const char* name, uint64_t len) {
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setdomainname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setdomainname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setdomainname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setdomainname");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

void libcUnixNtoSync(void) {
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sync");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sync");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sync");
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
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoPthreadGetschedparam(void* native, void* policy, void* param) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getschedparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getschedparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getschedparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, policy, param);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoUmount(const char* target, int32_t flags) {
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "umount");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_umount");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "umount");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_umount");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSchedGetPriorityMax(int32_t policy) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_get_priority_max");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_get_priority_max");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_get_priority_max");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_get_priority_max");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSettimeofday(void* tv, void* tz) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "settimeofday");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_settimeofday");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "settimeofday");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_settimeofday");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tv, tz);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSchedRrGetInterval(int32_t pid, void* tp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_rr_get_interval");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_rr_get_interval");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_rr_get_interval");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_rr_get_interval");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSemTimedwait(void* sem, void* abstime) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_timedwait");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_timedwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_timedwait");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_timedwait");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, abstime);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSemGetvalue(void* sem, void* sval) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_getvalue");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_getvalue");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_getvalue");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_getvalue");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, sval);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSchedSetparam(int32_t pid, void* param) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_setparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_setparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_setparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_setparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMount(const char* specialDevice, const char* mountDirectory, int32_t flags, const char* mountType, void* mountData, int32_t mountDatalen) {
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mount");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mount");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mount");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mount");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(specialDevice, mountDirectory, flags, mountType, mountData, mountDatalen);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSchedGetparam(int32_t pid, void* param) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadMutexConsistent(void* mutex) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutex_consistent");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutex_consistent");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutex_consistent");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutex_consistent");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutex);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadMutexTimedlock(void* lock, void* abstime) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutex_timedlock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutex_timedlock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutex_timedlock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutex_timedlock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock, abstime);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSpinInit(void* lock, int32_t pshared) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSpinDestroy(void* lock) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSpinLock(void* lock) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_lock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_lock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_lock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_lock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSpinTrylock(void* lock) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_trylock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_trylock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_trylock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_trylock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSpinUnlock(void* lock) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_spin_unlock");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_spin_unlock");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_spin_unlock");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_spin_unlock");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierattrInit(void* attr) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierattrDestroy(void* attr) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierattrGetpshared(void* attr, void* pshared) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_getpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_getpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_getpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierattrSetpshared(void* attr, int32_t pshared) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrierattr_setpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_setpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrierattr_setpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrierattr_setpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierInit(void* barrier, void* attr, uint32_t count) {
    typedef int32_t (*km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(barrier, attr, count);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierDestroy(void* barrier) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(barrier);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadBarrierWait(void* barrier) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_barrier_wait");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_barrier_wait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_barrier_wait");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_barrier_wait");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(barrier);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoSchedGetscheduler(int32_t pid) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_getscheduler");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_getscheduler");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_getscheduler");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_getscheduler");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoClockNanosleep(int32_t clkId, int32_t flags, void* rqtp, void* rmtp) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_nanosleep");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_nanosleep");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_nanosleep");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_nanosleep");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clkId, flags, rqtp, rmtp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadAttrGetguardsize(void* attr, void* guardsize) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getguardsize");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_getguardsize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getguardsize");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_getguardsize");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, guardsize);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadAttrSetguardsize(void* attr, uint64_t guardsize) {
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_setguardsize");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_setguardsize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_setguardsize");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_setguardsize");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, guardsize);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoSethostname(const char* name, uint64_t len) {
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sethostname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sethostname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sethostname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sethostname");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSchedGetPriorityMin(int32_t policy) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_get_priority_min");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_get_priority_min");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_get_priority_min");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_get_priority_min");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadCondattrGetpshared(void* attr, void* pshared) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_condattr_getpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_condattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_condattr_getpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_condattr_getpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSetschedparam(void* native, int32_t policy, void* param) {
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setschedparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setschedparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setschedparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, policy, param);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoSchedSetscheduler(int32_t pid, int32_t policy, void* param) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sched_setscheduler");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sched_setscheduler");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sched_setscheduler");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sched_setscheduler");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, policy, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSigsuspend(void* mask) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigsuspend");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigsuspend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigsuspend");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigsuspend");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mask);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrgid_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrgid_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrgid_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrgid_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid, grp, buf, buflen, result);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSemClose(void* sem) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_close");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_close");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_close");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetdtablesize(void) {
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getdtablesize");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getdtablesize");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getdtablesize");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getdtablesize");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrnam_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrnam_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrnam_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrnam_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, grp, buf, buflen, result);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoInitgroups(const char* user, uint16_t group) {
    typedef int32_t (*km_fn_t)(const char*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "initgroups");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_initgroups");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "initgroups");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_initgroups");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, group);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadSigmask(int32_t how, void* set, void* oldset) {
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_sigmask");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_sigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_sigmask");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_sigmask");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(how, set, oldset);
    }
    errno = ENOSYS;
    return ENOSYS;
}

void* libcUnixNtoSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_open");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_open");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_open");
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
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(name, oflag);
            case 1: return km_fn_ptr(name, oflag, (intptr_t)km_va0);
            case 2: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return NULL;
}

void* libcUnixNtoGetgrnam(const char* name) {
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrnam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrnam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrnam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrnam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoPthreadCancel(void* thread) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_cancel");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_cancel");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_cancel");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_cancel");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadKill(void* thread, int32_t sig) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_kill");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_kill");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_kill");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_kill");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, sig);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoSemUnlink(const char* name) {
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_unlink");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_unlink");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_unlink");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoDaemon(int32_t nochdir, int32_t noclose) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "daemon");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_daemon");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "daemon");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_daemon");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nochdir, noclose);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwnam_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwnam_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwnam_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwnam_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, pwd, buf, buflen, result);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwuid_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwuid_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwuid_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwuid_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uid, pwd, buf, buflen, result);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSigwait(void* set, void* sig) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sigwait");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sigwait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sigwait");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sigwait");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, sig);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadAtfork(void* prepare, void* parent, void* child) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_atfork");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_atfork");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_atfork");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_atfork");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prepare, parent, child);
    }
    errno = ENOSYS;
    return ENOSYS;
}

void* libcUnixNtoGetgrgid(uint16_t gid) {
    typedef void* (*km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrgid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrgid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrgid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrgid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoGetgrouplist(const char* user, uint16_t group, void* groups, void* ngroups) {
    typedef int32_t (*km_fn_t)(const char*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getgrouplist");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getgrouplist");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getgrouplist");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getgrouplist");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, group, groups, ngroups);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadMutexattrGetpshared(void* attr, void* pshared) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getpshared");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getpshared");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_getpshared");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getpshared");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadMutexattrGetrobust(void* attr, void* robustness) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getrobust");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getrobust");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_getrobust");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getrobust");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, robustness);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadMutexattrSetrobust(void* attr, int32_t robustness) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setrobust");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setrobust");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_mutexattr_setrobust");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setrobust");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, robustness);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadCreate(void* native, void* attr, void* f, void* value) {
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_create");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_create");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_create");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_create");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, attr, f, value);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoGetitimer(int32_t which, void* currValue) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getitimer");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getitimer");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getitimer");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getitimer");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, currValue);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSetitimer(int32_t which, void* value, void* ovalue) {
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setitimer");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setitimer");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setitimer");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setitimer");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, value, ovalue);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawn(void* pid, const char* path, void* fileActions, void* attrp, void* argv, void* envp) {
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, path, fileActions, attrp, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnp(void* pid, const char* file, void* fileActions, void* attrp, void* argv, void* envp) {
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnp");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnp");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnp");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, file, fileActions, attrp, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrInit(void* attr) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrDestroy(void* attr) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetsigdefault(void* attr, void* arg1Default) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigdefault");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigdefault");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigdefault");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigdefault");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg1Default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetsigdefault(void* attr, void* arg1Default) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigdefault");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigdefault");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigdefault");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigdefault");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg1Default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetsigmask(void* attr, void* arg1Default) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigmask");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigmask");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigmask");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg1Default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetsigmask(void* attr, void* arg1Default) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigmask");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigmask");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigmask");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigmask");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg1Default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetflags(void* attr, void* flags) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getflags");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getflags");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getflags");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getflags");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetflags(void* attr, int16_t flags) {
    typedef int32_t (*km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setflags");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setflags");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setflags");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setflags");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetpgroup(void* attr, void* flags) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getpgroup");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getpgroup");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getpgroup");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getpgroup");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetpgroup(void* attr, int32_t flags) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setpgroup");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setpgroup");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setpgroup");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setpgroup");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetschedpolicy(void* attr, void* flags) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedpolicy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedpolicy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedpolicy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedpolicy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetschedpolicy(void* attr, int32_t flags) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedpolicy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedpolicy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedpolicy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedpolicy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrGetschedparam(void* attr, void* param) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnattrSetschedparam(void* attr, void* param) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedparam");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedparam");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedparam");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedparam");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnFileActionsInit(void* actions) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnFileActionsDestroy(void* actions) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_destroy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_destroy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_destroy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_destroy");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    typedef int32_t (*km_fn_t)(void*, int32_t, const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addopen");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addopen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addopen");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addopen");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd, path, oflag, mode);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnFileActionsAddclose(void* actions, int32_t fd) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addclose");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addclose");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addclose");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addclose");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPosixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd) {
    typedef int32_t (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_adddup2");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_adddup2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_adddup2");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_adddup2");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd, newfd);
    }
    errno = ENOSYS;
    return -1;
}

void* libcUnixNtoPopen(const char* command, const char* mode) {
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "popen");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_popen");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "popen");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_popen");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(command, mode);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoFaccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "faccessat");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_faccessat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "faccessat");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_faccessat");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, pathname, mode, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoInotifyRmWatch(int32_t fd, int32_t wd) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_rm_watch");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_rm_watch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_rm_watch");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_rm_watch");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, wd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoInotifyInit(void) {
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoInotifyAddWatch(int32_t fd, const char* path, uint32_t mask) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "inotify_add_watch");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_inotify_add_watch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "inotify_add_watch");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_inotify_add_watch");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, path, mask);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGettid(void) {
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gettid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gettid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gettid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gettid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadGetcpuclockid(void* thread, void* clkId) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getcpuclockid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getcpuclockid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getcpuclockid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getcpuclockid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, clkId);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    typedef int32_t (*km_fn_t)(void*, uint32_t, char*, uint32_t, char*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getnameinfo");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getnameinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getnameinfo");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getnameinfo");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sa, salen, host, hostlen, serv, servlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMallopt(int32_t param, int64_t value) {
    typedef int32_t (*km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mallopt");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mallopt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mallopt");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mallopt");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param, value);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGettimeofday(void* tp, void* tz) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gettimeofday");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gettimeofday");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gettimeofday");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gettimeofday");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tp, tz);
    }
    errno = ENOSYS;
    return -1;
}

char* libcUnixNtoCtermid(char* s) {
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ctermid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ctermid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ctermid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ctermid");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libcUnixNtoIoctl(int32_t fd, int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ioctl");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ioctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ioctl");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ioctl");
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
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(fd, request);
            case 1: return km_fn_ptr(fd, request, (intptr_t)km_va0);
            case 2: return km_fn_ptr(fd, request, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(fd, request, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(fd, request, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetpwentR(void* pwd, char* buf, int32_t bufsize, void* result) {
    typedef int32_t (*km_fn_t)(void*, char*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getpwent_r");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getpwent_r");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getpwent_r");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getpwent_r");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwd, buf, bufsize, result);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoPthreadGetnameNp(void* thread, char* name, int32_t len) {
    typedef int32_t (*km_fn_t)(void*, char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_getname_np");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_getname_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_getname_np");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_getname_np");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, name, len);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoPthreadSetnameNp(void* thread, const char* name) {
    typedef int32_t (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_setname_np");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_setname_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_setname_np");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_setname_np");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, name);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libcUnixNtoSysctl(void* arg0, uint32_t arg1, void* arg2, void* arg3, void* arg4, uint64_t arg5) {
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sysctl");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sysctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sysctl");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sysctl");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoGetrlimit(int32_t resource, void* rlim) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getrlimit");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getrlimit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getrlimit");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getrlimit");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, rlim);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoSetrlimit(int32_t resource, void* rlp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setrlimit");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setrlimit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setrlimit");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setrlimit");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, rlp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoLioListio(int32_t mode, void* list, int32_t nent, void* sig) {
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "lio_listio");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_lio_listio");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "lio_listio");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_lio_listio");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mode, list, nent, sig);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoDlIteratePhdr(void* callback, void* data) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dl_iterate_phdr");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dl_iterate_phdr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dl_iterate_phdr");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dl_iterate_phdr");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, data);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMemsetS(void* s, uint64_t smax, int32_t c, uint64_t n) {
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memset_s");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memset_s");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memset_s");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memset_s");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, smax, c, n);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoRegcomp(void* preg, const char* pattern, int32_t cflags) {
    typedef int32_t (*km_fn_t)(void*, const char*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regcomp");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regcomp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regcomp");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regcomp");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preg, pattern, cflags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoRegexec(void* preg, const char* str, uint64_t nmatch, void* pmatch, int32_t eflags) {
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regexec");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regexec");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regexec");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regexec");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preg, str, nmatch, pmatch, eflags);
    }
    errno = ENOSYS;
    return -1;
}

uint64_t libcUnixNtoRegerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbufSize) {
    typedef uint64_t (*km_fn_t)(int32_t, void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regerror");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regerror");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regerror");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regerror");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errcode, preg, errbuf, errbufSize);
    }
    errno = ENOSYS;
    return 0;
}

void libcUnixNtoRegfree(void* preg) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "regfree");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_regfree");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "regfree");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_regfree");
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
        km_fn_ptr(preg);
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixNtoDirfd(void* dirp) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dirfd");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dirfd");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dirfd");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dirfd");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoDircntl(void* dir, int32_t cmd, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef int32_t (*km_fn_t)(void*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dircntl");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dircntl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dircntl");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dircntl");
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
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dir, cmd);
            case 1: return km_fn_ptr(dir, cmd, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dir, cmd, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dir, cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dir, cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioCancel(int32_t fd, void* aiocbp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_cancel");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_cancel");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_cancel");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_cancel");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, aiocbp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioError(void* aiocbp) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_error");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_error");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_error");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_error");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aiocbp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioFsync(int32_t operation, void* aiocbp) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_fsync");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_fsync");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_fsync");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_fsync");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, aiocbp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioRead(void* aiocbp) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_read");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_read");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_read");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_read");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aiocbp);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libcUnixNtoAioReturn(void* aiocpb) {
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_return");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_return");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_return");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_return");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aiocpb);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioSuspend(void* list, int32_t nent, void* timeout) {
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_suspend");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_suspend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_suspend");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_suspend");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(list, nent, timeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoAioWrite(void* aiocpb) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aio_write");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aio_write");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aio_write");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aio_write");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aiocpb);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqClose(void* mqdes) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_close");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_close");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_close");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqGetattr(void* mqdes, void* mqstat) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_getattr");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_getattr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_getattr");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_getattr");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, mqstat);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqNotify(void* mqdes, void* notification) {
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_notify");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_notify");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_notify");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_notify");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, notification);
    }
    errno = ENOSYS;
    return -1;
}

void* libcUnixNtoMqOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_open");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_open");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_open");
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
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(name, oflag);
            case 1: return km_fn_ptr(name, oflag, (intptr_t)km_va0);
            case 2: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return NULL;
}

int64_t libcUnixNtoMqReceive(void* mqdes, char* msgPtr, uint64_t msgLen, void* msgPrio) {
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_receive");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_receive");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_receive");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_receive");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqSend(void* mqdes, const char* msgPtr, uint64_t msgLen, uint32_t msgPrio) {
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_send");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_send");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_send");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_send");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqSetattr(void* mqdes, void* mqstat, void* omqstat) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_setattr");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_setattr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_setattr");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_setattr");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, mqstat, omqstat);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libcUnixNtoMqTimedreceive(void* mqdes, char* msgPtr, uint64_t msgLen, void* msgPrio, void* absTimeout) {
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_timedreceive");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_timedreceive");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_timedreceive");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_timedreceive");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio, absTimeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqTimedsend(void* mqdes, const char* msgPtr, uint64_t msgLen, uint32_t msgPrio, void* absTimeout) {
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_timedsend");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_timedsend");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_timedsend");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_timedsend");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio, absTimeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixNtoMqUnlink(const char* name) {
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mq_unlink");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mq_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mq_unlink");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mq_unlink");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return -1;
}

void* libcUnixNtoGetErrnoPtr(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__get_errno_ptr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__get_errno_ptr");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

void libcUnixNtoMyThreadExit(void* valuePtr) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__my_thread_exit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__my_thread_exit");
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
        km_fn_ptr(valuePtr);
        return;
    }
    errno = ENOSYS;
}

