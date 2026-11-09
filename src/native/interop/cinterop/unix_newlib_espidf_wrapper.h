#ifndef LIBC_UNIX_NEWLIB_ESPIDF_UNIX_NEWLIB_ESPIDF_WRAPPER_H
#define LIBC_UNIX_NEWLIB_ESPIDF_UNIX_NEWLIB_ESPIDF_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_newlib_espidf_pthreadCreate(void* native, void* attr, void* f, void* value);
int64_t libc_unix_newlib_espidf_getrandom(void* buf, uint64_t buflen, uint32_t flags);
void libc_unix_newlib_espidf_gethostname(char* name, int64_t namelen);
int64_t libc_unix_newlib_espidf_sendmsg(int32_t s, void* msg, int32_t flags);
int64_t libc_unix_newlib_espidf_recvmsg(int32_t s, void* msg, int32_t flags);
int32_t libc_unix_newlib_espidf_eventfd(uint32_t initval, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_ESPIDF_UNIX_NEWLIB_ESPIDF_WRAPPER_H */
