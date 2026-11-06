#include "apple_mod_wrapper.h"
#include <errno.h>
#include <time.h>
#if !defined(_WIN32)
#include <semaphore.h>
#include <dirent.h>
#include <sys/mman.h>
#endif
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
#endif

void libc_apple_mod_setgrent(void) {
    setgrent();
}

int32_t libc_apple_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_apple_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_apple_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_apple_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int32_t libc_apple_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_apple_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_apple_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int64_t libc_apple_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_apple_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)aio_suspend(aiocb_list, nitems, timeout);
}

int32_t libc_apple_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_apple_mod_chflags(const char* path, uint32_t flags) {
    return (int32_t)chflags(path, flags);
}

int32_t libc_apple_mod_fchflags(int32_t fd, uint32_t flags) {
    return (int32_t)fchflags(fd, flags);
}

int32_t libc_apple_mod_clock_getres(uint32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_apple_mod_clock_gettime(uint32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_apple_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

int32_t libc_apple_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_apple_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int32_t libc_apple_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

void* libc_apple_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_apple_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_apple_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_apple_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

void libc_apple_mod_setutxent(void) {
    setutxent();
}

void libc_apple_mod_endutxent(void) {
    endutxent();
}

int32_t libc_apple_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

char* libc_apple_mod_asctime(void* tm) {
    return (char*)asctime(tm);
}

char* libc_apple_mod_ctime(void* clock) {
    return (char*)ctime(clock);
}

void* libc_apple_mod_getdate(const char* datestr) {
    return (void*)getdate(datestr);
}

char* libc_apple_mod_strptime(const char* buf, const char* format, void* timeptr) {
    return (char*)strptime(buf, format, timeptr);
}

char* libc_apple_mod_asctime_r(void* tm, char* result) {
    return (char*)asctime_r(tm, result);
}

char* libc_apple_mod_ctime_r(void* clock, char* result) {
    return (char*)ctime_r(clock, result);
}

int32_t libc_apple_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_apple_mod_mincore(void* addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_apple_mod_sysctlnametomib(const char* name, void* mibp, void* sizep) {
    return (int32_t)sysctlnametomib(name, mibp, sizep);
}

int32_t libc_apple_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_apple_mod_semget(int32_t key, int32_t nsems, int32_t semflg) {
    return (int32_t)semget(key, nsems, semflg);
}

int32_t libc_apple_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int32_t libc_apple_mod_ftok(const char* pathname, int32_t proj_id) {
    return (int32_t)ftok(pathname, proj_id);
}

void* libc_apple_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_apple_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_apple_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_apple_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

int32_t libc_apple_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_apple_mod_sysctlbyname(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctlbyname(name, oldp, oldlenp, newp, newlen);
}

uint64_t libc_apple_mod_mach_absolute_time(void) {
    return (uint64_t)mach_absolute_time();
}

int32_t libc_apple_mod_mach_timebase_info(void* info) {
    return (int32_t)mach_timebase_info(info);
}

uint32_t libc_apple_mod_mach_host_self(void) {
    return (uint32_t)mach_host_self();
}

uint32_t libc_apple_mod_mach_thread_self(void) {
    return (uint32_t)mach_thread_self();
}

int32_t libc_apple_mod_pthread_cond_timedwait_relative_np(void* cond, void* lock, void* timeout) {
    return (int32_t)pthread_cond_timedwait_relative_np(cond, lock, timeout);
}

int32_t libc_apple_mod_pthread_attr_getscope(void* attr, void* contentionscope) {
    return (int32_t)pthread_attr_getscope(attr, contentionscope);
}

int32_t libc_apple_mod_pthread_attr_getstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_getstackaddr(attr, stackaddr);
}

int32_t libc_apple_mod_pthread_attr_getdetachstate(void* attr, void* detachstate) {
    return (int32_t)pthread_attr_getdetachstate(attr, detachstate);
}

int32_t libc_apple_mod_pthread_attr_setscope(void* attr, int32_t contentionscope) {
    return (int32_t)pthread_attr_setscope(attr, contentionscope);
}

int32_t libc_apple_mod_pthread_attr_setstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_setstackaddr(attr, stackaddr);
}

int32_t libc_apple_mod_pthread_setname_np(const char* name) {
    return (int32_t)pthread_setname_np(name);
}

int32_t libc_apple_mod_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

uint32_t libc_apple_mod_pthread_mach_thread_np(int32_t thread) {
    return (uint32_t)pthread_mach_thread_np(thread);
}

int32_t libc_apple_mod_pthread_from_mach_thread_np(uint32_t port) {
    return (int32_t)pthread_from_mach_thread_np(port);
}

void* libc_apple_mod_pthread_get_stackaddr_np(int32_t thread) {
    return (void*)pthread_get_stackaddr_np(thread);
}

uint64_t libc_apple_mod_pthread_get_stacksize_np(int32_t thread) {
    return (uint64_t)pthread_get_stacksize_np(thread);
}

int32_t libc_apple_mod_pthread_main_np(void) {
    return (int32_t)pthread_main_np();
}

int32_t libc_apple_mod_pthread_threadid_np(int32_t thread, void* thread_id) {
    return (int32_t)pthread_threadid_np(thread, thread_id);
}

void libc_apple_mod_pthread_jit_write_protect_np(int32_t enabled) {
    pthread_jit_write_protect_np(enabled);
}

int32_t libc_apple_mod_pthread_jit_write_protect_supported_np(void) {
    return (int32_t)pthread_jit_write_protect_supported_np();
}

int32_t libc_apple_mod_pthread_jit_write_with_callback_np(int32_t callback, void* ctx) {
    return (int32_t)pthread_jit_write_with_callback_np(callback, ctx);
}

void libc_apple_mod_pthread_jit_write_freeze_callbacks_np(void) {
    pthread_jit_write_freeze_callbacks_np();
}

int32_t libc_apple_mod_pthread_cpu_number_np(void* cpu_number_out) {
    return (int32_t)pthread_cpu_number_np(cpu_number_out);
}

int32_t libc_apple_mod_os_sync_wait_on_address(void* addr, uint64_t value, uint64_t size, uint32_t flags) {
    return (int32_t)os_sync_wait_on_address(addr, value, size, flags);
}

int32_t libc_apple_mod_os_sync_wait_on_address_with_deadline(void* addr, uint64_t value, uint64_t size, uint32_t flags, uint32_t clockid, uint64_t deadline) {
    return (int32_t)os_sync_wait_on_address_with_deadline(addr, value, size, flags, clockid, deadline);
}

int32_t libc_apple_mod_os_sync_wait_on_address_with_timeout(void* addr, uint64_t value, uint64_t size, uint32_t flags, uint32_t clockid, uint64_t timeout_ns) {
    return (int32_t)os_sync_wait_on_address_with_timeout(addr, value, size, flags, clockid, timeout_ns);
}

int32_t libc_apple_mod_os_sync_wake_by_address_any(void* addr, uint64_t size, uint32_t flags) {
    return (int32_t)os_sync_wake_by_address_any(addr, size, flags);
}

int32_t libc_apple_mod_os_sync_wake_by_address_all(void* addr, uint64_t size, uint32_t flags) {
    return (int32_t)os_sync_wake_by_address_all(addr, size, flags);
}

void libc_apple_mod_os_unfair_lock_lock(void* lock) {
    os_unfair_lock_lock(lock);
}

bool libc_apple_mod_os_unfair_lock_trylock(void* lock) {
    return (bool)os_unfair_lock_trylock(lock);
}

void libc_apple_mod_os_unfair_lock_unlock(void* lock) {
    os_unfair_lock_unlock(lock);
}

void libc_apple_mod_os_unfair_lock_assert_owner(void* lock) {
    os_unfair_lock_assert_owner(lock);
}

void libc_apple_mod_os_unfair_lock_assert_not_owner(void* lock) {
    os_unfair_lock_assert_not_owner(lock);
}

void* libc_apple_mod_os_log_create(const char* subsystem, const char* category) {
    return (void*)os_log_create(subsystem, category);
}

bool libc_apple_mod_os_log_type_enabled(void* oslog, uint8_t tpe) {
    return (bool)os_log_type_enabled(oslog, tpe);
}

uint64_t libc_apple_mod_os_signpost_id_make_with_pointer(void* log, void* ptr) {
    return (uint64_t)os_signpost_id_make_with_pointer(log, ptr);
}

uint64_t libc_apple_mod_os_signpost_id_generate(void* log) {
    return (uint64_t)os_signpost_id_generate(log);
}

bool libc_apple_mod_os_signpost_enabled(void* log) {
    return (bool)os_signpost_enabled(log);
}

int32_t libc_apple_mod_thread_policy_set(uint32_t thread, uint32_t flavor, void* policy_info, uint32_t count) {
    return (int32_t)thread_policy_set(thread, flavor, policy_info, count);
}

int32_t libc_apple_mod_thread_policy_get(uint32_t thread, uint32_t flavor, void* policy_info, void* count, void* get_default) {
    return (int32_t)thread_policy_get(thread, flavor, policy_info, count, get_default);
}

int32_t libc_apple_mod_thread_info(uint32_t target_act, uint32_t flavor, void* thread_info_out, void* thread_info_outCnt) {
    return (int32_t)thread_info(target_act, flavor, thread_info_out, thread_info_outCnt);
}

void* libc_apple_mod_error(void) {
    return (void*)__error();
}

int32_t libc_apple_mod_backtrace(void* buf, int32_t sz) {
    return (int32_t)backtrace(buf, sz);
}

void* libc_apple_mod_backtrace_symbols(void* addrs, int32_t sz) {
    return (void*)backtrace_symbols(addrs, sz);
}

void libc_apple_mod_backtrace_symbols_fd(void* addrs, int32_t sz, int32_t fd) {
    backtrace_symbols_fd(addrs, sz, fd);
}

int32_t libc_apple_mod_backtrace_from_fp(void* startfp, void* array, int32_t size) {
    return (int32_t)backtrace_from_fp(startfp, array, size);
}

void libc_apple_mod_backtrace_image_offsets(void* array, void* image_offsets, int32_t size) {
    backtrace_image_offsets(array, image_offsets, size);
}

uint64_t libc_apple_mod_backtrace_async(void* array, uint64_t length, void* task_id) {
    return (uint64_t)backtrace_async(array, length, task_id);
}

int32_t libc_apple_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_apple_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_apple_mod_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
#else
    (void)kq;
    (void)changelist;
    (void)nchanges;
    (void)eventlist;
    (void)nevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_apple_mod_kevent64(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, uint32_t flags, void* timeout) {
    return (int32_t)kevent64(kq, changelist, nchanges, eventlist, nevents, flags, timeout);
}

int32_t libc_apple_mod_mount(const char* src, const char* target, int32_t flags, void* data) {
    return (int32_t)mount(src, target, flags, data);
}

int32_t libc_apple_mod_fmount(const char* src, int32_t fd, int32_t flags, void* data) {
    return (int32_t)fmount(src, fd, flags, data);
}

int32_t libc_apple_mod_ptrace(int32_t request, int32_t pid, char* addr, int32_t data) {
    return (int32_t)ptrace(request, pid, addr, data);
}

int32_t libc_apple_mod_quotactl(const char* special, int32_t cmd, int32_t id, char* data) {
    return (int32_t)quotactl(special, cmd, id, data);
}

int32_t libc_apple_mod_sethostname(const char* name, int32_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_apple_mod_sendfile(int32_t fd, int32_t s, int64_t offset, void* len, void* hdtr, int32_t flags) {
    return (int32_t)sendfile(fd, s, offset, len, hdtr, flags);
}

int32_t libc_apple_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_apple_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_apple_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_apple_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_apple_mod_login_tty(int32_t fd) {
    return (int32_t)login_tty(fd);
}

int32_t libc_apple_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

int32_t libc_apple_mod_freelocale(int32_t loc) {
    return (int32_t)freelocale(loc);
}

void* libc_apple_mod_localeconv_l(int32_t loc) {
    return (void*)localeconv_l(loc);
}

int32_t libc_apple_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

int32_t libc_apple_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

const char* libc_apple_mod_querylocale(int32_t mask, int32_t loc) {
    return (const char*)querylocale(mask, loc);
}

int32_t libc_apple_mod_getpriority(int32_t which, uint32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_apple_mod_setpriority(int32_t which, uint32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_apple_mod_getdomainname(char* name, int32_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_apple_mod_setdomainname(const char* name, int32_t len) {
    return (int32_t)setdomainname(name, len);
}

int64_t libc_apple_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int64_t libc_apple_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_apple_mod_getxattr(const char* path, const char* name, void* value, uint64_t size, uint32_t position, int32_t flags) {
    return (int64_t)getxattr(path, name, value, size, position, flags);
}

int64_t libc_apple_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size, uint32_t position, int32_t flags) {
    return (int64_t)fgetxattr(filedes, name, value, size, position, flags);
}

int32_t libc_apple_mod_setxattr(const char* path, const char* name, void* value, uint64_t size, uint32_t position, int32_t flags) {
    return (int32_t)setxattr(path, name, value, size, position, flags);
}

int32_t libc_apple_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, uint32_t position, int32_t flags) {
    return (int32_t)fsetxattr(filedes, name, value, size, position, flags);
}

int64_t libc_apple_mod_listxattr(const char* path, char* list, uint64_t size, int32_t flags) {
    return (int64_t)listxattr(path, list, size, flags);
}

int64_t libc_apple_mod_flistxattr(int32_t filedes, char* list, uint64_t size, int32_t flags) {
    return (int64_t)flistxattr(filedes, list, size, flags);
}

int32_t libc_apple_mod_removexattr(const char* path, const char* name, int32_t flags) {
    return (int32_t)removexattr(path, name, flags);
}

int32_t libc_apple_mod_renamex_np(const char* from, const char* to, uint32_t flags) {
    return (int32_t)renamex_np(from, to, flags);
}

int32_t libc_apple_mod_renameatx_np(int32_t fromfd, const char* from, int32_t tofd, const char* to, uint32_t flags) {
    return (int32_t)renameatx_np(fromfd, from, tofd, to, flags);
}

int32_t libc_apple_mod_fremovexattr(int32_t filedes, const char* name, int32_t flags) {
    return (int32_t)fremovexattr(filedes, name, flags);
}

int32_t libc_apple_mod_getgrouplist(const char* name, int32_t basegid, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(name, basegid, groups, ngroups);
}

int32_t libc_apple_mod_initgroups(const char* user, int32_t basegroup) {
    return (int32_t)initgroups(user, basegroup);
}

int32_t libc_apple_mod_waitid(uint32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

void* libc_apple_mod_brk(void* addr) {
    return (void*)brk(addr);
}

void* libc_apple_mod_sbrk(int32_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_apple_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

uint32_t libc_apple_mod_dyld_image_count(void) {
    return (uint32_t)_dyld_image_count();
}

void* libc_apple_mod_dyld_get_image_header(uint32_t image_index) {
    return (void*)_dyld_get_image_header(image_index);
}

int64_t libc_apple_mod_dyld_get_image_vmaddr_slide(uint32_t image_index) {
    return (int64_t)_dyld_get_image_vmaddr_slide(image_index);
}

const char* libc_apple_mod_dyld_get_image_name(uint32_t image_index) {
    return (const char*)_dyld_get_image_name(image_index);
}

int32_t libc_apple_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}

int32_t libc_apple_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}

int32_t libc_apple_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}

int32_t libc_apple_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}

int32_t libc_apple_mod_posix_spawnattr_getsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, default);
}

