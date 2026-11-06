#include "hurd_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#include <time.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdlib.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/ioctl.h>
#include <unistd.h>
#include <sys/socket.h>
#include <pthread.h>
#include <semaphore.h>
#include <dirent.h>
#include <sys/mman.h>
#endif

int32_t libc_hurd_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int32_t libc_hurd_mod_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

int32_t libc_hurd_mod_futimens(int32_t __fd, void* __times) {
    return (int32_t)futimens(__fd, __times);
}

int32_t libc_hurd_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_hurd_mod_mkfifoat(int32_t __fd, const char* __path, uint32_t __mode) {
    return (int32_t)mkfifoat(__fd, __path, __mode);
}

int32_t libc_hurd_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_hurd_mod_libc_current_sigrtmin(void) {
    return (int32_t)__libc_current_sigrtmin();
}

int32_t libc_hurd_mod_libc_current_sigrtmax(void) {
    return (int32_t)__libc_current_sigrtmax();
}

int32_t libc_hurd_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_hurd_mod_waitid(uint32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_hurd_mod_sigwait(void* __set, void* __sig) {
    return (int32_t)sigwait(__set, __sig);
}

int32_t libc_hurd_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_hurd_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_hurd_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_hurd_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_hurd_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_hurd_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags) {
    return (int32_t)dup3(oldfd, newfd, flags);
}

int64_t libc_hurd_mod_pread64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread64(fd, buf, count, offset);
}

int64_t libc_hurd_mod_pwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite64(fd, buf, count, offset);
}

int64_t libc_hurd_mod_readv(int32_t __fd, void* __iovec, int32_t __count) {
    return (int64_t)readv(__fd, __iovec, __count);
}

int64_t libc_hurd_mod_writev(int32_t __fd, void* __iovec, int32_t __count) {
    return (int64_t)writev(__fd, __iovec, __count);
}

int64_t libc_hurd_mod_preadv(int32_t __fd, void* __iovec, int32_t __count, int64_t __offset) {
    return (int64_t)preadv(__fd, __iovec, __count, __offset);
}

int64_t libc_hurd_mod_pwritev(int32_t __fd, void* __iovec, int32_t __count, int64_t __offset) {
    return (int64_t)pwritev(__fd, __iovec, __count, __offset);
}

int64_t libc_hurd_mod_preadv64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv64(fd, iov, iovcnt, offset);
}

int64_t libc_hurd_mod_pwritev64(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev64(fd, iov, iovcnt, offset);
}

uint64_t libc_hurd_mod_fread_unlocked(void* buf, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread_unlocked(buf, size, nobj, (FILE*)stream);
}

int32_t libc_hurd_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int32_t libc_hurd_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_hurd_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_hurd_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int64_t libc_hurd_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_hurd_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_hurd_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_hurd_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

int32_t libc_hurd_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_hurd_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_hurd_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int64_t libc_hurd_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_hurd_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_hurd_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_hurd_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_hurd_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int64_t libc_hurd_mod_lseek64(int32_t __fd, int64_t __offset, int32_t __whence) {
    return (int64_t)lseek64(__fd, __offset, __whence);
}

int64_t libc_hurd_mod_lseek(int32_t __fd, int64_t __offset, int32_t __whence) {
    return (int64_t)lseek(__fd, __offset, __whence);
}

int32_t libc_hurd_mod_fgetpos64(void* stream, void* ptr) {
    return (int32_t)fgetpos64((FILE*)stream, ptr);
}

int32_t libc_hurd_mod_fseeko64(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko64((FILE*)stream, offset, whence);
}

int32_t libc_hurd_mod_fsetpos64(void* stream, void* ptr) {
    return (int32_t)fsetpos64((FILE*)stream, ptr);
}

int64_t libc_hurd_mod_ftello64(void* stream) {
    return (int64_t)ftello64((FILE*)stream);
}

int32_t libc_hurd_mod_bind(int32_t __fd, void* __addr, uint32_t __len) {
    return (int32_t)bind(__fd, __addr, __len);
}

int32_t libc_hurd_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg) {
    return (int32_t)accept4(fd, addr, len, flg);
}

