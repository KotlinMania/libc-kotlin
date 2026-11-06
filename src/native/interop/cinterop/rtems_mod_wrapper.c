#include "rtems_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread.h>
#endif

int32_t libc_rtems_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int64_t libc_rtems_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_rtems_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int32_t libc_rtems_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_rtems_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_rtems_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

void libc_rtems_mod_arc4random_buf(void* buf, uint64_t nbytes) {
    arc4random_buf(buf, nbytes);
}

int32_t libc_rtems_mod_setgroups(int32_t ngroups, void* grouplist) {
    return (int32_t)setgroups(ngroups, grouplist);
}

