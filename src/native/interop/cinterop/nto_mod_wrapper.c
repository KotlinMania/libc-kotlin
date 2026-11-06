#include "nto_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <semaphore.h>
#include <sys/socket.h>
#include <sys/mman.h>
#include <dirent.h>
#include <pthread.h>
#include <sys/ioctl.h>
#endif

int32_t libc_nto_mod_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags) {
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
}

int32_t libc_nto_mod_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}

int32_t libc_nto_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_nto_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_nto_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_nto_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_nto_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_nto_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_nto_mod_mknodat(int32_t __fd, const char* pathname, uint32_t mode, uint32_t dev) {
    return (int32_t)mknodat(__fd, pathname, mode, dev);
}

int32_t libc_nto_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_nto_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_nto_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_nto_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_nto_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

void* libc_nto_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_nto_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_nto_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_nto_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

char* libc_nto_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_nto_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_nto_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_nto_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_nto_mod_pthread_condattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_condattr_setpshared(attr, pshared);
}

int32_t libc_nto_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_nto_mod_pthread_rwlockattr_getpshared(void* attr, void* val) {
    return (int32_t)pthread_rwlockattr_getpshared(attr, val);
}

int32_t libc_nto_mod_pthread_rwlockattr_setpshared(void* attr, int32_t val) {
    return (int32_t)pthread_rwlockattr_setpshared(attr, val);
}

char* libc_nto_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (char*)ptsname_r(fd, buf, buflen);
}

