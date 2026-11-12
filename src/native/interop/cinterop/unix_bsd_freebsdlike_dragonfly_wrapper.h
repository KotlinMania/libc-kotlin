#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcUnixBsdFreebsdlikeDragonflyErrnoLocation(void);
void libcUnixBsdFreebsdlikeDragonflySetgrent(void);
int32_t libcUnixBsdFreebsdlikeDragonflyMprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcUnixBsdFreebsdlikeDragonflySetutxdb(uint32_t type, char* file);
int32_t libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(void* iocbp, void* timeout);
char* libcUnixBsdFreebsdlikeDragonflyDevnameR(uint32_t dev, uint16_t mode, char* buf, uint64_t len);
int32_t libcUnixBsdFreebsdlikeDragonflyWaitid(uint32_t idtype, int64_t id, void* infop, int32_t options);
void libcUnixBsdFreebsdlikeDragonflyFreelocale(void* loc);
int32_t libcUnixBsdFreebsdlikeDragonflyLwpRtprio(int32_t function, int32_t pid, int32_t lwpid, void* rtp);
int32_t libcUnixBsdFreebsdlikeDragonflyStatfs(const char* path, void* buf);
int32_t libcUnixBsdFreebsdlikeDragonflyFstatfs(int32_t fd, void* buf);
int32_t libcUnixBsdFreebsdlikeDragonflyUname(void* buf);
void* libcUnixBsdFreebsdlikeDragonflyMemmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(void* lock, int32_t pshared);
int32_t libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(void* lock);
int32_t libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(void* lock);
int32_t libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(void* lock);
int32_t libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(void* lock);
int32_t libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libcUnixBsdFreebsdlikeDragonflySchedGetcpu(void);
void libcUnixBsdFreebsdlikeDragonflySetproctitle(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcUnixBsdFreebsdlikeDragonflyShmget(int64_t key, uint64_t size, int32_t shmflg);
void* libcUnixBsdFreebsdlikeDragonflyShmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libcUnixBsdFreebsdlikeDragonflyShmdt(void* shmaddr);
int32_t libcUnixBsdFreebsdlikeDragonflyShmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libcUnixBsdFreebsdlikeDragonflyProcctl(uint32_t idtype, int64_t id, int32_t cmd, void* data);
int32_t libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(const char* file, void* ut);
void* libcUnixBsdFreebsdlikeDragonflyGetlastlogx(const char* fname, uint16_t uid, void* ll);
int32_t libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(const char* fname, uint16_t uid, void* ll);
int32_t libcUnixBsdFreebsdlikeDragonflyUtmpxname(const char* file);
int32_t libcUnixBsdFreebsdlikeDragonflySysCheckpoint(int32_t tpe, int32_t fd, int32_t pid, int32_t retval);
int32_t libcUnixBsdFreebsdlikeDragonflyUmtxSleep(void* ptr, int32_t value, int32_t timeout);
int32_t libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(void* ptr, int32_t count);
char* libcUnixBsdFreebsdlikeDragonflyDirname(char* path);
char* libcUnixBsdFreebsdlikeDragonflyBasename(char* path);
int32_t libcUnixBsdFreebsdlikeDragonflyGetmntinfo(void* mntbufp, int32_t flags);
int32_t libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(void* mntbufp, void* mntvbufp, int32_t flags);
int32_t libcUnixBsdFreebsdlikeDragonflyClosefrom(int32_t lowfd);
int32_t libcUnixBsdFreebsdlikeDragonflyAioCancel(int32_t fd, void* aiocbp);
int32_t libcUnixBsdFreebsdlikeDragonflyAioError(void* aiocbp);
int32_t libcUnixBsdFreebsdlikeDragonflyAioFsync(int32_t op, void* aiocbp);
int32_t libcUnixBsdFreebsdlikeDragonflyAioRead(void* aiocbp);
int64_t libcUnixBsdFreebsdlikeDragonflyAioReturn(void* aiocbp);
int32_t libcUnixBsdFreebsdlikeDragonflyAioSuspend(void* aiocbList, int32_t nitems, void* timeout);
int32_t libcUnixBsdFreebsdlikeDragonflyAioWrite(void* aiocbp);
int32_t libcUnixBsdFreebsdlikeDragonflyLioListio(int32_t mode, void* aiocbList, int32_t nitems, void* sevp);
void* libcUnixBsdFreebsdlikeDragonflyReallocf(void* ptr, uint64_t size);
void libcUnixBsdFreebsdlikeDragonflyFreezero(void* ptr, uint64_t size);
void* libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(void* kvm, void* map, void* entry);
void* libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(void* kvm, void* map, void* entry);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_UNIX_BSD_FREEBSDLIKE_DRAGONFLY_WRAPPER_H */
