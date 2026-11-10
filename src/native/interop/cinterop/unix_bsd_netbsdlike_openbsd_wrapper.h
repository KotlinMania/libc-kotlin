#ifndef LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H
#define LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_bsd_netbsdlike_openbsd_gettimeofday(void* tp, void* tz);
int32_t libc_unix_bsd_netbsdlike_openbsd_settimeofday(void* tp, void* tz);
int32_t libc_unix_bsd_netbsdlike_openbsd_pledge(const char* promises, const char* execpromises);
int32_t libc_unix_bsd_netbsdlike_openbsd_unveil(const char* path, const char* permissions);
int64_t libc_unix_bsd_netbsdlike_openbsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libc_unix_bsd_netbsdlike_openbsd_dup3(int32_t src, int32_t dst, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_chflags(const char* path, uint32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_fchflags(int32_t fd, uint32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_chflagsat(int32_t fd, const char* path, uint32_t flags, int32_t atflag);
int32_t libc_unix_bsd_netbsdlike_openbsd_dirfd(void* dirp);
int32_t libc_unix_bsd_netbsdlike_openbsd_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_unix_bsd_netbsdlike_openbsd_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_unix_bsd_netbsdlike_openbsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libc_unix_bsd_netbsdlike_openbsd_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_bsd_netbsdlike_openbsd_getthrid(void);
int32_t libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetguardsize(void* attr, void* guardsize);
int32_t libc_unix_bsd_netbsdlike_openbsd_pthreadAttrSetguardsize(void* attr, uint64_t guardsize);
int32_t libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_unix_bsd_netbsdlike_openbsd_pthreadMainNp(void);
void libc_unix_bsd_netbsdlike_openbsd_pthreadGetNameNp(void* tid, char* name, uint64_t len);
void libc_unix_bsd_netbsdlike_openbsd_pthreadSetNameNp(void* tid, const char* name);
int32_t libc_unix_bsd_netbsdlike_openbsd_pthreadStacksegNp(void* thread, void* sinfo);
int32_t libc_unix_bsd_netbsdlike_openbsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_bsd_netbsdlike_openbsd_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_unix_bsd_netbsdlike_openbsd_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_bsd_netbsdlike_openbsd_setresgid(uint16_t rgid, uint16_t egid, uint16_t sgid);
int32_t libc_unix_bsd_netbsdlike_openbsd_setresuid(uint16_t ruid, uint16_t euid, uint16_t suid);
int32_t libc_unix_bsd_netbsdlike_openbsd_ptrace(int32_t request, int32_t pid, char* addr, int32_t data);
int32_t libc_unix_bsd_netbsdlike_openbsd_utrace(const char* label, void* addr, uint64_t len);
void* libc_unix_bsd_netbsdlike_openbsd_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_unix_bsd_netbsdlike_openbsd_dlIteratePhdr(void* callback, void* data);
void* libc_unix_bsd_netbsdlike_openbsd_uselocale(void* loc);
void libc_unix_bsd_netbsdlike_openbsd_freelocale(void* loc);
void* libc_unix_bsd_netbsdlike_openbsd_newlocale(int32_t mask, const char* locale, void* base);
void* libc_unix_bsd_netbsdlike_openbsd_duplocale(void* base);
void libc_unix_bsd_netbsdlike_openbsd_explicitBzero(void* s, uint64_t len);
void libc_unix_bsd_netbsdlike_openbsd_setproctitle(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void libc_unix_bsd_netbsdlike_openbsd_freezero(void* ptr, uint64_t size);
void* libc_unix_bsd_netbsdlike_openbsd_mallocConceal(uint64_t size);
void* libc_unix_bsd_netbsdlike_openbsd_callocConceal(uint64_t nmemb, uint64_t size);
void libc_unix_bsd_netbsdlike_openbsd_srand48Deterministic(int64_t seed);
void* libc_unix_bsd_netbsdlike_openbsd_seed48Deterministic(void* xseed);
void libc_unix_bsd_netbsdlike_openbsd_lcong48Deterministic(void* p);
void* libc_unix_bsd_netbsdlike_openbsd_lsearch(void* key, void* base, void* nelp, uint64_t width, void* compar);
void* libc_unix_bsd_netbsdlike_openbsd_lfind(void* key, void* base, void* nelp, uint64_t width, void* compar);
int32_t libc_unix_bsd_netbsdlike_openbsd_hcreate(uint64_t nelt);
void libc_unix_bsd_netbsdlike_openbsd_hdestroy(void);
int32_t libc_unix_bsd_netbsdlike_openbsd_futex(void* uaddr, int32_t op, int32_t val, void* timeout, void* uaddr2);
int32_t libc_unix_bsd_netbsdlike_openbsd_mimmutable(void* addr, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_openbsd_reboot(int32_t mode);
int32_t libc_unix_bsd_netbsdlike_openbsd_statfs(const char* path, void* buf);
int32_t libc_unix_bsd_netbsdlike_openbsd_fstatfs(int32_t fd, void* buf);
int32_t libc_unix_bsd_netbsdlike_openbsd_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_getfsstat(void* buf, uint64_t bufsize, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_openbsd_elfAuxInfo(int32_t aux, void* buf, int32_t buflen);
uint64_t libc_unix_bsd_netbsdlike_openbsd_backtrace(void* addrlist, uint64_t len);
void* libc_unix_bsd_netbsdlike_openbsd_backtraceSymbols(void* addrlist, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFd(void* addrlist, uint64_t len, int32_t fd);
void* libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFmt(void* addrlist, uint64_t len, const char* fmt);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H */
