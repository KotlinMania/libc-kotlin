#ifndef LIBC_ANDROID_MOD_ANDROID_MOD_WRAPPER_H
#define LIBC_ANDROID_MOD_ANDROID_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_android_mod_setgrent(void);
void libc_android_mod_endgrent(void);
void* libc_android_mod_getgrent(void);
int32_t libc_android_mod_getrlimit64(int32_t resource, void* rlim);
int32_t libc_android_mod_setrlimit64(int32_t resource, void* rlim);
int32_t libc_android_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_android_mod_setrlimit(int32_t resource, void* rlim);
int32_t libc_android_mod_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_android_mod_prlimit64(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_android_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_android_mod_gettimeofday(void* tp, void* tz);
int32_t libc_android_mod_mlock2(void* addr, uint64_t len, int32_t flags);
int32_t libc_android_mod_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_android_mod_msync(void* addr, uint64_t len, int32_t flags);
int32_t libc_android_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_android_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int64_t libc_android_mod_preadv(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libc_android_mod_pwritev(int32_t fd, void* iov, int32_t count, int64_t offset);
int64_t libc_android_mod_process_vm_readv(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags);
int64_t libc_android_mod_process_vm_writev(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags);
int32_t libc_android_mod_getpriority(int32_t which, int32_t who);
int32_t libc_android_mod_setpriority(int32_t which, int32_t who, int32_t prio);
void* libc_android_mod_sched_cpualloc(uint64_t count);
void libc_android_mod_sched_cpufree(void* set);
int32_t libc_android_mod_sched_cpucount(uint64_t setsize, void* set);
int32_t libc_android_mod_sched_getcpu(void);
int32_t libc_android_mod_mallinfo(void);
int32_t libc_android_mod_malloc_info(int32_t options, void* stream);
uint64_t libc_android_mod_malloc_usable_size(void* ptr);
int32_t libc_android_mod_utmpname(const char* name);
void libc_android_mod_setutent(void);
void* libc_android_mod_getutent(void);
void libc_android_mod_seekdir(void* dirp, int64_t loc);
int64_t libc_android_mod_telldir(void* dirp);
int32_t libc_android_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_android_mod_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_android_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len);
int32_t libc_android_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libc_android_mod_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_android_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_android_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_android_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_android_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_android_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_android_mod_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_android_mod_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_android_mod_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_android_mod_removexattr(const char* path, const char* name);
int32_t libc_android_mod_lremovexattr(const char* path, const char* name);
int32_t libc_android_mod_fremovexattr(int32_t filedes, const char* name);
int32_t libc_android_mod_signalfd(int32_t fd, void* mask, int32_t flags);
int32_t libc_android_mod_timerfd_create(int32_t clock, int32_t flags);
int32_t libc_android_mod_timerfd_gettime(int32_t fd, void* current_value);
int32_t libc_android_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value);
int32_t libc_android_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_android_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_android_mod_epoll_create(int32_t size);
int32_t libc_android_mod_epoll_create1(int32_t flags);
int32_t libc_android_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_android_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_android_mod_unshare(int32_t flags);
int32_t libc_android_mod_umount(const char* target);
int32_t libc_android_mod_sched_get_priority_max(int32_t policy);
int64_t libc_android_mod_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags);
int32_t libc_android_mod_settimeofday(void* tv, void* tz);
int64_t libc_android_mod_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags);
int32_t libc_android_mod_eventfd(uint32_t initval, int32_t flags);
int32_t libc_android_mod_eventfd_read(int32_t fd, void* value);
int32_t libc_android_mod_eventfd_write(int32_t fd, uint64_t value);
int32_t libc_android_mod_sched_rr_get_interval(int32_t pid, void* tp);
int32_t libc_android_mod_sem_timedwait(void* sem, void* abstime);
int32_t libc_android_mod_sem_getvalue(void* sem, void* sval);
int32_t libc_android_mod_sched_setparam(int32_t pid, void* param);
int32_t libc_android_mod_setns(int32_t fd, int32_t nstype);
int32_t libc_android_mod_swapoff(const char* puath);
int64_t libc_android_mod_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags);
int32_t libc_android_mod_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data);
int32_t libc_android_mod_personality(uint32_t persona);
int32_t libc_android_mod_sched_getparam(int32_t pid, void* param);
int32_t libc_android_mod_ppoll(void* fds, uint32_t nfds, void* timeout, void* sigmask);
int32_t libc_android_mod_sched_getscheduler(int32_t pid);
int32_t libc_android_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_android_mod_sethostname(const char* name, uint64_t len);
int32_t libc_android_mod_sched_get_priority_min(int32_t policy);
int32_t libc_android_mod_sysinfo(void* info);
int32_t libc_android_mod_umount2(const char* target, int32_t flags);
int32_t libc_android_mod_swapon(const char* path, int32_t swapflags);
int32_t libc_android_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param);
int64_t libc_android_mod_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int64_t libc_android_mod_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int32_t libc_android_mod_setfsgid(uint32_t gid);
int32_t libc_android_mod_setfsuid(uint32_t uid);
int32_t libc_android_mod_sigsuspend(void* mask);
int32_t libc_android_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_android_mod_sigaltstack(void* ss, void* oss);
int32_t libc_android_mod_sem_close(void* sem);
int32_t libc_android_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
void* libc_android_mod_getgrnam(const char* name);
int32_t libc_android_mod_sem_unlink(const char* name);
int32_t libc_android_mod_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_android_mod_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_android_mod_sigwait(void* set, void* sig);
void* libc_android_mod_getgrgid(uint32_t gid);
int32_t libc_android_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups);
int32_t libc_android_mod_initgroups(const char* user, uint32_t group);
void* libc_android_mod_popen(const char* command, const char* mode);
int32_t libc_android_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags);
void* libc_android_mod_errno(void);
int32_t libc_android_mod_inotify_rm_watch(int32_t fd, uint32_t wd);
int32_t libc_android_mod_inotify_init(void);
int32_t libc_android_mod_inotify_init1(int32_t flags);
int32_t libc_android_mod_inotify_add_watch(int32_t fd, const char* path, uint32_t mask);
int32_t libc_android_mod_regcomp(void* preg, const char* pattern, int32_t cflags);
int32_t libc_android_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags);
uint64_t libc_android_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size);
void libc_android_mod_regfree(void* preg);
void libc_android_mod_android_set_abort_message(const char* msg);
int32_t libc_android_mod_gettid(void);
int32_t libc_android_mod_tgkill(int32_t tgid, int32_t tid, int32_t sig);
uint64_t libc_android_mod_getauxval(uint64_t type_);
int64_t libc_android_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_android_mod_getentropy(void* buf, uint64_t buflen);
int32_t libc_android_mod_system_property_set(const char* __name, const char* __value);
int32_t libc_android_mod_system_property_get(const char* __name, char* __value);
void* libc_android_mod_system_property_find(const char* __name);
void* libc_android_mod_system_property_find_nth(uint32_t __n);
int32_t libc_android_mod_system_property_foreach(int32_t __callback, void* __cookie);
int32_t libc_android_mod_dl_iterate_phdr(void* callback, void* data);
uint32_t libc_android_mod_arc4random(void);
uint32_t libc_android_mod_arc4random_uniform(uint32_t __upper_bound);
void libc_android_mod_arc4random_buf(void* __buf, uint64_t __n);
void* libc_android_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
char* libc_android_mod_dirname(const char* path);
char* libc_android_mod_basename(const char* path);
int32_t libc_android_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex);
void libc_android_mod_sync(void);
int32_t libc_android_mod_syncfs(int32_t fd);
void* libc_android_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
uint64_t libc_android_mod_fread_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
uint64_t libc_android_mod_fwrite_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libc_android_mod_fflush_unlocked(void* stream);
char* libc_android_mod_fgets_unlocked(char* buf, int32_t size, void* stream);
int32_t libc_android_mod_klogctl(int32_t syslog_type, char* bufp, int32_t len);
int32_t libc_android_mod_memfd_create(const char* name, uint32_t flags);
int32_t libc_android_mod_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_ANDROID_MOD_ANDROID_MOD_WRAPPER_H */
