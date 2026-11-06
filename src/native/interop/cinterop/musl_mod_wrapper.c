#include "musl_mod_wrapper.h"
#include <errno.h>

int32_t libc_musl_mod_getrlimit(int32_t resource, void* rlim) {
    return (int32_t)getrlimit(resource, rlim);
}

int32_t libc_musl_mod_setrlimit(int32_t resource, void* rlim) {
    return (int32_t)setrlimit(resource, rlim);
}

int32_t libc_musl_mod_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit) {
    return (int32_t)prlimit(pid, resource, new_limit, old_limit);
}

int32_t libc_musl_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_musl_mod_getpriority(int32_t which, int32_t who) {
    return (int32_t)getpriority(which, who);
}

int32_t libc_musl_mod_setpriority(int32_t which, int32_t who, int32_t prio) {
    return (int32_t)setpriority(which, who, prio);
}

int32_t libc_musl_mod_fanotify_mark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path) {
    return (int32_t)fanotify_mark(fd, flags, mask, dirfd, path);
}

int64_t libc_musl_mod_preadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags) {
    return (int64_t)preadv2(fd, iov, iovcnt, offset, flags);
}

int64_t libc_musl_mod_pwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags) {
    return (int64_t)pwritev2(fd, iov, iovcnt, offset, flags);
}

uint64_t libc_musl_mod_getauxval(uint64_t type_) {
    return (uint64_t)getauxval(type_);
}

void libc_musl_mod_explicit_bzero(void* s, uint64_t len) {
    explicit_bzero(s, len);
}

void* libc_musl_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size) {
    return (void*)reallocarray(ptr, nmemb, size);
}

int32_t libc_musl_mod_adjtimex(void* buf) {
    return (int32_t)adjtimex(buf);
}

int32_t libc_musl_mod_clock_adjtime(int32_t clk_id, void* buf) {
    return (int32_t)clock_adjtime(clk_id, buf);
}

char* libc_musl_mod_ctermid(char* s) {
    return (char*)ctermid(s);
}

int32_t libc_musl_mod_memfd_create(const char* name, uint32_t flags) {
#if defined(__linux__)
    return (int32_t)memfd_create(name, flags);
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_musl_mod_mlock2(void* addr, uint64_t len, uint32_t flags) {
    return (int32_t)mlock2(addr, len, flags);
}

uint64_t libc_musl_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

int32_t libc_musl_mod_euidaccess(const char* pathname, int32_t mode) {
    return (int32_t)euidaccess(pathname, mode);
}

int32_t libc_musl_mod_eaccess(const char* pathname, int32_t mode) {
    return (int32_t)eaccess(pathname, mode);
}

char* libc_musl_mod_asctime_r(void* tm, char* buf) {
    return (char*)asctime_r(tm, buf);
}

char* libc_musl_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_musl_mod_basename(char* path) {
    return (char*)basename(path);
}

int64_t libc_musl_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

int32_t libc_musl_mod_posix_spawn_file_actions_addchdir_np(void* actions, const char* path) {
    return (int32_t)posix_spawn_file_actions_addchdir_np(actions, path);
}

int32_t libc_musl_mod_posix_spawn_file_actions_addfchdir_np(void* actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir_np(actions, fd);
}

void* libc_musl_mod_getutxent(void) {
    return (void*)getutxent();
}

void* libc_musl_mod_getutxid(void* ut) {
    return (void*)getutxid(ut);
}

void* libc_musl_mod_getutxline(void* ut) {
    return (void*)getutxline(ut);
}

void* libc_musl_mod_pututxline(void* ut) {
    return (void*)pututxline(ut);
}

void libc_musl_mod_setutxent(void) {
    setutxent();
}

void libc_musl_mod_endutxent(void) {
    endutxent();
}

int32_t libc_musl_mod_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

int32_t libc_musl_mod_pthread_tryjoin_np(void* thread, void* retval) {
    return (int32_t)pthread_tryjoin_np(thread, retval);
}

int32_t libc_musl_mod_pthread_timedjoin_np(void* thread, void* retval, void* abstime) {
    return (int32_t)pthread_timedjoin_np(thread, retval, abstime);
}