int32_t libc_apple_mod_posix_spawnattr_setsigdefault(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, default);
}

int32_t libc_apple_mod_posix_spawnattr_getsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_getsigmask(attr, default);
}

int32_t libc_apple_mod_posix_spawnattr_setsigmask(void* attr, void* default) {
    return (int32_t)posix_spawnattr_setsigmask(attr, default);
}

int32_t libc_apple_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}

int32_t libc_apple_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}

int32_t libc_apple_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}

int32_t libc_apple_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}

int32_t libc_apple_mod_posix_spawnattr_setarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    return (int32_t)posix_spawnattr_setarchpref_np(attr, count, pref, subpref, ocount);
}

int32_t libc_apple_mod_posix_spawnattr_getarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    return (int32_t)posix_spawnattr_getarchpref_np(attr, count, pref, subpref, ocount);
}

int32_t libc_apple_mod_posix_spawnattr_getbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    return (int32_t)posix_spawnattr_getbinpref_np(attr, count, pref, ocount);
}

int32_t libc_apple_mod_posix_spawnattr_setbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    return (int32_t)posix_spawnattr_setbinpref_np(attr, count, pref, ocount);
}

int32_t libc_apple_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}

int32_t libc_apple_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}

int32_t libc_apple_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint16_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}

int32_t libc_apple_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}

