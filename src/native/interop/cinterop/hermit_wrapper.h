#ifndef LIBC_HERMIT_HERMIT_WRAPPER_H
#define LIBC_HERMIT_HERMIT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcHermitAlloc(uint64_t size, uint64_t align);
void* libcHermitAllocZeroed(uint64_t size, uint64_t align);
void* libcHermitRealloc(void* ptr, uint64_t size, uint64_t align, uint64_t newSize);
void libcHermitDealloc(void* ptr, uint64_t size, uint64_t align);
void libcHermitExit(int32_t status);
void libcHermitAbort(void);
int32_t libcHermitErrno(void);
int32_t libcHermitClockGettime(int32_t clockid, void* tp);
int32_t libcHermitNanosleep(void* req);
uint64_t libcHermitAvailableParallelism(void);
int32_t libcHermitFutexWait(void* address, uint32_t expected, void* timeout, uint32_t flags);
int32_t libcHermitFutexWake(void* address, int32_t count);
int32_t libcHermitStat(const char* path, void* arg1Stat);
int32_t libcHermitFstat(int32_t fd, void* arg1Stat);
int32_t libcHermitLstat(const char* path, void* arg1Stat);
int32_t libcHermitOpen(const char* path, int32_t flags, uint32_t mode);
int32_t libcHermitUnlink(const char* path);
int32_t libcHermitMkdir(const char* path, uint32_t mode);
int32_t libcHermitRmdir(const char* path);
int64_t libcHermitRead(int32_t fd, void* buf, uint64_t len);
int64_t libcHermitWrite(int32_t fd, void* buf, uint64_t len);
int64_t libcHermitReadv(int32_t fd, void* iov, uint64_t iovcnt);
int64_t libcHermitWritev(int32_t fd, void* iov, uint64_t iovcnt);
int32_t libcHermitClose(int32_t fd);
int32_t libcHermitDup(int32_t fd);
int32_t libcHermitFcntl(int32_t fd, int32_t cmd, int32_t arg);
int64_t libcHermitGetdents64(int32_t fd, void* dirp, uint64_t count);
int32_t libcHermitGetaddrinfo(const char* nodename, const char* servname, void* hints, void* res);
void libcHermitFreeaddrinfo(void* ai);
int32_t libcHermitSocket(int32_t domain, int32_t ty, int32_t protocol);
int32_t libcHermitBind(int32_t sockfd, void* addr, uint32_t addrlen);
int32_t libcHermitListen(int32_t sockfd, int32_t backlog);
int32_t libcHermitAccept(int32_t sockfd, void* addr, void* addrlen);
int32_t libcHermitConnect(int32_t sockfd, void* addr, uint32_t addrlen);
int64_t libcHermitRecv(int32_t sockfd, void* buf, uint64_t len, int32_t flags);
int64_t libcHermitRecvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int64_t libcHermitSend(int32_t sockfd, void* buf, uint64_t len, int32_t flags);
int64_t libcHermitSendto(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* to, uint32_t tolen);
int32_t libcHermitGetpeername(int32_t sockfd, void* addr, void* addrlen);
int32_t libcHermitGetsockname(int32_t sockfd, void* addr, void* addrlen);
int32_t libcHermitGetsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen);
int32_t libcHermitSetsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen);
int32_t libcHermitIoctl(int32_t sockfd, int32_t cmd, void* argp);
int32_t libcHermitShutdown(int32_t sockfd, int32_t how);
int32_t libcHermitEventfd(uint64_t initval, int16_t flags);
int32_t libcHermitPoll(void* fds, uint64_t nfds, int32_t timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_HERMIT_HERMIT_WRAPPER_H */
