#ifndef LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H
#define LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_qurt_fcntl_creat(const char* pathname, uint32_t mode);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_FCNTL_NEW_QURT_FCNTL_WRAPPER_H */
