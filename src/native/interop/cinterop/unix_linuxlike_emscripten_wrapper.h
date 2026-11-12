#ifndef LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeEmscriptenGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeEmscriptenSetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeEmscriptenStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixLinuxlikeEmscriptenAbs(int32_t i);
int64_t libcUnixLinuxlikeEmscriptenLabs(int64_t i);
int32_t libcUnixLinuxlikeEmscriptenRand(void);
void libcUnixLinuxlikeEmscriptenSrand(uint32_t seed);
int32_t libcUnixLinuxlikeEmscriptenGettimeofday(void* tp, void* tz);
void libcUnixLinuxlikeEmscriptenSetpwent(void);
void libcUnixLinuxlikeEmscriptenEndpwent(void);
void* libcUnixLinuxlikeEmscriptenGetpwent(void);
int32_t libcUnixLinuxlikeEmscriptenShmOpen(const char* name, int32_t oflag, uint32_t mode);
int32_t libcUnixLinuxlikeEmscriptenMprotect(void* addr, uint64_t len, int32_t prot);
void* libcUnixLinuxlikeEmscriptenErrnoLocation(void);
int32_t libcUnixLinuxlikeEmscriptenPosixFallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libcUnixLinuxlikeEmscriptenPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixLinuxlikeEmscriptenPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixLinuxlikeEmscriptenDup3(int32_t oldfd, int32_t newfd, int32_t flags);
char* libcUnixLinuxlikeEmscriptenNlLanginfoL(int32_t item, void* locale);
int32_t libcUnixLinuxlikeEmscriptenAccept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libcUnixLinuxlikeEmscriptenGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libcUnixLinuxlikeEmscriptenGetloadavg(void* loadavg, int32_t nelem);
int32_t libcUnixLinuxlikeEmscriptenMkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
void* libcUnixLinuxlikeEmscriptenMremap(void* addr, uint64_t len, uint64_t newLen, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeEmscriptenGlob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libcUnixLinuxlikeEmscriptenGlobfree(void* pglob);
int32_t libcUnixLinuxlikeEmscriptenPosixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixLinuxlikeEmscriptenShmUnlink(const char* name);
void libcUnixLinuxlikeEmscriptenSeekdir(void* dirp, int64_t loc);
int64_t libcUnixLinuxlikeEmscriptenTelldir(void* dirp);
int32_t libcUnixLinuxlikeEmscriptenMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixLinuxlikeEmscriptenMsync(void* addr, uint64_t len, int32_t flags);
int64_t libcUnixLinuxlikeEmscriptenRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libcUnixLinuxlikeEmscriptenMkstemps(char* arg0Template, int32_t suffixlen);
char* libcUnixLinuxlikeEmscriptenNlLanginfo(int32_t item);
int32_t libcUnixLinuxlikeEmscriptenSendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags);
int32_t libcUnixLinuxlikeEmscriptenRecvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout);
void libcUnixLinuxlikeEmscriptenSync(void);
int32_t libcUnixLinuxlikeEmscriptenIoctl(int32_t fd, int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeEmscriptenGetpriority(int32_t which, uint32_t who);
int32_t libcUnixLinuxlikeEmscriptenSetpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libcUnixLinuxlikeEmscriptenGetentropy(void* buf, uint64_t buflen);
void* libcUnixLinuxlikeEmscriptenGetgrgid(uint16_t gid);
void* libcUnixLinuxlikeEmscriptenGetgrnam(const char* name);
int32_t libcUnixLinuxlikeEmscriptenGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeEmscriptenGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H */
