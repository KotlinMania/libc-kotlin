#ifndef LIBC_OPENBSD_MOD_OPENBSD_MOD_WRAPPER_H
#define LIBC_OPENBSD_MOD_OPENBSD_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_openbsd_mod_gettimeofday(void* tp, void* tz);
int32_t libc_openbsd_mod_settimeofday(void* tp, void* tz);
int32_t libc_openbsd_mod_pledge(const char* promises, const char* execpromises);
int32_t libc_openbsd_mod_unveil(const char* path, const char* permissions);
int64_t libc_openbsd_mod_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libc_openbsd_mod_dup3(int32_t src, int32_t dst, int32_t flags);
int32_t libc_openbsd_mod_chflags(const char* path, uint32_t flags);
int32_t libc_openbsd_mod_fchflags(int32_t fd, uint32_t flags);
int32_t libc_openbsd_mod_chflagsat(int32_t fd, const char* path, uint32_t flags, int32_t atflag);
int32_t libc_openbsd_mod_dirfd(void* dirp);
int32_t libc_openbsd_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int32_t libc_openbsd_mod_getresgid(void* rgid, void* egid, void* sgid);
int32_t libc_openbsd_mod_getresuid(void* ruid, void* euid, void* suid);
int32_t libc_openbsd_mod_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libc_openbsd_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_openbsd_mod_getthrid(void);
int32_t libc_openbsd_mod_pthread_attr_getguardsize(void* attr, void* guardsize);
int32_t libc_openbsd_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize);
int32_t libc_openbsd_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_openbsd_mod_pthread_main_np(void);
void libc_openbsd_mod_pthread_get_name_np(int32_t tid, char* name, uint64_t len);
void libc_openbsd_mod_pthread_set_name_np(int32_t tid, const char* name);
int32_t libc_openbsd_mod_pthread_stackseg_np(int32_t thread, void* sinfo);
int32_t libc_openbsd_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_openbsd_mod_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_openbsd_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_openbsd_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid);
int32_t libc_openbsd_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid);
int32_t libc_openbsd_mod_ptrace(int32_t request, int32_t pid, char* addr, int32_t data);
int32_t libc_openbsd_mod_utrace(const char* label, void* addr, uint64_t len);
void* libc_openbsd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_openbsd_mod_dl_iterate_phdr(void* callback, void* data);
int32_t libc_openbsd_mod_uselocale(int32_t loc);
void libc_openbsd_mod_freelocale(int32_t loc);
int32_t libc_openbsd_mod_newlocale(int32_t mask, const char* locale, int32_t base);
int32_t libc_openbsd_mod_duplocale(int32_t base);
void libc_openbsd_mod_explicit_bzero(void* s, uint64_t len);
void libc_openbsd_mod_freezero(void* ptr, uint64_t size);
void* libc_openbsd_mod_malloc_conceal(uint64_t size);
void* libc_openbsd_mod_calloc_conceal(uint64_t nmemb, uint64_t size);
void libc_openbsd_mod_srand48deterministic(int64_t seed);
void* libc_openbsd_mod_seed48deterministic(void* xseed);
void libc_openbsd_mod_lcong48deterministic(void* p);
void* libc_openbsd_mod_lsearch(void* key, void* base, void* nelp, uint64_t width, void* compar);
void* libc_openbsd_mod_lfind(void* key, void* base, void* nelp, uint64_t width, void* compar);
int32_t libc_openbsd_mod_hcreate(uint64_t nelt);
void libc_openbsd_mod_hdestroy(void);
void* libc_openbsd_mod_hsearch(int32_t entry, uint32_t action);
int32_t libc_openbsd_mod_futex(void* uaddr, int32_t op, int32_t val, void* timeout, void* uaddr2);
int32_t libc_openbsd_mod_mimmutable(void* addr, uint64_t len);
int32_t libc_openbsd_mod_reboot(int32_t mode);
int32_t libc_openbsd_mod_statfs(const char* path, void* buf);
int32_t libc_openbsd_mod_fstatfs(int32_t fd, void* buf);
int32_t libc_openbsd_mod_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_openbsd_mod_getfsstat(void* buf, uint64_t bufsize, int32_t flags);
int32_t libc_openbsd_mod_elf_aux_info(int32_t aux, void* buf, int32_t buflen);
uint64_t libc_openbsd_mod_backtrace(void* addrlist, uint64_t len);
void* libc_openbsd_mod_backtrace_symbols(void* addrlist, uint64_t len);
int32_t libc_openbsd_mod_backtrace_symbols_fd(void* addrlist, uint64_t len, int32_t fd);
void* libc_openbsd_mod_backtrace_symbols_fmt(void* addrlist, uint64_t len, const char* fmt);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_OPENBSD_MOD_OPENBSD_MOD_WRAPPER_H */
