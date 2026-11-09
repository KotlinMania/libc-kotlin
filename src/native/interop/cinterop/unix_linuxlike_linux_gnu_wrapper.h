#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_gnu_fgetspentR(void* fp, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
int32_t libc_unix_linuxlike_linux_gnu_sgetspentR(const char* s, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
int32_t libc_unix_linuxlike_linux_gnu_getspentR(void* spbuf, char* buf, uint64_t buflen, void* spbufp);
void libc_unix_linuxlike_linux_gnu_qsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int32_t libc_unix_linuxlike_linux_gnu_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout);
int32_t libc_unix_linuxlike_linux_gnu_getrlimit64(uint32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_gnu_setrlimit64(uint32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_gnu_getrlimit(uint32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_gnu_setrlimit(uint32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_gnu_prlimit(int32_t pid, uint32_t resource, void* new_limit, void* old_limit);
int32_t libc_unix_linuxlike_linux_gnu_prlimit64(int32_t pid, uint32_t resource, void* new_limit, void* old_limit);
int32_t libc_unix_linuxlike_linux_gnu_utmpname(const char* file);
int32_t libc_unix_linuxlike_linux_gnu_utmpxname(const char* file);
void* libc_unix_linuxlike_linux_gnu_getutxent(void);
void* libc_unix_linuxlike_linux_gnu_getutxid(void* ut);
void* libc_unix_linuxlike_linux_gnu_getutxline(void* ut);
void* libc_unix_linuxlike_linux_gnu_pututxline(void* ut);
void libc_unix_linuxlike_linux_gnu_setutxent(void);
void libc_unix_linuxlike_linux_gnu_endutxent(void);
int32_t libc_unix_linuxlike_linux_gnu_getpt(void);
int32_t libc_unix_linuxlike_linux_gnu_mallopt(int32_t param, int32_t value);
int32_t libc_unix_linuxlike_linux_gnu_gettimeofday(void* tp, void* tz);
int32_t libc_unix_linuxlike_linux_gnu_getentropy(void* buf, uint64_t buflen);
int64_t libc_unix_linuxlike_linux_gnu_getrandom(void* buf, uint64_t buflen, uint32_t flags);
uint64_t libc_unix_linuxlike_linux_gnu_getauxval(uint64_t type_);
int32_t libc_unix_linuxlike_linux_gnu_adjtimex(void* buf);
int32_t libc_unix_linuxlike_linux_gnu_ntpAdjtime(void* buf);
int32_t libc_unix_linuxlike_linux_gnu_ntpGettime(void* buf);
int32_t libc_unix_linuxlike_linux_gnu_clockAdjtime(int32_t clk_id, void* buf);
int32_t libc_unix_linuxlike_linux_gnu_fanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int64_t libc_unix_linuxlike_linux_gnu_preadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libc_unix_linuxlike_linux_gnu_pwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libc_unix_linuxlike_linux_gnu_preadv64v2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libc_unix_linuxlike_linux_gnu_pwritev64v2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);
void libc_unix_linuxlike_linux_gnu_explicitBzero(void* s, uint64_t len);
void* libc_unix_linuxlike_linux_gnu_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
char* libc_unix_linuxlike_linux_gnu_ctermid(char* s);
int32_t libc_unix_linuxlike_linux_gnu_backtrace(void* buf, int32_t sz);
void* libc_unix_linuxlike_linux_gnu_backtraceSymbols(void* buffer, int32_t len);
void libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd(void* buffer, int32_t len, int32_t fd);
int32_t libc_unix_linuxlike_linux_gnu_glob64(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_unix_linuxlike_linux_gnu_globfree64(void* pglob);
int32_t libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_linux_gnu_getpriority(uint32_t which, uint32_t who);
int32_t libc_unix_linuxlike_linux_gnu_setpriority(uint32_t which, uint32_t who, int32_t prio);
int32_t libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp(void* attr, void* val);
int32_t libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp(void* attr, int32_t val);
int32_t libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(void* thread, void* retval);
int32_t libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(void* thread, void* retval, void* abstime);
void libc_unix_linuxlike_linux_gnu_mallocStats(void);
int32_t libc_unix_linuxlike_linux_gnu_mallocInfo(int32_t options, void* stream);
uint64_t libc_unix_linuxlike_linux_gnu_mallocUsableSize(void* ptr);
int32_t libc_unix_linuxlike_linux_gnu_getpwentR(void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_gnu_getgrentR(void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_gnu_fgetpwentR(void* stream, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_gnu_fgetgrentR(void* stream, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_gnu_putpwent(void* p, void* stream);
int32_t libc_unix_linuxlike_linux_gnu_putgrent(void* grp, void* stream);
int32_t libc_unix_linuxlike_linux_gnu_sethostid(int64_t hostid);
int32_t libc_unix_linuxlike_linux_gnu_memfdCreate(const char* name, uint32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_mlock2(void* addr, uint64_t len, uint32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_euidaccess(const char* pathname, int32_t mode);
int32_t libc_unix_linuxlike_linux_gnu_eaccess(const char* pathname, int32_t mode);
char* libc_unix_linuxlike_linux_gnu_asctimeR(void* tm, char* buf);
char* libc_unix_linuxlike_linux_gnu_ctimeR(void* timep, char* buf);
char* libc_unix_linuxlike_linux_gnu_dirname(char* path);
char* libc_unix_linuxlike_linux_gnu_posixBasename(char* path);
char* libc_unix_linuxlike_linux_gnu_gnuBasename(const char* path);
void* libc_unix_linuxlike_linux_gnu_dlmopen(int64_t lmid, const char* filename, int32_t flag);
int32_t libc_unix_linuxlike_linux_gnu_dlinfo(void* handle, int32_t request, void* info);
int32_t libc_unix_linuxlike_linux_gnu_dladdr1(void* addr, void* info, void* extra_info, int32_t flags);
void* libc_unix_linuxlike_linux_gnu_dlvsym(void* handle, const char* symbol, const char* version);
int32_t libc_unix_linuxlike_linux_gnu_mallocTrim(uint64_t arg_0_pad);
const char* libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease(void);
const char* libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion(void);
int32_t libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp(void* actions, const char* path);
int32_t libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp(void* actions, int32_t fd);
int32_t libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp(void* actions, int32_t from);
int32_t libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp(void* actions, int32_t tcfd);
void* libc_unix_linuxlike_linux_gnu_getmntentR(void* stream, void* mntbuf, char* buf, int32_t buflen);
int32_t libc_unix_linuxlike_linux_gnu_execveat(int32_t dirfd, const char* pathname, void* argv, void* envp, int32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_closeRange(uint32_t first, uint32_t last, int32_t flags);
int32_t libc_unix_linuxlike_linux_gnu_mqNotify(void* mqdes, void* sevp);
int32_t libc_unix_linuxlike_linux_gnu_epollPwait2(int32_t epfd, void* events, int32_t maxevents, void* timeout, void* sigmask);
void* libc_unix_linuxlike_linux_gnu_mempcpy(void* dest, void* src, uint64_t n);
int32_t libc_unix_linuxlike_linux_gnu_tgkill(int32_t tgid, int32_t tid, int32_t sig);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_UNIX_LINUXLIKE_LINUX_GNU_WRAPPER_H */