int32_t libc_apple_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}

int32_t libc_apple_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_apple_mod_connectx(int32_t socket, void* endpoints, uint32_t associd, uint32_t flags, void* iov, uint32_t iovcnt, void* len, void* connid) {
    return (int32_t)connectx(socket, endpoints, associd, flags, iov, iovcnt, len, connid);
}

int32_t libc_apple_mod_disconnectx(int32_t socket, uint32_t associd, uint32_t connid) {
    return (int32_t)disconnectx(socket, associd, connid);
}

int32_t libc_apple_mod_ntp_adjtime(void* buf) {
    return (int32_t)ntp_adjtime(buf);
}

int32_t libc_apple_mod_ntp_gettime(void* buf) {
    return (int32_t)ntp_gettime(buf);
}

int32_t libc_apple_mod_getmntinfo(void* mntbufp, int32_t flags) {
    return (int32_t)getmntinfo(mntbufp, flags);
}

int32_t libc_apple_mod_getfsstat(void* mntbufp, int32_t bufsize, int32_t flags) {
    return (int32_t)getfsstat(mntbufp, bufsize, flags);
}

int32_t libc_apple_mod_clonefile(const char* src, const char* dst, uint32_t flags) {
    return (int32_t)clonefile(src, dst, flags);
}

int32_t libc_apple_mod_clonefileat(int32_t src_dirfd, const char* src, int32_t dst_dirfd, const char* dst, uint32_t flags) {
    return (int32_t)clonefileat(src_dirfd, src, dst_dirfd, dst, flags);
}

