#ifndef LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_libcCurrentSigrtmax(void);
int32_t libc_unix_linuxlike_libcCurrentSigrtmin(void);
int32_t libc_unix_linuxlike_semDestroy(void* sem);
int32_t libc_unix_linuxlike_semInit(void* sem, int32_t pshared, uint32_t value);
int32_t libc_unix_linuxlike_fdatasync(int32_t fd);
int32_t libc_unix_linuxlike_mincore(void* addr, uint64_t len, void* vec);
int32_t libc_unix_linuxlike_clockGetres(int32_t clk_id, void* tp);
int32_t libc_unix_linuxlike_clockGettime(int32_t clk_id, void* tp);
int32_t libc_unix_linuxlike_clockSettime(int32_t clk_id, void* tp);
int32_t libc_unix_linuxlike_clockGetcpuclockid(int32_t pid, void* clk_id);
int32_t libc_unix_linuxlike_getitimer(int32_t which, void* curr_value);
int32_t libc_unix_linuxlike_setitimer(int32_t which, void* new_value, void* old_value);
int32_t libc_unix_linuxlike_dirfd(void* dirp);
void* libc_unix_linuxlike_memalign(uint64_t align, uint64_t size);
int32_t libc_unix_linuxlike_setgroups(uint64_t ngroups, void* ptr);
int32_t libc_unix_linuxlike_pipe2(void* fds, int32_t flags);
int32_t libc_unix_linuxlike_statfs(const char* path, void* buf);
int32_t libc_unix_linuxlike_fstatfs(int32_t fd, void* buf);
void* libc_unix_linuxlike_memrchr(void* cx, int32_t c, uint64_t n);
int32_t libc_unix_linuxlike_posixFadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int32_t libc_unix_linuxlike_futimens(int32_t fd, void* times);
int32_t libc_unix_linuxlike_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
void* libc_unix_linuxlike_duplocale(void* base);
void libc_unix_linuxlike_freelocale(void* loc);
void* libc_unix_linuxlike_newlocale(int32_t mask, const char* locale, void* base);
void* libc_unix_linuxlike_uselocale(void* loc);
int32_t libc_unix_linuxlike_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint64_t dev);
int32_t libc_unix_linuxlike_ptsnameR(int32_t fd, char* buf, uint64_t buflen);
int32_t libc_unix_linuxlike_clearenv(void);
int32_t libc_unix_linuxlike_waitid(uint32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libc_unix_linuxlike_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_unix_linuxlike_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_unix_linuxlike_acct(const char* filename);
int32_t libc_unix_linuxlike_brk(void* addr);
void* libc_unix_linuxlike_sbrk(int64_t increment);
int32_t libc_unix_linuxlike_vfork(void);
int32_t libc_unix_linuxlike_setresgid(uint16_t rgid, uint16_t egid, uint16_t sgid);
int32_t libc_unix_linuxlike_setresuid(uint16_t ruid, uint16_t euid, uint16_t suid);
int32_t libc_unix_linuxlike_wait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libc_unix_linuxlike_loginTty(int32_t fd);
int32_t libc_unix_linuxlike_execvpe(const char* file, void* argv, void* envp);
int32_t libc_unix_linuxlike_fexecve(int32_t fd, void* argv, void* envp);
int32_t libc_unix_linuxlike_getifaddrs(void* ifap);
void libc_unix_linuxlike_freeifaddrs(void* ifa);
int32_t libc_unix_linuxlike_bind(int32_t arg_0_socket, void* address, uint32_t address_len);
int64_t libc_unix_linuxlike_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_linuxlike_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_linuxlike_sendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libc_unix_linuxlike_recvmsg(int32_t fd, void* msg, int32_t flags);
int32_t libc_unix_linuxlike_uname(void* buf);
char* libc_unix_linuxlike_strchrnul(const char* s, int32_t c);
uint64_t libc_unix_linuxlike_strftime(char* s, uint64_t max, const char* format, void* tm);
uint64_t libc_unix_linuxlike_strftimeL(char* s, uint64_t max, const char* format, void* tm, void* locale);
char* libc_unix_linuxlike_strptime(const char* s, const char* format, void* tm);
int32_t libc_unix_linuxlike_mkostemp(char* arg_0_template, int32_t flags);
int32_t libc_unix_linuxlike_mkostemps(char* arg_0_template, int32_t suffixlen, int32_t flags);
int32_t libc_unix_linuxlike_getdomainname(char* name, uint64_t len);
int32_t libc_unix_linuxlike_setdomainname(const char* name, uint64_t len);
void* libc_unix_linuxlike_ifNameindex(void);
void libc_unix_linuxlike_ifFreenameindex(void* ptr);
int32_t libc_unix_linuxlike_getpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_getpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_fstatfs64(int32_t fd, void* buf);
int32_t libc_unix_linuxlike_statvfs64(const char* path, void* buf);
int32_t libc_unix_linuxlike_fstatvfs64(int32_t fd, void* buf);
int32_t libc_unix_linuxlike_statfs64(const char* path, void* buf);
int32_t libc_unix_linuxlike_creat64(const char* path, uint32_t mode);
int32_t libc_unix_linuxlike_fstat64(int32_t fildes, void* buf);
int32_t libc_unix_linuxlike_fstatat64(int32_t dirfd, const char* pathname, void* buf, int32_t flags);
int32_t libc_unix_linuxlike_ftruncate64(int32_t fd, int64_t length);
int64_t libc_unix_linuxlike_lseek64(int32_t fd, int64_t offset, int32_t whence);
int32_t libc_unix_linuxlike_lstat64(const char* path, void* buf);
void* libc_unix_linuxlike_mmap64(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_unix_linuxlike_posixFadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int64_t libc_unix_linuxlike_pread64(int32_t fd, void* buf, uint64_t count, int64_t offset);
int64_t libc_unix_linuxlike_pwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset);
void* libc_unix_linuxlike_readdir64(void* dirp);
int32_t libc_unix_linuxlike_readdir64R(void* dirp, void* entry, void* result);
int32_t libc_unix_linuxlike_stat64(const char* path, void* buf);
int32_t libc_unix_linuxlike_truncate64(const char* path, int64_t length);
int64_t libc_unix_linuxlike_preadv64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_linuxlike_pwritev64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_linuxlike_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_unix_linuxlike_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_linuxlike_statx(int32_t dirfd, const char* pathname, int32_t flags, uint32_t mask, void* statxbuf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H */