int32_t libc_hurd_mod_ppoll(void* fds, uint64_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int64_t libc_hurd_mod_recvmsg(int32_t __fd, void* __message, int32_t __flags) {
    return (int64_t)recvmsg(__fd, __message, __flags);
}

int64_t libc_hurd_mod_sendmsg(int32_t __fd, void* __message, int32_t __flags) {
    return (int64_t)sendmsg(__fd, __message, __flags);
}

int64_t libc_hurd_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int64_t libc_hurd_mod_sendfile(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile(out_fd, in_fd, offset, count);
}

int64_t libc_hurd_mod_sendfile64(int32_t out_fd, int32_t in_fd, void* offset, uint64_t count) {
    return (int64_t)sendfile64(out_fd, in_fd, offset, count);
}

int32_t libc_hurd_mod_shutdown(int32_t __fd, int32_t __how) {
    return (int32_t)shutdown(__fd, __how);
}

int32_t libc_hurd_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_hurd_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_hurd_mod_setdomainname(const char* name, uint64_t len) {
    return (int32_t)setdomainname(name, len);
}

void* libc_hurd_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_hurd_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_hurd_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_hurd_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_hurd_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_hurd_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int64_t libc_hurd_mod_gethostid(void) {
    return (int64_t)gethostid();
}

int32_t libc_hurd_mod_sethostid(int64_t hostid) {
    return (int32_t)sethostid(hostid);
}

void libc_hurd_mod_setpwent(void) {
    setpwent();
}

void libc_hurd_mod_endpwent(void) {
    endpwent();
}

void* libc_hurd_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_hurd_mod_setgrent(void) {
    setgrent();
}

void libc_hurd_mod_endgrent(void) {
    endgrent();
}

void* libc_hurd_mod_getgrent(void) {
    return (void*)getgrent();
}

void libc_hurd_mod_setspent(void) {
    setspent();
}

void libc_hurd_mod_endspent(void) {
    endspent();
}

void* libc_hurd_mod_getspent(void) {
    return (void*)getspent();
}

void* libc_hurd_mod_getspnam(const char* name) {
    return (void*)getspnam(name);
}

int32_t libc_hurd_mod_getpwent_r(void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwent_r(pwd, buf, buflen, result);
}

int32_t libc_hurd_mod_getgrent_r(void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrent_r(grp, buf, buflen, result);
}

int32_t libc_hurd_mod_fgetpwent_r(void* stream, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)fgetpwent_r((FILE*)stream, pwd, buf, buflen, result);
}

int32_t libc_hurd_mod_fgetgrent_r(void* stream, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)fgetgrent_r((FILE*)stream, grp, buf, buflen, result);
}

int32_t libc_hurd_mod_putpwent(void* p, void* stream) {
    return (int32_t)putpwent(p, (FILE*)stream);
}

int32_t libc_hurd_mod_putgrent(void* grp, void* stream) {
    return (int32_t)putgrent(grp, (FILE*)stream);
}

int32_t libc_hurd_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_hurd_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_hurd_mod_fgetspent_r(void* fp, void* spbuf, char* buf, uint64_t buflen, void* spbufp) {
    return (int32_t)fgetspent_r((FILE*)fp, spbuf, buf, buflen, spbufp);
}

int32_t libc_hurd_mod_sgetspent_r(const char* s, void* spbuf, char* buf, uint64_t buflen, void* spbufp) {
    return (int32_t)sgetspent_r(s, spbuf, buf, buflen, spbufp);
}

int32_t libc_hurd_mod_getspent_r(void* spbuf, char* buf, uint64_t buflen, void* spbufp) {
    return (int32_t)getspent_r(spbuf, buf, buflen, spbufp);
}

int32_t libc_hurd_mod_getspnam_r(const char* name, void* spbuf, char* buf, uint64_t buflen, void* spbufp) {
    return (int32_t)getspnam_r(name, spbuf, buf, buflen, spbufp);
}

void* libc_hurd_mod_getmntent_r(void* stream, void* mntbuf, char* buf, int32_t buflen) {
    return (void*)getmntent_r((FILE*)stream, mntbuf, buf, buflen);
}

int32_t libc_hurd_mod_utmpname(const char* file) {
    return (int32_t)utmpname(file);
}

int32_t libc_hurd_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

