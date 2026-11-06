/* Generated clean pass-through for Apple platforms.
 * libSystem.dylib provides most C function symbols.
 * Additional linking: -liconv for iconv functions. */

#if __has_include(<aio.h>)
#include <aio.h>
#endif
#if __has_include(<ctype.h>)
#include <ctype.h>
#endif
#if __has_include(<direct.h>)
#include <direct.h>
#endif
#if __has_include(<dirent.h>)
#include <dirent.h>
#endif
#if __has_include(<dlfcn.h>)
#include <dlfcn.h>
#endif
#if __has_include(<errno.h>)
#include <errno.h>
#endif
#if __has_include(<execinfo.h>)
#include <execinfo.h>
#endif
#if __has_include(<fcntl.h>)
#include <fcntl.h>
#endif
#if __has_include(<glob.h>)
#include <glob.h>
#endif
#if __has_include(<grp.h>)
#include <grp.h>
#endif
#if __has_include(<ifaddrs.h>)
#include <ifaddrs.h>
#endif
#if __has_include(<io.h>)
#include <io.h>
#endif
#if __has_include(<langinfo.h>)
#include <langinfo.h>
#endif
#if __has_include(<libgen.h>)
#include <libgen.h>
#endif
#if __has_include(<locale.h>)
#include <locale.h>
#endif
#if __has_include(<mach-o/dyld.h>)
#include <mach-o/dyld.h>
#endif
#if __has_include(<mach/mach_init.h>)
#include <mach/mach_init.h>
#endif
#if __has_include(<mach/mach_time.h>)
#include <mach/mach_time.h>
#endif
#if __has_include(<mach/thread_policy.h>)
#include <mach/thread_policy.h>
#endif
#if __has_include(<netdb.h>)
#include <netdb.h>
#endif
#if __has_include(<os/lock.h>)
#include <os/lock.h>
#endif
#if __has_include(<os/log.h>)
#include <os/log.h>
#endif
#if __has_include(<os/signpost.h>)
#include <os/signpost.h>
#endif
#if __has_include(<os/sync.h>)
#include <os/sync.h>
#endif
#if __has_include(<poll.h>)
#include <poll.h>
#endif
#if __has_include(<process.h>)
#include <process.h>
#endif
#if __has_include(<pthread.h>)
#include <pthread.h>
#endif
#if __has_include(<pthread/introspection.h>)
#include <pthread/introspection.h>
#endif
#if __has_include(<pthread/pthread_spis.h>)
#include <pthread/pthread_spis.h>
#endif
#if __has_include(<pthread/qos.h>)
#include <pthread/qos.h>
#endif
#if __has_include(<pthread/spawn.h>)
#include <pthread/spawn.h>
#endif
#if __has_include(<pthread/stack_np.h>)
#include <pthread/stack_np.h>
#endif
#if __has_include(<pwd.h>)
#include <pwd.h>
#endif
#if __has_include(<sched.h>)
#include <sched.h>
#endif
#if __has_include(<semaphore.h>)
#include <semaphore.h>
#endif
#if __has_include(<signal.h>)
#include <signal.h>
#endif
#if __has_include(<spawn.h>)
#include <spawn.h>
#endif
#if __has_include(<stdarg.h>)
#include <stdarg.h>
#endif
#if __has_include(<stdbool.h>)
#include <stdbool.h>
#endif
#if __has_include(<stddef.h>)
#include <stddef.h>
#endif
#if __has_include(<stdint.h>)
#include <stdint.h>
#endif
#if __has_include(<stdio.h>)
#include <stdio.h>
#endif
#if __has_include(<stdlib.h>)
#include <stdlib.h>
#endif
#if __has_include(<string.h>)
#include <string.h>
#endif
#if __has_include(<sys/event.h>)
#include <sys/event.h>
#endif
#if __has_include(<sys/ioctl.h>)
#include <sys/ioctl.h>
#endif
#if __has_include(<sys/ipc.h>)
#include <sys/ipc.h>
#endif
#if __has_include(<sys/mman.h>)
#include <sys/mman.h>
#endif
#if __has_include(<sys/mount.h>)
#include <sys/mount.h>
#endif
#if __has_include(<sys/ptrace.h>)
#include <sys/ptrace.h>
#endif
#if __has_include(<sys/qos.h>)
#include <sys/qos.h>
#endif
#if __has_include(<sys/quota.h>)
#include <sys/quota.h>
#endif
#if __has_include(<sys/sched.h>)
#include <sys/sched.h>
#endif
#if __has_include(<sys/sem.h>)
#include <sys/sem.h>
#endif
#if __has_include(<sys/shm.h>)
#include <sys/shm.h>
#endif
#if __has_include(<sys/socket.h>)
#include <sys/socket.h>
#endif
#if __has_include(<sys/stat.h>)
#include <sys/stat.h>
#endif
#if __has_include(<sys/sysctl.h>)
#include <sys/sysctl.h>
#endif
#if __has_include(<sys/time.h>)
#include <sys/time.h>
#endif
#if __has_include(<sys/timex.h>)
#include <sys/timex.h>
#endif
#if __has_include(<sys/types.h>)
#include <sys/types.h>
#endif
#if __has_include(<sys/uio.h>)
#include <sys/uio.h>
#endif
#if __has_include(<sys/wait.h>)
#include <sys/wait.h>
#endif
#if __has_include(<sys/xattr.h>)
#include <sys/xattr.h>
#endif
#if __has_include(<time.h>)
#include <time.h>
#endif
#if __has_include(<unistd.h>)
#include <unistd.h>
#endif
#if __has_include(<util.h>)
#include <util.h>
#endif
#if __has_include(<utmp.h>)
#include <utmp.h>
#endif
#if __has_include(<utmpx.h>)
#include <utmpx.h>
#endif
#if __has_include(<winsock2.h>)
#include <winsock2.h>
#endif
#if __has_include(<ws2tcpip.h>)
#include <ws2tcpip.h>
#endif

#pragma clang diagnostic ignored "-Wint-conversion"
#pragma clang diagnostic ignored "-Wint-to-void-pointer-cast"
#pragma clang diagnostic ignored "-Wpointer-to-int-cast"
#pragma clang diagnostic ignored "-Wimplicit-function-declaration"
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wunguarded-availability-new"
#pragma clang diagnostic ignored "-Wincompatible-pointer-types-discards-qualifiers"

/* === Pass-through functions === */

void libc_apple_mod_setgrent(void) {
    setgrent();
}

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}
#else
int32_t libc_apple_mod_daemon(int32_t nochdir, int32_t noclose) {
    (void)nochdir; (void)noclose; errno = ENOSYS; return -1;
}
#endif

int32_t libc_apple_mod_sem_destroy(void* sem) {
    return (int32_t)sem_destroy(sem);
}

int32_t libc_apple_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
    return (int32_t)sem_init(sem, pshared, value);
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
    return (int32_t)dirfd(dirp);
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
    return (int32_t)mprotect(addr, len, prot);
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

