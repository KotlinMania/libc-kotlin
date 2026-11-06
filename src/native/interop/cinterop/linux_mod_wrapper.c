#include "linux_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#if defined(__linux__)
#include <sys/epoll.h>
#endif

int32_t libc_linux_mod_getspnam_r(const char* name, void* spbuf, char* buf, uint64_t buflen, void* spbufp) {
    return (int32_t)getspnam_r(name, spbuf, buf, buflen, spbufp);
}

int32_t libc_linux_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_linux_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_linux_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int64_t libc_linux_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_linux_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_linux_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_linux_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_linux_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int64_t libc_linux_mod_mrand48(void) {
    return (int64_t)mrand48();
}

void* libc_linux_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_linux_mod_lcong48(void* p) {
    lcong48(p);
}

int32_t libc_linux_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int32_t libc_linux_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_linux_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

int32_t libc_linux_mod_ftok(const char* pathname, int32_t proj_id) {
    return (int32_t)ftok(pathname, proj_id);
}

int32_t libc_linux_mod_semget(int32_t key, int32_t nsems, int32_t semflag) {
    return (int32_t)semget(key, nsems, semflag);
}

int32_t libc_linux_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int32_t libc_linux_mod_msgctl(int32_t msqid, int32_t cmd, void* buf) {
    return (int32_t)msgctl(msqid, cmd, buf);
}

int32_t libc_linux_mod_msgget(int32_t key, int32_t msgflg) {
    return (int32_t)msgget(key, msgflg);
}

int64_t libc_linux_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

int32_t libc_linux_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg) {
    return (int32_t)msgsnd(msqid, msgp, msgsz, msgflg);
}

int32_t libc_linux_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate(fd, mode, offset, len);
}

int32_t libc_linux_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int64_t libc_linux_mod_readahead(int32_t fd, int64_t offset, uint64_t count) {
    return (int64_t)readahead(fd, offset, count);
}

int64_t libc_linux_mod_getxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)getxattr(path, name, value, size);
}

int64_t libc_linux_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)lgetxattr(path, name, value, size);
}

int64_t libc_linux_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size) {
    return (int64_t)fgetxattr(filedes, name, value, size);
}

int32_t libc_linux_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)setxattr(path, name, value, size, flags);
}

int32_t libc_linux_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)lsetxattr(path, name, value, size, flags);
}

int32_t libc_linux_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)fsetxattr(filedes, name, value, size, flags);
}

int64_t libc_linux_mod_listxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)listxattr(path, list, size);
}

int64_t libc_linux_mod_llistxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)llistxattr(path, list, size);
}

int64_t libc_linux_mod_flistxattr(int32_t filedes, char* list, uint64_t size) {
    return (int64_t)flistxattr(filedes, list, size);
}

int32_t libc_linux_mod_removexattr(const char* path, const char* name) {
    return (int32_t)removexattr(path, name);
}

int32_t libc_linux_mod_lremovexattr(const char* path, const char* name) {
    return (int32_t)lremovexattr(path, name);
}

int32_t libc_linux_mod_fremovexattr(int32_t filedes, const char* name) {
    return (int32_t)fremovexattr(filedes, name);
}

int32_t libc_linux_mod_signalfd(int32_t fd, void* mask, int32_t flags) {
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

int32_t libc_linux_mod_timerfd_create(int32_t clockid, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clockid, flags);
#else
    (void)clockid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_mod_timerfd_gettime(int32_t fd, void* curr_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, curr_value);
#else
    (void)fd;
    (void)curr_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
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

int32_t libc_linux_mod_quotactl(int32_t cmd, const char* special, int32_t id, char* data) {
    return (int32_t)quotactl(cmd, special, id, data);
}

int32_t libc_linux_mod_epoll_pwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask) {
    return (int32_t)epoll_pwait(epfd, events, maxevents, timeout, sigmask);
}

int32_t libc_linux_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags) {
    return (int32_t)dup3(oldfd, newfd, flags);
}

int32_t libc_linux_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_linux_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_linux_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg) {
    return (int32_t)accept4(fd, addr, len, flg);
}

int32_t libc_linux_mod_reboot(int32_t how_to) {
    return (int32_t)reboot(how_to);
}

int32_t libc_linux_mod_setfsgid(uint32_t gid) {
    return (int32_t)setfsgid(gid);
}

int32_t libc_linux_mod_setfsuid(uint32_t uid) {
    return (int32_t)setfsuid(uid);
}

int32_t libc_linux_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_linux_mod_sync_file_range(int32_t fd, int64_t offset, int64_t nbytes, uint32_t flags) {
    return (int32_t)sync_file_range(fd, offset, nbytes, flags);
}

