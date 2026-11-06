#ifndef LIBC_AARCH64_MOD_AARCH64_MOD_WRAPPER_H
#define LIBC_AARCH64_MOD_AARCH64_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_aarch64_mod_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_aarch64_mod_getcontext(void* ucp);
int32_t libc_aarch64_mod_setcontext(void* ucp);
int32_t libc_aarch64_mod_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_AARCH64_MOD_AARCH64_MOD_WRAPPER_H */
