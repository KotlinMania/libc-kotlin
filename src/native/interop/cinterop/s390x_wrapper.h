#ifndef LIBC_S390X_S390X_WRAPPER_H
#define LIBC_S390X_S390X_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_s390x_sysctl(void* name, int32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_s390x_getcontext(void* ucp);
int32_t libc_s390x_setcontext(void* ucp);
int32_t libc_s390x_swapcontext(void* uocp, void* ucp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_S390X_S390X_WRAPPER_H */