int32_t libc_nto_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_nto_mod_waitid(uint32_t idtype, int32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_nto_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_nto_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_nto_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_nto_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_nto_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_nto_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_nto_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_nto_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_nto_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

int32_t libc_nto_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_nto_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_nto_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

int32_t libc_nto_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_nto_mod_getpeereid(int32_t socket, void* euid, void* egid) {
    return (int32_t)getpeereid(socket, euid, egid);
}

int32_t libc_nto_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_nto_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_nto_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_nto_mod_rand(void) {
    return (int32_t)rand();
}

void libc_nto_mod_srand(uint32_t seed) {
    srand(seed);
}

void libc_nto_mod_setpwent(void) {
    setpwent();
}

void libc_nto_mod_endpwent(void) {
    endpwent();
}

void* libc_nto_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_nto_mod_setgrent(void) {
    setgrent();
}

void libc_nto_mod_endgrent(void) {
    endgrent();
}

void* libc_nto_mod_getgrent(void) {
    return (void*)getgrent();
}

void libc_nto_mod_setspent(void) {
    setspent();
}

void libc_nto_mod_endspent(void) {
    endspent();
}

int32_t libc_nto_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

uint32_t libc_nto_mod_ftok(const char* pathname, int32_t proj_id) {
    return (uint32_t)ftok(pathname, proj_id);
}

int32_t libc_nto_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_nto_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_nto_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_nto_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_nto_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_nto_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_nto_mod_pthread_setschedprio(int32_t native, int32_t priority) {
    return (int32_t)pthread_setschedprio(native, priority);
}

void* libc_nto_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_nto_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_nto_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_nto_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_nto_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_nto_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_nto_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_nto_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_nto_mod_msync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_nto_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_nto_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_nto_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_nto_mod_setdomainname(const char* name, uint64_t len) {
    return (int32_t)setdomainname(name, len);
}

void libc_nto_mod_sync(void) {
    sync();
}

int32_t libc_nto_mod_pthread_getschedparam(int32_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_nto_mod_umount(const char* target, int32_t flags) {
    return (int32_t)umount(target, flags);
}

int32_t libc_nto_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_nto_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int32_t libc_nto_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_nto_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_nto_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_nto_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_nto_mod_mount(const char* special_device, const char* mount_directory, int32_t flags, const char* mount_type, void* mount_data, int32_t mount_datalen) {
    return (int32_t)mount(special_device, mount_directory, flags, mount_type, mount_data, mount_datalen);
}

int32_t libc_nto_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_nto_mod_pthread_mutex_consistent(void* mutex) {
    return (int32_t)pthread_mutex_consistent(mutex);
}

int32_t libc_nto_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_nto_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_nto_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_nto_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_nto_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_nto_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_nto_mod_pthread_barrierattr_init(void* __attr) {
    return (int32_t)pthread_barrierattr_init(__attr);
}

int32_t libc_nto_mod_pthread_barrierattr_destroy(void* __attr) {
    return (int32_t)pthread_barrierattr_destroy(__attr);
}

int32_t libc_nto_mod_pthread_barrierattr_getpshared(void* __attr, void* __pshared) {
    return (int32_t)pthread_barrierattr_getpshared(__attr, __pshared);
}

int32_t libc_nto_mod_pthread_barrierattr_setpshared(void* __attr, int32_t __pshared) {
    return (int32_t)pthread_barrierattr_setpshared(__attr, __pshared);
}

int32_t libc_nto_mod_pthread_barrier_init(void* __barrier, void* __attr, uint32_t __count) {
    return (int32_t)pthread_barrier_init(__barrier, __attr, __count);
}

int32_t libc_nto_mod_pthread_barrier_destroy(void* __barrier) {
    return (int32_t)pthread_barrier_destroy(__barrier);
}

int32_t libc_nto_mod_pthread_barrier_wait(void* __barrier) {
    return (int32_t)pthread_barrier_wait(__barrier);
}

int32_t libc_nto_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_nto_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_nto_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_nto_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_nto_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_nto_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_nto_mod_pthread_condattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_condattr_getpshared(attr, pshared);
}

int32_t libc_nto_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_nto_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_nto_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_nto_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_nto_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_nto_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_nto_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_nto_mod_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

int32_t libc_nto_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_nto_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_nto_mod_pthread_cancel(int32_t thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_nto_mod_pthread_kill(int32_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_nto_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_nto_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_nto_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_nto_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_nto_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_nto_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_nto_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_nto_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

int32_t libc_nto_mod_pthread_mutexattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_mutexattr_getpshared(attr, pshared);
}

int32_t libc_nto_mod_pthread_mutexattr_getrobust(void* attr, void* robustness) {
    return (int32_t)pthread_mutexattr_getrobust(attr, robustness);
}

int32_t libc_nto_mod_pthread_mutexattr_setrobust(void* attr, int32_t robustness) {
    return (int32_t)pthread_mutexattr_setrobust(attr, robustness);
}

int32_t libc_nto_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_nto_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_nto_mod_setitimer(int32_t which, void* value, void* ovalue) {
    return (int32_t)setitimer(which, value, ovalue);
}

int32_t libc_nto_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_nto_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_nto_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_nto_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_nto_mod_posix_spawnattr_getsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_nto_mod_posix_spawnattr_setsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_nto_mod_posix_spawnattr_getsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_nto_mod_posix_spawnattr_setsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_nto_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_nto_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_nto_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_nto_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_nto_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_nto_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_nto_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_nto_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

void* libc_nto_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_nto_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_nto_mod_inotify_rm_watch(int32_t fd, int32_t wd) {
    return (int32_t)inotify_rm_watch(fd, wd);
}

int32_t libc_nto_mod_inotify_init(void) {
    return (int32_t)inotify_init();
}

int32_t libc_nto_mod_inotify_add_watch(int32_t fd, const char* path, uint32_t mask) {
    return (int32_t)inotify_add_watch(fd, path, mask);
}

int32_t libc_nto_mod_gettid(void) {
    return (int32_t)gettid();
}

int32_t libc_nto_mod_pthread_getcpuclockid(int32_t thread, void* clk_id) {
    return (int32_t)pthread_getcpuclockid(thread, clk_id);
}

int32_t libc_nto_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_nto_mod_mallopt(int32_t param, int64_t value) {
    return (int32_t)mallopt(param, value);
}

int32_t libc_nto_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

char* libc_nto_mod_ctermid(char* s) {
    return (char*)ctermid(s);
}

int32_t libc_nto_mod_mallinfo(void) {
    return (int32_t)mallinfo();
}

int32_t libc_nto_mod_getpwent_r(void* pwd, char* buf, int32_t __bufsize, void* __result) {
    return (int32_t)getpwent_r(pwd, buf, __bufsize, __result);
}

int32_t libc_nto_mod_pthread_getname_np(int32_t thread, char* name, int32_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

int32_t libc_nto_mod_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

int32_t libc_nto_mod_sysctl(void* arg0, uint32_t arg1, void* arg2, void* arg3, void* arg4, uint64_t arg5) {
    return (int32_t)sysctl(arg0, arg1, arg2, arg3, arg4, arg5);
}

int32_t libc_nto_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_nto_mod_setrlimit(int32_t resource, void* rlp) {
    return (int32_t)setrlimit(resource, rlp);
}

int32_t libc_nto_mod_lio_listio(int32_t __mode, void* __list, int32_t __nent, void* __sig) {
    return (int32_t)lio_listio(__mode, __list, __nent, __sig);
}

int32_t libc_nto_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

int32_t libc_nto_mod_memset_s(void* s, uint64_t smax, int32_t c, uint64_t n) {
    return (int32_t)memset_s(s, smax, c, n);
}

int32_t libc_nto_mod_regcomp(void* __preg, const char* __pattern, int32_t __cflags) {
    return (int32_t)regcomp(__preg, __pattern, __cflags);
}

int32_t libc_nto_mod_regexec(void* __preg, const char* __str, uint64_t __nmatch, void* __pmatch, int32_t __eflags) {
    return (int32_t)regexec(__preg, __str, __nmatch, __pmatch, __eflags);
}

uint64_t libc_nto_mod_regerror(int32_t __errcode, void* __preg, char* __errbuf, uint64_t __errbuf_size) {
    return (uint64_t)regerror(__errcode, __preg, __errbuf, __errbuf_size);
}

void libc_nto_mod_regfree(void* __preg) {
    regfree(__preg);
}

int32_t libc_nto_mod_dirfd(void* __dirp) {
    return (int32_t)dirfd((DIR*)__dirp);
}

int32_t libc_nto_mod_aio_cancel(int32_t __fd, void* __aiocbp) {
    return (int32_t)aio_cancel(__fd, __aiocbp);
}

int32_t libc_nto_mod_aio_error(void* __aiocbp) {
    return (int32_t)aio_error(__aiocbp);
}

int32_t libc_nto_mod_aio_fsync(int32_t __operation, void* __aiocbp) {
    return (int32_t)aio_fsync(__operation, __aiocbp);
}

int32_t libc_nto_mod_aio_read(void* __aiocbp) {
    return (int32_t)aio_read(__aiocbp);
}

int64_t libc_nto_mod_aio_return(void* __aiocpb) {
    return (int64_t)aio_return(__aiocpb);
}

int32_t libc_nto_mod_aio_suspend(void* __list, int32_t __nent, void* __timeout) {
    return (int32_t)aio_suspend(__list, __nent, __timeout);
}

int32_t libc_nto_mod_aio_write(void* __aiocpb) {
    return (int32_t)aio_write(__aiocpb);
}

int32_t libc_nto_mod_mq_close(int32_t __mqdes) {
    return (int32_t)mq_close(__mqdes);
}

int32_t libc_nto_mod_mq_getattr(int32_t __mqdes, void* __mqstat) {
    return (int32_t)mq_getattr(__mqdes, __mqstat);
}

int32_t libc_nto_mod_mq_notify(int32_t __mqdes, void* __notification) {
    return (int32_t)mq_notify(__mqdes, __notification);
}

int64_t libc_nto_mod_mq_receive(int32_t __mqdes, char* __msg_ptr, uint64_t __msg_len, void* __msg_prio) {
    return (int64_t)mq_receive(__mqdes, __msg_ptr, __msg_len, __msg_prio);
}

int32_t libc_nto_mod_mq_send(int32_t __mqdes, const char* __msg_ptr, uint64_t __msg_len, uint32_t __msg_prio) {
    return (int32_t)mq_send(__mqdes, __msg_ptr, __msg_len, __msg_prio);
}

int32_t libc_nto_mod_mq_setattr(int32_t __mqdes, void* __mqstat, void* __omqstat) {
    return (int32_t)mq_setattr(__mqdes, __mqstat, __omqstat);
}

int64_t libc_nto_mod_mq_timedreceive(int32_t __mqdes, char* __msg_ptr, uint64_t __msg_len, void* __msg_prio, void* __abs_timeout) {
    return (int64_t)mq_timedreceive(__mqdes, __msg_ptr, __msg_len, __msg_prio, __abs_timeout);
}

int32_t libc_nto_mod_mq_timedsend(int32_t __mqdes, const char* __msg_ptr, uint64_t __msg_len, uint32_t __msg_prio, void* __abs_timeout) {
    return (int32_t)mq_timedsend(__mqdes, __msg_ptr, __msg_len, __msg_prio, __abs_timeout);
}

int32_t libc_nto_mod_mq_unlink(const char* __name) {
    return (int32_t)mq_unlink(__name);
}

void* libc_nto_mod_get_errno_ptr(void) {
    return (void*)__get_errno_ptr();
}

void libc_nto_mod_my_thread_exit(void* value_ptr) {
    __my_thread_exit(value_ptr);
}

int32_t libc_nto_mod_cxa_atexit(int32_t cb, void* __arg, void* __dso) {
    return (int32_t)__cxa_atexit(cb, __arg, __dso);
}

