#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp(void* attr, void* arg_1_class, void* priority);
int32_t libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(void* thread, void* arg_1_class, void* priority);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H */
