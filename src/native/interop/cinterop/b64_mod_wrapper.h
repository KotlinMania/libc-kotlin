#ifndef LIBC_B64_MOD_B64_MOD_WRAPPER_H
#define LIBC_B64_MOD_B64_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

bool libc_b64_mod_system_property_wait(void* pi, uint32_t __old_serial, void* __new_serial_ptr, void* __relative_timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_B64_MOD_B64_MOD_WRAPPER_H */
