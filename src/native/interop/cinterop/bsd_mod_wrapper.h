#ifndef LIBC_BSD_MOD_BSD_MOD_WRAPPER_H
#define LIBC_BSD_MOD_BSD_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_bsd_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_bsd_mod_setrlimit(int32_t resource, void* rlim);
int32_t libc_bsd_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_bsd_mod_abs(int32_t i);
int64_t libc_bsd_mod_labs(int64_t i);
int32_t libc_bsd_mod_rand(void);
void libc_bsd_mod_srand(uint32_t seed);
int32_t libc_bsd_mod_getifaddrs(void* ifap);
void libc_bsd_mod_freeifaddrs(void* ifa);
int32_t libc_bsd_mod_setgroups(int32_t ngroups, void* ptr);
int32_t libc_bsd_mod_setlogin(const char* name);
int32_t libc_bsd_mod_kqueue(void);
int32_t libc_bsd_mod_unmount(const char* target, int32_t arg);
void* libc_bsd_mod_getpwent(void);
void libc_bsd_mod_setpwent(void);
void libc_bsd_mod_endpwent(void);
void libc_bsd_mod_endgrent(void);
void* libc_bsd_mod_getgrent(void);
const char* libc_bsd_mod_getprogname(void);
void libc_bsd_mod_setprogname(const char* name);
int32_t libc_bsd_mod_getloadavg(void* loadavg, int32_t nelem);
void* libc_bsd_mod_if_nameindex(void);
void libc_bsd_mod_if_freenameindex(void* ptr);
int32_t libc_bsd_mod_getpeereid(int32_t socket, void* euid, void* egid);
int32_t libc_bsd_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_bsd_mod_globfree(void* pglob);
int32_t libc_bsd_mod_posix_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_bsd_mod_shm_unlink(const char* name);
void libc_bsd_mod_seekdir(void* dirp, int64_t loc);
int64_t libc_bsd_mod_telldir(void* dirp);
int32_t libc_bsd_mod_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_bsd_mod_msync(void* addr, uint64_t len, int32_t flags);
int64_t libc_bsd_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libc_bsd_mod_mkstemps(char* template, int32_t suffixlen);
int32_t libc_bsd_mod_futimes(int32_t fd, void* times);
char* libc_bsd_mod_nl_langinfo(int32_t item);
int32_t libc_bsd_mod_bind(int32_t socket, void* address, uint32_t address_len);
int64_t libc_bsd_mod_writev(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_bsd_mod_readv(int32_t fd, void* iov, int32_t iovcnt);
int64_t libc_bsd_mod_sendmsg(int32_t fd, void* msg, int32_t flags);
int64_t libc_bsd_mod_recvmsg(int32_t fd, void* msg, int32_t flags);
void libc_bsd_mod_sync(void);
int32_t libc_bsd_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_bsd_mod_sigaltstack(void* ss, void* oss);
int32_t libc_bsd_mod_sigsuspend(void* mask);
int32_t libc_bsd_mod_sem_close(void* sem);
int32_t libc_bsd_mod_getdtablesize(void);
int32_t libc_bsd_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_bsd_mod_pthread_sigmask(int32_t how, void* set, void* oldset);
void* libc_bsd_mod_getgrnam(const char* name);
int32_t libc_bsd_mod_pthread_cancel(uint64_t thread);
int32_t libc_bsd_mod_pthread_kill(uint64_t thread, int32_t sig);
int32_t libc_bsd_mod_sched_get_priority_min(int32_t policy);
int32_t libc_bsd_mod_sched_get_priority_max(int32_t policy);
int32_t libc_bsd_mod_sem_unlink(const char* name);
int32_t libc_bsd_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_bsd_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_bsd_mod_sigwait(void* set, void* sig);
int32_t libc_bsd_mod_pthread_atfork(void* prepare, void* parent, void* child);
void* libc_bsd_mod_getgrgid(uint32_t gid);
void* libc_bsd_mod_popen(const char* command, const char* mode);
int32_t libc_bsd_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
int32_t libc_bsd_mod_pthread_create(void* native, void* attr, int32_t f, void* value);
int32_t libc_bsd_mod_acct(const char* filename);
int32_t libc_bsd_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage);
int32_t libc_bsd_mod_getitimer(int32_t which, void* curr_value);
int32_t libc_bsd_mod_setitimer(int32_t which, void* new_value, void* old_value);
int32_t libc_bsd_mod_regcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libc_bsd_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libc_bsd_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size);
void libc_bsd_mod_regfree(void* preg);
uint32_t libc_bsd_mod_arc4random(void);
void libc_bsd_mod_arc4random_buf(void* buf, uint64_t size);
uint32_t libc_bsd_mod_arc4random_uniform(uint32_t l);
double libc_bsd_mod_drand48(void);
double libc_bsd_mod_erand48(void* xseed);
int64_t libc_bsd_mod_lrand48(void);
int64_t libc_bsd_mod_nrand48(void* xseed);
int64_t libc_bsd_mod_mrand48(void);
int64_t libc_bsd_mod_jrand48(void* xseed);
void libc_bsd_mod_srand48(int64_t seed);
void* libc_bsd_mod_seed48(void* xseed);
void libc_bsd_mod_lcong48(void* p);
int32_t libc_bsd_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
uint64_t libc_bsd_mod_strftime(char* buf, uint64_t maxsize, const char* format, void* timeptr);
uint64_t libc_bsd_mod_strftime_l(char* buf, uint64_t maxsize, const char* format, void* timeptr, int32_t locale);
char* libc_bsd_mod_devname(int32_t dev, uint32_t mode_t);
int32_t libc_bsd_mod_issetugid(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_BSD_MOD_BSD_MOD_WRAPPER_H */
