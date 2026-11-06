#include "mman_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

void* libc_mman_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
#if !defined(_WIN32)
    return (void*)mmap(addr, len, prot, flags, fd, offset);
#else
    (void)addr;
    (void)len;
    (void)prot;
    (void)flags;
    (void)fd;
    (void)offset;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_mman_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_mman_mprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_mman_mlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)mlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_mman_munlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_mman_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_mman_munlockall(void) {
    return (int32_t)munlockall();
}

int32_t libc_mman_msync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

