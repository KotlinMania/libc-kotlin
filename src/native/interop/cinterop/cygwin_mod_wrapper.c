#include "cygwin_mod_wrapper.h"
#include <errno.h>
#include <time.h>
#include <stdlib.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <pthread.h>
#include <sys/socket.h>
#include <semaphore.h>
#include <sys/mman.h>
#include <sys/ioctl.h>
#include <dirent.h>
#endif

int32_t libc_cygwin_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_cygwin_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_cygwin_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

int32_t libc_cygwin_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_cygwin_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_cygwin_mod_pthread_kill(void* thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_cygwin_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

uint64_t libc_cygwin_mod_strftime(char* s, uint64_t max, const char* format, void* tm) {
    return (uint64_t)strftime(s, max, format, tm);
}

char* libc_cygwin_mod_asctime_r(void* tm, char* buf) {
    return (char*)asctime_r(tm, buf);
}

char* libc_cygwin_mod_ctime_r(void* timep, char* buf) {
    return (char*)ctime_r(timep, buf);
}

char* libc_cygwin_mod_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

int32_t libc_cygwin_mod_clock_settime(uint64_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_cygwin_mod_clock_gettime(uint64_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_cygwin_mod_clock_getres(uint64_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_cygwin_mod_timer_create(uint64_t clockid, void* sevp, void* timerid) {
    return (int32_t)timer_create(clockid, sevp, timerid);
}

int32_t libc_cygwin_mod_timer_delete(uint64_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_cygwin_mod_timer_settime(uint64_t timerid, int32_t flags, void* new_value, void* old_value) {
    return (int32_t)timer_settime(timerid, flags, new_value, old_value);
}

int32_t libc_cygwin_mod_timer_gettime(uint64_t timerid, void* curr_value) {
    return (int32_t)timer_gettime(timerid, curr_value);
}

int32_t libc_cygwin_mod_timer_getoverrun(uint64_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_cygwin_mod_clock_nanosleep(uint64_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_cygwin_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_cygwin_mod_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

int32_t libc_cygwin_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int32_t libc_cygwin_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int32_t libc_cygwin_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_cygwin_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

int32_t libc_cygwin_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_cygwin_mod_futimesat(int32_t fd, const char* path, void* times) {
    return (int32_t)futimesat(fd, path, times);
}

int32_t libc_cygwin_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_cygwin_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_cygwin_mod_getpriority(int32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_cygwin_mod_setpriority(int32_t which, uint32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_cygwin_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_cygwin_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

void* libc_cygwin_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_cygwin_mod_setpwent(void) {
    setpwent();
}

void libc_cygwin_mod_endpwent(void) {
    endpwent();
}

void* libc_cygwin_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_cygwin_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int64_t libc_cygwin_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_cygwin_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int32_t libc_cygwin_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_cygwin_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_cygwin_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_cygwin_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

void libc_cygwin_mod_dlfork(int32_t val) {
    dlfork(val);
}

int32_t libc_cygwin_mod_accept4(int32_t s, void* addr, void* addrlen, int32_t flags) {
    return (int32_t)accept4(s, addr, addrlen, flags);
}

int32_t libc_cygwin_mod_bind(int32_t socket, void* address, int32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_cygwin_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int64_t libc_cygwin_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

int64_t libc_cygwin_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int32_t libc_cygwin_mod_getnameinfo(void* sa, int32_t salen, char* host, int32_t hostlen, char* serv, int32_t sevlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, sevlen, flags);
}

int32_t libc_cygwin_mod_ppoll(void* fds, uint32_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int32_t libc_cygwin_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

void libc_cygwin_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int32_t libc_cygwin_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

int32_t libc_cygwin_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

int32_t libc_cygwin_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_cygwin_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_cygwin_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_cygwin_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_cygwin_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_cygwin_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_cygwin_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_cygwin_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_cygwin_mod_getpt(void) {
    return (int32_t)getpt();
}

void* libc_cygwin_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_cygwin_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

int32_t libc_cygwin_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

uint32_t libc_cygwin_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

uint32_t libc_cygwin_mod_arc4random_uniform(uint32_t l) {
    return (uint32_t)arc4random_uniform(l);
}

void libc_cygwin_mod_arc4random_buf(void* buf, uint64_t size) {
    arc4random_buf(buf, size);
}

int64_t libc_cygwin_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_cygwin_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_cygwin_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_cygwin_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_cygwin_mod_rand(void) {
    return (int32_t)rand();
}

void* libc_cygwin_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

void* libc_cygwin_mod_reallocf(void* ptr, uint64_t size) {
    return (void*)reallocf(ptr, size);
}

void libc_cygwin_mod_srand(uint32_t seed) {
    srand(seed);
}

double libc_cygwin_mod_drand48(void) {
    return (double)drand48();
}

double libc_cygwin_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_cygwin_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_cygwin_mod_lcong48(void* p) {
    lcong48(p);
}

int64_t libc_cygwin_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_cygwin_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_cygwin_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

void* libc_cygwin_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_cygwin_mod_srand48(int64_t seed) {
    srand48(seed);
}

void libc_cygwin_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* compar, void* arg) {
    qsort_r(base, num, size, compar, arg);
}

int32_t libc_cygwin_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_cygwin_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int32_t libc_cygwin_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_cygwin_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_cygwin_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_cygwin_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_cygwin_mod_explicit_bzero(void* s, uint64_t len) {
    explicit_bzero(s, len);
}

int32_t libc_cygwin_mod_ffs(int32_t value) {
    return (int32_t)ffs(value);
}

int32_t libc_cygwin_mod_ffsl(int64_t value) {
    return (int32_t)ffsl(value);
}

int32_t libc_cygwin_mod_ffsll(int64_t value) {
    return (int32_t)ffsll(value);
}

int32_t libc_cygwin_mod_fls(int32_t value) {
    return (int32_t)fls(value);
}

int32_t libc_cygwin_mod_flsl(int64_t value) {
    return (int32_t)flsl(value);
}

int32_t libc_cygwin_mod_flsll(int64_t value) {
    return (int32_t)flsll(value);
}

int32_t libc_cygwin_mod_strcasecmp_l(const char* s1, const char* s2, int32_t loc) {
    return (int32_t)strcasecmp_l(s1, s2, loc);
}

int32_t libc_cygwin_mod_strncasecmp_l(const char* s1, const char* s2, uint64_t n, int32_t loc) {
    return (int32_t)strncasecmp_l(s1, s2, n, loc);
}

int32_t libc_cygwin_mod_timingsafe_bcmp(void* a, void* b, uint64_t len) {
    return (int32_t)timingsafe_bcmp(a, b, len);
}

int32_t libc_cygwin_mod_timingsafe_memcmp(void* a, void* b, uint64_t len) {
    return (int32_t)timingsafe_memcmp(a, b, len);
}

void* libc_cygwin_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

void* libc_cygwin_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_cygwin_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)__xpg_strerror_r(errnum, buf, buflen);
}

char* libc_cygwin_mod_strsep(void* string, const char* delim) {
    return (char*)strsep(string, delim);
}

char* libc_cygwin_mod_basename(const char* path) {
    return (char*)__gnu_basename(path);
}

int32_t libc_cygwin_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_cygwin_mod_dup3(int32_t src, int32_t dst, int32_t flags) {
    return (int32_t)dup3(src, dst, flags);
}

int32_t libc_cygwin_mod_eaccess(const char* pathname, int32_t mode) {
    return (int32_t)eaccess(pathname, mode);
}

int32_t libc_cygwin_mod_euidaccess(const char* pathname, int32_t mode) {
    return (int32_t)euidaccess(pathname, mode);
}

int32_t libc_cygwin_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_cygwin_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_cygwin_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_cygwin_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_cygwin_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_cygwin_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int64_t libc_cygwin_mod_gethostid(void) {
    return (int64_t)gethostid();
}

int32_t libc_cygwin_mod_getpagesize(void) {
    return (int32_t)getpagesize();
}

int32_t libc_cygwin_mod_getpeereid(int32_t socket, void* euid, void* egid) {
    return (int32_t)getpeereid(socket, euid, egid);
}

int32_t libc_cygwin_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

int32_t libc_cygwin_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

void* libc_cygwin_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_cygwin_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_cygwin_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_cygwin_mod_vhangup(void) {
    return (int32_t)vhangup();
}

int32_t libc_cygwin_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

void libc_cygwin_mod_sync(void) {
    sync();
}

void* libc_cygwin_mod_errno(void) {
    return (void*)__errno();
}

int32_t libc_cygwin_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_cygwin_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_cygwin_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_cygwin_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_cygwin_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_cygwin_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_cygwin_mod_sched_rr_get_interval(int32_t pid, void* t) {
    return (int32_t)sched_rr_get_interval(pid, t);
}

int32_t libc_cygwin_mod_sched_getcpu(void) {
    return (int32_t)sched_getcpu();
}

int32_t libc_cygwin_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* mask) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, mask);
}

int32_t libc_cygwin_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_cygwin_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_cygwin_mod_pthread_attr_getschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_getschedparam(attr, param);
}

int32_t libc_cygwin_mod_pthread_attr_setschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_setschedparam(attr, param);
}

int32_t libc_cygwin_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_cygwin_mod_pthread_cancel(void* thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_cygwin_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_cygwin_mod_pthread_condattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_condattr_getpshared(attr, pshared);
}

int32_t libc_cygwin_mod_pthread_condattr_setclock(void* attr, uint64_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_cygwin_mod_pthread_condattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_condattr_setpshared(attr, pshared);
}

int32_t libc_cygwin_mod_pthread_barrierattr_init(void* attr) {
    return (int32_t)pthread_barrierattr_init(attr);
}

int32_t libc_cygwin_mod_pthread_barrierattr_setpshared(void* attr, int32_t shared) {
    return (int32_t)pthread_barrierattr_setpshared(attr, shared);
}

int32_t libc_cygwin_mod_pthread_barrierattr_getpshared(void* attr, void* shared) {
    return (int32_t)pthread_barrierattr_getpshared(attr, shared);
}

int32_t libc_cygwin_mod_pthread_barrierattr_destroy(void* attr) {
    return (int32_t)pthread_barrierattr_destroy(attr);
}

int32_t libc_cygwin_mod_pthread_barrier_init(void* barrier, void* attr, uint32_t count) {
    return (int32_t)pthread_barrier_init(barrier, attr, count);
}

int32_t libc_cygwin_mod_pthread_barrier_destroy(void* barrier) {
    return (int32_t)pthread_barrier_destroy(barrier);
}

int32_t libc_cygwin_mod_pthread_barrier_wait(void* barrier) {
    return (int32_t)pthread_barrier_wait(barrier);
}

int32_t libc_cygwin_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_cygwin_mod_pthread_getcpuclockid(void* thread, void* clk_id) {
    return (int32_t)pthread_getcpuclockid(thread, clk_id);
}

int32_t libc_cygwin_mod_pthread_getschedparam(void* native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_cygwin_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_cygwin_mod_pthread_mutexattr_getprotocol(void* attr, void* protocol) {
    return (int32_t)pthread_mutexattr_getprotocol(attr, protocol);
}

int32_t libc_cygwin_mod_pthread_mutexattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_mutexattr_getpshared(attr, pshared);
}

int32_t libc_cygwin_mod_pthread_mutexattr_setprotocol(void* attr, int32_t protocol) {
    return (int32_t)pthread_mutexattr_setprotocol(attr, protocol);
}

int32_t libc_cygwin_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_cygwin_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_cygwin_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_cygwin_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_cygwin_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_cygwin_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_cygwin_mod_pthread_rwlockattr_getpshared(void* attr, void* val) {
    return (int32_t)pthread_rwlockattr_getpshared(attr, val);
}

int32_t libc_cygwin_mod_pthread_rwlockattr_setpshared(void* attr, int32_t val) {
    return (int32_t)pthread_rwlockattr_setpshared(attr, val);
}

int32_t libc_cygwin_mod_pthread_setschedparam(void* native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_cygwin_mod_pthread_setschedprio(void* native, int32_t priority) {
    return (int32_t)pthread_setschedprio(native, priority);
}

int32_t libc_cygwin_mod_pthread_getaffinity_np(void* thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_getaffinity_np(thread, cpusetsize, cpuset);
}

int32_t libc_cygwin_mod_pthread_getattr_np(void* native, void* attr) {
    return (int32_t)pthread_getattr_np(native, attr);
}

int32_t libc_cygwin_mod_pthread_getname_np(void* thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

int32_t libc_cygwin_mod_pthread_setaffinity_np(void* thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_setaffinity_np(thread, cpusetsize, cpuset);
}

int32_t libc_cygwin_mod_pthread_setname_np(void* thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

int32_t libc_cygwin_mod_pthread_sigqueue(void* thread, int32_t sig, int32_t value) {
    return (int32_t)pthread_sigqueue(thread, sig, value);
}

int64_t libc_cygwin_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

int32_t libc_cygwin_mod_mount(const char* src, const char* target, uint32_t flags) {
    return (int32_t)mount(src, target, flags);
}

int32_t libc_cygwin_mod_umount(const char* target) {
    return (int32_t)umount(target);
}

int32_t libc_cygwin_mod_cygwin_umount(const char* target, uint32_t flags) {
    return (int32_t)cygwin_umount(target, flags);
}

int32_t libc_cygwin_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

void libc_cygwin_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_cygwin_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_cygwin_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_cygwin_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_cygwin_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_cygwin_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_cygwin_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_cygwin_mod_posix_spawnattr_getsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_cygwin_mod_posix_spawnattr_setsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_cygwin_mod_posix_spawnattr_getsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_cygwin_mod_posix_spawnattr_setsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_cygwin_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_cygwin_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_cygwin_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addchdir(void* actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir(actions, path);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addfchdir(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir(actions, fd);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addchdir_np(void* actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir_np(actions, path);
}

int32_t libc_cygwin_mod_posix_spawn_file_actions_addfchdir_np(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir_np(actions, fd);
}

int32_t libc_cygwin_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_cygwin_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

void* libc_cygwin_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_cygwin_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_cygwin_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

void* libc_cygwin_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_cygwin_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_cygwin_mod_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

int32_t libc_cygwin_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_cygwin_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_cygwin_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_cygwin_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_cygwin_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate(fd, mode, offset, len);
}

void libc_cygwin_mod_endutxent(void) {
    endutxent();
}

void* libc_cygwin_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_cygwin_mod_getutxid(void* id) {
    return (void*)getutxid(id);
}

void* libc_cygwin_mod_getutxline(void* line) {
    return (void*)getutxline(line);
}

void* libc_cygwin_mod_pututxline(void* utmpx) {
    return (void*)pututxline(utmpx);
}

void libc_cygwin_mod_setutxent(void) {
    setutxent();
}

int32_t libc_cygwin_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

void libc_cygwin_mod_updwtmpx(const char* file, void* utmpx) {
    updwtmpx(file, utmpx);
}

