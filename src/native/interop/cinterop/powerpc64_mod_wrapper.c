#include "powerpc64_mod_wrapper.h"
#include <errno.h>

int32_t libc_powerpc64_mod_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_powerpc64_mod_getcontext(void* ucp) {
    return (int32_t)getcontext(ucp);
}

int32_t libc_powerpc64_mod_setcontext(void* ucp) {
    return (int32_t)setcontext(ucp);
}

int32_t libc_powerpc64_mod_swapcontext(void* oucp, void* ucp) {
    return (int32_t)swapcontext(oucp, ucp);
}

