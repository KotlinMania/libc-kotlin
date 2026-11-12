#ifndef LIBC_TRUSTY_TRUSTY_WRAPPER_H
#define LIBC_TRUSTY_TRUSTY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcTrustyCalloc(uint64_t nobj, uint64_t size);
void* libcTrustyMalloc(uint64_t size);
void* libcTrustyRealloc(void* p, uint64_t size);
void libcTrustyFree(void* p);
void* libcTrustyMemalign(uint64_t align, uint64_t size);
int32_t libcTrustyPosixMemalign(void* memptr, uint64_t align, uint64_t size);
int64_t libcTrustyWrite(int32_t fd, void* buf, uint64_t count);
int64_t libcTrustyWritev(int32_t fd, void* iov, int32_t iovcnt);
int32_t libcTrustyClose(int32_t fd);
uint64_t libcTrustyStrlen(const char* cs);
uint64_t libcTrustyGetauxval(uint64_t type);
void* libcTrustyMmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libcTrustyMunmap(void* addr, uint64_t len);
int32_t libcTrustyClockGettime(int32_t clkId, void* tp);
int32_t libcTrustyNanosleep(void* rqtp, void* rmtp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TRUSTY_TRUSTY_WRAPPER_H */
