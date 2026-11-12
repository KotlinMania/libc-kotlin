#ifndef LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H
#define LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixNewlibGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixNewlibSetrlimit(int32_t resource, void* rlim);
int32_t libcUnixNewlibStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixNewlibSemDestroy(void* sem);
int32_t libcUnixNewlibSemInit(void* sem, int32_t pshared, uint32_t value);
int32_t libcUnixNewlibAbs(int32_t i);
int64_t libcUnixNewlibLabs(int64_t i);
int32_t libcUnixNewlibRand(void);
void libcUnixNewlibSrand(uint32_t seed);
int32_t libcUnixNewlibBind(int32_t fd, void* addr, uint32_t len);
int32_t libcUnixNewlibClockSettime(uint64_t clockId, void* tp);
int32_t libcUnixNewlibClockGettime(uint64_t clockId, void* tp);
int32_t libcUnixNewlibClockGetres(uint64_t clockId, void* res);
int32_t libcUnixNewlibClosesocket(int32_t sockfd);
int32_t libcUnixNewlibIoctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int64_t libcUnixNewlibRecvfrom(int32_t fd, void* buf, uint64_t n, int32_t flags, void* addr, void* addrLen);
int32_t libcUnixNewlibGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
void* libcUnixNewlibMemalign(uint64_t align, uint64_t size);
int32_t libcUnixNewlibFexecve(int32_t fd, void* argv, void* envp);
int32_t libcUnixNewlibGettimeofday(void* tp, void* tz);
int32_t libcUnixNewlibGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixNewlibSigaltstack(void* ss, void* oss);
int32_t libcUnixNewlibSemClose(void* sem);
int32_t libcUnixNewlibGetdtablesize(void);
int32_t libcUnixNewlibGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixNewlibPthreadSigmask(int32_t how, void* set, void* oldset);
void* libcUnixNewlibSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libcUnixNewlibGetgrnam(const char* name);
int32_t libcUnixNewlibPthreadKill(void* thread, int32_t sig);
int32_t libcUnixNewlibSemUnlink(const char* name);
int32_t libcUnixNewlibDaemon(int32_t nochdir, int32_t noclose);
int32_t libcUnixNewlibGetpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixNewlibGetpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixNewlibSigwait(void* set, void* sig);
int32_t libcUnixNewlibPthreadAtfork(void* prepare, void* parent, void* child);
void* libcUnixNewlibGetgrgid(uint16_t gid);
void* libcUnixNewlibPopen(const char* command, const char* mode);
int32_t libcUnixNewlibUname(void* buf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H */
