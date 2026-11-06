#ifndef LIBC_SPAWN_SPAWN_WRAPPER_H
#define LIBC_SPAWN_SPAWN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_spawn_posix_spawnattr_set_qos_class_np(void* attr, int32_t qos_class);
int32_t libc_spawn_posix_spawnattr_get_qos_class_np(void* attr, void* qos_class);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_SPAWN_SPAWN_WRAPPER_H */
