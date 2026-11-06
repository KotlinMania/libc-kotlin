#ifndef LIBC_FREEBSD13_MOD_FREEBSD13_MOD_WRAPPER_H
#define LIBC_FREEBSD13_MOD_FREEBSD13_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void libc_freebsd13_mod_setgrent(void);
int32_t libc_freebsd13_mod_mprotect(void* addr, uint64_t len, int32_t prot);
void libc_freebsd13_mod_freelocale(int32_t loc);
int64_t libc_freebsd13_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg);
int32_t libc_freebsd13_mod_cpuset_getdomain(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask, void* policy);
int32_t libc_freebsd13_mod_cpuset_setdomain(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask, int32_t policy);
char* libc_freebsd13_mod_dirname(char* path);
char* libc_freebsd13_mod_basename(char* path);
void libc_freebsd13_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar);
int64_t libc_freebsd13_mod_kvm_kerndisp(void* kd);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_FREEBSD13_MOD_FREEBSD13_MOD_WRAPPER_H */
