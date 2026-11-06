#include "errno_wrapper.h"
#include <errno.h>

void* libc_errno_errno_location(void) {
#if defined(__APPLE__)
    return (void*)__error();
#elif defined(__linux__)
    return (void*)__errno_location();
#else
    errno = ENOSYS;
    return NULL;
#endif
}
