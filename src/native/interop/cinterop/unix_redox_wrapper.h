#ifndef LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H
#define LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_unix_redox_errnoLocation(void);
int32_t libc_unix_redox_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_redox_dirfd(void* dirp);
int32_t libc_unix_redox_pipe2(void* fds, int32_t flags);
int32_t libc_unix_redox_getdtablesize(void);
int32_t libc_unix_redox_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_unix_redox_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_unix_redox_setresgid(int32_t rgid, int32_t egid, int32_t sgid);
int32_t libc_unix_redox_setresuid(int32_t ruid, int32_t euid, int32_t suid);
void* libc_unix_redox_getgrent(void);
void libc_unix_redox_setgrent(void);
void libc_unix_redox_endgrent(void);
void* libc_unix_redox_getgrgid(int32_t gid);
int32_t libc_unix_redox_getgrgidR(int32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
void* libc_unix_redox_getgrnam(const char* name);
int32_t libc_unix_redox_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_redox_getgrouplist(const char* user, int32_t group, void* groups, void* ngroups);
void* libc_unix_redox_memalign(uint64_t align, uint64_t size);
int32_t libc_unix_redox_getnameinfo(void* addr, uint32_t addrlen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_unix_redox_pthreadAtfork(void* prepare, void* parent, void* child);
int32_t libc_unix_redox_pthreadCreate(void* tid, void* attr, void* start, void* arg);
int32_t libc_unix_redox_pthreadCondattrSetclock(void* attr, int32_t clock_id);
int32_t libc_unix_redox_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
void* libc_unix_redox_getpwent(void);
void libc_unix_redox_setpwent(void);
void libc_unix_redox_endpwent(void);
int32_t libc_unix_redox_getpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_redox_getpwuidR(int32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_redox_pthreadSigmask(int32_t how, void* set, void* oldset);
int32_t libc_unix_redox_pthreadCancel(void* thread);
int32_t libc_unix_redox_pthreadKill(void* thread, int32_t sig);
int32_t libc_unix_redox_sigtimedwait(void* set, void* sig, void* timeout);
int32_t libc_unix_redox_sigwait(void* set, void* sig);
int32_t libc_unix_redox_getsubopt(void* optionp, void* tokens, void* valuep);
int32_t libc_unix_redox_mkostemp(char* arg_0_template, int32_t flags);
int32_t libc_unix_redox_mkostemps(char* arg_0_template, int32_t suffixlen, int32_t flags);
void* libc_unix_redox_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libc_unix_redox_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);
void libc_unix_redox_explicitBzero(void* p, uint64_t len);
uint64_t libc_unix_redox_strlcat(char* dst, const char* src, uint64_t siz);
uint64_t libc_unix_redox_strlcpy(char* dst, const char* src, uint64_t siz);
int32_t libc_unix_redox_epollCreate(int32_t size);
int32_t libc_unix_redox_epollCreate1(int32_t flags);
int32_t libc_unix_redox_epollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_unix_redox_epollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_unix_redox_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_redox_msync(void* addr, uint64_t len, int32_t flags);
int32_t libc_unix_redox_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_redox_shmOpen(const char* name, int32_t oflag, int32_t mode);
int32_t libc_unix_redox_shmUnlink(const char* name);
int32_t libc_unix_redox_getpriority(int32_t which, uint32_t who);
int32_t libc_unix_redox_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_unix_redox_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_redox_setrlimit(int32_t resource, void* rlim);
void* libc_unix_redox_cmsgData(void* cmsg);
void* libc_unix_redox_cmsgFirsthdr(void* mhdr);
void* libc_unix_redox_cmsgNxthdr(void* mhdr, void* cmsg);
int32_t libc_unix_redox_bind(int32_t arg_0_socket, void* address, uint32_t address_len);
int64_t libc_unix_redox_recvfrom(int32_t arg_0_socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int64_t libc_unix_redox_recvmsg(int32_t arg_0_socket, void* msg, int32_t flags);
int64_t libc_unix_redox_sendmsg(int32_t arg_0_socket, void* msg, int32_t flags);
int32_t libc_unix_redox_futimens(int32_t fd, void* times);
int64_t libc_unix_redox_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_redox_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_redox_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_redox_writev(int32_t fd, void* iov, int32_t iovcnt);
int32_t libc_unix_redox_uname(void* utsname);
int32_t libc_unix_redox_gettimeofday(void* tp, void* tz);
int32_t libc_unix_redox_clockGettime(int32_t clk_id, void* tp);
uint64_t libc_unix_redox_strftime(char* s, uint64_t max, const char* format, void* tm);
int32_t libc_unix_redox_loginTty(int32_t fd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_REDOX_UNIX_REDOX_WRAPPER_H */
