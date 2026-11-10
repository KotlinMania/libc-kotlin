#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "new_apple_libpthread_pthread_qos_wrapper.h"
#include <errno.h>
#if !defined(_WIN32) && defined(__has_include) && __has_include(<pthread/qos.h>)
#include <pthread/qos.h>
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

int32_t libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp(void* attr, void* arg_1_class, void* priority) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_get_qos_class_np");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_get_qos_class_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_get_qos_class_np");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_get_qos_class_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_get_qos_class_np");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, arg_1_class, priority);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(void* thread, void* arg_1_class, void* priority) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_get_qos_class_np");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_get_qos_class_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_get_qos_class_np");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_get_qos_class_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_get_qos_class_np");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, arg_1_class, priority);
    }
    errno = ENOSYS;
    return -1;
}