int32_t libc_apple_mod_fclonefileat(int32_t srcfd, int32_t dst_dirfd, const char* dst, uint32_t flags) {
    return (int32_t)fclonefileat(srcfd, dst_dirfd, dst, flags);
}

int32_t libc_apple_mod_copyfile(const char* from, const char* to, void* state, uint32_t flags) {
    return (int32_t)copyfile(from, to, state, flags);
}

int32_t libc_apple_mod_fcopyfile(int32_t from, int32_t to, void* state, uint32_t flags) {
    return (int32_t)fcopyfile(from, to, state, flags);
}

int32_t libc_apple_mod_copyfile_state_free(void* s) {
    return (int32_t)copyfile_state_free(s);
}

void* libc_apple_mod_copyfile_state_alloc(void) {
    return (void*)copyfile_state_alloc();
}

int32_t libc_apple_mod_copyfile_state_get(void* s, uint32_t flags, void* dst) {
    return (int32_t)copyfile_state_get(s, flags, dst);
}

int32_t libc_apple_mod_copyfile_state_set(void* s, uint32_t flags, void* src) {
    return (int32_t)copyfile_state_set(s, flags, src);
}

char* libc_apple_mod_mach_error_string(int32_t error_value) {
    return (char*)mach_error_string(error_value);
}

