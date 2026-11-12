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

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_android_b64_UnixLinuxlikeAndroidB64JniBridge_libcUnixLinuxlikeAndroidB64SystemPropertyWait(JNIEnv* km_env, jclass km_clazz, jlong pi, jint oldSerial, jlong newSerialPtr, jlong relativeTimeout) {
    (void)km_env;
    (void)km_clazz;
    typedef bool (*km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "__system_property_wait");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "__system_property_wait");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "__system_property_wait");
    }
#endif
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pi, (uint32_t)oldSerial, (void*)(uintptr_t)newSerialPtr, (void*)(uintptr_t)relativeTimeout);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
    return (jboolean)km_res;
}

