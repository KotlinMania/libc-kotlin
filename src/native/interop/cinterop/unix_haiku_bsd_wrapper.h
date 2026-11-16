#ifndef LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H
#define LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixHaikuBsdDaemon(int32_t nochdir, int32_t noclose);
const char* libcUnixHaikuBsdGetprogname(void);
void libcUnixHaikuBsdSetprogname(const char* progname);
uint32_t libcUnixHaikuBsdArc4random(void);
uint32_t libcUnixHaikuBsdArc4randomUniform(uint32_t upperBound);
void libcUnixHaikuBsdArc4randomBuf(void* buf, uint64_t n);
int32_t libcUnixHaikuBsdMkstemps(char* arg0Template, int32_t suffixlen);
int64_t libcUnixHaikuBsdStrtonum(const char* nptr, int64_t minval, int64_t maxval, void* errstr);
int32_t libcUnixHaikuBsdOpenpty(void* amaster, void* aslave, char* name, void* termp, void* winp);
int32_t libcUnixHaikuBsdLoginTty(int32_t fd);
int32_t libcUnixHaikuBsdForkpty(void* amaster, char* name, void* termp, void* winp);
char* libcUnixHaikuBsdStrsep(void* string, const char* delimiters);
void libcUnixHaikuBsdExplicitBzero(void* buf, uint64_t len);
void* libcUnixHaikuBsdSlInit(void);
int32_t libcUnixHaikuBsdSlAdd(void* sl, char* n);
void libcUnixHaikuBsdSlFree(void* sl, int32_t i);
char* libcUnixHaikuBsdSlFind(void* sl, char* n);
int32_t libcUnixHaikuBsdKqueue(void);
int32_t libcUnixHaikuBsdKevent(int32_t kq, void* changelist, int32_t nchanges, void* eventlist, int32_t nevents, void* timeout);
int32_t libcUnixHaikuBsdDlIteratePhdr(void* callback, void* data);
int32_t libcUnixHaikuBsdLutimes(const char* file, void* times);
int64_t libcUnixHaikuBsdPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixHaikuBsdPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixHaikuBsdWait4(int32_t pid, void* status, int32_t options, void* rusage);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_HAIKU_BSD_UNIX_HAIKU_BSD_WRAPPER_H */
