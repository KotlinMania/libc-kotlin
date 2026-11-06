#include "solarish_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <semaphore.h>
#include <dirent.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <pthread.h>
#include <sys/socket.h>
#endif

int32_t libc_solarish_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_solarish_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_solarish_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_solarish_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solarish_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_solarish_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int32_t libc_solarish_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_solarish_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int64_t libc_solarish_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_solarish_mod_rand(void) {
    return (int32_t)rand();
}

void libc_solarish_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_solarish_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int64_t libc_solarish_mod_getrandom(void* bbuf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(bbuf, buflen, flags);
}

int32_t libc_solarish_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_solarish_mod_settimeofday(void* tp, void* tz) {
    return (int32_t)settimeofday(tp, tz);
}

int32_t libc_solarish_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_solarish_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_solarish_mod_stack_getbounds(void* sp) {
    return (int32_t)stack_getbounds(sp);
}

int32_t libc_solarish_mod_getgrouplist(const char* name, uint32_t basegid, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(name, basegid, groups, ngroups);
}

int32_t libc_solarish_mod_initgroups(const char* name, uint32_t basegid) {
    return (int32_t)initgroups(name, basegid);
}

int32_t libc_solarish_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_solarish_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

void* libc_solarish_mod_errno(void) {
    return (void*)___errno();
}

int32_t libc_solarish_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_solarish_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_solarish_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_solarish_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_solarish_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

void libc_solarish_mod_setpwent(void) {
    setpwent();
}

void libc_solarish_mod_endpwent(void) {
    endpwent();
}

void* libc_solarish_mod_getpwent(void) {
    return (void*)getpwent();
}

int32_t libc_solarish_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

char* libc_solarish_mod_nl_langinfo_l(int32_t item, int32_t locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_solarish_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

void libc_solarish_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int32_t libc_solarish_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

int32_t libc_solarish_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

const char* libc_solarish_mod_getprogname(void) {
    return (const char*)getprogname();
}

void libc_solarish_mod_setprogname(const char* name) {
    setprogname(name);
}

int32_t libc_solarish_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

int32_t libc_solarish_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_solarish_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_solarish_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint64_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_solarish_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_solarish_mod_sethostname(const char* name, int32_t len) {
    return (int32_t)sethostname(name, len);
}

void* libc_solarish_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_solarish_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_solarish_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_solarish_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_solarish_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_solarish_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_solarish_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_solarish_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_solarish_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_solarish_mod_pthread_getname_np(uint32_t tid, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(tid, name, len);
}

int32_t libc_solarish_mod_pthread_setname_np(uint32_t tid, const char* name) {
    return (int32_t)pthread_setname_np(tid, name);
}

int32_t libc_solarish_mod_waitid(uint32_t idtype, int32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_solarish_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_solarish_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_solarish_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_solarish_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_solarish_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_solarish_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_init(void* file_actions) {
    return (int32_t)posix_spawn_file_actions_init(file_actions);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_destroy(void* file_actions) {
    return (int32_t)posix_spawn_file_actions_destroy(file_actions);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addopen(void* file_actions, int32_t fildes, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(file_actions, fildes, path, oflag, mode);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addclose(void* file_actions, int32_t fildes) {
    return (int32_t)posix_spawn_file_actions_addclose(file_actions, fildes);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_adddup2(void* file_actions, int32_t fildes, int32_t newfildes) {
    return (int32_t)posix_spawn_file_actions_adddup2(file_actions, fildes, newfildes);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addclosefrom_np(void* file_actions, int32_t lowfiledes) {
    return (int32_t)posix_spawn_file_actions_addclosefrom_np(file_actions, lowfiledes);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addchdir(void* file_actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir(file_actions, path);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addchdir_np(void* file_actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir_np(file_actions, path);
}

int32_t libc_solarish_mod_posix_spawn_file_actions_addfchdir(void* file_actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir(file_actions, fd);
}

int32_t libc_solarish_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_solarish_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_solarish_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_solarish_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_solarish_mod_posix_spawnattr_setpgroup(void* attr, int32_t pgroup) {
    return (int32_t)posix_spawnattr_setpgroup(attr, pgroup);
}

int32_t libc_solarish_mod_posix_spawnattr_getpgroup(void* attr, void* _pgroup) {
    return (int32_t)posix_spawnattr_getpgroup(attr, _pgroup);
}

int32_t libc_solarish_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_solarish_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_solarish_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t policy) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, policy);
}

int32_t libc_solarish_mod_posix_spawnattr_getschedpolicy(void* attr, void* _policy) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, _policy);
}

int32_t libc_solarish_mod_posix_spawnattr_setsigdefault(void* attr, void* sigdefault) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, sigdefault);
}

int32_t libc_solarish_mod_posix_spawnattr_getsigdefault(void* attr, void* sigdefault) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, sigdefault);
}

