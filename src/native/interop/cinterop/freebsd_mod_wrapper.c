#include "freebsd_mod_wrapper.h"
#include <errno.h>

int32_t libc_freebsd_mod_fhlink(void* fhp, const char* to) {
    return (int32_t)fhlink(fhp, to);
}

int32_t libc_freebsd_mod_fhlinkat(void* fhp, int32_t tofd, const char* to) {
    return (int32_t)fhlinkat(fhp, tofd, to);
}

int32_t libc_freebsd_mod_fhreadlink(void* fhp, char* buf, uint64_t bufsize) {
    return (int32_t)fhreadlink(fhp, buf, bufsize);
}

int32_t libc_freebsd_mod_getfhat(int32_t fd, char* path, void* fhp, int32_t flag) {
    return (int32_t)getfhat(fd, path, fhp, flag);
}

void* libc_freebsd_mod_error(void) {
    return (void*)__error();
}

int32_t libc_freebsd_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_freebsd_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int32_t libc_freebsd_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_freebsd_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int32_t libc_freebsd_mod_aio_readv(void* aiocbp) {
    return (int32_t)aio_readv(aiocbp);
}

int64_t libc_freebsd_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_freebsd_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_freebsd_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_freebsd_mod_aio_writev(void* aiocbp) {
    return (int32_t)aio_writev(aiocbp);
}

int64_t libc_freebsd_mod_copy_file_range(int32_t infd, void* inoffp, int32_t outfd, void* outoffp, uint64_t len, uint32_t flags) {
    return (int64_t)copy_file_range(infd, inoffp, outfd, outoffp, len, flags);
}

char* libc_freebsd_mod_devname_r(int32_t dev, uint32_t mode, char* buf, int32_t len) {
    return (char*)devname_r(dev, mode, buf, len);
}

int32_t libc_freebsd_mod_extattr_delete_fd(int32_t fd, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_fd(fd, attrnamespace, attrname);
}

int32_t libc_freebsd_mod_extattr_delete_file(const char* path, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_file(path, attrnamespace, attrname);
}

int32_t libc_freebsd_mod_extattr_delete_link(const char* path, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_link(path, attrnamespace, attrname);
}

