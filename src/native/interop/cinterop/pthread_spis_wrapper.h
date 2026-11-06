#ifndef LIBC_PTHREAD_SPIS_PTHREAD_SPIS_WRAPPER_H
#define LIBC_PTHREAD_SPIS_PTHREAD_SPIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_pthread_spis_pthread_create_from_mach_thread(void* thread, void* attr, int32_t f, void* value);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_PTHREAD_SPIS_PTHREAD_SPIS_WRAPPER_H */
