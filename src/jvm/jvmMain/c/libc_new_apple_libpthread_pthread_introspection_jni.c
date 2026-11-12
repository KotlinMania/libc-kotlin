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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_new_apple_libpthread_pthread_introspection_NewAppleLibpthreadPthreadIntrospectionJniBridge_libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionHookInstall(JNIEnv* km_env, jclass km_clazz, jlong hook) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_introspection_hook_install");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_introspection_hook_install");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_introspection_hook_install");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_introspection_hook_install");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_introspection_hook_install");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hook);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_new_apple_libpthread_pthread_introspection_NewAppleLibpthreadPthreadIntrospectionJniBridge_libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong key, jlong value) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_introspection_setspecific_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_introspection_setspecific_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_introspection_setspecific_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_introspection_setspecific_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_introspection_setspecific_np");
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (uint64_t)key, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_libc_new_apple_libpthread_pthread_introspection_NewAppleLibpthreadPthreadIntrospectionJniBridge_libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong key) {
    (void)km_env;
    (void)km_clazz;
    typedef void* (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_introspection_getspecific_np");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_introspection_getspecific_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_introspection_getspecific_np");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_introspection_getspecific_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_introspection_getspecific_np");
    }
#endif
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (uint64_t)key);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
    return (jlong)(uintptr_t)km_res;
}

