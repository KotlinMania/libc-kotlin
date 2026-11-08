#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "pthread_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread.h>
#endif

int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
#if defined(__linux__) && !defined(__ANDROID__)
    return (int32_t)pthread_getaffinity_np((pthread_t)(uintptr_t)thread, (size_t)cpusetsize, (cpu_set_t*)cpuset);
#else
    (void)thread; (void)cpusetsize; (void)cpuset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr) {
#if defined(__linux__)
    return (int32_t)pthread_getattr_np((pthread_t)(uintptr_t)native, (pthread_attr_t*)attr);
#else
    (void)native; (void)attr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
#if defined(__APPLE__)
    pthread_getname_np((pthread_t)(uintptr_t)thread, name, (size_t)len);
    return 0;
#elif defined(__linux__) && (!defined(__ANDROID__) || __ANDROID_API__ >= 26)
    return (int32_t)pthread_getname_np((pthread_t)(uintptr_t)thread, name, (size_t)len);
#else
    (void)thread; (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
#if defined(__linux__) && !defined(__ANDROID__)
    return (int32_t)pthread_setaffinity_np((pthread_t)(uintptr_t)thread, (size_t)cpusetsize, (const cpu_set_t*)cpuset);
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
    return (int32_t)pthread_setname_np((pthread_t)(uintptr_t)thread, name);
#else
    (void)thread; (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
