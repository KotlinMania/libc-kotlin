#include "aix_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <pthread.h>
#include <sys/socket.h>
#include <dirent.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <semaphore.h>
#endif

int32_t libc_aix_mod_thr_kill(uint32_t id, int32_t sig) {
    return (int32_t)thr_kill(id, sig);
}

uint32_t libc_aix_mod_thr_self(void) {
    return (uint32_t)thr_self();
}

int32_t libc_aix_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

int32_t libc_aix_mod_pthread_attr_getdetachstate(void* attr, void* detachstate) {
    return (int32_t)pthread_attr_getdetachstate(attr, detachstate);
}

int32_t libc_aix_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_aix_mod_pthread_attr_getinheritsched(void* attr, void* inheritsched) {
    return (int32_t)pthread_attr_getinheritsched(attr, inheritsched);
}

int32_t libc_aix_mod_pthread_attr_getschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_getschedparam(attr, param);
}

int32_t libc_aix_mod_pthread_attr_getstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_getstackaddr(attr, stackaddr);
}

int32_t libc_aix_mod_pthread_attr_getschedpolicy(void* attr, void* policy) {
    return (int32_t)pthread_attr_getschedpolicy(attr, policy);
}

int32_t libc_aix_mod_pthread_attr_getscope(void* attr, void* contentionscope) {
    return (int32_t)pthread_attr_getscope(attr, contentionscope);
}

int32_t libc_aix_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_aix_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_aix_mod_pthread_attr_setinheritsched(void* attr, int32_t inheritsched) {
    return (int32_t)pthread_attr_setinheritsched(attr, inheritsched);
}

int32_t libc_aix_mod_pthread_attr_setschedparam(void* attr, void* param) {
    return (int32_t)pthread_attr_setschedparam(attr, param);
}

int32_t libc_aix_mod_pthread_attr_setschedpolicy(void* attr, int32_t policy) {
    return (int32_t)pthread_attr_setschedpolicy(attr, policy);
}

int32_t libc_aix_mod_pthread_attr_setscope(void* attr, int32_t contentionscope) {
    return (int32_t)pthread_attr_setscope(attr, contentionscope);
}

int32_t libc_aix_mod_pthread_attr_setstack(void* attr, void* stackaddr, uint64_t stacksize) {
    return (int32_t)pthread_attr_setstack(attr, stackaddr, stacksize);
}

int32_t libc_aix_mod_pthread_attr_setstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_setstackaddr(attr, stackaddr);
}

int32_t libc_aix_mod_pthread_barrierattr_destroy(void* attr) {
    return (int32_t)pthread_barrierattr_destroy(attr);
}

int32_t libc_aix_mod_pthread_barrierattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_barrierattr_getpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_barrierattr_init(void* attr) {
    return (int32_t)pthread_barrierattr_init(attr);
}

int32_t libc_aix_mod_pthread_barrierattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_barrierattr_setpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_barrier_destroy(void* barrier) {
    return (int32_t)pthread_barrier_destroy(barrier);
}

int32_t libc_aix_mod_pthread_barrier_init(void* barrier, void* attr, uint32_t count) {
    return (int32_t)pthread_barrier_init(barrier, attr, count);
}

int32_t libc_aix_mod_pthread_barrier_wait(void* barrier) {
    return (int32_t)pthread_barrier_wait(barrier);
}

int32_t libc_aix_mod_pthread_cancel(uint32_t thread) {
    return (int32_t)pthread_cancel(thread);
}

void libc_aix_mod_pthread_cleanup_pop(int32_t execute) {
    pthread_cleanup_pop(execute);
}

void libc_aix_mod_pthread_cleanup_push(void* routine, void* arg) {
    pthread_cleanup_push(routine, arg);
}

