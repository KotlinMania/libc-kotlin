#ifndef LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_linux_musl_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_musl_setrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_linux_musl_prlimit(int32_t pid, int32_t resource, void* new_limit, void* old_limit);
int32_t libc_unix_linuxlike_linux_musl_gettimeofday(void* tp, void* tz);
int64_t libc_unix_linuxlike_linux_musl_ptrace(int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_linux_musl_getpriority(int32_t which, uint32_t who);
int32_t libc_unix_linuxlike_linux_musl_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_unix_linuxlike_linux_musl_fanotifyMark(int32_t fd, uint32_t flags, uint64_t mask, int32_t dirfd, const char* path);
int64_t libc_unix_linuxlike_linux_musl_preadv2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
int64_t libc_unix_linuxlike_linux_musl_pwritev2(int32_t fd, void* iov, int32_t iovcnt, int64_t offset, int32_t flags);
uint64_t libc_unix_linuxlike_linux_musl_getauxval(uint64_t type_);
void libc_unix_linuxlike_linux_musl_explicitBzero(void* s, uint64_t len);
void* libc_unix_linuxlike_linux_musl_reallocarray(void* ptr, uint64_t nmemb, uint64_t size);
int32_t libc_unix_linuxlike_linux_musl_adjtimex(void* buf);
int32_t libc_unix_linuxlike_linux_musl_clockAdjtime(int32_t clk_id, void* buf);
char* libc_unix_linuxlike_linux_musl_ctermid(char* s);
int32_t libc_unix_linuxlike_linux_musl_memfdCreate(const char* name, uint32_t flags);
int32_t libc_unix_linuxlike_linux_musl_mlock2(void* addr, uint64_t len, uint32_t flags);
uint64_t libc_unix_linuxlike_linux_musl_mallocUsableSize(void* ptr);
int32_t libc_unix_linuxlike_linux_musl_euidaccess(const char* pathname, int32_t mode);
int32_t libc_unix_linuxlike_linux_musl_eaccess(const char* pathname, int32_t mode);
char* libc_unix_linuxlike_linux_musl_asctimeR(void* tm, char* buf);
char* libc_unix_linuxlike_linux_musl_dirname(char* path);
char* libc_unix_linuxlike_linux_musl_basename(char* path);
int64_t libc_unix_linuxlike_linux_musl_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp(void* actions, const char* path);
int32_t libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp(void* actions, int32_t fd);
void* libc_unix_linuxlike_linux_musl_getutxent(void);
void* libc_unix_linuxlike_linux_musl_getutxid(void* ut);
void* libc_unix_linuxlike_linux_musl_getutxline(void* ut);
void* libc_unix_linuxlike_linux_musl_pututxline(void* ut);
void libc_unix_linuxlike_linux_musl_setutxent(void);
void libc_unix_linuxlike_linux_musl_endutxent(void);
int32_t libc_unix_linuxlike_linux_musl_utmpxname(const char* file);
int32_t libc_unix_linuxlike_linux_musl_pthreadTryjoinNp(void* thread, void* retval);
int32_t libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp(void* thread, void* retval, void* abstime);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_MUSL_UNIX_LINUXLIKE_LINUX_MUSL_WRAPPER_H */
