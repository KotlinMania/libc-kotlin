#include "socket_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#endif

int32_t libc_socket_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout) {
#if defined(__linux__)
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
#else
    (void)sockfd; (void)msgvec; (void)vlen; (void)flags; (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_socket_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags) {
#if defined(__linux__)
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
#else
    (void)sockfd; (void)msgvec; (void)vlen; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_socket_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

