#include "newlib_mod_wrapper.h"
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
#include <sys/ioctl.h>
#include <pthread.h>
#endif

int32_t libc_newlib_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_newlib_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_newlib_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_newlib_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_newlib_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_newlib_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_newlib_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_newlib_mod_rand(void) {
    return (int32_t)rand();
}

void libc_newlib_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_newlib_mod_bind(int32_t fd, void* addr, uint32_t len) {
    return (int32_t)bind(fd, addr, len);
}

int32_t libc_newlib_mod_clock_settime(uint64_t clock_id, void* tp) {
    return (int32_t)clock_settime(clock_id, tp);
}

int32_t libc_newlib_mod_clock_gettime(uint64_t clock_id, void* tp) {
    return (int32_t)clock_gettime(clock_id, tp);
}

int32_t libc_newlib_mod_clock_getres(uint64_t clock_id, void* res) {
    return (int32_t)clock_getres(clock_id, res);
}

int32_t libc_newlib_mod_closesocket(int32_t sockfd) {
    return (int32_t)closesocket(sockfd);
}

int64_t libc_newlib_mod_recvfrom(int32_t fd, void* buf, uint64_t n, int32_t flags, void* addr, void* addr_len) {
    return (int64_t)recvfrom(fd, buf, n, flags, addr, addr_len);
}

int32_t libc_newlib_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

void* libc_newlib_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_newlib_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_newlib_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_newlib_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_newlib_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_newlib_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_newlib_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_newlib_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_newlib_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_newlib_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_newlib_mod_pthread_kill(uint64_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_newlib_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_newlib_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_newlib_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_newlib_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_newlib_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_newlib_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_newlib_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_newlib_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_newlib_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

