#ifndef LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H
#define LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixNewlibVitaFutimens(int32_t fd, void* times);
int64_t libcUnixNewlibVitaWritev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixNewlibVitaReadv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixNewlibVitaSendmsg(int32_t s, void* msg, int32_t flags);
int64_t libcUnixNewlibVitaRecvmsg(int32_t s, void* msg, int32_t flags);
int32_t libcUnixNewlibVitaPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcUnixNewlibVitaPthreadAttrGetschedparam(void* attr, void* param);
int32_t libcUnixNewlibVitaPthreadAttrSetschedparam(void* attr, void* param);
int32_t libcUnixNewlibVitaPthreadAttrGetprocessoridNp(void* attr, void* processorId);
int32_t libcUnixNewlibVitaPthreadAttrSetprocessoridNp(void* attr, int32_t processorId);
int32_t libcUnixNewlibVitaPthreadGetschedparam(void* native, void* policy, void* param);
int32_t libcUnixNewlibVitaPthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libcUnixNewlibVitaPthreadCondattrGetclock(void* attr, void* clockId);
int32_t libcUnixNewlibVitaPthreadCondattrSetclock(void* attr, uint64_t clockId);
int32_t libcUnixNewlibVitaPthreadGetprocessoridNp(void);
int32_t libcUnixNewlibVitaGetentropy(void* buf, uint64_t buflen);
int32_t libcUnixNewlibVitaPipe2(void* fds, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_VITA_UNIX_NEWLIB_VITA_WRAPPER_H */
