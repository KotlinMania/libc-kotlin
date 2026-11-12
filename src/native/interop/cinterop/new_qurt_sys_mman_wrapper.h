#ifndef LIBC_NEW_QURT_SYS_MMAN_NEW_QURT_SYS_MMAN_WRAPPER_H
#define LIBC_NEW_QURT_SYS_MMAN_NEW_QURT_SYS_MMAN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewQurtSysMmanMmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libcNewQurtSysMmanMunmap(void* addr, uint64_t len);
int32_t libcNewQurtSysMmanMprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcNewQurtSysMmanMlock(void* addr, uint64_t len);
int32_t libcNewQurtSysMmanMunlock(void* addr, uint64_t len);
int32_t libcNewQurtSysMmanMlockall(int32_t flags);
int32_t libcNewQurtSysMmanMunlockall(void);
int32_t libcNewQurtSysMmanMsync(void* addr, uint64_t len, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SYS_MMAN_NEW_QURT_SYS_MMAN_WRAPPER_H */
