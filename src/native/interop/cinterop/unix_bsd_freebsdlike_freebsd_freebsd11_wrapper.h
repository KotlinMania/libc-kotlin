#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent(void);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale(void* loc);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(const char* path);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(const char* path);
void libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H */