int32_t libc_solarish_mod_posix_spawnattr_setsigignore_np(void* attr, void* sigignore) {
    return (int32_t)posix_spawnattr_setsigignore_np(attr, sigignore);
}

int32_t libc_solarish_mod_posix_spawnattr_getsigignore_np(void* attr, void* sigignore) {
    return (int32_t)posix_spawnattr_getsigignore_np(attr, sigignore);
}

int32_t libc_solarish_mod_posix_spawnattr_setsigmask(void* attr, void* sigmask) {
    return (int32_t)posix_spawnattr_setsigmask(attr, sigmask);
}

int32_t libc_solarish_mod_posix_spawnattr_getsigmask(void* attr, void* sigmask) {
    return (int32_t)posix_spawnattr_getsigmask(attr, sigmask);
}

void* libc_solarish_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_solarish_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_solarish_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_solarish_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

int32_t libc_solarish_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_solarish_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_solarish_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_solarish_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_solarish_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_solarish_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

void* libc_solarish_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int64_t libc_solarish_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_solarish_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_solarish_mod_futimesat(int32_t fd, const char* path, void* times) {
    return (int32_t)futimesat(fd, path, times);
}

int32_t libc_solarish_mod_futimens(int32_t dirfd, void* times) {
    return (int32_t)futimens(dirfd, times);
}

int32_t libc_solarish_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

char* libc_solarish_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_solarish_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)__xnet_bind(socket, address, address_len);
}

int64_t libc_solarish_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_solarish_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_solarish_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)__xnet_sendmsg(fd, msg, flags);
}

int64_t libc_solarish_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)__xnet_recvmsg(fd, msg, flags);
}

int32_t libc_solarish_mod_accept4(int32_t fd, void* address, void* address_len, int32_t flags) {
    return (int32_t)accept4(fd, address, address_len, flags);
}

