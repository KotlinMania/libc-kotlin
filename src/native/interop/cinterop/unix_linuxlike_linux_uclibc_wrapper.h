#ifndef LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_uclibc_gettimeofday(void* tp, void* tz);
int32_t libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp(void* attr, int32_t val);
int32_t libc_unix_linuxlike_linux_uclibc_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags);
int32_t libc_unix_linuxlike_linux_uclibc_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout);
int32_t libc_unix_linuxlike_linux_uclibc_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_linuxlike_linux_uclibc_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_unix_linuxlike_linux_uclibc_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int64_t libc_unix_linuxlike_linux_uclibc_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_linuxlike_linux_uclibc_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_linuxlike_linux_uclibc_sethostid(int64_t hostid);
int32_t libc_unix_linuxlike_linux_uclibc_fanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int32_t libc_unix_linuxlike_linux_uclibc_getrlimit64(uint64_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_uclibc_setrlimit64(uint64_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_uclibc_getrlimit(uint64_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_uclibc_setrlimit(uint64_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_uclibc_getpriority(uint32_t which, uint32_t who);
int32_t libc_unix_linuxlike_linux_uclibc_setpriority(uint32_t which, uint32_t who, int32_t prio);
uint64_t libc_unix_linuxlike_linux_uclibc_getauxval(uint64_t type_);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H */
