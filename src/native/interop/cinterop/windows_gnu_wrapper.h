#ifndef LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H
#define LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcWindowsGnuStrcasecmp(const char* s1, const char* s2);
int32_t libcWindowsGnuStrncasecmp(const char* s1, const char* s2, uint64_t n);
void* libcWindowsGnuWmemchr(void* cx, uint16_t c, uint64_t n);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H */
