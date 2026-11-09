#ifndef LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H
#define LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_windows_gnu_strcasecmp(const char* s1, const char* s2);
int32_t libc_windows_gnu_strncasecmp(const char* s1, const char* s2, uint64_t n);
void* libc_windows_gnu_wmemchr(void* cx, uint16_t c, uint64_t n);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WINDOWS_GNU_WINDOWS_GNU_WRAPPER_H */
