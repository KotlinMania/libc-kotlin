#include "utmp_wrapper.h"
#include <errno.h>
#if !defined(_WIN32) && __has_include(<utmp.h>)
#include <utmp.h>
#endif

int32_t libc_utmp_utmpname(const char* file) {
    return (int32_t)utmpname(file);
}

void libc_utmp_setutent(void) {
    setutent();
}

void* libc_utmp_getutent(void) {
    return (void*)__getutent50();
}

void libc_utmp_endutent(void) {
    endutent();
}

