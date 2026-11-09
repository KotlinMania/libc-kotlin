#ifndef LIBC_NEW_MUSL_SYS_SOCKET_NEW_MUSL_SYS_SOCKET_WRAPPER_H
#define LIBC_NEW_MUSL_SYS_SOCKET_NEW_MUSL_SYS_SOCKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_musl_sys_socket_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags);
int32_t libc_new_musl_sys_socket_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_MUSL_SYS_SOCKET_NEW_MUSL_SYS_SOCKET_WRAPPER_H */
