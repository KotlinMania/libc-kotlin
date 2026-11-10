#ifndef LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H
#define LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_newlib_getrlimit(int32_t resource, void* rlim);
int32_t libc_unix_newlib_setrlimit(int32_t resource, void* rlim);
int32_t libc_unix_newlib_strerrorR(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_unix_newlib_semDestroy(void* sem);
int32_t libc_unix_newlib_semInit(void* sem, int32_t pshared, uint32_t value);
int32_t libc_unix_newlib_abs(int32_t i);
int64_t libc_unix_newlib_labs(int64_t i);
int32_t libc_unix_newlib_rand(void);
void libc_unix_newlib_srand(uint32_t seed);
int32_t libc_unix_newlib_bind(int32_t fd, void* addr, uint32_t len);
int32_t libc_unix_newlib_clockSettime(uint64_t clock_id, void* tp);
int32_t libc_unix_newlib_clockGettime(uint64_t clock_id, void* tp);
int32_t libc_unix_newlib_clockGetres(uint64_t clock_id, void* res);
int32_t libc_unix_newlib_closesocket(int32_t sockfd);
int32_t libc_unix_newlib_ioctl(int32_t fd, uint64_t request, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int64_t libc_unix_newlib_recvfrom(int32_t fd, void* buf, uint64_t n, int32_t flags, void* addr, void* addr_len);
int32_t libc_unix_newlib_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
void* libc_unix_newlib_memalign(uint64_t align, uint64_t size);
int32_t libc_unix_newlib_fexecve(int32_t fd, void* argv, void* envp);
int32_t libc_unix_newlib_gettimeofday(void* tp, void* tz);
int32_t libc_unix_newlib_getgrgidR(uint16_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_newlib_sigaltstack(void* ss, void* oss);
int32_t libc_unix_newlib_semClose(void* sem);
int32_t libc_unix_newlib_getdtablesize(void);
int32_t libc_unix_newlib_getgrnamR(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_newlib_pthreadSigmask(int32_t how, void* set, void* oldset);
void* libc_unix_newlib_semOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* libc_unix_newlib_getgrnam(const char* name);
int32_t libc_unix_newlib_pthreadKill(void* thread, int32_t sig);
int32_t libc_unix_newlib_semUnlink(const char* name);
int32_t libc_unix_newlib_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_unix_newlib_getpwnamR(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_newlib_getpwuidR(uint16_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_newlib_sigwait(void* set, void* sig);
int32_t libc_unix_newlib_pthreadAtfork(void* prepare, void* parent, void* child);
void* libc_unix_newlib_getgrgid(uint16_t gid);
void* libc_unix_newlib_popen(const char* command, const char* mode);
int32_t libc_unix_newlib_uname(void* buf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_UNIX_NEWLIB_WRAPPER_H */
