#ifndef LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeL4reUclibcGettimeofday(void* tp, void* tz);
int32_t libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(void* attr, int32_t val);
int32_t libcUnixLinuxlikeL4reUclibcOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libcUnixLinuxlikeL4reUclibcGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int64_t libcUnixLinuxlikeL4reUclibcPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixLinuxlikeL4reUclibcPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixLinuxlikeL4reUclibcGetrlimit64(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeL4reUclibcSetrlimit64(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeL4reUclibcGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeL4reUclibcSetrlimit(int32_t resource, void* rlim);
uint64_t libcUnixLinuxlikeL4reUclibcGetauxval(uint64_t type);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_UNIX_LINUXLIKE_L4RE_UCLIBC_WRAPPER_H */
