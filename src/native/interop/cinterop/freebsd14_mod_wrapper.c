#include "freebsd14_mod_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <sys/mman.h>
#endif

void libc_freebsd14_mod_setgrent(void) {
    setgrent();
}

int32_t libc_freebsd14_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

void libc_freebsd14_mod_freelocale(int32_t loc) {
    freelocale(loc);
}

int64_t libc_freebsd14_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

int32_t libc_freebsd14_mod_cpuset_getdomain(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask, void* policy) {
    return (int32_t)cpuset_getdomain(level, which, id, setsize, mask, policy);
}

int32_t libc_freebsd14_mod_cpuset_setdomain(int32_t level, int32_t which, int32_t id, uint64_t setsize, void* mask, int32_t policy) {
    return (int32_t)cpuset_setdomain(level, which, id, setsize, mask, policy);
}

char* libc_freebsd14_mod_dirname(char* path) {
    return (char*)dirname(path);
}

char* libc_freebsd14_mod_basename(char* path) {
    return (char*)basename(path);
}

void libc_freebsd14_mod_qsort_r(void* base, uint64_t num, uint64_t size, void* compar, void* arg) {
    qsort_r(base, num, size, compar, arg);
}

int64_t libc_freebsd14_mod_kvm_kerndisp(void* kd) {
    return (int64_t)kvm_kerndisp(kd);
}

