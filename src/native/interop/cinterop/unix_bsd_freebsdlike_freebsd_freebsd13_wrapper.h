#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent(void);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(void* addr, uint64_t len, int32_t prot);
void libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(void* loc);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, void* policy);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, int32_t policy);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(char* path);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(char* path);
void libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(void* kd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD13_WRAPPER_H */
