#ifndef LIBC_FREEBSD12_MOD_FREEBSD12_MOD_WRAPPER_H
#define LIBC_FREEBSD12_MOD_FREEBSD12_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_freebsd12_mod_setgrent(void);
int32_t libc_freebsd12_mod_mprotect(void* addr, uint64_t len, int32_t prot);
void libc_freebsd12_mod_freelocale(int32_t loc);
int64_t libc_freebsd12_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
char* libc_freebsd12_mod_dirname(char* path);
char* libc_freebsd12_mod_basename(char* path);
void libc_freebsd12_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_FREEBSD12_MOD_FREEBSD12_MOD_WRAPPER_H */