#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED)
void libc_apple_mod_pthread_jit_write_protect_np(int32_t enabled) {
    pthread_jit_write_protect_np(enabled);
}
#else
void libc_apple_mod_pthread_jit_write_protect_np(int32_t enabled) {
    (void)enabled;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_pthread_jit_write_protect_supported_np(void) {
    return (int32_t)pthread_jit_write_protect_supported_np();
}
#else
int32_t libc_apple_mod_pthread_jit_write_protect_supported_np(void) {
     errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_pthread_jit_write_with_callback_np(int32_t callback, void* ctx) {
    return (int32_t)pthread_jit_write_with_callback_np(callback, ctx);
}
#else
int32_t libc_apple_mod_pthread_jit_write_with_callback_np(int32_t callback, void* ctx) {
    (void)callback; (void)ctx; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
void libc_apple_mod_pthread_jit_write_freeze_callbacks_np(void) {
    pthread_jit_write_freeze_callbacks_np();
}
#else
void libc_apple_mod_pthread_jit_write_freeze_callbacks_np(void) {
    
}
#endif

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

#if !defined(__APPLE__)
void* libc_apple_mod_error(void) {
    return (void*)error();
}
#else
void* libc_apple_mod_error(void) {
     return NULL;
}
#endif

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
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
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

void* libc_apple_mod_querylocale(int32_t mask, int32_t loc) {
    return (void*)querylocale(mask, loc);
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

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
void* libc_apple_mod_brk(void* addr) {
    return (void*)brk(addr);
}
#else
void* libc_apple_mod_brk(void* addr) {
    (void)addr; return NULL;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
void* libc_apple_mod_sbrk(int32_t increment) {
    return (void*)sbrk(increment);
}
#else
void* libc_apple_mod_sbrk(int32_t increment) {
    (void)increment; return NULL;
}
#endif

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

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawn(pid, path, file_actions, attrp, argv, envp);
}
#else
int32_t libc_apple_mod_posix_spawn(void* pid, const char* path, void* file_actions, void* attrp, void* argv, void* envp) {
    (void)pid; (void)path; (void)file_actions; (void)attrp; (void)argv; (void)envp; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    return (int32_t)posix_spawnp(pid, file, file_actions, attrp, argv, envp);
}
#else
int32_t libc_apple_mod_posix_spawnp(void* pid, const char* file, void* file_actions, void* attrp, void* argv, void* envp) {
    (void)pid; (void)file; (void)file_actions; (void)attrp; (void)argv; (void)envp; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_init(void* attr) {
    return (int32_t)posix_spawnattr_init(attr);
}
#else
int32_t libc_apple_mod_posix_spawnattr_init(void* attr) {
    (void)attr; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_destroy(void* attr) {
    return (int32_t)posix_spawnattr_destroy(attr);
}
#else
int32_t libc_apple_mod_posix_spawnattr_destroy(void* attr) {
    (void)attr; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigdefault(attr, defval);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getsigdefault(void* attr, void* defval) {
    (void)attr; (void)defval; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setsigdefault(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigdefault(attr, defval);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setsigdefault(void* attr, void* defval) {
    (void)attr; (void)defval; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_getsigmask(attr, defval);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getsigmask(void* attr, void* defval) {
    (void)attr; (void)defval; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setsigmask(void* attr, void* defval) {
    return (int32_t)posix_spawnattr_setsigmask(attr, defval);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setsigmask(void* attr, void* defval) {
    (void)attr; (void)defval; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getflags(attr, flags);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getflags(void* attr, void* flags) {
    (void)attr; (void)flags; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    return (int32_t)posix_spawnattr_setflags(attr, flags);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setflags(void* attr, int16_t flags) {
    (void)attr; (void)flags; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    return (int32_t)posix_spawnattr_getpgroup(attr, flags);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getpgroup(void* attr, void* flags) {
    (void)attr; (void)flags; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    return (int32_t)posix_spawnattr_setpgroup(attr, flags);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setpgroup(void* attr, int32_t flags) {
    (void)attr; (void)flags; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    return (int32_t)posix_spawnattr_setarchpref_np(attr, count, pref, subpref, ocount);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    (void)attr; (void)count; (void)pref; (void)subpref; (void)ocount; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    return (int32_t)posix_spawnattr_getarchpref_np(attr, count, pref, subpref, ocount);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getarchpref_np(void* attr, uint64_t count, void* pref, void* subpref, void* ocount) {
    (void)attr; (void)count; (void)pref; (void)subpref; (void)ocount; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_getbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    return (int32_t)posix_spawnattr_getbinpref_np(attr, count, pref, ocount);
}
#else
int32_t libc_apple_mod_posix_spawnattr_getbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    (void)attr; (void)count; (void)pref; (void)ocount; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawnattr_setbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    return (int32_t)posix_spawnattr_setbinpref_np(attr, count, pref, ocount);
}
#else
int32_t libc_apple_mod_posix_spawnattr_setbinpref_np(void* attr, uint64_t count, void* pref, void* ocount) {
    (void)attr; (void)count; (void)pref; (void)ocount; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn_file_actions_init(void* actions) {
    return (int32_t)posix_spawn_file_actions_init(actions);
}
#else
int32_t libc_apple_mod_posix_spawn_file_actions_init(void* actions) {
    (void)actions; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn_file_actions_destroy(void* actions) {
    return (int32_t)posix_spawn_file_actions_destroy(actions);
}
#else
int32_t libc_apple_mod_posix_spawn_file_actions_destroy(void* actions) {
    (void)actions; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint16_t mode) {
    return (int32_t)posix_spawn_file_actions_addopen(actions, fd, path, oflag, mode);
}
#else
int32_t libc_apple_mod_posix_spawn_file_actions_addopen(void* actions, int32_t fd, const char* path, int32_t oflag, uint16_t mode) {
    (void)actions; (void)fd; (void)path; (void)oflag; (void)mode; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addclose(actions, fd);
}
#else
int32_t libc_apple_mod_posix_spawn_file_actions_addclose(void* actions, int32_t fd) {
    (void)actions; (void)fd; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    return (int32_t)posix_spawn_file_actions_adddup2(actions, fd, newfd);
}
#else
int32_t libc_apple_mod_posix_spawn_file_actions_adddup2(void* actions, int32_t fd, int32_t newfd) {
    (void)actions; (void)fd; (void)newfd; errno = ENOSYS; return -1;
}
#endif

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

#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_gethostuuid(void* id, void* timeout) {
    return (int32_t)gethostuuid(id, timeout);
}
#else
int32_t libc_apple_mod_gethostuuid(void* id, void* timeout) {
    (void)id; (void)timeout; errno = ENOSYS; return -1;
}
#endif

int64_t libc_apple_mod_gethostid(void) {
    return (int64_t)gethostid();
}

void libc_apple_mod_sethostid(int64_t hostid) {
    sethostid(hostid);
}

#if !defined(__APPLE__)
int32_t libc_apple_mod_c_crandom_generate_bytes(void* bytes, uint64_t size) {
    return (int32_t)c_crandom_generate_bytes(bytes, size);
}
#else
int32_t libc_apple_mod_c_crandom_generate_bytes(void* bytes, uint64_t size) {
    (void)bytes; (void)size; errno = ENOSYS; return -1;
}
#endif

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
    return (void*)getprogname();
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

#if !defined(__APPLE__)
int32_t libc_apple_mod_execv_p(const char* file, const char* search_path, void* argv) {
    return (int32_t)execv_p(file, search_path, argv);
}
#else
int32_t libc_apple_mod_execv_p(const char* file, const char* search_path, void* argv) {
    (void)file; (void)search_path; (void)argv; errno = ENOSYS; return -1;
}
#endif

void libc_apple_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar) {
    qsort_r(base, num, size, arg, compar);
}

#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED)
int32_t libc_apple_mod_clock_settime(uint32_t clock_id, void* tp) {
    return (int32_t)clock_settime(clock_id, tp);
}
#else
int32_t libc_apple_mod_clock_settime(uint32_t clock_id, void* tp) {
    (void)clock_id; (void)tp; errno = ENOSYS; return -1;
}
#endif

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

int32_t libc_bsd_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_bsd_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_bsd_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_bsd_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_bsd_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_bsd_mod_rand(void) {
    return (int32_t)rand();
}

void libc_bsd_mod_srand(uint32_t seed) {
    srand(seed);
}

int32_t libc_bsd_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_bsd_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_bsd_mod_setgroups(int32_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_bsd_mod_setlogin(const char* name) {
    return (int32_t)setlogin(name);
}

int32_t libc_bsd_mod_kqueue(void) {
    return (int32_t)kqueue();
}

int32_t libc_bsd_mod_unmount(const char* target, int32_t arg) {
    return (int32_t)unmount(target, arg);
}

void* libc_bsd_mod_getpwent(void) {
    return (void*)getpwent();
}

void libc_bsd_mod_setpwent(void) {
    setpwent();
}

void libc_bsd_mod_endpwent(void) {
    endpwent();
}

void libc_bsd_mod_endgrent(void) {
    endgrent();
}

void* libc_bsd_mod_getgrent(void) {
    return (void*)getgrent();
}

const char* libc_bsd_mod_getprogname(void) {
    return (const char*)getprogname();
}

void libc_bsd_mod_setprogname(const char* name) {
    setprogname(name);
}

int32_t libc_bsd_mod_getloadavg(void* loadavg, int32_t nelem) {
    return (int32_t)getloadavg(loadavg, nelem);
}

void* libc_bsd_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_bsd_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_bsd_mod_getpeereid(int32_t socket, void* euid, void* egid) {
    return (int32_t)getpeereid(socket, euid, egid);
}

int32_t libc_bsd_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_bsd_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_bsd_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_bsd_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_bsd_mod_seekdir(void* dirp, int64_t loc) {
    seekdir(dirp, loc);
}

int64_t libc_bsd_mod_telldir(void* dirp) {
    return (int64_t)telldir(dirp);
}

int32_t libc_bsd_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_bsd_mod_msync(void* addr, uint64_t len, int32_t flags) {
    return (int32_t)msync(addr, len, flags);
}

int64_t libc_bsd_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_bsd_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_bsd_mod_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

char* libc_bsd_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_bsd_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_bsd_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_bsd_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_bsd_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_bsd_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

void libc_bsd_mod_sync(void) {
    sync();
}

int32_t libc_bsd_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_bsd_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}
#else
int32_t libc_bsd_mod_sigaltstack(void* ss, void* oss) {
    (void)ss; (void)oss; errno = ENOSYS; return -1;
}
#endif

int32_t libc_bsd_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_bsd_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_bsd_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_bsd_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_bsd_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_bsd_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_bsd_mod_pthread_cancel(uint64_t thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_bsd_mod_pthread_kill(uint64_t thread, int32_t sig) {
    return (int32_t)pthread_kill(thread, sig);
}

int32_t libc_bsd_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_bsd_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_bsd_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_bsd_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_bsd_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_bsd_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_bsd_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_bsd_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void* libc_bsd_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_bsd_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_bsd_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_bsd_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_bsd_mod_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

int32_t libc_bsd_mod_getitimer(int32_t which, void* curr_value) {
    return (int32_t)getitimer(which, curr_value);
}

int32_t libc_bsd_mod_setitimer(int32_t which, void* new_value, void* old_value) {
    return (int32_t)setitimer(which, new_value, old_value);
}

int32_t libc_bsd_mod_regcomp(void* preg, const char* pattern, int32_t cflags) {
    return (int32_t)regcomp(preg, pattern, cflags);
}

int32_t libc_bsd_mod_regexec(void* preg, const char* input, uint64_t nmatch, void* pmatch, int32_t eflags) {
    return (int32_t)regexec(preg, input, nmatch, pmatch, eflags);
}

uint64_t libc_bsd_mod_regerror(int32_t errcode, void* preg, char* errbuf, uint64_t errbuf_size) {
    return (uint64_t)regerror(errcode, preg, errbuf, errbuf_size);
}

void libc_bsd_mod_regfree(void* preg) {
    regfree(preg);
}

uint32_t libc_bsd_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

void libc_bsd_mod_arc4random_buf(void* buf, uint64_t size) {
    arc4random_buf(buf, size);
}

uint32_t libc_bsd_mod_arc4random_uniform(uint32_t l) {
    return (uint32_t)arc4random_uniform(l);
}

double libc_bsd_mod_drand48(void) {
    return (double)drand48();
}

double libc_bsd_mod_erand48(void* xseed) {
    return (double)erand48(xseed);
}

int64_t libc_bsd_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_bsd_mod_nrand48(void* xseed) {
    return (int64_t)nrand48(xseed);
}

int64_t libc_bsd_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_bsd_mod_jrand48(void* xseed) {
    return (int64_t)jrand48(xseed);
}

void libc_bsd_mod_srand48(int64_t seed) {
    srand48(seed);
}

void* libc_bsd_mod_seed48(void* xseed) {
    return (void*)seed48(xseed);
}

void libc_bsd_mod_lcong48(void* p) {
    lcong48(p);
}

int32_t libc_bsd_mod_getopt_long(int32_t argc, void* argv, const char* optstring, void* longopts, void* longindex) {
    return (int32_t)getopt_long(argc, argv, optstring, longopts, longindex);
}

uint64_t libc_bsd_mod_strftime(char* buf, uint64_t maxsize, const char* format, void* timeptr) {
    return (uint64_t)strftime(buf, maxsize, format, timeptr);
}

uint64_t libc_bsd_mod_strftime_l(char* buf, uint64_t maxsize, const char* format, void* timeptr, int32_t locale) {
    return (uint64_t)strftime_l(buf, maxsize, format, timeptr, locale);
}

char* libc_bsd_mod_devname(int32_t dev, uint32_t mode_t) {
    return (char*)devname(dev, mode_t);
}

int32_t libc_bsd_mod_issetugid(void) {
    return (int32_t)issetugid();
}

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_bsd_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}
#else
int32_t libc_bsd_daemon(int32_t nochdir, int32_t noclose) {
    (void)nochdir; (void)noclose; errno = ENOSYS; return -1;
}
#endif

const char* libc_bsd_getprogname(void) {
    return (const char*)getprogname();
}

void libc_bsd_setprogname(const char* progname) {
    setprogname(progname);
}

uint32_t libc_bsd_arc4random(void) {
    return (uint32_t)arc4random();
}

uint32_t libc_bsd_arc4random_uniform(uint32_t upper_bound) {
    return (uint32_t)arc4random_uniform(upper_bound);
}

void libc_bsd_arc4random_buf(void* buf, uint64_t n) {
    arc4random_buf(buf, n);
}

int32_t libc_bsd_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int64_t libc_bsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr) {
    return (int64_t)strtonum(nptr, minval, maxval, errstr);
}

int32_t libc_bsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_bsd_login_tty(int32_t _fd) {
    return (int32_t)login_tty(_fd);
}

int32_t libc_bsd_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

char* libc_bsd_strsep(void* string, const char* delimiters) {
    return (char*)strsep(string, delimiters);
}

#if !defined(__APPLE__)
void libc_bsd_explicit_bzero(void* buf, uint64_t len) {
    explicit_bzero(buf, len);
}
#else
void libc_bsd_explicit_bzero(void* buf, uint64_t len) {
    (void)buf; (void)len;
}
#endif

void* libc_bsd_sl_init(void) {
    return (void*)sl_init();
}

int32_t libc_bsd_sl_add(void* sl, char* n) {
    return (int32_t)sl_add(sl, n);
}

void libc_bsd_sl_free(void* sl, int32_t i) {
    sl_free(sl, i);
}

char* libc_bsd_sl_find(void* sl, char* n) {
    return (char*)sl_find(sl, n);
}

int32_t libc_bsd_kqueue(void) {
    return (int32_t)kqueue();
}

int32_t libc_bsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
}

#if !defined(__APPLE__)
int32_t libc_bsd_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}
#else
int32_t libc_bsd_dl_iterate_phdr(void* callback, void* data) {
    (void)callback; (void)data; errno = ENOSYS; return -1;
}
#endif

int32_t libc_bsd_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int64_t libc_bsd_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int64_t libc_bsd_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int32_t libc_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

void* libc_dlfcn_dlopen(const char* filename, int32_t flag) {
    return (void*)dlopen(filename, flag);
}

int32_t libc_dlfcn_dlclose(void* handle) {
    return (int32_t)dlclose(handle);
}

void* libc_dlfcn_dlsym(void* handle, const char* symbol) {
    return (void*)dlsym(handle, symbol);
}

char* libc_dlfcn_dlerror(void) {
    return (char*)dlerror();
}

#if !defined(__APPLE__)
void* libc_errno_errno_location(void) {
    return (void*)errno_location();
}
#else
void* libc_errno_errno_location(void) {
     return NULL;
}
#endif

int32_t libc_fcntl_creat(const char* pathname, uint32_t mode) {
    return (int32_t)creat(pathname, mode);
}

int32_t libc_introspection_pthread_introspection_hook_install(void* hook) {
    return (int32_t)pthread_introspection_hook_install(hook);
}

int32_t libc_introspection_pthread_introspection_setspecific_np(void* thread, int32_t key, void* value) {
    return (int32_t)pthread_introspection_setspecific_np(thread, key, value);
}

void* libc_introspection_pthread_introspection_getspecific_np(void* thread, int32_t key) {
    return (void*)pthread_introspection_getspecific_np(thread, key);
}

void* libc_mman_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
    return (void*)mmap(addr, len, prot, flags, fd, offset);
}

int32_t libc_mman_munmap(void* addr, uint64_t len) {
    return (int32_t)munmap(addr, len);
}

int32_t libc_mman_mprotect(void* addr, uint64_t len, int32_t prot) {
    return (int32_t)mprotect(addr, len, prot);
}

int32_t libc_mman_mlock(void* addr, uint64_t len) {
    return (int32_t)mlock(addr, len);
}

int32_t libc_mman_munlock(void* addr, uint64_t len) {
    return (int32_t)munlock(addr, len);
}

int32_t libc_mman_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_mman_munlockall(void) {
    return (int32_t)munlockall();
}

int32_t libc_mman_msync(void* addr, uint64_t len, int32_t flags) {
    return (int32_t)msync(addr, len, flags);
}

int32_t libc_pthread_spis_pthread_create_from_mach_thread(void* thread, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create_from_mach_thread(thread, attr, f, value);
}

#if !defined(__APPLE__)
int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_getaffinity_np(thread, cpusetsize, cpuset);
}
#else
int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    (void)thread; (void)cpusetsize; (void)cpuset; errno = ENOSYS; return -1;
}
#endif

#if !defined(__APPLE__)
int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr) {
    return (int32_t)pthread_getattr_np(native, attr);
}
#else
int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr) {
    (void)native; (void)attr; errno = ENOSYS; return -1;
}
#endif

int32_t libc_pthread_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

#if !defined(__APPLE__)
int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_setaffinity_np(thread, cpusetsize, cpuset);
}
#else
int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    (void)thread; (void)cpusetsize; (void)cpuset; errno = ENOSYS; return -1;
}
#endif

#if defined(__APPLE__)
int32_t libc_pthread_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(name);
}
#else
int32_t libc_pthread_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}
#endif

int32_t libc_qos_pthread_attr_set_qos_class_np(void* attr, int32_t class, int32_t priority) {
    return (int32_t)pthread_attr_set_qos_class_np(attr, class, priority);
}

int32_t libc_qos_pthread_attr_get_qos_class_np(void* attr, void* class, void* priority) {
    return (int32_t)pthread_attr_get_qos_class_np(attr, class, priority);
}

int32_t libc_qos_pthread_set_qos_class_self_np(int32_t class, int32_t priority) {
    return (int32_t)pthread_set_qos_class_self_np(class, priority);
}

int32_t libc_qos_pthread_get_qos_class_np(int32_t thread, void* class, void* priority) {
    return (int32_t)pthread_get_qos_class_np(thread, class, priority);
}

int32_t libc_sched_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_sched_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_sched_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_semaphore_sem_init(void* sem, int32_t pshared, uint32_t value) {
    return (int32_t)sem_init(sem, pshared, value);
}

int32_t libc_semaphore_sem_destroy(void* sem) {
    return (int32_t)sem_destroy(sem);
}

int32_t libc_semaphore_sem_wait(void* sem) {
    return (int32_t)sem_wait(sem);
}

int32_t libc_semaphore_sem_trywait(void* sem) {
    return (int32_t)sem_trywait(sem);
}

int32_t libc_semaphore_sem_post(void* sem) {
    return (int32_t)sem_post(sem);
}

int32_t libc_semaphore_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

uint64_t libc_signal_signal(int32_t sig, uint64_t handler) {
    return (uint64_t)signal(sig, handler);
}

int32_t libc_signal_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_signal_raise(int32_t sig) {
    return (int32_t)raise(sig);
}

uint32_t libc_signal_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_signal_pause(void) {
    return (int32_t)pause();
}

int32_t libc_signal_sigemptyset(void* set) {
    sigemptyset((sigset_t*)set);
    return 0;
}

int32_t libc_signal_sigfillset(void* set) {
    sigfillset((sigset_t*)set);
    return 0;
}

int32_t libc_signal_sigaddset(void* set, int32_t signum) {
    sigaddset((sigset_t*)set, signum);
    return 0;
}

int32_t libc_signal_sigdelset(void* set, int32_t signum) {
    sigdelset((sigset_t*)set, signum);
    return 0;
}

int32_t libc_signal_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember((sigset_t*)set, signum);
}

int32_t libc_signal_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, (sigset_t*)set, (sigset_t*)oldset);
}

int32_t libc_signal_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int32_t libc_signal_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_signal_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_signal_sigaction(int32_t sig, void* act, void* oact) {
    return (int32_t)sigaction(sig, act, oact);
}

#if !defined(__APPLE__)
int32_t libc_signal_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}
#else
int32_t libc_signal_sigtimedwait(void* set, void* info, void* timeout) {
    (void)set; (void)info; (void)timeout; errno = ENOSYS; return -1;
}
#endif

