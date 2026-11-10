#ifndef LIBC_TEEOS_TEEOS_WRAPPER_H
#define LIBC_TEEOS_TEEOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_teeos_calloc(uint64_t nobj, uint64_t size);
void* libc_teeos_malloc(uint64_t size);
void* libc_teeos_realloc(void* p, uint64_t size);
void* libc_teeos_alignedAlloc(uint64_t align, uint64_t len);
void libc_teeos_free(void* p);
int32_t libc_teeos_posixMemalign(void* memptr, uint64_t align, uint64_t size);
void* libc_teeos_memchr(void* cx, int32_t c, uint64_t n);
void* libc_teeos_wmemchr(void* cx, uint32_t c, uint64_t n);
int32_t libc_teeos_memcmp(void* cx, void* ct, uint64_t n);
void* libc_teeos_memcpy(void* dest, void* src, uint64_t n);
void* libc_teeos_memmove(void* dest, void* src, uint64_t n);
void* libc_teeos_memset(void* dest, int32_t c, uint64_t n);
void* libc_teeos_pthreadSelf(void);
int32_t libc_teeos_pthreadJoin(void* native, void* value);
void libc_teeos_pthreadExit(void* value);
int32_t libc_teeos_pthreadAttrInit(void* attr);
int32_t libc_teeos_pthreadAttrDestroy(void* attr);
int32_t libc_teeos_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_teeos_pthreadAttrSetstacksize(void* attr, uint64_t stack_size);
int32_t libc_teeos_pthreadAttrGetstacksize(void* attr, void* size);
int32_t libc_teeos_pthreadAttrSettee(void* attr, int32_t ca, int32_t task_id, int32_t shadow);
int32_t libc_teeos_schedYield(void);
int32_t libc_teeos_pthreadKeyCreate(void* key, void* dtor);
int32_t libc_teeos_pthreadKeyDelete(uint32_t key);
void* libc_teeos_pthreadGetspecific(uint32_t key);
int32_t libc_teeos_pthreadSetspecific(uint32_t key, void* value);
int32_t libc_teeos_pthreadMutexDestroy(void* lock);
int32_t libc_teeos_pthreadMutexInit(void* lock, void* attr);
int32_t libc_teeos_pthreadMutexLock(void* lock);
int32_t libc_teeos_pthreadMutexTrylock(void* lock);
int32_t libc_teeos_pthreadMutexUnlock(void* lock);
int32_t libc_teeos_pthreadMutexattrDestroy(void* attr);
int32_t libc_teeos_pthreadMutexattrInit(void* attr);
int32_t libc_teeos_pthreadMutexattrSettype(void* attr, int32_t arg_1_type);
int32_t libc_teeos_pthreadMutexattrSetpshared(void* attr, int32_t pshared);
int32_t libc_teeos_pthreadCondBroadcast(void* cond);
int32_t libc_teeos_pthreadCondDestroy(void* cond);
int32_t libc_teeos_pthreadCondInit(void* cond, void* attr);
int32_t libc_teeos_pthreadCondSignal(void* cond);
int32_t libc_teeos_pthreadCondWait(void* cond, void* lock);
int32_t libc_teeos_pthreadCondTimedwait(void* cond, void* lock, void* abstime);
int32_t libc_teeos_pthreadMutexattrSetrobust(void* attr, int32_t robustness);
int32_t libc_teeos_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_teeos_pthreadSpinInit(void* lock, int32_t pshared);
int32_t libc_teeos_pthreadSpinDestroy(void* lock);
int32_t libc_teeos_pthreadSpinLock(void* lock);
int32_t libc_teeos_pthreadSpinTrylock(void* lock);
int32_t libc_teeos_pthreadSpinUnlock(void* lock);
int32_t libc_teeos_pthreadSetschedprio(void* native, int32_t priority);
int32_t libc_teeos_pthreadOnce(void* pot, void* f);
int32_t libc_teeos_pthreadEqual(void* p1, void* p2);
int32_t libc_teeos_pthreadMutexattrSetprotocol(void* a, int32_t protocol);
int32_t libc_teeos_pthreadAttrSetstack(void* attr, void* stack, uint64_t size);
int32_t libc_teeos_pthreadSetaffinityNp(void* td, uint64_t size, void* set);
int32_t libc_teeos_pthreadGetaffinityNp(void* td, uint64_t size, void* set);
int32_t libc_teeos_printf(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_teeos_scanf(const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_teeos_snprintf(char* s, uint64_t n, const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_teeos_sprintf(char* s, const char* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_teeos_vsnprintf(char* s, uint64_t n, const char* fmt, char* ap);
int32_t libc_teeos_vsprintf(char* s, const char* fmt, char* ap);
void libc_teeos_abort(void);
int32_t libc_teeos_schedGetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_teeos_schedSetaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int64_t libc_teeos_sysconf(int32_t name);
void* libc_teeos_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_teeos_munmap(void* addr, uint64_t len);
void* libc_teeos_errnoLocation(void);
char* libc_teeos_strerror(int32_t e);
int32_t libc_teeos_clockGettime(int32_t clock_id, void* tp);
int32_t libc_teeos_getpid(void);
int32_t libc_teeos_gettimeofday(void* tv, void* tz);
uint64_t libc_teeos_strftime(char* arg_0_restrict, uint64_t sz, const char* arg_2_restrict, void* arg_3_restrict);
int64_t libc_teeos_time(void* t);
int32_t libc_teeos_semClose(void* sem);
int32_t libc_teeos_semDestroy(void* sem);
int32_t libc_teeos_semGetvalue(void* sem, void* valp);
int32_t libc_teeos_semInit(void* sem, int32_t pshared, uint32_t value);
void* libc_teeos_semOpen(const char* name, int32_t flags, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libc_teeos_semPost(void* sem);
int32_t libc_teeos_semUnlink(const char* name);
int32_t libc_teeos_semWait(void* sem);
char* libc_teeos_setlocale(int32_t cat, const char* name);
int32_t libc_teeos_strcoll(const char* l, const char* r);
uint64_t libc_teeos_strxfrm(char* dest, const char* src, uint64_t n);
double libc_teeos_strtod(const char* s, void* p);
uint64_t libc_teeos_mbrtowc(void* wc, const char* src, uint64_t n, void* st);
uint64_t libc_teeos_wcrtomb(char* s, uint32_t wc, void* st);
int32_t libc_teeos_wctob(uint32_t c);
void libc_teeos_srandom(uint32_t seed);
char* libc_teeos_initstate(uint32_t seed, char* state, uint64_t size);
char* libc_teeos_setstate(char* state);
int64_t libc_teeos_random(void);
char* libc_teeos_strchr(const char* s, int32_t c);
uint64_t libc_teeos_strlen(const char* cs);
int32_t libc_teeos_strcmp(const char* l, const char* r);
char* libc_teeos_strcpy(char* dest, const char* src);
int32_t libc_teeos_strncmp(const char* arg_0_l, const char* r, uint64_t n);
char* libc_teeos_strncpy(char* dest, const char* src, uint64_t n);
uint64_t libc_teeos_strnlen(const char* cs, uint64_t n);
char* libc_teeos_strrchr(const char* s, int32_t c);
char* libc_teeos_strstr(const char* h, const char* n);
void* libc_teeos_wcschr(void* s, uint32_t c);
uint64_t libc_teeos_wcslen(void* s);
int32_t libc_teeos_isalpha(int32_t c);
int32_t libc_teeos_isascii(int32_t c);
int32_t libc_teeos_isdigit(int32_t c);
int32_t libc_teeos_islower(int32_t c);
int32_t libc_teeos_isprint(int32_t c);
int32_t libc_teeos_isspace(int32_t c);
int32_t libc_teeos_iswctype(uint32_t wc, uint64_t ttype);
int32_t libc_teeos_iswdigit(uint32_t wc);
int32_t libc_teeos_iswlower(uint32_t wc);
int32_t libc_teeos_iswspace(uint32_t wc);
int32_t libc_teeos_iswupper(uint32_t wc);
uint32_t libc_teeos_towupper(uint32_t wc);
uint32_t libc_teeos_towlower(uint32_t wc);
double libc_teeos_atan(double x);
double libc_teeos_ceil(double x);
float libc_teeos_ceilf(float x);
double libc_teeos_exp(double x);
double libc_teeos_fabs(double x);
double libc_teeos_floor(double x);
double libc_teeos_frexp(double x, void* e);
double libc_teeos_log(double x);
double libc_teeos_log2(double x);
double libc_teeos_pow(double x, double y);
float libc_teeos_roundf(float x);
double libc_teeos_scalbn(double x, int32_t n);
double libc_teeos_sqrt(double x);
int32_t libc_teeos_abs(int32_t x);
double libc_teeos_atof(const char* s);
int32_t libc_teeos_atoi(const char* s);
int64_t libc_teeos_atol(const char* s);
int64_t libc_teeos_atoll(const char* s);
void* libc_teeos_bsearch(void* key, void* base, uint64_t nel, uint64_t width, void* cmp);
char* libc_teeos_ecvt(double x, int32_t n, void* dp, void* sign);
int64_t libc_teeos_imaxabs(int64_t a);
int64_t libc_teeos_llabs(int64_t a);
void libc_teeos_qsort(void* base, uint64_t nel, uint64_t width, void* cmp);
uint64_t libc_teeos_strtoul(const char* s, void* p, int32_t base);
int64_t libc_teeos_strtol(const char* s, void* p, int32_t base);
double libc_teeos_wcstod(void* s, void* p);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TEEOS_TEEOS_WRAPPER_H */
