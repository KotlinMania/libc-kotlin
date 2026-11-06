#include "netbsd_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

int32_t libc_netbsd_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_netbsd_mod_reallocarr(void* ptr, uint64_t number, uint64_t size) {
    return (int32_t)reallocarr(ptr, number, size);
}

int32_t libc_netbsd_mod_chflags(const char* path, uint64_t flags) {
    return (int32_t)chflags(path, flags);
}

int32_t libc_netbsd_mod_fchflags(int32_t fd, uint64_t flags) {
    return (int32_t)fchflags(fd, flags);
}

int32_t libc_netbsd_mod_lchflags(const char* path, uint64_t flags) {
    return (int32_t)lchflags(path, flags);
}

int64_t libc_netbsd_mod_extattr_list_fd(int32_t fd, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_fd(fd, attrnamespace, data, nbytes);
}

int64_t libc_netbsd_mod_extattr_list_file(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_file(path, attrnamespace, data, nbytes);
}

int64_t libc_netbsd_mod_extattr_list_link(const char* path, int32_t attrnamespace, void* data, uint64_t nbytes) {
    return (int64_t)extattr_list_link(path, attrnamespace, data, nbytes);
}

int32_t libc_netbsd_mod_extattr_delete_fd(int32_t fd, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_fd(fd, attrnamespace, attrname);
}

int32_t libc_netbsd_mod_extattr_delete_file(const char* path, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_file(path, attrnamespace, attrname);
}

int32_t libc_netbsd_mod_extattr_delete_link(const char* path, int32_t attrnamespace, const char* attrname) {
    return (int32_t)extattr_delete_link(path, attrnamespace, attrname);
}

int64_t libc_netbsd_mod_extattr_get_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_fd(fd, attrnamespace, attrname, data, nbytes);
}

int64_t libc_netbsd_mod_extattr_get_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_file(path, attrnamespace, attrname, data, nbytes);
}

int64_t libc_netbsd_mod_extattr_get_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int64_t)extattr_get_link(path, attrnamespace, attrname, data, nbytes);
}

int32_t libc_netbsd_mod_extattr_namespace_to_string(int32_t attrnamespace, void* string) {
    return (int32_t)extattr_namespace_to_string(attrnamespace, string);
}

int32_t libc_netbsd_mod_extattr_set_fd(int32_t fd, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int32_t)extattr_set_fd(fd, attrnamespace, attrname, data, nbytes);
}

int32_t libc_netbsd_mod_extattr_set_file(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int32_t)extattr_set_file(path, attrnamespace, attrname, data, nbytes);
}

int32_t libc_netbsd_mod_extattr_set_link(const char* path, int32_t attrnamespace, const char* attrname, void* data, uint64_t nbytes) {
    return (int32_t)extattr_set_link(path, attrnamespace, attrname, data, nbytes);
}

int32_t libc_netbsd_mod_extattr_string_to_namespace(const char* string, void* attrnamespace) {
    return (int32_t)extattr_string_to_namespace(string, attrnamespace);
}

int32_t libc_netbsd_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_netbsd_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_netbsd_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_netbsd_mod_lutimes(const char* file, void* times) {
    return (int32_t)__lutimes50(file, times);
}

int32_t libc_netbsd_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)__gettimeofday50(tp, tz);
}

int32_t libc_netbsd_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_netbsd_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsd_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_netbsd_mod_sysctlbyname(const char* name, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctlbyname(name, oldp, oldlenp, newp, newlen);
}

int32_t libc_netbsd_mod_sysctlnametomib(const char* sname, void* name, void* namelenp) {
    return (int32_t)sysctlnametomib(sname, name, namelenp);
}

int32_t libc_netbsd_mod_kevent(int32_t kq, void* changelist, uint64_t nchanges, void* eventlist, uint64_t nevents, void* timeout) {
    return (int32_t)__kevent50(kq, changelist, nchanges, eventlist, nevents, timeout);
}

int32_t libc_netbsd_mod_mount(const char* src, const char* target, int32_t flags, void* data, uint64_t size) {
    return (int32_t)__mount50(src, target, flags, data, size);
}

int32_t libc_netbsd_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_netbsd_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_netbsd_mod_mq_notify(int32_t mqd, void* notification) {
    return (int32_t)mq_notify(mqd, notification);
}

