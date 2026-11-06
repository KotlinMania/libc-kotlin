#ifndef LIBC_ESPIDF_MOD_ESPIDF_MOD_WRAPPER_H
#define LIBC_ESPIDF_MOD_ESPIDF_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_espidf_mod_pthread_create(void* native, void* attr, int32_t f, void* value);
int64_t libc_espidf_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags);
void libc_espidf_mod_gethostname(char* name, int64_t namelen);
int64_t libc_espidf_mod_sendmsg(int32_t s, void* msg, int32_t flags);
int64_t libc_espidf_mod_recvmsg(int32_t s, void* msg, int32_t flags);
int32_t libc_espidf_mod_eventfd(uint32_t initval, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_ESPIDF_MOD_ESPIDF_MOD_WRAPPER_H */
