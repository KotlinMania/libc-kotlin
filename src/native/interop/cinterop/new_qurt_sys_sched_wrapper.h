#ifndef LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H
#define LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_qurt_sys_sched_schedYield(void);
int32_t libc_new_qurt_sys_sched_schedGetPriorityMax(int32_t policy);
int32_t libc_new_qurt_sys_sched_schedGetPriorityMin(int32_t policy);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SYS_SCHED_NEW_QURT_SYS_SCHED_WRAPPER_H */
