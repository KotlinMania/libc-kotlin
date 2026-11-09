#ifndef LIBC_NEW_NETBSD_SYS_TIMEX_NEW_NETBSD_SYS_TIMEX_WRAPPER_H
#define LIBC_NEW_NETBSD_SYS_TIMEX_NEW_NETBSD_SYS_TIMEX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_netbsd_sys_timex_ntpGettime(void* buf);
int32_t libc_new_netbsd_sys_timex_ntpAdjtime(void* buf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_NETBSD_SYS_TIMEX_NEW_NETBSD_SYS_TIMEX_WRAPPER_H */