int32_t libc_aix_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_aix_mod_pthread_condattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_condattr_getpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_condattr_setclock(void* attr, int64_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_aix_mod_pthread_condattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_condattr_setpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_create(void* thread, void* attr, int32_t start_routine, void* arg) {
    return (int32_t)pthread_create(thread, attr, start_routine, arg);
}

int32_t libc_aix_mod_pthread_getconcurrency(void) {
    return (int32_t)pthread_getconcurrency();
}

int32_t libc_aix_mod_pthread_getcpuclockid(uint32_t thread_id, void* clock_id) {
    return (int32_t)pthread_getcpuclockid(thread_id, clock_id);
}

int32_t libc_aix_mod_pthread_getschedparam(uint32_t thread, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(thread, policy, param);
}

int32_t libc_aix_mod_pthread_kill(uint32_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_aix_mod_pthread_mutexattr_getprioceiling(void* attr, void* prioceiling) {
    return (int32_t)pthread_mutexattr_getprioceiling(attr, prioceiling);
}

int32_t libc_aix_mod_pthread_mutexattr_getprotocol(void* attr, void* protocol) {
    return (int32_t)pthread_mutexattr_getprotocol(attr, protocol);
}

int32_t libc_aix_mod_pthread_mutexattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_mutexattr_getpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_mutexattr_getrobust(void* attr, void* robust) {
    return (int32_t)pthread_mutexattr_getrobust(attr, robust);
}

int32_t libc_aix_mod_pthread_mutexattr_gettype(void* attr, void* _type) {
    return (int32_t)pthread_mutexattr_gettype(attr, _type);
}

int32_t libc_aix_mod_pthread_mutexattr_setprioceiling(void* attr, int32_t prioceiling) {
    return (int32_t)pthread_mutexattr_setprioceiling(attr, prioceiling);
}

int32_t libc_aix_mod_pthread_mutexattr_setprotocol(void* attr, int32_t protocol) {
    return (int32_t)pthread_mutexattr_setprotocol(attr, protocol);
}

int32_t libc_aix_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_mutexattr_setrobust(void* attr, int32_t robust) {
    return (int32_t)pthread_mutexattr_setrobust(attr, robust);
}

int32_t libc_aix_mod_pthread_mutex_consistent(void* mutex) {
    return (int32_t)pthread_mutex_consistent(mutex);
}

int32_t libc_aix_mod_pthread_mutex_getprioceiling(void* mutex, void* prioceiling) {
    return (int32_t)pthread_mutex_getprioceiling(mutex, prioceiling);
}

int32_t libc_aix_mod_pthread_mutex_setprioceiling(void* mutex, int32_t prioceiling, void* old_ceiling) {
    return (int32_t)pthread_mutex_setprioceiling(mutex, prioceiling, old_ceiling);
}

int32_t libc_aix_mod_pthread_mutex_timedlock(void* mutex, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(mutex, abstime);
}

int32_t libc_aix_mod_pthread_once(void* once_control, void* init_routine) {
    return (int32_t)pthread_once(once_control, (void (*)(void))init_routine);
}

int32_t libc_aix_mod_pthread_rwlockattr_getpshared(void* attr, void* pshared) {
    return (int32_t)pthread_rwlockattr_getpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_rwlockattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_rwlockattr_setpshared(attr, pshared);
}

int32_t libc_aix_mod_pthread_rwlock_timedrdlock(void* rwlock, void* abstime) {
    return (int32_t)pthread_rwlock_timedrdlock(rwlock, abstime);
}

int32_t libc_aix_mod_pthread_rwlock_timedwrlock(void* rwlock, void* abstime) {
    return (int32_t)pthread_rwlock_timedwrlock(rwlock, abstime);
}

int32_t libc_aix_mod_pthread_setcancelstate(int32_t state, void* oldstate) {
    return (int32_t)pthread_setcancelstate(state, oldstate);
}

int32_t libc_aix_mod_pthread_setcanceltype(int32_t _type, void* oldtype) {
    return (int32_t)pthread_setcanceltype(_type, oldtype);
}

int32_t libc_aix_mod_pthread_setconcurrency(int32_t new_level) {
    return (int32_t)pthread_setconcurrency(new_level);
}

int32_t libc_aix_mod_pthread_setschedparam(uint32_t thread, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(thread, policy, param);
}

int32_t libc_aix_mod_pthread_setschedprio(uint32_t thread, int32_t prio) {
    return (int32_t)pthread_setschedprio(thread, prio);
}

int32_t libc_aix_mod_pthread_sigmask(int32_t how, void* set, void* oset) {
    return (int32_t)pthread_sigmask(how, set, oset);
}

int32_t libc_aix_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_aix_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_aix_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_aix_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_aix_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

void libc_aix_mod_pthread_testcancel(void) {
    pthread_testcancel();
}

uint64_t libc_aix_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_aix_mod_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

void* libc_aix_mod_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

int32_t libc_aix_mod_acct(char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_aix_mod_aio_cancel(int32_t fildes, void* aiocbp) {
    return (int32_t)_posix_aio_cancel(fildes, aiocbp);
}

int32_t libc_aix_mod_aio_error(void* aiocbp) {
    return (int32_t)_posix_aio_error(aiocbp);
}

int32_t libc_aix_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)_posix_aio_fsync(op, aiocbp);
}

int32_t libc_aix_mod_aio_read(void* aiocbp) {
    return (int32_t)_posix_aio_read(aiocbp);
}

int64_t libc_aix_mod_aio_return(void* aiocbp) {
    return (int64_t)_posix_aio_return(aiocbp);
}

int32_t libc_aix_mod_aio_suspend(void* list, int32_t nent, void* timeout) {
    return (int32_t)_posix_aio_suspend(list, nent, timeout);
}

int32_t libc_aix_mod_aio_write(void* aiocbp) {
    return (int32_t)_posix_aio_write(aiocbp);
}

char* libc_aix_mod_basename(char* path) {
    return (char*)basename(path);
}

int32_t libc_aix_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int32_t libc_aix_mod_brk(void* addr) {
    return (int32_t)brk(addr);
}

int32_t libc_aix_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_aix_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_aix_mod_clock_getres(int64_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_aix_mod_clock_gettime(int64_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_aix_mod_clock_nanosleep(int64_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_aix_mod_clock_settime(int64_t clock_id, void* tp) {
    return (int32_t)clock_settime(clock_id, tp);
}

int32_t libc_aix_mod_creat64(const char* path, uint32_t mode) {
    return (int32_t)creat64(path, mode);
}

char* libc_aix_mod_ctermid(char* s) {
    return (char*)ctermid(s);
}

int32_t libc_aix_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

char* libc_aix_mod_dirname(char* path) {
    return (char*)dirname(path);
}

double libc_aix_mod_drand48(void) {
    return (double)drand48();
}

int32_t libc_aix_mod_duplocale(int32_t arg1) {
    return (int32_t)duplocale(arg1);
}

void libc_aix_mod_endgrent(void) {
    endgrent();
}

int32_t libc_aix_mod_endmntent(void* streamp) {
    return (int32_t)endmntent((FILE*)streamp);
}

void libc_aix_mod_endpwent(void) {
    endpwent();
}

void libc_aix_mod_endutent(void) {
    endutent();
}

void libc_aix_mod_endutxent(void) {
    endutxent();
}

double libc_aix_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int32_t libc_aix_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_aix_mod_fattach(int32_t fildes, const char* path) {
    return (int32_t)fattach(fildes, path);
}

int32_t libc_aix_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_aix_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_aix_mod_ffs(int32_t value) {
    return (int32_t)ffs(value);
}

int32_t libc_aix_mod_ffsl(int64_t value) {
    return (int32_t)ffsl(value);
}

int32_t libc_aix_mod_ffsll(int64_t value) {
    return (int32_t)ffsll(value);
}

void* libc_aix_mod_fgetgrent(void* file) {
    return (void*)fgetgrent((FILE*)file);
}

int32_t libc_aix_mod_fgetpos64(void* stream, void* ptr) {
    return (int32_t)fgetpos64((FILE*)stream, ptr);
}

void* libc_aix_mod_fgetpwent(void* file) {
    return (void*)fgetpwent((FILE*)file);
}

void* libc_aix_mod_fopen64(const char* filename, const char* mode) {
    return (void*)fopen64(filename, mode);
}

void libc_aix_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

void* libc_aix_mod_freopen64(const char* filename, const char* mode, void* file) {
    return (void*)freopen64(filename, mode, (FILE*)file);
}

int32_t libc_aix_mod_fseeko64(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko64((FILE*)stream, offset, whence);
}

int32_t libc_aix_mod_fsetpos64(void* stream, void* ptr) {
    return (int32_t)fsetpos64((FILE*)stream, ptr);
}

int32_t libc_aix_mod_fstat64(int32_t fildes, void* buf) {
    return (int32_t)fstat64(fildes, buf);
}

int32_t libc_aix_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_aix_mod_fstatfs64(int32_t fd, void* buf) {
    return (int32_t)fstatfs64(fd, buf);
}

int32_t libc_aix_mod_fstatvfs64(int32_t fd, void* buf) {
    return (int32_t)fstatvfs64(fd, buf);
}

int64_t libc_aix_mod_ftello64(void* stream) {
    return (int64_t)ftello64((FILE*)stream);
}

int32_t libc_aix_mod_ftok(const char* path, int32_t id) {
    return (int32_t)ftok(path, id);
}

int32_t libc_aix_mod_ftruncate64(int32_t fd, int64_t length) {
    return (int32_t)ftruncate64(fd, length);
}

int32_t libc_aix_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_aix_mod_getcontext(void* ucp) {
    return (int32_t)getcontext(ucp);
}

int32_t libc_aix_mod_getdomainname(char* name, int32_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_aix_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

void* libc_aix_mod_getgrent(void) {
    return (void*)getgrent();
}

void* libc_aix_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

int32_t libc_aix_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)_posix_getgrgid_r(gid, grp, buf, buflen, result);
}

void* libc_aix_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_aix_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)_posix_getgrnam_r(name, grp, buf, buflen, result);
}

char* libc_aix_mod_getgrset(const char* user) {
    return (char*)getgrset(user);
}

int64_t libc_aix_mod_gethostid(void) {
    return (int64_t)gethostid();
}

void* libc_aix_mod_getmntent(void* stream) {
    return (void*)getmntent((FILE*)stream);
}

int32_t libc_aix_mod_getnameinfo(void* sa, uint64_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_aix_mod_getpagesize(void) {
    return (int32_t)getpagesize();
}

int32_t libc_aix_mod_getpeereid(int32_t socket, void* euid, void* egid) {
    return (int32_t)getpeereid(socket, euid, egid);
}

int32_t libc_aix_mod_getpriority(int32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

void* libc_aix_mod_getpwent(void) {
    return (void*)getpwent();
}

int32_t libc_aix_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)_posix_getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_aix_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)_posix_getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_aix_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_aix_mod_getrlimit64(int32_t resource, void* rlim) {
    return (int32_t)getrlimit64(resource, rlim);
}

int32_t libc_aix_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_aix_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

void* libc_aix_mod_getutent(void) {
    return (void*)getutent();
}

void* libc_aix_mod_getutid(void* u) {
    return (void*)getutid(u);
}

void* libc_aix_mod_getutline(void* u) {
    return (void*)getutline(u);
}

void* libc_aix_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_aix_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_aix_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

int32_t libc_aix_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_aix_mod_globfree(void* pglob) {
    globfree(pglob);
}

char* libc_aix_mod_hasmntopt(void* mnt, const char* opt) {
    return (char*)hasmntopt(mnt, opt);
}

int32_t libc_aix_mod_hcreate(uint64_t nelt) {
    return (int32_t)hcreate(nelt);
}

void libc_aix_mod_hdestroy(void) {
    hdestroy();
}

void* libc_aix_mod_hsearch(int32_t entry, int32_t action) {
    return (void*)hsearch(entry, action);
}

void libc_aix_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

void* libc_aix_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

int32_t libc_aix_mod_initgroups(const char* name, uint32_t basegid) {
    return (int32_t)initgroups(name, basegid);
}

int64_t libc_aix_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_aix_mod_lcong48(void* p) {
    lcong48(p);
}

void* libc_aix_mod_lfind(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lfind(key, base, nelp, width, compar);
}

int32_t libc_aix_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nent, void* sevp) {
    return (int32_t)_posix_lio_listio(mode, aiocb_list, nent, sevp);
}