int32_t libc_solarish_mod_mq_close(void* mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_solarish_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_solarish_mod_mq_receive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int64_t libc_solarish_mod_mq_timedreceive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_solarish_mod_mq_send(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_solarish_mod_mq_timedsend(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_solarish_mod_mq_getattr(void* mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_solarish_mod_mq_setattr(void* mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int32_t libc_solarish_mod_port_create(void) {
    return (int32_t)port_create();
}

int32_t libc_solarish_mod_port_associate(int32_t port, int32_t source, uint64_t object, int32_t events, void* user) {
    return (int32_t)port_associate(port, source, object, events, user);
}

int32_t libc_solarish_mod_port_dissociate(int32_t port, int32_t source, uint64_t object) {
    return (int32_t)port_dissociate(port, source, object);
}

int32_t libc_solarish_mod_port_get(int32_t port, void* pe, void* timeout) {
    return (int32_t)port_get(port, pe, timeout);
}

int32_t libc_solarish_mod_port_getn(int32_t port, void* pe_list, uint32_t max, void* nget, void* timeout) {
    return (int32_t)port_getn(port, pe_list, max, nget, timeout);
}

int32_t libc_solarish_mod_port_send(int32_t port, int32_t events, void* user) {
    return (int32_t)port_send(port, events, user);
}

int32_t libc_solarish_mod_port_sendn(void* port_list, void* error_list, uint32_t nent, int32_t events, void* user) {
    return (int32_t)port_sendn(port_list, error_list, nent, events, user);
}

int32_t libc_solarish_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_solarish_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_solarish_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_solarish_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_solarish_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_solarish_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

uint32_t libc_solarish_mod_thr_self(void) {
    return (uint32_t)thr_self();
}

int32_t libc_solarish_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_solarish_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_solarish_mod_pthread_kill(uint32_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solarish_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_solarish_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_solarish_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_solarish_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_solarish_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_solarish_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_solarish_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_solarish_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_solarish_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_solarish_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

void* libc_solarish_mod_native_getpwent_r(void* pwd, char* buf, int32_t buflen) {
    return (void*)native_getpwent_r(pwd, buf, buflen);
}

void* libc_solarish_mod_native_getgrent_r(void* grp, char* buf, int32_t buflen) {
    return (void*)native_getgrent_r(grp, buf, buflen);
}

int32_t libc_solarish_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_solarish_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_solarish_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void libc_solarish_mod_setgrent(void) {
    setgrent();
}

void libc_solarish_mod_endgrent(void) {
    endgrent();
}

void* libc_solarish_mod_getgrent(void) {
    return (void*)getgrent();
}

void* libc_solarish_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_solarish_mod_dup3(int32_t src, int32_t dst, int32_t flags) {
    return (int32_t)dup3(src, dst, flags);
}

int32_t libc_solarish_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_solarish_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

void* libc_solarish_mod_makeutx(void* ux) {
    return (void*)makeutx(ux);
}

void* libc_solarish_mod_modutx(void* ux) {
    return (void*)modutx(ux);
}

void libc_solarish_mod_updwtmpx(const char* file, void* ut) {
    updwtmpx(file, ut);
}

int32_t libc_solarish_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

void* libc_solarish_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_solarish_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_solarish_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_solarish_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

void libc_solarish_mod_setutxent(void) {
    setutxent();
}

void libc_solarish_mod_endutxent(void) {
    endutxent();
}

void libc_solarish_mod_endutent(void) {
    endutent();
}

void* libc_solarish_mod_getutent(void) {
    return (void*)getutent();
}

void* libc_solarish_mod_getutid(void* u) {
    return (void*)getutid(u);
}

void* libc_solarish_mod_getutline(void* u) {
    return (void*)getutline(u);
}

void* libc_solarish_mod_pututline(void* u) {
    return (void*)pututline(u);
}

void libc_solarish_mod_setutent(void) {
    setutent();
}

int32_t libc_solarish_mod_utmpname(const char* file) {
    return (int32_t)utmpname(file);
}

void libc_solarish_mod_getutmp(void* ux, void* u) {
    getutmp(ux, u);
}

void libc_solarish_mod_getutmpx(void* u, void* ux) {
    getutmpx(u, ux);
}

void libc_solarish_mod_updwtmp(const char* file, void* u) {
    updwtmp(file, u);
}

int32_t libc_solarish_mod_ntp_adjtime(void* buf) {
    return (int32_t)ntp_adjtime(buf);
}

int32_t libc_solarish_mod_ntp_gettime(void* buf) {
    return (int32_t)ntp_gettime(buf);
}

int32_t libc_solarish_mod_timer_create(int32_t clock_id, void* evp, void* timerid) {
    return (int32_t)timer_create(clock_id, evp, timerid);
}

int32_t libc_solarish_mod_timer_delete(int32_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_solarish_mod_timer_getoverrun(int32_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_solarish_mod_timer_gettime(int32_t timerid, void* value) {
    return (int32_t)timer_gettime(timerid, value);
}

int32_t libc_solarish_mod_timer_settime(int32_t timerid, int32_t flags, void* value, void* ovalue) {
    return (int32_t)timer_settime(timerid, flags, value, ovalue);
}

void* libc_solarish_mod_ucred_get(int32_t pid) {
    return (void*)ucred_get(pid);
}

int32_t libc_solarish_mod_getpeerucred(int32_t fd, void* ucred) {
    return (int32_t)getpeerucred(fd, ucred);
}

void libc_solarish_mod_ucred_free(void* ucred) {
    ucred_free(ucred);
}

uint32_t libc_solarish_mod_ucred_geteuid(void* ucred) {
    return (uint32_t)ucred_geteuid(ucred);
}

uint32_t libc_solarish_mod_ucred_getruid(void* ucred) {
    return (uint32_t)ucred_getruid(ucred);
}

uint32_t libc_solarish_mod_ucred_getsuid(void* ucred) {
    return (uint32_t)ucred_getsuid(ucred);
}

uint32_t libc_solarish_mod_ucred_getegid(void* ucred) {
    return (uint32_t)ucred_getegid(ucred);
}

uint32_t libc_solarish_mod_ucred_getrgid(void* ucred) {
    return (uint32_t)ucred_getrgid(ucred);
}

uint32_t libc_solarish_mod_ucred_getsgid(void* ucred) {
    return (uint32_t)ucred_getsgid(ucred);
}

int32_t libc_solarish_mod_ucred_getgroups(void* ucred, void* groups) {
    return (int32_t)ucred_getgroups(ucred, groups);
}

int32_t libc_solarish_mod_ucred_getpid(void* ucred) {
    return (int32_t)ucred_getpid(ucred);
}

int32_t libc_solarish_mod_ucred_getprojid(void* ucred) {
    return (int32_t)ucred_getprojid(ucred);
}

int32_t libc_solarish_mod_ucred_getzoneid(void* ucred) {
    return (int32_t)ucred_getzoneid(ucred);
}

uint32_t libc_solarish_mod_ucred_getpflags(void* ucred, uint32_t flags) {
    return (uint32_t)ucred_getpflags(ucred, flags);
}

uint64_t libc_solarish_mod_ucred_size(void) {
    return (uint64_t)ucred_size();
}

int32_t libc_solarish_mod_pset_create(void* newpset) {
    return (int32_t)pset_create(newpset);
}

int32_t libc_solarish_mod_pset_destroy(int32_t pset) {
    return (int32_t)pset_destroy(pset);
}

int32_t libc_solarish_mod_pset_assign(int32_t pset, int32_t cpu, void* opset) {
    return (int32_t)pset_assign(pset, cpu, opset);
}

int32_t libc_solarish_mod_pset_info(int32_t pset, void* tpe, void* numcpus, void* cpulist) {
    return (int32_t)pset_info(pset, tpe, numcpus, cpulist);
}

int32_t libc_solarish_mod_pset_bind(int32_t pset, uint32_t idtype, int32_t id, void* opset) {
    return (int32_t)pset_bind(pset, idtype, id, opset);
}

int32_t libc_solarish_mod_pset_list(void* pset, void* numpsets) {
    return (int32_t)pset_list(pset, numpsets);
}

int32_t libc_solarish_mod_pset_setattr(int32_t pset, uint32_t attr) {
    return (int32_t)pset_setattr(pset, attr);
}

int32_t libc_solarish_mod_pset_getattr(int32_t pset, void* attr) {
    return (int32_t)pset_getattr(pset, attr);
}

int32_t libc_solarish_mod_processor_bind(uint32_t idtype, int32_t id, int32_t new_binding, void* old_binding) {
    return (int32_t)processor_bind(idtype, id, new_binding, old_binding);
}

int32_t libc_solarish_mod_p_online(int32_t processorid, int32_t flag) {
    return (int32_t)p_online(processorid, flag);
}

int32_t libc_solarish_mod_processor_info(int32_t processorid, void* infop) {
    return (int32_t)processor_info(processorid, infop);
}

const char* libc_solarish_mod_getexecname(void) {
    return (const char*)getexecname();
}

int64_t libc_solarish_mod_gethostid(void) {
    return (int64_t)gethostid();
}

uint32_t libc_solarish_mod_getpflags(uint32_t flags) {
    return (uint32_t)getpflags(flags);
}

int32_t libc_solarish_mod_setpflags(uint32_t flags, uint32_t value) {
    return (int32_t)setpflags(flags, value);
}

int32_t libc_solarish_mod_sysinfo(int32_t command, char* buf, int64_t count) {
    return (int32_t)sysinfo(command, buf, count);
}

int32_t libc_solarish_mod_faccessat(int32_t fd, const char* path, int32_t amode, int32_t flag) {
    return (int32_t)faccessat(fd, path, amode, flag);
}

int32_t libc_solarish_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

int32_t libc_solarish_mod_getpagesize(void) {
    return (int32_t)getpagesize();
}

int32_t libc_solarish_mod_getpagesizes(void* pagesize, int32_t nelem) {
    return (int32_t)getpagesizes(pagesize, nelem);
}

int32_t libc_solarish_mod_mmapobj(int32_t fd, uint32_t flags, void* storage, void* elements, void* arg) {
    return (int32_t)mmapobj(fd, flags, storage, elements, arg);
}

int32_t libc_solarish_mod_meminfo(void* inaddr, int32_t addr_count, void* info_req, int32_t info_count, void* outdata, void* validity) {
    return (int32_t)meminfo(inaddr, addr_count, info_req, info_count, outdata, validity);
}

char* libc_solarish_mod_strsep(void* string, const char* delim) {
    return (char*)strsep(string, delim);
}

uint32_t libc_solarish_mod_getisax(void* array, uint32_t n) {
    return (uint32_t)getisax(array, n);
}

int32_t libc_solarish_mod_backtrace(void* buffer, int32_t size) {
    return (int32_t)backtrace(buffer, size);
}

void* libc_solarish_mod_backtrace_symbols(void* buffer, int32_t size) {
    return (void*)backtrace_symbols(buffer, size);
}

void libc_solarish_mod_backtrace_symbols_fd(void* buffer, int32_t size, int32_t fd) {
    backtrace_symbols_fd(buffer, size, fd);
}

int32_t libc_solarish_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

void libc_solarish_mod_sync(void) {
    sync();
}

int32_t libc_solarish_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_solarish_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int32_t libc_solarish_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_solarish_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int64_t libc_solarish_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_solarish_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_solarish_mod_aio_waitn(void* aiocb_list, uint32_t nent, void* nwait, void* timeout) {
    return (int32_t)aio_waitn(aiocb_list, nent, nwait, timeout);
}

int32_t libc_solarish_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_solarish_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

uint32_t libc_solarish_mod_major(int32_t version, uint64_t devnum) {
    return (uint32_t)__major(version, devnum);
}

uint32_t libc_solarish_mod_minor(int32_t version, uint64_t devnum) {
    return (uint32_t)__minor(version, devnum);
}

uint64_t libc_solarish_mod_makedev(int32_t version, uint32_t majdev, uint32_t mindev) {
    return (uint64_t)__makedev(version, majdev, mindev);
}

uint32_t libc_solarish_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

void libc_solarish_mod_arc4random_buf(void* buf, uint64_t nbytes) {
    arc4random_buf(buf, nbytes);
}

uint32_t libc_solarish_mod_arc4random_uniform(uint32_t upper_bound) {
    return (uint32_t)arc4random_uniform(upper_bound);
}

char* libc_solarish_mod_secure_getenv(const char* name) {
    return (char*)secure_getenv(name);
}

uint64_t libc_solarish_mod_strftime(char* s, uint64_t maxsize, const char* format, void* timeptr) {
    return (uint64_t)strftime(s, maxsize, format, timeptr);
}

uint64_t libc_solarish_mod_strftime_l(char* s, uint64_t maxsize, const char* format, void* timeptr, int32_t loc) {
    return (uint64_t)strftime_l(s, maxsize, format, timeptr, loc);
}

int64_t libc_solarish_mod_sendfile(int32_t out_fd, int32_t in_fd, void* off, uint64_t len) {
    return (int64_t)sendfile(out_fd, in_fd, off, len);
}

int64_t libc_solarish_mod_sendfilev(int32_t fildes, void* vec, int32_t sfvcnt, void* xferred) {
    return (int64_t)sendfilev(fildes, vec, sfvcnt, xferred);
}

uint64_t libc_solarish_mod_lgrp_init(uint32_t view) {
    return (uint64_t)lgrp_init(view);
}

int32_t libc_solarish_mod_lgrp_fini(uint64_t cookie) {
    return (int32_t)lgrp_fini(cookie);
}

int32_t libc_solarish_mod_lgrp_affinity_get(uint32_t idtype, int32_t id, int32_t lgrp) {
    return (int32_t)lgrp_affinity_get(idtype, id, lgrp);
}

int32_t libc_solarish_mod_lgrp_affinity_set(uint32_t idtype, int32_t id, int32_t lgrp, int32_t aff) {
    return (int32_t)lgrp_affinity_set(idtype, id, lgrp, aff);
}

int32_t libc_solarish_mod_lgrp_cpus(uint64_t cookie, int32_t lgrp, void* cpuids, uint32_t count, uint32_t content) {
    return (int32_t)lgrp_cpus(cookie, lgrp, cpuids, count, content);
}

int64_t libc_solarish_mod_lgrp_mem_size(uint64_t cookie, int32_t lgrp, uint32_t tpe, uint32_t content) {
    return (int64_t)lgrp_mem_size(cookie, lgrp, tpe, content);
}

int32_t libc_solarish_mod_lgrp_nlgrps(uint64_t cookie) {
    return (int32_t)lgrp_nlgrps(cookie);
}

uint32_t libc_solarish_mod_lgrp_view(uint64_t cookie) {
    return (uint32_t)lgrp_view(cookie);
}

int32_t libc_solarish_mod_lgrp_home(uint32_t idtype, int32_t id) {
    return (int32_t)lgrp_home(idtype, id);
}

int32_t libc_solarish_mod_lgrp_version(int32_t version) {
    return (int32_t)lgrp_version(version);
}

int32_t libc_solarish_mod_lgrp_resources(uint64_t cookie, int32_t lgrp, void* lgrps, uint32_t count, int32_t tpe) {
    return (int32_t)lgrp_resources(cookie, lgrp, lgrps, count, tpe);
}

int32_t libc_solarish_mod_lgrp_root(uint64_t cookie) {
    return (int32_t)lgrp_root(cookie);
}

