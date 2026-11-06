#ifndef LIBC_TRUSTY_TRUSTY_WRAPPER_H
#define LIBC_TRUSTY_TRUSTY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_trusty_calloc(uint64_t nobj, uint64_t size);
void* libc_trusty_malloc(uint64_t size);
void* libc_trusty_realloc(void* p, uint64_t size);
void libc_trusty_free(void* p);
void* libc_trusty_memalign(uint64_t align, uint64_t size);
int32_t libc_trusty_posix_memalign(void* memptr, uint64_t align, uint64_t size);
int64_t libc_trusty_write(int32_t fd, void* buf, uint64_t count);
int64_t libc_trusty_writev(int32_t fd, void* iov, int32_t iovcnt);
int32_t libc_trusty_close(int32_t fd);
uint64_t libc_trusty_strlen(const char* cs);
uint64_t libc_trusty_getauxval(uint64_t type_);
void* libc_trusty_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_trusty_munmap(void* addr, uint64_t len);
int32_t libc_trusty_clock_gettime(int32_t clk_id, void* tp);
int32_t libc_trusty_nanosleep(void* rqtp, void* rmtp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TRUSTY_TRUSTY_WRAPPER_H */
