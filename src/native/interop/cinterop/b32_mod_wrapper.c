#include "b32_mod_wrapper.h"
#include <errno.h>

int64_t libc_b32_mod_timegm64(void* tm) {
    return (int64_t)timegm64(tm);
}

