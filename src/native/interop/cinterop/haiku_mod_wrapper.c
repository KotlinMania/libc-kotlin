#include "haiku_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <semaphore.h>
#include <pthread.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <dirent.h>
#include <sys/socket.h>
#endif

int32_t libc_haiku_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_haiku_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_haiku_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_haiku_mod_setpriority(int32_t which, int32_t who, int32_t priority) {
    return (int32_t)setpriority(which, who, priority);
}

void libc_haiku_mod_endusershell(void) {
    endusershell();
}

char* libc_haiku_mod_getpass(const char* prompt) {
    return (char*)getpass(prompt);
}

char* libc_haiku_mod_getusershell(void) {
    return (char*)getusershell();
}

int32_t libc_haiku_mod_issetugid(void) {
    return (int32_t)issetugid();
}

void libc_haiku_mod_setusershell(void) {
    setusershell();
}

int32_t libc_haiku_mod_utimensat(int32_t fd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(fd, path, times, flag);
}

int32_t libc_haiku_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_haiku_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

void* libc_haiku_mod_errnop(void) {
    return (void*)_errnop();
}

int32_t libc_haiku_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_haiku_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_haiku_mod_rand(void) {
    return (int32_t)rand();
}

void libc_haiku_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_haiku_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_haiku_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_haiku_mod_ppoll(void* fds, uint64_t numfds, void* timeout, void* sigMask) {
    return (int32_t)ppoll(fds, numfds, timeout, sigMask);
}

void* libc_haiku_mod_getspent(void) {
    return (void*)getspent();
}

int32_t libc_haiku_mod_getspent_r(void* pwd, char* buf, uint64_t bufferSize, void* res) {
    return (int32_t)getspent_r(pwd, buf, bufferSize, res);
}

void libc_haiku_mod_setspent(void) {
    setspent();
}

void libc_haiku_mod_endspent(void) {
    endspent();
}

void* libc_haiku_mod_getspnam(const char* name) {
    return (void*)getspnam(name);
}

int32_t libc_haiku_mod_getspnam_r(const char* name, void* spwd, char* buffer, uint64_t bufferSize, void* res) {
    return (int32_t)getspnam_r(name, spwd, buffer, bufferSize, res);
}

void* libc_haiku_mod_sgetspent(const char* line) {
    return (void*)sgetspent(line);
}

int32_t libc_haiku_mod_sgetspent_r(const char* line, void* spwd, char* buffer, uint64_t bufferSize, void* res) {
    return (int32_t)sgetspent_r(line, spwd, buffer, bufferSize, res);
}

void* libc_haiku_mod_fgetspent(void* file) {
    return (void*)fgetspent((FILE*)file);
}

int32_t libc_haiku_mod_fgetspent_r(void* file, void* spwd, char* buffer, uint64_t bufferSize, void* res) {
    return (int32_t)fgetspent_r((FILE*)file, spwd, buffer, bufferSize, res);
}

int32_t libc_haiku_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_haiku_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_haiku_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_haiku_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_haiku_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_haiku_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_haiku_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_haiku_mod_clock_getcpuclockid(int32_t pid, void* clk_id) {
    return (int32_t)clock_getcpuclockid(pid, clk_id);
}

int32_t libc_haiku_mod_pthread_create(void* thread, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(thread, attr, f, value);
}

int32_t libc_haiku_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_haiku_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_haiku_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_haiku_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_haiku_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

void* libc_haiku_mod_valloc(uint64_t numBytes) {
    return (void*)valloc(numBytes);
}

uint64_t libc_haiku_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

void* libc_haiku_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_haiku_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_haiku_mod_initgroups(const char* name, uint32_t basegid) {
    return (int32_t)initgroups(name, basegid);
}

int32_t libc_haiku_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_haiku_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_haiku_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_haiku_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_haiku_mod_pthread_sigqueue(uint64_t thread, int32_t sig, int32_t value) {
    return (int32_t)pthread_sigqueue(thread, sig, value);
}

