#include "freebsd12_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

void libc_freebsd12_mod_setgrent(void) {
    setgrent();
}

int32_t libc_freebsd12_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
#if !defined(_WIN32)
    return (int32_t)mprotect(addr, len, prot);
#else
    (void)addr;
    (void)len;
    (void)prot;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_freebsd12_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int64_t libc_freebsd12_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

char* libc_freebsd12_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_freebsd12_mod_basename(char* path) {
    return (char*)basename(path);
}

void libc_freebsd12_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar) {
    qsort_r@FBSD_1.0(base, num, size, arg, compar);
}