int64_t libc_netbsd_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_netbsd_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_netbsd_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

int64_t libc_netbsd_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)__mq_timedreceive50(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_netbsd_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)__mq_timedsend50(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_netbsd_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int32_t libc_netbsd_mod_ptrace(int32_t request, int32_t pid, void* addr, int32_t data) {
    return (int32_t)ptrace(request, pid, addr, data);
}

int32_t libc_netbsd_mod_utrace(const char* label, void* addr, uint64_t len) {
    return (int32_t)utrace(label, addr, len);
}

int32_t libc_netbsd_mod_pthread_getname_np(int32_t t, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(t, name, len);
}

int32_t libc_netbsd_mod_pthread_setname_np(int32_t t, const char* name, void* arg) {
    return (int32_t)pthread_setname_np(t, name, arg);
}

int32_t libc_netbsd_mod_pthread_attr_get_np(int32_t thread, void* attr) {
    return (int32_t)pthread_attr_get_np(thread, attr);
}

int32_t libc_netbsd_mod_pthread_getattr_np(int32_t native, void* attr) {
    return (int32_t)pthread_getattr_np(native, attr);
}

int32_t libc_netbsd_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_netbsd_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_netbsd_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_netbsd_mod_pthread_getaffinity_np(int32_t thread, uint64_t size, void* set) {
    return (int32_t)pthread_getaffinity_np(thread, size, set);
}

int32_t libc_netbsd_mod_pthread_setaffinity_np(int32_t thread, uint64_t size, void* set) {
    return (int32_t)pthread_setaffinity_np(thread, size, set);
}

void* libc_netbsd_mod_cpuset_create(void) {
    return (void*)_cpuset_create();
}

void libc_netbsd_mod_cpuset_destroy(void* set) {
    _cpuset_destroy(set);
}

int32_t libc_netbsd_mod_cpuset_clr(int32_t cpu, void* set) {
    return (int32_t)_cpuset_clr(cpu, set);
}

int32_t libc_netbsd_mod_cpuset_set(int32_t cpu, void* set) {
    return (int32_t)_cpuset_set(cpu, set);
}

int32_t libc_netbsd_mod_cpuset_isset(int32_t cpu, void* set) {
    return (int32_t)_cpuset_isset(cpu, set);
}

uint64_t libc_netbsd_mod_cpuset_size(void* set) {
    return (uint64_t)_cpuset_size(set);
}

void libc_netbsd_mod_cpuset_zero(void* set) {
    _cpuset_zero(set);
}

int32_t libc_netbsd_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)__sigtimedwait50(set, info, timeout);
}

int32_t libc_netbsd_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

int32_t libc_netbsd_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

void libc_netbsd_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

void* libc_netbsd_mod_localeconv_l(int32_t loc) {
    return (void*)localeconv_l(loc);
}

int32_t libc_netbsd_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

int32_t libc_netbsd_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)__settimeofday50(tv, tz);
}

int32_t libc_netbsd_mod_dup3(int32_t src, int32_t dst, int32_t flags) {
    return (int32_t)dup3(src, dst, flags);
}

int32_t libc_netbsd_mod_kqueue1(int32_t flags) {
    return (int32_t)kqueue1(flags);
}

int32_t libc_netbsd_mod_lwp_self(void) {
    return (int32_t)_lwp_self();
}

void* libc_netbsd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_netbsd_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

void* libc_netbsd_mod_dlauxinfo(void) {
    return (void*)_dlauxinfo();
}

void* libc_netbsd_mod_iconv_open(const char* tocode, const char* fromcode) {
    return (void*)iconv_open(tocode, fromcode);
}

uint64_t libc_netbsd_mod_iconv(void* cd, void* inbuf, void* inbytesleft, void* outbuf, void* outbytesleft) {
    return (uint64_t)iconv(cd, inbuf, inbytesleft, outbuf, outbytesleft);
}

int32_t libc_netbsd_mod_iconv_close(void* cd) {
    return (int32_t)iconv_close(cd);
}

int32_t libc_netbsd_mod_timer_create(int32_t clockid, void* sevp, void* timerid) {
    return (int32_t)timer_create(clockid, sevp, timerid);
}

