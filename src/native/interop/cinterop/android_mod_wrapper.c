#include "android_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#include <dirent.h>
#endif
#if defined(__linux__)
#include <sys/epoll.h>
#endif

void libc_android_mod_setgrent(void) {
    setgrent();
}

void libc_android_mod_endgrent(void) {
    endgrent();
}

void* libc_android_mod_getgrent(void) {
    return (void*)getgrent();
}

int32_t libc_android_mod_getrlimit64(int32_t resource, void* rlim) {
    return (int32_t)getrlimit64(resource, rlim);
}

int32_t libc_android_mod_setrlimit64(int32_t resource, void* rlim) {
    return (int32_t)setrlimit64(resource, rlim);
}

int32_t libc_android_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_android_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_android_mod_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit) {
    return (int32_t)prlimit(pid, resource, new_limit, old_limit);
}

int32_t libc_android_mod_prlimit64(int32_t pid, int32_t resource, void* new_limit, void* old_limit) {
    return (int32_t)prlimit64(pid, resource, new_limit, old_limit);
}

int32_t libc_android_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_android_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_android_mod_mlock2(void* addr, uint64_t len, int32_t flags) {
    return (int32_t)mlock2(addr, len, flags);
}

int32_t libc_android_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_android_mod_msync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int64_t libc_android_mod_preadv(int32_t fd, void* iov, int32_t count, int64_t offset) {
    return (int64_t)preadv(fd, iov, count, offset);
}

int64_t libc_android_mod_pwritev(int32_t fd, void* iov, int32_t count, int64_t offset) {
    return (int64_t)pwritev(fd, iov, count, offset);
}

int64_t libc_android_mod_process_vm_readv(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags) {
    return (int64_t)process_vm_readv(pid, local_iov, local_iov_count, remote_iov, remote_iov_count, flags);
}

int64_t libc_android_mod_process_vm_writev(int32_t pid, void* local_iov, uint64_t local_iov_count, void* remote_iov, uint64_t remote_iov_count, uint64_t flags) {
    return (int64_t)process_vm_writev(pid, local_iov, local_iov_count, remote_iov, remote_iov_count, flags);
}

int32_t libc_android_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_android_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

void* libc_android_mod_sched_cpualloc(uint64_t count) {
    return (void*)__sched_cpualloc(count);
}

void libc_android_mod_sched_cpufree(void* set) {
    __sched_cpufree(set);
}

int32_t libc_android_mod_sched_cpucount(uint64_t setsize, void* set) {
    return (int32_t)__sched_cpucount(setsize, set);
}

int32_t libc_android_mod_sched_getcpu(void) {
    return (int32_t)sched_getcpu();
}

int32_t libc_android_mod_mallinfo(void) {
    return (int32_t)mallinfo();
}

int32_t libc_android_mod_malloc_info(int32_t options, void* stream) {
    return (int32_t)malloc_info(options, (FILE*)stream);
}

uint64_t libc_android_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

int32_t libc_android_mod_utmpname(const char* name) {
    return (int32_t)utmpname(name);
}

void libc_android_mod_setutent(void) {
    setutent();
}

void* libc_android_mod_getutent(void) {
    return (void*)getutent();
}

void libc_android_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_android_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_android_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate(fd, mode, offset, len);
}

int32_t libc_android_mod_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate64(fd, mode, offset, len);
}

int32_t libc_android_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_android_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate64(fd, offset, len);
}

int64_t libc_android_mod_getxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)getxattr(path, name, value, size);
}

int64_t libc_android_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)lgetxattr(path, name, value, size);
}

int64_t libc_android_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size) {
    return (int64_t)fgetxattr(filedes, name, value, size);
}

int32_t libc_android_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)setxattr(path, name, value, size, flags);
}

int32_t libc_android_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)lsetxattr(path, name, value, size, flags);
}

int32_t libc_android_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)fsetxattr(filedes, name, value, size, flags);
}

int64_t libc_android_mod_listxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)listxattr(path, list, size);
}

int64_t libc_android_mod_llistxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)llistxattr(path, list, size);
}

