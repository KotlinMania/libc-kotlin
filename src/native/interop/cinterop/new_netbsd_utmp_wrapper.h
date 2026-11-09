#ifndef LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H
#define LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_netbsd_utmp_utmpname(const char* file);
void libc_new_netbsd_utmp_setutent(void);
void* libc_new_netbsd_utmp_getutent(void);
void libc_new_netbsd_utmp_endutent(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H */
