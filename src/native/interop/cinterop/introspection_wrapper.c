#include "introspection_wrapper.h"
#include <errno.h>
#if defined(__APPLE__)
#include <pthread/introspection.h>

int32_t libc_introspection_pthread_introspection_hook_install(void* hook) {
    return (int32_t)(long)pthread_introspection_hook_install((pthread_introspection_hook_t)hook);
}

int32_t libc_introspection_pthread_introspection_setspecific_np(void* thread, int32_t key, void* value) {
    return (int32_t)pthread_introspection_setspecific_np((pthread_t)thread, key, value);
}

void* libc_introspection_pthread_introspection_getspecific_np(void* thread, int32_t key) {
    return (void*)pthread_introspection_getspecific_np((pthread_t)thread, key);
}
#else
int32_t libc_introspection_pthread_introspection_hook_install(void* hook) {
    (void)hook;
    errno = ENOSYS;
    return -1;
}

int32_t libc_introspection_pthread_introspection_setspecific_np(void* thread, int32_t key, void* value) {
    (void)thread; (void)key; (void)value;
    errno = ENOSYS;
    return -1;
}

void* libc_introspection_pthread_introspection_getspecific_np(void* thread, int32_t key) {
    (void)thread; (void)key;
    errno = ENOSYS;
    return NULL;
}
#endif
