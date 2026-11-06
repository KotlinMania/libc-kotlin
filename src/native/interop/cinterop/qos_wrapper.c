#include "qos_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <pthread/qos.h>
#endif

int32_t libc_qos_pthread_attr_set_qos_class_np(void* attr, int32_t class, int32_t priority) {
    return (int32_t)pthread_attr_set_qos_class_np(attr, class, priority);
}

int32_t libc_qos_pthread_attr_get_qos_class_np(void* attr, void* class, void* priority) {
    return (int32_t)pthread_attr_get_qos_class_np(attr, class, priority);
}

int32_t libc_qos_pthread_set_qos_class_self_np(int32_t class, int32_t priority) {
    return (int32_t)pthread_set_qos_class_self_np(class, priority);
}

int32_t libc_qos_pthread_get_qos_class_np(int32_t thread, void* class, void* priority) {
    return (int32_t)pthread_get_qos_class_np(thread, class, priority);
}

