#ifndef LIBC_RTEMS_MOD_RTEMS_MOD_WRAPPER_H
#define LIBC_RTEMS_MOD_RTEMS_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_rtems_mod_futimens(int32_t fd, void* times);
int64_t libc_rtems_mod_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_rtems_mod_readv(int32_t fd, void* iov, int32_t iovcnt);
int32_t libc_rtems_mod_pthread_create(void* native, void* attr, int32_t f, void* value);
int32_t libc_rtems_mod_pthread_condattr_setclock(void* attr, int32_t clock_id);
int32_t libc_rtems_mod_getentropy(void* buf, uint64_t buflen);
void libc_rtems_mod_arc4random_buf(void* buf, uint64_t nbytes);
int32_t libc_rtems_mod_setgroups(int32_t ngroups, void* grouplist);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_RTEMS_MOD_RTEMS_MOD_WRAPPER_H */