void* libc_hurd_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_hurd_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_hurd_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_hurd_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

void libc_hurd_mod_setutxent(void) {
    setutxent();
}

void libc_hurd_mod_endutxent(void) {
    endutxent();
}

int32_t libc_hurd_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

int32_t libc_hurd_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_hurd_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

int32_t libc_hurd_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_hurd_mod_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

void* libc_hurd_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_hurd_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

void* libc_hurd_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_hurd_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_hurd_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

int32_t libc_hurd_mod_setgroups(uint64_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_hurd_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

void* libc_hurd_mod_setmntent(const char* filename, const char* ty) {
    return (void*)setmntent(filename, ty);
}

void* libc_hurd_mod_getmntent(void* stream) {
    return (void*)getmntent((FILE*)stream);
}

int32_t libc_hurd_mod_addmntent(void* stream, void* mnt) {
    return (int32_t)addmntent((FILE*)stream, mnt);
}

int32_t libc_hurd_mod_endmntent(void* streamp) {
    return (int32_t)endmntent((FILE*)streamp);
}

char* libc_hurd_mod_hasmntopt(void* mnt, const char* opt) {
    return (char*)hasmntopt(mnt, opt);
}

int32_t libc_hurd_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_hurd_mod_pthread_kill(int64_t __threadid, int32_t __signo) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(__threadid, __signo);
#else
    (void)__threadid;
    (void)__signo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_hurd_mod_pthread_cancel(int64_t thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_hurd_mod_pthread_equal(int64_t __t1, int64_t __t2) {
    return (int32_t)__pthread_equal(__t1, __t2);
}

int32_t libc_hurd_mod_pthread_getattr_np(int64_t __thr, void* __attr) {
    return (int32_t)pthread_getattr_np(__thr, __attr);
}

int32_t libc_hurd_mod_pthread_attr_getguardsize(void* __attr, void* __guardsize) {
    return (int32_t)pthread_attr_getguardsize(__attr, __guardsize);
}

int32_t libc_hurd_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_hurd_mod_pthread_attr_getstack(void* __attr, void* __stackaddr, void* __stacksize) {
    return (int32_t)pthread_attr_getstack(__attr, __stackaddr, __stacksize);
}

int32_t libc_hurd_mod_pthread_mutexattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_mutexattr_getpshared(attr, pshared);
}

int32_t libc_hurd_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_hurd_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_hurd_mod_pthread_rwlockattr_getpshared(void* attr, void* val) {
    return (int32_t)pthread_rwlockattr_getpshared(attr, val);
}

int32_t libc_hurd_mod_pthread_rwlockattr_setpshared(void* attr, int32_t val) {
    return (int32_t)pthread_rwlockattr_setpshared(attr, val);
}

int32_t libc_hurd_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_hurd_mod_pthread_condattr_setclock(void* __attr, int32_t __clock_id) {
    return (int32_t)pthread_condattr_setclock(__attr, __clock_id);
}

int32_t libc_hurd_mod_pthread_condattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_condattr_getpshared(attr, pshared);
}

int32_t libc_hurd_mod_pthread_condattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_condattr_setpshared(attr, pshared);
}

int32_t libc_hurd_mod_pthread_once(void* control, int32_t routine) {
    return (int32_t)pthread_once(control, routine);
}

int32_t libc_hurd_mod_pthread_barrierattr_init(void* attr) {
    return (int32_t)pthread_barrierattr_init(attr);
}

int32_t libc_hurd_mod_pthread_barrierattr_destroy(void* attr) {
    return (int32_t)pthread_barrierattr_destroy(attr);
}

int32_t libc_hurd_mod_pthread_barrierattr_getpshared(void* attr, void* shared) {
    return (int32_t)pthread_barrierattr_getpshared(attr, shared);
}

int32_t libc_hurd_mod_pthread_barrierattr_setpshared(void* attr, int32_t shared) {
    return (int32_t)pthread_barrierattr_setpshared(attr, shared);
}

int32_t libc_hurd_mod_pthread_barrier_init(void* barrier, void* attr, uint32_t count) {
    return (int32_t)pthread_barrier_init(barrier, attr, count);
}

