#include "utmpx_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <utmpx.h>
#endif

void libc_utmpx_setutxent(void) {
    setutxent();
}

void libc_utmpx_endutxent(void) {
    endutxent();
}

void* libc_utmpx_getutxent(void) {
    return (void*)__getutxent50();
}

void* libc_utmpx_getutxid(void* ut) {
    return (void*)__getutxid50(ut);
}

void* libc_utmpx_getutxline(void* ut) {
    return (void*)__getutxline50(ut);
}

void* libc_utmpx_pututxline(void* ut) {
    return (void*)__pututxline50(ut);
}

int32_t libc_utmpx_updwtmpx(const char* file, void* ut) {
    return (int32_t)__updwtmpx50(file, ut);
}

void* libc_utmpx_getlastlogx(const char* fname, uint32_t uid, void* ll) {
    return (void*)__getlastlogx50(fname, uid, ll);
}

int32_t libc_utmpx_updlastlogx(const char* fname, uint32_t uid, void* ll) {
    return (int32_t)__updlastlogx50(fname, uid, ll);
}

void libc_utmpx_getutmp(void* ux, void* u) {
    __getutmp50(ux, u);
}

void libc_utmpx_getutmpx(void* u, void* ux) {
    __getutmpx50(u, ux);
}

int32_t libc_utmpx_utmpxname(const char* file) {
    return (int32_t)utmpxname(file);
}