int64_t libc_android_mod_flistxattr(int32_t filedes, char* list, uint64_t size) {
    return (int64_t)flistxattr(filedes, list, size);
}

int32_t libc_android_mod_removexattr(const char* path, const char* name) {
    return (int32_t)removexattr(path, name);
}

int32_t libc_android_mod_lremovexattr(const char* path, const char* name) {
    return (int32_t)lremovexattr(path, name);
}

int32_t libc_android_mod_fremovexattr(int32_t filedes, const char* name) {
    return (int32_t)fremovexattr(filedes, name);
}

int32_t libc_android_mod_signalfd(int32_t fd, void* mask, int32_t flags) {
#if defined(__linux__)
    return (int32_t)signalfd(fd, mask, flags);
#else
    (void)fd;
    (void)mask;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_timerfd_create(int32_t clock, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clock, flags);
#else
    (void)clock;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_timerfd_gettime(int32_t fd, void* current_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, current_value);
#else
    (void)fd;
    (void)current_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
#if defined(__linux__)
    return (int32_t)timerfd_settime(fd, flags, new_value, old_value);
#else
    (void)fd;
    (void)flags;
    (void)new_value;
    (void)old_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_android_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_android_mod_epoll_create(int32_t size) {
#if defined(__linux__)
    return (int32_t)epoll_create(size);
#else
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_epoll_create1(int32_t flags) {
#if defined(__linux__)
    return (int32_t)epoll_create1(flags);
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout) {
#if defined(__linux__)
    return (int32_t)epoll_wait(epfd, events, maxevents, timeout);
#else
    (void)epfd;
    (void)events;
    (void)maxevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event) {
#if defined(__linux__)
    return (int32_t)epoll_ctl(epfd, op, fd, event);
#else
    (void)epfd;
    (void)op;
    (void)fd;
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_unshare(int32_t flags) {
    return (int32_t)unshare(flags);
}

int32_t libc_android_mod_umount(const char* target) {
    return (int32_t)umount(target);
}

int32_t libc_android_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int64_t libc_android_mod_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags) {
    return (int64_t)tee(fd_in, fd_out, len, flags);
}

int32_t libc_android_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int64_t libc_android_mod_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags) {
    return (int64_t)splice(fd_in, off_in, fd_out, off_out, len, flags);
}

int32_t libc_android_mod_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_eventfd_read(int32_t fd, void* value) {
    return (int32_t)eventfd_read(fd, value);
}

int32_t libc_android_mod_eventfd_write(int32_t fd, uint64_t value) {
    return (int32_t)eventfd_write(fd, value);
}

int32_t libc_android_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_android_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_android_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_android_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_android_mod_setns(int32_t fd, int32_t nstype) {
    return (int32_t)setns(fd, nstype);
}

int32_t libc_android_mod_swapoff(const char* puath) {
    return (int32_t)swapoff(puath);
}

int64_t libc_android_mod_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags) {
    return (int64_t)vmsplice(fd, iov, nr_segs, flags);
}

int32_t libc_android_mod_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data) {
    return (int32_t)mount(src, target, fstype, flags, data);
}

int32_t libc_android_mod_personality(uint32_t persona) {
    return (int32_t)personality(persona);
}

int32_t libc_android_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_android_mod_ppoll(void* fds, uint32_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int32_t libc_android_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_android_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_android_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_android_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_android_mod_sysinfo(void* info) {
    return (int32_t)sysinfo(info);
}

int32_t libc_android_mod_umount2(const char* target, int32_t flags) {
    return (int32_t)umount2(target, flags);
}

int32_t libc_android_mod_swapon(const char* path, int32_t swapflags) {
    return (int32_t)swapon(path, swapflags);
}

int32_t libc_android_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int64_t libc_android_mod_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile(out_fd, in_fd, offset, count);
}

int64_t libc_android_mod_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile64(out_fd, in_fd, offset, count);
}

int32_t libc_android_mod_setfsgid(uint32_t gid) {
    return (int32_t)setfsgid(gid);
}

int32_t libc_android_mod_setfsuid(uint32_t uid) {
    return (int32_t)setfsuid(uid);
}

