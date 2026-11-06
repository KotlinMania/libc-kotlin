#include "sched_wrapper.h"
#include <errno.h>
#if defined(__APPLE__)
#include <sched.h>
#elif !defined(_WIN32)
#include <sys/sched.h>
#endif

int32_t libc_sched_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_sched_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_sched_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

