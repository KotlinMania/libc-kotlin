#ifndef LIBC_PTHREAD_PTHREAD_WRAPPER_H
#define LIBC_PTHREAD_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset);
int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr);
int32_t libc_pthread_pthread_getname_np(int32_t thread, char* name, uint64_t len);
int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset);
int32_t libc_pthread_pthread_setname_np(int32_t thread, const char* name);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_PTHREAD_PTHREAD_WRAPPER_H */
