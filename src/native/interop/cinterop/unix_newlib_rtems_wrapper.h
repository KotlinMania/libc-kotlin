#ifndef LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H
#define LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_newlib_rtems_futimens(int32_t fd, void* times);
int64_t libc_unix_newlib_rtems_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_newlib_rtems_readv(int32_t fd, void* iov, int32_t iovcnt);
int32_t libc_unix_newlib_rtems_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_unix_newlib_rtems_pthreadCondattrSetclock(void* attr, uint64_t clock_id);
int32_t libc_unix_newlib_rtems_getentropy(void* buf, uint64_t buflen);
void libc_unix_newlib_rtems_arc4randomBuf(void* buf, uint64_t nbytes);
int32_t libc_unix_newlib_rtems_setgroups(int32_t ngroups, void* grouplist);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H */
