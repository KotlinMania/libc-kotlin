#ifndef LIBC_X86_MOD_X86_MOD_WRAPPER_H
#define LIBC_X86_MOD_X86_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_x86_mod_getcontext(void* ucp);
int32_t libc_x86_mod_setcontext(void* ucp);
int32_t libc_x86_mod_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_X86_MOD_X86_MOD_WRAPPER_H */
