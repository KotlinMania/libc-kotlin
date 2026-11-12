#ifndef LIBC_NEW_BIONICLIBC_SYS_SOCKET_NEW_BIONICLIBC_SYS_SOCKET_WRAPPER_H
#define LIBC_NEW_BIONICLIBC_SYS_SOCKET_NEW_BIONICLIBC_SYS_SOCKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewBioniclibcSysSocketRecvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout);
int32_t libcNewBioniclibcSysSocketSendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags);
int32_t libcNewBioniclibcSysSocketRecvfrom(int32_t arg0Socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_BIONICLIBC_SYS_SOCKET_NEW_BIONICLIBC_SYS_SOCKET_WRAPPER_H */
