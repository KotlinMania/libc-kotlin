#ifndef LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixLinuxlikeAndroidSetgrent(void);
void libcUnixLinuxlikeAndroidEndgrent(void);
void* libcUnixLinuxlikeAndroidGetgrent(void);
int32_t libcUnixLinuxlikeAndroidGetrlimit64(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeAndroidSetrlimit64(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeAndroidGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeAndroidSetrlimit(int32_t resource, void* rlim);
int32_t libcUnixLinuxlikeAndroidPrlimit(int32_t pid, int32_t resource, void* newLimit, void* oldLimit);
int32_t libcUnixLinuxlikeAndroidPrlimit64(int32_t pid, int32_t resource, void* newLimit, void* oldLimit);
int32_t libcUnixLinuxlikeAndroidStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixLinuxlikeAndroidGettimeofday(void* tp, void* tz);
int32_t libcUnixLinuxlikeAndroidMlock2(void* addr, uint64_t len, int32_t flags);
int32_t libcUnixLinuxlikeAndroidMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixLinuxlikeAndroidMsync(void* addr, uint64_t len, int32_t flags);
int32_t libcUnixLinuxlikeAndroidMprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcUnixLinuxlikeAndroidGetnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int64_t libcUnixLinuxlikeAndroidPreadv(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libcUnixLinuxlikeAndroidPwritev(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libcUnixLinuxlikeAndroidProcessVmReadv(int32_t pid, void* localIov, uint64_t localIovCount, void* remoteIov, uint64_t remoteIovCount, uint64_t flags);
int64_t libcUnixLinuxlikeAndroidProcessVmWritev(int32_t pid, void* localIov, uint64_t localIovCount, void* remoteIov, uint64_t remoteIovCount, uint64_t flags);
int64_t libcUnixLinuxlikeAndroidPtrace(int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeAndroidGetpriority(int32_t which, uint32_t who);
int32_t libcUnixLinuxlikeAndroidSetpriority(int32_t which, uint32_t who, int32_t prio);
void* libcUnixLinuxlikeAndroidSchedCpualloc(uint64_t count);
void libcUnixLinuxlikeAndroidSchedCpufree(void* set);
int32_t libcUnixLinuxlikeAndroidSchedCpucount(uint64_t setsize, void* set);
int32_t libcUnixLinuxlikeAndroidSchedGetcpu(void);
int32_t libcUnixLinuxlikeAndroidMallocInfo(int32_t options, void* stream);
uint64_t libcUnixLinuxlikeAndroidMallocUsableSize(void* ptr);
int32_t libcUnixLinuxlikeAndroidUtmpname(const char* name);
void libcUnixLinuxlikeAndroidSetutent(void);
void* libcUnixLinuxlikeAndroidGetutent(void);
void libcUnixLinuxlikeAndroidSeekdir(void* dirp, int64_t loc);
int64_t libcUnixLinuxlikeAndroidTelldir(void* dirp);
int32_t libcUnixLinuxlikeAndroidFallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libcUnixLinuxlikeAndroidFallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libcUnixLinuxlikeAndroidPosixFallocate(int32_t fd, int64_t offset, int64_t len);
int32_t libcUnixLinuxlikeAndroidPosixFallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libcUnixLinuxlikeAndroidGetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libcUnixLinuxlikeAndroidLgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libcUnixLinuxlikeAndroidFgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libcUnixLinuxlikeAndroidSetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libcUnixLinuxlikeAndroidLsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libcUnixLinuxlikeAndroidFsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libcUnixLinuxlikeAndroidListxattr(const char* path, char* list, uint64_t size);
int64_t libcUnixLinuxlikeAndroidLlistxattr(const char* path, char* list, uint64_t size);
int64_t libcUnixLinuxlikeAndroidFlistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libcUnixLinuxlikeAndroidRemovexattr(const char* path, const char* name);
int32_t libcUnixLinuxlikeAndroidLremovexattr(const char* path, const char* name);
int32_t libcUnixLinuxlikeAndroidFremovexattr(int32_t filedes, const char* name);
int32_t libcUnixLinuxlikeAndroidSignalfd(int32_t fd, void* mask, int32_t flags);
int32_t libcUnixLinuxlikeAndroidTimerfdCreate(int32_t clock, int32_t flags);
int32_t libcUnixLinuxlikeAndroidTimerfdGettime(int32_t fd, void* currentValue);
int32_t libcUnixLinuxlikeAndroidTimerfdSettime(int32_t fd, int32_t flags, void* newValue, void* oldValue);
int64_t libcUnixLinuxlikeAndroidSyscall(int64_t num, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeAndroidSchedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeAndroidSchedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeAndroidEpollCreate(int32_t size);
int32_t libcUnixLinuxlikeAndroidEpollCreate1(int32_t flags);
int32_t libcUnixLinuxlikeAndroidEpollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libcUnixLinuxlikeAndroidEpollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libcUnixLinuxlikeAndroidUnshare(int32_t flags);
int32_t libcUnixLinuxlikeAndroidUmount(const char* target);
int32_t libcUnixLinuxlikeAndroidSchedGetPriorityMax(int32_t policy);
int64_t libcUnixLinuxlikeAndroidTee(int32_t fdIn, int32_t fdOut, uint64_t len, uint32_t flags);
int32_t libcUnixLinuxlikeAndroidSettimeofday(void* tv, void* tz);
int64_t libcUnixLinuxlikeAndroidSplice(int32_t fdIn, void* offIn, int32_t fdOut, void* offOut, uint64_t len, uint32_t flags);
int32_t libcUnixLinuxlikeAndroidEventfd(uint32_t initval, int32_t flags);
int32_t libcUnixLinuxlikeAndroidEventfdRead(int32_t fd, void* value);
int32_t libcUnixLinuxlikeAndroidEventfdWrite(int32_t fd, uint64_t value);
int32_t libcUnixLinuxlikeAndroidSchedRrGetInterval(int32_t pid, void* tp);
int32_t libcUnixLinuxlikeAndroidSemTimedwait(void* sem, void* abstime);
int32_t libcUnixLinuxlikeAndroidSemGetvalue(void* sem, void* sval);
int32_t libcUnixLinuxlikeAndroidSchedSetparam(int32_t pid, void* param);
int32_t libcUnixLinuxlikeAndroidSetns(int32_t fd, int32_t nstype);
int32_t libcUnixLinuxlikeAndroidSwapoff(const char* puath);
int64_t libcUnixLinuxlikeAndroidVmsplice(int32_t fd, void* iov, uint64_t nrSegs, uint32_t flags);
int32_t libcUnixLinuxlikeAndroidMount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data);
int32_t libcUnixLinuxlikeAndroidPersonality(uint32_t persona);
int32_t libcUnixLinuxlikeAndroidPrctl(int32_t option, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeAndroidSchedGetparam(int32_t pid, void* param);
int32_t libcUnixLinuxlikeAndroidPpoll(void* fds, uint32_t nfds, void* timeout, void* sigmask);
int32_t libcUnixLinuxlikeAndroidClone(void* cb, void* childStack, int32_t flags, void* arg, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeAndroidSchedGetscheduler(int32_t pid);
int32_t libcUnixLinuxlikeAndroidClockNanosleep(int32_t clkId, int32_t flags, void* rqtp, void* rmtp);
int32_t libcUnixLinuxlikeAndroidSethostname(const char* name, uint64_t len);
int32_t libcUnixLinuxlikeAndroidSchedGetPriorityMin(int32_t policy);
int32_t libcUnixLinuxlikeAndroidSysinfo(void* info);
int32_t libcUnixLinuxlikeAndroidUmount2(const char* target, int32_t flags);
int32_t libcUnixLinuxlikeAndroidSwapon(const char* path, int32_t swapflags);
int32_t libcUnixLinuxlikeAndroidSchedSetscheduler(int32_t pid, int32_t policy, void* param);
int64_t libcUnixLinuxlikeAndroidSendfile(int32_t outFd, int32_t inFd, void* offset, uint64_t count);
int64_t libcUnixLinuxlikeAndroidSendfile64(int32_t outFd, int32_t inFd, void* offset, uint64_t count);
int32_t libcUnixLinuxlikeAndroidSetfsgid(uint16_t gid);
int32_t libcUnixLinuxlikeAndroidSetfsuid(uint16_t uid);
int32_t libcUnixLinuxlikeAndroidSigsuspend(void* mask);
int32_t libcUnixLinuxlikeAndroidGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeAndroidSigaltstack(void* ss, void* oss);
int32_t libcUnixLinuxlikeAndroidSemClose(void* sem);
int32_t libcUnixLinuxlikeAndroidGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
void* libcUnixLinuxlikeAndroidSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libcUnixLinuxlikeAndroidGetgrnam(const char* name);
int32_t libcUnixLinuxlikeAndroidSemUnlink(const char* name);
int32_t libcUnixLinuxlikeAndroidDaemon(int32_t nochdir, int32_t noclose);
int32_t libcUnixLinuxlikeAndroidSigtimedwait(void* set, void* info, void* timeout);
int32_t libcUnixLinuxlikeAndroidSigwait(void* set, void* sig);
void* libcUnixLinuxlikeAndroidGetgrgid(uint16_t gid);
int32_t libcUnixLinuxlikeAndroidGetgrouplist(const char* user, uint16_t group, void* groups, void* ngroups);
int32_t libcUnixLinuxlikeAndroidInitgroups(const char* user, uint16_t group);
void* libcUnixLinuxlikeAndroidPopen(const char* command, const char* mode);
int32_t libcUnixLinuxlikeAndroidFaccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
void* libcUnixLinuxlikeAndroidErrno(void);
int32_t libcUnixLinuxlikeAndroidInotifyRmWatch(int32_t fd, uint32_t wd);
int32_t libcUnixLinuxlikeAndroidInotifyInit(void);
int32_t libcUnixLinuxlikeAndroidInotifyInit1(int32_t flags);
int32_t libcUnixLinuxlikeAndroidInotifyAddWatch(int32_t fd, const char* path, uint32_t mask);
int32_t libcUnixLinuxlikeAndroidRegcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libcUnixLinuxlikeAndroidRegexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libcUnixLinuxlikeAndroidRegerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbufSize);
void libcUnixLinuxlikeAndroidRegfree(void* preg);
void libcUnixLinuxlikeAndroidAndroidSetAbortMessage(const char* msg);
int32_t libcUnixLinuxlikeAndroidGettid(void);
int32_t libcUnixLinuxlikeAndroidTgkill(int32_t tgid, int32_t tid, int32_t sig);
uint64_t libcUnixLinuxlikeAndroidGetauxval(uint64_t type);
int64_t libcUnixLinuxlikeAndroidGetrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libcUnixLinuxlikeAndroidGetentropy(void* buf, uint64_t buflen);
int32_t libcUnixLinuxlikeAndroidSystemPropertySet(const char* name, const char* value);
int32_t libcUnixLinuxlikeAndroidSystemPropertyGet(const char* name, char* value);
void* libcUnixLinuxlikeAndroidSystemPropertyFind(const char* name);
void* libcUnixLinuxlikeAndroidSystemPropertyFindNth(uint32_t n);
int32_t libcUnixLinuxlikeAndroidSystemPropertyForeach(void* callback, void* cookie);
int32_t libcUnixLinuxlikeAndroidDlIteratePhdr(void* callback, void* data);
uint32_t libcUnixLinuxlikeAndroidArc4random(void);
uint32_t libcUnixLinuxlikeAndroidArc4randomUniform(uint32_t upperBound);
void libcUnixLinuxlikeAndroidArc4randomBuf(void* buf, uint64_t n);
void* libcUnixLinuxlikeAndroidReallocarray(void* ptr, uint64_t nmemb, uint64_t size);
char* libcUnixLinuxlikeAndroidDirname(const char* path);
char* libcUnixLinuxlikeAndroidBasename(const char* path);
int32_t libcUnixLinuxlikeAndroidGetoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
void libcUnixLinuxlikeAndroidSync(void);
int32_t libcUnixLinuxlikeAndroidSyncfs(int32_t fd);
void* libcUnixLinuxlikeAndroidMemmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
uint64_t libcUnixLinuxlikeAndroidFreadUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
uint64_t libcUnixLinuxlikeAndroidFwriteUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libcUnixLinuxlikeAndroidFflushUnlocked(void* stream);
char* libcUnixLinuxlikeAndroidFgetsUnlocked(char* buf, int32_t size, void* stream);
int32_t libcUnixLinuxlikeAndroidKlogctl(int32_t syslogType, char* bufp, int32_t len);
int32_t libcUnixLinuxlikeAndroidMemfdCreate(const char* name, uint32_t flags);
int32_t libcUnixLinuxlikeAndroidRenameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H */
