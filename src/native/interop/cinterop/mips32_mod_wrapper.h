#ifndef LIBC_MIPS32_MOD_MIPS32_MOD_WRAPPER_H
#define LIBC_MIPS32_MOD_MIPS32_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_mips32_mod_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_mips32_mod_glob64(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_mips32_mod_globfree64(void* pglob);
int32_t libc_mips32_mod_pthread_attr_getaffinity_np(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_mips32_mod_pthread_attr_setaffinity_np(void* attr, uint64_t cpusetsize, void* cpuset);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_MIPS32_MOD_MIPS32_MOD_WRAPPER_H */
