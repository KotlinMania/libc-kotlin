#ifndef LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H
#define LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewQurtStdlibMalloc(uint64_t size);
void* libcNewQurtStdlibCalloc(uint64_t nmemb, uint64_t size);
void* libcNewQurtStdlibRealloc(void* ptr, uint64_t size);
void libcNewQurtStdlibFree(void* ptr);
void libcNewQurtStdlibAbort(void);
void libcNewQurtStdlibExit(int32_t status);
int32_t libcNewQurtStdlibAtexit(void* function);
char* libcNewQurtStdlibGetenv(const char* name);
int32_t libcNewQurtStdlibSetenv(const char* name, const char* value, int32_t overwrite);
int32_t libcNewQurtStdlibUnsetenv(const char* name);
int32_t libcNewQurtStdlibAtoi(const char* nptr);
int64_t libcNewQurtStdlibAtol(const char* nptr);
int64_t libcNewQurtStdlibAtoll(const char* nptr);
int64_t libcNewQurtStdlibStrtol(const char* nptr, void* endptr, int32_t base);
uint64_t libcNewQurtStdlibStrtoul(const char* nptr, void* endptr, int32_t base);
int64_t libcNewQurtStdlibStrtoll(const char* nptr, void* endptr, int32_t base);
uint64_t libcNewQurtStdlibStrtoull(const char* nptr, void* endptr, int32_t base);
double libcNewQurtStdlibStrtod(const char* nptr, void* endptr);
float libcNewQurtStdlibStrtof(const char* nptr, void* endptr);
int32_t libcNewQurtStdlibRand(void);
void libcNewQurtStdlibSrand(uint32_t seed);
void libcNewQurtStdlibQsort(void* base, uint64_t nmemb, uint64_t size, void* compar);
void* libcNewQurtStdlibBsearch(void* key, void* base, uint64_t nmemb, uint64_t size, void* compar);
int32_t libcNewQurtStdlibAbs(int32_t j);
int64_t libcNewQurtStdlibLabs(int64_t j);
int64_t libcNewQurtStdlibLlabs(int64_t j);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_STDLIB_NEW_QURT_STDLIB_WRAPPER_H */
