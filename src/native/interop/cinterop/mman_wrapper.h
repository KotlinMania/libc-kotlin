#ifndef LIBC_MMAN_MMAN_WRAPPER_H
#define LIBC_MMAN_MMAN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_mman_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_mman_munmap(void* addr, uint64_t len);
int32_t libc_mman_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_mman_mlock(void* addr, uint64_t len);
int32_t libc_mman_munlock(void* addr, uint64_t len);
int32_t libc_mman_mlockall(int32_t flags);
int32_t libc_mman_munlockall(void);
int32_t libc_mman_msync(void* addr, uint64_t len, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_MMAN_MMAN_WRAPPER_H */
