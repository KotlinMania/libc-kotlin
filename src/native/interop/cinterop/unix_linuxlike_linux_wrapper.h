#ifndef LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixLinuxlikeLinuxGetspnamR(const char* name, void* spbuf, char* buf, uint64_t buflen, void* spbufp);
void* libcUnixLinuxlikeLinuxMqOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxMqClose(void* mqd);
int32_t libcUnixLinuxlikeLinuxMqUnlink(const char* name);
int64_t libcUnixLinuxlikeLinuxMqReceive(void* mqd, char* msgPtr, uint64_t msgLen, void* msgPrio);
int64_t libcUnixLinuxlikeLinuxMqTimedreceive(void* mqd, char* msgPtr, uint64_t msgLen, void* msgPrio, void* absTimeout);
int32_t libcUnixLinuxlikeLinuxMqSend(void* mqd, const char* msgPtr, uint64_t msgLen, uint32_t msgPrio);
int32_t libcUnixLinuxlikeLinuxMqTimedsend(void* mqd, const char* msgPtr, uint64_t msgLen, uint32_t msgPrio, void* absTimeout);
int32_t libcUnixLinuxlikeLinuxMqGetattr(void* mqd, void* attr);
int32_t libcUnixLinuxlikeLinuxMqSetattr(void* mqd, void* newattr, void* oldattr);
int64_t libcUnixLinuxlikeLinuxMrand48(void);
void* libcUnixLinuxlikeLinuxSeed48(void* xseed);
void libcUnixLinuxlikeLinuxLcong48(void* p);
int32_t libcUnixLinuxlikeLinuxLutimes(const char* file, void* times);
int32_t libcUnixLinuxlikeLinuxShmOpen(const char* name, int32_t oflag, uint32_t mode);
int32_t libcUnixLinuxlikeLinuxShmUnlink(const char* name);
int32_t libcUnixLinuxlikeLinuxFtok(const char* pathname, int32_t projId);
int32_t libcUnixLinuxlikeLinuxSemget(int32_t key, int32_t nsems, int32_t semflag);
int32_t libcUnixLinuxlikeLinuxSemop(int32_t semid, void* sops, uint64_t nsops);
int32_t libcUnixLinuxlikeLinuxSemctl(int32_t semid, int32_t semnum, int32_t cmd, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxMsgctl(int32_t msqid, int32_t cmd, void* buf);
int32_t libcUnixLinuxlikeLinuxMsgget(int32_t key, int32_t msgflg);
int64_t libcUnixLinuxlikeLinuxMsgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libcUnixLinuxlikeLinuxMsgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg);
int32_t libcUnixLinuxlikeLinuxFallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libcUnixLinuxlikeLinuxPosixFallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libcUnixLinuxlikeLinuxReadahead(int32_t fd, int64_t offset, uint64_t count);
int64_t libcUnixLinuxlikeLinuxGetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libcUnixLinuxlikeLinuxLgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libcUnixLinuxlikeLinuxFgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libcUnixLinuxlikeLinuxSetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libcUnixLinuxlikeLinuxLsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags);
int32_t libcUnixLinuxlikeLinuxFsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libcUnixLinuxlikeLinuxListxattr(const char* path, char* list, uint64_t size);
int64_t libcUnixLinuxlikeLinuxLlistxattr(const char* path, char* list, uint64_t size);
int64_t libcUnixLinuxlikeLinuxFlistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libcUnixLinuxlikeLinuxRemovexattr(const char* path, const char* name);
int32_t libcUnixLinuxlikeLinuxLremovexattr(const char* path, const char* name);
int32_t libcUnixLinuxlikeLinuxFremovexattr(int32_t filedes, const char* name);
int32_t libcUnixLinuxlikeLinuxSignalfd(int32_t fd, void* mask, int32_t flags);
int32_t libcUnixLinuxlikeLinuxTimerfdCreate(int32_t clockid, int32_t flags);
int32_t libcUnixLinuxlikeLinuxTimerfdGettime(int32_t fd, void* currValue);
int32_t libcUnixLinuxlikeLinuxTimerfdSettime(int32_t fd, int32_t flags, void* newValue, void* oldValue);
int32_t libcUnixLinuxlikeLinuxQuotactl(int32_t cmd, const char* special, int32_t id, char* data);
int32_t libcUnixLinuxlikeLinuxEpollPwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libcUnixLinuxlikeLinuxDup3(int32_t oldfd, int32_t newfd, int32_t flags);
int32_t libcUnixLinuxlikeLinuxSigtimedwait(void* set, void* info, void* timeout);
int32_t libcUnixLinuxlikeLinuxSigwaitinfo(void* set, void* info);
int32_t libcUnixLinuxlikeLinuxAccept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libcUnixLinuxlikeLinuxReboot(int32_t howTo);
int32_t libcUnixLinuxlikeLinuxSetfsgid(uint16_t gid);
int32_t libcUnixLinuxlikeLinuxSetfsuid(uint16_t uid);
int32_t libcUnixLinuxlikeLinuxMkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libcUnixLinuxlikeLinuxSyncFileRange(int32_t fd, int64_t offset, int64_t nbytes, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxPosixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libcUnixLinuxlikeLinuxRemapFilePages(void* addr, uint64_t size, int32_t prot, uint64_t pgoff, int32_t flags);
int32_t libcUnixLinuxlikeLinuxMkstemps(char* arg0Template, int32_t suffixlen);
int32_t libcUnixLinuxlikeLinuxVhangup(void);
void libcUnixLinuxlikeLinuxSync(void);
int32_t libcUnixLinuxlikeLinuxSyncfs(int32_t fd);
int64_t libcUnixLinuxlikeLinuxSyscall(int64_t num, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxSchedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libcUnixLinuxlikeLinuxEpollCreate(int32_t size);
int32_t libcUnixLinuxlikeLinuxEpollCreate1(int32_t flags);
int32_t libcUnixLinuxlikeLinuxEpollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libcUnixLinuxlikeLinuxEpollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libcUnixLinuxlikeLinuxUnshare(int32_t flags);
int32_t libcUnixLinuxlikeLinuxUmount(const char* target);
int64_t libcUnixLinuxlikeLinuxTee(int32_t fdIn, int32_t fdOut, uint64_t len, uint32_t flags);
int64_t libcUnixLinuxlikeLinuxSplice(int32_t fdIn, void* offIn, int32_t fdOut, void* offOut, uint64_t len, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxEventfd(uint32_t initval, int32_t flags);
int32_t libcUnixLinuxlikeLinuxEventfdRead(int32_t fd, void* value);
int32_t libcUnixLinuxlikeLinuxEventfdWrite(int32_t fd, uint64_t value);
int32_t libcUnixLinuxlikeLinuxSchedRrGetInterval(int32_t pid, void* tp);
int32_t libcUnixLinuxlikeLinuxSchedSetparam(int32_t pid, void* param);
int32_t libcUnixLinuxlikeLinuxSetns(int32_t fd, int32_t nstype);
int32_t libcUnixLinuxlikeLinuxSwapoff(const char* path);
int64_t libcUnixLinuxlikeLinuxVmsplice(int32_t fd, void* iov, uint64_t nrSegs, uint32_t flags);
int32_t libcUnixLinuxlikeLinuxPersonality(uint64_t persona);
int32_t libcUnixLinuxlikeLinuxSchedGetparam(int32_t pid, void* param);
int32_t libcUnixLinuxlikeLinuxClone(void* cb, void* childStack, int32_t flags, void* arg, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixLinuxlikeLinuxSchedGetscheduler(int32_t pid);
int32_t libcUnixLinuxlikeLinuxClockNanosleep(int32_t clkId, int32_t flags, void* rqtp, void* rmtp);
int32_t libcUnixLinuxlikeLinuxUmount2(const char* target, int32_t flags);
int32_t libcUnixLinuxlikeLinuxSwapon(const char* path, int32_t swapflags);
int32_t libcUnixLinuxlikeLinuxSchedSetscheduler(int32_t pid, int32_t policy, void* param);
int64_t libcUnixLinuxlikeLinuxSendfile(int32_t outFd, int32_t inFd, void* offset, uint64_t count);
int32_t libcUnixLinuxlikeLinuxSigaltstack(void* ss, void* oss);
int32_t libcUnixLinuxlikeLinuxGetdtablesize(void);
int32_t libcUnixLinuxlikeLinuxGetgrouplist(const char* user, uint16_t group, void* groups, void* ngroups);
int32_t libcUnixLinuxlikeLinuxPosixSpawn(void* pid, const char* path, void* fileActions, void* attrp, void* argv, void* envp);
int32_t libcUnixLinuxlikeLinuxPosixSpawnp(void* pid, const char* file, void* fileActions, void* attrp, void* argv, void* envp);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrInit(void* attr);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(void* attr);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(void* attr, void* arg1Default);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(void* attr, void* arg1Default);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(void* attr, void* arg1Default);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(void* attr, void* arg1Default);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(void* attr, void* flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(void* attr, int16_t flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(void* attr, void* flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(void* attr, int32_t flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(void* attr, void* flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(void* attr, int32_t flags);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(void* attr, void* param);
int32_t libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(void* attr, void* param);
int32_t libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(void* actions);
int32_t libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(void* actions);
int32_t libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode);
int32_t libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(void* actions, int32_t fd);
int32_t libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(void* actions, int32_t fd, int32_t newfd);
uint64_t libcUnixLinuxlikeLinuxFreadUnlocked(void* buf, uint64_t size, uint64_t nobj, void* stream);
int32_t libcUnixLinuxlikeLinuxInotifyRmWatch(int32_t fd, int32_t wd);
int32_t libcUnixLinuxlikeLinuxInotifyInit(void);
int32_t libcUnixLinuxlikeLinuxInotifyInit1(int32_t flags);
int32_t libcUnixLinuxlikeLinuxInotifyAddWatch(int32_t fd, const char* path, uint32_t mask);
int32_t libcUnixLinuxlikeLinuxFanotifyInit(uint32_t flags, uint32_t eventFFlags);
int64_t libcUnixLinuxlikeLinuxGethostid(void);
int32_t libcUnixLinuxlikeLinuxKlogctl(int32_t syslogType, char* bufp, int32_t len);
int32_t libcUnixLinuxlikeLinuxFallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len);
int32_t libcUnixLinuxlikeLinuxFgetpos64(void* stream, void* ptr);
void* libcUnixLinuxlikeLinuxFopen64(const char* filename, const char* mode);
int32_t libcUnixLinuxlikeLinuxPosixFallocate64(int32_t fd, int64_t offset, int64_t len);
int64_t libcUnixLinuxlikeLinuxSendfile64(int32_t outFd, int32_t inFd, void* offset, uint64_t count);
void* libcUnixLinuxlikeLinuxTmpfile64(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_UNIX_LINUXLIKE_LINUX_WRAPPER_H */
