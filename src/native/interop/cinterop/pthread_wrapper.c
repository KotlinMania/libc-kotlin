#include "pthread_wrapper.h"
#include <errno.h>
#include <pthread.h>

int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
#if defined(__linux__)
    return (int32_t)pthread_getaffinity_np(thread, cpusetsize, cpuset);
#else
    (void)thread; (void)cpusetsize; (void)cpuset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr) {
#if defined(__linux__)
    return (int32_t)pthread_getattr_np(native, attr);
#else
    (void)native; (void)attr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
#if defined(__APPLE__)
    pthread_getname_np((pthread_t)(long)thread, name, (size_t)len);
    return 0;
#elif defined(__linux__)
    return (int32_t)pthread_getname_np(thread, name, len);
#else
    (void)thread; (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
#if defined(__linux__)
    return (int32_t)pthread_setaffinity_np(thread, cpusetsize, cpuset);
#else
    (void)thread; (void)cpusetsize; (void)cpuset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_setname_np(int32_t thread, const char* name) {
#if defined(__APPLE__)
    /* macOS pthread_setname_np takes only a name, not a thread ID */
    (void)thread;
    return (int32_t)pthread_setname_np(name);
#elif defined(__linux__)
    return (int32_t)pthread_setname_np(thread, name);
#else
    (void)thread; (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
