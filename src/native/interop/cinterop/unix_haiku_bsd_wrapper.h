#ifndef LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H
#define LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_haiku_bsd_daemon(int32_t nochdir, int32_t noclose);
const char* libc_unix_haiku_bsd_getprogname(void);
void libc_unix_haiku_bsd_setprogname(const char* progname);
uint32_t libc_unix_haiku_bsd_arc4random(void);
uint32_t libc_unix_haiku_bsd_arc4randomUniform(uint32_t upper_bound);
void libc_unix_haiku_bsd_arc4randomBuf(void* buf, uint64_t n);
int32_t libc_unix_haiku_bsd_mkstemps(char* arg_0_template, int32_t suffixlen);
int64_t libc_unix_haiku_bsd_strtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libc_unix_haiku_bsd_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libc_unix_haiku_bsd_loginTty(int32_t arg_0_fd);
int32_t libc_unix_haiku_bsd_forkpty(void* amaster, char* name, void* termp, void* winp);
char* libc_unix_haiku_bsd_strsep(void* string, const char* delimiters);
void libc_unix_haiku_bsd_explicitBzero(void* buf, uint64_t len);
void* libc_unix_haiku_bsd_slInit(void);
int32_t libc_unix_haiku_bsd_slAdd(void* sl, char* n);
void libc_unix_haiku_bsd_slFree(void* sl, int32_t i);
char* libc_unix_haiku_bsd_slFind(void* sl, char* n);
int32_t libc_unix_haiku_bsd_kqueue(void);
int32_t libc_unix_haiku_bsd_kevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libc_unix_haiku_bsd_dlIteratePhdr(void* callback, void* data);
int32_t libc_unix_haiku_bsd_lutimes(const char* file, void* times);
int64_t libc_unix_haiku_bsd_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_haiku_bsd_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_haiku_bsd_wait4(int32_t pid, void* status, int32_t options, void* rusage);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H */
