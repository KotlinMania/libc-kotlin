#ifndef LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H
#define LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(void* thread, uint64_t cpusetsize, void* cpuset);
int32_t libc_new_common_linuxlike_pthread_pthreadGetattrNp(void* native, void* attr);
int32_t libc_new_common_linuxlike_pthread_pthreadGetnameNp(void* thread, char* name, uint64_t len);
int32_t libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(void* thread, uint64_t cpusetsize, void* cpuset);
int32_t libc_new_common_linuxlike_pthread_pthreadSetnameNp(void* thread, const char* name);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H */
