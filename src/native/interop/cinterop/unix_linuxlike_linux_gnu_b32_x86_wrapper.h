#ifndef LIBC_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_gnu_b32_x86_getcontext(void* ucp);
int32_t libc_unix_linuxlike_linux_gnu_b32_x86_setcontext(void* ucp);
void libc_unix_linuxlike_linux_gnu_b32_x86_makecontext(void* ucp, void* func, int32_t argc, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_UNIX_LINUXLIKE_LINUX_GNU_B32_X86_WRAPPER_H */
