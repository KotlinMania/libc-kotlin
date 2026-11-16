#ifndef LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H
#define LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcUnixNuttxErrno(void);
int32_t libcUnixNuttxBind(int32_t sockfd, void* addr, uint32_t addrlen);
int32_t libcUnixNuttxIoctl(int32_t fd, int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixNuttxDirfd(void* dirp);
int32_t libcUnixNuttxRecvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* srcAddr, void* addrlen);
int32_t libcUnixNuttxPthreadCreate(void* thread, void* attr, void* startRoutine, void* arg);
int32_t libcUnixNuttxClockGettime(int32_t clockid, void* tp);
int32_t libcUnixNuttxFutimens(int32_t fd, void* times);
int32_t libcUnixNuttxPthreadCondattrSetclock(void* attr, int32_t clockId);
int32_t libcUnixNuttxPthreadSetnameNp(void* thread, const char* name);
int32_t libcUnixNuttxPthreadGetnameNp(void* thread, char* name, uint64_t len);
int64_t libcUnixNuttxGetrandom(void* buf, uint64_t buflen, uint32_t flags);
uint32_t libcUnixNuttxArc4random(void);
void libcUnixNuttxArc4randomBuf(void* bytes, uint64_t nbytes);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H */
