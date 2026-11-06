#ifndef LIBC_MIPS64_MOD_MIPS64_MOD_WRAPPER_H
#define LIBC_MIPS64_MOD_MIPS64_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_mips64_mod_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_MIPS64_MOD_MIPS64_MOD_WRAPPER_H */
