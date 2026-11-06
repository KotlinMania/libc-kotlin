#include "x86_64_mod_wrapper.h"
#include <errno.h>

int32_t libc_x86_64_mod_getcontext(void* ucp) {
    return (int32_t)getcontext(ucp);
}

int32_t libc_x86_64_mod_setcontext(void* ucp) {
    return (int32_t)setcontext(ucp);
}

int32_t libc_x86_64_mod_swapcontext(void* uocp, void* ucp) {
    return (int32_t)swapcontext(uocp, ucp);
}

