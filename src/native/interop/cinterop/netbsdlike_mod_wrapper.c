#include "netbsdlike_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <semaphore.h>
#endif

void libc_netbsdlike_mod_setgrent(void) {
    setgrent();
}

int32_t libc_netbsdlike_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsdlike_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
#if !defined(_WIN32)
    return (int32_t)sem_init(sem, pshared, value);
#else
    (void)sem;
    (void)pshared;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsdlike_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_netbsdlike_mod_accept4(int32_t s, void* addr, void* addrlen, int32_t flags) {
    return (int32_t)accept4(s, addr, addrlen, flags);
}

int32_t libc_netbsdlike_mod_mincore(void* addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_netbsdlike_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_netbsdlike_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_netbsdlike_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

void* libc_netbsdlike_mod_errno(void) {
    return (void*)__errno();
}

int32_t libc_netbsdlike_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

void* libc_netbsdlike_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_netbsdlike_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_netbsdlike_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int64_t libc_netbsdlike_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_netbsdlike_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_netbsdlike_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_netbsdlike_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_netbsdlike_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_netbsdlike_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

int32_t libc_netbsdlike_mod_getpriority(int32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_netbsdlike_mod_setpriority(int32_t which, uint32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_netbsdlike_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_netbsdlike_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_netbsdlike_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_netbsdlike_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_netbsdlike_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_netbsdlike_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_netbsdlike_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_netbsdlike_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_netbsdlike_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_netbsdlike_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_netbsdlike_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_netbsdlike_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_netbsdlike_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_netbsdlike_mod_pthread_getschedparam(int32_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_netbsdlike_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_netbsdlike_mod_ppoll(void* fds, int32_t nfds, void* ts, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, ts, sigmask);
}

int32_t libc_netbsdlike_mod_getgrouplist(const char* name, uint32_t basegid, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(name, basegid, groups, ngroups);
}

int32_t libc_netbsdlike_mod_initgroups(const char* name, uint32_t basegid) {
    return (int32_t)initgroups(name, basegid);
}

int32_t libc_netbsdlike_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_netbsdlike_mod_setdomainname(const char* name, uint64_t len) {
    return (int32_t)setdomainname(name, len);
}

int32_t libc_netbsdlike_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_netbsdlike_mod_shmget(int64_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

void* libc_netbsdlike_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_netbsdlike_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_netbsdlike_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_netbsdlike_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_netbsdlike_mod_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_netbsdlike_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_netbsdlike_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_netbsdlike_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_netbsdlike_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_netbsdlike_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_netbsdlike_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_netbsdlike_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_netbsdlike_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

void* libc_netbsdlike_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

int64_t libc_netbsdlike_mod_gethostid(void) {
    return (int64_t)gethostid();
}

int32_t libc_netbsdlike_mod_sethostid(int64_t hostid) {
    return (int32_t)sethostid(hostid);
}

int64_t libc_netbsdlike_mod_ftok(const char* path, int32_t id) {
    return (int64_t)ftok(path, id);
}

char* libc_netbsdlike_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_netbsdlike_mod_basename(char* path) {
    return (char*)basename(path);
}

int32_t libc_netbsdlike_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int32_t libc_netbsdlike_mod_sendmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags) {
    return (int32_t)sendmmsg(sockfd, mmsg, vlen, flags);
}

int32_t libc_netbsdlike_mod_recvmmsg(int32_t sockfd, void* mmsg, uint32_t vlen, int32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, mmsg, vlen, flags, timeout);
}

int32_t libc_netbsdlike_mod_closefrom(int32_t lowfd) {
    return (int32_t)closefrom(lowfd);
}