int32_t libc_netbsd_mod_timer_delete(int32_t timerid) {
    return (int32_t)timer_delete(timerid);
}

int32_t libc_netbsd_mod_timer_getoverrun(int32_t timerid) {
    return (int32_t)timer_getoverrun(timerid);
}

int32_t libc_netbsd_mod_timer_gettime(int32_t timerid, void* curr_value) {
    return (int32_t)__timer_gettime50(timerid, curr_value);
}

int32_t libc_netbsd_mod_timer_settime(int32_t timerid, int32_t flags, void* new_value, void* old_value) {
    return (int32_t)__timer_settime50(timerid, flags, new_value, old_value);
}

void* libc_netbsd_mod_dlvsym(void* handle, const char* symbol, const char* version) {
    return (void*)dlvsym(handle, symbol, version);
}

void libc_netbsd_mod_explicit_memset(void* b, int32_t c, uint64_t len) {
    explicit_memset(b, c, len);
}

int32_t libc_netbsd_mod_consttime_memequal(void* a, void* b, uint64_t len) {
    return (int32_t)consttime_memequal(a, b, len);
}

void* libc_netbsd_mod_mremap(void* oldp, uint64_t oldsize, void* newp, uint64_t newsize, int32_t flags) {
    return (void*)mremap(oldp, oldsize, newp, newsize, flags);
}

int32_t libc_netbsd_mod_sched_rr_get_interval(int32_t pid, void* t) {
    return (int32_t)__sched_rr_get_interval50(pid, t);
}

int32_t libc_netbsd_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_netbsd_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_netbsd_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_netbsd_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_netbsd_mod_pollts(void* fds, int32_t nfds, void* ts, void* sigmask) {
    return (int32_t)__pollts50(fds, nfds, ts, sigmask);
}

int64_t libc_netbsd_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

int32_t libc_netbsd_mod_reboot(int32_t mode, char* bootstr) {
    return (int32_t)reboot(mode, bootstr);
}

int32_t libc_netbsd_mod_lwp_park(int32_t clock, int32_t flags, void* ts, int32_t unpark, void* hint, void* unparkhint) {
    return (int32_t)___lwp_park60(clock, flags, ts, unpark, hint, unparkhint);
}

int32_t libc_netbsd_mod_lwp_unpark(int32_t lwp, void* hint) {
    return (int32_t)_lwp_unpark(lwp, hint);
}

int32_t libc_netbsd_mod_lwp_unpark_all(void* targets, uint64_t ntargets, void* hint) {
    return (int32_t)_lwp_unpark_all(targets, ntargets, hint);
}

int32_t libc_netbsd_mod_getmntinfo(void* mntbufp, int32_t flags) {
    return (int32_t)getmntinfo(mntbufp, flags);
}

int32_t libc_netbsd_mod_getvfsstat(void* buf, uint64_t bufsize, int32_t flags) {
    return (int32_t)getvfsstat(buf, bufsize, flags);
}

int32_t libc_netbsd_mod_eventfd(uint32_t val, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(val, flags);
#else
    (void)val;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsd_mod_eventfd_read(int32_t efd, void* valp) {
    return (int32_t)eventfd_read(efd, valp);
}

int32_t libc_netbsd_mod_eventfd_write(int32_t efd, uint64_t val) {
    return (int32_t)eventfd_write(efd, val);
}

int32_t libc_netbsd_mod_timerfd_create(int32_t clockid, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clockid, flags);
#else
    (void)clockid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsd_mod_timerfd_gettime(int32_t fd, void* curr_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, curr_value);
#else
    (void)fd;
    (void)curr_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_netbsd_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
#if defined(__linux__)
    return (int32_t)timerfd_settime(fd, flags, new_value, old_value);
#else
    (void)fd;
    (void)flags;
    (void)new_value;
    (void)old_value;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_netbsd_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* compar, void* arg) {
    qsort_r(base, num, size, compar, arg);
}

int32_t libc_netbsd_mod_aio_read(void* aiocbp) {
    return (int32_t)aio_read(aiocbp);
}

int32_t libc_netbsd_mod_aio_write(void* aiocbp) {
    return (int32_t)aio_write(aiocbp);
}

int32_t libc_netbsd_mod_aio_fsync(int32_t op, void* aiocbp) {
    return (int32_t)aio_fsync(op, aiocbp);
}

