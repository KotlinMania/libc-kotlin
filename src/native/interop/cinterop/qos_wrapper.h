#ifndef LIBC_QOS_QOS_WRAPPER_H
#define LIBC_QOS_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_qos_pthread_attr_set_qos_class_np(void* attr, int32_t class, int32_t priority);
int32_t libc_qos_pthread_attr_get_qos_class_np(void* attr, void* class, void* priority);
int32_t libc_qos_pthread_set_qos_class_self_np(int32_t class, int32_t priority);
int32_t libc_qos_pthread_get_qos_class_np(int32_t thread, void* class, void* priority);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_QOS_QOS_WRAPPER_H */