int32_t libc_apple_mod_memset_s(void* s, uint64_t smax, int32_t c, uint64_t n) {
    return (int32_t)memset_s(s, smax, c, n);
}

void libc_apple_mod_memset_pattern4(void* b, void* pattern4, uint64_t len) {
    memset_pattern4(b, pattern4, len);
}

void libc_apple_mod_memset_pattern8(void* b, void* pattern8, uint64_t len) {
    memset_pattern8(b, pattern8, len);
}

void libc_apple_mod_memset_pattern16(void* b, void* pattern16, uint64_t len) {
    memset_pattern16(b, pattern16, len);
}

int64_t libc_apple_mod_strtonum(const char* __numstr, int64_t __minval, int64_t __maxval, void* errstrp) {
    return (int64_t)strtonum(__numstr, __minval, __maxval, errstrp);
}

int32_t libc_apple_mod_mstats(void) {
    return (int32_t)mstats();
}

int32_t libc_apple_mod_malloc_zone_check(void* zone) {
    return (int32_t)malloc_zone_check(zone);
}

void libc_apple_mod_malloc_zone_print(void* zone, int32_t verbose) {
    malloc_zone_print(zone, verbose);
}

void libc_apple_mod_malloc_zone_statistics(void* zone, void* stats) {
    malloc_zone_statistics(zone, stats);
}

