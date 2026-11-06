#ifndef LIBC_SEMAPHORE_SEMAPHORE_WRAPPER_H
#define LIBC_SEMAPHORE_SEMAPHORE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_semaphore_sem_init(void* sem, int32_t pshared, uint32_t value);
int32_t libc_semaphore_sem_destroy(void* sem);
int32_t libc_semaphore_sem_wait(void* sem);
int32_t libc_semaphore_sem_trywait(void* sem);
int32_t libc_semaphore_sem_post(void* sem);
int32_t libc_semaphore_sem_getvalue(void* sem, void* sval);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_SEMAPHORE_SEMAPHORE_WRAPPER_H */
