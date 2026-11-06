#ifndef LIBC_UCLIBC_MOD_UCLIBC_MOD_WRAPPER_H
#define LIBC_UCLIBC_MOD_UCLIBC_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_uclibc_mod_gettimeofday(void* tp, void* tz);
int32_t libc_uclibc_mod_pthread_rwlockattr_getkind_np(void* attr, void* val);
int32_t libc_uclibc_mod_pthread_rwlockattr_setkind_np(void* attr, int32_t val);
int32_t libc_uclibc_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_uclibc_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int64_t libc_uclibc_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_uclibc_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_uclibc_mod_getrlimit64(int32_t resource, void* rlim);
int32_t libc_uclibc_mod_setrlimit64(int32_t resource, void* rlim);
int32_t libc_uclibc_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_uclibc_mod_setrlimit(int32_t resource, void* rlim);
uint64_t libc_uclibc_mod_getauxval(uint64_t type_);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UCLIBC_MOD_UCLIBC_MOD_WRAPPER_H */
