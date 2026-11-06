#include "powerpc64_wrapper.h"
#include <errno.h>

uint64_t libc_powerpc64_getsystemcfg(int32_t label) {
    return (uint64_t)getsystemcfg(label);
}

