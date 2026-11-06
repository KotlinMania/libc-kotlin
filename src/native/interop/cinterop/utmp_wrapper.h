#ifndef LIBC_UTMP_UTMP_WRAPPER_H
#define LIBC_UTMP_UTMP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_utmp_utmpname(const char* file);
void libc_utmp_setutent(void);
void* libc_utmp_getutent(void);
void libc_utmp_endutent(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UTMP_UTMP_WRAPPER_H */
