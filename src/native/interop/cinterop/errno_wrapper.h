#ifndef LIBC_ERRNO_ERRNO_WRAPPER_H
#define LIBC_ERRNO_ERRNO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_errno_errno_location(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_ERRNO_ERRNO_WRAPPER_H */
