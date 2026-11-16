#ifndef LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H
#define LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libcNewNetbsdUtmpxSetutxent(void);
void libcNewNetbsdUtmpxEndutxent(void);
void* libcNewNetbsdUtmpxGetutxent(void);
void* libcNewNetbsdUtmpxGetutxid(void* ut);
void* libcNewNetbsdUtmpxGetutxline(void* ut);
void* libcNewNetbsdUtmpxPututxline(void* ut);
int32_t libcNewNetbsdUtmpxUpdwtmpx(const char* file, void* ut);
void* libcNewNetbsdUtmpxGetlastlogx(const char* fname, uint32_t uid, void* ll);
int32_t libcNewNetbsdUtmpxUpdlastlogx(const char* fname, uint32_t uid, void* ll);
void libcNewNetbsdUtmpxGetutmp(void* ux, void* u);
void libcNewNetbsdUtmpxGetutmpx(void* u, void* ux);
int32_t libcNewNetbsdUtmpxUtmpxname(const char* file);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H */
