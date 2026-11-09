#ifndef LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H
#define LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_unix_nuttx_errno(void);
int32_t libc_unix_nuttx_bind(int32_t sockfd, void* addr, uint32_t addrlen);
int32_t libc_unix_nuttx_dirfd(void* dirp);
int32_t libc_unix_nuttx_recvfrom(int32_t sockfd, void* buf, uint64_t len, int32_t flags, void* src_addr, void* addrlen);
int32_t libc_unix_nuttx_pthreadCreate(void* thread, void* attr, void* start_routine, void* arg);
int32_t libc_unix_nuttx_clockGettime(int32_t clockid, void* tp);
int32_t libc_unix_nuttx_futimens(int32_t fd, void* times);
int32_t libc_unix_nuttx_pthreadCondattrSetclock(void* attr, int32_t clock_id);
int32_t libc_unix_nuttx_pthreadSetnameNp(void* thread, const char* name);
int32_t libc_unix_nuttx_pthreadGetnameNp(void* thread, char* name, uint64_t len);
int64_t libc_unix_nuttx_getrandom(void* buf, uint64_t buflen, uint32_t flags);
uint32_t libc_unix_nuttx_arc4random(void);
void libc_unix_nuttx_arc4randomBuf(void* bytes, uint64_t nbytes);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NUTTX_UNIX_NUTTX_WRAPPER_H */
