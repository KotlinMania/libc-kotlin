#ifndef LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H
#define LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_solarish_illumos_eventfd(uint32_t initval, int32_t flags);
int32_t libc_unix_solarish_illumos_epollPwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libc_unix_solarish_illumos_epollCreate(int32_t size);
int32_t libc_unix_solarish_illumos_epollCreate1(int32_t flags);
int32_t libc_unix_solarish_illumos_epollWait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_unix_solarish_illumos_epollCtl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_unix_solarish_illumos_mincore(char* addr, uint64_t len, char* vec);
int32_t libc_unix_solarish_illumos_psetBindLwp(int32_t pset, int32_t id, int32_t pid, void* opset);
int32_t libc_unix_solarish_illumos_psetGetloadavg(int32_t pset, void* load, int32_t num);
int32_t libc_unix_solarish_illumos_pthreadAttrGetNp(void* thread, void* attr);
int32_t libc_unix_solarish_illumos_pthreadAttrGetstackaddr(void* attr, void* stackaddr);
int32_t libc_unix_solarish_illumos_pthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libc_unix_solarish_illumos_pthreadAttrSetstackaddr(void* attr, void* stackaddr);
int32_t libc_unix_solarish_illumos_posixFadvise(int32_t fd, int64_t offset, int64_t len, int32_t advice);
int64_t libc_unix_solarish_illumos_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_unix_solarish_illumos_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_unix_solarish_illumos_getpagesizes2(void* pagesize, int32_t nelem);
int32_t libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp(void* file_actions, int32_t fd);
int32_t libc_unix_solarish_illumos_ptsnameR(int32_t fildes, char* name, uint64_t namelen);
int32_t libc_unix_solarish_illumos_syncfs(int32_t fd);
int32_t libc_unix_solarish_illumos_strcasecmpL(const char* s1, const char* s2, void* loc);
int32_t libc_unix_solarish_illumos_strncasecmpL(const char* s1, const char* s2, uint64_t n, void* loc);
int32_t libc_unix_solarish_illumos_timerfdCreate(int32_t clockid, int32_t flags);
int32_t libc_unix_solarish_illumos_timerfdGettime(int32_t fd, void* curr_value);
int32_t libc_unix_solarish_illumos_timerfdSettime(int32_t fd, int32_t flags, void* new_value, void* old_value);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_SOLARISH_ILLUMOS_UNIX_SOLARISH_ILLUMOS_WRAPPER_H */
