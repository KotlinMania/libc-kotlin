#ifndef LIBC_UNIX_AIX_POWERPC64_UNIX_AIX_POWERPC64_WRAPPER_H
#define LIBC_UNIX_AIX_POWERPC64_UNIX_AIX_POWERPC64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libcUnixAixPowerpc64Getsystemcfg(int32_t label);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_AIX_POWERPC64_UNIX_AIX_POWERPC64_WRAPPER_H */
