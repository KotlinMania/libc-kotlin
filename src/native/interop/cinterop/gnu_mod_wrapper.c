#include "gnu_mod_wrapper.h"
#include <errno.h>

int32_t libc_gnu_mod_strcasecmp(const char* s1, const char* s2) {
    return (int32_t)strcasecmp(s1, s2);
}

int32_t libc_gnu_mod_strncasecmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncasecmp(s1, s2, n);
}

void* libc_gnu_mod_wmemchr(void* cx, int32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