int64_t libc_freebsd_mod_extattr_get_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_fd(fd, attrnamespace, attrname, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_get_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_file(path, attrnamespace, attrname, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_get_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_link(path, attrnamespace, attrname, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_list_fd(int32_t fd, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_fd(fd, attrnamespace, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_list_file(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_file(path, attrnamespace, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_list_link(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_link(path, attrnamespace, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_set_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_set_fd(fd, attrnamespace, attrname, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_set_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_set_file(path, attrnamespace, attrname, data, nbytes);
}

int64_t libc_freebsd_mod_extattr_set_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_set_link(path, attrnamespace, attrname, data, nbytes);
}

int32_t libc_freebsd_mod_fspacectl(int32_t fd, int32_t cmd, void* rqsr, int32_t flags, void* rmsr) {
    return (int32_t)fspacectl(fd, cmd, rqsr, flags, rmsr);
}

int32_t libc_freebsd_mod_jail(void* jail) {
    return (int32_t)jail(jail);
}

int32_t libc_freebsd_mod_jail_attach(int32_t jid) {
    return (int32_t)jail_attach(jid);
}

int32_t libc_freebsd_mod_jail_remove(int32_t jid) {
    return (int32_t)jail_remove(jid);
}

int32_t libc_freebsd_mod_jail_get(void* iov, uint32_t niov, int32_t flags) {
    return (int32_t)jail_get(iov, niov, flags);
}

int32_t libc_freebsd_mod_jail_set(void* iov, uint32_t niov, int32_t flags) {
    return (int32_t)jail_set(iov, niov, flags);
}

int32_t libc_freebsd_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

void* libc_freebsd_mod_getutxuser(const char* user) {
    return (void*)getutxuser(user);
}

int32_t libc_freebsd_mod_setutxdb(int32_t _type, const char* file) {
    return (int32_t)setutxdb(_type, file);
}

int64_t libc_freebsd_mod_aio_waitcomplete(void* iocbp, void* timeout) {
    return (int64_t)aio_waitcomplete(iocbp, timeout);
}

int32_t libc_freebsd_mod_mq_getfd_np(void* mqd) {
    return (int32_t)mq_getfd_np(mqd);
}

int32_t libc_freebsd_mod_waitid(uint32_t idtype, int32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_freebsd_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_freebsd_mod_ftok(const char* pathname, int32_t proj_id) {
    return (int32_t)ftok(pathname, proj_id);
}

int32_t libc_freebsd_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

void* libc_freebsd_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_freebsd_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_freebsd_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_freebsd_mod_semget(int32_t key, int32_t nsems, int32_t semflg) {
    return (int32_t)semget(key, nsems, semflg);
}

int32_t libc_freebsd_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int32_t libc_freebsd_mod_msgctl(int32_t msqid, int32_t cmd, void* buf) {
    return (int32_t)msgctl(msqid, cmd, buf);
}

int32_t libc_freebsd_mod_msgget(int32_t key, int32_t msgflg) {
    return (int32_t)msgget(key, msgflg);
}

int32_t libc_freebsd_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg) {
    return (int32_t)msgsnd(msqid, msgp, msgsz, msgflg);
}

void libc_freebsd_mod_cfmakesane(void* termios) {
    cfmakesane(termios);
}

int32_t libc_freebsd_mod_pdfork(void* fdp, int32_t flags) {
    return (int32_t)pdfork(fdp, flags);
}

int32_t libc_freebsd_mod_pdgetpid(int32_t fd, void* pidp) {
    return (int32_t)pdgetpid(fd, pidp);
}

int32_t libc_freebsd_mod_pdkill(int32_t fd, int32_t signum) {
    return (int32_t)pdkill(fd, signum);
}

int32_t libc_freebsd_mod_rtprio_thread(int32_t function, int32_t lwpid, void* rtp) {
    return (int32_t)rtprio_thread(function, lwpid, rtp);
}

int32_t libc_freebsd_mod_uuidgen(void* store, int32_t count) {
    return (int32_t)uuidgen(store, count);
}

int32_t libc_freebsd_mod_thr_kill(int64_t id, int32_t sig) {
    return (int32_t)thr_kill(id, sig);
}

int32_t libc_freebsd_mod_thr_kill2(int32_t pid, int64_t id, int32_t sig) {
    return (int32_t)thr_kill2(pid, id, sig);
}

int32_t libc_freebsd_mod_thr_self(void* tid) {
    return (int32_t)thr_self(tid);
}

int32_t libc_freebsd_mod_pthread_getthreadid_np(void) {
    return (int32_t)pthread_getthreadid_np();
}

int32_t libc_freebsd_mod_pthread_getaffinity_np(int32_t td, uint64_t cpusetsize, void* cpusetp) {
    return (int32_t)pthread_getaffinity_np(td, cpusetsize, cpusetp);
}

int32_t libc_freebsd_mod_pthread_setaffinity_np(int32_t td, uint64_t cpusetsize, void* cpusetp) {
    return (int32_t)pthread_setaffinity_np(td, cpusetsize, cpusetp);
}

int32_t libc_freebsd_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsz, void* cpuset) {
    return (int32_t)sched_getaffinity(pid, cpusetsz, cpuset);
}

int32_t libc_freebsd_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsz, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsz, cpuset);
}

int32_t libc_freebsd_mod_sched_getcpu(void) {
    return (int32_t)sched_getcpu();
}

int32_t libc_freebsd_mod_pthread_mutex_consistent(void* mutex) {
    return (int32_t)pthread_mutex_consistent(mutex);
}

int32_t libc_freebsd_mod_pthread_mutexattr_getrobust(void* attr, void* robust) {
    return (int32_t)pthread_mutexattr_getrobust(attr, robust);
}

int32_t libc_freebsd_mod_pthread_mutexattr_setrobust(void* attr, int32_t robust) {
    return (int32_t)pthread_mutexattr_setrobust(attr, robust);
}

int32_t libc_freebsd_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_freebsd_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_freebsd_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_freebsd_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_freebsd_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_freebsd_mod_pthread_timedjoin_np(int32_t thread, void* retval, void* abstime) {
    return (int32_t)pthread_timedjoin_np(thread, retval, abstime);
}

int32_t libc_freebsd_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_freebsd_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_freebsd_mod_dup3(int32_t src, int32_t dst, int32_t flags) {
    return (int32_t)dup3(src, dst, flags);
}

int32_t libc_freebsd_mod_xuname(int32_t nmln, void* buf) {
    return (int32_t)__xuname(nmln, buf);
}

int64_t libc_freebsd_mod_sendmmsg(int32_t sockfd, void* msgvec, uint64_t vlen, int32_t flags) {
    return (int64_t)sendmmsg(sockfd, msgvec, vlen, flags);
}

int64_t libc_freebsd_mod_recvmmsg(int32_t sockfd, void* msgvec, uint64_t vlen, int32_t flags, void* timeout) {
    return (int64_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}

void* libc_freebsd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_freebsd_mod_fhopen(void* fhp, int32_t flags) {
    return (int32_t)fhopen(fhp, flags);
}

int32_t libc_freebsd_mod_fhstat(void* fhp, void* buf) {
    return (int32_t)fhstat(fhp, buf);
}

int32_t libc_freebsd_mod_fhstatfs(void* fhp, void* buf) {
    return (int32_t)fhstatfs(fhp, buf);
}

int32_t libc_freebsd_mod_getfh(const char* path, void* fhp) {
    return (int32_t)getfh(path, fhp);
}

int32_t libc_freebsd_mod_lgetfh(const char* path, void* fhp) {
    return (int32_t)lgetfh(path, fhp);
}

int32_t libc_freebsd_mod_getfsstat(void* buf, int64_t bufsize, int32_t mode) {
    return (int32_t)getfsstat(buf, bufsize, mode);
}

int32_t libc_freebsd_mod_getmntinfo(void* mntbufp, int32_t mode) {
    return (int32_t)getmntinfo(mntbufp, mode);
}

int32_t libc_freebsd_mod_mount(const char* type_, const char* dir, int32_t flags, void* data) {
    return (int32_t)mount(type_, dir, flags, data);
}

int32_t libc_freebsd_mod_nmount(void* iov, uint32_t niov, int32_t flags) {
    return (int32_t)nmount(iov, niov, flags);
}

int32_t libc_freebsd_mod_rfork(int32_t flags) {
    return (int32_t)rfork(flags);
}

int32_t libc_freebsd_mod_cpuset_getaffinity(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask) {
    return (int32_t)cpuset_getaffinity(level, which, id, setsize, mask);
}

int32_t libc_freebsd_mod_cpuset_setaffinity(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask) {
    return (int32_t)cpuset_setaffinity(level, which, id, setsize, mask);
}

int32_t libc_freebsd_mod_cpuset(void* setid) {
    return (int32_t)cpuset(setid);
}

int32_t libc_freebsd_mod_cpuset_getid(int32_t level, int32_t which, int32_t id, void* setid) {
    return (int32_t)cpuset_getid(level, which, id, setid);
}

int32_t libc_freebsd_mod_cpuset_setid(int32_t which, int32_t id, int32_t setid) {
    return (int32_t)cpuset_setid(which, id, setid);
}

int32_t libc_freebsd_mod_cap_enter(void) {
    return (int32_t)cap_enter();
}

int32_t libc_freebsd_mod_cap_getmode(void* modep) {
    return (int32_t)cap_getmode(modep);
}

int32_t libc_freebsd_mod_cap_fcntls_get(int32_t fd, void* fcntlrightsp) {
    return (int32_t)cap_fcntls_get(fd, fcntlrightsp);
}

int32_t libc_freebsd_mod_cap_fcntls_limit(int32_t fd, uint32_t fcntlrights) {
    return (int32_t)cap_fcntls_limit(fd, fcntlrights);
}

int64_t libc_freebsd_mod_cap_ioctls_get(int32_t fd, void* cmds, uint64_t maxcmds) {
    return (int64_t)cap_ioctls_get(fd, cmds, maxcmds);
}

int32_t libc_freebsd_mod_cap_ioctls_limit(int32_t fd, void* cmds, uint64_t ncmds) {
    return (int32_t)cap_ioctls_limit(fd, cmds, ncmds);
}

int32_t libc_freebsd_mod_cap_rights_get(int32_t version, int32_t fd, void* rightsp) {
    return (int32_t)__cap_rights_get(version, fd, rightsp);
}

bool libc_freebsd_mod_cap_rights_is_valid(void* rights) {
    return (bool)cap_rights_is_valid(rights);
}

int32_t libc_freebsd_mod_cap_rights_limit(int32_t fd, void* rights) {
    return (int32_t)cap_rights_limit(fd, rights);
}

void* libc_freebsd_mod_cap_rights_merge(void* dst, void* src) {
    return (void*)cap_rights_merge(dst, src);
}

void* libc_freebsd_mod_cap_rights_remove(void* dst, void* src) {
    return (void*)cap_rights_remove(dst, src);
}

bool libc_freebsd_mod_cap_rights_contains(void* big, void* little) {
    return (bool)cap_rights_contains(big, little);
}

bool libc_freebsd_mod_cap_sandboxed(void) {
    return (bool)cap_sandboxed();
}

void* libc_freebsd_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

int32_t libc_freebsd_mod_ffs(int32_t value) {
    return (int32_t)ffs(value);
}

int32_t libc_freebsd_mod_ffsl(int64_t value) {
    return (int32_t)ffsl(value);
}

int32_t libc_freebsd_mod_ffsll(int64_t value) {
    return (int32_t)ffsll(value);
}

int32_t libc_freebsd_mod_fls(int32_t value) {
    return (int32_t)fls(value);
}

int32_t libc_freebsd_mod_flsl(int64_t value) {
    return (int32_t)flsl(value);
}

int32_t libc_freebsd_mod_flsll(int64_t value) {
    return (int32_t)flsll(value);
}

void libc_freebsd_mod_malloc_stats_print(int32_t write_cb, void* cbopaque, const char* opt) {
    malloc_stats_print(write_cb, cbopaque, opt);
}

int32_t libc_freebsd_mod_mallctl(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)mallctl(name, oldp, oldlenp, newp, newlen);
}

int32_t libc_freebsd_mod_mallctlnametomib(const char* name, void* mibp, void* miplen) {
    return (int32_t)mallctlnametomib(name, mibp, miplen);
}

int32_t libc_freebsd_mod_mallctlbymib(void* mib, uint64_t mible, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)mallctlbymib(mib, mible, oldp, oldlenp, newp, newlen);
}

void* libc_freebsd_mod_mallocx(uint64_t size, int32_t flags) {
    return (void*)mallocx(size, flags);
}

void* libc_freebsd_mod_rallocx(void* ptr, uint64_t size, int32_t flags) {
    return (void*)rallocx(ptr, size, flags);
}

uint64_t libc_freebsd_mod_xallocx(void* ptr, uint64_t size, uint64_t extra, int32_t flags) {
    return (uint64_t)xallocx(ptr, size, extra, flags);
}

uint64_t libc_freebsd_mod_sallocx(void* ptr, int32_t flags) {
    return (uint64_t)sallocx(ptr, flags);
}

void libc_freebsd_mod_dallocx(void* ptr, int32_t flags) {
    dallocx(ptr, flags);
}

void libc_freebsd_mod_sdallocx(void* ptr, uint64_t size, int32_t flags) {
    sdallocx(ptr, size, flags);
}

uint64_t libc_freebsd_mod_nallocx(uint64_t size, int32_t flags) {
    return (uint64_t)nallocx(size, flags);
}

int32_t libc_freebsd_mod_procctl(uint32_t idtype, int32_t id, int32_t cmd, void* data) {
    return (int32_t)procctl(idtype, id, cmd, data);
}

int32_t libc_freebsd_mod_getpagesize(void) {
    return (int32_t)getpagesize();
}

int32_t libc_freebsd_mod_getpagesizes(void* pagesize, int32_t nelem) {
    return (int32_t)getpagesizes(pagesize, nelem);
}

int32_t libc_freebsd_mod_clock_getcpuclockid2(int32_t arg1, int32_t arg2, void* arg3) {
    return (int32_t)clock_getcpuclockid2(arg1, arg2, arg3);
}

char* libc_freebsd_mod_strchrnul(const char* s, int32_t c) {
    return (char*)strchrnul(s, c);
}

int32_t libc_freebsd_mod_shm_create_largepage(const char* path, int32_t flags, int32_t psind, int32_t alloc_policy, uint32_t mode) {
    return (int32_t)shm_create_largepage(path, flags, psind, alloc_policy, mode);
}

int32_t libc_freebsd_mod_shm_rename(const char* path_from, const char* path_to, int32_t flags) {
    return (int32_t)shm_rename(path_from, path_to, flags);
}

int32_t libc_freebsd_mod_memfd_create(const char* name, uint32_t flags) {
#if defined(__linux__)
    return (int32_t)memfd_create(name, flags);
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsd_mod_setaudit(void* auditinfo) {
    return (int32_t)setaudit(auditinfo);
}

int32_t libc_freebsd_mod_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsd_mod_eventfd_read(int32_t fd, void* value) {
    return (int32_t)eventfd_read(fd, value);
}

int32_t libc_freebsd_mod_eventfd_write(int32_t fd, uint64_t value) {
    return (int32_t)eventfd_write(fd, value);
}

int32_t libc_freebsd_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_freebsd_mod_elf_aux_info(int32_t aux, void* buf, int32_t buflen) {
    return (int32_t)elf_aux_info(aux, buf, buflen);
}

int32_t libc_freebsd_mod_timingsafe_bcmp(void* a, void* b, uint64_t len) {
    return (int32_t)timingsafe_bcmp(a, b, len);
}

int32_t libc_freebsd_mod_timingsafe_memcmp(void* a, void* b, uint64_t len) {
    return (int32_t)timingsafe_memcmp(a, b, len);
}

int32_t libc_freebsd_mod_umtx_op(void* obj, int32_t op, uint64_t val, void* uaddr, void* uaddr2) {
    return (int32_t)_umtx_op(obj, op, val, uaddr, uaddr2);
}

int32_t libc_freebsd_mod_sctp_peeloff(int32_t s, uint32_t id) {
    return (int32_t)sctp_peeloff(s, id);
}

int32_t libc_freebsd_mod_sctp_bindx(int32_t s, void* addrs, int32_t num, int32_t tpe) {
    return (int32_t)sctp_bindx(s, addrs, num, tpe);
}

int32_t libc_freebsd_mod_sctp_connectx(int32_t s, void* addrs, int32_t addrcnt, void* id) {
    return (int32_t)sctp_connectx(s, addrs, addrcnt, id);
}

int32_t libc_freebsd_mod_sctp_getaddrlen(uint16_t family) {
    return (int32_t)sctp_getaddrlen(family);
}

int32_t libc_freebsd_mod_sctp_getpaddrs(int32_t s, uint32_t asocid, void* addrs) {
    return (int32_t)sctp_getpaddrs(s, asocid, addrs);
}

void libc_freebsd_mod_sctp_freepaddrs(void* addrs) {
    sctp_freepaddrs(addrs);
}

int32_t libc_freebsd_mod_sctp_getladdrs(int32_t s, uint32_t asocid, void* addrs) {
    return (int32_t)sctp_getladdrs(s, asocid, addrs);
}

void libc_freebsd_mod_sctp_freeladdrs(void* addrs) {
    sctp_freeladdrs(addrs);
}

int32_t libc_freebsd_mod_sctp_opt_info(int32_t s, uint32_t id, int32_t opt, void* arg, void* size) {
    return (int32_t)sctp_opt_info(s, id, opt, arg, size);
}

int64_t libc_freebsd_mod_sctp_sendv(int32_t sd, void* iov, int32_t iovcnt, void* addrs, int32_t addrcnt, void* info, uint32_t infolen, uint32_t infotype, int32_t flags) {
    return (int64_t)sctp_sendv(sd, iov, iovcnt, addrs, addrcnt, info, infolen, infotype, flags);
}

int64_t libc_freebsd_mod_sctp_recvv(int32_t sd, void* iov, int32_t iovcnt, void* from, void* fromlen, void* info, void* infolen, void* infotype, void* flags) {
    return (int64_t)sctp_recvv(sd, iov, iovcnt, from, fromlen, info, infolen, infotype, flags);
}

int32_t libc_freebsd_mod_timerfd_create(int32_t clockid, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clockid, flags);
#else
    (void)clockid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsd_mod_timerfd_gettime(int32_t fd, void* curr_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, curr_value);
#else
    (void)fd;
    (void)curr_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_freebsd_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
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

void libc_freebsd_mod_closefrom(int32_t lowfd) {
    closefrom(lowfd);
}

int32_t libc_freebsd_mod_close_range(uint32_t lowfd, uint32_t highfd, int32_t flags) {
    return (int32_t)close_range(lowfd, highfd, flags);
}

int32_t libc_freebsd_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_freebsd_mod_kcmp(int32_t pid1, int32_t pid2, int32_t type_, uint64_t idx1, uint64_t idx2) {
    return (int32_t)kcmp(pid1, pid2, type_, idx1, idx2);
}

void* libc_freebsd_mod_dlvsym(void* handle, const char* symbol, const char* version) {
    return (void*)dlvsym(handle, symbol, version);
}

const char* libc_freebsd_mod_memstat_strerror(int32_t error) {
    return (const char*)memstat_strerror(error);
}

void* libc_freebsd_mod_memstat_mtl_alloc(void) {
    return (void*)memstat_mtl_alloc();
}

void* libc_freebsd_mod_memstat_mtl_first(void* list) {
    return (void*)memstat_mtl_first(list);
}

void* libc_freebsd_mod_memstat_mtl_next(void* mtp) {
    return (void*)memstat_mtl_next(mtp);
}

void* libc_freebsd_mod_memstat_mtl_find(void* list, int32_t allocator, const char* name) {
    return (void*)memstat_mtl_find(list, allocator, name);
}

void libc_freebsd_mod_memstat_mtl_free(void* list) {
    memstat_mtl_free(list);
}

int32_t libc_freebsd_mod_memstat_mtl_geterror(void* list) {
    return (int32_t)memstat_mtl_geterror(list);
}

const char* libc_freebsd_mod_memstat_get_name(void* mtp) {
    return (const char*)memstat_get_name(mtp);
}

int32_t libc_freebsd_mod_kvm_dpcpu_setcpu(void* kd, uint32_t cpu) {
    return (int32_t)kvm_dpcpu_setcpu(kd, cpu);
}

void* libc_freebsd_mod_kvm_getargv(void* kd, void* p, int32_t nchr) {
    return (void*)kvm_getargv(kd, p, nchr);
}

int32_t libc_freebsd_mod_kvm_getcptime(void* kd, void* cp_time) {
    return (int32_t)kvm_getcptime(kd, cp_time);
}

void* libc_freebsd_mod_kvm_getenvv(void* kd, void* p, int32_t nchr) {
    return (void*)kvm_getenvv(kd, p, nchr);
}

char* libc_freebsd_mod_kvm_geterr(void* kd) {
    return (char*)kvm_geterr(kd);
}

int32_t libc_freebsd_mod_kvm_getmaxcpu(void* kd) {
    return (int32_t)kvm_getmaxcpu(kd);
}

int32_t libc_freebsd_mod_kvm_getncpus(void* kd) {
    return (int32_t)kvm_getncpus(kd);
}

void* libc_freebsd_mod_kvm_getpcpu(void* kd, int32_t cpu) {
    return (void*)kvm_getpcpu(kd, cpu);
}

uint64_t libc_freebsd_mod_kvm_counter_u64fetch(void* kd, uint64_t base) {
    return (uint64_t)kvm_counter_u64_fetch(kd, base);
}

int32_t libc_freebsd_mod_kvm_getswapinfo(void* kd, void* info, int32_t maxswap, int32_t flags) {
    return (int32_t)kvm_getswapinfo(kd, info, maxswap, flags);
}

int32_t libc_freebsd_mod_kvm_native(void* kd) {
    return (int32_t)kvm_native(kd);
}

int32_t libc_freebsd_mod_kvm_nlist(void* kd, void* nl) {
    return (int32_t)kvm_nlist(kd, nl);
}

int32_t libc_freebsd_mod_kvm_nlist2(void* kd, void* nl) {
    return (int32_t)kvm_nlist2(kd, nl);
}

int64_t libc_freebsd_mod_kvm_read_zpcpu(void* kd, uint64_t base, void* buf, uint64_t size, int32_t cpu) {
    return (int64_t)kvm_read_zpcpu(kd, base, buf, size, cpu);
}

int64_t libc_freebsd_mod_kvm_read2(void* kd, uint64_t addr, void* buf, uint64_t nbytes) {
    return (int64_t)kvm_read2(kd, addr, buf, nbytes);
}

int32_t libc_freebsd_mod_extattr_namespace_to_string(int32_t attrnamespace, void* string) {
    return (int32_t)extattr_namespace_to_string(attrnamespace, string);
}

int32_t libc_freebsd_mod_extattr_string_to_namespace(const char* string, void* attrnamespace) {
    return (int32_t)extattr_string_to_namespace(string, attrnamespace);
}

int32_t libc_freebsd_mod_realhostname(char* host, uint64_t hsize, void* ip) {
    return (int32_t)realhostname(host, hsize, ip);
}

int32_t libc_freebsd_mod_realhostname_sa(char* host, uint64_t hsize, void* addr, int32_t addrlen) {
    return (int32_t)realhostname_sa(host, hsize, addr, addrlen);
}

int32_t libc_freebsd_mod_kld_isloaded(const char* name) {
    return (int32_t)kld_isloaded(name);
}

int32_t libc_freebsd_mod_kld_load(const char* name) {
    return (int32_t)kld_load(name);
}

void* libc_freebsd_mod_kinfo_getvmmap(int32_t pid, void* cntp) {
    return (void*)kinfo_getvmmap(pid, cntp);
}

void libc_freebsd_mod_hexdump(void* ptr, int32_t length, const char* hdr, int32_t flags) {
    hexdump(ptr, length, hdr, flags);
}

int32_t libc_freebsd_mod_humanize_number(char* buf, uint64_t len, int64_t number, const char* suffix, int32_t scale, int32_t flags) {
    return (int32_t)humanize_number(buf, len, number, suffix, scale, flags);
}

const char* libc_freebsd_mod_getlocalbase(void) {
    return (const char*)getlocalbase();
}

void* libc_freebsd_mod_pidfile_open(const char* path, uint32_t mode, void* pidptr) {
    return (void*)pidfile_open(path, mode, pidptr);
}

int32_t libc_freebsd_mod_pidfile_write(void* path) {
    return (int32_t)pidfile_write(path);
}

int32_t libc_freebsd_mod_pidfile_close(void* path) {
    return (int32_t)pidfile_close(path);
}

int32_t libc_freebsd_mod_pidfile_remove(void* path) {
    return (int32_t)pidfile_remove(path);
}

int32_t libc_freebsd_mod_pidfile_fileno(void* path) {
    return (int32_t)pidfile_fileno(path);
}

void* libc_freebsd_mod_procstat_open_sysctl(void) {
    return (void*)procstat_open_sysctl();
}

void* libc_freebsd_mod_procstat_getfiles(void* procstat, void* kp, int32_t mmapped) {
    return (void*)procstat_getfiles(procstat, kp, mmapped);
}

void libc_freebsd_mod_procstat_freefiles(void* procstat, void* head) {
    procstat_freefiles(procstat, head);
}

void* libc_freebsd_mod_procstat_getprocs(void* procstat, int32_t what, int32_t arg, void* count) {
    return (void*)procstat_getprocs(procstat, what, arg, count);
}

void libc_freebsd_mod_procstat_freeprocs(void* procstat, void* p) {
    procstat_freeprocs(procstat, p);
}

void* libc_freebsd_mod_procstat_getvmmap(void* procstat, void* kp, void* count) {
    return (void*)procstat_getvmmap(procstat, kp, count);
}

void libc_freebsd_mod_procstat_freevmmap(void* procstat, void* vmmap) {
    procstat_freevmmap(procstat, vmmap);
}

void libc_freebsd_mod_procstat_close(void* procstat) {
    procstat_close(procstat);
}

void libc_freebsd_mod_procstat_freeargv(void* procstat) {
    procstat_freeargv(procstat);
}

void libc_freebsd_mod_procstat_freeenvv(void* procstat) {
    procstat_freeenvv(procstat);
}

void libc_freebsd_mod_procstat_freegroups(void* procstat, void* groups) {
    procstat_freegroups(procstat, groups);
}

void libc_freebsd_mod_procstat_freeptlwpinfo(void* procstat, void* pl) {
    procstat_freeptlwpinfo(procstat, pl);
}

void* libc_freebsd_mod_procstat_getargv(void* procstat, void* kp, uint64_t nchr) {
    return (void*)procstat_getargv(procstat, kp, nchr);
}

void* libc_freebsd_mod_procstat_getenvv(void* procstat, void* kp, uint64_t nchr) {
    return (void*)procstat_getenvv(procstat, kp, nchr);
}

void* libc_freebsd_mod_procstat_getgroups(void* procstat, void* kp, void* count) {
    return (void*)procstat_getgroups(procstat, kp, count);
}

int32_t libc_freebsd_mod_procstat_getosrel(void* procstat, void* kp, void* osrelp) {
    return (int32_t)procstat_getosrel(procstat, kp, osrelp);
}

int32_t libc_freebsd_mod_procstat_getpathname(void* procstat, void* kp, char* pathname, uint64_t maxlen) {
    return (int32_t)procstat_getpathname(procstat, kp, pathname, maxlen);
}

int32_t libc_freebsd_mod_procstat_getrlimit(void* procstat, void* kp, int32_t which, void* rlimit) {
    return (int32_t)procstat_getrlimit(procstat, kp, which, rlimit);
}

int32_t libc_freebsd_mod_procstat_getumask(void* procstat, void* kp, void* maskp) {
    return (int32_t)procstat_getumask(procstat, kp, maskp);
}

void* libc_freebsd_mod_procstat_open_core(const char* filename) {
    return (void*)procstat_open_core(filename);
}

void* libc_freebsd_mod_procstat_open_kvm(const char* nlistf, const char* memf) {
    return (void*)procstat_open_kvm(nlistf, memf);
}

int32_t libc_freebsd_mod_procstat_get_socket_info(void* proc_, void* fst, void* sock, char* errbuf) {
    return (int32_t)procstat_get_socket_info(proc_, fst, sock, errbuf);
}

int32_t libc_freebsd_mod_procstat_get_vnode_info(void* proc_, void* fst, void* vn, char* errbuf) {
    return (int32_t)procstat_get_vnode_info(proc_, fst, vn, errbuf);
}

int32_t libc_freebsd_mod_procstat_get_pts_info(void* proc_, void* fst, void* pts, char* errbuf) {
    return (int32_t)procstat_get_pts_info(proc_, fst, pts, errbuf);
}

int32_t libc_freebsd_mod_procstat_get_shm_info(void* proc_, void* fst, void* shm, char* errbuf) {
    return (int32_t)procstat_get_shm_info(proc_, fst, shm, errbuf);
}

int32_t libc_freebsd_mod_timer_create(int32_t clock_id, void* evp, void* timerid) {
    return (int32_t)timer_create(clock_id, evp, timerid);
}

int32_t libc_freebsd_mod_timer_delete(void* timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_freebsd_mod_timer_getoverrun(void* timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_freebsd_mod_timer_gettime(void* timerid, void* value) {
    return (int32_t)timer_gettime(timerid, value);
}

int32_t libc_freebsd_mod_timer_settime(void* timerid, int32_t flags, void* value, void* ovalue) {
    return (int32_t)timer_settime(timerid, flags, value, ovalue);
}

int32_t libc_freebsd_mod_devstat_getnumdevs(void* kd) {
    return (int32_t)devstat_getnumdevs(kd);
}

int64_t libc_freebsd_mod_devstat_getgeneration(void* kd) {
    return (int64_t)devstat_getgeneration(kd);
}

int32_t libc_freebsd_mod_devstat_getversion(void* kd) {
    return (int32_t)devstat_getversion(kd);
}

int32_t libc_freebsd_mod_devstat_checkversion(void* kd) {
    return (int32_t)devstat_checkversion(kd);
}

int32_t libc_freebsd_mod_devstat_selectdevs(void* dev_select, void* num_selected, void* num_selections, void* select_generation, int64_t current_generation, void* devices, int32_t numdevs, void* matches, int32_t num_matches, void* dev_selections, int32_t num_dev_selections, int32_t select_mode, int32_t maxshowdevs, int32_t perf_select) {
    return (int32_t)devstat_selectdevs(dev_select, num_selected, num_selections, select_generation, current_generation, devices, numdevs, matches, num_matches, dev_selections, num_dev_selections, select_mode, maxshowdevs, perf_select);
}

int32_t libc_freebsd_mod_devstat_buildmatch(char* match_str, void* matches, void* num_matches) {
    return (int32_t)devstat_buildmatch(match_str, matches, num_matches);
}

