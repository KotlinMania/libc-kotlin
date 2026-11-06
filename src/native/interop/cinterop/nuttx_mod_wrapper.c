#include "nuttx_mod_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#include <sys/ioctl.h>
#include <dirent.h>
#include <pthread.h>
#endif

void* libc_nuttx_mod_errno(void) {
    return (void*)__errno();
}

int32_t libc_nuttx_mod_bind(int32_t sockfd, void* addr, uint32_t addrlen) {
    return (int32_t)bind(sockfd, addr, addrlen);
}

int32_t libc_nuttx_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_nuttx_mod_recvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* src_addr, void* addrlen) {
    return (int32_t)recvfrom(sockfd, buf, len, flags, src_addr, addrlen);
}

int32_t libc_nuttx_mod_pthread_create(void* thread, void* attr, int32_t start_routine, void* arg) {
    return (int32_t)pthread_create(thread, attr, start_routine, arg);
}

int32_t libc_nuttx_mod_clock_gettime(int32_t clockid, void* tp) {
    return (int32_t)clock_gettime(clockid, tp);
}

int32_t libc_nuttx_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_nuttx_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_nuttx_mod_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

int32_t libc_nuttx_mod_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

int64_t libc_nuttx_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

uint32_t libc_nuttx_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

void libc_nuttx_mod_arc4random_buf(void* bytes, uint64_t nbytes) {
    arc4random_buf(bytes, nbytes);
}

