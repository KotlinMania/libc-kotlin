#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxGnuB64X8664Getcontext(void* ucp);
int32_t libcUnixLinuxlikeLinuxGnuB64X8664Setcontext(void* ucp);
void libcUnixLinuxlikeLinuxGnuB64X8664Makecontext(void* ucp, void* func, int32_t argc, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxGnuB64X8664Swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H */
