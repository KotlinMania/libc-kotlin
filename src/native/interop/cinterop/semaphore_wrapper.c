#include "semaphore_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <semaphore.h>
#endif

int32_t libc_semaphore_sem_init(void* sem, int32_t pshared, uint32_t value) {
#if !defined(_WIN32)
    return (int32_t)sem_init(sem, pshared, value);
#else
    (void)sem;
    (void)pshared;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_semaphore_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_semaphore_sem_wait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_wait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_semaphore_sem_trywait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_trywait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_semaphore_sem_post(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_post(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_semaphore_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

