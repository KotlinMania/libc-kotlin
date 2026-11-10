#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_unix_bsd_freebsdlike_dragonfly_errnoLocation(void);
void libc_unix_bsd_freebsdlike_dragonfly_setgrent(void);
int32_t libc_unix_bsd_freebsdlike_dragonfly_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_bsd_freebsdlike_dragonfly_setutxdb(uint32_t arg_0_type, char* file);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete(void* iocbp, void* timeout);
char* libc_unix_bsd_freebsdlike_dragonfly_devnameR(uint32_t dev, uint16_t mode, char* buf, uint64_t len);
int32_t libc_unix_bsd_freebsdlike_dragonfly_waitid(uint32_t idtype, int64_t id, void* infop, int32_t options);
void libc_unix_bsd_freebsdlike_dragonfly_freelocale(void* loc);
int32_t libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio(int32_t function, int32_t pid, int32_t lwpid, void* rtp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_statfs(const char* path, void* buf);
int32_t libc_unix_bsd_freebsdlike_dragonfly_fstatfs(int32_t fd, void* buf);
int32_t libc_unix_bsd_freebsdlike_dragonfly_uname(void* buf);
void* libc_unix_bsd_freebsdlike_dragonfly_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit(void* lock, int32_t pshared);
int32_t libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy(void* lock);
int32_t libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock(void* lock);
int32_t libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock(void* lock);
int32_t libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock(void* lock);
int32_t libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu(void);
void libc_unix_bsd_freebsdlike_dragonfly_setproctitle(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_bsd_freebsdlike_dragonfly_shmget(int64_t key, uint64_t size, int32_t shmflg);
void* libc_unix_bsd_freebsdlike_dragonfly_shmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libc_unix_bsd_freebsdlike_dragonfly_shmdt(void* shmaddr);
int32_t libc_unix_bsd_freebsdlike_dragonfly_shmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libc_unix_bsd_freebsdlike_dragonfly_procctl(uint32_t idtype, int64_t id, int32_t cmd, void* data);
int32_t libc_unix_bsd_freebsdlike_dragonfly_updwtmpx(const char* file, void* ut);
void* libc_unix_bsd_freebsdlike_dragonfly_getlastlogx(const char* fname, uint16_t uid, void* ll);
int32_t libc_unix_bsd_freebsdlike_dragonfly_updlastlogx(const char* fname, uint16_t uid, void* ll);
int32_t libc_unix_bsd_freebsdlike_dragonfly_utmpxname(const char* file);
int32_t libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint(int32_t tpe, int32_t fd, int32_t pid, int32_t retval);
int32_t libc_unix_bsd_freebsdlike_dragonfly_umtxSleep(void* ptr, int32_t value, int32_t timeout);
int32_t libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup(void* ptr, int32_t count);
char* libc_unix_bsd_freebsdlike_dragonfly_dirname(char* path);
char* libc_unix_bsd_freebsdlike_dragonfly_basename(char* path);
int32_t libc_unix_bsd_freebsdlike_dragonfly_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo(void* mntbufp, void* mntvbufp, int32_t flags);
int32_t libc_unix_bsd_freebsdlike_dragonfly_closefrom(int32_t lowfd);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioCancel(int32_t fd, void* aiocbp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioError(void* aiocbp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioFsync(int32_t op, void* aiocbp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioRead(void* aiocbp);
int64_t libc_unix_bsd_freebsdlike_dragonfly_aioReturn(void* aiocbp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioSuspend(void* aiocb_list, int32_t nitems, void* timeout);
int32_t libc_unix_bsd_freebsdlike_dragonfly_aioWrite(void* aiocbp);
int32_t libc_unix_bsd_freebsdlike_dragonfly_lioListio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp);
void* libc_unix_bsd_freebsdlike_dragonfly_reallocf(void* ptr, uint64_t size);
void libc_unix_bsd_freebsdlike_dragonfly_freezero(void* ptr, uint64_t size);
void* libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst(void* kvm, void* map, void* entry);
void* libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext(void* kvm, void* map, void* entry);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H */
