#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(void* attr, void* arg1Class, void* priority);
int32_t libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(void* thread, void* arg1Class, void* priority);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_NEW_APPLE_LIBPTHREAD_PTHREAD_QOS_WRAPPER_H */
