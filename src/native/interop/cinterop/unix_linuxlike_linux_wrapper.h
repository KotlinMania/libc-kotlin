#ifndef LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_getspnamR(const char* name, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
void* libc_unix_linuxlike_linux_mqOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_mqClose(void* mqd);
int32_t libc_unix_linuxlike_linux_mqUnlink(const char* name);
int64_t libc_unix_linuxlike_linux_mqReceive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio);
int64_t libc_unix_linuxlike_linux_mqTimedreceive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout);
int32_t libc_unix_linuxlike_linux_mqSend(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio);
int32_t libc_unix_linuxlike_linux_mqTimedsend(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout);
int32_t libc_unix_linuxlike_linux_mqGetattr(void* mqd, void* attr);
int32_t libc_unix_linuxlike_linux_mqSetattr(void* mqd, void* newattr, void* oldattr);
int64_t libc_unix_linuxlike_linux_mrand48(void);
void* libc_unix_linuxlike_linux_seed48(void* xseed);
void libc_unix_linuxlike_linux_lcong48(void* p);
int32_t libc_unix_linuxlike_linux_lutimes(const char* file, void* times);
int32_t libc_unix_linuxlike_linux_shmOpen(const char* name, int32_t oflag, uint32_t mode);
int32_t libc_unix_linuxlike_linux_shmUnlink(const char* name);
int32_t libc_unix_linuxlike_linux_ftok(const char* pathname, int32_t proj_id);
int32_t libc_unix_linuxlike_linux_semget(int32_t key, int32_t nsems, int32_t semflag);
int32_t libc_unix_linuxlike_linux_semop(int32_t semid, void* sops, uint64_t nsops);
int32_t libc_unix_linuxlike_linux_semctl(int32_t semid, int32_t semnum, int32_t cmd, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_msgctl(int32_t msqid, int32_t cmd, void* buf);
int32_t libc_unix_linuxlike_linux_msgget(int32_t key, int32_t msgflg);
int64_t libc_unix_linuxlike_linux_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libc_unix_linuxlike_linux_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg);
int32_t libc_unix_linuxlike_linux_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_unix_linuxlike_linux_posixFallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libc_unix_linuxlike_linux_readahead(int32_t fd, int64_t offset, uint64_t count);
int64_t libc_unix_linuxlike_linux_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_linuxlike_linux_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_linuxlike_linux_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_unix_linuxlike_linux_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_unix_linuxlike_linux_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libc_unix_linuxlike_linux_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_unix_linuxlike_linux_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_linuxlike_linux_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_linuxlike_linux_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_unix_linuxlike_linux_removexattr(const char* path, const char* name);
int32_t libc_unix_linuxlike_linux_lremovexattr(const char* path, const char* name);
int32_t libc_unix_linuxlike_linux_fremovexattr(int32_t filedes, const char* name);
int32_t libc_unix_linuxlike_linux_signalfd(int32_t fd, void* mask, int32_t flags);
int32_t libc_unix_linuxlike_linux_timerfdCreate(int32_t clockid, int32_t flags);
int32_t libc_unix_linuxlike_linux_timerfdGettime(int32_t fd, void* curr_value);
int32_t libc_unix_linuxlike_linux_timerfdSettime(int32_t fd, int32_t flags, void* new_value, void* old_value);
int32_t libc_unix_linuxlike_linux_quotactl(int32_t cmd, const char* special, int32_t id, char* data);
int32_t libc_unix_linuxlike_linux_epollPwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libc_unix_linuxlike_linux_dup3(int32_t oldfd, int32_t newfd, int32_t flags);
int32_t libc_unix_linuxlike_linux_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_unix_linuxlike_linux_sigwaitinfo(void* set, void* info);
int32_t libc_unix_linuxlike_linux_accept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libc_unix_linuxlike_linux_reboot(int32_t how_to);
int32_t libc_unix_linuxlike_linux_setfsgid(uint16_t gid);
int32_t libc_unix_linuxlike_linux_setfsuid(uint16_t uid);
int32_t libc_unix_linuxlike_linux_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libc_unix_linuxlike_linux_syncFileRange(int32_t fd, int64_t offset, int64_t nbytes, uint32_t flags);
int32_t libc_unix_linuxlike_linux_posixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_linuxlike_linux_remapFilePages(void* addr, uint64_t size, int32_t prot, uint64_t pgoff, int32_t flags);
int32_t libc_unix_linuxlike_linux_mkstemps(char* arg_0_template, int32_t suffixlen);
int32_t libc_unix_linuxlike_linux_vhangup(void);
void libc_unix_linuxlike_linux_sync(void);
int32_t libc_unix_linuxlike_linux_syncfs(int32_t fd);
int64_t libc_unix_linuxlike_linux_syscall(int64_t num, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_schedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_unix_linuxlike_linux_epollCreate(int32_t size);
int32_t libc_unix_linuxlike_linux_epollCreate1(int32_t flags);
int32_t libc_unix_linuxlike_linux_epollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_unix_linuxlike_linux_epollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_unix_linuxlike_linux_unshare(int32_t flags);
int32_t libc_unix_linuxlike_linux_umount(const char* target);
int64_t libc_unix_linuxlike_linux_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags);
int64_t libc_unix_linuxlike_linux_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags);
int32_t libc_unix_linuxlike_linux_eventfd(uint32_t initval, int32_t flags);
int32_t libc_unix_linuxlike_linux_eventfdRead(int32_t fd, void* value);
int32_t libc_unix_linuxlike_linux_eventfdWrite(int32_t fd, uint64_t value);
int32_t libc_unix_linuxlike_linux_schedRrGetInterval(int32_t pid, void* tp);
int32_t libc_unix_linuxlike_linux_schedSetparam(int32_t pid, void* param);
int32_t libc_unix_linuxlike_linux_setns(int32_t fd, int32_t nstype);
int32_t libc_unix_linuxlike_linux_swapoff(const char* path);
int64_t libc_unix_linuxlike_linux_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags);
int32_t libc_unix_linuxlike_linux_personality(uint64_t persona);
int32_t libc_unix_linuxlike_linux_schedGetparam(int32_t pid, void* param);
int32_t libc_unix_linuxlike_linux_clone(void* cb, void* child_stack, int32_t flags, void* arg, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_schedGetscheduler(int32_t pid);
int32_t libc_unix_linuxlike_linux_clockNanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_unix_linuxlike_linux_umount2(const char* target, int32_t flags);
int32_t libc_unix_linuxlike_linux_swapon(const char* path, int32_t swapflags);
int32_t libc_unix_linuxlike_linux_schedSetscheduler(int32_t pid, int32_t policy, void* param);
int64_t libc_unix_linuxlike_linux_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
int32_t libc_unix_linuxlike_linux_sigaltstack(void* ss, void* oss);
int32_t libc_unix_linuxlike_linux_getdtablesize(void);
int32_t libc_unix_linuxlike_linux_getgrouplist(const char* user, uint16_t group, void* groups, void* ngroups);
int32_t libc_unix_linuxlike_linux_posixSpawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_unix_linuxlike_linux_posixSpawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp);
int32_t libc_unix_linuxlike_linux_posixSpawnattrInit(void* attr);
int32_t libc_unix_linuxlike_linux_posixSpawnattrDestroy(void* attr);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(void* attr, void* arg_1_default);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(void* attr, void* arg_1_default);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(void* attr, void* arg_1_default);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(void* attr, void* arg_1_default);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetflags(void* attr, void* flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetflags(void* attr, int16_t flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(void* attr, void* flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(void* attr, int32_t flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(void* attr, void* flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(void* attr, int32_t flags);
int32_t libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(void* attr, void* param);
int32_t libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(void* attr, void* param);
int32_t libc_unix_linuxlike_linux_posixSpawnFileActionsInit(void* actions);
int32_t libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(void* actions);
int32_t libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(void* actions, int32_t fd);
int32_t libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd);
uint64_t libc_unix_linuxlike_linux_freadUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libc_unix_linuxlike_linux_inotifyRmWatch(int32_t fd, int32_t wd);
int32_t libc_unix_linuxlike_linux_inotifyInit(void);
int32_t libc_unix_linuxlike_linux_inotifyInit1(int32_t flags);
int32_t libc_unix_linuxlike_linux_inotifyAddWatch(int32_t fd, const char* path, uint32_t mask);
int32_t libc_unix_linuxlike_linux_fanotifyInit(uint32_t flags, uint32_t event_f_flags);
int64_t libc_unix_linuxlike_linux_gethostid(void);
int32_t libc_unix_linuxlike_linux_klogctl(int32_t syslog_type, char* bufp, int32_t len);
int32_t libc_unix_linuxlike_linux_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libc_unix_linuxlike_linux_fgetpos64(void* stream, void* ptr);
void* libc_unix_linuxlike_linux_fopen64(const char* filename, const char* mode);
int32_t libc_unix_linuxlike_linux_posixFallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libc_unix_linuxlike_linux_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count);
void* libc_unix_linuxlike_linux_tmpfile64(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H */
