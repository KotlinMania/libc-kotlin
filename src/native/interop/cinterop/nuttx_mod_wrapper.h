#ifndef LIBC_NUTTX_MOD_NUTTX_MOD_WRAPPER_H
#define LIBC_NUTTX_MOD_NUTTX_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_nuttx_mod_errno(void);
int32_t libc_nuttx_mod_bind(int32_t sockfd, void* addr, uint32_t addrlen);
int32_t libc_nuttx_mod_dirfd(void* dirp);
int32_t libc_nuttx_mod_recvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* src_addr, void* addrlen);
int32_t libc_nuttx_mod_pthread_create(void* thread, void* attr, int32_t start_routine, void* arg);
int32_t libc_nuttx_mod_clock_gettime(int32_t clockid, void* tp);
int32_t libc_nuttx_mod_futimens(int32_t fd, void* times);
int32_t libc_nuttx_mod_pthread_condattr_setclock(void* attr, int32_t clock_id);
int32_t libc_nuttx_mod_pthread_setname_np(int32_t thread, const char* name);
int32_t libc_nuttx_mod_pthread_getname_np(int32_t thread, char* name, uint64_t len);
int64_t libc_nuttx_mod_getrandom(void* buf, uint64_t buflen, uint32_t flags);
uint32_t libc_nuttx_mod_arc4random(void);
void libc_nuttx_mod_arc4random_buf(void* bytes, uint64_t nbytes);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NUTTX_MOD_NUTTX_MOD_WRAPPER_H */
