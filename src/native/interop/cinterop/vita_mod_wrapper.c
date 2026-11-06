#include "vita_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread.h>
#endif

int32_t libc_vita_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int64_t libc_vita_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_vita_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_vita_mod_sendmsg(int32_t s, void* msg, int32_t flags) {
    return (int64_t)sendmsg(s, msg, flags);
}

int64_t libc_vita_mod_recvmsg(int32_t s, void* msg, int32_t flags) {
    return (int64_t)recvmsg(s, msg, flags);
}

int32_t libc_vita_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_vita_mod_pthread_attr_getschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_getschedparam(attr, param);
}

int32_t libc_vita_mod_pthread_attr_setschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_setschedparam(attr, param);
}

int32_t libc_vita_mod_pthread_attr_getprocessorid_np(void* attr, void* processor_id) {
    return (int32_t)pthread_attr_getprocessorid_np(attr, processor_id);
}

int32_t libc_vita_mod_pthread_attr_setprocessorid_np(void* attr, int32_t processor_id) {
    return (int32_t)pthread_attr_setprocessorid_np(attr, processor_id);
}

int32_t libc_vita_mod_pthread_getschedparam(int32_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_vita_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_vita_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_vita_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_vita_mod_pthread_getprocessorid_np(void) {
    return (int32_t)pthread_getprocessorid_np();
}

int32_t libc_vita_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int32_t libc_vita_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

