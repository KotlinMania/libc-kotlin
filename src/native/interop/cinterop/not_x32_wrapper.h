#ifndef LIBC_NOT_X32_NOT_X32_WRAPPER_H
#define LIBC_NOT_X32_NOT_X32_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_not_x32_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NOT_X32_NOT_X32_WRAPPER_H */