int32_t libc_aix_mod_lpar_get_info(int32_t command, void* buf, uint64_t bufsize) {
    return (int32_t)lpar_get_info(command, buf, bufsize);
}

int32_t libc_aix_mod_lpar_set_resources(int32_t id, void* resource) {
    return (int32_t)lpar_set_resources(id, resource);
}

int64_t libc_aix_mod_lrand48(void) {
    return (int64_t)lrand48();
}

void* libc_aix_mod_lsearch(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lsearch(key, base, nelp, width, compar);
}

int64_t libc_aix_mod_lseek64(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek64(fd, offset, whence);
}

int32_t libc_aix_mod_lstat64(const char* path, void* buf) {
    return (int32_t)lstat64(path, buf);
}

int32_t libc_aix_mod_madvise(char* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_aix_mod_mallinfo(void) {
    return (int32_t)mallinfo();
}

int32_t libc_aix_mod_mallopt(int32_t param, int32_t value) {
    return (int32_t)mallopt(param, value);
}

void* libc_aix_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_aix_mod_memset_s(void* s, uint64_t smax, int32_t c, uint64_t n) {
    return (int32_t)memset_s(s, smax, c, n);
}

int32_t libc_aix_mod_mincore(char* addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_aix_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_aix_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint64_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_aix_mod_mount(const char* device, const char* path, int32_t flags) {
    return (int32_t)mount(device, path, flags);
}

int32_t libc_aix_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_aix_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_aix_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_aix_mod_mq_notify(int32_t mqd, void* notification) {
    return (int32_t)mq_notify(mqd, notification);
}

int64_t libc_aix_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_aix_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_aix_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int64_t libc_aix_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_aix_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_aix_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_aix_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int32_t libc_aix_mod_msgctl(int32_t msqid, int32_t cmd, void* buf) {
    return (int32_t)msgctl(msqid, cmd, buf);
}

int32_t libc_aix_mod_msgget(int32_t key, int32_t msgflg) {
    return (int32_t)msgget(key, msgflg);
}

int64_t libc_aix_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

int32_t libc_aix_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg) {
    return (int32_t)msgsnd(msqid, msgp, msgsz, msgflg);
}

int32_t libc_aix_mod_msync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_aix_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

char* libc_aix_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

char* libc_aix_mod_nl_langinfo_l(int32_t item, int32_t loc) {
    return (char*)nl_langinfo_l(item, loc);
}

int64_t libc_aix_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int32_t libc_aix_mod_pollset_create(int32_t maxfd) {
    return (int32_t)pollset_create(maxfd);
}

int32_t libc_aix_mod_pollset_ctl(int32_t ps, void* pollctl_array, int32_t array_length) {
    return (int32_t)pollset_ctl(ps, pollctl_array, array_length);
}

int32_t libc_aix_mod_pollset_destroy(int32_t ps) {
    return (int32_t)pollset_destroy(ps);
}

int32_t libc_aix_mod_pollset_poll(int32_t ps, void* polldata_array, int32_t array_length, int32_t timeout) {
    return (int32_t)pollset_poll(ps, polldata_array, array_length, timeout);
}

int32_t libc_aix_mod_pollset_query(int32_t ps, void* pollfd_query) {
    return (int32_t)pollset_query(ps, pollfd_query);
}

void* libc_aix_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_aix_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_aix_mod_posix_fadvise64(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise64(fd, offset, len, advise);
}

int32_t libc_aix_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_aix_mod_posix_fallocate64(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate64(fd, offset, len);
}

int32_t libc_aix_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_aix_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_aix_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_aix_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

int32_t libc_aix_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_aix_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_aix_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_aix_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_aix_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_getschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_getschedparam(attr, param);
}

