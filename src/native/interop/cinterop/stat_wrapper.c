#include "stat_wrapper.h"
#include <errno.h>
#include <sys/stat.h>
#include <sys/types.h>

int32_t libc_stat_stat(const char* pathname, void* statbuf) {
    return (int32_t)stat(pathname, statbuf);
}

int32_t libc_stat_fstat(int32_t fd, void* statbuf) {
    return (int32_t)fstat(fd, statbuf);
}

