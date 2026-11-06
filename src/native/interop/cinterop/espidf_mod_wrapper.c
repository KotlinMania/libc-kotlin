#include "espidf_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread.h>
#endif

int32_t libc_espidf_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int64_t libc_espidf_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags) {
    return (int64_t)getrandom(buf, buflen, flags);
}

void libc_espidf_mod_gethostname(char* name, int64_t namelen) {
    gethostname(name, namelen);
}

int64_t libc_espidf_mod_sendmsg(int32_t s, void* msg, int32_t flags) {
    return (int64_t)lwip_sendmsg(s, msg, flags);
}

int64_t libc_espidf_mod_recvmsg(int32_t s, void* msg, int32_t flags) {
    return (int64_t)lwip_recvmsg(s, msg, flags);
}

int32_t libc_espidf_mod_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

