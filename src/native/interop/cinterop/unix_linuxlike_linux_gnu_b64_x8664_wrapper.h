#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_gnu_b64_x8664_getcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_x8664_setcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b64_x8664_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_UNIX_LINUXLIKE_LINUX_GNU_B64_X8664_WRAPPER_H */
