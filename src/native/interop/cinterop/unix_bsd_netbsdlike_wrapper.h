#ifndef LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H
#define LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixBsdNetbsdlikeSetgrent(void);
int32_t libcUnixBsdNetbsdlikeSemDestroy(void* sem);
int32_t libcUnixBsdNetbsdlikeSemInit(void* sem, int32_t pshared, uint32_t value);
int32_t libcUnixBsdNetbsdlikeDaemon(int32_t nochdir, int32_t noclose);
int32_t libcUnixBsdNetbsdlikeAccept4(int32_t s, void* addr, void* addrlen, int32_t flags);
int32_t libcUnixBsdNetbsdlikeMincore(void* addr, uint64_t len, char* vec);
int32_t libcUnixBsdNetbsdlikeClockGetres(int32_t clkId, void* tp);
int32_t libcUnixBsdNetbsdlikeClockGettime(int32_t clkId, void* tp);
int32_t libcUnixBsdNetbsdlikeClockSettime(int32_t clkId, void* tp);
void* libcUnixBsdNetbsdlikeErrno(void);
int32_t libcUnixBsdNetbsdlikeShmOpen(const char* name, int32_t oflag, uint32_t mode);
void* libcUnixBsdNetbsdlikeMemrchr(void* cx, int32_t c, uint64_t n);
int32_t libcUnixBsdNetbsdlikeMkostemp(char* arg0Template, int32_t flags);
int32_t libcUnixBsdNetbsdlikeMkostemps(char* arg0Template, int32_t suffixlen, int32_t flags);
int64_t libcUnixBsdNetbsdlikePwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixBsdNetbsdlikePreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixBsdNetbsdlikeFutimens(int32_t fd, void* times);
int32_t libcUnixBsdNetbsdlikeUtimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
int32_t libcUnixBsdNetbsdlikeFdatasync(int32_t fd);
int32_t libcUnixBsdNetbsdlikeLoginTty(int32_t fd);
int32_t libcUnixBsdNetbsdlikeGetpriority(int32_t which, uint32_t who);
int32_t libcUnixBsdNetbsdlikeSetpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libcUnixBsdNetbsdlikeMknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev);
int32_t libcUnixBsdNetbsdlikeMkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libcUnixBsdNetbsdlikeSemTimedwait(void* sem, void* abstime);
int32_t libcUnixBsdNetbsdlikeSemGetvalue(void* sem, void* sval);
int32_t libcUnixBsdNetbsdlikePthreadCondattrSetclock(void* attr, int32_t clockId);
int32_t libcUnixBsdNetbsdlikeSethostname(const char* name, uint64_t len);
int32_t libcUnixBsdNetbsdlikePthreadMutexTimedlock(void* lock, void* abstime);
int32_t libcUnixBsdNetbsdlikePthreadSpinInit(void* lock, int32_t pshared);
int32_t libcUnixBsdNetbsdlikePthreadSpinDestroy(void* lock);
int32_t libcUnixBsdNetbsdlikePthreadSpinLock(void* lock);
int32_t libcUnixBsdNetbsdlikePthreadSpinTrylock(void* lock);
int32_t libcUnixBsdNetbsdlikePthreadSpinUnlock(void* lock);
int32_t libcUnixBsdNetbsdlikePthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libcUnixBsdNetbsdlikePthreadGetschedparam(void* native, void* policy, void* param);
int32_t libcUnixBsdNetbsdlikePipe2(void* fds, int32_t flags);
int32_t libcUnixBsdNetbsdlikePpoll(void* fds, uint32_t nfds, void* ts, void* sigmask);
int32_t libcUnixBsdNetbsdlikeGetgrouplist(const char* name, uint16_t basegid, void* groups, void* ngroups);
int32_t libcUnixBsdNetbsdlikeInitgroups(const char* name, uint16_t basegid);
int32_t libcUnixBsdNetbsdlikeGetdomainname(char* name, uint64_t len);
int32_t libcUnixBsdNetbsdlikeSetdomainname(const char* name, uint64_t len);
int32_t libcUnixBsdNetbsdlikeUname(void* buf);
int32_t libcUnixBsdNetbsdlikeShmget(int64_t key, uint64_t size, int32_t shmflg);
void* libcUnixBsdNetbsdlikeShmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libcUnixBsdNetbsdlikeShmdt(void* shmaddr);
int32_t libcUnixBsdNetbsdlikeShmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libcUnixBsdNetbsdlikeExecvpe(const char* file, void* argv, void* envp);
int32_t libcUnixBsdNetbsdlikeWaitid(int32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libcUnixBsdNetbsdlikePosixSpawn(void* pid, const char* path, void* fileActions, void* attrp, void* argv, void* envp);
int32_t libcUnixBsdNetbsdlikePosixSpawnp(void* pid, const char* file, void* fileActions, void* attrp, void* argv, void* envp);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrInit(void* attr);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrDestroy(void* attr);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(void* attr, void* arg1Default);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(void* attr, void* arg1Default);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(void* attr, void* arg1Default);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(void* attr, void* arg1Default);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetflags(void* attr, void* flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetflags(void* attr, int16_t flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(void* attr, void* flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(void* attr, int32_t flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(void* attr, void* flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(void* attr, int32_t flags);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(void* attr, void* param);
int32_t libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(void* attr, void* param);
int32_t libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(void* actions);
int32_t libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(void* actions);
int32_t libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(void* actions, int32_t fd);
int32_t libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd);
void* libcUnixBsdNetbsdlikeReallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int64_t libcUnixBsdNetbsdlikeGethostid(void);
int32_t libcUnixBsdNetbsdlikeSethostid(int64_t hostid);
int64_t libcUnixBsdNetbsdlikeFtok(const char* path, int32_t id);
char* libcUnixBsdNetbsdlikeDirname(char* path);
char* libcUnixBsdNetbsdlikeBasename(char* path);
int32_t libcUnixBsdNetbsdlikeGetentropy(void* buf, uint64_t buflen);
int32_t libcUnixBsdNetbsdlikeSendmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags);
int32_t libcUnixBsdNetbsdlikeRecvmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags, void* timeout);
int32_t libcUnixBsdNetbsdlikeClosefrom(int32_t lowfd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H */
