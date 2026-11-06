#include "b64_mod_wrapper.h"
#include <errno.h>

bool libc_b64_mod_system_property_wait(void* pi, uint32_t __old_serial, void* __new_serial_ptr, void* __relative_timeout) {
    return (bool)__system_property_wait(pi, __old_serial, __new_serial_ptr, __relative_timeout);
}

