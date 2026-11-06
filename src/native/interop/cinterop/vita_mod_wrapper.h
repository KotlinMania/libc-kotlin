#ifndef LIBC_VITA_MOD_VITA_MOD_WRAPPER_H
#define LIBC_VITA_MOD_VITA_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_vita_mod_futimens(int32_t fd, void* times);
int64_t libc_vita_mod_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_vita_mod_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_vita_mod_sendmsg(int32_t s, void* msg, int32_t flags);
int64_t libc_vita_mod_recvmsg(int32_t s, void* msg, int32_t flags);
int32_t libc_vita_mod_pthread_create(void* native, void* attr, int32_t f, void* value);
int32_t libc_vita_mod_pthread_attr_getschedparam(void* attr, void* param);
int32_t libc_vita_mod_pthread_attr_setschedparam(void* attr, void* param);
int32_t libc_vita_mod_pthread_attr_getprocessorid_np(void* attr, void* processor_id);
int32_t libc_vita_mod_pthread_attr_setprocessorid_np(void* attr, int32_t processor_id);
int32_t libc_vita_mod_pthread_getschedparam(int32_t native, void* policy, void* param);
int32_t libc_vita_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param);
int32_t libc_vita_mod_pthread_condattr_getclock(void* attr, void* clock_id);
int32_t libc_vita_mod_pthread_condattr_setclock(void* attr, int32_t clock_id);
int32_t libc_vita_mod_pthread_getprocessorid_np(void);
int32_t libc_vita_mod_getentropy(void* buf, uint64_t buflen);
int32_t libc_vita_mod_pipe2(void* fds, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_VITA_MOD_VITA_MOD_WRAPPER_H */
