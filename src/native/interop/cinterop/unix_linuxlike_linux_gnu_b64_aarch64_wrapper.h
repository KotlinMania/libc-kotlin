#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxGnuB64Aarch64Sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libcUnixLinuxlikeLinuxGnuB64Aarch64Getcontext(void* ucp);
int32_t libcUnixLinuxlikeLinuxGnuB64Aarch64Setcontext(void* ucp);
void libcUnixLinuxlikeLinuxGnuB64Aarch64Makecontext(void* ucp, void* func, int32_t argc, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxGnuB64Aarch64Swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H */
