#ifndef LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64(void* pglob);
int32_t libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_UNIX_LINUXLIKE_LINUX_UCLIBC_MIPS_MIPS32_WRAPPER_H */
