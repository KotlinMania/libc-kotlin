#ifndef LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_l4re_shared_iopl(int32_t level);
int32_t libc_unix_linuxlike_linux_l4re_shared_ioperm(uint64_t from, uint64_t num, int32_t turn_on);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioRead(void* aiocbp);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioWrite(void* aiocbp);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioFsync(int32_t op, void* aiocbp);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioError(void* aiocbp);
int64_t libc_unix_linuxlike_linux_l4re_shared_aioReturn(void* aiocbp);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioSuspend(void* aiocb_list, int32_t nitems, void* timeout);
int32_t libc_unix_linuxlike_linux_l4re_shared_aioCancel(int32_t fd, void* aiocbp);
int32_t libc_unix_linuxlike_linux_l4re_shared_lioListio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp);
int64_t libc_unix_linuxlike_linux_l4re_shared_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_linuxlike_linux_l4re_shared_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_linuxlike_linux_l4re_shared_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_unix_linuxlike_linux_l4re_shared_getloadavg(void* loadavg, int32_t nelem);
int64_t libc_unix_linuxlike_linux_l4re_shared_processVmReadv(int32_t pid, void* local_iov, uint64_t liovcnt, void* remote_iov, uint64_t riovcnt, uint64_t flags);
int64_t libc_unix_linuxlike_linux_l4re_shared_processVmWritev(int32_t pid, void* local_iov, uint64_t liovcnt, void* remote_iov, uint64_t riovcnt, uint64_t flags);
int32_t libc_unix_linuxlike_linux_l4re_shared_futimes(int32_t fd, void* times);
int32_t libc_unix_linuxlike_linux_l4re_shared_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_linuxlike_linux_l4re_shared_abs(int32_t i);
int64_t libc_unix_linuxlike_linux_l4re_shared_labs(int64_t i);
int32_t libc_unix_linuxlike_linux_l4re_shared_rand(void);
void libc_unix_linuxlike_linux_l4re_shared_srand(uint32_t seed);
double libc_unix_linuxlike_linux_l4re_shared_drand48(void);
double libc_unix_linuxlike_linux_l4re_shared_erand48(void* xseed);
int64_t libc_unix_linuxlike_linux_l4re_shared_lrand48(void);
int64_t libc_unix_linuxlike_linux_l4re_shared_nrand48(void* xseed);
int64_t libc_unix_linuxlike_linux_l4re_shared_jrand48(void* xseed);
void libc_unix_linuxlike_linux_l4re_shared_srand48(int64_t seed);
void libc_unix_linuxlike_linux_l4re_shared_setpwent(void);
void libc_unix_linuxlike_linux_l4re_shared_endpwent(void);
void* libc_unix_linuxlike_linux_l4re_shared_getpwent(void);
void libc_unix_linuxlike_linux_l4re_shared_setgrent(void);
void libc_unix_linuxlike_linux_l4re_shared_endgrent(void);
void* libc_unix_linuxlike_linux_l4re_shared_getgrent(void);
void libc_unix_linuxlike_linux_l4re_shared_setspent(void);
void libc_unix_linuxlike_linux_l4re_shared_endspent(void);
void* libc_unix_linuxlike_linux_l4re_shared_getspent(void);
void* libc_unix_linuxlike_linux_l4re_shared_getspnam(const char* name);
int32_t libc_unix_linuxlike_linux_l4re_shared_shmget(int32_t key, uint64_t size, int32_t shmflg);
void* libc_unix_linuxlike_linux_l4re_shared_shmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libc_unix_linuxlike_linux_l4re_shared_shmdt(void* shmaddr);
int32_t libc_unix_linuxlike_linux_l4re_shared_shmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libc_unix_linuxlike_linux_l4re_shared_mprotect(void* addr, uint64_t len, int32_t prot);
void* libc_unix_linuxlike_linux_l4re_shared_errnoLocation(void);
void* libc_unix_linuxlike_linux_l4re_shared_mremap(void* addr, uint64_t len, uint64_t new_len, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_l4re_shared_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_unix_linuxlike_linux_l4re_shared_globfree(void* pglob);
void libc_unix_linuxlike_linux_l4re_shared_seekdir(void* dirp, int64_t loc);
int64_t libc_unix_linuxlike_linux_l4re_shared_telldir(void* dirp);
int32_t libc_unix_linuxlike_linux_l4re_shared_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_linuxlike_linux_l4re_shared_msync(void* addr, uint64_t len, int32_t flags);
int64_t libc_unix_linuxlike_linux_l4re_shared_recvfrom(int32_t arg_0_socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
char* libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(int32_t item);
char* libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(int32_t item, void* locale);
int32_t libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(int32_t policy);
int32_t libc_unix_linuxlike_linux_l4re_shared_settimeofday(void* tv, void* tz);
int32_t libc_unix_linuxlike_linux_l4re_shared_semTimedwait(void* sem, void* abstime);
int32_t libc_unix_linuxlike_linux_l4re_shared_semGetvalue(void* sem, void* sval);
int32_t libc_unix_linuxlike_linux_l4re_shared_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data);
int32_t libc_unix_linuxlike_linux_l4re_shared_prctl(int32_t option, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_l4re_shared_ppoll(void* fds, uint64_t nfds, void* timeout, void* sigmask);
int32_t libc_unix_linuxlike_linux_l4re_shared_sethostname(const char* name, uint64_t len);
int32_t libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(int32_t policy);
int32_t libc_unix_linuxlike_linux_l4re_shared_sysinfo(void* info);
int32_t libc_unix_linuxlike_linux_l4re_shared_sigsuspend(void* mask);
int32_t libc_unix_linuxlike_linux_l4re_shared_getgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_l4re_shared_semClose(void* sem);
int32_t libc_unix_linuxlike_linux_l4re_shared_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_linux_l4re_shared_initgroups(const char* user, uint16_t group);
void* libc_unix_linuxlike_linux_l4re_shared_semOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libc_unix_linuxlike_linux_l4re_shared_getgrnam(const char* name);
int32_t libc_unix_linuxlike_linux_l4re_shared_semUnlink(const char* name);
int32_t libc_unix_linuxlike_linux_l4re_shared_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_unix_linuxlike_linux_l4re_shared_sigwait(void* set, void* sig);
void* libc_unix_linuxlike_linux_l4re_shared_getgrgid(uint16_t gid);
void* libc_unix_linuxlike_linux_l4re_shared_popen(const char* command, const char* mode);
int32_t libc_unix_linuxlike_linux_l4re_shared_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
int32_t libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(void* callback, void* data);
void* libc_unix_linuxlike_linux_l4re_shared_setmntent(const char* filename, const char* ty);
void* libc_unix_linuxlike_linux_l4re_shared_getmntent(void* stream);
int32_t libc_unix_linuxlike_linux_l4re_shared_addmntent(void* stream, void* mnt);
int32_t libc_unix_linuxlike_linux_l4re_shared_endmntent(void* streamp);
char* libc_unix_linuxlike_linux_l4re_shared_hasmntopt(void* mnt, const char* opt);
int32_t libc_unix_linuxlike_linux_l4re_shared_regcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libc_unix_linuxlike_linux_l4re_shared_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libc_unix_linuxlike_linux_l4re_shared_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size);
void libc_unix_linuxlike_linux_l4re_shared_regfree(void* preg);
void* libc_unix_linuxlike_linux_l4re_shared_iconvOpen(const char* tocode, const char* fromcode);
uint64_t libc_unix_linuxlike_linux_l4re_shared_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft);
int32_t libc_unix_linuxlike_linux_l4re_shared_iconvClose(void* cd);
int32_t libc_unix_linuxlike_linux_l4re_shared_gettid(void);
int32_t libc_unix_linuxlike_linux_l4re_shared_timerCreate(int32_t clockid, void* sevp, void* timerid);
int32_t libc_unix_linuxlike_linux_l4re_shared_timerDelete(void* timerid);
int32_t libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun(void* timerid);
int32_t libc_unix_linuxlike_linux_l4re_shared_timerGettime(void* timerid, void* curr_value);
int32_t libc_unix_linuxlike_linux_l4re_shared_timerSettime(void* timerid, int32_t flags, void* new_value, void* old_value);
void* libc_unix_linuxlike_linux_l4re_shared_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_unix_linuxlike_linux_l4re_shared_schedGetcpu(void);
int32_t libc_unix_linuxlike_linux_l4re_shared_getoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
int64_t libc_unix_linuxlike_linux_l4re_shared_copyFileRange(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags);
void* libc_unix_linuxlike_linux_l4re_shared_freopen64(const char* filename, const char* mode, void* file);
int32_t libc_unix_linuxlike_linux_l4re_shared_fseeko64(void* stream, int64_t offset, int32_t whence);
int32_t libc_unix_linuxlike_linux_l4re_shared_fsetpos64(void* stream, void* ptr);
int64_t libc_unix_linuxlike_linux_l4re_shared_ftello64(void* stream);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_UNIX_LINUXLIKE_LINUX_L4RE_SHARED_WRAPPER_H */