#if !defined(__APPLE__)
int32_t libc_socket_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}
#else
int32_t libc_socket_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout) {
    (void)sockfd; (void)msgvec; (void)vlen; (void)flags; (void)timeout; errno = ENOSYS; return -1;
}
#endif

#if !defined(__APPLE__)
int32_t libc_socket_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags) {
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
}
#else
int32_t libc_socket_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags) {
    (void)sockfd; (void)msgvec; (void)vlen; (void)flags; errno = ENOSYS; return -1;
}
#endif

int64_t libc_socket_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_spawn_posix_spawnattr_set_qos_class_np(void* attr, int32_t qos_class) {
    return (int32_t)posix_spawnattr_set_qos_class_np(attr, qos_class);
}

int32_t libc_spawn_posix_spawnattr_get_qos_class_np(void* attr, void* qos_class) {
    return (int32_t)posix_spawnattr_get_qos_class_np(attr, qos_class);
}

uint64_t libc_stack_np_pthread_stack_frame_decode_np(uint64_t frame_addr, void* return_addr) {
    return (uint64_t)pthread_stack_frame_decode_np(frame_addr, return_addr);
}

int32_t libc_stat_stat(const char* pathname, void* statbuf) {
    return (int32_t)stat(pathname, statbuf);
}

