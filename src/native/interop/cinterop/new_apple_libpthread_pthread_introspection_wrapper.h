#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionHookInstall(void* hook);
int32_t libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp(void* thread, uint64_t key, void* value);
void* libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp(void* thread, uint64_t key);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H */
