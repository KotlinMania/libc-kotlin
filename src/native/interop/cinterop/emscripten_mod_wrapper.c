#include "emscripten_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/mman.h>
#include <dirent.h>
#include <sys/socket.h>
#include <sys/ioctl.h>
#endif

int32_t libc_emscripten_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_emscripten_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_emscripten_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_emscripten_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_emscripten_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_emscripten_mod_rand(void) {
    return (int32_t)rand();
}

void libc_emscripten_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_emscripten_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

void libc_emscripten_mod_setpwent(void) {
    setpwent();
}

void libc_emscripten_mod_endpwent(void) {
    endpwent();
}

void* libc_emscripten_mod_getpwent(void) {
    return (void*)getpwent();
}

int32_t libc_emscripten_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_emscripten_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

void* libc_emscripten_mod_errno_location(void) {
    return (void*)__errno_location();
}

int32_t libc_emscripten_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int64_t libc_emscripten_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_emscripten_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_emscripten_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags) {
    return (int32_t)dup3(oldfd, newfd, flags);
}

char* libc_emscripten_mod_nl_langinfo_l(int32_t item, int32_t locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_emscripten_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg) {
    return (int32_t)accept4(fd, addr, len, flg);
}

int32_t libc_emscripten_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_emscripten_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

int32_t libc_emscripten_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_emscripten_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_emscripten_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_emscripten_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_emscripten_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_emscripten_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_emscripten_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_emscripten_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_emscripten_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int64_t libc_emscripten_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_emscripten_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

char* libc_emscripten_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_emscripten_mod_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags) {
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
}

int32_t libc_emscripten_mod_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}

void libc_emscripten_mod_sync(void) {
    sync();
}

int32_t libc_emscripten_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_emscripten_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_emscripten_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

void* libc_emscripten_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_emscripten_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_emscripten_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_emscripten_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