int32_t libc_stat_fstat(int32_t fd, void* statbuf) {
    return (int32_t)fstat(fd, statbuf);
}

void* libc_stdio_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_stdio_freopen(const char* filename, const char* mode, void* stream) {
    return (void*)freopen(filename, mode, stream);
}

int32_t libc_stdio_fclose(void* stream) {
    return (int32_t)fclose(stream);
}

int32_t libc_stdio_fflush(void* stream) {
    return (int32_t)fflush(stream);
}

uint64_t libc_stdio_fread(void* ptr, uint64_t size, uint64_t nmemb, void* stream) {
    return (uint64_t)fread(ptr, size, nmemb, stream);
}

uint64_t libc_stdio_fwrite(void* ptr, uint64_t size, uint64_t nmemb, void* stream) {
    return (uint64_t)fwrite(ptr, size, nmemb, stream);
}

int32_t libc_stdio_fgetc(void* stream) {
    return (int32_t)fgetc(stream);
}

int32_t libc_stdio_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, stream);
}

int32_t libc_stdio_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_stdio_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_stdio_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, stream);
}

char* libc_stdio_fgets(char* s, int32_t size, void* stream) {
    return (char*)fgets(s, size, stream);
}

int32_t libc_stdio_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, stream);
}

char* libc_stdio_gets(char* s) {
    return (char*)gets(s);
}

int32_t libc_stdio_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_stdio_vprintf(const char* format, void* ap) {
    return (int32_t)vprintf(format, ap);
}

int32_t libc_stdio_vfprintf(void* stream, const char* format, void* ap) {
    return (int32_t)vfprintf(stream, format, ap);
}

int32_t libc_stdio_vsprintf(char* s, const char* format, void* ap) {
    return (int32_t)vsprintf(s, format, ap);
}

int32_t libc_stdio_vsnprintf(char* s, uint64_t n, const char* format, void* ap) {
    return (int32_t)vsnprintf(s, n, format, ap);
}

int32_t libc_stdio_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek(stream, offset, whence);
}

int64_t libc_stdio_ftell(void* stream) {
    return (int64_t)ftell(stream);
}

void libc_stdio_rewind(void* stream) {
    rewind(stream);
}

int32_t libc_stdio_fgetpos(void* stream, void* pos) {
    return (int32_t)fgetpos(stream, pos);
}

int32_t libc_stdio_fsetpos(void* stream, void* pos) {
    return (int32_t)fsetpos(stream, pos);
}

void libc_stdio_clearerr(void* stream) {
    clearerr(stream);
}

int32_t libc_stdio_feof(void* stream) {
    return (int32_t)feof(stream);
}

int32_t libc_stdio_ferror(void* stream) {
    return (int32_t)ferror(stream);
}

void libc_stdio_perror(const char* s) {
    perror(s);
}

int32_t libc_stdio_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_stdio_rename(const char* old, const char* new) {
    return (int32_t)rename(old, new);
}

void* libc_stdio_tmpfile(void) {
    return (void*)tmpfile();
}

char* libc_stdio_tmpnam(char* s) {
    return (char*)tmpnam(s);
}

int32_t libc_stdio_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    setvbuf(stream, buffer, mode, size);
    return 0;
}

void libc_stdio_setbuf(void* stream, char* buffer) {
    setbuf(stream, buffer);
}

void* libc_stdlib_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_stdlib_calloc(uint64_t nmemb, uint64_t size) {
    return (void*)calloc(nmemb, size);
}

void* libc_stdlib_realloc(void* ptr, uint64_t size) {
    return (void*)realloc(ptr, size);
}

void libc_stdlib_free(void* ptr) {
    free(ptr);
}

void libc_stdlib_abort(void) {
    abort();
}

void libc_stdlib_exit(int32_t status) {
    exit(status);
}

int32_t libc_stdlib_atexit(void* function) {
    return (int32_t)atexit(function);
}

char* libc_stdlib_getenv(const char* name) {
    return (char*)getenv(name);
}

int32_t libc_stdlib_setenv(const char* name, const char* value, int32_t overwrite) {
    return (int32_t)setenv(name, value, overwrite);
}

int32_t libc_stdlib_unsetenv(const char* name) {
    return (int32_t)unsetenv(name);
}

int32_t libc_stdlib_atoi(const char* nptr) {
    return (int32_t)atoi(nptr);
}

int64_t libc_stdlib_atol(const char* nptr) {
    return (int64_t)atol(nptr);
}

int64_t libc_stdlib_atoll(const char* nptr) {
    return (int64_t)atoll(nptr);
}

int64_t libc_stdlib_strtol(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtol(nptr, endptr, base);
}

uint64_t libc_stdlib_strtoul(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoul(nptr, endptr, base);
}

int64_t libc_stdlib_strtoll(const char* nptr, void* endptr, int32_t base) {
    return (int64_t)strtoll(nptr, endptr, base);
}

uint64_t libc_stdlib_strtoull(const char* nptr, void* endptr, int32_t base) {
    return (uint64_t)strtoull(nptr, endptr, base);
}

double libc_stdlib_strtod(const char* nptr, void* endptr) {
    return (double)strtod(nptr, endptr);
}

float libc_stdlib_strtof(const char* nptr, void* endptr) {
    return (float)strtof(nptr, endptr);
}

int32_t libc_stdlib_rand(void) {
    return (int32_t)rand();
}

void libc_stdlib_srand(uint32_t seed) {
    srand(seed);
}

void libc_stdlib_qsort(void* base, uint64_t nmemb, uint64_t size, void* compar) {
    qsort(base, nmemb, size, compar);
}

void* libc_stdlib_bsearch(void* key, void* base, uint64_t nmemb, uint64_t size, void* compar) {
    bsearch(key, base, nmemb, size, compar);
    return 0;
}

int32_t libc_stdlib_abs(int32_t j) {
    return (int32_t)abs(j);
}

int64_t libc_stdlib_labs(int64_t j) {
    return (int64_t)labs(j);
}

int64_t libc_stdlib_llabs(int64_t j) {
    return (int64_t)llabs(j);
}

int32_t libc_stdlib_div(int32_t numer, int32_t denom) {
    return (int32_t)div(numer, denom).quot;
}

int32_t libc_stdlib_ldiv(int64_t numer, int64_t denom) {
    return (int32_t)ldiv(numer, denom).quot;
}

int32_t libc_stdlib_lldiv(int64_t numer, int64_t denom) {
    return (int32_t)lldiv(numer, denom).quot;
}

int64_t libc_time_time(void* tloc) {
    return (int64_t)time(tloc);
}

int32_t libc_time_clock(void) {
    return (int32_t)clock();
}

double libc_time_difftime(int64_t time1, int64_t time0) {
    return (double)difftime(time1, time0);
}

int64_t libc_time_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

void* libc_time_gmtime(void* timep) {
    return (void*)gmtime(timep);
}

void* libc_time_gmtime_r(void* timep, void* result) {
    return (void*)gmtime_r(timep, result);
}

void* libc_time_localtime(void* timep) {
    return (void*)localtime(timep);
}

void* libc_time_localtime_r(void* timep, void* result) {
    return (void*)localtime_r(timep, result);
}

char* libc_time_asctime(void* tm) {
    return (char*)asctime(tm);
}

char* libc_time_asctime_r(void* tm, char* buf) {
    return (char*)asctime_r(tm, buf);
}

char* libc_time_ctime(void* timep) {
    return (char*)ctime(timep);
}

char* libc_time_ctime_r(void* timep, char* buf) {
    return (char*)ctime_r(timep, buf);
}

uint64_t libc_time_strftime(char* s, uint64_t maxsize, const char* format, void* timeptr) {
    return (uint64_t)strftime(s, maxsize, format, timeptr);
}

char* libc_time_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

int32_t libc_time_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_time_nanosleep(void* req, void* rem) {
    return (int32_t)nanosleep(req, rem);
}

