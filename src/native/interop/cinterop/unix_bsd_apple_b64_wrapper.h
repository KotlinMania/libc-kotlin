#ifndef LIBC_UNIX_BSD_APPLE_B64_UNIX_BSD_APPLE_B64_WRAPPER_H
#define LIBC_UNIX_BSD_APPLE_B64_UNIX_BSD_APPLE_B64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_bsd_apple_b64_exchangedata(const char* path1, const char* path2, uint32_t options);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_APPLE_B64_UNIX_BSD_APPLE_B64_WRAPPER_H */
