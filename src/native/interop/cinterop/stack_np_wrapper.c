#include "stack_np_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread/stack_np.h>
#endif

uint64_t libc_stack_np_pthread_stack_frame_decode_np(uint64_t frame_addr, void* return_addr) {
    return (uint64_t)pthread_stack_frame_decode_np(frame_addr, return_addr);
}

