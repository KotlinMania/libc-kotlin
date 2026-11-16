#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent(void);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect(void* addr, uint64_t len, int32_t prot);
void libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale(void* loc);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, void* policy);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain(int32_t level, int32_t which, int64_t id, uint64_t setsize, void* mask, int32_t policy);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname(char* path);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename(char* path);
void libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR(void* base, uint64_t num, uint64_t size, void* compar, void* arg);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp(void* kd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD14_WRAPPER_H */
