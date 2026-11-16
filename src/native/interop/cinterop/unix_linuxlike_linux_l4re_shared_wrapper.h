#ifndef LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxL4reSharedIopl(int32_t level);
int32_t libcUnixLinuxlikeLinuxL4reSharedIoperm(uint64_t from, uint64_t num, int32_t turnOn);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioRead(void* aiocbp);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioWrite(void* aiocbp);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioFsync(int32_t op, void* aiocbp);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioError(void* aiocbp);
int64_t libcUnixLinuxlikeLinuxL4reSharedAioReturn(void* aiocbp);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioSuspend(void* aiocbList, int32_t nitems, void* timeout);
int32_t libcUnixLinuxlikeLinuxL4reSharedAioCancel(int32_t fd, void* aiocbp);
int32_t libcUnixLinuxlikeLinuxL4reSharedLioListio(int32_t mode, void* aiocbList, int32_t nitems, void* sevp);
int64_t libcUnixLinuxlikeLinuxL4reSharedPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixLinuxlikeLinuxL4reSharedPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libcUnixLinuxlikeLinuxL4reSharedGetloadavg(void* loadavg, int32_t nelem);
int64_t libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(int32_t pid, void* localIov, uint64_t liovcnt, void* remoteIov, uint64_t riovcnt, uint64_t flags);
int64_t libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(int32_t pid, void* localIov, uint64_t liovcnt, void* remoteIov, uint64_t riovcnt, uint64_t flags);
int32_t libcUnixLinuxlikeLinuxL4reSharedFutimes(int32_t fd, void* times);
int32_t libcUnixLinuxlikeLinuxL4reSharedStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixLinuxlikeLinuxL4reSharedAbs(int32_t i);
int64_t libcUnixLinuxlikeLinuxL4reSharedLabs(int64_t i);
int32_t libcUnixLinuxlikeLinuxL4reSharedRand(void);
void libcUnixLinuxlikeLinuxL4reSharedSrand(uint32_t seed);
double libcUnixLinuxlikeLinuxL4reSharedDrand48(void);
double libcUnixLinuxlikeLinuxL4reSharedErand48(void* xseed);
int64_t libcUnixLinuxlikeLinuxL4reSharedLrand48(void);
int64_t libcUnixLinuxlikeLinuxL4reSharedNrand48(void* xseed);
int64_t libcUnixLinuxlikeLinuxL4reSharedJrand48(void* xseed);
void libcUnixLinuxlikeLinuxL4reSharedSrand48(int64_t seed);
void libcUnixLinuxlikeLinuxL4reSharedSetpwent(void);
void libcUnixLinuxlikeLinuxL4reSharedEndpwent(void);
void* libcUnixLinuxlikeLinuxL4reSharedGetpwent(void);
void libcUnixLinuxlikeLinuxL4reSharedSetgrent(void);
void libcUnixLinuxlikeLinuxL4reSharedEndgrent(void);
void* libcUnixLinuxlikeLinuxL4reSharedGetgrent(void);
void libcUnixLinuxlikeLinuxL4reSharedSetspent(void);
void libcUnixLinuxlikeLinuxL4reSharedEndspent(void);
void* libcUnixLinuxlikeLinuxL4reSharedGetspent(void);
void* libcUnixLinuxlikeLinuxL4reSharedGetspnam(const char* name);
int32_t libcUnixLinuxlikeLinuxL4reSharedShmget(int32_t key, uint64_t size, int32_t shmflg);
void* libcUnixLinuxlikeLinuxL4reSharedShmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libcUnixLinuxlikeLinuxL4reSharedShmdt(void* shmaddr);
int32_t libcUnixLinuxlikeLinuxL4reSharedShmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libcUnixLinuxlikeLinuxL4reSharedMprotect(void* addr, uint64_t len, int32_t prot);
void* libcUnixLinuxlikeLinuxL4reSharedErrnoLocation(void);
void* libcUnixLinuxlikeLinuxL4reSharedMremap(void* addr, uint64_t len, uint64_t newLen, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxL4reSharedGlob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libcUnixLinuxlikeLinuxL4reSharedGlobfree(void* pglob);
void libcUnixLinuxlikeLinuxL4reSharedSeekdir(void* dirp, int64_t loc);
int64_t libcUnixLinuxlikeLinuxL4reSharedTelldir(void* dirp);
int32_t libcUnixLinuxlikeLinuxL4reSharedMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixLinuxlikeLinuxL4reSharedMsync(void* addr, uint64_t len, int32_t flags);
int64_t libcUnixLinuxlikeLinuxL4reSharedRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
char* libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(int32_t item);
char* libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(int32_t item, void* locale);
int32_t libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(int32_t policy);
int32_t libcUnixLinuxlikeLinuxL4reSharedSettimeofday(void* tv, void* tz);
int32_t libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(void* sem, void* abstime);
int32_t libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(void* sem, void* sval);
int32_t libcUnixLinuxlikeLinuxL4reSharedMount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data);
int32_t libcUnixLinuxlikeLinuxL4reSharedPrctl(int32_t option, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxL4reSharedPpoll(void* fds, uint64_t nfds, void* timeout, void* sigmask);
int32_t libcUnixLinuxlikeLinuxL4reSharedSethostname(const char* name, uint64_t len);
int32_t libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(int32_t policy);
int32_t libcUnixLinuxlikeLinuxL4reSharedSysinfo(void* info);
int32_t libcUnixLinuxlikeLinuxL4reSharedSigsuspend(void* mask);
int32_t libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxL4reSharedSemClose(void* sem);
int32_t libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeLinuxL4reSharedInitgroups(const char* user, uint16_t group);
void* libcUnixLinuxlikeLinuxL4reSharedSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libcUnixLinuxlikeLinuxL4reSharedGetgrnam(const char* name);
int32_t libcUnixLinuxlikeLinuxL4reSharedSemUnlink(const char* name);
int32_t libcUnixLinuxlikeLinuxL4reSharedDaemon(int32_t nochdir, int32_t noclose);
int32_t libcUnixLinuxlikeLinuxL4reSharedSigwait(void* set, void* sig);
void* libcUnixLinuxlikeLinuxL4reSharedGetgrgid(uint16_t gid);
void* libcUnixLinuxlikeLinuxL4reSharedPopen(const char* command, const char* mode);
int32_t libcUnixLinuxlikeLinuxL4reSharedFaccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
int32_t libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(void* callback, void* data);
void* libcUnixLinuxlikeLinuxL4reSharedSetmntent(const char* filename, const char* ty);
void* libcUnixLinuxlikeLinuxL4reSharedGetmntent(void* stream);
int32_t libcUnixLinuxlikeLinuxL4reSharedAddmntent(void* stream, void* mnt);
int32_t libcUnixLinuxlikeLinuxL4reSharedEndmntent(void* streamp);
char* libcUnixLinuxlikeLinuxL4reSharedHasmntopt(void* mnt, const char* opt);
int32_t libcUnixLinuxlikeLinuxL4reSharedRegcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libcUnixLinuxlikeLinuxL4reSharedRegexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libcUnixLinuxlikeLinuxL4reSharedRegerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbufSize);
void libcUnixLinuxlikeLinuxL4reSharedRegfree(void* preg);
void* libcUnixLinuxlikeLinuxL4reSharedIconvOpen(const char* tocode, const char* fromcode);
uint64_t libcUnixLinuxlikeLinuxL4reSharedIconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft);
int32_t libcUnixLinuxlikeLinuxL4reSharedIconvClose(void* cd);
int32_t libcUnixLinuxlikeLinuxL4reSharedGettid(void);
int32_t libcUnixLinuxlikeLinuxL4reSharedTimerCreate(int32_t clockid, void* sevp, void* timerid);
int32_t libcUnixLinuxlikeLinuxL4reSharedTimerDelete(void* timerid);
int32_t libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(void* timerid);
int32_t libcUnixLinuxlikeLinuxL4reSharedTimerGettime(void* timerid, void* currValue);
int32_t libcUnixLinuxlikeLinuxL4reSharedTimerSettime(void* timerid, int32_t flags, void* newValue, void* oldValue);
void* libcUnixLinuxlikeLinuxL4reSharedMemmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu(void);
int32_t libcUnixLinuxlikeLinuxL4reSharedGetoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
int64_t libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(int32_t fdIn, void* offIn, int32_t fdOut, void* offOut, uint64_t len, uint32_t flags);
void* libcUnixLinuxlikeLinuxL4reSharedFreopen64(const char* filename, const char* mode, void* file);
int32_t libcUnixLinuxlikeLinuxL4reSharedFseeko64(void* stream, int64_t offset, int32_t whence);
int32_t libcUnixLinuxlikeLinuxL4reSharedFsetpos64(void* stream, void* ptr);
int64_t libcUnixLinuxlikeLinuxL4reSharedFtello64(void* stream);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H */
