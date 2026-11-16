#ifndef LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H
#define LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewNetbsdUtmpUtmpname(const char* file);
void libcNewNetbsdUtmpSetutent(void);
void* libcNewNetbsdUtmpGetutent(void);
void libcNewNetbsdUtmpEndutent(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_NETBSD_UTMP_NEW_NETBSD_UTMP_WRAPPER_H */
