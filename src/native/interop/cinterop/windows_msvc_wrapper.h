#ifndef LIBC_WINDOWS_MSVC_WINDOWS_MSVC_WRAPPER_H
#define LIBC_WINDOWS_MSVC_WINDOWS_MSVC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcWindowsMsvcStricmp(const char* s1, const char* s2);
int32_t libcWindowsMsvcStrnicmp(const char* s1, const char* s2, uint64_t n);
void* libcWindowsMsvcMemccpy(void* dest, void* src, int32_t c, uint64_t count);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WINDOWS_MSVC_WINDOWS_MSVC_WRAPPER_H */
