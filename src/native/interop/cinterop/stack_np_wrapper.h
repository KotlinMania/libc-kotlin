#ifndef LIBC_STACK_NP_STACK_NP_WRAPPER_H
#define LIBC_STACK_NP_STACK_NP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libc_stack_np_pthread_stack_frame_decode_np(uint64_t frame_addr, void* return_addr);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_STACK_NP_STACK_NP_WRAPPER_H */