int32_t libc_haiku_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_haiku_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_haiku_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_haiku_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_haiku_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_haiku_mod_waitid(int32_t idtype, int32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_haiku_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_haiku_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_haiku_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_haiku_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_haiku_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advice) {
    return (int32_t)posix_fadvise(fd, offset, len, advice);
}

int32_t libc_haiku_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int32_t libc_haiku_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_haiku_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_haiku_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_haiku_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_haiku_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_haiku_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int64_t libc_haiku_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

char* libc_haiku_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_haiku_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int32_t libc_haiku_mod_accept4(int32_t socket, void* address, void* addressLength, int32_t flags) {
    return (int32_t)accept4(socket, address, addressLength, flags);
}

int64_t libc_haiku_mod_writev(int32_t fd, void* iov, int32_t count) {
    return (int64_t)writev(fd, iov, count);
}

int64_t libc_haiku_mod_readv(int32_t fd, void* iov, int32_t count) {
    return (int64_t)readv(fd, iov, count);
}

int64_t libc_haiku_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_haiku_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

int32_t libc_haiku_mod_execvpe(const char* file, void* argv, void* environment) {
    return (int32_t)execvpe(file, argv, environment);
}

int32_t libc_haiku_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_haiku_mod_getgrouplist(const char* user, uint32_t basegroup, void* grouplist, void* groupcount) {
    return (int32_t)getgrouplist(user, basegroup, grouplist, groupcount);
}

int32_t libc_haiku_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_haiku_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_haiku_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_haiku_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_haiku_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_haiku_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_haiku_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_haiku_mod_pthread_kill(uint64_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_haiku_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_haiku_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_haiku_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

void* libc_haiku_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_haiku_mod_setpwent(void) {
    setpwent();
}

void libc_haiku_mod_endpwent(void) {
    endpwent();
}

void libc_haiku_mod_endgrent(void) {
    endgrent();
}

void* libc_haiku_mod_getgrent(void) {
    return (void*)getgrent();
}

void libc_haiku_mod_setgrent(void) {
    setgrent();
}

int32_t libc_haiku_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_haiku_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_haiku_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_haiku_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_haiku_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_haiku_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

void* libc_haiku_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_haiku_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_haiku_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_haiku_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

void libc_haiku_mod_setutxent(void) {
    setutxent();
}

void libc_haiku_mod_endutxent(void) {
    endutxent();
}

int32_t libc_haiku_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_haiku_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_haiku_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_haiku_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_haiku_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

int32_t libc_haiku_mod_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

int32_t libc_haiku_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_haiku_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_haiku_mod_regfree(void* preg) {
    regfree(preg);
}

int32_t libc_haiku_mod_msgctl(int32_t msqid, int32_t cmd, void* buf) {
    return (int32_t)msgctl(msqid, cmd, buf);
}

int32_t libc_haiku_mod_msgget(int32_t key, int32_t msgflg) {
    return (int32_t)msgget(key, msgflg);
}

int64_t libc_haiku_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtype, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtype, msgflg);
}

int32_t libc_haiku_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg) {
    return (int32_t)msgsnd(msqid, msgp, msgsz, msgflg);
}

int32_t libc_haiku_mod_semget(int32_t key, int32_t nsems, int32_t semflg) {
    return (int32_t)semget(key, nsems, semflg);
}

int32_t libc_haiku_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int32_t libc_haiku_mod_ftok(const char* pathname, int32_t proj_id) {
    return (int32_t)ftok(pathname, proj_id);
}

void* libc_haiku_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

void* libc_haiku_mod_lsearch(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lsearch(key, base, nelp, width, compar);
}

void* libc_haiku_mod_lfind(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lfind(key, base, nelp, width, compar);
}

int32_t libc_haiku_mod_hcreate(uint64_t nelt) {
    return (int32_t)hcreate(nelt);
}

void libc_haiku_mod_hdestroy(void) {
    hdestroy();
}

void* libc_haiku_mod_hsearch(int32_t entry, int32_t action) {
    return (void*)hsearch(entry, action);
}

double libc_haiku_mod_drand48(void) {
    return (double)drand48();
}

