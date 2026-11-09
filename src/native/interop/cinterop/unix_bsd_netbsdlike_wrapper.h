#ifndef LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H
#define LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_unix_bsd_netbsdlike_setgrent(void);
int32_t libc_unix_bsd_netbsdlike_semDestroy(void* sem);
int32_t libc_unix_bsd_netbsdlike_semInit(void* sem, int32_t pshared, uint32_t value);
int32_t libc_unix_bsd_netbsdlike_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_unix_bsd_netbsdlike_accept4(int32_t s, void* addr, void* addrlen, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_mincore(void* addr, uint64_t len, char* vec);
int32_t libc_unix_bsd_netbsdlike_clockGetres(int32_t clk_id, void* tp);
int32_t libc_unix_bsd_netbsdlike_clockGettime(int32_t clk_id, void* tp);
int32_t libc_unix_bsd_netbsdlike_clockSettime(int32_t clk_id, void* tp);
void* libc_unix_bsd_netbsdlike_errno(void);
int32_t libc_unix_bsd_netbsdlike_shmOpen(const char* name, int32_t oflag, uint32_t mode);
void* libc_unix_bsd_netbsdlike_memrchr(void* cx, int32_t c, uint64_t n);
int32_t libc_unix_bsd_netbsdlike_mkostemp(char* arg_0_template, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_mkostemps(char* arg_0_template, int32_t suffixlen, int32_t flags);
int64_t libc_unix_bsd_netbsdlike_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_bsd_netbsdlike_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_bsd_netbsdlike_futimens(int32_t fd, void* times);
int32_t libc_unix_bsd_netbsdlike_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
int32_t libc_unix_bsd_netbsdlike_fdatasync(int32_t fd);
int32_t libc_unix_bsd_netbsdlike_loginTty(int32_t fd);
int32_t libc_unix_bsd_netbsdlike_getpriority(int32_t which, uint32_t who);
int32_t libc_unix_bsd_netbsdlike_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_unix_bsd_netbsdlike_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev);
int32_t libc_unix_bsd_netbsdlike_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libc_unix_bsd_netbsdlike_semTimedwait(void* sem, void* abstime);
int32_t libc_unix_bsd_netbsdlike_semGetvalue(void* sem, void* sval);
int32_t libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(void* attr, int32_t clock_id);
int32_t libc_unix_bsd_netbsdlike_sethostname(const char* name, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(void* lock, void* abstime);
int32_t libc_unix_bsd_netbsdlike_pthreadSpinInit(void* lock, int32_t pshared);
int32_t libc_unix_bsd_netbsdlike_pthreadSpinDestroy(void* lock);
int32_t libc_unix_bsd_netbsdlike_pthreadSpinLock(void* lock);
int32_t libc_unix_bsd_netbsdlike_pthreadSpinTrylock(void* lock);
int32_t libc_unix_bsd_netbsdlike_pthreadSpinUnlock(void* lock);
int32_t libc_unix_bsd_netbsdlike_pthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libc_unix_bsd_netbsdlike_pthreadGetschedparam(void* native, void* policy, void* param);
int32_t libc_unix_bsd_netbsdlike_pipe2(void* fds, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_ppoll(void* fds, uint32_t nfds, void* ts, void* sigmask);
int32_t libc_unix_bsd_netbsdlike_getgrouplist(const char* name, uint16_t basegid, void* groups, void* ngroups);
int32_t libc_unix_bsd_netbsdlike_initgroups(const char* name, uint16_t basegid);
int32_t libc_unix_bsd_netbsdlike_getdomainname(char* name, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_setdomainname(const char* name, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_uname(void* buf);
int32_t libc_unix_bsd_netbsdlike_shmget(int64_t key, uint64_t size, int32_t shmflg);
void* libc_unix_bsd_netbsdlike_shmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libc_unix_bsd_netbsdlike_shmdt(void* shmaddr);
int32_t libc_unix_bsd_netbsdlike_shmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libc_unix_bsd_netbsdlike_execvpe(const char* file, void* argv, void* envp);
int32_t libc_unix_bsd_netbsdlike_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libc_unix_bsd_netbsdlike_posixSpawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_unix_bsd_netbsdlike_posixSpawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrInit(void* attr);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(void* attr);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(void* attr, void* arg_1_default);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(void* attr, void* arg_1_default);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(void* attr, void* arg_1_default);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(void* attr, void* arg_1_default);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(void* attr, void* flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(void* attr, int16_t flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(void* attr, void* flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(void* attr, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(void* attr, void* flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(void* attr, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(void* attr, void* param);
int32_t libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(void* attr, void* param);
int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(void* actions);
int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(void* actions);
int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(void* actions, int32_t fd);
int32_t libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd);
void* libc_unix_bsd_netbsdlike_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int64_t libc_unix_bsd_netbsdlike_gethostid(void);
int32_t libc_unix_bsd_netbsdlike_sethostid(int64_t hostid);
int64_t libc_unix_bsd_netbsdlike_ftok(const char* path, int32_t id);
char* libc_unix_bsd_netbsdlike_dirname(char* path);
char* libc_unix_bsd_netbsdlike_basename(char* path);
int32_t libc_unix_bsd_netbsdlike_getentropy(void* buf, uint64_t buflen);
int32_t libc_unix_bsd_netbsdlike_sendmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_recvmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags, void* timeout);
int32_t libc_unix_bsd_netbsdlike_closefrom(int32_t lowfd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_NETBSDLIKE_UNIX_BSD_NETBSDLIKE_WRAPPER_H */
