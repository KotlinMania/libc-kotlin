#include "trusty_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <string.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <unistd.h>
#include <sys/mman.h>
#endif

void* libc_trusty_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_trusty_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_trusty_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_trusty_free(void* p) {
    free(p);
}

void* libc_trusty_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_trusty_posix_memalign(void* memptr, uint64_t align, uint64_t size) {
    return (int32_t)posix_memalign(memptr, align, size);
}

int64_t libc_trusty_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int64_t libc_trusty_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int32_t libc_trusty_close(int32_t fd) {
    return (int32_t)close(fd);
}

uint64_t libc_trusty_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_trusty_getauxval(uint64_t type_) {
    return (uint64_t)getauxval(type_);
}

void* libc_trusty_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
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

int32_t libc_trusty_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_trusty_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_trusty_nanosleep(void* rqtp, void* rmtp) {
    return (int32_t)nanosleep(rqtp, rmtp);
}

