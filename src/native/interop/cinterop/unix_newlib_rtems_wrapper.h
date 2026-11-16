#ifndef LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H
#define LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixNewlibRtemsFutimens(int32_t fd, void* times);
int64_t libcUnixNewlibRtemsWritev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixNewlibRtemsReadv(int32_t fd, void* iov, int32_t iovcnt);
int32_t libcUnixNewlibRtemsPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcUnixNewlibRtemsPthreadCondattrSetclock(void* attr, uint64_t clockId);
int32_t libcUnixNewlibRtemsGetentropy(void* buf, uint64_t buflen);
void libcUnixNewlibRtemsArc4randomBuf(void* buf, uint64_t nbytes);
int32_t libcUnixNewlibRtemsSetgroups(int32_t ngroups, void* grouplist);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_RTEMS_UNIX_NEWLIB_RTEMS_WRAPPER_H */