int32_t libc_aix_mod_posix_spawnattr_getschedpolicy(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getschedpolicy(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_getsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_aix_mod_posix_spawnattr_getsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_aix_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_aix_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_setschedparam(void* attr, void* param) {
    return (int32_t)posix_spawnattr_setschedparam(attr, param);
}

int32_t libc_aix_mod_posix_spawnattr_setschedpolicy(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setschedpolicy(attr, flags);
}

int32_t libc_aix_mod_posix_spawnattr_setsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_aix_mod_posix_spawnattr_setsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_aix_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int64_t libc_aix_mod_pread64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread64(fd, buf, count, offset);
}

int64_t libc_aix_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_aix_mod_ptrace64(int32_t request, int64_t id, int64_t addr, int32_t data, void* buff) {
    return (int32_t)ptrace64(request, id, addr, data, buff);
}

void* libc_aix_mod_pututline(void* u) {
    return (void*)pututline(u);
}

void* libc_aix_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

int64_t libc_aix_mod_pwrite64(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite64(fd, buf, count, offset);
}

int64_t libc_aix_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int32_t libc_aix_mod_quotactl(char* cmd, int32_t special, int32_t id, char* data) {
    return (int32_t)quotactl(cmd, special, id, data);
}

int32_t libc_aix_mod_rand(void) {
    return (int32_t)rand();
}

int64_t libc_aix_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_aix_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)nrecvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_aix_mod_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}

