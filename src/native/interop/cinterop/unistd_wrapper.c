#include "unistd_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <unistd.h>
#endif

int32_t libc_unistd_access(const char* pathname, int32_t mode) {
    return (int32_t)access(pathname, mode);
}

int32_t libc_unistd_close(int32_t fd) {
    return (int32_t)close(fd);
}

int64_t libc_unistd_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_unistd_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int64_t libc_unistd_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int32_t libc_unistd_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

int32_t libc_unistd_unlink(const char* pathname) {
    return (int32_t)unlink(pathname);
}

char* libc_unistd_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

int32_t libc_unistd_rmdir(const char* pathname) {
    return (int32_t)rmdir(pathname);
}

int32_t libc_unistd_getpid(void) {
    return (int32_t)getpid();
}

uint32_t libc_unistd_sleep(uint32_t seconds) {
#if !defined(_WIN32)
    return (uint32_t)sleep(seconds);
#else
    (void)seconds;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t libc_unistd_sysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

