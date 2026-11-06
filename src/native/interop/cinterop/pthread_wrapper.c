#include "pthread_wrapper.h"
#include <errno.h>

int32_t libc_pthread_pthread_getaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_getaffinity_np(thread, cpusetsize, cpuset);
}

int32_t libc_pthread_pthread_getattr_np(int32_t native, void* attr) {
    return (int32_t)pthread_getattr_np(native, attr);
}

int32_t libc_pthread_pthread_getname_np(int32_t thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

int32_t libc_pthread_pthread_setaffinity_np(int32_t thread, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)pthread_setaffinity_np(thread, cpusetsize, cpuset);
}

int32_t libc_pthread_pthread_setname_np(int32_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

