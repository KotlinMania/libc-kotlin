#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "new_qurt_stdlib_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#if !defined(_WIN32)
#include <unistd.h>
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

void* libc_new_qurt_stdlib_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_new_qurt_stdlib_calloc(uint64_t nmemb, uint64_t size) {
    return (void*)calloc(nmemb, size);
}

void* libc_new_qurt_stdlib_realloc(void* ptr, uint64_t size) {
    return (void*)realloc(ptr, size);
}

void libc_new_qurt_stdlib_free(void* ptr) {
    free(ptr);
}

void libc_new_qurt_stdlib_abort(void) {
    abort();
}

void libc_new_qurt_stdlib_exit(int32_t status) {
    exit(status);
}

int32_t libc_new_qurt_stdlib_atexit(void* function) {
    if (function == NULL) {
        errno = EINVAL;
        return -1;
    }
#ifdef __ANDROID__
    return (int32_t)atexit((void (*)(void))(uintptr_t)function);
#else
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "atexit");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_atexit");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "atexit");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_atexit");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "atexit");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function);
    }
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_new_qurt_stdlib_getenv(const char* name) {
    return (char*)getenv(name);
}

int32_t libc_new_qurt_stdlib_setenv(const char* name, const char* value, int32_t overwrite) {
#if !defined(_WIN32)
    return (int32_t)setenv(name, value, overwrite);
#else
    (void)name;
    (void)value;
    (void)overwrite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_new_qurt_stdlib_unsetenv(const char* name) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_new_qurt_stdlib_atoi(const char* nptr) {
    return (int32_t)atoi(nptr);
}

int64_t libc_new_qurt_stdlib_atol(const char* nptr) {
    return (int64_t)atol(nptr);
}

int64_t libc_new_qurt_stdlib_atoll(const char* nptr) {
    return (int64_t)atoll(nptr);
}

int64_t libc_new_qurt_stdlib_strtol(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtol(nptr, endptr, base);
}

uint64_t libc_new_qurt_stdlib_strtoul(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoul(nptr, endptr, base);
}

int64_t libc_new_qurt_stdlib_strtoll(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtoll(nptr, endptr, base);
}

uint64_t libc_new_qurt_stdlib_strtoull(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoull(nptr, endptr, base);
}

double libc_new_qurt_stdlib_strtod(const char* nptr, void* endptr) {
    return (double)strtod(nptr, endptr);
}

float libc_new_qurt_stdlib_strtof(const char* nptr, void* endptr) {
    return (float)strtof(nptr, endptr);
}

int32_t libc_new_qurt_stdlib_rand(void) {
    return (int32_t)rand();
}

void libc_new_qurt_stdlib_srand(uint32_t seed) {
    srand(seed);
}

void libc_new_qurt_stdlib_qsort(void* base, uint64_t nmemb, uint64_t size, void* compar) {
    typedef void (*km_fn_t)(void*, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "qsort");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_qsort");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "qsort");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_qsort");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "qsort");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr(base, nmemb, size, compar);
        return;
    }
    errno = ENOSYS;
}

void* libc_new_qurt_stdlib_bsearch(void* key, void* base, uint64_t nmemb, uint64_t size, void* compar) {
    typedef void* (*km_fn_t)(void*, void*, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "bsearch");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_bsearch");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "bsearch");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_bsearch");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "bsearch");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, base, nmemb, size, compar);
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_new_qurt_stdlib_abs(int32_t j) {
    return (int32_t)abs(j);
}

int64_t libc_new_qurt_stdlib_labs(int64_t j) {
    typedef int64_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "labs");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_labs");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "labs");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_labs");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "labs");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(j);
    }
    errno = ENOSYS;
    return -1;
}

int64_t libc_new_qurt_stdlib_llabs(int64_t j) {
    return (int64_t)llabs(j);
}

