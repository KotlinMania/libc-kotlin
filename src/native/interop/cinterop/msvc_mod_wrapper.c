#include "msvc_mod_wrapper.h"
#include <errno.h>

int32_t libc_msvc_mod_stricmp(const char* s1, const char* s2) {
    return (int32_t)_stricmp(s1, s2);
}

int32_t libc_msvc_mod_strnicmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)_strnicmp(s1, s2, n);
}

void* libc_msvc_mod_memccpy(void* dest, void* src, int32_t c, uint64_t count) {
    return (void*)_memccpy(dest, src, c, count);
}

