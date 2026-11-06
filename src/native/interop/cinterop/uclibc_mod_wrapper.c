#include "uclibc_mod_wrapper.h"
#include <errno.h>

int32_t libc_uclibc_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_uclibc_mod_pthread_rwlockattr_getkind_np(void* attr, void* val) {
    return (int32_t)pthread_rwlockattr_getkind_np(attr, val);
}

int32_t libc_uclibc_mod_pthread_rwlockattr_setkind_np(void* attr, int32_t val) {
    return (int32_t)pthread_rwlockattr_setkind_np(attr, val);
}

int32_t libc_uclibc_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_uclibc_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int64_t libc_uclibc_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_uclibc_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_uclibc_mod_getrlimit64(int32_t resource, void* rlim) {
    return (int32_t)getrlimit64(resource, rlim);
}

int32_t libc_uclibc_mod_setrlimit64(int32_t resource, void* rlim) {
    return (int32_t)setrlimit64(resource, rlim);
}

int32_t libc_uclibc_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_uclibc_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

uint64_t libc_uclibc_mod_getauxval(uint64_t type_) {
    return (uint64_t)getauxval(type_);
}

