#ifndef LIBC_TEEOS_TEEOS_WRAPPER_H
#define LIBC_TEEOS_TEEOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcTeeosCalloc(uint64_t nobj, uint64_t size);
void* libcTeeosMalloc(uint64_t size);
void* libcTeeosRealloc(void* p, uint64_t size);
void* libcTeeosAlignedAlloc(uint64_t align, uint64_t len);
void libcTeeosFree(void* p);
int32_t libcTeeosPosixMemalign(void* memptr, uint64_t align, uint64_t size);
void* libcTeeosMemchr(void* cx, int32_t c, uint64_t n);
void* libcTeeosWmemchr(void* cx, uint32_t c, uint64_t n);
int32_t libcTeeosMemcmp(void* cx, void* ct, uint64_t n);
void* libcTeeosMemcpy(void* dest, void* src, uint64_t n);
void* libcTeeosMemmove(void* dest, void* src, uint64_t n);
void* libcTeeosMemset(void* dest, int32_t c, uint64_t n);
void* libcTeeosPthreadSelf(void);
int32_t libcTeeosPthreadJoin(void* native, void* value);
void libcTeeosPthreadExit(void* value);
int32_t libcTeeosPthreadAttrInit(void* attr);
int32_t libcTeeosPthreadAttrDestroy(void* attr);
int32_t libcTeeosPthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libcTeeosPthreadAttrSetstacksize(void* attr, uint64_t stackSize);
int32_t libcTeeosPthreadAttrGetstacksize(void* attr, void* size);
int32_t libcTeeosPthreadAttrSettee(void* attr, int32_t ca, int32_t taskId, int32_t shadow);
int32_t libcTeeosSchedYield(void);
int32_t libcTeeosPthreadKeyCreate(void* key, void* dtor);
int32_t libcTeeosPthreadKeyDelete(uint32_t key);
void* libcTeeosPthreadGetspecific(uint32_t key);
int32_t libcTeeosPthreadSetspecific(uint32_t key, void* value);
int32_t libcTeeosPthreadMutexDestroy(void* lock);
int32_t libcTeeosPthreadMutexInit(void* lock, void* attr);
int32_t libcTeeosPthreadMutexLock(void* lock);
int32_t libcTeeosPthreadMutexTrylock(void* lock);
int32_t libcTeeosPthreadMutexUnlock(void* lock);
int32_t libcTeeosPthreadMutexattrDestroy(void* attr);
int32_t libcTeeosPthreadMutexattrInit(void* attr);
int32_t libcTeeosPthreadMutexattrSettype(void* attr, int32_t type);
int32_t libcTeeosPthreadMutexattrSetpshared(void* attr, int32_t pshared);
int32_t libcTeeosPthreadCondBroadcast(void* cond);
int32_t libcTeeosPthreadCondDestroy(void* cond);
int32_t libcTeeosPthreadCondInit(void* cond, void* attr);
int32_t libcTeeosPthreadCondSignal(void* cond);
int32_t libcTeeosPthreadCondWait(void* cond, void* lock);
int32_t libcTeeosPthreadCondTimedwait(void* cond, void* lock, void* abstime);
int32_t libcTeeosPthreadMutexattrSetrobust(void* attr, int32_t robustness);
int32_t libcTeeosPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcTeeosPthreadSpinInit(void* lock, int32_t pshared);
int32_t libcTeeosPthreadSpinDestroy(void* lock);
int32_t libcTeeosPthreadSpinLock(void* lock);
int32_t libcTeeosPthreadSpinTrylock(void* lock);
int32_t libcTeeosPthreadSpinUnlock(void* lock);
int32_t libcTeeosPthreadSetschedprio(void* native, int32_t priority);
int32_t libcTeeosPthreadOnce(void* pot, void* f);
int32_t libcTeeosPthreadEqual(void* p1, void* p2);
int32_t libcTeeosPthreadMutexattrSetprotocol(void* a, int32_t protocol);
int32_t libcTeeosPthreadAttrSetstack(void* attr, void* stack, uint64_t size);
int32_t libcTeeosPthreadSetaffinityNp(void* td, uint64_t size, void* set);
int32_t libcTeeosPthreadGetaffinityNp(void* td, uint64_t size, void* set);
int32_t libcTeeosPrintf(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcTeeosScanf(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcTeeosSnprintf(char* s, uint64_t n, const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcTeeosSprintf(char* s, const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcTeeosVsnprintf(char* s, uint64_t n, const char* fmt, char* ap);
int32_t libcTeeosVsprintf(char* s, const char* fmt, char* ap);
void libcTeeosAbort(void);
int32_t libcTeeosSchedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libcTeeosSchedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int64_t libcTeeosSysconf(int32_t name);
void* libcTeeosMmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libcTeeosMunmap(void* addr, uint64_t len);
void* libcTeeosErrnoLocation(void);
char* libcTeeosStrerror(int32_t e);
int32_t libcTeeosClockGettime(int32_t clockId, void* tp);
int32_t libcTeeosGetpid(void);
int32_t libcTeeosGettimeofday(void* tv, void* tz);
uint64_t libcTeeosStrftime(char* arg0Restrict, uint64_t sz, const char* arg2Restrict, void* arg3Restrict);
int64_t libcTeeosTime(void* t);
int32_t libcTeeosSemClose(void* sem);
int32_t libcTeeosSemDestroy(void* sem);
int32_t libcTeeosSemGetvalue(void* sem, void* valp);
int32_t libcTeeosSemInit(void* sem, int32_t pshared, uint32_t value);
void* libcTeeosSemOpen(const char* name, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcTeeosSemPost(void* sem);
int32_t libcTeeosSemUnlink(const char* name);
int32_t libcTeeosSemWait(void* sem);
char* libcTeeosSetlocale(int32_t cat, const char* name);
int32_t libcTeeosStrcoll(const char* l, const char* r);
uint64_t libcTeeosStrxfrm(char* dest, const char* src, uint64_t n);
double libcTeeosStrtod(const char* s, void* p);
uint64_t libcTeeosMbrtowc(void* wc, const char* src, uint64_t n, void* st);
uint64_t libcTeeosWcrtomb(char* s, uint32_t wc, void* st);
int32_t libcTeeosWctob(uint32_t c);
void libcTeeosSrandom(uint32_t seed);
char* libcTeeosInitstate(uint32_t seed, char* state, uint64_t size);
char* libcTeeosSetstate(char* state);
int64_t libcTeeosRandom(void);
char* libcTeeosStrchr(const char* s, int32_t c);
uint64_t libcTeeosStrlen(const char* cs);
int32_t libcTeeosStrcmp(const char* l, const char* r);
char* libcTeeosStrcpy(char* dest, const char* src);
int32_t libcTeeosStrncmp(const char* l, const char* r, uint64_t n);
char* libcTeeosStrncpy(char* dest, const char* src, uint64_t n);
uint64_t libcTeeosStrnlen(const char* cs, uint64_t n);
char* libcTeeosStrrchr(const char* s, int32_t c);
char* libcTeeosStrstr(const char* h, const char* n);
void* libcTeeosWcschr(void* s, uint32_t c);
uint64_t libcTeeosWcslen(void* s);
int32_t libcTeeosIsalpha(int32_t c);
int32_t libcTeeosIsascii(int32_t c);
int32_t libcTeeosIsdigit(int32_t c);
int32_t libcTeeosIslower(int32_t c);
int32_t libcTeeosIsprint(int32_t c);
int32_t libcTeeosIsspace(int32_t c);
int32_t libcTeeosIswctype(uint32_t wc, uint64_t ttype);
int32_t libcTeeosIswdigit(uint32_t wc);
int32_t libcTeeosIswlower(uint32_t wc);
int32_t libcTeeosIswspace(uint32_t wc);
int32_t libcTeeosIswupper(uint32_t wc);
uint32_t libcTeeosTowupper(uint32_t wc);
uint32_t libcTeeosTowlower(uint32_t wc);
double libcTeeosAtan(double x);
double libcTeeosCeil(double x);
float libcTeeosCeilf(float x);
double libcTeeosExp(double x);
double libcTeeosFabs(double x);
double libcTeeosFloor(double x);
double libcTeeosFrexp(double x, void* e);
double libcTeeosLog(double x);
double libcTeeosLog2(double x);
double libcTeeosPow(double x, double y);
float libcTeeosRoundf(float x);
double libcTeeosScalbn(double x, int32_t n);
double libcTeeosSqrt(double x);
int32_t libcTeeosAbs(int32_t x);
double libcTeeosAtof(const char* s);
int32_t libcTeeosAtoi(const char* s);
int64_t libcTeeosAtol(const char* s);
int64_t libcTeeosAtoll(const char* s);
void* libcTeeosBsearch(void* key, void* base, uint64_t nel, uint64_t width, void* cmp);
char* libcTeeosEcvt(double x, int32_t n, void* dp, void* sign);
int64_t libcTeeosImaxabs(int64_t a);
int64_t libcTeeosLlabs(int64_t a);
void libcTeeosQsort(void* base, uint64_t nel, uint64_t width, void* cmp);
uint64_t libcTeeosStrtoul(const char* s, void* p, int32_t base);
int64_t libcTeeosStrtol(const char* s, void* p, int32_t base);
double libcTeeosWcstod(void* s, void* p);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TEEOS_TEEOS_WRAPPER_H */
