#include "new_qurt_unistd_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <unistd.h>
#endif

int32_t libcNewQurtUnistdAccess(const char* pathname, int32_t mode) {
    return (int32_t)access(pathname, mode);
}

int32_t libcNewQurtUnistdClose(int32_t fd) {
    return (int32_t)close(fd);
}

int64_t libcNewQurtUnistdLseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int32_t libcNewQurtUnistdRead(int32_t fd, void* buf, uint64_t count) {
    return (int32_t)read(fd, buf, count);
}

int32_t libcNewQurtUnistdWrite(int32_t fd, void* buf, uint64_t count) {
    return (int32_t)write(fd, buf, count);
}

int32_t libcNewQurtUnistdFtruncate(int32_t fd, int64_t length) {
#if !defined(_WIN32)
    return (int32_t)ftruncate(fd, length);
#else
    (void)fd;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libcNewQurtUnistdUnlink(const char* pathname) {
    return (int32_t)unlink(pathname);
}

char* libcNewQurtUnistdGetcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

int32_t libcNewQurtUnistdRmdir(const char* pathname) {
    return (int32_t)rmdir(pathname);
}

int32_t libcNewQurtUnistdGetpid(void) {
    return (int32_t)getpid();
}

uint32_t libcNewQurtUnistdSleep(uint32_t seconds) {
#if !defined(_WIN32)
    return (uint32_t)sleep(seconds);
#else
    (void)seconds;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t libcNewQurtUnistdSysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

