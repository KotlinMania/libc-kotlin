#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcUnixBsdFreebsdlikeFreebsdFreebsd12Setgrent(void);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd12Mprotect(void* addr, uint64_t len, int32_t prot);
void libcUnixBsdFreebsdlikeFreebsdFreebsd12Freelocale(void* loc);
int64_t libcUnixBsdFreebsdlikeFreebsdFreebsd12Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd12Dirname(char* path);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd12Basename(char* path);
void libcUnixBsdFreebsdlikeFreebsdFreebsd12QsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD12_WRAPPER_H */
