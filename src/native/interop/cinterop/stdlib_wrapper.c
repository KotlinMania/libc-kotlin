#include "stdlib_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#if !defined(_WIN32)
#include <unistd.h>
#endif

void* libc_stdlib_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_stdlib_calloc(uint64_t nmemb, uint64_t size) {
    return (void*)calloc(nmemb, size);
}

void* libc_stdlib_realloc(void* ptr, uint64_t size) {
    return (void*)realloc(ptr, size);
}

void libc_stdlib_free(void* ptr) {
    free(ptr);
}

void libc_stdlib_abort(void) {
    abort();
}

void libc_stdlib_exit(int32_t status) {
    exit(status);
}

int32_t libc_stdlib_atexit(int32_t function) {
    return (int32_t)atexit(function);
}

char* libc_stdlib_getenv(const char* name) {
    return (char*)getenv(name);
}

int32_t libc_stdlib_setenv(const char* name, const char* value, int32_t overwrite) {
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

int32_t libc_stdlib_unsetenv(const char* name) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_stdlib_atoi(const char* nptr) {
    return (int32_t)atoi(nptr);
}

int64_t libc_stdlib_atol(const char* nptr) {
    return (int64_t)atol(nptr);
}

int64_t libc_stdlib_atoll(const char* nptr) {
    return (int64_t)atoll(nptr);
}

int64_t libc_stdlib_strtol(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtol(nptr, endptr, base);
}

uint64_t libc_stdlib_strtoul(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoul(nptr, endptr, base);
}

int64_t libc_stdlib_strtoll(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtoll(nptr, endptr, base);
}

uint64_t libc_stdlib_strtoull(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoull(nptr, endptr, base);
}

double libc_stdlib_strtod(const char* nptr, void* endptr) {
    return (double)strtod(nptr, endptr);
}

float libc_stdlib_strtof(const char* nptr, void* endptr) {
    return (float)strtof(nptr, endptr);
}

int32_t libc_stdlib_rand(void) {
    return (int32_t)rand();
}

void libc_stdlib_srand(uint32_t seed) {
    srand(seed);
}

void libc_stdlib_qsort(void* base, uint64_t nmemb, uint64_t size, int32_t compar) {
    qsort(base, nmemb, size, compar);
}

void* libc_stdlib_bsearch(void* key, void* base, uint64_t nmemb, uint64_t size, int32_t compar) {
    return (void*)bsearch(key, base, nmemb, size, compar);
}

int32_t libc_stdlib_abs(int32_t j) {
    return (int32_t)abs(j);
}

int64_t libc_stdlib_labs(int64_t j) {
    return (int64_t)labs(j);
}

int64_t libc_stdlib_llabs(int64_t j) {
    return (int64_t)llabs(j);
}

int32_t libc_stdlib_div(int32_t numer, int32_t denom) {
    return (int32_t)div(numer, denom);
}

int32_t libc_stdlib_ldiv(int64_t numer, int64_t denom) {
    return (int32_t)ldiv(numer, denom);
}

int32_t libc_stdlib_lldiv(int64_t numer, int64_t denom) {
    return (int32_t)lldiv(numer, denom);
}