void libc_apple_mod_malloc_zone_log(void* zone, void* address) {
    malloc_zone_log(zone, address);
}

void libc_apple_mod_malloc_zone_print_ptr_info(void* ptr) {
    malloc_zone_print_ptr_info(ptr);
}

void* libc_apple_mod_malloc_default_zone(void) {
    return (void*)malloc_default_zone();
}

void* libc_apple_mod_malloc_zone_from_ptr(void* ptr) {
    return (void*)malloc_zone_from_ptr(ptr);
}

void* libc_apple_mod_malloc_zone_malloc(void* zone, uint64_t size) {
    return (void*)malloc_zone_malloc(zone, size);
}

void* libc_apple_mod_malloc_zone_valloc(void* zone, uint64_t size) {
    return (void*)malloc_zone_valloc(zone, size);
}

void* libc_apple_mod_malloc_zone_calloc(void* zone, uint64_t num_items, uint64_t size) {
    return (void*)malloc_zone_calloc(zone, num_items, size);
}

void* libc_apple_mod_malloc_zone_realloc(void* zone, void* ptr, uint64_t size) {
    return (void*)malloc_zone_realloc(zone, ptr, size);
}

void libc_apple_mod_malloc_zone_free(void* zone, void* ptr) {
    malloc_zone_free(zone, ptr);
}

int32_t libc_apple_mod_proc_listpids(uint32_t t, uint32_t typeinfo, void* buffer, int32_t buffersize) {
    return (int32_t)proc_listpids(t, typeinfo, buffer, buffersize);
}

int32_t libc_apple_mod_proc_listallpids(void* buffer, int32_t buffersize) {
    return (int32_t)proc_listallpids(buffer, buffersize);
}

int32_t libc_apple_mod_proc_listpgrppids(int32_t pgrpid, void* buffer, int32_t buffersize) {
    return (int32_t)proc_listpgrppids(pgrpid, buffer, buffersize);
}

int32_t libc_apple_mod_proc_listchildpids(int32_t ppid, void* buffer, int32_t buffersize) {
    return (int32_t)proc_listchildpids(ppid, buffer, buffersize);
}

int32_t libc_apple_mod_proc_pidinfo(int32_t pid, int32_t flavor, uint64_t arg, void* buffer, int32_t buffersize) {
    return (int32_t)proc_pidinfo(pid, flavor, arg, buffer, buffersize);
}

int32_t libc_apple_mod_proc_pidfdinfo(int32_t pid, int32_t fd, int32_t flavor, void* buffer, int32_t buffersize) {
    return (int32_t)proc_pidfdinfo(pid, fd, flavor, buffer, buffersize);
}

int32_t libc_apple_mod_proc_pidfileportinfo(int32_t pid, uint32_t fileport, int32_t flavor, void* buffer, int32_t buffersize) {
    return (int32_t)proc_pidfileportinfo(pid, fileport, flavor, buffer, buffersize);
}

int32_t libc_apple_mod_proc_pidpath(int32_t pid, void* buffer, uint32_t buffersize) {
    return (int32_t)proc_pidpath(pid, buffer, buffersize);
}

int32_t libc_apple_mod_proc_name(int32_t pid, void* buffer, uint32_t buffersize) {
    return (int32_t)proc_name(pid, buffer, buffersize);
}