int32_t libc_hurd_mod_pthread_barrier_destroy(void* barrier) {
    return (int32_t)pthread_barrier_destroy(barrier);
}

int32_t libc_hurd_mod_pthread_barrier_wait(void* barrier) {
    return (int32_t)pthread_barrier_wait(barrier);
}

int32_t libc_hurd_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_hurd_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_hurd_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_hurd_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_hurd_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_hurd_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

int32_t libc_hurd_mod_pthread_sigmask(int32_t __how, void* __newmask, void* __oldmask) {
    return (int32_t)pthread_sigmask(__how, __newmask, __oldmask);
}

int32_t libc_hurd_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_hurd_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_hurd_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_hurd_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_hurd_mod_pthread_getschedparam(int64_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_hurd_mod_pthread_setschedparam(int64_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_hurd_mod_pthread_getcpuclockid(int64_t thread, void* clk_id) {
    return (int32_t)pthread_getcpuclockid(thread, clk_id);
}

int32_t libc_hurd_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
#if !defined(_WIN32)
    return (int32_t)sem_init(sem, pshared, value);
#else
    (void)sem;
    (void)pshared;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_hurd_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_hurd_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_hurd_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_hurd_mod_clock_getres(int32_t __clock_id, void* __res) {
    return (int32_t)clock_getres(__clock_id, __res);
}

int32_t libc_hurd_mod_clock_gettime(int32_t __clock_id, void* __tp) {
    return (int32_t)clock_gettime(__clock_id, __tp);
}

int32_t libc_hurd_mod_clock_settime(int32_t __clock_id, void* __tp) {
    return (int32_t)clock_settime(__clock_id, __tp);
}

int32_t libc_hurd_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_hurd_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_hurd_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_hurd_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

char* libc_hurd_mod_asctime_r(void* tm, char* buf) {
    return (char*)asctime_r(tm, buf);
}

char* libc_hurd_mod_ctime_r(void* timep, char* buf) {
    return (char*)ctime_r(timep, buf);
}

uint64_t libc_hurd_mod_strftime(char* s, uint64_t max, const char* format, void* tm) {
    return (uint64_t)strftime(s, max, format, tm);
}

char* libc_hurd_mod_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

int32_t libc_hurd_mod_timer_create(int32_t clockid, void* sevp, void* timerid) {
    return (int32_t)timer_create(clockid, sevp, timerid);
}

int32_t libc_hurd_mod_timer_delete(int32_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_hurd_mod_timer_getoverrun(int32_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_hurd_mod_timer_gettime(int32_t timerid, void* curr_value) {
    return (int32_t)timer_gettime(timerid, curr_value);
}

int32_t libc_hurd_mod_timer_settime(int32_t timerid, int32_t flags, void* new_value, void* old_value) {
    return (int32_t)timer_settime(timerid, flags, new_value, old_value);
}

int32_t libc_hurd_mod_fstat(int32_t __fd, void* __buf) {
    return (int32_t)fstat(__fd, __buf);
}

int32_t libc_hurd_mod_fstat64(int32_t __fd, void* __buf) {
    return (int32_t)fstat64(__fd, __buf);
}

int32_t libc_hurd_mod_fstatat(int32_t __fd, const char* __file, void* __buf, int32_t __flag) {
    return (int32_t)fstatat(__fd, __file, __buf, __flag);
}

int32_t libc_hurd_mod_fstatat64(int32_t __fd, const char* __file, void* __buf, int32_t __flag) {
    return (int32_t)fstatat64(__fd, __file, __buf, __flag);
}

int32_t libc_hurd_mod_statx(int32_t dirfd, const char* pathname, int32_t flags, uint32_t mask, void* statxbuf) {
    return (int32_t)statx(dirfd, pathname, flags, mask, statxbuf);
}

int32_t libc_hurd_mod_ftruncate(int32_t __fd, int64_t __length) {
    return (int32_t)ftruncate(__fd, __length);
}

int32_t libc_hurd_mod_ftruncate64(int32_t __fd, int64_t __length) {
    return (int32_t)ftruncate64(__fd, __length);
}

int32_t libc_hurd_mod_truncate64(const char* __file, int64_t __length) {
    return (int32_t)truncate64(__file, __length);
}

int32_t libc_hurd_mod_lstat(const char* __file, void* __buf) {
#if !defined(_WIN32)
    return (int32_t)lstat(__file, __buf);
#else
    (void)__file;
    (void)__buf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_hurd_mod_lstat64(const char* __file, void* __buf) {
    return (int32_t)lstat64(__file, __buf);
}

int32_t libc_hurd_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_hurd_mod_statfs64(const char* __file, void* __buf) {
    return (int32_t)statfs64(__file, __buf);
}

int32_t libc_hurd_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_hurd_mod_fstatfs64(int32_t __fildes, void* __buf) {
    return (int32_t)fstatfs64(__fildes, __buf);
}

int32_t libc_hurd_mod_statvfs(const char* __file, void* __buf) {
    return (int32_t)statvfs(__file, __buf);
}

int32_t libc_hurd_mod_statvfs64(const char* __file, void* __buf) {
    return (int32_t)statvfs64(__file, __buf);
}

int32_t libc_hurd_mod_fstatvfs(int32_t __fildes, void* __buf) {
    return (int32_t)fstatvfs(__fildes, __buf);
}

int32_t libc_hurd_mod_fstatvfs64(int32_t __fildes, void* __buf) {
    return (int32_t)fstatvfs64(__fildes, __buf);
}

void* libc_hurd_mod_fopen64(const char* filename, const char* mode) {
    return (void*)fopen64(filename, mode);
}

void* libc_hurd_mod_freopen64(const char* filename, const char* mode, void* file) {
    return (void*)freopen64(filename, mode, (FILE*)file);
}

int32_t libc_hurd_mod_creat64(const char* path, uint32_t mode) {
    return (int32_t)creat64(path, mode);
}

int32_t libc_hurd_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_hurd_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_hurd_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

void* libc_hurd_mod_tmpfile64(void) {
    return (void*)tmpfile64();
}

void* libc_hurd_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_hurd_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_hurd_mod_close_range(uint32_t first, uint32_t last, int32_t flags) {
    return (int32_t)close_range(first, last, flags);
}

int32_t libc_hurd_mod_openpty(void* __amaster, void* __aslave, char* __name, void* __termp, void* __winp) {
    return (int32_t)openpty(__amaster, __aslave, __name, __termp, __winp);
}

int32_t libc_hurd_mod_forkpty(void* __amaster, char* __name, void* __termp, void* __winp) {
    return (int32_t)forkpty(__amaster, __name, __termp, __winp);
}

int32_t libc_hurd_mod_getpt(void) {
    return (int32_t)getpt();
}

int32_t libc_hurd_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_hurd_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

char* libc_hurd_mod_ctermid(char* s) {
    return (char*)ctermid(s);
}

int32_t libc_hurd_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_hurd_mod_execveat(int32_t dirfd, const char* pathname, void* argv, void* envp, int32_t flags) {
    return (int32_t)execveat(dirfd, pathname, argv, envp, flags);
}

int32_t libc_hurd_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_hurd_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_hurd_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_hurd_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_hurd_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_hurd_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_hurd_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_hurd_mod_posix_spawnattr_getsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_hurd_mod_posix_spawnattr_setsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_hurd_mod_posix_spawnattr_getsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_hurd_mod_posix_spawnattr_setsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_hurd_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_hurd_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_hurd_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addchdir_np(void* actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir_np(actions, path);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addfchdir_np(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir_np(actions, fd);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addclosefrom_np(void* actions, int32_t from) {
    return (int32_t)posix_spawn_file_actions_addclosefrom_np(actions, from);
}

int32_t libc_hurd_mod_posix_spawn_file_actions_addtcsetpgrp_np(void* actions, int32_t tcfd) {
    return (int32_t)posix_spawn_file_actions_addtcsetpgrp_np(actions, tcfd);
}

int32_t libc_hurd_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_hurd_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

int32_t libc_hurd_mod_euidaccess(const char* pathname, int32_t mode) {
    return (int32_t)euidaccess(pathname, mode);
}

int32_t libc_hurd_mod_eaccess(const char* pathname, int32_t mode) {
    return (int32_t)eaccess(pathname, mode);
}

int32_t libc_hurd_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_hurd_mod_stat(const char* __file, void* __buf) {
    return (int32_t)stat(__file, __buf);
}

int32_t libc_hurd_mod_stat64(const char* __file, void* __buf) {
    return (int32_t)stat64(__file, __buf);
}

void* libc_hurd_mod_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_hurd_mod_readdir64(void* dirp) {
    return (void*)readdir64((DIR*)dirp);
}

int32_t libc_hurd_mod_readdir_r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir_r((DIR*)dirp, entry, result);
}

int32_t libc_hurd_mod_readdir64r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir64_r((DIR*)dirp, entry, result);
}

void libc_hurd_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_hurd_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_hurd_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_hurd_mod_strerror_r(int32_t __errnum, char* __buf, uint64_t __buflen) {
    return (int32_t)__xpg_strerror_r(__errnum, __buf, __buflen);
}

void* libc_hurd_mod_errno_location(void) {
    return (void*)__errno_location();
}

void* libc_hurd_mod_mmap64(void* __addr, uint64_t __len, int32_t __prot, int32_t __flags, int32_t __fd, int64_t __offset) {
    return (void*)mmap64(__addr, __len, __prot, __flags, __fd, __offset);
}

int32_t libc_hurd_mod_mprotect(void* __addr, uint64_t __len, int32_t __prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(__addr, __len, __prot);
#else
    (void)__addr;
    (void)__len;
    (void)__prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_hurd_mod_msync(void* __addr, uint64_t __len, int32_t __flags) {
#if !defined(_WIN32)
    return (int32_t)msync(__addr, __len, __flags);
#else
    (void)__addr;
    (void)__len;
    (void)__flags;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_hurd_mod_sync(void) {
    sync();
}

int32_t libc_hurd_mod_syncfs(int32_t fd) {
    return (int32_t)syncfs(fd);
}

int32_t libc_hurd_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_hurd_mod_fallocate64(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate64(fd, mode, offset, len);
}

int32_t libc_hurd_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_hurd_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate64(fd, offset, len);
}

int32_t libc_hurd_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_hurd_mod_posix_fadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise64(fd, offset, len, advise);
}

int32_t libc_hurd_mod_madvise(void* __addr, uint64_t __len, int32_t __advice) {
    return (int32_t)madvise(__addr, __len, __advice);
}

int32_t libc_hurd_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_hurd_mod_getrlimit(uint32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_hurd_mod_getrlimit64(uint32_t resource, void* rlim) {
    return (int32_t)getrlimit64(resource, rlim);
}

int32_t libc_hurd_mod_setrlimit(uint32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_hurd_mod_setrlimit64(uint32_t resource, void* rlim) {
    return (int32_t)setrlimit64(resource, rlim);
}

int32_t libc_hurd_mod_getpriority(uint32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_hurd_mod_setpriority(uint32_t which, uint32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int64_t libc_hurd_mod_getrandom(void* __buffer, uint64_t __length, uint32_t __flags) {
    return (int64_t)getrandom(__buffer, __length, __flags);
}

int32_t libc_hurd_mod_getentropy(void* __buffer, uint64_t __length) {
    return (int32_t)getentropy(__buffer, __length);
}

void* libc_hurd_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

void* libc_hurd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

char* libc_hurd_mod_strchrnul(const char* s, int32_t c) {
    return (char*)strchrnul(s, c);
}

int32_t libc_hurd_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_hurd_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_hurd_mod_rand(void) {
    return (int32_t)rand();
}

void libc_hurd_mod_srand(uint32_t seed) {
    srand(seed);
}

double libc_hurd_mod_drand48(void) {
    return (double)drand48();
}

double libc_hurd_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_hurd_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_hurd_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int64_t libc_hurd_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_hurd_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_hurd_mod_srand48(int64_t seed) {
    srand48(seed);
}

void* libc_hurd_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_hurd_mod_lcong48(void* p) {
    lcong48(p);
}

void libc_hurd_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* compar, void* arg) {
    qsort_r(base, num, size, compar, arg);
}

int32_t libc_hurd_mod_brk(void* addr) {
    return (int32_t)brk(addr);
}

void* libc_hurd_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

void* libc_hurd_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_hurd_mod_mallopt(int32_t param, int32_t value) {
    return (int32_t)mallopt(param, value);
}

int32_t libc_hurd_mod_mallinfo(void) {
    return (int32_t)mallinfo();
}

int32_t libc_hurd_mod_mallinfo2(void) {
    return (int32_t)mallinfo2();
}

int32_t libc_hurd_mod_malloc_info(int32_t options, void* stream) {
    return (int32_t)malloc_info(options, (FILE*)stream);
}

uint64_t libc_hurd_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

int32_t libc_hurd_mod_malloc_trim(uint64_t __pad) {
    return (int32_t)malloc_trim(__pad);
}

void* libc_hurd_mod_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

uint64_t libc_hurd_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_hurd_mod_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

int32_t libc_hurd_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

int32_t libc_hurd_mod_backtrace(void* buf, int32_t sz) {
    return (int32_t)backtrace(buf, sz);
}

int32_t libc_hurd_mod_reboot(int32_t how_to) {
    return (int32_t)reboot(how_to);
}

int32_t libc_hurd_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

int32_t libc_hurd_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_hurd_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_hurd_mod_regfree(void* preg) {
    regfree(preg);
}

int32_t libc_hurd_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_hurd_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_hurd_mod_glob64(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob64(pattern, flags, errfunc, pglob);
}

void libc_hurd_mod_globfree64(void* pglob) {
    globfree64(pglob);
}

int64_t libc_hurd_mod_getxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)getxattr(path, name, value, size);
}

int64_t libc_hurd_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)lgetxattr(path, name, value, size);
}

int64_t libc_hurd_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size) {
    return (int64_t)fgetxattr(filedes, name, value, size);
}

int32_t libc_hurd_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)setxattr(path, name, value, size, flags);
}

int32_t libc_hurd_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)lsetxattr(path, name, value, size, flags);
}

