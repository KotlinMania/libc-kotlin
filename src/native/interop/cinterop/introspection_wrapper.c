#include "introspection_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread/introspection.h>
#endif

int32_t libc_introspection_pthread_introspection_hook_install(int32_t hook) {
    return (int32_t)pthread_introspection_hook_install(hook);
}

int32_t libc_introspection_pthread_introspection_setspecific_np(int32_t thread, int32_t key, void* value) {
    return (int32_t)pthread_introspection_setspecific_np(thread, key, value);
}

void* libc_introspection_pthread_introspection_getspecific_np(int32_t thread, int32_t key) {
    return (void*)pthread_introspection_getspecific_np(thread, key);
}

