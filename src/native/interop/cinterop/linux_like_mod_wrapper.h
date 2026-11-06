#ifndef LIBC_LINUX_LIKE_MOD_LINUX_LIKE_MOD_WRAPPER_H
#define LIBC_LINUX_LIKE_MOD_LINUX_LIKE_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_linux_like_mod_libc_current_sigrtmax(void);
int32_t libc_linux_like_mod_libc_current_sigrtmin(void);
int32_t libc_linux_like_mod_sem_destroy(void* sem);
int32_t libc_linux_like_mod_sem_init(void* sem, int32_t pshared, uint32_t value);
int32_t libc_linux_like_mod_fdatasync(int32_t fd);
int32_t libc_linux_like_mod_mincore(void* addr, uint64_t len, void* vec);
int32_t libc_linux_like_mod_clock_getres(int32_t clk_id, void* tp);
int32_t libc_linux_like_mod_clock_gettime(int32_t clk_id, void* tp);
int32_t libc_linux_like_mod_clock_settime(int32_t clk_id, void* tp);
int32_t libc_linux_like_mod_clock_getcpuclockid(int32_t pid, void* clk_id);
int32_t libc_linux_like_mod_getitimer(int32_t which, void* curr_value);
int32_t libc_linux_like_mod_setitimer(int32_t which, void* new_value, void* old_value);
int32_t libc_linux_like_mod_dirfd(void* dirp);
void* libc_linux_like_mod_memalign(uint64_t align, uint64_t size);
int32_t libc_linux_like_mod_setgroups(uint64_t ngroups, void* ptr);
int32_t libc_linux_like_mod_pipe2(void* fds, int32_t flags);
int32_t libc_linux_like_mod_statfs(const char* path, void* buf);
int32_t libc_linux_like_mod_fstatfs(int32_t fd, void* buf);
void* libc_linux_like_mod_memrchr(void* cx, int32_t c, uint64_t n);
int32_t libc_linux_like_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int32_t libc_linux_like_mod_futimens(int32_t fd, void* times);
int32_t libc_linux_like_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
int32_t libc_linux_like_mod_duplocale(int32_t base);
void libc_linux_like_mod_freelocale(int32_t loc);
int32_t libc_linux_like_mod_newlocale(int32_t mask, const char* locale, int32_t base);
int32_t libc_linux_like_mod_uselocale(int32_t loc);
int32_t libc_linux_like_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev);
int32_t libc_linux_like_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen);
int32_t libc_linux_like_mod_clearenv(void);
int32_t libc_linux_like_mod_waitid(int32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libc_linux_like_mod_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_linux_like_mod_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_linux_like_mod_acct(const char* filename);
int32_t libc_linux_like_mod_brk(void* addr);
void* libc_linux_like_mod_sbrk(int64_t increment);
int32_t libc_linux_like_mod_vfork(void);
int32_t libc_linux_like_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid);
int32_t libc_linux_like_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid);
int32_t libc_linux_like_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libc_linux_like_mod_login_tty(int32_t fd);
int32_t libc_linux_like_mod_execvpe(const char* file, void* argv, void* envp);
int32_t libc_linux_like_mod_fexecve(int32_t fd, void* argv, void* envp);
int32_t libc_linux_like_mod_getifaddrs(void* ifap);
void libc_linux_like_mod_freeifaddrs(void* ifa);
int32_t libc_linux_like_mod_bind(int32_t socket, void* address, uint32_t address_len);
int64_t libc_linux_like_mod_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_linux_like_mod_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_linux_like_mod_sendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libc_linux_like_mod_recvmsg(int32_t fd, void* msg, int32_t flags);
int32_t libc_linux_like_mod_uname(void* buf);
char* libc_linux_like_mod_strchrnul(const char* s, int32_t c);
uint64_t libc_linux_like_mod_strftime(char* s, uint64_t max, const char* format, void* tm);
uint64_t libc_linux_like_mod_strftime_l(char* s, uint64_t max, const char* format, void* tm, int32_t locale);
char* libc_linux_like_mod_strptime(const char* s, const char* format, void* tm);
int32_t libc_linux_like_mod_mkostemp(char* template, int32_t flags);
int32_t libc_linux_like_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags);
int32_t libc_linux_like_mod_getdomainname(char* name, uint64_t len);
int32_t libc_linux_like_mod_setdomainname(const char* name, uint64_t len);
void* libc_linux_like_mod_if_nameindex(void);
void libc_linux_like_mod_if_freenameindex(void* ptr);
int32_t libc_linux_like_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_linux_like_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_linux_like_mod_fstatfs64(int32_t fd, void* buf);
int32_t libc_linux_like_mod_statvfs64(const char* path, void* buf);
int32_t libc_linux_like_mod_fstatvfs64(int32_t fd, void* buf);
int32_t libc_linux_like_mod_statfs64(const char* path, void* buf);
int32_t libc_linux_like_mod_creat64(const char* path, uint32_t mode);
int32_t libc_linux_like_mod_fstat64(int32_t fildes, void* buf);
int32_t libc_linux_like_mod_fstatat64(int32_t dirfd, const char* pathname, void* buf, int32_t flags);
int32_t libc_linux_like_mod_ftruncate64(int32_t fd, int64_t length);
int64_t libc_linux_like_mod_lseek64(int32_t fd, int64_t offset, int32_t whence);
int32_t libc_linux_like_mod_lstat64(const char* path, void* buf);
void* libc_linux_like_mod_mmap64(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_linux_like_mod_posix_fadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int64_t libc_linux_like_mod_pread64(int32_t fd, void* buf, uint64_t count, int64_t offset);
int64_t libc_linux_like_mod_pwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset);
void* libc_linux_like_mod_readdir64(void* dirp);
int32_t libc_linux_like_mod_readdir64r(void* dirp, void* entry, void* result);
int32_t libc_linux_like_mod_stat64(const char* path, void* buf);
int32_t libc_linux_like_mod_truncate64(const char* path, int64_t length);
int64_t libc_linux_like_mod_preadv64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_linux_like_mod_pwritev64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_linux_like_mod_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_linux_like_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_linux_like_mod_statx(int32_t dirfd, const char* pathname, int32_t flags, uint32_t mask, void* statxbuf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_LINUX_LIKE_MOD_LINUX_LIKE_MOD_WRAPPER_H */
