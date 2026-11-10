#ifndef LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_linuxlike_emscripten_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_emscripten_setrlimit(int32_t resource, void* rlim);
int32_t libc_unix_linuxlike_emscripten_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_linuxlike_emscripten_abs(int32_t i);
int64_t libc_unix_linuxlike_emscripten_labs(int64_t i);
int32_t libc_unix_linuxlike_emscripten_rand(void);
void libc_unix_linuxlike_emscripten_srand(uint32_t seed);
int32_t libc_unix_linuxlike_emscripten_gettimeofday(void* tp, void* tz);
void libc_unix_linuxlike_emscripten_setpwent(void);
void libc_unix_linuxlike_emscripten_endpwent(void);
void* libc_unix_linuxlike_emscripten_getpwent(void);
int32_t libc_unix_linuxlike_emscripten_shmOpen(const char* name, int32_t oflag, uint32_t mode);
int32_t libc_unix_linuxlike_emscripten_mprotect(void* addr, uint64_t len, int32_t prot);
void* libc_unix_linuxlike_emscripten_errnoLocation(void);
int32_t libc_unix_linuxlike_emscripten_posixFallocate(int32_t fd, int64_t offset, int64_t len);
int64_t libc_unix_linuxlike_emscripten_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_linuxlike_emscripten_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_linuxlike_emscripten_dup3(int32_t oldfd, int32_t newfd, int32_t flags);
char* libc_unix_linuxlike_emscripten_nlLanginfoL(int32_t item, void* locale);
int32_t libc_unix_linuxlike_emscripten_accept4(int32_t fd, void* addr, void* len, int32_t flg);
int32_t libc_unix_linuxlike_emscripten_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_unix_linuxlike_emscripten_getloadavg(void* loadavg, int32_t nelem);
int32_t libc_unix_linuxlike_emscripten_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode);
void* libc_unix_linuxlike_emscripten_mremap(void* addr, uint64_t len, uint64_t new_len, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_emscripten_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob);
void libc_unix_linuxlike_emscripten_globfree(void* pglob);
int32_t libc_unix_linuxlike_emscripten_posixMadvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_linuxlike_emscripten_shmUnlink(const char* name);
void libc_unix_linuxlike_emscripten_seekdir(void* dirp, int64_t loc);
int64_t libc_unix_linuxlike_emscripten_telldir(void* dirp);
int32_t libc_unix_linuxlike_emscripten_madvise(void* addr, uint64_t len, int32_t advice);
int32_t libc_unix_linuxlike_emscripten_msync(void* addr, uint64_t len, int32_t flags);
int64_t libc_unix_linuxlike_emscripten_recvfrom(int32_t arg_0_socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen);
int32_t libc_unix_linuxlike_emscripten_mkstemps(char* arg_0_template, int32_t suffixlen);
char* libc_unix_linuxlike_emscripten_nlLanginfo(int32_t item);
int32_t libc_unix_linuxlike_emscripten_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags);
int32_t libc_unix_linuxlike_emscripten_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, uint32_t flags, void* timeout);
void libc_unix_linuxlike_emscripten_sync(void);
int32_t libc_unix_linuxlike_emscripten_ioctl(int32_t fd, int32_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_unix_linuxlike_emscripten_getpriority(int32_t which, uint32_t who);
int32_t libc_unix_linuxlike_emscripten_setpriority(int32_t which, uint32_t who, int32_t prio);
int32_t libc_unix_linuxlike_emscripten_getentropy(void* buf, uint64_t buflen);
void* libc_unix_linuxlike_emscripten_getgrgid(uint16_t gid);
void* libc_unix_linuxlike_emscripten_getgrnam(const char* name);
int32_t libc_unix_linuxlike_emscripten_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_linuxlike_emscripten_getgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_EMSCRIPTEN_UNIX_LINUXLIKE_EMSCRIPTEN_WRAPPER_H */