int32_t libc_hurd_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)fsetxattr(filedes, name, value, size, flags);
}

int64_t libc_hurd_mod_listxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)listxattr(path, list, size);
}

int64_t libc_hurd_mod_llistxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)llistxattr(path, list, size);
}

int64_t libc_hurd_mod_flistxattr(int32_t filedes, char* list, uint64_t size) {
    return (int64_t)flistxattr(filedes, list, size);
}

int32_t libc_hurd_mod_removexattr(const char* path, const char* name) {
    return (int32_t)removexattr(path, name);
}

int32_t libc_hurd_mod_lremovexattr(const char* path, const char* name) {
    return (int32_t)lremovexattr(path, name);
}

int32_t libc_hurd_mod_fremovexattr(int32_t filedes, const char* name) {
    return (int32_t)fremovexattr(filedes, name);
}

char* libc_hurd_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_hurd_mod_posix_basename(char* path) {
    return (char*)__xpg_basename(path);
}

char* libc_hurd_mod_gnu_basename(const char* path) {
    return (char*)basename(path);
}

void* libc_hurd_mod_dlmopen(int64_t lmid, const char* filename, int32_t flag) {
    return (void*)dlmopen(lmid, filename, flag);
}

int32_t libc_hurd_mod_dlinfo(void* handle, int32_t request, void* info) {
    return (int32_t)dlinfo(handle, request, info);
}

int32_t libc_hurd_mod_dladdr1(void* addr, void* info, void* extra_info, int32_t flags) {
    return (int32_t)dladdr1(addr, info, extra_info, flags);
}

void* libc_hurd_mod_duplocale(void* base) {
    return (void*)duplocale(base);
}

void libc_hurd_mod_freelocale(void* loc) {
    freelocale(loc);
}

void* libc_hurd_mod_newlocale(int32_t mask, const char* locale, void* base) {
    return (void*)newlocale(mask, locale, base);
}

void* libc_hurd_mod_uselocale(void* loc) {
    return (void*)uselocale(loc);
}

char* libc_hurd_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

char* libc_hurd_mod_nl_langinfo_l(int32_t item, void* locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_hurd_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

const char* libc_hurd_mod_gnu_get_libc_release(void) {
    return (const char*)gnu_get_libc_release();
}

const char* libc_hurd_mod_gnu_get_libc_version(void) {
    return (const char*)gnu_get_libc_version();
}

