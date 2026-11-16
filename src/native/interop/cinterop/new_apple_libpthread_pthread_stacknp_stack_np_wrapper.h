#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libcNewAppleLibpthreadPthreadStacknpStackNpPthreadStackFrameDecodeNp(uint64_t frameAddr, void* returnAddr);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H */
