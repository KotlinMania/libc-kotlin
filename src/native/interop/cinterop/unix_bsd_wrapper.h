#ifndef LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H
#define LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_bsd_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_bsd_setrlimit(int32_t resource, void* rlim);
int32_t libc_unix_bsd_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_bsd_abs(int32_t i);
int64_t libc_unix_bsd_labs(int64_t i);
int32_t libc_unix_bsd_rand(void);
void libc_unix_bsd_srand(uint32_t seed);
int32_t libc_unix_bsd_getifaddrs(void* ifap);
void libc_unix_bsd_freeifaddrs(void* ifa);
int32_t libc_unix_bsd_setgroups(int32_t ngroups, void* ptr);
int32_t libc_unix_bsd_setlogin(const char* name);
int32_t libc_unix_bsd_ioctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_bsd_kqueue(void);
int32_t libc_unix_bsd_unmount(const char* target, int32_t arg);
int32_t libc_unix_bsd_syscall(int32_t num, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libc_unix_bsd_getpwent(void);
void libc_unix_bsd_setpwent(void);
void libc_unix_bsd_endpwent(void);
void libc_unix_bsd_endgrent(void);
void* libc_unix_bsd_getgrent(void);
const char* libc_unix_bsd_getprogname(void);
void libc_unix_bsd_setprogname(const char* name);
int32_t libc_unix_bsd_getloadavg(void* loadavg, int32_t nelem);
void* libc_unix_bsd_ifNameindex(void);
void libc_unix_bsd_ifFreenameindex(void* ptr);
int32_t libc_unix_bsd_getpeereid(int32_t arg_0_socket, void* euid, void* egid);
int32_t libc_unix_bsd_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_unix_bsd_globfree(void* pglob);
int32_t libc_unix_bsd_posixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_bsd_shmUnlink(const char* name);
void libc_unix_bsd_seekdir(void* dirp, int64_t loc);
int64_t libc_unix_bsd_telldir(void* dirp);
int32_t libc_unix_bsd_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_bsd_msync(void* addr, uint64_t len, int32_t flags);
int64_t libc_unix_bsd_recvfrom(int32_t arg_0_socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libc_unix_bsd_mkstemps(char* arg_0_template, int32_t suffixlen);
int32_t libc_unix_bsd_futimes(int32_t fd, void* times);
char* libc_unix_bsd_nlLanginfo(int32_t item);
int32_t libc_unix_bsd_bind(int32_t arg_0_socket, void* address, uint32_t address_len);
int64_t libc_unix_bsd_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_bsd_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_unix_bsd_sendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libc_unix_bsd_recvmsg(int32_t fd, void* msg, int32_t flags);
void libc_unix_bsd_sync(void);
int32_t libc_unix_bsd_getgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_bsd_sigaltstack(void* ss, void* oss);
int32_t libc_unix_bsd_sigsuspend(void* mask);
int32_t libc_unix_bsd_semClose(void* sem);
int32_t libc_unix_bsd_getdtablesize(void);
int32_t libc_unix_bsd_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_bsd_pthreadSigmask(int32_t how, void* set, void* oldset);
void* libc_unix_bsd_semOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libc_unix_bsd_getgrnam(const char* name);
int32_t libc_unix_bsd_pthreadCancel(void* thread);
int32_t libc_unix_bsd_pthreadKill(void* thread, int32_t sig);
int32_t libc_unix_bsd_schedGetPriorityMin(int32_t policy);
int32_t libc_unix_bsd_schedGetPriorityMax(int32_t policy);
int32_t libc_unix_bsd_semUnlink(const char* name);
int32_t libc_unix_bsd_getpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_bsd_getpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_bsd_sigwait(void* set, void* sig);
int32_t libc_unix_bsd_pthreadAtfork(void* prepare, void* parent, void* child);
void* libc_unix_bsd_getgrgid(uint16_t gid);
void* libc_unix_bsd_popen(const char* command, const char* mode);
int32_t libc_unix_bsd_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
int32_t libc_unix_bsd_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_unix_bsd_acct(const char* filename);
int32_t libc_unix_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libc_unix_bsd_getitimer(int32_t which, void* curr_value);
int32_t libc_unix_bsd_setitimer(int32_t which, void* new_value, void* old_value);
int32_t libc_unix_bsd_regcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libc_unix_bsd_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libc_unix_bsd_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size);
void libc_unix_bsd_regfree(void* preg);
uint32_t libc_unix_bsd_arc4random(void);
void libc_unix_bsd_arc4randomBuf(void* buf, uint64_t size);
uint32_t libc_unix_bsd_arc4randomUniform(uint32_t l);
double libc_unix_bsd_drand48(void);
double libc_unix_bsd_erand48(void* xseed);
int64_t libc_unix_bsd_lrand48(void);
int64_t libc_unix_bsd_nrand48(void* xseed);
int64_t libc_unix_bsd_mrand48(void);
int64_t libc_unix_bsd_jrand48(void* xseed);
void libc_unix_bsd_srand48(int64_t seed);
void* libc_unix_bsd_seed48(void* xseed);
void libc_unix_bsd_lcong48(void* p);
int32_t libc_unix_bsd_getoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
uint64_t libc_unix_bsd_strftime(char* buf, uint64_t maxsize, const char* format, void* timeptr);
uint64_t libc_unix_bsd_strftimeL(char* buf, uint64_t maxsize, const char* format, void* timeptr, void* locale);
char* libc_unix_bsd_devname(int32_t dev, uint16_t mode_t);
int32_t libc_unix_bsd_issetugid(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_UNIX_BSD_WRAPPER_H */
