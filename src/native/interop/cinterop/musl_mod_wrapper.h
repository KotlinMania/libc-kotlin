#ifndef LIBC_MUSL_MOD_MUSL_MOD_WRAPPER_H
#define LIBC_MUSL_MOD_MUSL_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_musl_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_musl_mod_setrlimit(int32_t resource, void* rlim);
int32_t libc_musl_mod_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_musl_mod_gettimeofday(void* tp, void* tz);
int32_t libc_musl_mod_getpriority(int32_t which, int32_t who);
int32_t libc_musl_mod_setpriority(int32_t which, int32_t who, int32_t prio);
int32_t libc_musl_mod_fanotify_mark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int64_t libc_musl_mod_preadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libc_musl_mod_pwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
uint64_t libc_musl_mod_getauxval(uint64_t type_);
void libc_musl_mod_explicit_bzero(void* s, uint64_t len);
void* libc_musl_mod_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libc_musl_mod_adjtimex(void* buf);
int32_t libc_musl_mod_clock_adjtime(int32_t clk_id, void* buf);
char* libc_musl_mod_ctermid(char* s);
int32_t libc_musl_mod_memfd_create(const char* name, uint32_t flags);
int32_t libc_musl_mod_mlock2(void* addr, uint64_t len, uint32_t flags);
uint64_t libc_musl_mod_malloc_usable_size(void* ptr);
int32_t libc_musl_mod_euidaccess(const char* pathname, int32_t mode);
int32_t libc_musl_mod_eaccess(const char* pathname, int32_t mode);
char* libc_musl_mod_asctime_r(void* tm, char* buf);
char* libc_musl_mod_dirname(char* path);
char* libc_musl_mod_basename(char* path);
int64_t libc_musl_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_musl_mod_posix_spawn_file_actions_addchdir_np(void* actions, const char* path);
int32_t libc_musl_mod_posix_spawn_file_actions_addfchdir_np(void* actions, int32_t fd);
void* libc_musl_mod_getutxent(void);
void* libc_musl_mod_getutxid(void* ut);
void* libc_musl_mod_getutxline(void* ut);
void* libc_musl_mod_pututxline(void* ut);
void libc_musl_mod_setutxent(void);
void libc_musl_mod_endutxent(void);
int32_t libc_musl_mod_utmpxname(const char* file);
int32_t libc_musl_mod_pthread_tryjoin_np(void* thread, void* retval);
int32_t libc_musl_mod_pthread_timedjoin_np(void* thread, void* retval, void* abstime);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_MUSL_MOD_MUSL_MOD_WRAPPER_H */
