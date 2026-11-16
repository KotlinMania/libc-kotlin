#ifndef LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H
#define LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewQurtSemaphoreSemInit(void* sem, int32_t pshared, uint32_t value);
int32_t libcNewQurtSemaphoreSemDestroy(void* sem);
int32_t libcNewQurtSemaphoreSemWait(void* sem);
int32_t libcNewQurtSemaphoreSemTrywait(void* sem);
int32_t libcNewQurtSemaphoreSemPost(void* sem);
int32_t libcNewQurtSemaphoreSemGetvalue(void* sem, void* sval);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H */
