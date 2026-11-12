#ifndef LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H
#define LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcUnixRedoxErrnoLocation(void);
int32_t libcUnixRedoxStrerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libcUnixRedoxDirfd(void* dirp);
int32_t libcUnixRedoxPipe2(void* fds, int32_t flags);
int32_t libcUnixRedoxGetdtablesize(void);
int32_t libcUnixRedoxGetresgid(void* rgid, void* egid, void* sgid);
int32_t libcUnixRedoxGetresuid(void* ruid, void* euid, void* suid);
int32_t libcUnixRedoxSetresgid(int32_t rgid, int32_t egid, int32_t sgid);
int32_t libcUnixRedoxSetresuid(int32_t ruid, int32_t euid, int32_t suid);
void* libcUnixRedoxGetgrent(void);
void libcUnixRedoxSetgrent(void);
void libcUnixRedoxEndgrent(void);
void* libcUnixRedoxGetgrgid(int32_t gid);
int32_t libcUnixRedoxGetgrgidR(int32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
void* libcUnixRedoxGetgrnam(const char* name);
int32_t libcUnixRedoxGetgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libcUnixRedoxGetgrouplist(const char* user, int32_t group, void* groups, void* ngroups);
void* libcUnixRedoxMemalign(uint64_t align, uint64_t size);
int32_t libcUnixRedoxGetnameinfo(void* addr, uint32_t addrlen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libcUnixRedoxPthreadAtfork(void* prepare, void* parent, void* child);
int32_t libcUnixRedoxPthreadCreate(void* tid, void* attr, void* start, void* arg);
int32_t libcUnixRedoxPthreadCondattrSetclock(void* attr, int32_t clockId);
int32_t libcUnixRedoxOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
void* libcUnixRedoxGetpwent(void);
void libcUnixRedoxSetpwent(void);
void libcUnixRedoxEndpwent(void);
int32_t libcUnixRedoxGetpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixRedoxGetpwuidR(int32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixRedoxPthreadSigmask(int32_t how, void* set, void* oldset);
int32_t libcUnixRedoxPthreadCancel(void* thread);
int32_t libcUnixRedoxPthreadKill(void* thread, int32_t sig);
int32_t libcUnixRedoxSigtimedwait(void* set, void* sig, void* timeout);
int32_t libcUnixRedoxSigwait(void* set, void* sig);
int32_t libcUnixRedoxGetsubopt(void* optionp, void* tokens, void* valuep);
int32_t libcUnixRedoxMkostemp(char* arg0Template, int32_t flags);
int32_t libcUnixRedoxMkostemps(char* arg0Template, int32_t suffixlen, int32_t flags);
void* libcUnixRedoxReallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libcUnixRedoxRenameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);
void libcUnixRedoxExplicitBzero(void* p, uint64_t len);
uint64_t libcUnixRedoxStrlcat(char* dst, const char* src, uint64_t siz);
uint64_t libcUnixRedoxStrlcpy(char* dst, const char* src, uint64_t siz);
int32_t libcUnixRedoxEpollCreate(int32_t size);
int32_t libcUnixRedoxEpollCreate1(int32_t flags);
int32_t libcUnixRedoxEpollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libcUnixRedoxEpollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libcUnixRedoxIoctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixRedoxMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixRedoxMsync(void* addr, uint64_t len, int32_t flags);
int32_t libcUnixRedoxMprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcUnixRedoxShmOpen(const char* name, int32_t oflag, int32_t mode);
int32_t libcUnixRedoxShmUnlink(const char* name);
int32_t libcUnixRedoxGetpriority(int32_t which, uint32_t who);
int32_t libcUnixRedoxSetpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libcUnixRedoxGetrlimit(int32_t resource, void* rlim);
int32_t libcUnixRedoxSetrlimit(int32_t resource, void* rlim);
void* libcUnixRedoxCmsgData(void* cmsg);
void* libcUnixRedoxCmsgFirsthdr(void* mhdr);
void* libcUnixRedoxCmsgNxthdr(void* mhdr, void* cmsg);
int32_t libcUnixRedoxBind(int32_t arg0Socket, void* address, uint32_t addressLen);
int64_t libcUnixRedoxRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int64_t libcUnixRedoxRecvmsg(int32_t arg0Socket, void* msg, int32_t flags);
int64_t libcUnixRedoxSendmsg(int32_t arg0Socket, void* msg, int32_t flags);
int32_t libcUnixRedoxFutimens(int32_t fd, void* times);
int64_t libcUnixRedoxPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixRedoxPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixRedoxReadv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixRedoxWritev(int32_t fd, void* iov, int32_t iovcnt);
int32_t libcUnixRedoxUname(void* utsname);
int32_t libcUnixRedoxGettimeofday(void* tp, void* tz);
int32_t libcUnixRedoxClockGettime(int32_t clkId, void* tp);
uint64_t libcUnixRedoxStrftime(char* s, uint64_t max, const char* format, void* tm);
int32_t libcUnixRedoxLoginTty(int32_t fd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H */