int32_t libc_netbsd_mod_aio_error(void* aiocbp) {
    return (int32_t)aio_error(aiocbp);
}

int64_t libc_netbsd_mod_aio_return(void* aiocbp) {
    return (int64_t)aio_return(aiocbp);
}

int32_t libc_netbsd_mod_aio_suspend(void* aiocb_list, int32_t nitems, void* timeout) {
    return (int32_t)__aio_suspend50(aiocb_list, nitems, timeout);
}

int32_t libc_netbsd_mod_aio_cancel(int32_t fd, void* aiocbp) {
    return (int32_t)aio_cancel(fd, aiocbp);
}

int32_t libc_netbsd_mod_lio_listio(int32_t mode, void* aiocb_list, int32_t nitems, void* sevp) {
    return (int32_t)lio_listio(mode, aiocb_list, nitems, sevp);
}

int32_t libc_netbsd_mod_getpwent_r(void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)__getpwent_r50(pwd, buf, buflen, result);
}

int32_t libc_netbsd_mod_getgrent_r(void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrent_r(grp, buf, buflen, result);
}

void* libc_netbsd_mod_efopen(const char* p, const char* m) {
    return (void*)efopen(p, m);
}

void* libc_netbsd_mod_emalloc(uint64_t n) {
    return (void*)emalloc(n);
}

void* libc_netbsd_mod_ecalloc(uint64_t n, uint64_t c) {
    return (void*)ecalloc(n, c);
}

void* libc_netbsd_mod_erealloc(void* p, uint64_t n) {
    return (void*)erealloc(p, n);
}

void libc_netbsd_mod_ereallocarr(void* p, uint64_t n, uint64_t s) {
    ereallocarr(p, n, s);
}

char* libc_netbsd_mod_estrdup(const char* s) {
    return (char*)estrdup(s);
}

char* libc_netbsd_mod_estrndup(const char* s, uint64_t len) {
    return (char*)estrndup(s, len);
}

uint64_t libc_netbsd_mod_estrlcpy(char* dst, const char* src, uint64_t len) {
    return (uint64_t)estrlcpy(dst, src, len);
}

uint64_t libc_netbsd_mod_estrlcat(char* dst, const char* src, uint64_t len) {
    return (uint64_t)estrlcat(dst, src, len);
}

int32_t libc_netbsd_mod_estrtoi(const char* nptr, int32_t base, int32_t lo, int32_t hi) {
    return (int32_t)estrtoi(nptr, base, lo, hi);
}

int32_t libc_netbsd_mod_estrtou(const char* nptr, int32_t base, int32_t lo, int32_t hi) {
    return (int32_t)estrtou(nptr, base, lo, hi);
}

void* libc_netbsd_mod_esetfunc(void* cb) {
    return (void*)esetfunc(cb);
}

int32_t libc_netbsd_mod_secure_path(const char* path) {
    return (int32_t)secure_path(path);
}

int32_t libc_netbsd_mod_snprintb(char* buf, uint64_t buflen, const char* fmt, uint64_t val) {
    return (int32_t)snprintb(buf, buflen, fmt, val);
}

int32_t libc_netbsd_mod_snprintb_m(char* buf, uint64_t buflen, const char* fmt, uint64_t val, uint64_t max) {
    return (int32_t)snprintb_m(buf, buflen, fmt, val, max);
}

const char* libc_netbsd_mod_getbootfile(void) {
    return (const char*)getbootfile();
}

int32_t libc_netbsd_mod_getbyteorder(void) {
    return (int32_t)getbyteorder();
}

const char* libc_netbsd_mod_getdiskrawname(char* buf, uint64_t buflen, const char* name) {
    return (const char*)getdiskrawname(buf, buflen, name);
}

const char* libc_netbsd_mod_getdiskcookedname(char* buf, uint64_t buflen, const char* name) {
    return (const char*)getdiskcookedname(buf, buflen, name);
}

const char* libc_netbsd_mod_getfsspecname(char* buf, uint64_t buflen, const char* spec) {
    return (const char*)getfsspecname(buf, buflen, spec);
}

char* libc_netbsd_mod_strpct(char* buf, uint64_t bufsiz, int32_t numerator, int32_t denominator, uint64_t precision) {
    return (char*)strpct(buf, bufsiz, numerator, denominator, precision);
}

