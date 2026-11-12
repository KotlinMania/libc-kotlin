#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent(void);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect(void* addr, uint64_t len, int32_t prot);
void libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale(void* loc);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, void* policy);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, int32_t policy);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname(char* path);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename(char* path);
void libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp(void* kd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD15_WRAPPER_H */
