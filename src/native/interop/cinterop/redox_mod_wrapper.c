#include "redox_mod_wrapper.h"
#include <errno.h>
#include <time.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <dirent.h>
#include <pthread.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <sys/socket.h>
#endif
#if defined(__linux__)
#include <sys/epoll.h>
#endif

void* libc_redox_mod_errno_location(void) {
    return (void*)__errno_location();
}

int32_t libc_redox_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_redox_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_redox_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_redox_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_redox_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_redox_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

int32_t libc_redox_mod_setresgid(int32_t rgid, int32_t egid, int32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_redox_mod_setresuid(int32_t ruid, int32_t euid, int32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

void* libc_redox_mod_getgrent(void) {
    return (void*)getgrent();
}

void libc_redox_mod_setgrent(void) {
    setgrent();
}

void libc_redox_mod_endgrent(void) {
    endgrent();
}

void* libc_redox_mod_getgrgid(int32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_redox_mod_getgrgid_r(int32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

void* libc_redox_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_redox_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_redox_mod_getgrouplist(const char* user, int32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

void* libc_redox_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_redox_mod_getnameinfo(void* addr, uint32_t addrlen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(addr, addrlen, host, hostlen, serv, servlen, flags);
}

int32_t libc_redox_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

int32_t libc_redox_mod_pthread_create(void* tid, void* attr, int32_t start, void* arg) {
    return (int32_t)pthread_create(tid, attr, start, arg);
}

int32_t libc_redox_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_redox_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

void* libc_redox_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_redox_mod_setpwent(void) {
    setpwent();
}

void libc_redox_mod_endpwent(void) {
    endpwent();
}

int32_t libc_redox_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_redox_mod_getpwuid_r(int32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_redox_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

int32_t libc_redox_mod_pthread_cancel(void* thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_redox_mod_pthread_kill(void* thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_redox_mod_sigtimedwait(void* set, void* sig, void* timeout) {
    return (int32_t)sigtimedwait(set, sig, timeout);
}

int32_t libc_redox_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_redox_mod_getsubopt(void* optionp, void* tokens, void* valuep) {
    return (int32_t)getsubopt(optionp, tokens, valuep);
}

int32_t libc_redox_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_redox_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

void* libc_redox_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

int32_t libc_redox_mod_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags) {
    return (int32_t)renameat2(olddirfd, oldpath, newdirfd, newpath, flags);
}

void libc_redox_mod_explicit_bzero(void* p, uint64_t len) {
    explicit_bzero(p, len);
}

uint64_t libc_redox_mod_strlcat(char* dst, const char* src, uint64_t siz) {
    return (uint64_t)strlcat(dst, src, siz);
}

uint64_t libc_redox_mod_strlcpy(char* dst, const char* src, uint64_t siz) {
    return (uint64_t)strlcpy(dst, src, siz);
}

int32_t libc_redox_mod_epoll_create(int32_t size) {
#if defined(__linux__)
    return (int32_t)epoll_create(size);
#else
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_redox_mod_epoll_create1(int32_t flags) {
#if defined(__linux__)
    return (int32_t)epoll_create1(flags);
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_redox_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout) {
#if defined(__linux__)
    return (int32_t)epoll_wait(epfd, events, maxevents, timeout);
#else
    (void)epfd;
    (void)events;
    (void)maxevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_redox_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event) {
#if defined(__linux__)
    return (int32_t)epoll_ctl(epfd, op, fd, event);
#else
    (void)epfd;
    (void)op;
    (void)fd;
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_redox_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_redox_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int32_t libc_redox_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_redox_mod_shm_open(const char* name, int32_t oflag, int32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_redox_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

int32_t libc_redox_mod_getpriority(int32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_redox_mod_setpriority(int32_t which, uint32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_redox_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_redox_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

void* libc_redox_mod_cmsg_data(void* cmsg) {
    return (void*)CMSG_DATA(cmsg);
}

void* libc_redox_mod_cmsg_firsthdr(void* mhdr) {
    return (void*)CMSG_FIRSTHDR(mhdr);
}

void* libc_redox_mod_cmsg_nxthdr(void* mhdr, void* cmsg) {
    return (void*)CMSG_NXTHDR(mhdr, cmsg);
}

int32_t libc_redox_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_redox_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int64_t libc_redox_mod_recvmsg(int32_t socket, void* msg, int32_t flags) {
    return (int64_t)recvmsg(socket, msg, flags);
}

int64_t libc_redox_mod_sendmsg(int32_t socket, void* msg, int32_t flags) {
    return (int64_t)sendmsg(socket, msg, flags);
}

int32_t libc_redox_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int64_t libc_redox_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int64_t libc_redox_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_redox_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_redox_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int32_t libc_redox_mod_uname(void* utsname) {
    return (int32_t)uname(utsname);
}

int32_t libc_redox_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_redox_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

uint64_t libc_redox_mod_strftime(char* s, uint64_t max, const char* format, void* tm) {
    return (uint64_t)strftime(s, max, format, tm);
}

int32_t libc_redox_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

