#include "bsd_wrapper.h"
#include <errno.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/event.h>
#endif

int32_t libc_bsd_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

const char* libc_bsd_getprogname(void) {
    return (const char*)getprogname();
}

void libc_bsd_setprogname(const char* progname) {
    setprogname(progname);
}

uint32_t libc_bsd_arc4random(void) {
    return (uint32_t)arc4random();
}

uint32_t libc_bsd_arc4random_uniform(uint32_t upper_bound) {
    return (uint32_t)arc4random_uniform(upper_bound);
}

void libc_bsd_arc4random_buf(void* buf, uint64_t n) {
    arc4random_buf(buf, n);
}

int32_t libc_bsd_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int64_t libc_bsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr) {
    return (int64_t)strtonum(nptr, minval, maxval, errstr);
}

int32_t libc_bsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_bsd_login_tty(int32_t _fd) {
    return (int32_t)login_tty(_fd);
}

int32_t libc_bsd_forkpty(void* amaster, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amaster, name, termp, winp);
}

char* libc_bsd_strsep(void* string, const char* delimiters) {
    return (char*)strsep(string, delimiters);
}

void libc_bsd_explicit_bzero(void* buf, uint64_t len) {
    explicit_bzero(buf, len);
}

void* libc_bsd_sl_init(void) {
    return (void*)sl_init();
}

int32_t libc_bsd_sl_add(void* sl, char* n) {
    return (int32_t)sl_add(sl, n);
}

void libc_bsd_sl_free(void* sl, int32_t i) {
    sl_free(sl, i);
}

char* libc_bsd_sl_find(void* sl, char* n) {
    return (char*)sl_find(sl, n);
}

int32_t libc_bsd_kqueue(void) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return (int32_t)kqueue();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_bsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout) {
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

int32_t libc_bsd_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

int32_t libc_bsd_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

int64_t libc_bsd_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int64_t libc_bsd_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int32_t libc_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage) {
    return (int32_t)wait4(pid, status, options, rusage);
}

