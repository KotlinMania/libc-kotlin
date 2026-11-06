#ifndef LIBC_TIMEX_TIMEX_WRAPPER_H
#define LIBC_TIMEX_TIMEX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_timex_ntp_gettime(void* buf);
int32_t libc_timex_ntp_adjtime(void* buf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TIMEX_TIMEX_WRAPPER_H */
