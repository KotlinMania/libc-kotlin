#include "hermit_wrapper.h"
#include <errno.h>

void* libc_hermit_alloc(uint64_t size, uint64_t align) {
    return (void*)sys_alloc(size, align);
}

void* libc_hermit_alloc_zeroed(uint64_t size, uint64_t align) {
    return (void*)sys_alloc_zeroed(size, align);
}

void* libc_hermit_realloc(void* ptr, uint64_t size, uint64_t align, uint64_t new_size) {
    return (void*)sys_realloc(ptr, size, align, new_size);
}

void libc_hermit_dealloc(void* ptr, uint64_t size, uint64_t align) {
    sys_dealloc(ptr, size, align);
}

void libc_hermit_exit(int32_t status) {
    sys_exit(status);
}

void libc_hermit_abort(void) {
    sys_abort();
}

int32_t libc_hermit_errno(void) {
    return (int32_t)sys_errno();
}

int32_t libc_hermit_clock_gettime(int32_t clockid, void* tp) {
    return (int32_t)sys_clock_gettime(clockid, tp);
}

int32_t libc_hermit_nanosleep(void* req) {
    return (int32_t)sys_nanosleep(req);
}

uint64_t libc_hermit_available_parallelism(void) {
    return (uint64_t)sys_available_parallelism();
}

int32_t libc_hermit_futex_wait(void* address, uint32_t expected, void* timeout, uint32_t flags) {
    return (int32_t)sys_futex_wait(address, expected, timeout, flags);
}

int32_t libc_hermit_futex_wake(void* address, int32_t count) {
    return (int32_t)sys_futex_wake(address, count);
}

int32_t libc_hermit_stat(const char* path, void* stat) {
    return (int32_t)sys_stat(path, stat);
}

int32_t libc_hermit_fstat(int32_t fd, void* stat) {
    return (int32_t)sys_fstat(fd, stat);
}

int32_t libc_hermit_lstat(const char* path, void* stat) {
    return (int32_t)sys_lstat(path, stat);
}

int32_t libc_hermit_open(const char* path, int32_t flags, uint32_t mode) {
    return (int32_t)sys_open(path, flags, mode);
}

int32_t libc_hermit_unlink(const char* path) {
    return (int32_t)sys_unlink(path);
}

int32_t libc_hermit_mkdir(const char* path, uint32_t mode) {
    return (int32_t)sys_mkdir(path, mode);
}

int32_t libc_hermit_rmdir(const char* path) {
    return (int32_t)sys_rmdir(path);
}

int64_t libc_hermit_read(int32_t fd, void* buf, uint64_t len) {
    return (int64_t)sys_read(fd, buf, len);
}

int64_t libc_hermit_write(int32_t fd, void* buf, uint64_t len) {
    return (int64_t)sys_write(fd, buf, len);
}

int64_t libc_hermit_readv(int32_t fd, void* iov, uint64_t iovcnt) {
    return (int64_t)sys_readv(fd, iov, iovcnt);
}

int64_t libc_hermit_writev(int32_t fd, void* iov, uint64_t iovcnt) {
    return (int64_t)sys_writev(fd, iov, iovcnt);
}

int32_t libc_hermit_close(int32_t fd) {
    return (int32_t)sys_close(fd);
}

int32_t libc_hermit_dup(int32_t fd) {
    return (int32_t)sys_dup(fd);
}

int32_t libc_hermit_fcntl(int32_t fd, int32_t cmd, int32_t arg) {
    return (int32_t)sys_fcntl(fd, cmd, arg);
}

int64_t libc_hermit_getdents64(int32_t fd, void* dirp, uint64_t count) {
    return (int64_t)sys_getdents64(fd, dirp, count);
}

int32_t libc_hermit_getaddrinfo(const char* nodename, const char* servname, void* hints, void* res) {
    return (int32_t)sys_getaddrinfo(nodename, servname, hints, res);
}

void libc_hermit_freeaddrinfo(void* ai) {
    sys_freeaddrinfo(ai);
}

int32_t libc_hermit_socket(int32_t domain, int32_t ty, int32_t protocol) {
    return (int32_t)sys_socket(domain, ty, protocol);
}

int32_t libc_hermit_bind(int32_t sockfd, void* addr, uint32_t addrlen) {
    return (int32_t)sys_bind(sockfd, addr, addrlen);
}

int32_t libc_hermit_listen(int32_t sockfd, int32_t backlog) {
    return (int32_t)sys_listen(sockfd, backlog);
}

int32_t libc_hermit_accept(int32_t sockfd, void* addr, void* addrlen) {
    return (int32_t)sys_accept(sockfd, addr, addrlen);
}

int32_t libc_hermit_connect(int32_t sockfd, void* addr, uint32_t addrlen) {
    return (int32_t)sys_connect(sockfd, addr, addrlen);
}

int64_t libc_hermit_recv(int32_t sockfd, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)sys_recv(sockfd, buf, len, flags);
}

int64_t libc_hermit_recvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)sys_recvfrom(sockfd, buf, len, flags, addr, addrlen);
}

int64_t libc_hermit_send(int32_t sockfd, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)sys_send(sockfd, buf, len, flags);
}

int64_t libc_hermit_sendto(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* to, uint32_t tolen) {
    return (int64_t)sys_sendto(sockfd, buf, len, flags, to, tolen);
}

int32_t libc_hermit_getpeername(int32_t sockfd, void* addr, void* addrlen) {
    return (int32_t)sys_getpeername(sockfd, addr, addrlen);
}

int32_t libc_hermit_getsockname(int32_t sockfd, void* addr, void* addrlen) {
    return (int32_t)sys_getsockname(sockfd, addr, addrlen);
}

int32_t libc_hermit_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)sys_getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_hermit_setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen) {
    return (int32_t)sys_setsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_hermit_ioctl(int32_t sockfd, int32_t cmd, void* argp) {
    return (int32_t)sys_ioctl(sockfd, cmd, argp);
}

int32_t libc_hermit_shutdown(int32_t sockfd, int32_t how) {
    return (int32_t)sys_shutdown(sockfd, how);
}

int32_t libc_hermit_eventfd(uint64_t initval, int16_t flags) {
    return (int32_t)sys_eventfd(initval, flags);
}

int32_t libc_hermit_poll(void* fds, uint64_t nfds, int32_t timeout) {
    return (int32_t)sys_poll(fds, nfds, timeout);
}

