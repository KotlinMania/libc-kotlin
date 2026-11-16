#include "new_qurt_dlfcn_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <dlfcn.h>
#endif

void* libcNewQurtDlfcnDlopen(const char* filename, int32_t flag) {
#if !defined(_WIN32)
    return (void*)dlopen(filename, flag);
#else
    (void)filename;
    (void)flag;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libcNewQurtDlfcnDlclose(void* handle) {
#if !defined(_WIN32)
    return (int32_t)dlclose(handle);
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

void* libcNewQurtDlfcnDlsym(void* handle, const char* symbol) {
#if !defined(_WIN32)
    return (void*)dlsym(handle, symbol);
#else
    (void)handle;
    (void)symbol;
    errno = ENOSYS;
    return NULL;
#endif
}

char* libcNewQurtDlfcnDlerror(void) {
#if !defined(_WIN32)
    return (char*)dlerror();
#else
    errno = ENOSYS;
    return NULL;
#endif
}