int32_t libc_timex_ntp_gettime(void* buf) {
    return (int32_t)ntp_gettime(buf);
}

int32_t libc_timex_ntp_adjtime(void* buf) {
    return (int32_t)ntp_adjtime(buf);
}

int32_t libc_unistd_access(const char* pathname, int32_t mode) {
    return (int32_t)access(pathname, mode);
}

int32_t libc_unistd_close(int32_t fd) {
    return (int32_t)close(fd);
}

int64_t libc_unistd_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_unistd_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int64_t libc_unistd_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int32_t libc_unistd_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

int32_t libc_unistd_unlink(const char* pathname) {
    return (int32_t)unlink(pathname);
}

char* libc_unistd_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

int32_t libc_unistd_rmdir(const char* pathname) {
    return (int32_t)rmdir(pathname);
}

int32_t libc_unistd_getpid(void) {
    return (int32_t)getpid();
}

uint32_t libc_unistd_sleep(uint32_t seconds) {
    return (uint32_t)sleep(seconds);
}

int64_t libc_unistd_sysconf(int32_t name) {
    return (int64_t)sysconf(name);
}

int32_t libc_unix_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_unix_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_unix_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_unix_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_unix_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_unix_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_unix_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_unix_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_unix_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_unix_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_unix_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_unix_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_unix_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_unix_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void libc_unix_mod_qsort(void* base, uint64_t num, uint64_t size, void* compar) {
    qsort(base, num, size, compar);
}

void* libc_unix_mod_bsearch(void* key, void* base, uint64_t num, uint64_t size, void* compar) {
    bsearch(key, base, num, size, compar);
    return 0;
}

void* libc_unix_mod_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_unix_mod_freopen(const char* filename, const char* mode, void* file) {
    return (void*)freopen(filename, mode, file);
}

int32_t libc_unix_mod_fflush(void* file) {
    return (int32_t)fflush(file);
}

int32_t libc_unix_mod_fclose(void* file) {
    return (int32_t)fclose(file);
}

int32_t libc_unix_mod_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_unix_mod_rename(const char* oldname, const char* newname) {
    return (int32_t)rename(oldname, newname);
}

void* libc_unix_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_unix_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    setvbuf(stream, buffer, mode, size);
    return 0;
}

void libc_unix_mod_setbuf(void* stream, char* buf) {
    setbuf(stream, buf);
}

int32_t libc_unix_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_unix_mod_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_unix_mod_fgetc(void* stream) {
    return (int32_t)fgetc(stream);
}

char* libc_unix_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, stream);
}

int32_t libc_unix_mod_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, stream);
}

int32_t libc_unix_mod_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, stream);
}

int32_t libc_unix_mod_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_unix_mod_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, stream);
}

uint64_t libc_unix_mod_fread(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread(ptr, size, nobj, stream);
}

uint64_t libc_unix_mod_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite(ptr, size, nobj, stream);
}

int32_t libc_unix_mod_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek(stream, offset, whence);
}

int64_t libc_unix_mod_ftell(void* stream) {
    return (int64_t)ftell(stream);
}

void libc_unix_mod_rewind(void* stream) {
    rewind(stream);
}

int32_t libc_unix_mod_fgetpos(void* stream, void* ptr) {
    return (int32_t)fgetpos(stream, ptr);
}

int32_t libc_unix_mod_fsetpos(void* stream, void* ptr) {
    return (int32_t)fsetpos(stream, ptr);
}

int32_t libc_unix_mod_feof(void* stream) {
    return (int32_t)feof(stream);
}

int32_t libc_unix_mod_ferror(void* stream) {
    return (int32_t)ferror(stream);
}

void libc_unix_mod_clearerr(void* stream) {
    clearerr(stream);
}

void libc_unix_mod_perror(const char* s) {
    perror(s);
}

double libc_unix_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_unix_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_unix_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_unix_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_unix_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_unix_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_unix_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_unix_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_unix_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_unix_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

void* libc_unix_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_unix_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_unix_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_unix_mod_free(void* p) {
    free(p);
}

void libc_unix_mod_abort(void) {
    abort();
}

void libc_unix_mod_exit(int32_t status) {
    exit(status);
}

#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED)
int32_t libc_unix_mod_system(const char* s) {
    return (int32_t)system(s);
}
#else
int32_t libc_unix_mod_system(const char* s) {
    (void)s; errno = ENOSYS; return -1;
}
#endif

char* libc_unix_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

char* libc_unix_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_unix_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_unix_mod_stpcpy(char* dst, const char* src) {
    return (char*)stpcpy(dst, src);
}

char* libc_unix_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_unix_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_unix_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_unix_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_unix_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_unix_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_unix_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_unix_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_unix_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_unix_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_unix_mod_strndup(const char* cs, uint64_t n) {
    return (char*)strndup(cs, n);
}

char* libc_unix_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_unix_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

int32_t libc_unix_mod_strcasecmp(const char* s1, const char* s2) {
    return (int32_t)strcasecmp(s1, s2);
}

int32_t libc_unix_mod_strncasecmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncasecmp(s1, s2, n);
}

uint64_t libc_unix_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_unix_mod_strnlen(const char* cs, uint64_t maxlen) {
    return (uint64_t)strnlen(cs, maxlen);
}

char* libc_unix_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_unix_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

char* libc_unix_mod_strtok_r(char* s, const char* t, void* p) {
    return (char*)strtok_r(s, t, p);
}

uint64_t libc_unix_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

char* libc_unix_mod_strsignal(int32_t sig) {
    return (char*)strsignal(sig);
}

uint64_t libc_unix_mod_wcslen(void* buf) {
    return (uint64_t)wcslen(buf);
}

uint64_t libc_unix_mod_wcstombs(char* dest, void* src, uint64_t n) {
    return (uint64_t)wcstombs(dest, src, n);
}

void* libc_unix_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

void* libc_unix_mod_wmemchr(void* cx, int32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

int32_t libc_unix_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_unix_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_unix_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_unix_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

void* libc_unix_mod_memccpy(void* dest, void* src, int32_t c, uint64_t n) {
    return (void*)memccpy(dest, src, c, n);
}

void* libc_unix_mod_getpwnam(const char* name) {
    return (void*)getpwnam(name);
}

void* libc_unix_mod_getpwuid(uint16_t uid) {
    return (void*)getpwuid(uid);
}

int32_t libc_unix_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_unix_mod_putchar_unlocked(int32_t c) {
    return (int32_t)putchar_unlocked(c);
}

int32_t libc_unix_mod_socket(int32_t domain, int32_t ty, int32_t protocol) {
    return (int32_t)socket(domain, ty, protocol);
}

int32_t libc_unix_mod_connect(int32_t socket, void* address, uint32_t len) {
    return (int32_t)connect(socket, address, len);
}

int32_t libc_unix_mod_listen(int32_t socket, int32_t backlog) {
    return (int32_t)listen(socket, backlog);
}

int32_t libc_unix_mod_accept(int32_t socket, void* address, void* address_len) {
    return (int32_t)accept(socket, address, address_len);
}

int32_t libc_unix_mod_getpeername(int32_t socket, void* address, void* address_len) {
    return (int32_t)getpeername(socket, address, address_len);
}

int32_t libc_unix_mod_getsockname(int32_t socket, void* address, void* address_len) {
    return (int32_t)getsockname(socket, address, address_len);
}

int32_t libc_unix_mod_setsockopt(int32_t socket, int32_t level, int32_t name, void* value, uint32_t option_len) {
    return (int32_t)setsockopt(socket, level, name, value, option_len);
}

int32_t libc_unix_mod_socketpair(int32_t domain, int32_t type_, int32_t protocol, void* socket_vector) {
    return (int32_t)socketpair(domain, type_, protocol, socket_vector);
}

int64_t libc_unix_mod_sendto(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_unix_mod_shutdown(int32_t socket, int32_t how) {
    return (int32_t)shutdown(socket, how);
}

int32_t libc_unix_mod_chmod(const char* path, uint32_t mode) {
    return (int32_t)chmod(path, mode);
}

int32_t libc_unix_mod_fchmod(int32_t fd, uint32_t mode) {
    return (int32_t)fchmod(fd, mode);
}

int32_t libc_unix_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)fstat(fildes, buf);
}

int32_t libc_unix_mod_mkdir(const char* path, uint32_t mode) {
    return (int32_t)mkdir(path, mode);
}

int32_t libc_unix_mod_stat(const char* path, void* buf) {
    return (int32_t)stat(path, buf);
}

int32_t libc_unix_mod_pclose(void* stream) {
    return (int32_t)pclose(stream);
}

void* libc_unix_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)fdopen(fd, mode);
}

int32_t libc_unix_mod_fileno(void* stream) {
    return (int32_t)fileno(stream);
}

int32_t libc_unix_mod_creat(const char* path, uint32_t mode) {
    return (int32_t)creat(path, mode);
}

void* libc_unix_mod_opendir(const char* dirname) {
    return (void*)opendir(dirname);
}

void* libc_unix_mod_readdir(void* dirp) {
    return (void*)readdir(dirp);
}

int32_t libc_unix_mod_closedir(void* dirp) {
    return (int32_t)closedir(dirp);
}

void libc_unix_mod_rewinddir(void* dirp) {
    rewinddir(dirp);
}

int32_t libc_unix_mod_fchmodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t flags) {
    return (int32_t)fchmodat(dirfd, pathname, mode, flags);
}

int32_t libc_unix_mod_fchown(int32_t fd, uint16_t owner, uint16_t group) {
    return (int32_t)fchown(fd, owner, group);
}

