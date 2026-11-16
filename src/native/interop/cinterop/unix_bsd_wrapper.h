#ifndef LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H
#define LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixBsdGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixBsdSetrlimit(int32_t resource, void* rlim);
int32_t libcUnixBsdStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixBsdAbs(int32_t i);
int64_t libcUnixBsdLabs(int64_t i);
int32_t libcUnixBsdRand(void);
void libcUnixBsdSrand(uint32_t seed);
int32_t libcUnixBsdGetifaddrs(void* ifap);
void libcUnixBsdFreeifaddrs(void* ifa);
int32_t libcUnixBsdSetgroups(int32_t ngroups, void* ptr);
int32_t libcUnixBsdSetlogin(const char* name);
int32_t libcUnixBsdIoctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixBsdKqueue(void);
int32_t libcUnixBsdUnmount(const char* target, int32_t arg);
int32_t libcUnixBsdSyscall(int32_t num, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libcUnixBsdGetpwent(void);
void libcUnixBsdSetpwent(void);
void libcUnixBsdEndpwent(void);
void libcUnixBsdEndgrent(void);
void* libcUnixBsdGetgrent(void);
const char* libcUnixBsdGetprogname(void);
void libcUnixBsdSetprogname(const char* name);
int32_t libcUnixBsdGetloadavg(void* loadavg, int32_t nelem);
void* libcUnixBsdIfNameindex(void);
void libcUnixBsdIfFreenameindex(void* ptr);
int32_t libcUnixBsdGetpeereid(int32_t arg0Socket, void* euid, void* egid);
int32_t libcUnixBsdGlob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libcUnixBsdGlobfree(void* pglob);
int32_t libcUnixBsdPosixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixBsdShmUnlink(const char* name);
void libcUnixBsdSeekdir(void* dirp, int64_t loc);
int64_t libcUnixBsdTelldir(void* dirp);
int32_t libcUnixBsdMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixBsdMsync(void* addr, uint64_t len, int32_t flags);
int64_t libcUnixBsdRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libcUnixBsdMkstemps(char* arg0Template, int32_t suffixlen);
int32_t libcUnixBsdFutimes(int32_t fd, void* times);
char* libcUnixBsdNlLanginfo(int32_t item);
int32_t libcUnixBsdBind(int32_t arg0Socket, void* address, uint32_t addressLen);
int64_t libcUnixBsdWritev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixBsdReadv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixBsdSendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libcUnixBsdRecvmsg(int32_t fd, void* msg, int32_t flags);
void libcUnixBsdSync(void);
int32_t libcUnixBsdGetgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixBsdSigaltstack(void* ss, void* oss);
int32_t libcUnixBsdSigsuspend(void* mask);
int32_t libcUnixBsdSemClose(void* sem);
int32_t libcUnixBsdGetdtablesize(void);
int32_t libcUnixBsdGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixBsdPthreadSigmask(int32_t how, void* set, void* oldset);
void* libcUnixBsdSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libcUnixBsdGetgrnam(const char* name);
int32_t libcUnixBsdPthreadCancel(void* thread);
int32_t libcUnixBsdPthreadKill(void* thread, int32_t sig);
int32_t libcUnixBsdSchedGetPriorityMin(int32_t policy);
int32_t libcUnixBsdSchedGetPriorityMax(int32_t policy);
int32_t libcUnixBsdSemUnlink(const char* name);
int32_t libcUnixBsdGetpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixBsdGetpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixBsdSigwait(void* set, void* sig);
int32_t libcUnixBsdPthreadAtfork(void* prepare, void* parent, void* child);
void* libcUnixBsdGetgrgid(uint16_t gid);
void* libcUnixBsdPopen(const char* command, const char* mode);
int32_t libcUnixBsdFaccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
int32_t libcUnixBsdPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcUnixBsdAcct(const char* filename);
int32_t libcUnixBsdWait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libcUnixBsdGetitimer(int32_t which, void* currValue);
int32_t libcUnixBsdSetitimer(int32_t which, void* newValue, void* oldValue);
int32_t libcUnixBsdRegcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libcUnixBsdRegexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libcUnixBsdRegerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbufSize);
void libcUnixBsdRegfree(void* preg);
uint32_t libcUnixBsdArc4random(void);
void libcUnixBsdArc4randomBuf(void* buf, uint64_t size);
uint32_t libcUnixBsdArc4randomUniform(uint32_t l);
double libcUnixBsdDrand48(void);
double libcUnixBsdErand48(void* xseed);
int64_t libcUnixBsdLrand48(void);
int64_t libcUnixBsdNrand48(void* xseed);
int64_t libcUnixBsdMrand48(void);
int64_t libcUnixBsdJrand48(void* xseed);
void libcUnixBsdSrand48(int64_t seed);
void* libcUnixBsdSeed48(void* xseed);
void libcUnixBsdLcong48(void* p);
int32_t libcUnixBsdGetoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
uint64_t libcUnixBsdStrftime(char* buf, uint64_t maxsize, const char* format, void* timeptr);
uint64_t libcUnixBsdStrftimeL(char* buf, uint64_t maxsize, const char* format, void* timeptr, void* locale);
char* libcUnixBsdDevname(int32_t dev, uint16_t modeT);
int32_t libcUnixBsdIssetugid(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H */
