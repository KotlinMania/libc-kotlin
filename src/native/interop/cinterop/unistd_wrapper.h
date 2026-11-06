#ifndef LIBC_UNISTD_UNISTD_WRAPPER_H
#define LIBC_UNISTD_UNISTD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unistd_access(const char* pathname, int32_t mode);
int32_t libc_unistd_close(int32_t fd);
int64_t libc_unistd_lseek(int32_t fd, int64_t offset, int32_t whence);
int64_t libc_unistd_read(int32_t fd, void* buf, uint64_t count);
int64_t libc_unistd_write(int32_t fd, void* buf, uint64_t count);
int32_t libc_unistd_ftruncate(int32_t fd, int64_t length);
int32_t libc_unistd_unlink(const char* pathname);
char* libc_unistd_getcwd(char* buf, uint64_t size);
int32_t libc_unistd_rmdir(const char* pathname);
int32_t libc_unistd_getpid(void);
uint32_t libc_unistd_sleep(uint32_t seconds);
int64_t libc_unistd_sysconf(int32_t name);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNISTD_UNISTD_WRAPPER_H */
