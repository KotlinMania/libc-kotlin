#ifndef LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H
#define LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_qurt_semaphore_semInit(void* sem, int32_t pshared, uint32_t value);
int32_t libc_new_qurt_semaphore_semDestroy(void* sem);
int32_t libc_new_qurt_semaphore_semWait(void* sem);
int32_t libc_new_qurt_semaphore_semTrywait(void* sem);
int32_t libc_new_qurt_semaphore_semPost(void* sem);
int32_t libc_new_qurt_semaphore_semGetvalue(void* sem, void* sval);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SEMAPHORE_NEW_QURT_SEMAPHORE_WRAPPER_H */
