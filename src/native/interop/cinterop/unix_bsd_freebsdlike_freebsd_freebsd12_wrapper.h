#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_unix_bsd_freebsdlike_freebsd_freebsd12_setgrent(void);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd12_mprotect(void* addr, uint64_t len, int32_t prot);
void libc_unix_bsd_freebsdlike_freebsd_freebsd12_freelocale(void* loc);
int64_t libc_unix_bsd_freebsdlike_freebsd_freebsd12_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd12_dirname(char* path);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd12_basename(char* path);
void libc_unix_bsd_freebsdlike_freebsd_freebsd12_qsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H */
