#ifndef LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H
#define LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixSolarishIllumosEventfd(uint32_t initval, int32_t flags);
int32_t libcUnixSolarishIllumosEpollPwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libcUnixSolarishIllumosEpollCreate(int32_t size);
int32_t libcUnixSolarishIllumosEpollCreate1(int32_t flags);
int32_t libcUnixSolarishIllumosEpollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libcUnixSolarishIllumosEpollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libcUnixSolarishIllumosMincore(char* addr, uint64_t len, char* vec);
int32_t libcUnixSolarishIllumosPsetBindLwp(int32_t pset, int32_t id, int32_t pid, void* opset);
int32_t libcUnixSolarishIllumosPsetGetloadavg(int32_t pset, void* load, int32_t num);
int32_t libcUnixSolarishIllumosPthreadAttrGetNp(void* thread, void* attr);
int32_t libcUnixSolarishIllumosPthreadAttrGetstackaddr(void* attr, void* stackaddr);
int32_t libcUnixSolarishIllumosPthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libcUnixSolarishIllumosPthreadAttrSetstackaddr(void* attr, void* stackaddr);
int32_t libcUnixSolarishIllumosPosixFadvise(int32_t fd, int64_t offset, int64_t len, int32_t advice);
int64_t libcUnixSolarishIllumosPreadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libcUnixSolarishIllumosPwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libcUnixSolarishIllumosGetpagesizes2(void* pagesize, int32_t nelem);
int32_t libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(void* fileActions, int32_t fd);
int32_t libcUnixSolarishIllumosPtsnameR(int32_t fildes, char* name, uint64_t namelen);
int32_t libcUnixSolarishIllumosSyncfs(int32_t fd);
int32_t libcUnixSolarishIllumosStrcasecmpL(const char* s1, const char* s2, void* loc);
int32_t libcUnixSolarishIllumosStrncasecmpL(const char* s1, const char* s2, uint64_t n, void* loc);
int32_t libcUnixSolarishIllumosTimerfdCreate(int32_t clockid, int32_t flags);
int32_t libcUnixSolarishIllumosTimerfdGettime(int32_t fd, void* currValue);
int32_t libcUnixSolarishIllumosTimerfdSettime(int32_t fd, int32_t flags, void* newValue, void* oldValue);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H */