int32_t libc_unix_mod_fchownat(int32_t dirfd, const char* pathname, uint16_t owner, uint16_t group, int32_t flags) {
    return (int32_t)fchownat(dirfd, pathname, owner, group, flags);
}

int32_t libc_unix_mod_fstatat(int32_t dirfd, const char* pathname, void* buf, int32_t flags) {
    return (int32_t)fstatat(dirfd, pathname, buf, flags);
}

int32_t libc_unix_mod_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_unix_mod_renameat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)renameat(olddirfd, oldpath, newdirfd, newpath);
}

int32_t libc_unix_mod_symlinkat(const char* target, int32_t newdirfd, const char* linkpath) {
    return (int32_t)symlinkat(target, newdirfd, linkpath);
}

int32_t libc_unix_mod_unlinkat(int32_t dirfd, const char* pathname, int32_t flags) {
    return (int32_t)unlinkat(dirfd, pathname, flags);
}

int32_t libc_unix_mod_access(const char* path, int32_t amode) {
    return (int32_t)access(path, amode);
}

uint32_t libc_unix_mod_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_unix_mod_chdir(const char* dir) {
    return (int32_t)chdir(dir);
}

int32_t libc_unix_mod_fchdir(int32_t dirfd) {
    return (int32_t)fchdir(dirfd);
}

int32_t libc_unix_mod_chown(const char* path, uint16_t uid, uint16_t gid) {
    return (int32_t)chown(path, uid, gid);
}

int32_t libc_unix_mod_lchown(const char* path, uint16_t uid, uint16_t gid) {
    return (int32_t)lchown(path, uid, gid);
}

int32_t libc_unix_mod_close(int32_t fd) {
    return (int32_t)close(fd);
}

int32_t libc_unix_mod_dup(int32_t fd) {
    return (int32_t)dup(fd);
}

int32_t libc_unix_mod_dup2(int32_t src, int32_t dst) {
    return (int32_t)dup2(src, dst);
}

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_unix_mod_execv(const char* prog, void* argv) {
    return (int32_t)execv(prog, argv);
}
#else
int32_t libc_unix_mod_execv(const char* prog, void* argv) {
    (void)prog; (void)argv; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_unix_mod_execve(const char* prog, void* argv, void* envp) {
    return (int32_t)execve(prog, argv, envp);
}
#else
int32_t libc_unix_mod_execve(const char* prog, void* argv, void* envp) {
    (void)prog; (void)argv; (void)envp; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_unix_mod_execvp(const char* c, void* argv) {
    return (int32_t)execvp(c, argv);
}
#else
int32_t libc_unix_mod_execvp(const char* c, void* argv) {
    (void)c; (void)argv; errno = ENOSYS; return -1;
}
#endif

#if !defined(__TV_OS_VERSION_MIN_REQUIRED) && !defined(__WATCH_OS_VERSION_MIN_REQUIRED)
int32_t libc_unix_mod_fork(void) {
    return (int32_t)fork();
}
#else
int32_t libc_unix_mod_fork(void) {
     errno = ENOSYS; return -1;
}
#endif

int64_t libc_unix_mod_fpathconf(int32_t filedes, int32_t name) {
    return (int64_t)fpathconf(filedes, name);
}

char* libc_unix_mod_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

uint16_t libc_unix_mod_getegid(void) {
    return (uint16_t)getegid();
}

uint16_t libc_unix_mod_geteuid(void) {
    return (uint16_t)geteuid();
}

uint16_t libc_unix_mod_getgid(void) {
    return (uint16_t)getgid();
}

int32_t libc_unix_mod_getgroups(int32_t ngroups_max, void* groups) {
    return (int32_t)getgroups(ngroups_max, groups);
}

char* libc_unix_mod_getlogin(void) {
    return (char*)getlogin();
}

int32_t libc_unix_mod_getopt(int32_t argc, void* argv, const char* optstr) {
    return (int32_t)getopt(argc, argv, optstr);
}

int32_t libc_unix_mod_getpgid(int32_t pid) {
    return (int32_t)getpgid(pid);
}

int32_t libc_unix_mod_getpgrp(void) {
    return (int32_t)getpgrp();
}

int32_t libc_unix_mod_getpid(void) {
    return (int32_t)getpid();
}

int32_t libc_unix_mod_getppid(void) {
    return (int32_t)getppid();
}

uint16_t libc_unix_mod_getuid(void) {
    return (uint16_t)getuid();
}

int32_t libc_unix_mod_isatty(int32_t fd) {
    return (int32_t)isatty(fd);
}

int32_t libc_unix_mod_link(const char* src, const char* dst) {
    return (int32_t)link(src, dst);
}

int64_t libc_unix_mod_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_unix_mod_pathconf(const char* path, int32_t name) {
    return (int64_t)pathconf(path, name);
}

int32_t libc_unix_mod_pipe(void* fds) {
    return (int32_t)pipe(fds);
}

int32_t libc_unix_mod_posix_memalign(void* memptr, uint64_t align, uint64_t size) {
    return (int32_t)posix_memalign(memptr, align, size);
}

void* libc_unix_mod_aligned_alloc(uint64_t alignment, uint64_t size) {
    return (void*)aligned_alloc(alignment, size);
}

int64_t libc_unix_mod_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int32_t libc_unix_mod_rmdir(const char* path) {
    return (int32_t)rmdir(path);
}

int32_t libc_unix_mod_seteuid(uint16_t uid) {
    return (int32_t)seteuid(uid);
}

int32_t libc_unix_mod_setegid(uint16_t gid) {
    return (int32_t)setegid(gid);
}

int32_t libc_unix_mod_setgid(uint16_t gid) {
    return (int32_t)setgid(gid);
}

int32_t libc_unix_mod_setpgid(int32_t pid, int32_t pgid) {
    return (int32_t)setpgid(pid, pgid);
}

int32_t libc_unix_mod_setsid(void) {
    return (int32_t)setsid();
}

int32_t libc_unix_mod_setuid(uint16_t uid) {
    return (int32_t)setuid(uid);
}

int32_t libc_unix_mod_setreuid(uint16_t ruid, uint16_t euid) {
    return (int32_t)setreuid(ruid, euid);
}

int32_t libc_unix_mod_setregid(uint16_t rgid, uint16_t egid) {
    return (int32_t)setregid(rgid, egid);
}

uint32_t libc_unix_mod_sleep(uint32_t secs) {
    return (uint32_t)sleep(secs);
}

int32_t libc_unix_mod_nanosleep(void* rqtp, void* rmtp) {
    return (int32_t)nanosleep(rqtp, rmtp);
}

int32_t libc_unix_mod_tcgetpgrp(int32_t fd) {
    return (int32_t)tcgetpgrp(fd);
}

int32_t libc_unix_mod_tcsetpgrp(int32_t fd, int32_t pgrp) {
    return (int32_t)tcsetpgrp(fd, pgrp);
}

char* libc_unix_mod_ttyname(int32_t fd) {
    return (char*)ttyname(fd);
}

int32_t libc_unix_mod_ttyname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ttyname_r(fd, buf, buflen);
}

int32_t libc_unix_mod_unlink(const char* c) {
    return (int32_t)unlink(c);
}

int32_t libc_unix_mod_wait(void* status) {
    return (int32_t)wait(status);
}

int32_t libc_unix_mod_waitpid(int32_t pid, void* status, int32_t options) {
    return (int32_t)waitpid(pid, status, options);
}

int64_t libc_unix_mod_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int64_t libc_unix_mod_pread(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread(fd, buf, count, offset);
}

int64_t libc_unix_mod_pwrite(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite(fd, buf, count, offset);
}

uint32_t libc_unix_mod_umask(uint32_t mask) {
    return (uint32_t)umask(mask);
}

int32_t libc_unix_mod_utime(const char* file, void* buf) {
    return (int32_t)utime(file, buf);
}

int32_t libc_unix_mod_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_unix_mod_killpg(int32_t pgrp, int32_t sig) {
    return (int32_t)killpg(pgrp, sig);
}

int32_t libc_unix_mod_mlock(void* addr, uint64_t len) {
    return (int32_t)mlock(addr, len);
}

int32_t libc_unix_mod_munlock(void* addr, uint64_t len) {
    return (int32_t)munlock(addr, len);
}

int32_t libc_unix_mod_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_unix_mod_munlockall(void) {
    return (int32_t)munlockall();
}

void* libc_unix_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
    return (void*)mmap(addr, len, prot, flags, fd, offset);
}

int32_t libc_unix_mod_munmap(void* addr, uint64_t len) {
    return (int32_t)munmap(addr, len);
}

uint32_t libc_unix_mod_if_nametoindex(const char* ifname) {
    return (uint32_t)if_nametoindex(ifname);
}

char* libc_unix_mod_if_indextoname(uint32_t ifindex, char* ifname) {
    return (char*)if_indextoname(ifindex, ifname);
}

int32_t libc_unix_mod_lstat(const char* path, void* buf) {
    return (int32_t)lstat(path, buf);
}

int32_t libc_unix_mod_fsync(int32_t fd) {
    return (int32_t)fsync(fd);
}

int32_t libc_unix_mod_setenv(const char* name, const char* val, int32_t overwrite) {
    return (int32_t)setenv(name, val, overwrite);
}

int32_t libc_unix_mod_unsetenv(const char* name) {
    return (int32_t)unsetenv(name);
}

int32_t libc_unix_mod_symlink(const char* path1, const char* path2) {
    return (int32_t)symlink(path1, path2);
}

int32_t libc_unix_mod_truncate(const char* path, int64_t length) {
    return (int32_t)truncate(path, length);
}