double libc_haiku_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_haiku_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_haiku_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int64_t libc_haiku_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_haiku_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_haiku_mod_srand48(int64_t seed) {
    srand48(seed);
}

void* libc_haiku_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_haiku_mod_lcong48(void* p) {
    lcong48(p);
}

int32_t libc_haiku_mod_clearenv(void) {
    return (int32_t)clearenv();
}

char* libc_haiku_mod_ctermid(char* s) {
    return (char*)ctermid(s);
}

void libc_haiku_mod_sync(void) {
    sync();
}

int32_t libc_haiku_mod_getpagesize(void) {
    return (int32_t)getpagesize();
}

int32_t libc_haiku_mod_brk(void* addr) {
    return (int32_t)brk(addr);
}

void* libc_haiku_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_haiku_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_haiku_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_haiku_mod_posix_spawn_file_actions_init(void* file_actions) {
    return (int32_t)posix_spawn_file_actions_init(file_actions);
}

int32_t libc_haiku_mod_posix_spawn_file_actions_destroy(void* file_actions) {
    return (int32_t)posix_spawn_file_actions_destroy(file_actions);
}

int32_t libc_haiku_mod_posix_spawn_file_actions_addopen(void* file_actions, int32_t fildes, const char* path, int32_t oflag, uint32_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(file_actions, fildes, path, oflag, mode);
}

int32_t libc_haiku_mod_posix_spawn_file_actions_addclose(void* file_actions, int32_t fildes) {
    return (int32_t)posix_spawn_file_actions_addclose(file_actions, fildes);
}

int32_t libc_haiku_mod_posix_spawn_file_actions_adddup2(void* file_actions, int32_t fildes, int32_t newfildes) {
    return (int32_t)posix_spawn_file_actions_adddup2(file_actions, fildes, newfildes);
}

int32_t libc_haiku_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_haiku_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_haiku_mod_posix_spawnattr_getflags(void* attr, void* _flags) {
    return (int32_t)posix_spawnattr_getflags(attr, _flags);
}

int32_t libc_haiku_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_haiku_mod_posix_spawnattr_getpgroup(void* attr, void* _pgroup) {
    return (int32_t)posix_spawnattr_getpgroup(attr, _pgroup);
}

int32_t libc_haiku_mod_posix_spawnattr_setpgroup(void* attr, int32_t pgroup) {
    return (int32_t)posix_spawnattr_setpgroup(attr, pgroup);
}

int32_t libc_haiku_mod_posix_spawnattr_getsigdefault(void* attr, void* sigdefault) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, sigdefault);
}

int32_t libc_haiku_mod_posix_spawnattr_setsigdefault(void* attr, void* sigdefault) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, sigdefault);
}

int32_t libc_haiku_mod_posix_spawnattr_getsigmask(void* attr, void* _sigmask) {
    return (int32_t)posix_spawnattr_getsigmask(attr, _sigmask);
}

int32_t libc_haiku_mod_posix_spawnattr_setsigmask(void* attr, void* sigmask) {
    return (int32_t)posix_spawnattr_setsigmask(attr, sigmask);
}

int32_t libc_haiku_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

int32_t libc_haiku_mod_strcasecmp_l(const char* string1, const char* string2, int32_t locale) {
    return (int32_t)strcasecmp_l(string1, string2, locale);
}

int32_t libc_haiku_mod_strncasecmp_l(const char* string1, const char* string2, uint64_t length, int32_t locale) {
    return (int32_t)strncasecmp_l(string1, string2, length, locale);
}

int32_t libc_haiku_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

void* libc_haiku_mod_memmem(void* source, uint64_t sourceLength, void* search, uint64_t searchLength) {
    return (void*)memmem(source, sourceLength, search, searchLength);
}

int32_t libc_haiku_mod_pthread_getattr_np(uint64_t thread, void* attr) {
    return (int32_t)pthread_getattr_np(thread, attr);
}

int32_t libc_haiku_mod_pthread_getname_np(uint64_t thread, char* buffer, uint64_t length) {
    return (int32_t)pthread_getname_np(thread, buffer, length);
}

int32_t libc_haiku_mod_pthread_setname_np(uint64_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

