#ifndef LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H
#define LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_new_netbsd_utmpx_setutxent(void);
void libc_new_netbsd_utmpx_endutxent(void);
void* libc_new_netbsd_utmpx_getutxent(void);
void* libc_new_netbsd_utmpx_getutxid(void* ut);
void* libc_new_netbsd_utmpx_getutxline(void* ut);
void* libc_new_netbsd_utmpx_pututxline(void* ut);
int32_t libc_new_netbsd_utmpx_updwtmpx(const char* file, void* ut);
void* libc_new_netbsd_utmpx_getlastlogx(const char* fname, uint32_t uid, void* ll);
int32_t libc_new_netbsd_utmpx_updlastlogx(const char* fname, uint32_t uid, void* ll);
void libc_new_netbsd_utmpx_getutmp(void* ux, void* u);
void libc_new_netbsd_utmpx_getutmpx(void* u, void* ux);
int32_t libc_new_netbsd_utmpx_utmpxname(const char* file);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_NETBSD_UTMPX_NEW_NETBSD_UTMPX_WRAPPER_H */
