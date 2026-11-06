#ifndef LIBC_MSVC_MOD_MSVC_MOD_WRAPPER_H
#define LIBC_MSVC_MOD_MSVC_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_msvc_mod_stricmp(const char* s1, const char* s2);
int32_t libc_msvc_mod_strnicmp(const char* s1, const char* s2, uint64_t n);
void* libc_msvc_mod_memccpy(void* dest, void* src, int32_t c, uint64_t count);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_MSVC_MOD_MSVC_MOD_WRAPPER_H */
