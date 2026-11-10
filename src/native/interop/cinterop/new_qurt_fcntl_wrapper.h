#ifndef LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H
#define LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_qurt_fcntl_open(const char* pathname, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_new_qurt_fcntl_creat(const char* pathname, uint32_t mode);
int32_t libc_new_qurt_fcntl_fcntl(int32_t fd, int32_t cmd, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H */
