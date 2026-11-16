#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxGnuFgetspentR(void* fp, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
int32_t libcUnixLinuxlikeLinuxGnuSgetspentR(const char* s, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
int32_t libcUnixLinuxlikeLinuxGnuGetspentR(void* spbuf, char* buf, uint64_t buflen, void* spbufp);
void libcUnixLinuxlikeLinuxGnuQsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int32_t libcUnixLinuxlikeLinuxGnuSendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuRecvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout);
int32_t libcUnixLinuxlikeLinuxGnuGetrlimit64(uint32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxGnuSetrlimit64(uint32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxGnuGetrlimit(uint32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxGnuSetrlimit(uint32_t resource, void* rlim);
int32_t libcUnixLinuxlikeLinuxGnuPrlimit(int32_t pid, uint32_t resource, void* newLimit, void* oldLimit);
int32_t libcUnixLinuxlikeLinuxGnuPrlimit64(int32_t pid, uint32_t resource, void* newLimit, void* oldLimit);
int32_t libcUnixLinuxlikeLinuxGnuUtmpname(const char* file);
int32_t libcUnixLinuxlikeLinuxGnuUtmpxname(const char* file);
void* libcUnixLinuxlikeLinuxGnuGetutxent(void);
void* libcUnixLinuxlikeLinuxGnuGetutxid(void* ut);
void* libcUnixLinuxlikeLinuxGnuGetutxline(void* ut);
void* libcUnixLinuxlikeLinuxGnuPututxline(void* ut);
void libcUnixLinuxlikeLinuxGnuSetutxent(void);
void libcUnixLinuxlikeLinuxGnuEndutxent(void);
int32_t libcUnixLinuxlikeLinuxGnuGetpt(void);
int32_t libcUnixLinuxlikeLinuxGnuMallopt(int32_t param, int32_t value);
int32_t libcUnixLinuxlikeLinuxGnuGettimeofday(void* tp, void* tz);
int32_t libcUnixLinuxlikeLinuxGnuGetentropy(void* buf, uint64_t buflen);
int64_t libcUnixLinuxlikeLinuxGnuGetrandom(void* buf, uint64_t buflen, uint32_t flags);
uint64_t libcUnixLinuxlikeLinuxGnuGetauxval(uint64_t type);
int32_t libcUnixLinuxlikeLinuxGnuAdjtimex(void* buf);
int32_t libcUnixLinuxlikeLinuxGnuNtpAdjtime(void* buf);
int32_t libcUnixLinuxlikeLinuxGnuNtpGettime(void* buf);
int32_t libcUnixLinuxlikeLinuxGnuClockAdjtime(int32_t clkId, void* buf);
int32_t libcUnixLinuxlikeLinuxGnuFanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int64_t libcUnixLinuxlikeLinuxGnuPreadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libcUnixLinuxlikeLinuxGnuPwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libcUnixLinuxlikeLinuxGnuPreadv64v2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libcUnixLinuxlikeLinuxGnuPwritev64v2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuRenameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);
void libcUnixLinuxlikeLinuxGnuExplicitBzero(void* s, uint64_t len);
void* libcUnixLinuxlikeLinuxGnuReallocarray(void* ptr, uint64_t nmemb, uint64_t size);
char* libcUnixLinuxlikeLinuxGnuCtermid(char* s);
int32_t libcUnixLinuxlikeLinuxGnuBacktrace(void* buf, int32_t sz);
void* libcUnixLinuxlikeLinuxGnuBacktraceSymbols(void* buffer, int32_t len);
void libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(void* buffer, int32_t len, int32_t fd);
int32_t libcUnixLinuxlikeLinuxGnuGlob64(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libcUnixLinuxlikeLinuxGnuGlobfree64(void* pglob);
int64_t libcUnixLinuxlikeLinuxGnuPtrace(uint32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeLinuxGnuGetpriority(uint32_t which, uint32_t who);
int32_t libcUnixLinuxlikeLinuxGnuSetpriority(uint32_t which, uint32_t who, int32_t prio);
int32_t libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(void* attr, int32_t val);
int32_t libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(void* thread, void* retval);
int32_t libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(void* thread, void* retval, void* abstime);
void libcUnixLinuxlikeLinuxGnuMallocStats(void);
int32_t libcUnixLinuxlikeLinuxGnuMallocInfo(int32_t options, void* stream);
uint64_t libcUnixLinuxlikeLinuxGnuMallocUsableSize(void* ptr);
int32_t libcUnixLinuxlikeLinuxGnuGetpwentR(void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxGnuGetgrentR(void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxGnuFgetpwentR(void* stream, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxGnuFgetgrentR(void* stream, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxGnuPutpwent(void* p, void* stream);
int32_t libcUnixLinuxlikeLinuxGnuPutgrent(void* grp, void* stream);
int32_t libcUnixLinuxlikeLinuxGnuSethostid(int64_t hostid);
int32_t libcUnixLinuxlikeLinuxGnuMemfdCreate(const char* name, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuMlock2(void* addr, uint64_t len, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuEuidaccess(const char* pathname, int32_t mode);
int32_t libcUnixLinuxlikeLinuxGnuEaccess(const char* pathname, int32_t mode);
char* libcUnixLinuxlikeLinuxGnuAsctimeR(void* tm, char* buf);
char* libcUnixLinuxlikeLinuxGnuCtimeR(void* timep, char* buf);
char* libcUnixLinuxlikeLinuxGnuDirname(char* path);
char* libcUnixLinuxlikeLinuxGnuPosixBasename(char* path);
char* libcUnixLinuxlikeLinuxGnuGnuBasename(const char* path);
void* libcUnixLinuxlikeLinuxGnuDlmopen(int64_t lmid, const char* filename, int32_t flag);
int32_t libcUnixLinuxlikeLinuxGnuDlinfo(void* handle, int32_t request, void* info);
int32_t libcUnixLinuxlikeLinuxGnuDladdr1(void* addr, void* info, void* extraInfo, int32_t flags);
void* libcUnixLinuxlikeLinuxGnuDlvsym(void* handle, const char* symbol, const char* version);
int32_t libcUnixLinuxlikeLinuxGnuMallocTrim(uint64_t pad);
const char* libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease(void);
const char* libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion(void);
int32_t libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(void* actions, const char* path);
int32_t libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(void* actions, int32_t fd);
int32_t libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(void* actions, int32_t from);
int32_t libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(void* actions, int32_t tcfd);
void* libcUnixLinuxlikeLinuxGnuGetmntentR(void* stream, void* mntbuf, char* buf, int32_t buflen);
int32_t libcUnixLinuxlikeLinuxGnuExecveat(int32_t dirfd, const char* pathname, void* argv, void* envp, int32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuCloseRange(uint32_t first, uint32_t last, int32_t flags);
int32_t libcUnixLinuxlikeLinuxGnuMqNotify(void* mqdes, void* sevp);
int32_t libcUnixLinuxlikeLinuxGnuEpollPwait2(int32_t epfd, void* events, int32_t maxevents, void* timeout, void* sigmask);
void* libcUnixLinuxlikeLinuxGnuMempcpy(void* dest, void* src, uint64_t n);
int32_t libcUnixLinuxlikeLinuxGnuTgkill(int32_t tgid, int32_t tid, int32_t sig);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H */
