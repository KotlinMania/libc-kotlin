#include "linux_l4re_shared_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/mman.h>
#include <dirent.h>
#include <sys/socket.h>
#endif

int32_t libc_linux_l4re_shared_iopl(int32_t level) {
    return (int32_t)iopl(level);
}

int32_t libc_linux_l4re_shared_ioperm(uint64_t from, uint64_t num, int32_t turn_on) {
    return (int32_t)ioperm(from, num, turn_on);
}

int32_t libc_linux_l4re_shared_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int32_t libc_linux_l4re_shared_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_linux_l4re_shared_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_linux_l4re_shared_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int64_t libc_linux_l4re_shared_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_linux_l4re_shared_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_linux_l4re_shared_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_linux_l4re_shared_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

int64_t libc_linux_l4re_shared_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_linux_l4re_shared_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_linux_l4re_shared_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_linux_l4re_shared_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

int64_t libc_linux_l4re_shared_process_vm_readv(int32_t pid, void* local_iov, uint64_t liovcnt, void* remote_iov, uint64_t riovcnt, uint64_t flags) {
    return (int64_t)process_vm_readv(pid, local_iov, liovcnt, remote_iov, riovcnt, flags);
}

int64_t libc_linux_l4re_shared_process_vm_writev(int32_t pid, void* local_iov, uint64_t liovcnt, void* remote_iov, uint64_t riovcnt, uint64_t flags) {
    return (int64_t)process_vm_writev(pid, local_iov, liovcnt, remote_iov, riovcnt, flags);
}

int32_t libc_linux_l4re_shared_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

int32_t libc_linux_l4re_shared_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_linux_l4re_shared_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_linux_l4re_shared_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_linux_l4re_shared_rand(void) {
    return (int32_t)rand();
}

void libc_linux_l4re_shared_srand(uint32_t seed) {
    srand(seed);
}

double libc_linux_l4re_shared_drand48(void) {
    return (double)drand48();
}

double libc_linux_l4re_shared_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_linux_l4re_shared_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_linux_l4re_shared_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int64_t libc_linux_l4re_shared_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_linux_l4re_shared_srand48(int64_t seed) {
    srand48(seed);
}

void libc_linux_l4re_shared_setpwent(void) {
    setpwent();
}

void libc_linux_l4re_shared_endpwent(void) {
    endpwent();
}

void* libc_linux_l4re_shared_getpwent(void) {
    return (void*)getpwent();
}

void libc_linux_l4re_shared_setgrent(void) {
    setgrent();
}

void libc_linux_l4re_shared_endgrent(void) {
    endgrent();
}

void* libc_linux_l4re_shared_getgrent(void) {
    return (void*)getgrent();
}

void libc_linux_l4re_shared_setspent(void) {
    setspent();
}

void libc_linux_l4re_shared_endspent(void) {
    endspent();
}

void* libc_linux_l4re_shared_getspent(void) {
    return (void*)getspent();
}

void* libc_linux_l4re_shared_getspnam(const char* name) {
    return (void*)getspnam(name);
}

int32_t libc_linux_l4re_shared_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

void* libc_linux_l4re_shared_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_linux_l4re_shared_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_linux_l4re_shared_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_linux_l4re_shared_mprotect(void* addr, uint64_t len, int32_t prot) {
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

void* libc_linux_l4re_shared_errno_location(void) {
    return (void*)__errno_location();
}

int32_t libc_linux_l4re_shared_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_linux_l4re_shared_globfree(void* pglob) {
    globfree(pglob);
}

void libc_linux_l4re_shared_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_linux_l4re_shared_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_linux_l4re_shared_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_linux_l4re_shared_msync(void* addr, uint64_t len, int32_t flags) {
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

int64_t libc_linux_l4re_shared_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

char* libc_linux_l4re_shared_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

char* libc_linux_l4re_shared_nl_langinfo_l(int32_t item, int32_t locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_linux_l4re_shared_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_linux_l4re_shared_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_linux_l4re_shared_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int32_t libc_linux_l4re_shared_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_linux_l4re_shared_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_linux_l4re_shared_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data) {
    return (int32_t)mount(src, target, fstype, flags, data);
}

int32_t libc_linux_l4re_shared_ppoll(void* fds, int32_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int32_t libc_linux_l4re_shared_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_linux_l4re_shared_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_linux_l4re_shared_sysinfo(void* info) {
    return (int32_t)sysinfo(info);
}

int32_t libc_linux_l4re_shared_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_linux_l4re_shared_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_linux_l4re_shared_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_linux_l4re_shared_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_linux_l4re_shared_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

void* libc_linux_l4re_shared_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_linux_l4re_shared_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_linux_l4re_shared_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_linux_l4re_shared_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

void* libc_linux_l4re_shared_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_linux_l4re_shared_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_linux_l4re_shared_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_linux_l4re_shared_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

void* libc_linux_l4re_shared_setmntent(const char* filename, const char* ty) {
    return (void*)setmntent(filename, ty);
}

void* libc_linux_l4re_shared_getmntent(void* stream) {
    return (void*)getmntent((FILE*)stream);
}

int32_t libc_linux_l4re_shared_addmntent(void* stream, void* mnt) {
    return (int32_t)addmntent((FILE*)stream, mnt);
}

int32_t libc_linux_l4re_shared_endmntent(void* streamp) {
    return (int32_t)endmntent((FILE*)streamp);
}

char* libc_linux_l4re_shared_hasmntopt(void* mnt, const char* opt) {
    return (char*)hasmntopt(mnt, opt);
}

int32_t libc_linux_l4re_shared_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

int32_t libc_linux_l4re_shared_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_linux_l4re_shared_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_linux_l4re_shared_regfree(void* preg) {
    regfree(preg);
}

void* libc_linux_l4re_shared_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

uint64_t libc_linux_l4re_shared_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_linux_l4re_shared_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

int32_t libc_linux_l4re_shared_gettid(void) {
    return (int32_t)gettid();
}

int32_t libc_linux_l4re_shared_timer_create(int32_t clockid, void* sevp, void* timerid) {
    return (int32_t)timer_create(clockid, sevp, timerid);
}

int32_t libc_linux_l4re_shared_timer_delete(int32_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_linux_l4re_shared_timer_getoverrun(int32_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_linux_l4re_shared_timer_gettime(int32_t timerid, void* curr_value) {
    return (int32_t)timer_gettime(timerid, curr_value);
}

int32_t libc_linux_l4re_shared_timer_settime(int32_t timerid, int32_t flags, void* new_value, void* old_value) {
    return (int32_t)timer_settime(timerid, flags, new_value, old_value);
}

void* libc_linux_l4re_shared_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_linux_l4re_shared_sched_getcpu(void) {
    return (int32_t)sched_getcpu();
}

int32_t libc_linux_l4re_shared_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

int64_t libc_linux_l4re_shared_copy_file_range(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags) {
    return (int64_t)copy_file_range(fd_in, off_in, fd_out, off_out, len, flags);
}

void* libc_linux_l4re_shared_freopen64(const char* filename, const char* mode, void* file) {
    return (void*)freopen64(filename, mode, (FILE*)file);
}

int32_t libc_linux_l4re_shared_fseeko64(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko64((FILE*)stream, offset, whence);
}

int32_t libc_linux_l4re_shared_fsetpos64(void* stream, void* ptr) {
    return (int32_t)fsetpos64((FILE*)stream, ptr);
}

int64_t libc_linux_l4re_shared_ftello64(void* stream) {
    return (int64_t)ftello64((FILE*)stream);
}

