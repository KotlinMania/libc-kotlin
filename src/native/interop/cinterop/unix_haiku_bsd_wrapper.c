#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "unix_haiku_bsd_wrapper.h"
#include <errno.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
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

int32_t libc_unix_haiku_bsd_daemon(int32_t nochdir, int32_t noclose) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nochdir, noclose);
    }
    errno = ENOSYS;
    return -1;
}

const char* libc_unix_haiku_bsd_getprogname(void) {
    typedef const char* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getprogname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_getprogname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getprogname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_getprogname");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

void libc_unix_haiku_bsd_setprogname(const char* progname) {
    typedef void (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "setprogname");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_setprogname");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "setprogname");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_setprogname");
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
        km_fn_ptr(progname);
        return;
    }
    errno = ENOSYS;
}

uint32_t libc_unix_haiku_bsd_arc4random(void) {
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
}

uint32_t libc_unix_haiku_bsd_arc4randomUniform(uint32_t upper_bound) {
    typedef uint32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random_uniform");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random_uniform");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random_uniform");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random_uniform");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(upper_bound);
    }
    errno = ENOSYS;
    return 0;
}

void libc_unix_haiku_bsd_arc4randomBuf(void* buf, uint64_t n) {
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "arc4random_buf");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_arc4random_buf");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "arc4random_buf");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_arc4random_buf");
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
        km_fn_ptr(buf, n);
        return;
    }
    errno = ENOSYS;
}

int32_t libc_unix_haiku_bsd_mkstemps(char* arg_0_template, int32_t suffixlen) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_template, suffixlen);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_haiku_bsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr) {
    typedef int64_t (*km_fn_t)(const char*, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strtonum");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strtonum");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strtonum");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strtonum");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nptr, minval, maxval, errstr);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_haiku_bsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(amaster, aslave, name, termp, winp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_haiku_bsd_loginTty(int32_t arg_0_fd) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_fd);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_haiku_bsd_forkpty(void* amaster, char* name, void* termp, void* winp) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(amaster, name, termp, winp);
    }
    errno = ENOSYS;
    return -1;
}

char* libc_unix_haiku_bsd_strsep(void* string, const char* delimiters) {
    typedef char* (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "strsep");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_strsep");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "strsep");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_strsep");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, delimiters);
    }
    errno = ENOSYS;
    return NULL;
}

void libc_unix_haiku_bsd_explicitBzero(void* buf, uint64_t len) {
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "explicit_bzero");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_explicit_bzero");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "explicit_bzero");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_explicit_bzero");
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
        km_fn_ptr(buf, len);
        return;
    }
    errno = ENOSYS;
}

void* libc_unix_haiku_bsd_slInit(void) {
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_init");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_init");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_init");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_init");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_haiku_bsd_slAdd(void* sl, char* n) {
    typedef int32_t (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_add");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_add");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_add");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_add");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sl, n);
    }
    errno = ENOSYS;
    return -1;
}

void libc_unix_haiku_bsd_slFree(void* sl, int32_t i) {
    typedef void (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_free");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_free");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_free");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_free");
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
        km_fn_ptr(sl, i);
        return;
    }
    errno = ENOSYS;
}

char* libc_unix_haiku_bsd_slFind(void* sl, char* n) {
    typedef char* (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sl_find");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sl_find");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sl_find");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sl_find");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sl, n);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_unix_haiku_bsd_kqueue(void) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kqueue();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_haiku_bsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
#else
    (void)kq;
    (void)changelist;
    (void)nchanges;
    (void)eventlist;
    (void)nevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_haiku_bsd_dlIteratePhdr(void* callback, void* data) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, data);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_haiku_bsd_lutimes(const char* file, void* times) {
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "lutimes");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_lutimes");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "lutimes");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_lutimes");
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, times);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_haiku_bsd_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt, offset);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_unix_haiku_bsd_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, iov, iovcnt, offset);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_unix_haiku_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
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
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, status, options, rusage);
    }
    errno = ENOSYS;
    return -1;
}