int32_t libc_apple_mod_proc_regionfilename(int32_t pid, uint64_t address, void* buffer, uint32_t buffersize) {
    return (int32_t)proc_regionfilename(pid, address, buffer, buffersize);
}

int32_t libc_apple_mod_proc_kmsgbuf(void* buffer, uint32_t buffersize) {
    return (int32_t)proc_kmsgbuf(buffer, buffersize);
}

int32_t libc_apple_mod_proc_libversion(void* major, void* minor) {
    return (int32_t)proc_libversion(major, minor);
}

int32_t libc_apple_mod_proc_pid_rusage(int32_t pid, int32_t flavor, void* buffer) {
    return (int32_t)proc_pid_rusage(pid, flavor, buffer);
}

int32_t libc_apple_mod_proc_set_no_smt(void) {
    return (int32_t)proc_set_no_smt();
}

int32_t libc_apple_mod_proc_setthread_no_smt(void) {
    return (int32_t)proc_setthread_no_smt();
}

int32_t libc_apple_mod_proc_set_csm(uint32_t flags) {
    return (int32_t)proc_set_csm(flags);
}

int32_t libc_apple_mod_proc_setthread_csm(uint32_t flags) {
    return (int32_t)proc_setthread_csm(flags);
}

int32_t libc_apple_mod_gethostuuid(void* id, void* timeout) {
    return (int32_t)gethostuuid(id, timeout);
}

int64_t libc_apple_mod_gethostid(void) {
    return (int64_t)gethostid();
}

void libc_apple_mod_sethostid(int64_t hostid) {
    sethostid(hostid);
}

int32_t libc_apple_mod_c_crandom_generate_bytes(void* bytes, uint64_t size) {
    return (int32_t)CCRandomGenerateBytes(bytes, size);
}

int32_t libc_apple_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

int32_t libc_apple_mod_nsget_executable_path(char* buf, void* bufsize) {
    return (int32_t)_NSGetExecutablePath(buf, bufsize);
}

void* libc_apple_mod_nsget_argv(void) {
    return (void*)_NSGetArgv();
}

void* libc_apple_mod_nsget_argc(void) {
    return (void*)_NSGetArgc();
}

void* libc_apple_mod_nsget_environ(void) {
    return (void*)_NSGetEnviron();
}

void* libc_apple_mod_nsget_progname(void) {
    return (void*)_NSGetProgname();
}

int32_t libc_apple_mod_mach_vm_map(uint32_t target_task, void* address, uint64_t size, uint64_t mask, int32_t flags, uint32_t object, uint64_t offset, int32_t copy, int32_t cur_protection, int32_t max_protection, uint32_t inheritance) {
    return (int32_t)mach_vm_map(target_task, address, size, mask, flags, object, offset, copy, cur_protection, max_protection, inheritance);
}

int32_t libc_apple_mod_vm_allocate(uint32_t target_task, void* address, uint64_t size, int32_t flags) {
    return (int32_t)vm_allocate(target_task, address, size, flags);
}

int32_t libc_apple_mod_vm_deallocate(uint32_t target_task, uint64_t address, uint64_t size) {
    return (int32_t)vm_deallocate(target_task, address, size);
}

int32_t libc_apple_mod_host_statistics64(uint32_t host_priv, int32_t flavor, void* host_info64_out, void* host_info64_outCnt) {
    return (int32_t)host_statistics64(host_priv, flavor, host_info64_out, host_info64_outCnt);
}

int32_t libc_apple_mod_host_processor_info(uint32_t host, int32_t flavor, void* out_processor_count, void* out_processor_info, void* out_processor_infoCnt) {
    return (int32_t)host_processor_info(host, flavor, out_processor_count, out_processor_info, out_processor_infoCnt);
}

int32_t libc_apple_mod_task_for_pid(uint32_t host, int32_t pid, void* task) {
    return (int32_t)task_for_pid(host, pid, task);
}

int32_t libc_apple_mod_task_info(uint32_t host, uint32_t flavor, void* task_info_out, void* task_info_count) {
    return (int32_t)task_info(host, flavor, task_info_out, task_info_count);
}