int32_t libc_linux_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_linux_mod_remap_file_pages(void* addr, uint64_t size, int32_t prot, uint64_t pgoff, int32_t flags) {
    return (int32_t)remap_file_pages(addr, size, prot, pgoff, flags);
}

int32_t libc_linux_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_linux_mod_vhangup(void) {
    return (int32_t)vhangup();
}

void libc_linux_mod_sync(void) {
    sync();
}

int32_t libc_linux_mod_syncfs(int32_t fd) {
    return (int32_t)syncfs(fd);
}

int32_t libc_linux_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_linux_mod_epoll_create(int32_t size) {
#if defined(__linux__)
    return (int32_t)epoll_create(size);
#else
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_mod_epoll_create1(int32_t flags) {
#if defined(__linux__)
    return (int32_t)epoll_create1(flags);
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout) {
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

int32_t libc_linux_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event) {
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

int32_t libc_linux_mod_unshare(int32_t flags) {
    return (int32_t)unshare(flags);
}

int32_t libc_linux_mod_umount(const char* target) {
    return (int32_t)umount(target);
}

int64_t libc_linux_mod_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags) {
    return (int64_t)tee(fd_in, fd_out, len, flags);
}

int64_t libc_linux_mod_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags) {
    return (int64_t)splice(fd_in, off_in, fd_out, off_out, len, flags);
}

int32_t libc_linux_mod_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_linux_mod_eventfd_read(int32_t fd, void* value) {
    return (int32_t)eventfd_read(fd, value);
}

int32_t libc_linux_mod_eventfd_write(int32_t fd, uint64_t value) {
    return (int32_t)eventfd_write(fd, value);
}

int32_t libc_linux_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_linux_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_linux_mod_setns(int32_t fd, int32_t nstype) {
    return (int32_t)setns(fd, nstype);
}

int32_t libc_linux_mod_swapoff(const char* path) {
    return (int32_t)swapoff(path);
}

int64_t libc_linux_mod_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags) {
    return (int64_t)vmsplice(fd, iov, nr_segs, flags);
}

int32_t libc_linux_mod_personality(uint64_t persona) {
    return (int32_t)personality(persona);
}

int32_t libc_linux_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_linux_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_linux_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_linux_mod_umount2(const char* target, int32_t flags) {
    return (int32_t)umount2(target, flags);
}

int32_t libc_linux_mod_swapon(const char* path, int32_t swapflags) {
    return (int32_t)swapon(path, swapflags);
}

int32_t libc_linux_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int64_t libc_linux_mod_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile(out_fd, in_fd, offset, count);
}

int32_t libc_linux_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_linux_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_linux_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

int32_t libc_linux_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_linux_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_linux_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_linux_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_linux_mod_posix_spawnattr_getsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_linux_mod_posix_spawnattr_setsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_linux_mod_posix_spawnattr_getsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_linux_mod_posix_spawnattr_setsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_linux_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_linux_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_linux_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_linux_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_linux_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_linux_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_linux_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_linux_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

uint64_t libc_linux_mod_fread_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread_unlocked(buf, size, nobj, (FILE*)stream);
}

int32_t libc_linux_mod_inotify_rm_watch(int32_t fd, int32_t wd) {
    return (int32_t)inotify_rm_watch(fd, wd);
}

int32_t libc_linux_mod_inotify_init(void) {
    return (int32_t)inotify_init();
}

int32_t libc_linux_mod_inotify_init1(int32_t flags) {
    return (int32_t)inotify_init1(flags);
}

int32_t libc_linux_mod_inotify_add_watch(int32_t fd, const char* path, uint32_t mask) {
    return (int32_t)inotify_add_watch(fd, path, mask);
}

int32_t libc_linux_mod_fanotify_init(uint32_t flags, uint32_t event_f_flags) {
    return (int32_t)fanotify_init(flags, event_f_flags);
}

int64_t libc_linux_mod_gethostid(void) {
    return (int64_t)gethostid();
}

int32_t libc_linux_mod_klogctl(int32_t syslog_type, char* bufp, int32_t len) {
    return (int32_t)klogctl(syslog_type, bufp, len);
}

int32_t libc_linux_mod_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate64(fd, mode, offset, len);
}

int32_t libc_linux_mod_fgetpos64(void* stream, void* ptr) {
    return (int32_t)fgetpos64((FILE*)stream, ptr);
}

void* libc_linux_mod_fopen64(const char* filename, const char* mode) {
    return (void*)fopen64(filename, mode);
}

int32_t libc_linux_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate64(fd, offset, len);
}

int64_t libc_linux_mod_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile64(out_fd, in_fd, offset, count);
}

void* libc_linux_mod_tmpfile64(void) {
    return (void*)tmpfile64();
}

