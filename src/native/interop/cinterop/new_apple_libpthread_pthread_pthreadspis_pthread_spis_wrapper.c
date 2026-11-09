#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "new_apple_libpthread_pthread_pthreadspis_pthread_spis_wrapper.h"
#include <errno.h>
#if !defined(_WIN32) && defined(__has_include) && __has_include(<pthread/pthread_spis.h>)
#include <pthread/pthread_spis.h>
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

int32_t libc_new_apple_libpthread_pthread_pthreadspis_pthread_spis_pthreadCreateFromMachThread(void* thread, void* attr, void* f, void* value) {
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_create_from_mach_thread");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_create_from_mach_thread");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_create_from_mach_thread");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, attr, f, value);
    }
    errno = ENOSYS;
    return -1;
}

