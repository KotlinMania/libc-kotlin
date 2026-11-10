#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_bsd_apple_b32_UnixBsdAppleB32JniBridge_libc_1unix_1bsd_1apple_1b32_1exchangedata(JNIEnv* km_env, jclass km_clazz, jstring path1, jstring path2, jlong options) {
    (void)km_env;
    (void)km_clazz;
    const char* path1_utf = (path1 != NULL) ? (*km_env)->GetStringUTFChars(km_env, path1, NULL) : NULL;
    const char* path2_utf = (path2 != NULL) ? (*km_env)->GetStringUTFChars(km_env, path2, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, const char*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "exchangedata");
        if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_exchangedata");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "exchangedata");
            if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_exchangedata");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "exchangedata");
    }
#endif
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr(path1_utf, path2_utf, (uint64_t)options) : -1;
    if (path1 != NULL && path1_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path1, path1_utf);
    if (path2 != NULL && path2_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path2, path2_utf);
    return (jint)km_res;
}

