#ifndef LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_WRAPPER_H
#define LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewAppleLibpthreadPthreadPthreadspisPthreadSpisPthreadCreateFromMachThread(void* thread, void* attr, void* f, void* value);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_NEW_APPLE_LIBPTHREAD_PTHREAD_PTHREADSPIS_PTHREAD_SPIS_WRAPPER_H */
