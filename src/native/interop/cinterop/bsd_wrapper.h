#ifndef LIBC_BSD_BSD_WRAPPER_H
#define LIBC_BSD_BSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_bsd_daemon(int32_t nochdir, int32_t noclose);
const char* libc_bsd_getprogname(void);
void libc_bsd_setprogname(const char* progname);
uint32_t libc_bsd_arc4random(void);
uint32_t libc_bsd_arc4random_uniform(uint32_t upper_bound);
void libc_bsd_arc4random_buf(void* buf, uint64_t n);
int32_t libc_bsd_mkstemps(char* template, int32_t suffixlen);
int64_t libc_bsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libc_bsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_bsd_login_tty(int32_t _fd);
int32_t libc_bsd_forkpty(void* amaster, char* name, void* termp, void* winp);
char* libc_bsd_strsep(void* string, const char* delimiters);
void libc_bsd_explicit_bzero(void* buf, uint64_t len);
void* libc_bsd_sl_init(void);
int32_t libc_bsd_sl_add(void* sl, char* n);
void libc_bsd_sl_free(void* sl, int32_t i);
char* libc_bsd_sl_find(void* sl, char* n);
int32_t libc_bsd_kqueue(void);
int32_t libc_bsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libc_bsd_dl_iterate_phdr(void* callback, void* data);
int32_t libc_bsd_lutimes(const char* file, void* times);
int64_t libc_bsd_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_bsd_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_BSD_BSD_WRAPPER_H */
