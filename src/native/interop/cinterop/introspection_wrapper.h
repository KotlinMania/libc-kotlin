#ifndef LIBC_INTROSPECTION_INTROSPECTION_WRAPPER_H
#define LIBC_INTROSPECTION_INTROSPECTION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_introspection_pthread_introspection_hook_install(void* hook);
int32_t libc_introspection_pthread_introspection_setspecific_np(void* thread, int32_t key, void* value);
void* libc_introspection_pthread_introspection_getspecific_np(void* thread, int32_t key);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_INTROSPECTION_INTROSPECTION_WRAPPER_H */