int32_t libc_apple_mod_task_create(uint32_t target_task, void* ledgers, uint32_t ledgersCnt, int32_t inherit_memory, void* child_task) {
    return (int32_t)task_create(target_task, ledgers, ledgersCnt, inherit_memory, child_task);
}

int32_t libc_apple_mod_task_terminate(uint32_t target_task) {
    return (int32_t)task_terminate(target_task);
}

int32_t libc_apple_mod_task_threads(uint32_t target_task, void* act_list, void* act_listCnt) {
    return (int32_t)task_threads(target_task, act_list, act_listCnt);
}

int32_t libc_apple_mod_host_statistics(uint32_t host_priv, int32_t flavor, void* host_info_out, void* host_info_outCnt) {
    return (int32_t)host_statistics(host_priv, flavor, host_info_out, host_info_outCnt);
}

uint32_t libc_apple_mod_sysdir_start_search_path_enumeration(int32_t dir, int32_t domainMask) {
    return (uint32_t)sysdir_start_search_path_enumeration(dir, domainMask);
}

uint32_t libc_apple_mod_sysdir_get_next_search_path_enumeration(uint32_t state, char* path) {
    return (uint32_t)sysdir_get_next_search_path_enumeration(state, path);
}

int32_t libc_apple_mod_getattrlist(const char* path, void* attrList, void* attrBuf, uint64_t attrBufSize, uint32_t options) {
    return (int32_t)getattrlist(path, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_fgetattrlist(int32_t fd, void* attrList, void* attrBuf, uint64_t attrBufSize, uint32_t options) {
    return (int32_t)fgetattrlist(fd, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_getattrlistat(int32_t fd, const char* path, void* attrList, void* attrBuf, uint64_t attrBufSize, uint64_t options) {
    return (int32_t)getattrlistat(fd, path, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_setattrlist(const char* path, void* attrList, void* attrBuf, uint64_t attrBufSize, uint32_t options) {
    return (int32_t)setattrlist(path, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_fsetattrlist(int32_t fd, void* attrList, void* attrBuf, uint64_t attrBufSize, uint32_t options) {
    return (int32_t)fsetattrlist(fd, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_setattrlistat(int32_t dir_fd, const char* path, void* attrList, void* attrBuf, uint64_t attrBufSize, uint32_t options) {
    return (int32_t)setattrlistat(dir_fd, path, attrList, attrBuf, attrBufSize, options);
}

int32_t libc_apple_mod_getattrlistbulk(int32_t dirfd, void* attrList, void* attrBuf, uint64_t attrBufSize, uint64_t options) {
    return (int32_t)getattrlistbulk(dirfd, attrList, attrBuf, attrBufSize, options);
}

uint64_t libc_apple_mod_malloc_size(void* ptr) {
    return (uint64_t)malloc_size(ptr);
}

uint64_t libc_apple_mod_malloc_good_size(uint64_t size) {
    return (uint64_t)malloc_good_size(size);
}

char* libc_apple_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_apple_mod_basename(char* path) {
    return (char*)basename(path);
}

int32_t libc_apple_mod_mkfifoat(int32_t dirfd, const char* pathname, uint16_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

int32_t libc_apple_mod_mknodat(int32_t dirfd, const char* pathname, uint16_t mode, int32_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_apple_mod_freadlink(int32_t fd, char* buf, uint64_t size) {
    return (int32_t)freadlink(fd, buf, size);
}

int32_t libc_apple_mod_execv_p(const char* file, const char* search_path, void* argv) {
    return (int32_t)execvP(file, search_path, argv);
}

void libc_apple_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar) {
    qsort_r(base, num, size, arg, compar);
}

int32_t libc_apple_mod_clock_settime(uint32_t clock_id, void* tp) {
    return (int32_t)clock_settime(clock_id, tp);
}

void* libc_apple_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_apple_mod_task_set_info(uint32_t target_task, uint32_t flavor, void* task_info_in, uint32_t task_info_inCnt) {
    return (int32_t)task_set_info(target_task, flavor, task_info_in, task_info_inCnt);
}

void* libc_apple_mod_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

uint64_t libc_apple_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_apple_mod_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

