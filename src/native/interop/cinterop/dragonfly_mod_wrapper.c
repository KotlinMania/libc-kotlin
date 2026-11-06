#include "dragonfly_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

void* libc_dragonfly_mod_errno_location(void) {
    return (void*)__errno_location();
}

void libc_dragonfly_mod_setgrent(void) {
    setgrent();
}

int32_t libc_dragonfly_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_dragonfly_mod_setutxdb(uint32_t _type, char* file) {
    return (int32_t)setutxdb(_type, file);
}

int32_t libc_dragonfly_mod_aio_waitcomplete(void* iocbp, void* timeout) {
    return (int32_t)aio_waitcomplete(iocbp, timeout);
}

char* libc_dragonfly_mod_devname_r(uint32_t dev, uint32_t mode, char* buf, uint64_t len) {
    return (char*)devname_r(dev, mode, buf, len);
}

int32_t libc_dragonfly_mod_waitid(uint32_t idtype, int32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

void libc_dragonfly_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int32_t libc_dragonfly_mod_lwp_rtprio(int32_t function, int32_t pid, int32_t lwpid, void* rtp) {
    return (int32_t)lwp_rtprio(function, pid, lwpid, rtp);
}

int32_t libc_dragonfly_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_dragonfly_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_dragonfly_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

void* libc_dragonfly_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_dragonfly_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_dragonfly_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_dragonfly_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_dragonfly_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_dragonfly_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_dragonfly_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* mask) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, mask);
}

int32_t libc_dragonfly_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* mask) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, mask);
}

int32_t libc_dragonfly_mod_sched_getcpu(void) {
    return (int32_t)sched_getcpu();
}

int32_t libc_dragonfly_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

void* libc_dragonfly_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_dragonfly_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_dragonfly_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_dragonfly_mod_procctl(uint32_t idtype, int32_t id, int32_t cmd, void* data) {
    return (int32_t)procctl(idtype, id, cmd, data);
}

int32_t libc_dragonfly_mod_updwtmpx(const char* file, void* ut) {
    return (int32_t)updwtmpx(file, ut);
}

void* libc_dragonfly_mod_getlastlogx(const char* fname, uint32_t uid, void* ll) {
    return (void*)getlastlogx(fname, uid, ll);
}

int32_t libc_dragonfly_mod_updlastlogx(const char* fname, uint32_t uid, void* ll) {
    return (int32_t)updlastlogx(fname, uid, ll);
}

int32_t libc_dragonfly_mod_getutxuser(const char* name) {
    return (int32_t)getutxuser(name);
}

int32_t libc_dragonfly_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

int32_t libc_dragonfly_mod_sys_checkpoint(int32_t tpe, int32_t fd, int32_t pid, int32_t retval) {
    return (int32_t)sys_checkpoint(tpe, fd, pid, retval);
}

int32_t libc_dragonfly_mod_umtx_sleep(void* ptr, int32_t value, int32_t timeout) {
    return (int32_t)umtx_sleep(ptr, value, timeout);
}

int32_t libc_dragonfly_mod_umtx_wakeup(void* ptr, int32_t count) {
    return (int32_t)umtx_wakeup(ptr, count);
}

char* libc_dragonfly_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_dragonfly_mod_basename(char* path) {
    return (char*)basename(path);
}

int32_t libc_dragonfly_mod_getmntinfo(void* mntbufp, int32_t flags) {
    return (int32_t)getmntinfo(mntbufp, flags);
}

int32_t libc_dragonfly_mod_getmntvinfo(void* mntbufp, void* mntvbufp, int32_t flags) {
    return (int32_t)getmntvinfo(mntbufp, mntvbufp, flags);
}

int32_t libc_dragonfly_mod_closefrom(int32_t lowfd) {
    return (int32_t)closefrom(lowfd);
}

int32_t libc_dragonfly_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_dragonfly_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int32_t libc_dragonfly_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_dragonfly_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int64_t libc_dragonfly_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_dragonfly_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_dragonfly_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_dragonfly_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

void* libc_dragonfly_mod_reallocf(void* ptr, uint64_t size) {
    return (void*)reallocf(ptr, size);
}

void libc_dragonfly_mod_freezero(void* ptr, uint64_t size) {
    freezero(ptr, size);
}

void* libc_dragonfly_mod_kvm_vm_map_entry_first(void* kvm, void* map, void* entry) {
    return (void*)kvm_vm_map_entry_first(kvm, map, entry);
}

void* libc_dragonfly_mod_kvm_vm_map_entry_next(void* kvm, void* map, void* entry) {
    return (void*)kvm_vm_map_entry_next(kvm, map, entry);
}

