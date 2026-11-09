#ifndef LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_unix_linuxlike_android_setgrent(void);
void libc_unix_linuxlike_android_endgrent(void);
void* libc_unix_linuxlike_android_getgrent(void);
int32_t libc_unix_linuxlike_android_getrlimit64(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_android_setrlimit64(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_android_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_android_setrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_android_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_unix_linuxlike_android_prlimit64(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_unix_linuxlike_android_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_linuxlike_android_gettimeofday(void* tp, void* tz);
int32_t libc_unix_linuxlike_android_mlock2(void* addr, uint64_t len, int32_t flags);
int32_t libc_unix_linuxlike_android_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_linuxlike_android_msync(void* addr, uint64_t len, int32_t flags);
int32_t libc_unix_linuxlike_android_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_linuxlike_android_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int64_t libc_unix_linuxlike_android_preadv(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libc_unix_linuxlike_android_pwritev(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libc_unix_linuxlike_android_processVmReadv(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags);
int64_t libc_unix_linuxlike_android_processVmWritev(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags);
int32_t libc_unix_linuxlike_android_getpriority(int32_t which, uint32_t who);
int32_t libc_unix_linuxlike_android_setpriority(int32_t which, uint32_t who, int32_t prio);
void* libc_unix_linuxlike_android_schedCpualloc(uint64_t count);
void libc_unix_linuxlike_android_schedCpufree(void* set);
int32_t libc_unix_linuxlike_android_schedCpucount(uint64_t setsize, void* set);
int32_t libc_unix_linuxlike_android_schedGetcpu(void);
int32_t libc_unix_linuxlike_android_mallocInfo(int32_t options, void* stream);
uint64_t libc_unix_linuxlike_android_mallocUsableSize(void* ptr);
int32_t libc_unix_linuxlike_android_utmpname(const char* name);
void libc_unix_linuxlike_android_setutent(void);
void* libc_unix_linuxlike_android_getutent(void);
void libc_unix_linuxlike_android_seekdir(void* dirp, int64_t loc);
int64_t libc_unix_linuxlike_android_telldir(void* dirp);
int32_t libc_unix_linuxlike_android_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_unix_linuxlike_android_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_unix_linuxlike_android_posixFallocate(int32_t fd, int64_t offset, int64_t len);
int32_t libc_unix_linuxlike_android_posixFallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libc_unix_linuxlike_android_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_linuxlike_android_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_linuxlike_android_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_unix_linuxlike_android_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_unix_linuxlike_android_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_unix_linuxlike_android_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_unix_linuxlike_android_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_linuxlike_android_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_linuxlike_android_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_unix_linuxlike_android_removexattr(const char* path, const char* name);
int32_t libc_unix_linuxlike_android_lremovexattr(const char* path, const char* name);
int32_t libc_unix_linuxlike_android_fremovexattr(int32_t filedes, const char* name);
int32_t libc_unix_linuxlike_android_signalfd(int32_t fd, void* mask, int32_t flags);
int32_t libc_unix_linuxlike_android_timerfdCreate(int32_t clock, int32_t flags);
int32_t libc_unix_linuxlike_android_timerfdGettime(int32_t fd, void* current_value);
int32_t libc_unix_linuxlike_android_timerfdSettime(int32_t fd, int32_t flags, void* new_value, void* old_value);
int32_t libc_unix_linuxlike_android_schedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_android_schedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_android_epollCreate(int32_t size);
int32_t libc_unix_linuxlike_android_epollCreate1(int32_t flags);
int32_t libc_unix_linuxlike_android_epollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_unix_linuxlike_android_epollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_unix_linuxlike_android_unshare(int32_t flags);
int32_t libc_unix_linuxlike_android_umount(const char* target);
int32_t libc_unix_linuxlike_android_schedGetPriorityMax(int32_t policy);
int64_t libc_unix_linuxlike_android_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags);
int32_t libc_unix_linuxlike_android_settimeofday(void* tv, void* tz);
int64_t libc_unix_linuxlike_android_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags);
int32_t libc_unix_linuxlike_android_eventfd(uint32_t initval, int32_t flags);
int32_t libc_unix_linuxlike_android_eventfdRead(int32_t fd, void* value);
int32_t libc_unix_linuxlike_android_eventfdWrite(int32_t fd, uint64_t value);
int32_t libc_unix_linuxlike_android_schedRrGetInterval(int32_t pid, void* tp);
int32_t libc_unix_linuxlike_android_semTimedwait(void* sem, void* abstime);
int32_t libc_unix_linuxlike_android_semGetvalue(void* sem, void* sval);
int32_t libc_unix_linuxlike_android_schedSetparam(int32_t pid, void* param);
int32_t libc_unix_linuxlike_android_setns(int32_t fd, int32_t nstype);
int32_t libc_unix_linuxlike_android_swapoff(const char* puath);
int64_t libc_unix_linuxlike_android_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags);
int32_t libc_unix_linuxlike_android_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data);
int32_t libc_unix_linuxlike_android_personality(uint32_t persona);
int32_t libc_unix_linuxlike_android_schedGetparam(int32_t pid, void* param);
int32_t libc_unix_linuxlike_android_ppoll(void* fds, uint32_t nfds, void* timeout, void* sigmask);
int32_t libc_unix_linuxlike_android_schedGetscheduler(int32_t pid);
int32_t libc_unix_linuxlike_android_clockNanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_unix_linuxlike_android_sethostname(const char* name, uint64_t len);
int32_t libc_unix_linuxlike_android_schedGetPriorityMin(int32_t policy);
int32_t libc_unix_linuxlike_android_sysinfo(void* info);
int32_t libc_unix_linuxlike_android_umount2(const char* target, int32_t flags);
int32_t libc_unix_linuxlike_android_swapon(const char* path, int32_t swapflags);
int32_t libc_unix_linuxlike_android_schedSetscheduler(int32_t pid, int32_t policy, void* param);
int64_t libc_unix_linuxlike_android_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int64_t libc_unix_linuxlike_android_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int32_t libc_unix_linuxlike_android_setfsgid(uint16_t gid);
int32_t libc_unix_linuxlike_android_setfsuid(uint16_t uid);
int32_t libc_unix_linuxlike_android_sigsuspend(void* mask);
int32_t libc_unix_linuxlike_android_getgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_android_sigaltstack(void* ss, void* oss);
int32_t libc_unix_linuxlike_android_semClose(void* sem);
int32_t libc_unix_linuxlike_android_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
void* libc_unix_linuxlike_android_getgrnam(const char* name);
int32_t libc_unix_linuxlike_android_semUnlink(const char* name);
int32_t libc_unix_linuxlike_android_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_unix_linuxlike_android_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_unix_linuxlike_android_sigwait(void* set, void* sig);
void* libc_unix_linuxlike_android_getgrgid(uint16_t gid);
int32_t libc_unix_linuxlike_android_getgrouplist(const char* user, uint16_t group, void* groups, void* ngroups);
int32_t libc_unix_linuxlike_android_initgroups(const char* user, uint16_t group);
void* libc_unix_linuxlike_android_popen(const char* command, const char* mode);
int32_t libc_unix_linuxlike_android_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
void* libc_unix_linuxlike_android_errno(void);
int32_t libc_unix_linuxlike_android_inotifyRmWatch(int32_t fd, uint32_t wd);
int32_t libc_unix_linuxlike_android_inotifyInit(void);
int32_t libc_unix_linuxlike_android_inotifyInit1(int32_t flags);
int32_t libc_unix_linuxlike_android_inotifyAddWatch(int32_t fd, const char* path, uint32_t mask);
int32_t libc_unix_linuxlike_android_regcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libc_unix_linuxlike_android_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libc_unix_linuxlike_android_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size);
void libc_unix_linuxlike_android_regfree(void* preg);
void libc_unix_linuxlike_android_androidSetAbortMessage(const char* msg);
int32_t libc_unix_linuxlike_android_gettid(void);
int32_t libc_unix_linuxlike_android_tgkill(int32_t tgid, int32_t tid, int32_t sig);
uint64_t libc_unix_linuxlike_android_getauxval(uint64_t type_);
int64_t libc_unix_linuxlike_android_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_unix_linuxlike_android_getentropy(void* buf, uint64_t buflen);
int32_t libc_unix_linuxlike_android_systemPropertySet(const char* arg_0_name, const char* arg_1_value);
int32_t libc_unix_linuxlike_android_systemPropertyGet(const char* arg_0_name, char* arg_1_value);
void* libc_unix_linuxlike_android_systemPropertyFind(const char* arg_0_name);
void* libc_unix_linuxlike_android_systemPropertyFindNth(uint32_t arg_0_n);
int32_t libc_unix_linuxlike_android_systemPropertyForeach(void* arg_0_callback, void* arg_1_cookie);
int32_t libc_unix_linuxlike_android_dlIteratePhdr(void* callback, void* data);
uint32_t libc_unix_linuxlike_android_arc4random(void);
uint32_t libc_unix_linuxlike_android_arc4randomUniform(uint32_t arg_0_upper_bound);
void libc_unix_linuxlike_android_arc4randomBuf(void* arg_0_buf, uint64_t arg_1_n);
void* libc_unix_linuxlike_android_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
char* libc_unix_linuxlike_android_dirname(const char* path);
char* libc_unix_linuxlike_android_basename(const char* path);
int32_t libc_unix_linuxlike_android_getoptLong(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
void libc_unix_linuxlike_android_sync(void);
int32_t libc_unix_linuxlike_android_syncfs(int32_t fd);
void* libc_unix_linuxlike_android_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
uint64_t libc_unix_linuxlike_android_freadUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
uint64_t libc_unix_linuxlike_android_fwriteUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libc_unix_linuxlike_android_fflushUnlocked(void* stream);
char* libc_unix_linuxlike_android_fgetsUnlocked(char* buf, int32_t size, void* stream);
int32_t libc_unix_linuxlike_android_klogctl(int32_t syslog_type, char* bufp, int32_t len);
int32_t libc_unix_linuxlike_android_memfdCreate(const char* name, uint32_t flags);
int32_t libc_unix_linuxlike_android_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_ANDROID_UNIX_LINUXLIKE_ANDROID_WRAPPER_H */
