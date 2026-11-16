#ifndef LIBC_NEW_QURT_SYS_STAT_NEW_QURT_SYS_STAT_WRAPPER_H
#define LIBC_NEW_QURT_SYS_STAT_NEW_QURT_SYS_STAT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewQurtSysStatStat(const char* pathname, void* statbuf);
int32_t libcNewQurtSysStatFstat(int32_t fd, void* statbuf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SYS_STAT_NEW_QURT_SYS_STAT_WRAPPER_H */
