#include "pthread_spis_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread/pthread_spis.h>
#endif

int32_t libc_pthread_spis_pthread_create_from_mach_thread(void* thread, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create_from_mach_thread(thread, attr, f, value);
}

