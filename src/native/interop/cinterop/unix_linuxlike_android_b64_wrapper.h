#ifndef LIBC_UNIX_LINUXLIKE_ANDROID_B64_UNIX_LINUXLIKE_ANDROID_B64_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_ANDROID_B64_UNIX_LINUXLIKE_ANDROID_B64_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

bool libcUnixLinuxlikeAndroidB64SystemPropertyWait(void* pi, uint32_t oldSerial, void* newSerialPtr, void* relativeTimeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_ANDROID_B64_UNIX_LINUXLIKE_ANDROID_B64_WRAPPER_H */