int32_t libc_android_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_android_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_android_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_android_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_android_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

void* libc_android_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_android_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_android_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_android_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_android_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

void* libc_android_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_android_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

int32_t libc_android_mod_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

void* libc_android_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_android_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

void* libc_android_mod_errno(void) {
    return (void*)__errno();
}

int32_t libc_android_mod_inotify_rm_watch(int32_t fd, uint32_t wd) {
    return (int32_t)inotify_rm_watch(fd, wd);
}

int32_t libc_android_mod_inotify_init(void) {
    return (int32_t)inotify_init();
}

int32_t libc_android_mod_inotify_init1(int32_t flags) {
    return (int32_t)inotify_init1(flags);
}

int32_t libc_android_mod_inotify_add_watch(int32_t fd, const char* path, uint32_t mask) {
    return (int32_t)inotify_add_watch(fd, path, mask);
}

int32_t libc_android_mod_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

int32_t libc_android_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_android_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_android_mod_regfree(void* preg) {
    regfree(preg);
}

void libc_android_mod_android_set_abort_message(const char* msg) {
    android_set_abort_message(msg);
}

int32_t libc_android_mod_gettid(void) {
    return (int32_t)gettid();
}

int32_t libc_android_mod_tgkill(int32_t tgid, int32_t tid, int32_t sig) {
    return (int32_t)tgkill(tgid, tid, sig);
}

uint64_t libc_android_mod_getauxval(uint64_t type_) {
    return (uint64_t)getauxval(type_);
}

int64_t libc_android_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

int32_t libc_android_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int32_t libc_android_mod_system_property_set(const char* __name, const char* __value) {
    return (int32_t)__system_property_set(__name, __value);
}

int32_t libc_android_mod_system_property_get(const char* __name, char* __value) {
    return (int32_t)__system_property_get(__name, __value);
}

void* libc_android_mod_system_property_find(const char* __name) {
    return (void*)__system_property_find(__name);
}

void* libc_android_mod_system_property_find_nth(uint32_t __n) {
    return (void*)__system_property_find_nth(__n);
}

int32_t libc_android_mod_system_property_foreach(int32_t __callback, void* __cookie) {
    return (int32_t)__system_property_foreach(__callback, __cookie);
}

int32_t libc_android_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

uint32_t libc_android_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

uint32_t libc_android_mod_arc4random_uniform(uint32_t __upper_bound) {
    return (uint32_t)arc4random_uniform(__upper_bound);
}

void libc_android_mod_arc4random_buf(void* __buf, uint64_t __n) {
    arc4random_buf(__buf, __n);
}

void* libc_android_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

char* libc_android_mod_dirname(const char* path) {
    return (char*)dirname(path);
}

char* libc_android_mod_basename(const char* path) {
    return (char*)basename(path);
}

int32_t libc_android_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

void libc_android_mod_sync(void) {
    sync();
}

int32_t libc_android_mod_syncfs(int32_t fd) {
    return (int32_t)syncfs(fd);
}

void* libc_android_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

uint64_t libc_android_mod_fread_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread_unlocked(buf, size, nobj, (FILE*)stream);
}

uint64_t libc_android_mod_fwrite_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite_unlocked(buf, size, nobj, (FILE*)stream);
}

int32_t libc_android_mod_fflush_unlocked(void* stream) {
    return (int32_t)fflush_unlocked((FILE*)stream);
}

char* libc_android_mod_fgets_unlocked(char* buf, int32_t size, void* stream) {
    return (char*)fgets_unlocked(buf, size, (FILE*)stream);
}

int32_t libc_android_mod_klogctl(int32_t syslog_type, char* bufp, int32_t len) {
    return (int32_t)klogctl(syslog_type, bufp, len);
}

int32_t libc_android_mod_memfd_create(const char* name, uint32_t flags) {
#if defined(__linux__)
    return (int32_t)memfd_create(name, flags);
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_android_mod_renameat2(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, uint32_t flags) {
    return (int32_t)renameat2(olddirfd, oldpath, newdirfd, newpath, flags);
}

