#ifndef LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxUclibcGettimeofday(void* tp, void* tz);
int32_t libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(void* attr, int32_t val);
int64_t libcUnixLinuxlikeLinuxUclibcPtrace(uint32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxUclibcSendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags);
int32_t libcUnixLinuxlikeLinuxUclibcRecvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout);
int32_t libcUnixLinuxlikeLinuxUclibcOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libcUnixLinuxlikeLinuxUclibcForkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libcUnixLinuxlikeLinuxUclibcGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int64_t libcUnixLinuxlikeLinuxUclibcPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixLinuxlikeLinuxUclibcPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixLinuxlikeLinuxUclibcSethostid(int64_t hostid);
int32_t libcUnixLinuxlikeLinuxUclibcFanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int32_t libcUnixLinuxlikeLinuxUclibcGetrlimit64(uint64_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxUclibcSetrlimit64(uint64_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxUclibcGetrlimit(uint64_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxUclibcSetrlimit(uint64_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxUclibcGetpriority(uint32_t which, uint32_t who);
int32_t libcUnixLinuxlikeLinuxUclibcSetpriority(uint32_t which, uint32_t who, int32_t prio);
uint64_t libcUnixLinuxlikeLinuxUclibcGetauxval(uint64_t type);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_WRAPPER_H */
