#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionHookInstall(void* hook);
int32_t libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(void* thread, uint64_t key, void* value);
void* libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(void* thread, uint64_t key);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_NEW_APPLE_LIBPTHREAD_PTHREAD_INTROSPECTION_WRAPPER_H */
