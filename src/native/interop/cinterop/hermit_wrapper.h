#ifndef LIBC_HERMIT_HERMIT_WRAPPER_H
#define LIBC_HERMIT_HERMIT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_hermit_alloc(uint64_t size, uint64_t align);
void* libc_hermit_alloc_zeroed(uint64_t size, uint64_t align);
void* libc_hermit_realloc(void* ptr, uint64_t size, uint64_t align, uint64_t new_size);
void libc_hermit_dealloc(void* ptr, uint64_t size, uint64_t align);
void libc_hermit_exit(int32_t status);
void libc_hermit_abort(void);
int32_t libc_hermit_errno(void);
int32_t libc_hermit_clock_gettime(int32_t clockid, void* tp);
int32_t libc_hermit_nanosleep(void* req);
uint64_t libc_hermit_available_parallelism(void);
int32_t libc_hermit_futex_wait(void* address, uint32_t expected, void* timeout, uint32_t flags);
int32_t libc_hermit_futex_wake(void* address, int32_t count);
int32_t libc_hermit_stat(const char* path, void* stat);
int32_t libc_hermit_fstat(int32_t fd, void* stat);
int32_t libc_hermit_lstat(const char* path, void* stat);
int32_t libc_hermit_open(const char* path, int32_t flags, uint32_t mode);
int32_t libc_hermit_unlink(const char* path);
int32_t libc_hermit_mkdir(const char* path, uint32_t mode);
int32_t libc_hermit_rmdir(const char* path);
int64_t libc_hermit_read(int32_t fd, void* buf, uint64_t len);
int64_t libc_hermit_write(int32_t fd, void* buf, uint64_t len);
int64_t libc_hermit_readv(int32_t fd, void* iov, uint64_t iovcnt);
int64_t libc_hermit_writev(int32_t fd, void* iov, uint64_t iovcnt);
int32_t libc_hermit_close(int32_t fd);
int32_t libc_hermit_dup(int32_t fd);
int32_t libc_hermit_fcntl(int32_t fd, int32_t cmd, int32_t arg);
int64_t libc_hermit_getdents64(int32_t fd, void* dirp, uint64_t count);
int32_t libc_hermit_getaddrinfo(const char* nodename, const char* servname, void* hints, void* res);
void libc_hermit_freeaddrinfo(void* ai);
int32_t libc_hermit_socket(int32_t domain, int32_t ty, int32_t protocol);
int32_t libc_hermit_bind(int32_t sockfd, void* addr, uint32_t addrlen);
int32_t libc_hermit_listen(int32_t sockfd, int32_t backlog);
int32_t libc_hermit_accept(int32_t sockfd, void* addr, void* addrlen);
int32_t libc_hermit_connect(int32_t sockfd, void* addr, uint32_t addrlen);
int64_t libc_hermit_recv(int32_t sockfd, void* buf, uint64_t len, int32_t flags);
int64_t libc_hermit_recvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int64_t libc_hermit_send(int32_t sockfd, void* buf, uint64_t len, int32_t flags);
int64_t libc_hermit_sendto(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* to, uint32_t tolen);
int32_t libc_hermit_getpeername(int32_t sockfd, void* addr, void* addrlen);
int32_t libc_hermit_getsockname(int32_t sockfd, void* addr, void* addrlen);
int32_t libc_hermit_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen);
int32_t libc_hermit_setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen);
int32_t libc_hermit_ioctl(int32_t sockfd, int32_t cmd, void* argp);
int32_t libc_hermit_shutdown(int32_t sockfd, int32_t how);
int32_t libc_hermit_eventfd(uint64_t initval, int16_t flags);
int32_t libc_hermit_poll(void* fds, uint64_t nfds, int32_t timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_HERMIT_HERMIT_WRAPPER_H */
