#ifndef LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_l4re_uclibc_gettimeofday(void* tp, void* tz);
int32_t libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp(void* attr, int32_t val);
int32_t libc_unix_linuxlike_l4re_uclibc_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_linuxlike_l4re_uclibc_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int64_t libc_unix_linuxlike_l4re_uclibc_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_linuxlike_l4re_uclibc_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_linuxlike_l4re_uclibc_getrlimit64(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_l4re_uclibc_setrlimit64(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_l4re_uclibc_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_l4re_uclibc_setrlimit(int32_t resource, void* rlim);
uint64_t libc_unix_linuxlike_l4re_uclibc_getauxval(uint64_t type_);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H */