int64_t libc_aix_mod_recvmsg(int32_t sockfd, void* msg, int32_t flags) {
    return (int64_t)nrecvmsg(sockfd, msg, flags);
}

int32_t libc_aix_mod_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

uint64_t libc_aix_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

int32_t libc_aix_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

void libc_aix_mod_regfree(void* preg) {
    regfree(preg);
}

void* libc_aix_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_aix_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_aix_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_aix_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_aix_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_aix_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_aix_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_aix_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_aix_mod_sctp_opt_info(int32_t sd, uint32_t id, int32_t opt, void* arg_size, void* size) {
    return (int32_t)sctp_opt_info(sd, id, opt, arg_size, size);
}

int32_t libc_aix_mod_sctp_peeloff(int32_t s, void* id) {
    return (int32_t)sctp_peeloff(s, id);
}

void* libc_aix_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_aix_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int32_t libc_aix_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_aix_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_aix_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_aix_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_aix_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_aix_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_aix_mod_semget(int32_t key, int32_t nsems, int32_t semflag) {
    return (int32_t)semget(key, nsems, semflag);
}

int32_t libc_aix_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int64_t libc_aix_mod_send_file(void* socket, void* iobuf, uint32_t flags) {
    return (int64_t)send_file(socket, iobuf, flags);
}

