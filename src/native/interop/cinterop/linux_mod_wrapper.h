#ifndef LIBC_LINUX_MOD_LINUX_MOD_WRAPPER_H
#define LIBC_LINUX_MOD_LINUX_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_linux_mod_getspnam_r(const char* name, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
int32_t libc_linux_mod_mq_close(int32_t mqd);
int32_t libc_linux_mod_mq_unlink(const char* name);
int64_t libc_linux_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio);
int64_t libc_linux_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout);
int32_t libc_linux_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio);
int32_t libc_linux_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout);
int32_t libc_linux_mod_mq_getattr(int32_t mqd, void* attr);
int32_t libc_linux_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr);
int64_t libc_linux_mod_mrand48(void);
void* libc_linux_mod_seed48(void* xseed);
void libc_linux_mod_lcong48(void* p);
int32_t libc_linux_mod_lutimes(const char* file, void* times);
int32_t libc_linux_mod_shm_open(const char* name, int32_t oflag, uint32_t mode);
int32_t libc_linux_mod_shm_unlink(const char* name);
int32_t libc_linux_mod_ftok(const char* pathname, int32_t proj_id);
int32_t libc_linux_mod_semget(int32_t key, int32_t nsems, int32_t semflag);
int32_t libc_linux_mod_semop(int32_t semid, void* sops, uint64_t nsops);
int32_t libc_linux_mod_msgctl(int32_t msqid, int32_t cmd, void* buf);
int32_t libc_linux_mod_msgget(int32_t key, int32_t msgflg);
int64_t libc_linux_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libc_linux_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg);
int32_t libc_linux_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_linux_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libc_linux_mod_readahead(int32_t fd, int64_t offset, uint64_t count);
int64_t libc_linux_mod_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_linux_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_linux_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_linux_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_linux_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_linux_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_linux_mod_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_linux_mod_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_linux_mod_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_linux_mod_removexattr(const char* path, const char* name);
int32_t libc_linux_mod_lremovexattr(const char* path, const char* name);
int32_t libc_linux_mod_fremovexattr(int32_t filedes, const char* name);
int32_t libc_linux_mod_signalfd(int32_t fd, void* mask, int32_t flags);
int32_t libc_linux_mod_timerfd_create(int32_t clockid, int32_t flags);
int32_t libc_linux_mod_timerfd_gettime(int32_t fd, void* curr_value);
int32_t libc_linux_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value);
int32_t libc_linux_mod_quotactl(int32_t cmd, const char* special, int32_t id, char* data);
int32_t libc_linux_mod_epoll_pwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libc_linux_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags);
int32_t libc_linux_mod_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_linux_mod_sigwaitinfo(void* set, void* info);
int32_t libc_linux_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libc_linux_mod_reboot(int32_t how_to);
int32_t libc_linux_mod_setfsgid(uint32_t gid);
int32_t libc_linux_mod_setfsuid(uint32_t uid);
int32_t libc_linux_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libc_linux_mod_sync_file_range(int32_t fd, int64_t offset, int64_t nbytes, uint32_t flags);
int32_t libc_linux_mod_posix_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_linux_mod_remap_file_pages(void* addr, uint64_t size, int32_t prot, uint64_t pgoff, int32_t flags);
int32_t libc_linux_mod_mkstemps(char* template, int32_t suffixlen);
int32_t libc_linux_mod_vhangup(void);
void libc_linux_mod_sync(void);
int32_t libc_linux_mod_syncfs(int32_t fd);
int32_t libc_linux_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_linux_mod_epoll_create(int32_t size);
int32_t libc_linux_mod_epoll_create1(int32_t flags);
int32_t libc_linux_mod_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_linux_mod_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_linux_mod_unshare(int32_t flags);
int32_t libc_linux_mod_umount(const char* target);
int64_t libc_linux_mod_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags);
int64_t libc_linux_mod_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags);
int32_t libc_linux_mod_eventfd(uint32_t initval, int32_t flags);
int32_t libc_linux_mod_eventfd_read(int32_t fd, void* value);
int32_t libc_linux_mod_eventfd_write(int32_t fd, uint64_t value);
int32_t libc_linux_mod_sched_rr_get_interval(int32_t pid, void* tp);
int32_t libc_linux_mod_sched_setparam(int32_t pid, void* param);
int32_t libc_linux_mod_setns(int32_t fd, int32_t nstype);
int32_t libc_linux_mod_swapoff(const char* path);
int64_t libc_linux_mod_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags);
int32_t libc_linux_mod_personality(uint64_t persona);
int32_t libc_linux_mod_sched_getparam(int32_t pid, void* param);
int32_t libc_linux_mod_sched_getscheduler(int32_t pid);
int32_t libc_linux_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_linux_mod_umount2(const char* target, int32_t flags);
int32_t libc_linux_mod_swapon(const char* path, int32_t swapflags);
int32_t libc_linux_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param);
int64_t libc_linux_mod_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int32_t libc_linux_mod_sigaltstack(void* ss, void* oss);
int32_t libc_linux_mod_getdtablesize(void);
int32_t libc_linux_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups);
int32_t libc_linux_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_linux_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_linux_mod_posix_spawnattr_init(void* attr);
int32_t libc_linux_mod_posix_spawnattr_destroy(void* attr);
int32_t libc_linux_mod_posix_spawnattr_getsigdefault(void* attr, void* default);
int32_t libc_linux_mod_posix_spawnattr_setsigdefault(void* attr, void* default);
int32_t libc_linux_mod_posix_spawnattr_getsigmask(void* attr, void* default);
int32_t libc_linux_mod_posix_spawnattr_setsigmask(void* attr, void* default);
int32_t libc_linux_mod_posix_spawnattr_getflags(void* attr, void* flags);
int32_t libc_linux_mod_posix_spawnattr_setflags(void* attr, int16_t flags);
int32_t libc_linux_mod_posix_spawnattr_getpgroup(void* attr, void* flags);
int32_t libc_linux_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags);
int32_t libc_linux_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags);
int32_t libc_linux_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags);
int32_t libc_linux_mod_posix_spawnattr_getschedparam(void* attr, void* param);
int32_t libc_linux_mod_posix_spawnattr_setschedparam(void* attr, void* param);
int32_t libc_linux_mod_posix_spawn_file_actions_init(void* actions);
int32_t libc_linux_mod_posix_spawn_file_actions_destroy(void* actions);
int32_t libc_linux_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libc_linux_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd);
int32_t libc_linux_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd);
uint64_t libc_linux_mod_fread_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libc_linux_mod_inotify_rm_watch(int32_t fd, int32_t wd);
int32_t libc_linux_mod_inotify_init(void);
int32_t libc_linux_mod_inotify_init1(int32_t flags);
int32_t libc_linux_mod_inotify_add_watch(int32_t fd, const char* path, uint32_t mask);
int32_t libc_linux_mod_fanotify_init(uint32_t flags, uint32_t event_f_flags);
int64_t libc_linux_mod_gethostid(void);
int32_t libc_linux_mod_klogctl(int32_t syslog_type, char* bufp, int32_t len);
int32_t libc_linux_mod_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_linux_mod_fgetpos64(void* stream, void* ptr);
void* libc_linux_mod_fopen64(const char* filename, const char* mode);
int32_t libc_linux_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libc_linux_mod_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
void* libc_linux_mod_tmpfile64(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_LINUX_MOD_LINUX_MOD_WRAPPER_H */
