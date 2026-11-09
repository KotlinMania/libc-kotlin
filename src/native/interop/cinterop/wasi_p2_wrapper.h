#ifndef LIBC_WASI_P2_WASI_P2_WRAPPER_H
#define LIBC_WASI_P2_WASI_P2_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_wasi_p2_socket(int32_t domain, int32_t type_, int32_t protocol);
int32_t libc_wasi_p2_connect(int32_t fd, void* name, uint32_t addrlen);
int32_t libc_wasi_p2_bind(int32_t arg_0_socket, void* addr, uint32_t addrlen);
int32_t libc_wasi_p2_listen(int32_t arg_0_socket, int32_t backlog);
int32_t libc_wasi_p2_accept(int32_t arg_0_socket, void* addr, void* addrlen);
int32_t libc_wasi_p2_accept4(int32_t arg_0_socket, void* addr, void* addrlen, int32_t flags);
int32_t libc_wasi_p2_getsockname(int32_t arg_0_socket, void* addr, void* addrlen);
int32_t libc_wasi_p2_getpeername(int32_t arg_0_socket, void* addr, void* addrlen);
int64_t libc_wasi_p2_sendto(int32_t arg_0_socket, void* buffer, uint64_t length, int32_t flags, void* addr, uint32_t addrlen);
int64_t libc_wasi_p2_recvfrom(int32_t arg_0_socket, void* buffer, uint64_t length, int32_t flags, void* addr, void* addrlen);
int32_t libc_wasi_p2_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen);
int32_t libc_wasi_p2_setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen);
int32_t libc_wasi_p2_getaddrinfo(const char* host, const char* serv, void* hint, void* res);
void libc_wasi_p2_freeaddrinfo(void* p);
const char* libc_wasi_p2_gaiStrerror(int32_t ecode);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WASI_P2_WASI_P2_WRAPPER_H */
