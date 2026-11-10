#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "unix_bsd_netbsdlike_wrapper.h"
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

void libc_unix_bsd_netbsdlike_setgrent(void) {
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
        return;
    }
    errno = ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_semDestroy(void* sem) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_semInit(void* sem, int32_t pshared, uint32_t value) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, pshared, value);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_daemon(int32_t nochdir, int32_t noclose) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nochdir, noclose);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_accept4(int32_t s, void* addr, void* addrlen, int32_t flags) {
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "accept4");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_accept4");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "accept4");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_accept4");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, addr, addrlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_mincore(void* addr, uint64_t len, char* vec) {
    typedef int32_t (*km_fn_t)(void*, uint64_t, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mincore");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mincore");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mincore");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mincore");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, len, vec);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_clockGetres(int32_t clk_id, void* tp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clk_id, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_clockGettime(int32_t clk_id, void* tp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clk_id, tp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_clockSettime(int32_t clk_id, void* tp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clk_id, tp);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_unix_bsd_netbsdlike_errno(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__errno");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__errno");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_bsd_netbsdlike_shmOpen(const char* name, int32_t oflag, uint32_t mode) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, oflag, mode);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_unix_bsd_netbsdlike_memrchr(void* cx, int32_t c, uint64_t n) {
    typedef void* (*km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "memrchr");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_memrchr");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "memrchr");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_memrchr");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cx, c, n);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_bsd_netbsdlike_mkostemp(char* arg_0_template, int32_t flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_template, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_mkostemps(char* arg_0_template, int32_t suffixlen, int32_t flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_template, suffixlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_bsd_netbsdlike_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pwritev");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pwritev");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pwritev");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pwritev");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt, offset);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_bsd_netbsdlike_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "preadv");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_preadv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "preadv");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_preadv");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt, offset);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_futimens(int32_t fd, void* times) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, times);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, path, times, flag);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_fdatasync(int32_t fd) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_loginTty(int32_t fd) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_getpriority(int32_t which, uint32_t who) {
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, who);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_setpriority(int32_t which, uint32_t who, int32_t prio) {
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, int32_t);
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which, who, prio);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev) {
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t, int32_t);
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, pathname, mode, dev);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirfd, pathname, mode);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_semTimedwait(void* sem, void* abstime) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, abstime);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_semGetvalue(void* sem, void* sval) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem, sval);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(void* attr, int32_t clock_id) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, clock_id);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_sethostname(const char* name, uint64_t len) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(void* lock, void* abstime) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock, abstime);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSpinInit(void* lock, int32_t pshared) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock, pshared);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSpinDestroy(void* lock) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSpinLock(void* lock) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSpinTrylock(void* lock) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSpinUnlock(void* lock) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lock);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadSetschedparam(void* native, int32_t policy, void* param) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, policy, param);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pthreadGetschedparam(void* native, void* policy, void* param) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(native, policy, param);
    }
    errno = ENOSYS;
    return ENOSYS;
}

int32_t libc_unix_bsd_netbsdlike_pipe2(void* fds, int32_t flags) {
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pipe2");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pipe2");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pipe2");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pipe2");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fds, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_ppoll(void* fds, uint32_t nfds, void* ts, void* sigmask) {
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "ppoll");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_ppoll");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "ppoll");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_ppoll");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fds, nfds, ts, sigmask);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_getgrouplist(const char* name, uint16_t basegid, void* groups, void* ngroups) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, basegid, groups, ngroups);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_initgroups(const char* name, uint16_t basegid) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, basegid);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_getdomainname(char* name, uint64_t len) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_setdomainname(const char* name, uint64_t len) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, len);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_uname(void* buf) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buf);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_shmget(int64_t key, uint64_t size, int32_t shmflg) {
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmget");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmget");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmget");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmget");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, size, shmflg);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_unix_bsd_netbsdlike_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    typedef void* (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmat");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmat");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmat");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmat");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(shmid, shmaddr, shmflg);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_bsd_netbsdlike_shmdt(void* shmaddr) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmdt");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmdt");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmdt");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmdt");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(shmaddr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "shmctl");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_shmctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "shmctl");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_shmctl");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(shmid, cmd, buf);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_execvpe(const char* file, void* argv, void* envp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options) {
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, void*, int32_t);
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idtype, id, infop, options);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, path, file_actions, attrp, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, file, file_actions, attrp, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrInit(void* attr) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(void* attr) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(void* attr, void* arg_1_default) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg_1_default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(void* attr, void* arg_1_default) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg_1_default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(void* attr, void* arg_1_default) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg_1_default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(void* attr, void* arg_1_default) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg_1_default);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(void* attr, void* flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(void* attr, int16_t flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(void* attr, void* flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(void* attr, int32_t flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(void* attr, void* flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(void* attr, int32_t flags) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(void* attr, void* param) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(void* attr, void* param) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, param);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(void* actions) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(void* actions) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd, path, oflag, mode);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(void* actions, int32_t fd) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(actions, fd, newfd);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_unix_bsd_netbsdlike_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    typedef void* (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "reallocarray");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_reallocarray");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "reallocarray");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_reallocarray");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "reallocarray");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptr, nmemb, size);
    }
    errno = ENOSYS;
    return NULL;
}

int64_t libc_unix_bsd_netbsdlike_gethostid(void) {
    typedef int64_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gethostid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_gethostid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gethostid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_gethostid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "gethostid");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_sethostid(int64_t hostid) {
    typedef int32_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sethostid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sethostid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sethostid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sethostid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sethostid");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostid);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_bsd_netbsdlike_ftok(const char* path, int32_t id) {
    typedef int64_t (*km_fn_t)(const char*, int32_t);
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
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, id);
    }
    errno = ENOSYS;
    return -1;
}

char* libc_unix_bsd_netbsdlike_dirname(char* path) {
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "dirname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_dirname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "dirname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_dirname");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "dirname");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return NULL;
}

char* libc_unix_bsd_netbsdlike_basename(char* path) {
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "basename");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_basename");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "basename");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_basename");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "basename");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_bsd_netbsdlike_getentropy(void* buf, uint64_t buflen) {
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getentropy");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getentropy");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getentropy");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getentropy");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getentropy");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buf, buflen);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_sendmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags) {
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, int32_t);
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
        return km_fn_ptr(sockfd, mmsg, vlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_recvmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags, void* timeout) {
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, int32_t, void*);
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
        return km_fn_ptr(sockfd, mmsg, vlen, flags, timeout);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_bsd_netbsdlike_closefrom(int32_t lowfd) {
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "closefrom");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_closefrom");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "closefrom");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_closefrom");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "closefrom");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lowfd);
    }
    errno = ENOSYS;
    return -1;
}