int32_t libc_unix_mod_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

uint64_t libc_unix_mod_signal(int32_t signum, uint64_t handler) {
    return (uint64_t)signal(signum, handler);
}

int32_t libc_unix_mod_getrusage(int32_t resource, void* usage) {
    return (int32_t)getrusage(resource, usage);
}

char* libc_unix_mod_realpath(const char* pathname, char* resolved) {
    return (char*)realpath(pathname, resolved);
}

int32_t libc_unix_mod_times(void* buf) {
    return (int32_t)times(buf);
}

int32_t libc_unix_mod_pthread_self(void) {
    return (int32_t)pthread_self();
}

int32_t libc_unix_mod_pthread_equal(int32_t t1, int32_t t2) {
    return (int32_t)pthread_equal(t1, t2);
}

int32_t libc_unix_mod_pthread_join(int32_t native, void* value) {
    return (int32_t)pthread_join(native, value);
}

void libc_unix_mod_pthread_exit(void* value) {
    pthread_exit(value);
}

int32_t libc_unix_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_unix_mod_pthread_attr_destroy(void* attr) {
    return (int32_t)pthread_attr_destroy(attr);
}

int32_t libc_unix_mod_pthread_attr_getstacksize(void* attr, void* stacksize) {
    return (int32_t)pthread_attr_getstacksize(attr, stacksize);
}

int32_t libc_unix_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size) {
    return (int32_t)pthread_attr_setstacksize(attr, stack_size);
}

int32_t libc_unix_mod_pthread_attr_setdetachstate(void* attr, int32_t state) {
    return (int32_t)pthread_attr_setdetachstate(attr, state);
}

int32_t libc_unix_mod_pthread_detach(int32_t thread) {
    return (int32_t)pthread_detach(thread);
}

int32_t libc_unix_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_unix_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_unix_mod_pthread_key_delete(int32_t key) {
    return (int32_t)pthread_key_delete(key);
}

void* libc_unix_mod_pthread_getspecific(int32_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_unix_mod_pthread_setspecific(int32_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

int32_t libc_unix_mod_pthread_mutex_init(void* lock, void* attr) {
    return (int32_t)pthread_mutex_init(lock, attr);
}

int32_t libc_unix_mod_pthread_mutex_destroy(void* lock) {
    return (int32_t)pthread_mutex_destroy(lock);
}

int32_t libc_unix_mod_pthread_mutex_lock(void* lock) {
    return (int32_t)pthread_mutex_lock(lock);
}

int32_t libc_unix_mod_pthread_mutex_trylock(void* lock) {
    return (int32_t)pthread_mutex_trylock(lock);
}

int32_t libc_unix_mod_pthread_mutex_unlock(void* lock) {
    return (int32_t)pthread_mutex_unlock(lock);
}

int32_t libc_unix_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_unix_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_unix_mod_pthread_mutexattr_settype(void* attr, int32_t _type) {
    return (int32_t)pthread_mutexattr_settype(attr, _type);
}

int32_t libc_unix_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_unix_mod_pthread_cond_wait(void* cond, void* lock) {
    return (int32_t)pthread_cond_wait(cond, lock);
}

int32_t libc_unix_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, lock, abstime);
}

int32_t libc_unix_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_unix_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_unix_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_unix_mod_pthread_condattr_init(void* attr) {
    return (int32_t)pthread_condattr_init(attr);
}

int32_t libc_unix_mod_pthread_condattr_destroy(void* attr) {
    return (int32_t)pthread_condattr_destroy(attr);
}

int32_t libc_unix_mod_pthread_rwlock_init(void* lock, void* attr) {
    return (int32_t)pthread_rwlock_init(lock, attr);
}

int32_t libc_unix_mod_pthread_rwlock_destroy(void* lock) {
    return (int32_t)pthread_rwlock_destroy(lock);
}

int32_t libc_unix_mod_pthread_rwlock_rdlock(void* lock) {
    return (int32_t)pthread_rwlock_rdlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_tryrdlock(void* lock) {
    return (int32_t)pthread_rwlock_tryrdlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_wrlock(void* lock) {
    return (int32_t)pthread_rwlock_wrlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_trywrlock(void* lock) {
    return (int32_t)pthread_rwlock_trywrlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_unlock(void* lock) {
    return (int32_t)pthread_rwlock_unlock(lock);
}

int32_t libc_unix_mod_pthread_rwlockattr_init(void* attr) {
    return (int32_t)pthread_rwlockattr_init(attr);
}

int32_t libc_unix_mod_pthread_rwlockattr_destroy(void* attr) {
    return (int32_t)pthread_rwlockattr_destroy(attr);
}

int32_t libc_unix_mod_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_unix_mod_raise(int32_t signum) {
    return (int32_t)raise(signum);
}

int32_t libc_unix_mod_utimes(const char* filename, void* times) {
    return (int32_t)utimes(filename, times);
}

void* libc_unix_mod_dlopen(const char* filename, int32_t flag) {
    return (void*)dlopen(filename, flag);
}

char* libc_unix_mod_dlerror(void) {
    return (char*)dlerror();
}

void* libc_unix_mod_dlsym(void* handle, const char* symbol) {
    return (void*)dlsym(handle, symbol);
}

int32_t libc_unix_mod_dlclose(void* handle) {
    return (int32_t)dlclose(handle);
}

int32_t libc_unix_mod_getaddrinfo(const char* node, const char* service, void* hints, void* res) {
    return (int32_t)getaddrinfo(node, service, hints, res);
}

void libc_unix_mod_freeaddrinfo(void* res) {
    freeaddrinfo(res);
}

const char* libc_unix_mod_hstrerror(int32_t errcode) {
    return (const char*)hstrerror(errcode);
}

const char* libc_unix_mod_gai_strerror(int32_t errcode) {
    return (const char*)gai_strerror(errcode);
}

int32_t libc_unix_mod_res_init(void) {
    return (int32_t)res_init();
}

void* libc_unix_mod_gmtime_r(void* time_p, void* result) {
    return (void*)gmtime_r(time_p, result);
}

void* libc_unix_mod_localtime_r(void* time_p, void* result) {
    return (void*)localtime_r(time_p, result);
}

int64_t libc_unix_mod_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

int64_t libc_unix_mod_time(void* time_p) {
    return (int64_t)time(time_p);
}

void* libc_unix_mod_gmtime(void* time_p) {
    return (void*)gmtime(time_p);
}

void* libc_unix_mod_localtime(void* time_p) {
    return (void*)localtime(time_p);
}

double libc_unix_mod_difftime(int64_t time1, int64_t time0) {
    return (double)difftime(time1, time0);
}

int64_t libc_unix_mod_timegm(void* tm) {
    return (int64_t)timegm(tm);
}

int32_t libc_unix_mod_mknod(const char* pathname, uint32_t mode, int32_t dev) {
    return (int32_t)mknod(pathname, mode, dev);
}

int32_t libc_unix_mod_gethostname(char* name, uint64_t len) {
    return (int32_t)gethostname(name, len);
}

void libc_unix_mod_endservent(void) {
    endservent();
}

void* libc_unix_mod_getservbyname(const char* name, const char* proto) {
    return (void*)getservbyname(name, proto);
}

void* libc_unix_mod_getservbyport(int32_t port, const char* proto) {
    return (void*)getservbyport(port, proto);
}

void* libc_unix_mod_getservent(void) {
    return (void*)getservent();
}

void libc_unix_mod_setservent(int32_t stayopen) {
    setservent(stayopen);
}

void* libc_unix_mod_getprotobyname(const char* name) {
    return (void*)getprotobyname(name);
}

void* libc_unix_mod_getprotobynumber(int32_t proto) {
    return (void*)getprotobynumber(proto);
}

int32_t libc_unix_mod_chroot(const char* name) {
    return (int32_t)chroot(name);
}

int32_t libc_unix_mod_usleep(int32_t secs) {
    return (int32_t)usleep(secs);
}

int64_t libc_unix_mod_send(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)send(socket, buf, len, flags);
}

int64_t libc_unix_mod_recv(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)recv(socket, buf, len, flags);
}

int32_t libc_unix_mod_putenv(char* string) {
    return (int32_t)putenv(string);
}

int32_t libc_unix_mod_poll(void* fds, int32_t nfds, int32_t timeout) {
    return (int32_t)poll(fds, nfds, timeout);
}

int32_t libc_unix_mod_select(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout) {
    return (int32_t)select(nfds, readfds, writefds, errorfds, timeout);
}

char* libc_unix_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_unix_mod_localeconv(void) {
    return (void*)localeconv();
}

int32_t libc_unix_mod_sem_wait(void* sem) {
    return (int32_t)sem_wait(sem);
}

int32_t libc_unix_mod_sem_trywait(void* sem) {
    return (int32_t)sem_trywait(sem);
}

int32_t libc_unix_mod_sem_post(void* sem) {
    return (int32_t)sem_post(sem);
}

int32_t libc_unix_mod_statvfs(const char* path, void* buf) {
    return (int32_t)statvfs(path, buf);
}

int32_t libc_unix_mod_fstatvfs(int32_t fd, void* buf) {
    return (int32_t)fstatvfs(fd, buf);
}

int32_t libc_unix_mod_sigemptyset(void* set) {
    sigemptyset((sigset_t*)set);
    return 0;
}

int32_t libc_unix_mod_sigaddset(void* set, int32_t signum) {
    sigaddset((sigset_t*)set, signum);
    return 0;
}

int32_t libc_unix_mod_sigfillset(void* set) {
    sigfillset((sigset_t*)set);
    return 0;
}

int32_t libc_unix_mod_sigdelset(void* set, int32_t signum) {
    sigdelset((sigset_t*)set, signum);
    return 0;
}

int32_t libc_unix_mod_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember((sigset_t*)set, signum);
}

int32_t libc_unix_mod_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, (sigset_t*)set, (sigset_t*)oldset);
}

