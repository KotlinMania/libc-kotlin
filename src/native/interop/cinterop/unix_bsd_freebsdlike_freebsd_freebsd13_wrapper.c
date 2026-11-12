#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "unix_bsd_freebsdlike_freebsd_freebsd13_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
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

void libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent(void) {
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
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
}

int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(void* addr, uint64_t len, int32_t prot) {
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

void libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(void* loc) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "freelocale");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_freelocale");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "freelocale");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_freelocale");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "freelocale");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr(loc);
        return;
    }
    errno = ENOSYS;
}

int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "msgrcv");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_msgrcv");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "msgrcv");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_msgrcv");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "msgrcv");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msqid, msgp, msgsz, msgtyp, msgflg);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, void* policy) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_getdomain");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_getdomain");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_getdomain");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_getdomain");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_getdomain");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(level, which, id, setsize, mask, policy);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, int32_t policy) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "cpuset_setdomain");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_cpuset_setdomain");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "cpuset_setdomain");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_cpuset_setdomain");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "cpuset_setdomain");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(level, which, id, setsize, mask, policy);
    }
    errno = ENOSYS;
    return -1;
}

char* libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(char* path) {
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

char* libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(char* path) {
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

void libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar) {
    typedef void (*km_fn_t)(void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "qsort_r@FBSD_1.0");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_qsort_r@FBSD_1.0");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "qsort_r@FBSD_1.0");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_qsort_r@FBSD_1.0");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "qsort_r@FBSD_1.0");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr(base, num, size, arg, compar);
        return;
    }
    errno = ENOSYS;
}

int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(void* kd) {
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "kvm_kerndisp");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_kvm_kerndisp");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "kvm_kerndisp");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_kvm_kerndisp");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "kvm_kerndisp");
#ifdef __APPLE__
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_kerndisp");
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == NULL) {
            static void* km_h_kvm = NULL;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != NULL) km_fn_ptr = (km_fn_t)dlsym(km_h_kvm, "kvm_kerndisp");
        }
#endif
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(kd);
    }
    errno = ENOSYS;
    return -1;
}

