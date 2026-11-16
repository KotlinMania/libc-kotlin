#include "new_qurt_sys_stat_wrapper.h"
#include <errno.h>
#include <sys/stat.h>
#include <sys/types.h>

int32_t libcNewQurtSysStatStat(const char* pathname, void* statbuf) {
    return (int32_t)stat(pathname, statbuf);
}

int32_t libcNewQurtSysStatFstat(int32_t fd, void* statbuf) {
    return (int32_t)fstat(fd, statbuf);
}

