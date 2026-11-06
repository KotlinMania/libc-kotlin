#include "linux_like_mod_wrapper.h"
#include <errno.h>
#include <time.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/ioctl.h>
#include <semaphore.h>
#include <dirent.h>
#include <sys/socket.h>
#endif

int32_t libc_linux_like_mod_libc_current_sigrtmax(void) {
    return (int32_t)__libc_current_sigrtmax();
}

int32_t libc_linux_like_mod_libc_current_sigrtmin(void) {
    return (int32_t)__libc_current_sigrtmin();
}

int32_t libc_linux_like_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_like_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
#if !defined(_WIN32)
    return (int32_t)sem_init(sem, pshared, value);
#else
    (void)sem;
    (void)pshared;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_like_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_linux_like_mod_mincore(void* addr, uint64_t len, void* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_linux_like_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_linux_like_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_linux_like_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_linux_like_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_linux_like_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_linux_like_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

int32_t libc_linux_like_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

void* libc_linux_like_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_linux_like_mod_setgroups(uint64_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_linux_like_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_linux_like_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_linux_like_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

void* libc_linux_like_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_linux_like_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_linux_like_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_linux_like_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_linux_like_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

void libc_linux_like_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int32_t libc_linux_like_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

int32_t libc_linux_like_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

int32_t libc_linux_like_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_linux_like_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_linux_like_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_linux_like_mod_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_linux_like_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

int32_t libc_linux_like_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_linux_like_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_linux_like_mod_brk(void* addr) {
    return (int32_t)brk(addr);
}

void* libc_linux_like_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_linux_like_mod_vfork(void) {
    return (int32_t)vfork();
}

int32_t libc_linux_like_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_linux_like_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

int32_t libc_linux_like_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_linux_like_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

int32_t libc_linux_like_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_linux_like_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_linux_like_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_linux_like_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_linux_like_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_linux_like_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_linux_like_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_linux_like_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_linux_like_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

int32_t libc_linux_like_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

char* libc_linux_like_mod_strchrnul(const char* s, int32_t c) {
    return (char*)strchrnul(s, c);
}

uint64_t libc_linux_like_mod_strftime(char* s, uint64_t max, const char* format, void* tm) {
    return (uint64_t)strftime(s, max, format, tm);
}

uint64_t libc_linux_like_mod_strftime_l(char* s, uint64_t max, const char* format, void* tm, int32_t locale) {
    return (uint64_t)strftime_l(s, max, format, tm, locale);
}

char* libc_linux_like_mod_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

int32_t libc_linux_like_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_linux_like_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_linux_like_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_linux_like_mod_setdomainname(const char* name, uint64_t len) {
    return (int32_t)setdomainname(name, len);
}

void* libc_linux_like_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_linux_like_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_linux_like_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_linux_like_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_linux_like_mod_fstatfs64(int32_t fd, void* buf) {
    return (int32_t)fstatfs64(fd, buf);
}

int32_t libc_linux_like_mod_statvfs64(const char* path, void* buf) {
    return (int32_t)statvfs64(path, buf);
}

int32_t libc_linux_like_mod_fstatvfs64(int32_t fd, void* buf) {
    return (int32_t)fstatvfs64(fd, buf);
}

int32_t libc_linux_like_mod_statfs64(const char* path, void* buf) {
    return (int32_t)statfs64(path, buf);
}

int32_t libc_linux_like_mod_creat64(const char* path, uint32_t mode) {
    return (int32_t)creat64(path, mode);
}

int32_t libc_linux_like_mod_fstat64(int32_t fildes, void* buf) {
    return (int32_t)fstat64(fildes, buf);
}

int32_t libc_linux_like_mod_fstatat64(int32_t dirfd, const char* pathname, void* buf, int32_t flags) {
    return (int32_t)fstatat64(dirfd, pathname, buf, flags);
}

int32_t libc_linux_like_mod_ftruncate64(int32_t fd, int64_t length) {
    return (int32_t)ftruncate64(fd, length);
}

int64_t libc_linux_like_mod_lseek64(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek64(fd, offset, whence);
}

int32_t libc_linux_like_mod_lstat64(const char* path, void* buf) {
    return (int32_t)lstat64(path, buf);
}

void* libc_linux_like_mod_mmap64(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
    return (void*)mmap64(addr, len, prot, flags, fd, offset);
}

int32_t libc_linux_like_mod_posix_fadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise64(fd, offset, len, advise);
}

int64_t libc_linux_like_mod_pread64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread64(fd, buf, count, offset);
}

int64_t libc_linux_like_mod_pwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite64(fd, buf, count, offset);
}

void* libc_linux_like_mod_readdir64(void* dirp) {
    return (void*)readdir64((DIR*)dirp);
}

int32_t libc_linux_like_mod_readdir64r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir64_r((DIR*)dirp, entry, result);
}

int32_t libc_linux_like_mod_stat64(const char* path, void* buf) {
    return (int32_t)stat64(path, buf);
}

int32_t libc_linux_like_mod_truncate64(const char* path, int64_t length) {
    return (int32_t)truncate64(path, length);
}

int64_t libc_linux_like_mod_preadv64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv64(fd, iov, iovcnt, offset);
}

int64_t libc_linux_like_mod_pwritev64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev64(fd, iov, iovcnt, offset);
}

int32_t libc_linux_like_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_linux_like_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_linux_like_mod_statx(int32_t dirfd, const char* pathname, int32_t flags, uint32_t mask, void* statxbuf) {
    return (int32_t)statx(dirfd, pathname, flags, mask, statxbuf);
}

