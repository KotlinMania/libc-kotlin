#ifndef LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H
#define LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent(void);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(void* loc);
int32_t libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(const char* path);
char* libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(const char* path);
void libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_UNIX_BSD_FREEBSDLIKE_FREEBSD_FREEBSD11_WRAPPER_H */