int32_t libc_aix_mod_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags) {
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
}

int64_t libc_aix_mod_sendmsg(int32_t sockfd, void* msg, int32_t flags) {
    return (int64_t)nsendmsg(sockfd, msg, flags);
}

int32_t libc_aix_mod_setcontext(void* ucp) {
    return (int32_t)setcontext(ucp);
}

int32_t libc_aix_mod_setdomainname(const char* name, int32_t len) {
    return (int32_t)setdomainname(name, len);
}

int32_t libc_aix_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

void libc_aix_mod_setgrent(void) {
    setgrent();
}

int32_t libc_aix_mod_sethostid(int32_t hostid) {
    return (int32_t)sethostid(hostid);
}

int32_t libc_aix_mod_sethostname(const char* name, int32_t len) {
    return (int32_t)sethostname(name, len);
}

void* libc_aix_mod_setmntent(const char* filename, const char* ty) {
    return (void*)setmntent(filename, ty);
}

int32_t libc_aix_mod_setpriority(int32_t which, uint32_t who, int32_t priority) {
    return (int32_t)setpriority(which, who, priority);
}

void libc_aix_mod_setpwent(void) {
    setpwent();
}

int32_t libc_aix_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_aix_mod_setrlimit64(int32_t resource, void* rlim) {
    return (int32_t)setrlimit64(resource, rlim);
}

