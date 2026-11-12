#ifndef LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H
#define LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewCommonLinuxlikePthreadPthreadGetaffinityNp(void* thread, uint64_t cpusetsize, void* cpuset);
int32_t libcNewCommonLinuxlikePthreadPthreadGetattrNp(void* native, void* attr);
int32_t libcNewCommonLinuxlikePthreadPthreadGetnameNp(void* thread, char* name, uint64_t len);
int32_t libcNewCommonLinuxlikePthreadPthreadSetaffinityNp(void* thread, uint64_t cpusetsize, void* cpuset);
int32_t libcNewCommonLinuxlikePthreadPthreadSetnameNp(void* thread, const char* name);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_COMMON_LINUXLIKE_PTHREAD_NEW_COMMON_LINUXLIKE_PTHREAD_WRAPPER_H */
