#include "illumos_wrapper.h"
#include <errno.h>
#if defined(__linux__)
#include <sys/epoll.h>
#endif

int32_t libc_illumos_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_epoll_pwait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout, void* sigmask) {
    return (int32_t)epoll_pwait(epfd, events, maxevents, timeout, sigmask);
}

int32_t libc_illumos_epoll_create(int32_t size) {
#if defined(__linux__)
    return (int32_t)epoll_create(size);
#else
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_epoll_create1(int32_t flags) {
#if defined(__linux__)
    return (int32_t)epoll_create1(flags);
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_epoll_wait(int32_t epfd, void* events, int32_t maxevents, int32_t timeout) {
#if defined(__linux__)
    return (int32_t)epoll_wait(epfd, events, maxevents, timeout);
#else
    (void)epfd;
    (void)events;
    (void)maxevents;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_epoll_ctl(int32_t epfd, int32_t op, int32_t fd, void* event) {
#if defined(__linux__)
    return (int32_t)epoll_ctl(epfd, op, fd, event);
#else
    (void)epfd;
    (void)op;
    (void)fd;
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_mincore(int32_t addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_illumos_pset_bind_lwp(int32_t pset, int32_t id, int32_t pid, void* opset) {
    return (int32_t)pset_bind_lwp(pset, id, pid, opset);
}

int32_t libc_illumos_pset_getloadavg(int32_t pset, void* load, int32_t num) {
    return (int32_t)pset_getloadavg(pset, load, num);
}

int32_t libc_illumos_pthread_attr_get_np(int32_t thread, void* attr) {
    return (int32_t)pthread_attr_get_np(thread, attr);
}

int32_t libc_illumos_pthread_attr_getstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_getstackaddr(attr, stackaddr);
}

int32_t libc_illumos_pthread_attr_setstack(void* attr, void* stackaddr, uint64_t stacksize) {
    return (int32_t)pthread_attr_setstack(attr, stackaddr, stacksize);
}

int32_t libc_illumos_pthread_attr_setstackaddr(void* attr, void* stackaddr) {
    return (int32_t)pthread_attr_setstackaddr(attr, stackaddr);
}

int32_t libc_illumos_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advice) {
    return (int32_t)posix_fadvise(fd, offset, len, advice);
}

int64_t libc_illumos_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int64_t libc_illumos_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int32_t libc_illumos_getpagesizes2(void* pagesize, int32_t nelem) {
    return (int32_t)getpagesizes2(pagesize, nelem);
}

int32_t libc_illumos_posix_spawn_file_actions_addfchdir_np(void* file_actions, int32_t fd) {
    return (int32_t)posix_spawn_file_actions_addfchdir_np(file_actions, fd);
}

int32_t libc_illumos_ptsname_r(int32_t fildes, char* name, uint64_t namelen) {
    return (int32_t)ptsname_r(fildes, name, namelen);
}

int32_t libc_illumos_syncfs(int32_t fd) {
    return (int32_t)syncfs(fd);
}

int32_t libc_illumos_strcasecmp_l(const char* s1, const char* s2, int32_t loc) {
    return (int32_t)strcasecmp_l(s1, s2, loc);
}

int32_t libc_illumos_strncasecmp_l(const char* s1, const char* s2, uint64_t n, int32_t loc) {
    return (int32_t)strncasecmp_l(s1, s2, n, loc);
}

int32_t libc_illumos_timerfd_create(int32_t clockid, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clockid, flags);
#else
    (void)clockid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_timerfd_gettime(int32_t fd, void* curr_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, curr_value);
#else
    (void)fd;
    (void)curr_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_illumos_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
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

