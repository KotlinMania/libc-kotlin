#include "not_x32_wrapper.h"
#include <errno.h>

int32_t libc_not_x32_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

