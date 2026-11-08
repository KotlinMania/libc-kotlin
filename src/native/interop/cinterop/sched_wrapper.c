#include "sched_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sched.h>
#endif

int32_t libc_sched_sched_yield(void) {
#if !defined(_WIN32)
    return (int32_t)sched_yield();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_sched_sched_get_priority_max(int32_t policy) {
#if !defined(_WIN32)
    return (int32_t)sched_get_priority_max(policy);
#else
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_sched_sched_get_priority_min(int32_t policy) {
#if !defined(_WIN32)
    return (int32_t)sched_get_priority_min(policy);
#else
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}
