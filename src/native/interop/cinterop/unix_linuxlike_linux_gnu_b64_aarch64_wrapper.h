#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_gnu_b64_aarch64_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_linuxlike_linux_gnu_b64_aarch64_getcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_aarch64_setcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_aarch64_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_UNIX_LINUXLIKE_LINUX_GNU_B64_AARCH64_WRAPPER_H */
