#ifndef LIBC_REDOX_MOD_REDOX_MOD_WRAPPER_H
#define LIBC_REDOX_MOD_REDOX_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_redox_mod_errno_location(void);
int32_t libc_redox_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_redox_mod_dirfd(void* dirp);
int32_t libc_redox_mod_pipe2(void* fds, int32_t flags);
int32_t libc_redox_mod_getdtablesize(void);
int32_t libc_redox_mod_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_redox_mod_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_redox_mod_setresgid(int32_t rgid, int32_t egid, int32_t sgid);
int32_t libc_redox_mod_setresuid(int32_t ruid, int32_t euid, int32_t suid);
void* libc_redox_mod_getgrent(void);
void libc_redox_mod_setgrent(void);
void libc_redox_mod_endgrent(void);
void* libc_redox_mod_getgrgid(int32_t gid);
int32_t libc_redox_mod_getgrgid_r(int32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
void* libc_redox_mod_getgrnam(const char* name);
int32_t libc_redox_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_redox_mod_getgrouplist(const char* user, int32_t group, void* groups, void* ngroups);
void* libc_redox_mod_memalign(uint64_t align, uint64_t size);
int32_t libc_redox_mod_getnameinfo(void* addr, uint32_t addrlen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_redox_mod_pthread_atfork(void* prepare, void* parent, void* child);
int32_t libc_redox_mod_pthread_create(void* tid, void* attr, int32_t start, void* arg);
int32_t libc_redox_mod_pthread_condattr_setclock(void* attr, int32_t clock_id);
int32_t libc_redox_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
void* libc_redox_mod_getpwent(void);
void libc_redox_mod_setpwent(void);
void libc_redox_mod_endpwent(void);
int32_t libc_redox_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_redox_mod_getpwuid_r(int32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_redox_mod_pthread_sigmask(int32_t how, void* set, void* oldset);
int32_t libc_redox_mod_pthread_cancel(void* thread);
int32_t libc_redox_mod_pthread_kill(void* thread, int32_t sig);
int32_t libc_redox_mod_sigtimedwait(void* set, void* sig, void* timeout);
int32_t libc_redox_mod_sigwait(void* set, void* sig);
int32_t libc_redox_mod_getsubopt(void* optionp, void* tokens, void* valuep);
int32_t libc_redox_mod_mkostemp(char* template, int32_t flags);
int32_t libc_redox_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags);
void* libc_redox_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libc_redox_mod_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);
void libc_redox_mod_explicit_bzero(void* p, uint64_t len);
uint64_t libc_redox_mod_strlcat(char* dst, const char* src, uint64_t siz);
uint64_t libc_redox_mod_strlcpy(char* dst, const char* src, uint64_t siz);
int32_t libc_redox_mod_epoll_create(int32_t size);
int32_t libc_redox_mod_epoll_create1(int32_t flags);
int32_t libc_redox_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_redox_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_redox_mod_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_redox_mod_msync(void* addr, uint64_t len, int32_t flags);
int32_t libc_redox_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_redox_mod_shm_open(const char* name, int32_t oflag, int32_t mode);
int32_t libc_redox_mod_shm_unlink(const char* name);
int32_t libc_redox_mod_getpriority(int32_t which, uint32_t who);
int32_t libc_redox_mod_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_redox_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_redox_mod_setrlimit(int32_t resource, void* rlim);
void* libc_redox_mod_cmsg_data(void* cmsg);
void* libc_redox_mod_cmsg_firsthdr(void* mhdr);
void* libc_redox_mod_cmsg_nxthdr(void* mhdr, void* cmsg);
int32_t libc_redox_mod_bind(int32_t socket, void* address, uint32_t address_len);
int64_t libc_redox_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int64_t libc_redox_mod_recvmsg(int32_t socket, void* msg, int32_t flags);
int64_t libc_redox_mod_sendmsg(int32_t socket, void* msg, int32_t flags);
int32_t libc_redox_mod_futimens(int32_t fd, void* times);
int64_t libc_redox_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_redox_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_redox_mod_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_redox_mod_writev(int32_t fd, void* iov, int32_t iovcnt);
int32_t libc_redox_mod_uname(void* utsname);
int32_t libc_redox_mod_gettimeofday(void* tp, void* tz);
int32_t libc_redox_mod_clock_gettime(int32_t clk_id, void* tp);
uint64_t libc_redox_mod_strftime(char* s, uint64_t max, const char* format, void* tm);
int32_t libc_redox_mod_login_tty(int32_t fd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_REDOX_MOD_REDOX_MOD_WRAPPER_H */
