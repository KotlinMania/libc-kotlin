#ifndef LIBC_NEWLIB_MOD_NEWLIB_MOD_WRAPPER_H
#define LIBC_NEWLIB_MOD_NEWLIB_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_newlib_mod_getrlimit(int32_t resource, void* rlim);
int32_t libc_newlib_mod_setrlimit(int32_t resource, void* rlim);
int32_t libc_newlib_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen);
int32_t libc_newlib_mod_sem_destroy(void* sem);
int32_t libc_newlib_mod_sem_init(void* sem, int32_t pshared, uint32_t value);
int32_t libc_newlib_mod_abs(int32_t i);
int64_t libc_newlib_mod_labs(int64_t i);
int32_t libc_newlib_mod_rand(void);
void libc_newlib_mod_srand(uint32_t seed);
int32_t libc_newlib_mod_bind(int32_t fd, void* addr, uint32_t len);
int32_t libc_newlib_mod_clock_settime(uint64_t clock_id, void* tp);
int32_t libc_newlib_mod_clock_gettime(uint64_t clock_id, void* tp);
int32_t libc_newlib_mod_clock_getres(uint64_t clock_id, void* res);
int32_t libc_newlib_mod_closesocket(int32_t sockfd);
int64_t libc_newlib_mod_recvfrom(int32_t fd, void* buf, uint64_t n, int32_t flags, void* addr, void* addr_len);
int32_t libc_newlib_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
void* libc_newlib_mod_memalign(uint64_t align, uint64_t size);
int32_t libc_newlib_mod_fexecve(int32_t fd, void* argv, void* envp);
int32_t libc_newlib_mod_gettimeofday(void* tp, void* tz);
int32_t libc_newlib_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_newlib_mod_sigaltstack(void* ss, void* oss);
int32_t libc_newlib_mod_sem_close(void* sem);
int32_t libc_newlib_mod_getdtablesize(void);
int32_t libc_newlib_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result);
int32_t libc_newlib_mod_pthread_sigmask(int32_t how, void* set, void* oldset);
void* libc_newlib_mod_getgrnam(const char* name);
int32_t libc_newlib_mod_pthread_kill(uint64_t thread, int32_t sig);
int32_t libc_newlib_mod_sem_unlink(const char* name);
int32_t libc_newlib_mod_daemon(int32_t nochdir, int32_t noclose);
int32_t libc_newlib_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_newlib_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_newlib_mod_sigwait(void* set, void* sig);
int32_t libc_newlib_mod_pthread_atfork(void* prepare, void* parent, void* child);
void* libc_newlib_mod_getgrgid(uint32_t gid);
void* libc_newlib_mod_popen(const char* command, const char* mode);
int32_t libc_newlib_mod_uname(void* buf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEWLIB_MOD_NEWLIB_MOD_WRAPPER_H */
