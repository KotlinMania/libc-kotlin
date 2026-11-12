#ifndef LIBC_NEW_QURT_UNISTD_NEW_QURT_UNISTD_WRAPPER_H
#define LIBC_NEW_QURT_UNISTD_NEW_QURT_UNISTD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewQurtUnistdAccess(const char* pathname, int32_t mode);
int32_t libcNewQurtUnistdClose(int32_t fd);
int64_t libcNewQurtUnistdLseek(int32_t fd, int64_t offset, int32_t whence);
int32_t libcNewQurtUnistdRead(int32_t fd, void* buf, uint64_t count);
int32_t libcNewQurtUnistdWrite(int32_t fd, void* buf, uint64_t count);
int32_t libcNewQurtUnistdFtruncate(int32_t fd, int64_t length);
int32_t libcNewQurtUnistdUnlink(const char* pathname);
char* libcNewQurtUnistdGetcwd(char* buf, uint64_t size);
int32_t libcNewQurtUnistdRmdir(const char* pathname);
int32_t libcNewQurtUnistdGetpid(void);
uint32_t libcNewQurtUnistdSleep(uint32_t seconds);
int64_t libcNewQurtUnistdSysconf(int32_t name);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_UNISTD_NEW_QURT_UNISTD_WRAPPER_H */
