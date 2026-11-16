#ifndef LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H
#define LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixBsdNetbsdlikeOpenbsdGettimeofday(void* tp, void* tz);
int32_t libcUnixBsdNetbsdlikeOpenbsdSettimeofday(void* tp, void* tz);
int32_t libcUnixBsdNetbsdlikeOpenbsdPledge(const char* promises, const char* execpromises);
int32_t libcUnixBsdNetbsdlikeOpenbsdUnveil(const char* path, const char* permissions);
int64_t libcUnixBsdNetbsdlikeOpenbsdStrtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libcUnixBsdNetbsdlikeOpenbsdDup3(int32_t src, int32_t dst, int32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdChflags(const char* path, uint32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdFchflags(int32_t fd, uint32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdChflagsat(int32_t fd, const char* path, uint32_t flags, int32_t atflag);
int32_t libcUnixBsdNetbsdlikeOpenbsdDirfd(void* dirp);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetresgid(void* rgid, void* egid, void* sgid);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetresuid(void* ruid, void* euid, void* suid);
int32_t libcUnixBsdNetbsdlikeOpenbsdKevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libcUnixBsdNetbsdlikeOpenbsdMprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetthrid(void);
int32_t libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(void* attr, void* guardsize);
int32_t libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(void* attr, uint64_t guardsize);
int32_t libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp(void);
void libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(void* tid, char* name, uint64_t len);
void libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(void* tid, const char* name);
int32_t libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(void* thread, void* sinfo);
int32_t libcUnixBsdNetbsdlikeOpenbsdOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libcUnixBsdNetbsdlikeOpenbsdForkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libcUnixBsdNetbsdlikeOpenbsdSysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libcUnixBsdNetbsdlikeOpenbsdSetresgid(uint16_t rgid, uint16_t egid, uint16_t sgid);
int32_t libcUnixBsdNetbsdlikeOpenbsdSetresuid(uint16_t ruid, uint16_t euid, uint16_t suid);
int32_t libcUnixBsdNetbsdlikeOpenbsdPtrace(int32_t request, int32_t pid, char* addr, int32_t data);
int32_t libcUnixBsdNetbsdlikeOpenbsdUtrace(const char* label, void* addr, uint64_t len);
void* libcUnixBsdNetbsdlikeOpenbsdMemmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(void* callback, void* data);
void* libcUnixBsdNetbsdlikeOpenbsdUselocale(void* loc);
void libcUnixBsdNetbsdlikeOpenbsdFreelocale(void* loc);
void* libcUnixBsdNetbsdlikeOpenbsdNewlocale(int32_t mask, const char* locale, void* base);
void* libcUnixBsdNetbsdlikeOpenbsdDuplocale(void* base);
void libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(void* s, uint64_t len);
void libcUnixBsdNetbsdlikeOpenbsdSetproctitle(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void libcUnixBsdNetbsdlikeOpenbsdFreezero(void* ptr, uint64_t size);
void* libcUnixBsdNetbsdlikeOpenbsdMallocConceal(uint64_t size);
void* libcUnixBsdNetbsdlikeOpenbsdCallocConceal(uint64_t nmemb, uint64_t size);
void libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(int64_t seed);
void* libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(void* xseed);
void libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(void* p);
void* libcUnixBsdNetbsdlikeOpenbsdLsearch(void* key, void* base, void* nelp, uint64_t width, void* compar);
void* libcUnixBsdNetbsdlikeOpenbsdLfind(void* key, void* base, void* nelp, uint64_t width, void* compar);
int32_t libcUnixBsdNetbsdlikeOpenbsdHcreate(uint64_t nelt);
void libcUnixBsdNetbsdlikeOpenbsdHdestroy(void);
int32_t libcUnixBsdNetbsdlikeOpenbsdFutex(void* uaddr, int32_t op, int32_t val, void* timeout, void* uaddr2);
int32_t libcUnixBsdNetbsdlikeOpenbsdMimmutable(void* addr, uint64_t len);
int32_t libcUnixBsdNetbsdlikeOpenbsdReboot(int32_t mode);
int32_t libcUnixBsdNetbsdlikeOpenbsdStatfs(const char* path, void* buf);
int32_t libcUnixBsdNetbsdlikeOpenbsdFstatfs(int32_t fd, void* buf);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(void* mntbufp, int32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdGetfsstat(void* buf, uint64_t bufsize, int32_t flags);
int32_t libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(int32_t aux, void* buf, int32_t buflen);
uint64_t libcUnixBsdNetbsdlikeOpenbsdBacktrace(void* addrlist, uint64_t len);
void* libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(void* addrlist, uint64_t len);
int32_t libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(void* addrlist, uint64_t len, int32_t fd);
void* libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(void* addrlist, uint64_t len, const char* fmt);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_NETBSDLIKE_OPENBSD_UNIX_BSD_NETBSDLIKE_OPENBSD_WRAPPER_H */
