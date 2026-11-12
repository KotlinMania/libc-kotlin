#ifndef LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H
#define LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewQurtSysSchedSchedYield(void);
int32_t libcNewQurtSysSchedSchedGetPriorityMax(int32_t policy);
int32_t libcNewQurtSysSchedSchedGetPriorityMin(int32_t policy);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H */
