#include "errno_wrapper.h"
#include <errno.h>

void* libc_errno_errno_location(void) {
    return (void*)&errno;
}
