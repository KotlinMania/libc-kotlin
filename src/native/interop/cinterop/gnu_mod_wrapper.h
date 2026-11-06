#ifndef LIBC_GNU_MOD_GNU_MOD_WRAPPER_H
#define LIBC_GNU_MOD_GNU_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_gnu_mod_strcasecmp(const char* s1, const char* s2);
int32_t libc_gnu_mod_strncasecmp(const char* s1, const char* s2, uint64_t n);
void* libc_gnu_mod_wmemchr(void* cx, int32_t c, uint64_t n);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_GNU_MOD_GNU_MOD_WRAPPER_H */
