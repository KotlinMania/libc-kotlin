#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "new_qurt_fcntl_wrapper.h"
#include <errno.h>
#include <fcntl.h>
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

int32_t libcNewQurtFcntlOpen(const char* pathname, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef int32_t (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "open");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "open");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "open");
    }
#endif
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pathname, flags);
            case 1: return km_fn_ptr(pathname, flags, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pathname, flags, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pathname, flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pathname, flags, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
}

int32_t libcNewQurtFcntlCreat(const char* pathname, uint32_t mode) {
    return (int32_t)creat(pathname, mode);
}

int32_t libcNewQurtFcntlFcntl(int32_t fd, int32_t cmd, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef int32_t (*km_fn_t)(int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fcntl");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fcntl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fcntl");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fcntl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fcntl");
    }
#endif
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(fd, cmd);
            case 1: return km_fn_ptr(fd, cmd, (intptr_t)km_va0);
            case 2: return km_fn_ptr(fd, cmd, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(fd, cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(fd, cmd, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
}

