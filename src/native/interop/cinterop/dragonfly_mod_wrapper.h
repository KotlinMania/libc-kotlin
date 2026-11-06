#ifndef LIBC_DRAGONFLY_MOD_DRAGONFLY_MOD_WRAPPER_H
#define LIBC_DRAGONFLY_MOD_DRAGONFLY_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_dragonfly_mod_errno_location(void);
void libc_dragonfly_mod_setgrent(void);
int32_t libc_dragonfly_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_dragonfly_mod_setutxdb(uint32_t _type, char* file);
int32_t libc_dragonfly_mod_aio_waitcomplete(void* iocbp, void* timeout);
char* libc_dragonfly_mod_devname_r(uint32_t dev, uint32_t mode, char* buf, uint64_t len);
int32_t libc_dragonfly_mod_waitid(uint32_t idtype, int32_t id, void* infop, int32_t options);
void libc_dragonfly_mod_freelocale(int32_t loc);
int32_t libc_dragonfly_mod_lwp_rtprio(int32_t function, int32_t pid, int32_t lwpid, void* rtp);
int32_t libc_dragonfly_mod_statfs(const char* path, void* buf);
int32_t libc_dragonfly_mod_fstatfs(int32_t fd, void* buf);
int32_t libc_dragonfly_mod_uname(void* buf);
void* libc_dragonfly_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_dragonfly_mod_pthread_spin_init(void* lock, int32_t pshared);
int32_t libc_dragonfly_mod_pthread_spin_destroy(void* lock);
int32_t libc_dragonfly_mod_pthread_spin_lock(void* lock);
int32_t libc_dragonfly_mod_pthread_spin_trylock(void* lock);
int32_t libc_dragonfly_mod_pthread_spin_unlock(void* lock);
int32_t libc_dragonfly_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libc_dragonfly_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* mask);
int32_t libc_dragonfly_mod_sched_getcpu(void);
int32_t libc_dragonfly_mod_shmget(int32_t key, uint64_t size, int32_t shmflg);
void* libc_dragonfly_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg);
int32_t libc_dragonfly_mod_shmdt(void* shmaddr);
int32_t libc_dragonfly_mod_shmctl(int32_t shmid, int32_t cmd, void* buf);
int32_t libc_dragonfly_mod_procctl(uint32_t idtype, int32_t id, int32_t cmd, void* data);
int32_t libc_dragonfly_mod_updwtmpx(const char* file, void* ut);
void* libc_dragonfly_mod_getlastlogx(const char* fname, uint32_t uid, void* ll);
int32_t libc_dragonfly_mod_updlastlogx(const char* fname, uint32_t uid, void* ll);
int32_t libc_dragonfly_mod_getutxuser(const char* name);
int32_t libc_dragonfly_mod_utmpxname(const char* file);
int32_t libc_dragonfly_mod_sys_checkpoint(int32_t tpe, int32_t fd, int32_t pid, int32_t retval);
int32_t libc_dragonfly_mod_umtx_sleep(void* ptr, int32_t value, int32_t timeout);
int32_t libc_dragonfly_mod_umtx_wakeup(void* ptr, int32_t count);
char* libc_dragonfly_mod_dirname(char* path);
char* libc_dragonfly_mod_basename(char* path);
int32_t libc_dragonfly_mod_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_dragonfly_mod_getmntvinfo(void* mntbufp, void* mntvbufp, int32_t flags);
int32_t libc_dragonfly_mod_closefrom(int32_t lowfd);
int32_t libc_dragonfly_mod_aio_cancel(int32_t fd, void* aiocbp);
int32_t libc_dragonfly_mod_aio_error(void* aiocbp);
int32_t libc_dragonfly_mod_aio_fsync(int32_t op, void* aiocbp);
int32_t libc_dragonfly_mod_aio_read(void* aiocbp);
int64_t libc_dragonfly_mod_aio_return(void* aiocbp);
int32_t libc_dragonfly_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout);
int32_t libc_dragonfly_mod_aio_write(void* aiocbp);
int32_t libc_dragonfly_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp);
void* libc_dragonfly_mod_reallocf(void* ptr, uint64_t size);
void libc_dragonfly_mod_freezero(void* ptr, uint64_t size);
void* libc_dragonfly_mod_kvm_vm_map_entry_first(void* kvm, void* map, void* entry);
void* libc_dragonfly_mod_kvm_vm_map_entry_next(void* kvm, void* map, void* entry);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_DRAGONFLY_MOD_DRAGONFLY_MOD_WRAPPER_H */
