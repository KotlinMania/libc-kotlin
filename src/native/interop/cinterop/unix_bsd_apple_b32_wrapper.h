#ifndef LIBC_UNIX_BSD_APPLE_B32_UNIX_BSD_APPLE_B32_WRAPPER_H
#define LIBC_UNIX_BSD_APPLE_B32_UNIX_BSD_APPLE_B32_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixBsdAppleB32Exchangedata(const char* path1, const char* path2, uint64_t options);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_APPLE_B32_UNIX_BSD_APPLE_B32_WRAPPER_H */