int32_t libc_unix_mod_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int64_t libc_unix_mod_sysconf(int32_t name) {
    return (int64_t)sysconf(name);
}

int32_t libc_unix_mod_mkfifo(const char* path, uint32_t mode) {
    return (int32_t)mkfifo(path, mode);
}

int32_t libc_unix_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko(stream, offset, whence);
}

int64_t libc_unix_mod_ftello(void* stream) {
    return (int64_t)ftello(stream);
}

int32_t libc_unix_mod_tcdrain(int32_t fd) {
    return (int32_t)tcdrain(fd);
}

int32_t libc_unix_mod_cfgetispeed(void* termios) {
    return (int32_t)cfgetispeed(termios);
}

int32_t libc_unix_mod_cfgetospeed(void* termios) {
    return (int32_t)cfgetospeed(termios);
}

int32_t libc_unix_mod_cfsetispeed(void* termios, int32_t speed) {
    return (int32_t)cfsetispeed(termios, speed);
}

int32_t libc_unix_mod_cfsetospeed(void* termios, int32_t speed) {
    return (int32_t)cfsetospeed(termios, speed);
}

int32_t libc_unix_mod_tcgetattr(int32_t fd, void* termios) {
    return (int32_t)tcgetattr(fd, termios);
}

int32_t libc_unix_mod_tcsetattr(int32_t fd, int32_t optional_actions, void* termios) {
    return (int32_t)tcsetattr(fd, optional_actions, termios);
}

int32_t libc_unix_mod_tcflow(int32_t fd, int32_t action) {
    return (int32_t)tcflow(fd, action);
}

int32_t libc_unix_mod_tcflush(int32_t fd, int32_t action) {
    return (int32_t)tcflush(fd, action);
}

int32_t libc_unix_mod_tcgetsid(int32_t fd) {
    return (int32_t)tcgetsid(fd);
}

int32_t libc_unix_mod_tcsendbreak(int32_t fd, int32_t duration) {
    return (int32_t)tcsendbreak(fd, duration);
}

int32_t libc_unix_mod_mkstemp(char* template) {
    return (int32_t)mkstemp(template);
}

char* libc_unix_mod_mkdtemp(char* template) {
    return (char*)mkdtemp(template);
}

char* libc_unix_mod_tmpnam(char* ptr) {
    return (char*)tmpnam(ptr);
}

void libc_unix_mod_openlog(const char* ident, int32_t logopt, int32_t facility) {
    openlog(ident, logopt, facility);
}

void libc_unix_mod_closelog(void) {
    closelog();
}

int32_t libc_unix_mod_setlogmask(int32_t maskpri) {
    return (int32_t)setlogmask(maskpri);
}

int32_t libc_unix_mod_nice(int32_t incr) {
    return (int32_t)nice(incr);
}

int32_t libc_unix_mod_grantpt(int32_t fd) {
    return (int32_t)grantpt(fd);
}

int32_t libc_unix_mod_posix_openpt(int32_t flags) {
    return (int32_t)posix_openpt(flags);
}

char* libc_unix_mod_ptsname(int32_t fd) {
    return (char*)ptsname(fd);
}

int32_t libc_unix_mod_unlockpt(int32_t fd) {
    return (int32_t)unlockpt(fd);
}

char* libc_unix_mod_strcasestr(const char* cs, const char* ct) {
    return (char*)strcasestr(cs, ct);
}

int64_t libc_unix_mod_getline(void* lineptr, void* n, void* stream) {
    return (int64_t)getline(lineptr, n, stream);
}

int32_t libc_unix_mod_lockf(int32_t fd, int32_t cmd, int64_t len) {
    return (int32_t)lockf(fd, cmd, len);
}

int32_t libc_unix_mod_adjtime(void* delta, void* olddelta) {
    return (int32_t)adjtime(delta, olddelta);
}

char* libc_unix_mod_stpncpy(char* dst, const char* src, uint64_t n) {
    return (char*)stpncpy(dst, src, n);
}

#if !defined(__APPLE__)
int32_t libc_unix_mod_sigqueue(int32_t pid, int32_t sig, int32_t value) {
    return (int32_t)sigqueue(pid, sig, value);
}
#else
int32_t libc_unix_mod_sigqueue(int32_t pid, int32_t sig, int32_t value) {
    (void)pid; (void)sig; (void)value; errno = ENOSYS; return -1;
}
#endif

uint64_t libc_unix_mod_confstr(int32_t name, char* buf, uint64_t len) {
    return (uint64_t)confstr(name, buf, len);
}

int32_t libc_unix_mod_dladdr(void* addr, void* info) {
    return (int32_t)dladdr(addr, info);
}

int32_t libc_unix_mod_flock(int32_t fd, int32_t operation) {
    return (int32_t)flock(fd, operation);
}

void* libc_unix_mod_open_wmemstream(void* ptr, void* sizeloc) {
    return (void*)open_wmemstream(ptr, sizeloc);
}

int32_t libc_unix_mod_getsid(int32_t pid) {
    return (int32_t)getsid(pid);
}

int32_t libc_unix_mod_pause(void) {
    return (int32_t)pause();
}

int32_t libc_unix_mod_mkdirat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkdirat(dirfd, pathname, mode);
}

void* libc_unix_mod_fdopendir(int32_t fd) {
    return (void*)fdopendir(fd);
}

int32_t libc_unix_mod_readdir_r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir_r(dirp, entry, result);
}

int32_t libc_unix_mod_readlinkat(int32_t dirfd, const char* pathname, char* buf, uint64_t bufsiz) {
    return (int32_t)readlinkat(dirfd, pathname, buf, bufsiz);
}

int32_t libc_unix_mod_readlink(const char* path, char* buf, uint64_t bufsz) {
    return (int32_t)readlink(path, buf, bufsz);
}

int32_t libc_unix_mod_pselect(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout, void* sigmask) {
    return (int32_t)pselect(nfds, readfds, writefds, errorfds, timeout, sigmask);
}

int32_t libc_unix_mod_sigaction(int32_t signum, void* act, void* oldact) {
    return (int32_t)sigaction(signum, act, oldact);
}

void* libc_unix_mod_fmemopen(void* buf, uint64_t size, const char* mode) {
    return (void*)fmemopen(buf, size, mode);
}

void* libc_unix_mod_open_memstream(void* ptr, void* sizeloc) {
    return (void*)open_memstream(ptr, sizeloc);
}

int32_t libc_unix_mod_atexit(int32_t cb) {
    return (int32_t)atexit(cb);
}

int32_t libc_unix_mod_cfmakeraw(void* termios) {
    cfmakeraw(termios);
    return 0;
}

int32_t libc_unix_mod_cfsetspeed(void* termios, int32_t speed) {
    cfsetspeed(termios, speed);
    return 0;
}

int32_t libc_unix_mod_fnmatch(const char* pattern, const char* name, int32_t flags) {
    return (int32_t)fnmatch(pattern, name, flags);
}

#if !defined(__APPLE__)
int32_t libc_utmp_utmpname(const char* file) {
    return (int32_t)utmpname(file);
}
#else
int32_t libc_utmp_utmpname(const char* file) {
    (void)file; errno = ENOSYS; return -1;
}
#endif

#if !defined(__APPLE__)
void libc_utmp_setutent(void) {
    setutent();
}
#else
void libc_utmp_setutent(void) {
    
}
#endif

#if !defined(__APPLE__)
void* libc_utmp_getutent(void) {
    return (void*)getutent();
}
#else
void* libc_utmp_getutent(void) {
     return NULL;
}
#endif

#if !defined(__APPLE__)
void libc_utmp_endutent(void) {
    endutent();
}
#else
void libc_utmp_endutent(void) {
    
}
#endif

void libc_utmpx_setutxent(void) {
    setutxent();
}

void libc_utmpx_endutxent(void) {
    endutxent();
}

void* libc_utmpx_getutxent(void) {
    return (void*)getutxent();
}

void* libc_utmpx_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_utmpx_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_utmpx_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

#if !defined(__APPLE__)
int32_t libc_utmpx_updwtmpx(const char* file, void* ut) {
    return (int32_t)updwtmpx(file, ut);
}
#else
int32_t libc_utmpx_updwtmpx(const char* file, void* ut) {
    (void)file; (void)ut; errno = ENOSYS; return -1;
}
#endif

#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED)
void* libc_utmpx_getlastlogx(const char* fname, uint32_t uid, void* ll) {
    (void)ll; return (void*)getlastlogx(fname, uid);
}
#else
void* libc_utmpx_getlastlogx(const char* fname, uint32_t uid, void* ll) {
    (void)fname; (void)uid; (void)ll; return NULL;
}
#endif

#if !defined(__APPLE__)
int32_t libc_utmpx_updlastlogx(const char* fname, uint32_t uid, void* ll) {
    return (int32_t)updlastlogx(fname, uid, ll);
}
#else
int32_t libc_utmpx_updlastlogx(const char* fname, uint32_t uid, void* ll) {
    (void)fname; (void)uid; (void)ll; errno = ENOSYS; return -1;
}
#endif

void libc_utmpx_getutmp(void* ux, void* u) {
    getutmp(ux, u);
}

void libc_utmpx_getutmpx(void* u, void* ux) {
    getutmpx(u, ux);
}

int32_t libc_utmpx_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

