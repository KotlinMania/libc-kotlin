#include "freebsdlike_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#if !defined(_WIN32)
#include <semaphore.h>
#include <dirent.h>
#endif
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
#endif

int32_t libc_freebsdlike_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsdlike_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_freebsdlike_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_freebsdlike_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_freebsdlike_mod_accept4(int32_t s, void* addr, void* addrlen, int32_t flags) {
    return (int32_t)accept4(s, addr, addrlen, flags);
}

int32_t libc_freebsdlike_mod_chflags(const char* path, uint64_t flags) {
    return (int32_t)chflags(path, flags);
}

int32_t libc_freebsdlike_mod_chflagsat(int32_t fd, const char* path, uint64_t flags, int32_t atflag) {
    return (int32_t)chflagsat(fd, path, flags, atflag);
}

int32_t libc_freebsdlike_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_freebsdlike_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_freebsdlike_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_freebsdlike_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_freebsdlike_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_freebsdlike_mod_pthread_getcpuclockid(int32_t thread, void* clk_id) {
    return (int32_t)pthread_getcpuclockid(thread, clk_id);
}

int32_t libc_freebsdlike_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_freebsdlike_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

void libc_freebsdlike_mod_endutxent(void) {
    endutxent();
}

int32_t libc_freebsdlike_mod_fchflags(int32_t fd, uint64_t flags) {
    return (int32_t)fchflags(fd, flags);
}

