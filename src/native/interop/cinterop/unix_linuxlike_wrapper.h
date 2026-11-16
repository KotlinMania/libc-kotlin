#ifndef LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeIoctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLibcCurrentSigrtmax(void);
int32_t libcUnixLinuxlikeLibcCurrentSigrtmin(void);
int32_t libcUnixLinuxlikeSemDestroy(void* sem);
int32_t libcUnixLinuxlikeSemInit(void* sem, int32_t pshared, uint32_t value);
int32_t libcUnixLinuxlikeFdatasync(int32_t fd);
int32_t libcUnixLinuxlikeMincore(void* addr, uint64_t len, void* vec);
int32_t libcUnixLinuxlikeClockGetres(int32_t clkId, void* tp);
int32_t libcUnixLinuxlikeClockGettime(int32_t clkId, void* tp);
int32_t libcUnixLinuxlikeClockSettime(int32_t clkId, void* tp);
int32_t libcUnixLinuxlikeClockGetcpuclockid(int32_t pid, void* clkId);
int32_t libcUnixLinuxlikeGetitimer(int32_t which, void* currValue);
int32_t libcUnixLinuxlikeSetitimer(int32_t which, void* newValue, void* oldValue);
int32_t libcUnixLinuxlikeDirfd(void* dirp);
void* libcUnixLinuxlikeMemalign(uint64_t align, uint64_t size);
int32_t libcUnixLinuxlikeSetgroups(uint64_t ngroups, void* ptr);
int32_t libcUnixLinuxlikePipe2(void* fds, int32_t flags);
int32_t libcUnixLinuxlikeStatfs(const char* path, void* buf);
int32_t libcUnixLinuxlikeFstatfs(int32_t fd, void* buf);
void* libcUnixLinuxlikeMemrchr(void* cx, int32_t c, uint64_t n);
int32_t libcUnixLinuxlikePosixFadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int32_t libcUnixLinuxlikeFutimens(int32_t fd, void* times);
int32_t libcUnixLinuxlikeUtimensat(int32_t dirfd, const char* path, void* times, int32_t flag);
void* libcUnixLinuxlikeDuplocale(void* base);
void libcUnixLinuxlikeFreelocale(void* loc);
void* libcUnixLinuxlikeNewlocale(int32_t mask, const char* locale, void* base);
void* libcUnixLinuxlikeUselocale(void* loc);
int32_t libcUnixLinuxlikeMknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint64_t dev);
int32_t libcUnixLinuxlikePtsnameR(int32_t fd, char* buf, uint64_t buflen);
int32_t libcUnixLinuxlikeClearenv(void);
int32_t libcUnixLinuxlikeWaitid(uint32_t idtype, uint32_t id, void* infop, int32_t options);
int32_t libcUnixLinuxlikeGetresuid(void* ruid, void* euid, void* suid);
int32_t libcUnixLinuxlikeGetresgid(void* rgid, void* egid, void* sgid);
int32_t libcUnixLinuxlikeAcct(const char* filename);
int32_t libcUnixLinuxlikeBrk(void* addr);
void* libcUnixLinuxlikeSbrk(int64_t increment);
int32_t libcUnixLinuxlikeVfork(void);
int32_t libcUnixLinuxlikeSetresgid(uint16_t rgid, uint16_t egid, uint16_t sgid);
int32_t libcUnixLinuxlikeSetresuid(uint16_t ruid, uint16_t euid, uint16_t suid);
int32_t libcUnixLinuxlikeWait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libcUnixLinuxlikeLoginTty(int32_t fd);
int32_t libcUnixLinuxlikeExecvpe(const char* file, void* argv, void* envp);
int32_t libcUnixLinuxlikeFexecve(int32_t fd, void* argv, void* envp);
int32_t libcUnixLinuxlikeGetifaddrs(void* ifap);
void libcUnixLinuxlikeFreeifaddrs(void* ifa);
int32_t libcUnixLinuxlikeBind(int32_t arg0Socket, void* address, uint32_t addressLen);
int64_t libcUnixLinuxlikeWritev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixLinuxlikeReadv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libcUnixLinuxlikeSendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libcUnixLinuxlikeRecvmsg(int32_t fd, void* msg, int32_t flags);
int32_t libcUnixLinuxlikeUname(void* buf);
char* libcUnixLinuxlikeStrchrnul(const char* s, int32_t c);
uint64_t libcUnixLinuxlikeStrftime(char* s, uint64_t max, const char* format, void* tm);
uint64_t libcUnixLinuxlikeStrftimeL(char* s, uint64_t max, const char* format, void* tm, void* locale);
char* libcUnixLinuxlikeStrptime(const char* s, const char* format, void* tm);
int32_t libcUnixLinuxlikeMkostemp(char* arg0Template, int32_t flags);
int32_t libcUnixLinuxlikeMkostemps(char* arg0Template, int32_t suffixlen, int32_t flags);
int32_t libcUnixLinuxlikeGetdomainname(char* name, uint64_t len);
int32_t libcUnixLinuxlikeSetdomainname(const char* name, uint64_t len);
void* libcUnixLinuxlikeIfNameindex(void);
void libcUnixLinuxlikeIfFreenameindex(void* ptr);
int32_t libcUnixLinuxlikeGetpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeGetpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libcUnixLinuxlikeFstatfs64(int32_t fd, void* buf);
int32_t libcUnixLinuxlikeStatvfs64(const char* path, void* buf);
int32_t libcUnixLinuxlikeFstatvfs64(int32_t fd, void* buf);
int32_t libcUnixLinuxlikeStatfs64(const char* path, void* buf);
int32_t libcUnixLinuxlikeCreat64(const char* path, uint32_t mode);
int32_t libcUnixLinuxlikeFstat64(int32_t fildes, void* buf);
int32_t libcUnixLinuxlikeFstatat64(int32_t dirfd, const char* pathname, void* buf, int32_t flags);
int32_t libcUnixLinuxlikeFtruncate64(int32_t fd, int64_t length);
int64_t libcUnixLinuxlikeLseek64(int32_t fd, int64_t offset, int32_t whence);
int32_t libcUnixLinuxlikeLstat64(const char* path, void* buf);
void* libcUnixLinuxlikeMmap64(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libcUnixLinuxlikeOpen64(const char* path, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeOpenat64(int32_t fd, const char* path, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikePosixFadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise);
int64_t libcUnixLinuxlikePread64(int32_t fd, void* buf, uint64_t count, int64_t offset);
int64_t libcUnixLinuxlikePwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset);
void* libcUnixLinuxlikeReaddir64(void* dirp);
int32_t libcUnixLinuxlikeReaddir64R(void* dirp, void* entry, void* result);
int32_t libcUnixLinuxlikeStat64(const char* path, void* buf);
int32_t libcUnixLinuxlikeTruncate64(const char* path, int64_t length);
int64_t libcUnixLinuxlikePreadv64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixLinuxlikePwritev64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixLinuxlikeForkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libcUnixLinuxlikeOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libcUnixLinuxlikeStatx(int32_t dirfd, const char* pathname, int32_t flags, uint32_t mask, void* statxbuf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_UNIX_LINUXLIKE_WRAPPER_H */
