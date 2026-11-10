#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_gnu_b64_powerpc64_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_linuxlike_linux_gnu_b64_powerpc64_getcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_powerpc64_setcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_powerpc64_swapcontext(void* oucp, void* ucp);
void libc_unix_linuxlike_linux_gnu_b64_powerpc64_makecontext(void* ucp, void* func, int32_t argc, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_UNIX_LINUXLIKE_LINUX_GNU_B64_POWERPC64_WRAPPER_H */
