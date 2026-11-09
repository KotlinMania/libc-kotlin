#ifndef LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H
#define LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_new_qurt_stdlib_malloc(uint64_t size);
void* libc_new_qurt_stdlib_calloc(uint64_t nmemb, uint64_t size);
void* libc_new_qurt_stdlib_realloc(void* ptr, uint64_t size);
void libc_new_qurt_stdlib_free(void* ptr);
void libc_new_qurt_stdlib_abort(void);
void libc_new_qurt_stdlib_exit(int32_t status);
int32_t libc_new_qurt_stdlib_atexit(void* function);
char* libc_new_qurt_stdlib_getenv(const char* name);
int32_t libc_new_qurt_stdlib_setenv(const char* name, const char* value, int32_t overwrite);
int32_t libc_new_qurt_stdlib_unsetenv(const char* name);
int32_t libc_new_qurt_stdlib_atoi(const char* nptr);
int64_t libc_new_qurt_stdlib_atol(const char* nptr);
int64_t libc_new_qurt_stdlib_atoll(const char* nptr);
int64_t libc_new_qurt_stdlib_strtol(const char* nptr, void* endptr, int32_t base);
uint64_t libc_new_qurt_stdlib_strtoul(const char* nptr, void* endptr, int32_t base);
int64_t libc_new_qurt_stdlib_strtoll(const char* nptr, void* endptr, int32_t base);
uint64_t libc_new_qurt_stdlib_strtoull(const char* nptr, void* endptr, int32_t base);
double libc_new_qurt_stdlib_strtod(const char* nptr, void* endptr);
float libc_new_qurt_stdlib_strtof(const char* nptr, void* endptr);
int32_t libc_new_qurt_stdlib_rand(void);
void libc_new_qurt_stdlib_srand(uint32_t seed);
void libc_new_qurt_stdlib_qsort(void* base, uint64_t nmemb, uint64_t size, void* compar);
void* libc_new_qurt_stdlib_bsearch(void* key, void* base, uint64_t nmemb, uint64_t size, void* compar);
int32_t libc_new_qurt_stdlib_abs(int32_t j);
int64_t libc_new_qurt_stdlib_labs(int64_t j);
int64_t libc_new_qurt_stdlib_llabs(int64_t j);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H */
