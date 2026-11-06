#include "spawn_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread/spawn.h>
#endif

int32_t libc_spawn_posix_spawnattr_set_qos_class_np(void* attr, int32_t qos_class) {
    return (int32_t)posix_spawnattr_set_qos_class_np(attr, qos_class);
}

int32_t libc_spawn_posix_spawnattr_get_qos_class_np(void* attr, void* qos_class) {
    return (int32_t)posix_spawnattr_get_qos_class_np(attr, qos_class);
}