int32_t libc_aix_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int32_t libc_aix_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

void libc_aix_mod_setutent(void) {
    setutent();
}

void libc_aix_mod_setutxent(void) {
    setutxent();
}

int32_t libc_aix_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_aix_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_aix_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_aix_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_aix_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

void* libc_aix_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_aix_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_aix_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_aix_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

int32_t libc_aix_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_aix_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

int32_t libc_aix_mod_splice(int32_t socket1, int32_t socket2, int32_t flags) {
    return (int32_t)splice(socket1, socket2, flags);
}

void libc_aix_mod_srand(uint32_t seed) {
    srand(seed);
}

void libc_aix_mod_srand48(int64_t seed) {
    srand48(seed);
}

int32_t libc_aix_mod_stat64(const char* path, void* buf) {
    return (int32_t)stat64(path, buf);
}

int32_t libc_aix_mod_stat64at(int32_t dirfd, const char* path, void* buf, int32_t flags) {
    return (int32_t)stat64at(dirfd, path, buf, flags);
}

int32_t libc_aix_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_aix_mod_statfs64(const char* path, void* buf) {
    return (int32_t)statfs64(path, buf);
}

int32_t libc_aix_mod_statvfs64(const char* path, void* buf) {
    return (int32_t)statvfs64(path, buf);
}

int32_t libc_aix_mod_statx(const char* path, void* buf, int32_t length, int32_t command) {
    return (int32_t)statx(path, buf, length, command);
}

int32_t libc_aix_mod_strcasecmp_l(const char* string1, const char* string2, int32_t locale) {
    return (int32_t)strcasecmp_l(string1, string2, locale);
}

int32_t libc_aix_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

uint64_t libc_aix_mod_strftime(char* arg1, uint64_t arg2, const char* arg3, void* arg4) {
    return (uint64_t)strftime(arg1, arg2, arg3, arg4);
}

int32_t libc_aix_mod_strncasecmp_l(const char* string1, const char* string2, uint64_t length, int32_t locale) {
    return (int32_t)strncasecmp_l(string1, string2, length, locale);
}

char* libc_aix_mod_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

char* libc_aix_mod_strsep(void* string, const char* delim) {
    return (char*)strsep(string, delim);
}

int32_t libc_aix_mod_swapcontext(void* uocp, void* ucp) {
    return (int32_t)swapcontext(uocp, ucp);
}

int32_t libc_aix_mod_swapoff(const char* path) {
    return (int32_t)swapoff(path);
}

int32_t libc_aix_mod_swapon(const char* path) {
    return (int32_t)swapon(path);
}

void libc_aix_mod_sync(void) {
    sync();
}

int64_t libc_aix_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_aix_mod_timer_create(int64_t clockid, void* sevp, void* timerid) {
    return (int32_t)timer_create(clockid, sevp, timerid);
}

int32_t libc_aix_mod_timer_delete(int64_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_aix_mod_timer_getoverrun(int64_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_aix_mod_timer_gettime(int64_t timerid, void* value) {
    return (int32_t)timer_gettime(timerid, value);
}

int32_t libc_aix_mod_timer_settime(int64_t timerid, int32_t flags, void* new_value, void* old_value) {
    return (int32_t)timer_settime(timerid, flags, new_value, old_value);
}

int32_t libc_aix_mod_truncate64(const char* path, int64_t length) {
    return (int32_t)truncate64(path, length);
}

int32_t libc_aix_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

void libc_aix_mod_updwtmp(const char* file, void* u) {
    updwtmp(file, u);
}

int32_t libc_aix_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

int32_t libc_aix_mod_utmpname(const char* file) {
    return (int32_t)utmpname(file);
}

int32_t libc_aix_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_aix_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_aix_mod_waitid(uint32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int64_t libc_aix_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

void* libc_aix_mod_errno(void) {
    return (void*)_Errno();
}