char* libc_netbsd_mod_strspct(char* buf, uint64_t bufsiz, int32_t numerator, int32_t denominator, uint64_t precision) {
    return (char*)strspct(buf, bufsiz, numerator, denominator, precision);
}

void libc_netbsd_mod_login(void* ut) {
    __login50(ut);
}

void libc_netbsd_mod_loginx(void* ut) {
    __loginx50(ut);
}

void libc_netbsd_mod_logout(const char* line) {
    logout(line);
}

void libc_netbsd_mod_logoutx(const char* line, int32_t status, int32_t tpe) {
    logoutx(line, status, tpe);
}

void libc_netbsd_mod_logwtmp(const char* line, const char* name, const char* host) {
    logwtmp(line, name, host);
}

void libc_netbsd_mod_logwtmpx(const char* line, const char* name, const char* host, int32_t status, int32_t tpe) {
    logwtmpx(line, name, host, status, tpe);
}

int64_t libc_netbsd_mod_getxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)getxattr(path, name, value, size);
}

int64_t libc_netbsd_mod_lgetxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int64_t)lgetxattr(path, name, value, size);
}

int64_t libc_netbsd_mod_fgetxattr(int32_t filedes, const char* name, void* value, uint64_t size) {
    return (int64_t)fgetxattr(filedes, name, value, size);
}

int32_t libc_netbsd_mod_setxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int32_t)setxattr(path, name, value, size);
}

int32_t libc_netbsd_mod_lsetxattr(const char* path, const char* name, void* value, uint64_t size) {
    return (int32_t)lsetxattr(path, name, value, size);
}

int32_t libc_netbsd_mod_fsetxattr(int32_t filedes, const char* name, void* value, uint64_t size, int32_t flags) {
    return (int32_t)fsetxattr(filedes, name, value, size, flags);
}

int64_t libc_netbsd_mod_listxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)listxattr(path, list, size);
}

int64_t libc_netbsd_mod_llistxattr(const char* path, char* list, uint64_t size) {
    return (int64_t)llistxattr(path, list, size);
}

int64_t libc_netbsd_mod_flistxattr(int32_t filedes, char* list, uint64_t size) {
    return (int64_t)flistxattr(filedes, list, size);
}

int32_t libc_netbsd_mod_removexattr(const char* path, const char* name) {
    return (int32_t)removexattr(path, name);
}

int32_t libc_netbsd_mod_lremovexattr(const char* path, const char* name) {
    return (int32_t)lremovexattr(path, name);
}

int32_t libc_netbsd_mod_fremovexattr(int32_t fd, const char* path, const char* name) {
    return (int32_t)fremovexattr(fd, path, name);
}

int32_t libc_netbsd_mod_string_to_flags(void* string_p, void* setp, void* clrp) {
    return (int32_t)string_to_flags(string_p, setp, clrp);
}

int32_t libc_netbsd_mod_flags_to_string(uint64_t flags, const char* def) {
    return (int32_t)flags_to_string(flags, def);
}

void* libc_netbsd_mod_kinfo_getvmmap(int32_t pid, void* cntp) {
    return (void*)kinfo_getvmmap(pid, cntp);
}

uint64_t libc_netbsd_mod_backtrace(void* addrlist, uint64_t len) {
    return (uint64_t)backtrace(addrlist, len);
}

void* libc_netbsd_mod_backtrace_symbols(void* addrlist, uint64_t len) {
    return (void*)backtrace_symbols(addrlist, len);
}

int32_t libc_netbsd_mod_backtrace_symbols_fd(void* addrlist, uint64_t len, int32_t fd) {
    return (int32_t)backtrace_symbols_fd(addrlist, len, fd);
}

void* libc_netbsd_mod_backtrace_symbols_fmt(void* addrlist, uint64_t len, const char* fmt) {
    return (void*)backtrace_symbols_fmt(addrlist, len, fmt);
}

int32_t libc_netbsd_mod_backtrace_symbols_fd_fmt(void* addrlist, uint64_t len, int32_t fd, const char* fmt) {
    return (int32_t)backtrace_symbols_fd_fmt(addrlist, len, fd, fmt);
}

