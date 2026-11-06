#ifndef LIBC_FREEBSD11_MOD_FREEBSD11_MOD_WRAPPER_H
#define LIBC_FREEBSD11_MOD_FREEBSD11_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_freebsd11_mod_setgrent(void);
int32_t libc_freebsd11_mod_mprotect(void* addr, uint64_t len, int32_t prot);
int32_t libc_freebsd11_mod_freelocale(int32_t loc);
int32_t libc_freebsd11_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libc_freebsd11_mod_dirname(const char* path);
char* libc_freebsd11_mod_basename(const char* path);
void libc_freebsd11_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_FREEBSD11_MOD_FREEBSD11_MOD_WRAPPER_H */
