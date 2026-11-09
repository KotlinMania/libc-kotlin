#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_unix_bsd_freebsdlike_freebsd_freebsd14_setgrent(void);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd14_mprotect(void* addr, uint64_t len, int32_t prot);
void libc_unix_bsd_freebsdlike_freebsd_freebsd14_freelocale(void* loc);
int64_t libc_unix_bsd_freebsdlike_freebsd_freebsd14_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetGetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, void* policy);
int32_t libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetSetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, int32_t policy);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd14_dirname(char* path);
char* libc_unix_bsd_freebsdlike_freebsd_freebsd14_basename(char* path);
void libc_unix_bsd_freebsdlike_freebsd_freebsd14_qsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int64_t libc_unix_bsd_freebsdlike_freebsd_freebsd14_kvmKerndisp(void* kd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H */
