#include "timex_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/timex.h>
#endif

int32_t libc_timex_ntp_gettime(void* buf) {
    return (int32_t)__ntp_gettime50(buf);
}

int32_t libc_timex_ntp_adjtime(void* buf) {
    return (int32_t)ntp_adjtime(buf);
}