int32_t libc_freebsdlike_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_freebsdlike_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_freebsdlike_mod_getdomainname(char* name, int32_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_freebsdlike_mod_getgrent_r(void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrent_r(grp, buf, buflen, result);
}

int32_t libc_freebsdlike_mod_getpwent_r(void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwent_r(pwd, buf, buflen, result);
}

int32_t libc_freebsdlike_mod_getgrouplist(const char* name, uint32_t basegid, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(name, basegid, groups, ngroups);
}

int32_t libc_freebsdlike_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_freebsdlike_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_freebsdlike_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_freebsdlike_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

void* libc_freebsdlike_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_freebsdlike_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_freebsdlike_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

int32_t libc_freebsdlike_mod_initgroups(const char* name, uint32_t basegid) {
    return (int32_t)initgroups(name, basegid);
}

int32_t libc_freebsdlike_mod_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
#else
    (void)kq;
    (void)changelist;
    (void)nchanges;
    (void)eventlist;
    (void)nevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsdlike_mod_lchflags(const char* path, uint64_t flags) {
    return (int32_t)lchflags(path, flags);
}

int32_t libc_freebsdlike_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

void* libc_freebsdlike_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_freebsdlike_mod_mkfifoat(int32_t dirfd, const char* pathname, uint16_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_freebsdlike_mod_mknodat(int32_t dirfd, const char* pathname, uint16_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

uint64_t libc_freebsdlike_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

int32_t libc_freebsdlike_mod_mincore(void* addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_freebsdlike_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

char* libc_freebsdlike_mod_nl_langinfo_l(int32_t item, int32_t locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_freebsdlike_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_freebsdlike_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_freebsdlike_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_freebsdlike_mod_ppoll(void* fds, int32_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int64_t libc_freebsdlike_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_freebsdlike_mod_pthread_attr_get_np(int32_t tid, void* attr) {
    return (int32_t)pthread_attr_get_np(tid, attr);
}

int32_t libc_freebsdlike_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_freebsdlike_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_freebsdlike_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_freebsdlike_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_freebsdlike_mod_pthread_condattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_condattr_getpshared(attr, pshared);
}

int32_t libc_freebsdlike_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_freebsdlike_mod_pthread_condattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_condattr_setpshared(attr, pshared);
}

int32_t libc_freebsdlike_mod_pthread_main_np(void) {
    return (int32_t)pthread_main_np();
}

int32_t libc_freebsdlike_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_freebsdlike_mod_pthread_mutexattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_mutexattr_getpshared(attr, pshared);
}

int32_t libc_freebsdlike_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_freebsdlike_mod_pthread_rwlockattr_getpshared(void* attr, void* val) {
    return (int32_t)pthread_rwlockattr_getpshared(attr, val);
}

int32_t libc_freebsdlike_mod_pthread_rwlockattr_setpshared(void* attr, int32_t val) {
    return (int32_t)pthread_rwlockattr_setpshared(attr, val);
}

int32_t libc_freebsdlike_mod_pthread_barrierattr_init(void* attr) {
    return (int32_t)pthread_barrierattr_init(attr);
}

int32_t libc_freebsdlike_mod_pthread_barrierattr_destroy(void* attr) {
    return (int32_t)pthread_barrierattr_destroy(attr);
}

int32_t libc_freebsdlike_mod_pthread_barrierattr_getpshared(void* attr, void* shared) {
    return (int32_t)pthread_barrierattr_getpshared(attr, shared);
}

int32_t libc_freebsdlike_mod_pthread_barrierattr_setpshared(void* attr, int32_t shared) {
    return (int32_t)pthread_barrierattr_setpshared(attr, shared);
}

int32_t libc_freebsdlike_mod_pthread_barrier_init(void* barrier, void* attr, uint32_t count) {
    return (int32_t)pthread_barrier_init(barrier, attr, count);
}

int32_t libc_freebsdlike_mod_pthread_barrier_destroy(void* barrier) {
    return (int32_t)pthread_barrier_destroy(barrier);
}

int32_t libc_freebsdlike_mod_pthread_barrier_wait(void* barrier) {
    return (int32_t)pthread_barrier_wait(barrier);
}

void libc_freebsdlike_mod_pthread_get_name_np(int32_t tid, char* name, uint64_t len) {
    pthread_get_name_np(tid, name, len);
}

void libc_freebsdlike_mod_pthread_set_name_np(int32_t tid, const char* name) {
    pthread_set_name_np(tid, name);
}

int32_t libc_freebsdlike_mod_pthread_getname_np(int32_t thread, char* buffer, uint64_t length) {
    return (int32_t)pthread_getname_np(thread, buffer, length);
}

int32_t libc_freebsdlike_mod_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

int32_t libc_freebsdlike_mod_pthread_setschedparam(int32_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_freebsdlike_mod_pthread_getschedparam(int32_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_freebsdlike_mod_ptrace(int32_t request, int32_t pid, char* addr, int32_t data) {
    return (int32_t)ptrace(request, pid, addr, data);
}

int32_t libc_freebsdlike_mod_utrace(void* addr, uint64_t len) {
    return (int32_t)utrace(addr, len);
}

void* libc_freebsdlike_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

int64_t libc_freebsdlike_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

const char* libc_freebsdlike_mod_querylocale(int32_t mask, int32_t loc) {
    return (const char*)querylocale(mask, loc);
}

int32_t libc_freebsdlike_mod_rtprio(int32_t function, int32_t pid, void* rtp) {
    return (int32_t)rtprio(function, pid, rtp);
}

int32_t libc_freebsdlike_mod_sched_rr_get_interval(int32_t pid, void* t) {
    return (int32_t)sched_rr_get_interval(pid, t);
}

int32_t libc_freebsdlike_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_freebsdlike_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_freebsdlike_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_freebsdlike_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_freebsdlike_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_freebsdlike_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_freebsdlike_mod_sendfile(int32_t fd, int32_t s, int64_t offset, uint64_t nbytes, void* hdtr, void* sbytes, int32_t flags) {
    return (int32_t)sendfile(fd, s, offset, nbytes, hdtr, sbytes, flags);
}

int32_t libc_freebsdlike_mod_setdomainname(const char* name, int32_t len) {
    return (int32_t)setdomainname(name, len);
}

int32_t libc_freebsdlike_mod_sethostname(const char* name, int32_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_freebsdlike_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_freebsdlike_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_freebsdlike_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

int32_t libc_freebsdlike_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

void libc_freebsdlike_mod_setutxent(void) {
    setutxent();
}

int32_t libc_freebsdlike_mod_shm_open(const char* name, int32_t oflag, uint16_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_freebsdlike_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_freebsdlike_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_freebsdlike_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_freebsdlike_mod_sysctlbyname(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctlbyname(name, oldp, oldlenp, newp, newlen);
}

int32_t libc_freebsdlike_mod_sysctlnametomib(const char* name, void* mibp, void* sizep) {
    return (int32_t)sysctlnametomib(name, mibp, sizep);
}

int32_t libc_freebsdlike_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

int32_t libc_freebsdlike_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_freebsdlike_mod_ntp_adjtime(void* buf) {
    return (int32_t)ntp_adjtime(buf);
}

int32_t libc_freebsdlike_mod_ntp_gettime(void* buf) {
    return (int32_t)ntp_gettime(buf);
}

int32_t libc_freebsdlike_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

void* libc_freebsdlike_mod_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

uint64_t libc_freebsdlike_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_freebsdlike_mod_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

void libc_freebsdlike_mod_explicit_bzero(void* s, uint64_t len) {
    explicit_bzero(s, len);
}

int32_t libc_freebsdlike_mod_memset_s(void* s, uint64_t smax, int32_t c, uint64_t n) {
    return (int32_t)memset_s(s, smax, c, n);
}

int64_t libc_freebsdlike_mod_gethostid(void) {
    return (int64_t)gethostid();
}

void libc_freebsdlike_mod_sethostid(int64_t hostid) {
    sethostid(hostid);
}

int32_t libc_freebsdlike_mod_eui64aton(const char* a, void* e) {
    return (int32_t)eui64_aton(a, e);
}

int32_t libc_freebsdlike_mod_eui64ntoa(void* id, char* a, uint64_t len) {
    return (int32_t)eui64_ntoa(id, a, len);
}

int32_t libc_freebsdlike_mod_eui64ntohost(char* hostname, uint64_t len, void* id) {
    return (int32_t)eui64_ntohost(hostname, len, id);
}

int32_t libc_freebsdlike_mod_eui64hostton(const char* hostname, void* id) {
    return (int32_t)eui64_hostton(hostname, id);
}

int32_t libc_freebsdlike_mod_eaccess(const char* path, int32_t mode) {
    return (int32_t)eaccess(path, mode);
}

int32_t libc_freebsdlike_mod_kenv(int32_t action, const char* name, char* value, int32_t len) {
    return (int32_t)kenv(action, name, value, len);
}

int32_t libc_freebsdlike_mod_reboot(int32_t howto) {
    return (int32_t)reboot(howto);
}

int32_t libc_freebsdlike_mod_exect(const char* path, void* argv, void* envp) {
    return (int32_t)exect(path, argv, envp);
}

int32_t libc_freebsdlike_mod_execv_p(const char* file, const char* search_path, void* argv) {
    return (int32_t)execvP(file, search_path, argv);
}

int32_t libc_freebsdlike_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_freebsdlike_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_freebsdlike_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_freebsdlike_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_freebsdlike_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_freebsdlike_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_freebsdlike_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_freebsdlike_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint16_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_freebsdlike_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_freebsdlike_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

int32_t libc_freebsdlike_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_freebsdlike_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_freebsdlike_mod_mq_notify(int32_t mqd, void* notification) {
    return (int32_t)mq_notify(mqd, notification);
}

int64_t libc_freebsdlike_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_freebsdlike_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_freebsdlike_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int64_t libc_freebsdlike_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_freebsdlike_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_freebsdlike_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_freebsdlike_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

int32_t libc_freebsdlike_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int32_t libc_freebsdlike_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_freebsdlike_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_freebsdlike_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

char* libc_freebsdlike_mod_fparseln(void* stream, void* len, void* lineno, const char* delim, int32_t flags) {
    return (char*)fparseln((FILE*)stream, len, lineno, delim, flags);
}

uint64_t libc_freebsdlike_mod_backtrace(void* addrlist, uint64_t len) {
    return (uint64_t)backtrace(addrlist, len);
}

void* libc_freebsdlike_mod_backtrace_symbols(void* addrlist, uint64_t len) {
    return (void*)backtrace_symbols(addrlist, len);
}

int32_t libc_freebsdlike_mod_backtrace_symbols_fd(void* addrlist, uint64_t len, int32_t fd) {
    return (int32_t)backtrace_symbols_fd(addrlist, len, fd);
}

void* libc_freebsdlike_mod_kvm_open(const char* execfile, const char* corefile, const char* swapfile, int32_t flags, const char* errstr) {
    return (void*)kvm_open(execfile, corefile, swapfile, flags, errstr);
}

int32_t libc_freebsdlike_mod_kvm_close(void* kd) {
    return (int32_t)kvm_close(kd);
}

void* libc_freebsdlike_mod_kvm_getprocs(void* kd, int32_t op, int32_t arg, void* cnt) {
    return (void*)kvm_getprocs(kd, op, arg, cnt);
}

int32_t libc_freebsdlike_mod_kvm_getloadavg(void* kd, void* loadavg, int32_t nelem) {
    return (int32_t)kvm_getloadavg(kd, loadavg, nelem);
}

void* libc_freebsdlike_mod_kvm_openfiles(const char* execfile, const char* corefile, const char* swapfile, int32_t flags, char* errbuf) {
    return (void*)kvm_openfiles(execfile, corefile, swapfile, flags, errbuf);
}

int64_t libc_freebsdlike_mod_kvm_read(void* kd, uint64_t addr, void* buf, uint64_t nbytes) {
    return (int64_t)kvm_read(kd, addr, buf, nbytes);
}

int64_t libc_freebsdlike_mod_kvm_write(void* kd, uint64_t addr, void* buf, uint64_t nbytes) {
    return (int64_t)kvm_write(kd, addr, buf, nbytes);
}

