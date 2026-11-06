#include "bsd_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/ioctl.h>
#include <dirent.h>
#include <sys/mman.h>
#include <sys/socket.h>
#include <pthread.h>
#endif
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
#endif

int32_t libc_bsd_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_bsd_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_bsd_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_bsd_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_bsd_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_bsd_mod_rand(void) {
    return (int32_t)rand();
}

void libc_bsd_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_bsd_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_bsd_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_bsd_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_bsd_mod_setlogin(const char* name) {
    return (int32_t)setlogin(name);
}

int32_t libc_bsd_mod_kqueue(void) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kqueue();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_bsd_mod_unmount(const char* target, int32_t arg) {
    return (int32_t)unmount(target, arg);
}

void* libc_bsd_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_bsd_mod_setpwent(void) {
    setpwent();
}

void libc_bsd_mod_endpwent(void) {
    endpwent();
}

void libc_bsd_mod_endgrent(void) {
    endgrent();
}

void* libc_bsd_mod_getgrent(void) {
    return (void*)getgrent();
}

const char* libc_bsd_mod_getprogname(void) {
    return (const char*)getprogname();
}

void libc_bsd_mod_setprogname(const char* name) {
    setprogname(name);
}

int32_t libc_bsd_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

void* libc_bsd_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_bsd_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_bsd_mod_getpeereid(int32_t socket, void* euid, void* egid) {
    return (int32_t)getpeereid(socket, euid, egid);
}

int32_t libc_bsd_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_bsd_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_bsd_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_bsd_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_bsd_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_bsd_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_bsd_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_bsd_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int64_t libc_bsd_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_bsd_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_bsd_mod_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

char* libc_bsd_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_bsd_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_bsd_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_bsd_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_bsd_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_bsd_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

void libc_bsd_mod_sync(void) {
    sync();
}

int32_t libc_bsd_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_bsd_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_bsd_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_bsd_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_bsd_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_bsd_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_bsd_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_bsd_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_bsd_mod_pthread_cancel(uint64_t thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_bsd_mod_pthread_kill(uint64_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_bsd_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_bsd_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_bsd_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_bsd_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_bsd_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_bsd_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_bsd_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_bsd_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_bsd_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_bsd_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_bsd_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_bsd_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_bsd_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_bsd_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_bsd_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

int32_t libc_bsd_mod_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

int32_t libc_bsd_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_bsd_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_bsd_mod_regfree(void* preg) {
    regfree(preg);
}

uint32_t libc_bsd_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

void libc_bsd_mod_arc4random_buf(void* buf, uint64_t size) {
    arc4random_buf(buf, size);
}

uint32_t libc_bsd_mod_arc4random_uniform(uint32_t l) {
    return (uint32_t)arc4random_uniform(l);
}

double libc_bsd_mod_drand48(void) {
    return (double)drand48();
}

double libc_bsd_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_bsd_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_bsd_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int64_t libc_bsd_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_bsd_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_bsd_mod_srand48(int64_t seed) {
    srand48(seed);
}

void* libc_bsd_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_bsd_mod_lcong48(void* p) {
    lcong48(p);
}

int32_t libc_bsd_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

uint64_t libc_bsd_mod_strftime(char* buf, uint64_t maxsize, const char* format, void* timeptr) {
    return (uint64_t)strftime(buf, maxsize, format, timeptr);
}

uint64_t libc_bsd_mod_strftime_l(char* buf, uint64_t maxsize, const char* format, void* timeptr, int32_t locale) {
    return (uint64_t)strftime_l(buf, maxsize, format, timeptr, locale);
}

char* libc_bsd_mod_devname(int32_t dev, uint32_t mode_t) {
    return (char*)devname(dev, mode_t);
}

int32_t libc_bsd_mod_issetugid(void) {
    return (int32_t)issetugid();
}

