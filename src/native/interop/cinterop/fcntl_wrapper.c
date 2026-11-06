#include "fcntl_wrapper.h"
#include <errno.h>
#include <fcntl.h>

int32_t libc_fcntl_creat(const char* pathname, uint32_t mode) {
    return (int32_t)creat(pathname, mode);
}

