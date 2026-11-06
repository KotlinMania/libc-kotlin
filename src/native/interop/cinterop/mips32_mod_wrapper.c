#include "mips32_mod_wrapper.h"
#include <errno.h>

int32_t libc_mips32_mod_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_mips32_mod_glob64(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob64(pattern, flags, errfunc, pglob);
}

void libc_mips32_mod_globfree64(void* pglob) {
    globfree64(pglob);
}

int32_t libc_mips32_mod_pthread_attr_getaffinity_np(void* attr, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_attr_getaffinity_np(attr, cpusetsize, cpuset);
}

int32_t libc_mips32_mod_pthread_attr_setaffinity_np(void* attr, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_attr_setaffinity_np(attr, cpusetsize, cpuset);
}

