#ifndef LIBC_ILLUMOS_ILLUMOS_WRAPPER_H
#define LIBC_ILLUMOS_ILLUMOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_illumos_eventfd(uint32_t initval, int32_t flags);
int32_t libc_illumos_epoll_pwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask);
int32_t libc_illumos_epoll_create(int32_t size);
int32_t libc_illumos_epoll_create1(int32_t flags);
int32_t libc_illumos_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout);
int32_t libc_illumos_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event);
int32_t libc_illumos_mincore(int32_t addr, uint64_t len, char* vec);
int32_t libc_illumos_pset_bind_lwp(int32_t pset, int32_t id, int32_t pid, void* opset);
int32_t libc_illumos_pset_getloadavg(int32_t pset, void* load, int32_t num);
int32_t libc_illumos_pthread_attr_get_np(int32_t thread, void* attr);
int32_t libc_illumos_pthread_attr_getstackaddr(void* attr, void* stackaddr);
int32_t libc_illumos_pthread_attr_setstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libc_illumos_pthread_attr_setstackaddr(void* attr, void* stackaddr);
int32_t libc_illumos_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advice);
int64_t libc_illumos_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int64_t libc_illumos_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset);
int32_t libc_illumos_getpagesizes2(void* pagesize, int32_t nelem);
int32_t libc_illumos_posix_spawn_file_actions_addfchdir_np(void* file_actions, int32_t fd);
int32_t libc_illumos_ptsname_r(int32_t fildes, char* name, uint64_t namelen);
int32_t libc_illumos_syncfs(int32_t fd);
int32_t libc_illumos_strcasecmp_l(const char* s1, const char* s2, int32_t loc);
int32_t libc_illumos_strncasecmp_l(const char* s1, const char* s2, uint64_t n, int32_t loc);
int32_t libc_illumos_timerfd_create(int32_t clockid, int32_t flags);
int32_t libc_illumos_timerfd_gettime(int32_t fd, void* curr_value);
int32_t libc_illumos_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_ILLUMOS_ILLUMOS_WRAPPER_H */
