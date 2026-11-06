#include "freebsd11_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

int32_t libc_freebsd11_mod_setgrent(void) {
    return (int32_t)setgrent();
}

int32_t libc_freebsd11_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_freebsd11_mod_freelocale(int32_t loc) {
    return (int32_t)freelocale(loc);
}

int32_t libc_freebsd11_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int32_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

char* libc_freebsd11_mod_dirname(const char* path) {
    return (char*)dirname(path);
}

char* libc_freebsd11_mod_basename(const char* path) {
    return (char*)basename(path);
}

void libc_freebsd11_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* arg, void* compar) {
    qsort_r@FBSD_1.0(base, num, size, arg, compar);
}

