#include "p2_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#endif

int32_t libc_p2_socket(int32_t domain, int32_t type_, int32_t protocol) {
    return (int32_t)socket(domain, type_, protocol);
}

int32_t libc_p2_connect(int32_t fd, void* name, uint32_t addrlen) {
    return (int32_t)connect(fd, name, addrlen);
}

int32_t libc_p2_bind(int32_t socket, void* addr, uint32_t addrlen) {
    return (int32_t)bind(socket, addr, addrlen);
}

int32_t libc_p2_listen(int32_t socket, int32_t backlog) {
    return (int32_t)listen(socket, backlog);
}

int32_t libc_p2_accept(int32_t socket, void* addr, void* addrlen) {
    return (int32_t)accept(socket, addr, addrlen);
}

int32_t libc_p2_accept4(int32_t socket, void* addr, void* addrlen, int32_t flags) {
    return (int32_t)accept4(socket, addr, addrlen, flags);
}

int32_t libc_p2_getsockname(int32_t socket, void* addr, void* addrlen) {
    return (int32_t)getsockname(socket, addr, addrlen);
}

int32_t libc_p2_getpeername(int32_t socket, void* addr, void* addrlen) {
    return (int32_t)getpeername(socket, addr, addrlen);
}

int64_t libc_p2_sendto(int32_t socket, void* buffer, uint64_t length, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(socket, buffer, length, flags, addr, addrlen);
}

int64_t libc_p2_recvfrom(int32_t socket, void* buffer, uint64_t length, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buffer, length, flags, addr, addrlen);
}

int32_t libc_p2_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_p2_setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen) {
    return (int32_t)setsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_p2_getaddrinfo(const char* host, const char* serv, void* hint, void* res) {
    return (int32_t)getaddrinfo(host, serv, hint, res);
}

void libc_p2_freeaddrinfo(void* p) {
    freeaddrinfo(p);
}

const char* libc_p2_gai_strerror(int32_t ecode) {
    return (const char*)gai_strerror(ecode);
}

