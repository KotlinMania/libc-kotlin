#ifndef LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H
#define LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_newlib_vita_futimens(int32_t fd, void* times);
int64_t libc_unix_newlib_vita_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_newlib_vita_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_newlib_vita_sendmsg(int32_t s, void* msg, int32_t flags);
int64_t libc_unix_newlib_vita_recvmsg(int32_t s, void* msg, int32_t flags);
int32_t libc_unix_newlib_vita_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_unix_newlib_vita_pthreadAttrGetschedparam(void* attr, void* param);
int32_t libc_unix_newlib_vita_pthreadAttrSetschedparam(void* attr, void* param);
int32_t libc_unix_newlib_vita_pthreadAttrGetprocessoridNp(void* attr, void* processor_id);
int32_t libc_unix_newlib_vita_pthreadAttrSetprocessoridNp(void* attr, int32_t processor_id);
int32_t libc_unix_newlib_vita_pthreadGetschedparam(void* native, void* policy, void* param);
int32_t libc_unix_newlib_vita_pthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libc_unix_newlib_vita_pthreadCondattrGetclock(void* attr, void* clock_id);
int32_t libc_unix_newlib_vita_pthreadCondattrSetclock(void* attr, uint64_t clock_id);
int32_t libc_unix_newlib_vita_pthreadGetprocessoridNp(void);
int32_t libc_unix_newlib_vita_getentropy(void* buf, uint64_t buflen);
int32_t libc_unix_newlib_vita_pipe2(void* fds, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H */
