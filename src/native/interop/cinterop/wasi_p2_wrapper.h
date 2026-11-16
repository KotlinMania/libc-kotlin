#ifndef LIBC_WASI_P2_WASI_P2_WRAPPER_H
#define LIBC_WASI_P2_WASI_P2_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcWasiP2Socket(int32_t domain, int32_t type, int32_t protocol);
int32_t libcWasiP2Connect(int32_t fd, void* name, uint32_t addrlen);
int32_t libcWasiP2Bind(int32_t arg0Socket, void* addr, uint32_t addrlen);
int32_t libcWasiP2Listen(int32_t arg0Socket, int32_t backlog);
int32_t libcWasiP2Accept(int32_t arg0Socket, void* addr, void* addrlen);
int32_t libcWasiP2Accept4(int32_t arg0Socket, void* addr, void* addrlen, int32_t flags);
int32_t libcWasiP2Getsockname(int32_t arg0Socket, void* addr, void* addrlen);
int32_t libcWasiP2Getpeername(int32_t arg0Socket, void* addr, void* addrlen);
int64_t libcWasiP2Sendto(int32_t arg0Socket, void* buffer, uint64_t length, int32_t flags, void* addr, uint32_t addrlen);
int64_t libcWasiP2Recvfrom(int32_t arg0Socket, void* buffer, uint64_t length, int32_t flags, void* addr, void* addrlen);
int32_t libcWasiP2Getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen);
int32_t libcWasiP2Setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen);
int32_t libcWasiP2Getaddrinfo(const char* host, const char* serv, void* hint, void* res);
void libcWasiP2Freeaddrinfo(void* p);
const char* libcWasiP2GaiStrerror(int32_t ecode);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WASI_P2_WASI_P2_WRAPPER_H */
