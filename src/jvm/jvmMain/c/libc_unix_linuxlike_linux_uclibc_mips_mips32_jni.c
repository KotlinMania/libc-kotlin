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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_linux_uclibc_mips_mips32_UnixLinuxlikeLinuxUclibcMipsMips32JniBridge_libc_1unix_1linuxlike_1linux_1uclibc_1mips_1mips32_1sysctl(JNIEnv* km_env, jclass km_clazz, jlong name, jint namelen, jlong oldp, jlong oldlenp, jlong newp, jlong newlen) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sysctl");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sysctl");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sysctl");
    }
#endif
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (int32_t)namelen, (void*)(uintptr_t)oldp, (void*)(uintptr_t)oldlenp, (void*)(uintptr_t)newp, (uint64_t)newlen) : -1;
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_linux_uclibc_mips_mips32_UnixLinuxlikeLinuxUclibcMipsMips32JniBridge_libc_1unix_1linuxlike_1linux_1uclibc_1mips_1mips32_1glob64(JNIEnv* km_env, jclass km_clazz, jstring pattern, jint flags, jlong errfunc, jlong pglob) {
    (void)km_env;
    (void)km_clazz;
    const char* pattern_utf = (pattern != NULL) ? (*km_env)->GetStringUTFChars(km_env, pattern, NULL) : NULL;
    typedef int32_t (*km_fn_t)(const char*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "glob64");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "glob64");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "glob64");
    }
#endif
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr(pattern_utf, (int32_t)flags, (void*)(uintptr_t)errfunc, (void*)(uintptr_t)pglob) : -1;
    if (pattern != NULL && pattern_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, pattern, pattern_utf);
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_linux_uclibc_mips_mips32_UnixLinuxlikeLinuxUclibcMipsMips32JniBridge_libc_1unix_1linuxlike_1linux_1uclibc_1mips_1mips32_1globfree64(JNIEnv* km_env, jclass km_clazz, jlong pglob) {
    (void)km_env;
    (void)km_clazz;
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "globfree64");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "globfree64");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "globfree64");
    }
#endif
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pglob);
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_linux_uclibc_mips_mips32_UnixLinuxlikeLinuxUclibcMipsMips32JniBridge_libc_1unix_1linuxlike_1linux_1uclibc_1mips_1mips32_1pthreadAttrGetaffinityNp(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong cpusetsize, jlong cpuset) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getaffinity_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getaffinity_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_getaffinity_np");
    }
#endif
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)attr, (uint64_t)cpusetsize, (void*)(uintptr_t)cpuset) : -1;
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_libc_unix_linuxlike_linux_uclibc_mips_mips32_UnixLinuxlikeLinuxUclibcMipsMips32JniBridge_libc_1unix_1linuxlike_1linux_1uclibc_1mips_1mips32_1pthreadAttrSetaffinityNp(JNIEnv* km_env, jclass km_clazz, jlong attr, jlong cpusetsize, jlong cpuset) {
    (void)km_env;
    (void)km_clazz;
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_setaffinity_np");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_setaffinity_np");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_setaffinity_np");
    }
#endif
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)attr, (uint64_t)cpusetsize, (void*)(uintptr_t)cpuset) : -1;
    return (jint)km_res;
}

