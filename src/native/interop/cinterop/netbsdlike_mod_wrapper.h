#ifndef LIBC_NETBSDLIKE_MOD_NETBSDLIKE_MOD_WRAPPER_H
#define LIBC_NETBSDLIKE_MOD_NETBSDLIKE_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_netbsdlike_mod_setgrent(void);
int32_t libc_netbsdlike_mod_sem_destroy(void* sem);
int32_t libc_netbsdlike_mod_sem_init(void* sem, int32_t pshared, uint32_t value);
int32_t libc_netbsdlike_mod_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_netbsdlike_mod_accept4(int32_t s, void* addr, void* addrlen, int32_t flags);
int32_t libc_netbsdlike_mod_mincore(void* addr, uint64_t len, char* vec);
int32_t libc_netbsdlike_mod_clock_getres(int32_t clk_id, void* tp);
int32_t libc_netbsdlike_mod_clock_gettime(int32_t clk_id, void* tp);
int32_t libc_netbsdlike_mod_clock_settime(int32_t clk_id, void* tp);
void* libc_netbsdlike_mod_errno(void);
int32_t libc_netbsdlike_mod_shm_open(const char* name, int32_t oflag, uint32_t mode);
void* libc_netbsdlike_mod_memrchr(void* cx, int32_t c, uint64_t n);
int32_t libc_netbsdlike_mod_mkostemp(char* template, int32_t flags);
int32_t libc_netbsdlike_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags);
int64_t libc_netbsdlike_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_netbsdlike_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_netbsdlike_mod_futimens(int32_t fd, void* times);
int32_t libc_netbsdlike_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
int32_t libc_netbsdlike_mod_fdatasync(int32_t fd);
int32_t libc_netbsdlike_mod_login_tty(int32_t fd);
int32_t libc_netbsdlike_mod_getpriority(int32_t which, uint32_t who);
int32_t libc_netbsdlike_mod_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_netbsdlike_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev);
int32_t libc_netbsdlike_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libc_netbsdlike_mod_sem_timedwait(void* sem, void* abstime);
int32_t libc_netbsdlike_mod_sem_getvalue(void* sem, void* sval);
int32_t libc_netbsdlike_mod_pthread_condattr_setclock(void* attr, int32_t clock_id);
int32_t libc_netbsdlike_mod_sethostname(const char* name, uint64_t len);
int32_t libc_netbsdlike_mod_pthread_mutex_timedlock(void* lock, void* abstime);
int32_t libc_netbsdlike_mod_pthread_spin_init(void* lock, int32_t pshared);
int32_t libc_netbsdlike_mod_pthread_spin_destroy(void* lock);
int32_t libc_netbsdlike_mod_pthread_spin_lock(void* lock);
int32_t libc_netbsdlike_mod_pthread_spin_trylock(void* lock);
int32_t libc_netbsdlike_mod_pthread_spin_unlock(void* lock);
int32_t libc_netbsdlike_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param);
int32_t libc_netbsdlike_mod_pthread_getschedparam(int32_t native, void* policy, void* param);
int32_t libc_netbsdlike_mod_pipe2(void* fds, int32_t flags);
int32_t libc_netbsdlike_mod_ppoll(void* fds, int32_t nfds, void* ts, void* sigmask);
int32_t libc_netbsdlike_mod_getgrouplist(const char* name, uint32_t basegid, void* groups, void* ngroups);
int32_t libc_netbsdlike_mod_initgroups(const char* name, uint32_t basegid);
int32_t libc_netbsdlike_mod_getdomainname(char* name, uint64_t len);
int32_t libc_netbsdlike_mod_setdomainname(const char* name, uint64_t len);
int32_t libc_netbsdlike_mod_uname(void* buf);
int32_t libc_netbsdlike_mod_shmget(int64_t key, uint64_t size, int32_t shmflg);
void* libc_netbsdlike_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libc_netbsdlike_mod_shmdt(void* shmaddr);
int32_t libc_netbsdlike_mod_shmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libc_netbsdlike_mod_execvpe(const char* file, void* argv, void* envp);
int32_t libc_netbsdlike_mod_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libc_netbsdlike_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_netbsdlike_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_netbsdlike_mod_posix_spawnattr_init(void* attr);
int32_t libc_netbsdlike_mod_posix_spawnattr_destroy(void* attr);
int32_t libc_netbsdlike_mod_posix_spawnattr_getsigdefault(void* attr, void* defval);
int32_t libc_netbsdlike_mod_posix_spawnattr_setsigdefault(void* attr, void* defval);
int32_t libc_netbsdlike_mod_posix_spawnattr_getsigmask(void* attr, void* defval);
int32_t libc_netbsdlike_mod_posix_spawnattr_setsigmask(void* attr, void* defval);
int32_t libc_netbsdlike_mod_posix_spawnattr_getflags(void* attr, void* flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_setflags(void* attr, int16_t flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_getpgroup(void* attr, void* flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags);
int32_t libc_netbsdlike_mod_posix_spawnattr_getschedparam(void* attr, void* param);
int32_t libc_netbsdlike_mod_posix_spawnattr_setschedparam(void* attr, void* param);
int32_t libc_netbsdlike_mod_posix_spawn_file_actions_init(void* actions);
int32_t libc_netbsdlike_mod_posix_spawn_file_actions_destroy(void* actions);
int32_t libc_netbsdlike_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libc_netbsdlike_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd);
int32_t libc_netbsdlike_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd);
void* libc_netbsdlike_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int64_t libc_netbsdlike_mod_gethostid(void);
int32_t libc_netbsdlike_mod_sethostid(int64_t hostid);
int64_t libc_netbsdlike_mod_ftok(const char* path, int32_t id);
char* libc_netbsdlike_mod_dirname(char* path);
char* libc_netbsdlike_mod_basename(char* path);
int32_t libc_netbsdlike_mod_getentropy(void* buf, uint64_t buflen);
int32_t libc_netbsdlike_mod_sendmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags);
int32_t libc_netbsdlike_mod_recvmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags, void* timeout);
int32_t libc_netbsdlike_mod_closefrom(int32_t lowfd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NETBSDLIKE_MOD_NETBSDLIKE_MOD_WRAPPER_H */
