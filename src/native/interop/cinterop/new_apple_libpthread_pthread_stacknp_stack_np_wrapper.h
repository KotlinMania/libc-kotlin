#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libc_new_apple_libpthread_pthread_stacknp_stack_np_pthreadStackFrameDecodeNp(uint64_t frame_addr, void* return_addr);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_NEW_APPLE_LIBPTHREAD_PTHREAD_STACKNP_STACK_NP_WRAPPER_H */
