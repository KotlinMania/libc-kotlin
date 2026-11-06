#ifndef LIBC_SCHED_SCHED_WRAPPER_H
#define LIBC_SCHED_SCHED_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_sched_sched_yield(void);
int32_t libc_sched_sched_get_priority_max(int32_t policy);
int32_t libc_sched_sched_get_priority_min(int32_t policy);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_SCHED_SCHED_WRAPPER_H */
