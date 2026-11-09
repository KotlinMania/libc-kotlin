#ifndef LIBC_UNIX_BSD_NETBSDLIKE_NETBSD_UNIX_BSD_NETBSDLIKE_NETBSD_WRAPPER_H
#define LIBC_UNIX_BSD_NETBSDLIKE_NETBSD_UNIX_BSD_NETBSDLIKE_NETBSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_unix_bsd_netbsdlike_netbsd_reallocarr(void* ptr, uint64_t number, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_chflags(const char* path, uint64_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_fchflags(int32_t fd, uint64_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_lchflags(const char* path, uint64_t flags);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrListFd(int32_t fd, int32_t attrnamespace, void* data, uint64_t nbytes);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrListFile(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrListLink(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(int32_t fd, int32_t attrnamespace, const char* attrname);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(const char* path, int32_t attrnamespace, const char* attrname);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(const char* path, int32_t attrnamespace, const char* attrname);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int64_t libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(int32_t attrnamespace, void* string);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(const char* string, void* attrnamespace);
int32_t libc_unix_bsd_netbsdlike_netbsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_bsd_netbsdlike_netbsd_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_unix_bsd_netbsdlike_netbsd_ptsnameR(int32_t fd, char* buf, uint64_t buflen);
int32_t libc_unix_bsd_netbsdlike_netbsd_lutimes(const char* file, void* times);
int32_t libc_unix_bsd_netbsdlike_netbsd_gettimeofday(void* tp, void* tz);
int32_t libc_unix_bsd_netbsdlike_netbsd_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_bsd_netbsdlike_netbsd_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(const char* sname, void* name, void* namelenp);
int32_t libc_unix_bsd_netbsdlike_netbsd_kevent(int32_t kq, void* changelist, uint64_t nchanges, void* eventlist, uint64_t nevents, void* timeout);
int32_t libc_unix_bsd_netbsdlike_netbsd_mount(const char* src, const char* target, int32_t flags, void* data, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqClose(void* mqd);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqGetattr(void* mqd, void* attr);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqNotify(void* mqd, void* notification);
int64_t libc_unix_bsd_netbsdlike_netbsd_mqReceive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqSend(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqSetattr(void* mqd, void* newattr, void* oldattr);
int64_t libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(void* mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(void* mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout);
int32_t libc_unix_bsd_netbsdlike_netbsd_mqUnlink(const char* name);
int32_t libc_unix_bsd_netbsdlike_netbsd_ptrace(int32_t request, int32_t pid, void* addr, int32_t data);
int32_t libc_unix_bsd_netbsdlike_netbsd_utrace(const char* label, void* addr, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(void* t, char* name, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(void* t, const char* name, void* arg);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(void* thread, void* attr);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(void* native, void* attr);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize(void* attr, void* guardsize);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize(void* attr, uint64_t guardsize);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(void* thread, uint64_t size, void* set);
int32_t libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(void* thread, uint64_t size, void* set);
void* libc_unix_bsd_netbsdlike_netbsd_cpusetCreate(void);
void libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy(void* set);
int32_t libc_unix_bsd_netbsdlike_netbsd_cpusetClr(uint64_t cpu, void* set);
int32_t libc_unix_bsd_netbsdlike_netbsd_cpusetSet(uint64_t cpu, void* set);
int32_t libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(uint64_t cpu, void* set);
uint64_t libc_unix_bsd_netbsdlike_netbsd_cpusetSize(void* set);
void libc_unix_bsd_netbsdlike_netbsd_cpusetZero(void* set);
int32_t libc_unix_bsd_netbsdlike_netbsd_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo(void* set, void* info);
void* libc_unix_bsd_netbsdlike_netbsd_duplocale(void* base);
void libc_unix_bsd_netbsdlike_netbsd_freelocale(void* loc);
void* libc_unix_bsd_netbsdlike_netbsd_localeconvL(void* loc);
void* libc_unix_bsd_netbsdlike_netbsd_newlocale(int32_t mask, const char* locale, void* base);
int32_t libc_unix_bsd_netbsdlike_netbsd_settimeofday(void* tv, void* tz);
int32_t libc_unix_bsd_netbsdlike_netbsd_dup3(int32_t src, int32_t dst, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_kqueue1(int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_lwpSelf(void);
void* libc_unix_bsd_netbsdlike_netbsd_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(void* callback, void* data);
void* libc_unix_bsd_netbsdlike_netbsd_dlauxinfo(void);
void* libc_unix_bsd_netbsdlike_netbsd_iconvOpen(const char* tocode, const char* fromcode);
uint64_t libc_unix_bsd_netbsdlike_netbsd_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft);
int32_t libc_unix_bsd_netbsdlike_netbsd_iconvClose(void* cd);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerCreate(int32_t clockid, void* sevp, void* timerid);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerDelete(void* timerid);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(void* timerid);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerGettime(void* timerid, void* curr_value);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerSettime(void* timerid, int32_t flags, void* new_value, void* old_value);
void* libc_unix_bsd_netbsdlike_netbsd_dlvsym(void* handle, const char* symbol, const char* version);
void libc_unix_bsd_netbsdlike_netbsd_explicitMemset(void* b, int32_t c, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal(void* a, void* b, uint64_t len);
void* libc_unix_bsd_netbsdlike_netbsd_mremap(void* oldp, uint64_t oldsize, void* newp, uint64_t newsize, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(int32_t pid, void* t);
int32_t libc_unix_bsd_netbsdlike_netbsd_schedSetparam(int32_t pid, void* param);
int32_t libc_unix_bsd_netbsdlike_netbsd_schedGetparam(int32_t pid, void* param);
int32_t libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(int32_t pid);
int32_t libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(int32_t pid, int32_t policy, void* param);
int32_t libc_unix_bsd_netbsdlike_netbsd_pollts(void* fds, uint32_t nfds, void* ts, void* sigmask);
int64_t libc_unix_bsd_netbsdlike_netbsd_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_reboot(int32_t mode, char* bootstr);
int32_t libc_unix_bsd_netbsdlike_netbsd_lwpPark(int32_t clock, int32_t flags, void* ts, int32_t unpark, void* hint, void* unparkhint);
int32_t libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(int32_t lwp, void* hint);
int32_t libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll(void* targets, uint64_t ntargets, void* hint);
int32_t libc_unix_bsd_netbsdlike_netbsd_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_getvfsstat(void* buf, uint64_t bufsize, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_eventfd(uint32_t val, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_eventfdRead(int32_t efd, void* valp);
int32_t libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(int32_t efd, uint64_t val);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(int32_t clockid, int32_t flags);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(int32_t fd, void* curr_value);
int32_t libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(int32_t fd, int32_t flags, void* new_value, void* old_value);
void libc_unix_bsd_netbsdlike_netbsd_qsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioRead(void* aiocbp);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioWrite(void* aiocbp);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioFsync(int32_t op, void* aiocbp);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioError(void* aiocbp);
int64_t libc_unix_bsd_netbsdlike_netbsd_aioReturn(void* aiocbp);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioSuspend(void* aiocb_list, int32_t nitems, void* timeout);
int32_t libc_unix_bsd_netbsdlike_netbsd_aioCancel(int32_t fd, void* aiocbp);
int32_t libc_unix_bsd_netbsdlike_netbsd_lioListio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp);
int32_t libc_unix_bsd_netbsdlike_netbsd_getpwentR(void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_unix_bsd_netbsdlike_netbsd_getgrentR(void* grp, char* buf, uint64_t buflen, void* result);
void* libc_unix_bsd_netbsdlike_netbsd_efopen(const char* p, const char* m);
void* libc_unix_bsd_netbsdlike_netbsd_emalloc(uint64_t n);
void* libc_unix_bsd_netbsdlike_netbsd_ecalloc(uint64_t n, uint64_t c);
void* libc_unix_bsd_netbsdlike_netbsd_erealloc(void* p, uint64_t n);
void libc_unix_bsd_netbsdlike_netbsd_ereallocarr(void* p, uint64_t n, uint64_t s);
char* libc_unix_bsd_netbsdlike_netbsd_estrdup(const char* s);
char* libc_unix_bsd_netbsdlike_netbsd_estrndup(const char* s, uint64_t len);
uint64_t libc_unix_bsd_netbsdlike_netbsd_estrlcpy(char* dst, const char* src, uint64_t len);
uint64_t libc_unix_bsd_netbsdlike_netbsd_estrlcat(char* dst, const char* src, uint64_t len);
int64_t libc_unix_bsd_netbsdlike_netbsd_estrtoi(const char* nptr, int32_t base, int64_t lo, int64_t hi);
uint64_t libc_unix_bsd_netbsdlike_netbsd_estrtou(const char* nptr, int32_t base, uint64_t lo, uint64_t hi);
void* libc_unix_bsd_netbsdlike_netbsd_esetfunc(void* cb);
int32_t libc_unix_bsd_netbsdlike_netbsd_securePath(const char* path);
int32_t libc_unix_bsd_netbsdlike_netbsd_snprintb(char* buf, uint64_t buflen, const char* fmt, uint64_t val);
int32_t libc_unix_bsd_netbsdlike_netbsd_snprintbM(char* buf, uint64_t buflen, const char* fmt, uint64_t val, uint64_t max);
const char* libc_unix_bsd_netbsdlike_netbsd_getbootfile(void);
int32_t libc_unix_bsd_netbsdlike_netbsd_getbyteorder(void);
const char* libc_unix_bsd_netbsdlike_netbsd_getdiskrawname(char* buf, uint64_t buflen, const char* name);
const char* libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname(char* buf, uint64_t buflen, const char* name);
const char* libc_unix_bsd_netbsdlike_netbsd_getfsspecname(char* buf, uint64_t buflen, const char* spec);
char* libc_unix_bsd_netbsdlike_netbsd_strpct(char* buf, uint64_t bufsiz, uint64_t numerator, uint64_t denominator, uint64_t precision);
char* libc_unix_bsd_netbsdlike_netbsd_strspct(char* buf, uint64_t bufsiz, int64_t numerator, int64_t denominator, uint64_t precision);
void libc_unix_bsd_netbsdlike_netbsd_login(void* ut);
void libc_unix_bsd_netbsdlike_netbsd_loginx(void* ut);
void libc_unix_bsd_netbsdlike_netbsd_logout(const char* line);
void libc_unix_bsd_netbsdlike_netbsd_logoutx(const char* line, int32_t status, int32_t tpe);
void libc_unix_bsd_netbsdlike_netbsd_logwtmp(const char* line, const char* name, const char* host);
void libc_unix_bsd_netbsdlike_netbsd_logwtmpx(const char* line, const char* name, const char* host, int32_t status, int32_t tpe);
int64_t libc_unix_bsd_netbsdlike_netbsd_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_bsd_netbsdlike_netbsd_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_unix_bsd_netbsdlike_netbsd_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_setxattr(const char* path, const char* name, void* value, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_lsetxattr(const char* path, const char* name, void* value, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_unix_bsd_netbsdlike_netbsd_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_bsd_netbsdlike_netbsd_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_unix_bsd_netbsdlike_netbsd_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_unix_bsd_netbsdlike_netbsd_removexattr(const char* path, const char* name);
int32_t libc_unix_bsd_netbsdlike_netbsd_lremovexattr(const char* path, const char* name);
int32_t libc_unix_bsd_netbsdlike_netbsd_fremovexattr(int32_t fd, const char* path, const char* name);
int32_t libc_unix_bsd_netbsdlike_netbsd_stringToFlags(void* string_p, void* setp, void* clrp);
int32_t libc_unix_bsd_netbsdlike_netbsd_flagsToString(uint64_t flags, const char* def);
void* libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(int32_t pid, void* cntp);
uint64_t libc_unix_bsd_netbsdlike_netbsd_backtrace(void* addrlist, uint64_t len);
void* libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols(void* addrlist, uint64_t len);
int32_t libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd(void* addrlist, uint64_t len, int32_t fd);
void* libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt(void* addrlist, uint64_t len, const char* fmt);
int32_t libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt(void* addrlist, uint64_t len, int32_t fd, const char* fmt);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_NETBSDLIKE_NETBSD_UNIX_BSD_NETBSDLIKE_NETBSD_WRAPPER_H */
