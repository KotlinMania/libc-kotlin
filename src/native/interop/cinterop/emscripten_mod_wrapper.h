#ifndef LIBC_EMSCRIPTEN_MOD_EMSCRIPTEN_MOD_WRAPPER_H
#define LIBC_EMSCRIPTEN_MOD_EMSCRIPTEN_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_emscripten_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_emscripten_mod_setrlimit(int32_t resource, void* rlim);
int32_t libc_emscripten_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_emscripten_mod_abs(int32_t i);
int64_t libc_emscripten_mod_labs(int64_t i);
int32_t libc_emscripten_mod_rand(void);
void libc_emscripten_mod_srand(uint32_t seed);
int32_t libc_emscripten_mod_gettimeofday(void* tp, void* tz);
void libc_emscripten_mod_setpwent(void);
void libc_emscripten_mod_endpwent(void);
void* libc_emscripten_mod_getpwent(void);
int32_t libc_emscripten_mod_shm_open(const char* name, int32_t oflag, uint32_t mode);
int32_t libc_emscripten_mod_mprotect(void* addr, uint64_t len, int32_t prot);
void* libc_emscripten_mod_errno_location(void);
int32_t libc_emscripten_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libc_emscripten_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_emscripten_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_emscripten_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags);
char* libc_emscripten_mod_nl_langinfo_l(int32_t item, int32_t locale);
int32_t libc_emscripten_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libc_emscripten_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_emscripten_mod_getloadavg(void* loadavg, int32_t nelem);
int32_t libc_emscripten_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
int32_t libc_emscripten_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_emscripten_mod_globfree(void* pglob);
int32_t libc_emscripten_mod_posix_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_emscripten_mod_shm_unlink(const char* name);
void libc_emscripten_mod_seekdir(void* dirp, int64_t loc);
int64_t libc_emscripten_mod_telldir(void* dirp);
int32_t libc_emscripten_mod_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_emscripten_mod_msync(void* addr, uint64_t len, int32_t flags);
int64_t libc_emscripten_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libc_emscripten_mod_mkstemps(char* template, int32_t suffixlen);
char* libc_emscripten_mod_nl_langinfo(int32_t item);
int32_t libc_emscripten_mod_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags);
int32_t libc_emscripten_mod_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout);
void libc_emscripten_mod_sync(void);
int32_t libc_emscripten_mod_getpriority(int32_t which, int32_t who);
int32_t libc_emscripten_mod_setpriority(int32_t which, int32_t who, int32_t prio);
int32_t libc_emscripten_mod_getentropy(void* buf, uint64_t buflen);
void* libc_emscripten_mod_getgrgid(uint32_t gid);
void* libc_emscripten_mod_getgrnam(const char* name);
int32_t libc_emscripten_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_emscripten_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_EMSCRIPTEN_MOD_EMSCRIPTEN_MOD_WRAPPER_H */
