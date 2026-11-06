#include "openbsd_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <dirent.h>
#include <sys/mman.h>
#endif
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
#endif

int32_t libc_openbsd_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int32_t libc_openbsd_mod_settimeofday(void* tp, void* tz) {
    return (int32_t)settimeofday(tp, tz);
}

int32_t libc_openbsd_mod_pledge(const char* promises, const char* execpromises) {
    return (int32_t)pledge(promises, execpromises);
}

int32_t libc_openbsd_mod_unveil(const char* path, const char* permissions) {
    return (int32_t)unveil(path, permissions);
}

int64_t libc_openbsd_mod_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr) {
    return (int64_t)strtonum(nptr, minval, maxval, errstr);
}

int32_t libc_openbsd_mod_dup3(int32_t src, int32_t dst, int32_t flags) {
    return (int32_t)dup3(src, dst, flags);
}

int32_t libc_openbsd_mod_chflags(const char* path, uint32_t flags) {
    return (int32_t)chflags(path, flags);
}

int32_t libc_openbsd_mod_fchflags(int32_t fd, uint32_t flags) {
    return (int32_t)fchflags(fd, flags);
}

int32_t libc_openbsd_mod_chflagsat(int32_t fd, const char* path, uint32_t flags, int32_t atflag) {
    return (int32_t)chflagsat(fd, path, flags, atflag);
}

int32_t libc_openbsd_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_openbsd_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint64_t hostlen, char* serv, uint64_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_openbsd_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_openbsd_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

int32_t libc_openbsd_mod_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kevent(kq, changelist, nchanges, eventlist, nevents, timeout);
#else
    (void)kq;
    (void)changelist;
    (void)nchanges;
    (void)eventlist;
    (void)nevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_openbsd_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_openbsd_mod_getthrid(void) {
    return (int32_t)getthrid();
}

int32_t libc_openbsd_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_openbsd_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_openbsd_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_openbsd_mod_pthread_main_np(void) {
    return (int32_t)pthread_main_np();
}

void libc_openbsd_mod_pthread_get_name_np(int32_t tid, char* name, uint64_t len) {
    pthread_get_name_np(tid, name, len);
}

void libc_openbsd_mod_pthread_set_name_np(int32_t tid, const char* name) {
    pthread_set_name_np(tid, name);
}

int32_t libc_openbsd_mod_pthread_stackseg_np(int32_t thread, void* sinfo) {
    return (int32_t)pthread_stackseg_np(thread, sinfo);
}

int32_t libc_openbsd_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_openbsd_mod_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

int32_t libc_openbsd_mod_sysctl(void* name, uint32_t namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
    return (int32_t)sysctl(name, namelen, oldp, oldlenp, newp, newlen);
}

int32_t libc_openbsd_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_openbsd_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

int32_t libc_openbsd_mod_ptrace(int32_t request, int32_t pid, char* addr, int32_t data) {
    return (int32_t)ptrace(request, pid, addr, data);
}

int32_t libc_openbsd_mod_utrace(const char* label, void* addr, uint64_t len) {
    return (int32_t)utrace(label, addr, len);
}

void* libc_openbsd_mod_memmem(void* haystack, uint64_t haystacklen, void* needle, uint64_t needlelen) {
    return (void*)memmem(haystack, haystacklen, needle, needlelen);
}

int32_t libc_openbsd_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

int32_t libc_openbsd_mod_uselocale(int32_t loc) {
    return (int32_t)uselocale(loc);
}

void libc_openbsd_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int32_t libc_openbsd_mod_newlocale(int32_t mask, const char* locale, int32_t base) {
    return (int32_t)newlocale(mask, locale, base);
}

int32_t libc_openbsd_mod_duplocale(int32_t base) {
    return (int32_t)duplocale(base);
}

void libc_openbsd_mod_explicit_bzero(void* s, uint64_t len) {
    explicit_bzero(s, len);
}

void libc_openbsd_mod_freezero(void* ptr, uint64_t size) {
    freezero(ptr, size);
}

void* libc_openbsd_mod_malloc_conceal(uint64_t size) {
    return (void*)malloc_conceal(size);
}

void* libc_openbsd_mod_calloc_conceal(uint64_t nmemb, uint64_t size) {
    return (void*)calloc_conceal(nmemb, size);
}

void libc_openbsd_mod_srand48deterministic(int64_t seed) {
    srand48_deterministic(seed);
}

void* libc_openbsd_mod_seed48deterministic(void* xseed) {
    return (void*)seed48_deterministic(xseed);
}

void libc_openbsd_mod_lcong48deterministic(void* p) {
    lcong48_deterministic(p);
}

void* libc_openbsd_mod_lsearch(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lsearch(key, base, nelp, width, compar);
}

void* libc_openbsd_mod_lfind(void* key, void* base, void* nelp, uint64_t width, void* compar) {
    return (void*)lfind(key, base, nelp, width, compar);
}

int32_t libc_openbsd_mod_hcreate(uint64_t nelt) {
    return (int32_t)hcreate(nelt);
}

void libc_openbsd_mod_hdestroy(void) {
    hdestroy();
}

void* libc_openbsd_mod_hsearch(int32_t entry, uint32_t action) {
    return (void*)hsearch(entry, action);
}

int32_t libc_openbsd_mod_futex(void* uaddr, int32_t op, int32_t val, void* timeout, void* uaddr2) {
    return (int32_t)futex(uaddr, op, val, timeout, uaddr2);
}

int32_t libc_openbsd_mod_mimmutable(void* addr, uint64_t len) {
    return (int32_t)mimmutable(addr, len);
}

int32_t libc_openbsd_mod_reboot(int32_t mode) {
    return (int32_t)reboot(mode);
}

int32_t libc_openbsd_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_openbsd_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

int32_t libc_openbsd_mod_getmntinfo(void* mntbufp, int32_t flags) {
    return (int32_t)getmntinfo(mntbufp, flags);
}

int32_t libc_openbsd_mod_getfsstat(void* buf, uint64_t bufsize, int32_t flags) {
    return (int32_t)getfsstat(buf, bufsize, flags);
}

int32_t libc_openbsd_mod_elf_aux_info(int32_t aux, void* buf, int32_t buflen) {
    return (int32_t)elf_aux_info(aux, buf, buflen);
}

uint64_t libc_openbsd_mod_backtrace(void* addrlist, uint64_t len) {
    return (uint64_t)backtrace(addrlist, len);
}

void* libc_openbsd_mod_backtrace_symbols(void* addrlist, uint64_t len) {
    return (void*)backtrace_symbols(addrlist, len);
}

int32_t libc_openbsd_mod_backtrace_symbols_fd(void* addrlist, uint64_t len, int32_t fd) {
    return (int32_t)backtrace_symbols_fd(addrlist, len, fd);
}

void* libc_openbsd_mod_backtrace_symbols_fmt(void* addrlist, uint64_t len, const char* fmt) {
    return (void*)backtrace_symbols_fmt(addrlist, len, fmt);
}

