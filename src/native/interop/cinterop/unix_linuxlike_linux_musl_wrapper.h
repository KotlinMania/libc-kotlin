#ifndef LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxMuslGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxMuslSetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxMuslPrlimit(int32_t pid, int32_t resource, void* newLimit, void* oldLimit);
int32_t libcUnixLinuxlikeLinuxMuslGettimeofday(void* tp, void* tz);
int64_t libcUnixLinuxlikeLinuxMuslPtrace(int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxMuslGetpriority(int32_t which, uint32_t who);
int32_t libcUnixLinuxlikeLinuxMuslSetpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libcUnixLinuxlikeLinuxMuslFanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int64_t libcUnixLinuxlikeLinuxMuslPreadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libcUnixLinuxlikeLinuxMuslPwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
uint64_t libcUnixLinuxlikeLinuxMuslGetauxval(uint64_t type);
void libcUnixLinuxlikeLinuxMuslExplicitBzero(void* s, uint64_t len);
void* libcUnixLinuxlikeLinuxMuslReallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libcUnixLinuxlikeLinuxMuslAdjtimex(void* buf);
int32_t libcUnixLinuxlikeLinuxMuslClockAdjtime(int32_t clkId, void* buf);
char* libcUnixLinuxlikeLinuxMuslCtermid(char* s);
int32_t libcUnixLinuxlikeLinuxMuslMemfdCreate(const char* name, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxMuslMlock2(void* addr, uint64_t len, uint32_t flags);
uint64_t libcUnixLinuxlikeLinuxMuslMallocUsableSize(void* ptr);
int32_t libcUnixLinuxlikeLinuxMuslEuidaccess(const char* pathname, int32_t mode);
int32_t libcUnixLinuxlikeLinuxMuslEaccess(const char* pathname, int32_t mode);
char* libcUnixLinuxlikeLinuxMuslAsctimeR(void* tm, char* buf);
char* libcUnixLinuxlikeLinuxMuslDirname(char* path);
char* libcUnixLinuxlikeLinuxMuslBasename(char* path);
int64_t libcUnixLinuxlikeLinuxMuslGetrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(void* actions, const char* path);
int32_t libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(void* actions, int32_t fd);
void* libcUnixLinuxlikeLinuxMuslGetutxent(void);
void* libcUnixLinuxlikeLinuxMuslGetutxid(void* ut);
void* libcUnixLinuxlikeLinuxMuslGetutxline(void* ut);
void* libcUnixLinuxlikeLinuxMuslPututxline(void* ut);
void libcUnixLinuxlikeLinuxMuslSetutxent(void);
void libcUnixLinuxlikeLinuxMuslEndutxent(void);
int32_t libcUnixLinuxlikeLinuxMuslUtmpxname(const char* file);
int32_t libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(void* thread, void* retval);
int32_t libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(void* thread, void* retval, void* abstime);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H */
