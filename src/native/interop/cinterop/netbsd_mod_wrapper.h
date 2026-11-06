#ifndef LIBC_NETBSD_MOD_NETBSD_MOD_WRAPPER_H
#define LIBC_NETBSD_MOD_NETBSD_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_netbsd_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp);
int32_t libc_netbsd_mod_reallocarr(void* ptr, uint64_t number, uint64_t size);
int32_t libc_netbsd_mod_chflags(const char* path, uint64_t flags);
int32_t libc_netbsd_mod_fchflags(int32_t fd, uint64_t flags);
int32_t libc_netbsd_mod_lchflags(const char* path, uint64_t flags);
int64_t libc_netbsd_mod_extattr_list_fd(int32_t fd, int32_t attrnamespace, void* data, uint64_t nbytes);
int64_t libc_netbsd_mod_extattr_list_file(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes);
int64_t libc_netbsd_mod_extattr_list_link(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes);
int32_t libc_netbsd_mod_extattr_delete_fd(int32_t fd, int32_t attrnamespace, const char* attrname);
int32_t libc_netbsd_mod_extattr_delete_file(const char* path, int32_t attrnamespace, const char* attrname);
int32_t libc_netbsd_mod_extattr_delete_link(const char* path, int32_t attrnamespace, const char* attrname);
int64_t libc_netbsd_mod_extattr_get_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int64_t libc_netbsd_mod_extattr_get_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int64_t libc_netbsd_mod_extattr_get_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_netbsd_mod_extattr_namespace_to_string(int32_t attrnamespace, void* string);
int32_t libc_netbsd_mod_extattr_set_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_netbsd_mod_extattr_set_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_netbsd_mod_extattr_set_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes);
int32_t libc_netbsd_mod_extattr_string_to_namespace(const char* string, void* attrnamespace);
int32_t libc_netbsd_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_netbsd_mod_forkpty(void* amaster, char* name, void* termp, void* winp);
int32_t libc_netbsd_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen);
int32_t libc_netbsd_mod_lutimes(const char* file, void* times);
int32_t libc_netbsd_mod_gettimeofday(void* tp, void* tz);
int32_t libc_netbsd_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags);
int32_t libc_netbsd_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_netbsd_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_netbsd_mod_sysctlbyname(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen);
int32_t libc_netbsd_mod_sysctlnametomib(const char* sname, void* name, void* namelenp);
int32_t libc_netbsd_mod_kevent(int32_t kq, void* changelist, uint64_t nchanges, void* eventlist, uint64_t nevents, void* timeout);
int32_t libc_netbsd_mod_mount(const char* src, const char* target, int32_t flags, void* data, uint64_t size);
int32_t libc_netbsd_mod_mq_close(int32_t mqd);
int32_t libc_netbsd_mod_mq_getattr(int32_t mqd, void* attr);
int32_t libc_netbsd_mod_mq_notify(int32_t mqd, void* notification);
int64_t libc_netbsd_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio);
int32_t libc_netbsd_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio);
int32_t libc_netbsd_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr);
int64_t libc_netbsd_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout);
int32_t libc_netbsd_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout);
int32_t libc_netbsd_mod_mq_unlink(const char* name);
int32_t libc_netbsd_mod_ptrace(int32_t request, int32_t pid, void* addr, int32_t data);
int32_t libc_netbsd_mod_utrace(const char* label, void* addr, uint64_t len);
int32_t libc_netbsd_mod_pthread_getname_np(int32_t t, char* name, uint64_t len);
int32_t libc_netbsd_mod_pthread_setname_np(int32_t t, const char* name, void* arg);
int32_t libc_netbsd_mod_pthread_attr_get_np(int32_t thread, void* attr);
int32_t libc_netbsd_mod_pthread_getattr_np(int32_t native, void* attr);
int32_t libc_netbsd_mod_pthread_attr_getguardsize(void* attr, void* guardsize);
int32_t libc_netbsd_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize);
int32_t libc_netbsd_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_netbsd_mod_pthread_getaffinity_np(int32_t thread, uint64_t size, void* set);
int32_t libc_netbsd_mod_pthread_setaffinity_np(int32_t thread, uint64_t size, void* set);
void* libc_netbsd_mod_cpuset_create(void);
void libc_netbsd_mod_cpuset_destroy(void* set);
int32_t libc_netbsd_mod_cpuset_clr(int32_t cpu, void* set);
int32_t libc_netbsd_mod_cpuset_set(int32_t cpu, void* set);
int32_t libc_netbsd_mod_cpuset_isset(int32_t cpu, void* set);
uint64_t libc_netbsd_mod_cpuset_size(void* set);
void libc_netbsd_mod_cpuset_zero(void* set);
int32_t libc_netbsd_mod_sigtimedwait(void* set, void* info, void* timeout);
int32_t libc_netbsd_mod_sigwaitinfo(void* set, void* info);
int32_t libc_netbsd_mod_duplocale(int32_t base);
void libc_netbsd_mod_freelocale(int32_t loc);
void* libc_netbsd_mod_localeconv_l(int32_t loc);
int32_t libc_netbsd_mod_newlocale(int32_t mask, const char* locale, int32_t base);
int32_t libc_netbsd_mod_settimeofday(void* tv, void* tz);
int32_t libc_netbsd_mod_dup3(int32_t src, int32_t dst, int32_t flags);
int32_t libc_netbsd_mod_kqueue1(int32_t flags);
int32_t libc_netbsd_mod_lwp_self(void);
void* libc_netbsd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen);
int32_t libc_netbsd_mod_dl_iterate_phdr(void* callback, void* data);
void* libc_netbsd_mod_dlauxinfo(void);
void* libc_netbsd_mod_iconv_open(const char* tocode, const char* fromcode);
uint64_t libc_netbsd_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft);
int32_t libc_netbsd_mod_iconv_close(void* cd);
int32_t libc_netbsd_mod_timer_create(int32_t clockid, void* sevp, void* timerid);
int32_t libc_netbsd_mod_timer_delete(int32_t timerid);
int32_t libc_netbsd_mod_timer_getoverrun(int32_t timerid);
int32_t libc_netbsd_mod_timer_gettime(int32_t timerid, void* curr_value);
int32_t libc_netbsd_mod_timer_settime(int32_t timerid, int32_t flags, void* new_value, void* old_value);
void* libc_netbsd_mod_dlvsym(void* handle, const char* symbol, const char* version);
void libc_netbsd_mod_explicit_memset(void* b, int32_t c, uint64_t len);
int32_t libc_netbsd_mod_consttime_memequal(void* a, void* b, uint64_t len);
void* libc_netbsd_mod_mremap(void* oldp, uint64_t oldsize, void* newp, uint64_t newsize, int32_t flags);
int32_t libc_netbsd_mod_sched_rr_get_interval(int32_t pid, void* t);
int32_t libc_netbsd_mod_sched_setparam(int32_t pid, void* param);
int32_t libc_netbsd_mod_sched_getparam(int32_t pid, void* param);
int32_t libc_netbsd_mod_sched_getscheduler(int32_t pid);
int32_t libc_netbsd_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param);
int32_t libc_netbsd_mod_pollts(void* fds, int32_t nfds, void* ts, void* sigmask);
int64_t libc_netbsd_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int32_t libc_netbsd_mod_reboot(int32_t mode, char* bootstr);
int32_t libc_netbsd_mod_lwp_park(int32_t clock, int32_t flags, void* ts, int32_t unpark, void* hint, void* unparkhint);
int32_t libc_netbsd_mod_lwp_unpark(int32_t lwp, void* hint);
int32_t libc_netbsd_mod_lwp_unpark_all(void* targets, uint64_t ntargets, void* hint);
int32_t libc_netbsd_mod_getmntinfo(void* mntbufp, int32_t flags);
int32_t libc_netbsd_mod_getvfsstat(void* buf, uint64_t bufsize, int32_t flags);
int32_t libc_netbsd_mod_eventfd(uint32_t val, int32_t flags);
int32_t libc_netbsd_mod_eventfd_read(int32_t efd, void* valp);
int32_t libc_netbsd_mod_eventfd_write(int32_t efd, uint64_t val);
int32_t libc_netbsd_mod_timerfd_create(int32_t clockid, int32_t flags);
int32_t libc_netbsd_mod_timerfd_gettime(int32_t fd, void* curr_value);
int32_t libc_netbsd_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value);
void libc_netbsd_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int32_t libc_netbsd_mod_aio_read(void* aiocbp);
int32_t libc_netbsd_mod_aio_write(void* aiocbp);
int32_t libc_netbsd_mod_aio_fsync(int32_t op, void* aiocbp);
int32_t libc_netbsd_mod_aio_error(void* aiocbp);
int64_t libc_netbsd_mod_aio_return(void* aiocbp);
int32_t libc_netbsd_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout);
int32_t libc_netbsd_mod_aio_cancel(int32_t fd, void* aiocbp);
int32_t libc_netbsd_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp);
int32_t libc_netbsd_mod_getpwent_r(void* pwd, char* buf, uint64_t buflen, void* result);
int32_t libc_netbsd_mod_getgrent_r(void* grp, char* buf, uint64_t buflen, void* result);
void* libc_netbsd_mod_efopen(const char* p, const char* m);
void* libc_netbsd_mod_emalloc(uint64_t n);
void* libc_netbsd_mod_ecalloc(uint64_t n, uint64_t c);
void* libc_netbsd_mod_erealloc(void* p, uint64_t n);
void libc_netbsd_mod_ereallocarr(void* p, uint64_t n, uint64_t s);
char* libc_netbsd_mod_estrdup(const char* s);
char* libc_netbsd_mod_estrndup(const char* s, uint64_t len);
uint64_t libc_netbsd_mod_estrlcpy(char* dst, const char* src, uint64_t len);
uint64_t libc_netbsd_mod_estrlcat(char* dst, const char* src, uint64_t len);
int32_t libc_netbsd_mod_estrtoi(const char* nptr, int32_t base, int32_t lo, int32_t hi);
int32_t libc_netbsd_mod_estrtou(const char* nptr, int32_t base, int32_t lo, int32_t hi);
void* libc_netbsd_mod_esetfunc(void* cb);
int32_t libc_netbsd_mod_secure_path(const char* path);
int32_t libc_netbsd_mod_snprintb(char* buf, uint64_t buflen, const char* fmt, uint64_t val);
int32_t libc_netbsd_mod_snprintb_m(char* buf, uint64_t buflen, const char* fmt, uint64_t val, uint64_t max);
const char* libc_netbsd_mod_getbootfile(void);
int32_t libc_netbsd_mod_getbyteorder(void);
const char* libc_netbsd_mod_getdiskrawname(char* buf, uint64_t buflen, const char* name);
const char* libc_netbsd_mod_getdiskcookedname(char* buf, uint64_t buflen, const char* name);
const char* libc_netbsd_mod_getfsspecname(char* buf, uint64_t buflen, const char* spec);
char* libc_netbsd_mod_strpct(char* buf, uint64_t bufsiz, int32_t numerator, int32_t denominator, uint64_t precision);
char* libc_netbsd_mod_strspct(char* buf, uint64_t bufsiz, int32_t numerator, int32_t denominator, uint64_t precision);
void libc_netbsd_mod_login(void* ut);
void libc_netbsd_mod_loginx(void* ut);
void libc_netbsd_mod_logout(const char* line);
void libc_netbsd_mod_logoutx(const char* line, int32_t status, int32_t tpe);
void libc_netbsd_mod_logwtmp(const char* line, const char* name, const char* host);
void libc_netbsd_mod_logwtmpx(const char* line, const char* name, const char* host, int32_t status, int32_t tpe);
int64_t libc_netbsd_mod_getxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_netbsd_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size);
int64_t libc_netbsd_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size);
int32_t libc_netbsd_mod_setxattr(const char* path, const char* name, void* value, uint64_t size);
int32_t libc_netbsd_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size);
int32_t libc_netbsd_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags);
int64_t libc_netbsd_mod_listxattr(const char* path, char* list, uint64_t size);
int64_t libc_netbsd_mod_llistxattr(const char* path, char* list, uint64_t size);
int64_t libc_netbsd_mod_flistxattr(int32_t filedes, char* list, uint64_t size);
int32_t libc_netbsd_mod_removexattr(const char* path, const char* name);
int32_t libc_netbsd_mod_lremovexattr(const char* path, const char* name);
int32_t libc_netbsd_mod_fremovexattr(int32_t fd, const char* path, const char* name);
int32_t libc_netbsd_mod_string_to_flags(void* string_p, void* setp, void* clrp);
int32_t libc_netbsd_mod_flags_to_string(uint64_t flags, const char* def);
void* libc_netbsd_mod_kinfo_getvmmap(int32_t pid, void* cntp);
uint64_t libc_netbsd_mod_backtrace(void* addrlist, uint64_t len);
void* libc_netbsd_mod_backtrace_symbols(void* addrlist, uint64_t len);
int32_t libc_netbsd_mod_backtrace_symbols_fd(void* addrlist, uint64_t len, int32_t fd);
void* libc_netbsd_mod_backtrace_symbols_fmt(void* addrlist, uint64_t len, const char* fmt);
int32_t libc_netbsd_mod_backtrace_symbols_fd_fmt(void* addrlist, uint64_t len, int32_t fd, const char* fmt);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NETBSD_MOD_NETBSD_MOD_WRAPPER_H */
