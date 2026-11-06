#ifndef LIBC_TEEOS_MOD_TEEOS_MOD_WRAPPER_H
#define LIBC_TEEOS_MOD_TEEOS_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_teeos_mod_calloc(uint64_t nobj, uint64_t size);
void* libc_teeos_mod_malloc(uint64_t size);
void* libc_teeos_mod_realloc(void* p, uint64_t size);
void* libc_teeos_mod_aligned_alloc(uint64_t align, uint64_t len);
void libc_teeos_mod_free(void* p);
int32_t libc_teeos_mod_posix_memalign(void* memptr, uint64_t align, uint64_t size);
void* libc_teeos_mod_memchr(void* cx, int32_t c, uint64_t n);
void* libc_teeos_mod_wmemchr(void* cx, uint32_t c, uint64_t n);
int32_t libc_teeos_mod_memcmp(void* cx, void* ct, uint64_t n);
void* libc_teeos_mod_memcpy(void* dest, void* src, uint64_t n);
void* libc_teeos_mod_memmove(void* dest, void* src, uint64_t n);
void* libc_teeos_mod_memset(void* dest, int32_t c, uint64_t n);
uint64_t libc_teeos_mod_pthread_self(void);
int32_t libc_teeos_mod_pthread_join(uint64_t native, void* value);
void libc_teeos_mod_pthread_exit(void* value);
int32_t libc_teeos_mod_pthread_attr_init(void* attr);
int32_t libc_teeos_mod_pthread_attr_destroy(void* attr);
int32_t libc_teeos_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_teeos_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size);
int32_t libc_teeos_mod_pthread_attr_getstacksize(void* attr, void* size);
int32_t libc_teeos_mod_pthread_attr_settee(void* attr, int32_t ca, int32_t task_id, int32_t shadow);
int32_t libc_teeos_mod_sched_yield(void);
int32_t libc_teeos_mod_pthread_key_create(void* key, void* dtor);
int32_t libc_teeos_mod_pthread_key_delete(uint32_t key);
void* libc_teeos_mod_pthread_getspecific(uint32_t key);
int32_t libc_teeos_mod_pthread_setspecific(uint32_t key, void* value);
int32_t libc_teeos_mod_pthread_mutex_destroy(void* lock);
int32_t libc_teeos_mod_pthread_mutex_init(void* lock, void* attr);
int32_t libc_teeos_mod_pthread_mutex_lock(void* lock);
int32_t libc_teeos_mod_pthread_mutex_trylock(void* lock);
int32_t libc_teeos_mod_pthread_mutex_unlock(void* lock);
int32_t libc_teeos_mod_pthread_mutexattr_destroy(void* attr);
int32_t libc_teeos_mod_pthread_mutexattr_init(void* attr);
int32_t libc_teeos_mod_pthread_mutexattr_settype(void* attr, int32_t _type);
int32_t libc_teeos_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared);
int32_t libc_teeos_mod_pthread_cond_broadcast(void* cond);
int32_t libc_teeos_mod_pthread_cond_destroy(void* cond);
int32_t libc_teeos_mod_pthread_cond_init(void* cond, void* attr);
int32_t libc_teeos_mod_pthread_cond_signal(void* cond);
int32_t libc_teeos_mod_pthread_cond_wait(void* cond, void* lock);
int32_t libc_teeos_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime);
int32_t libc_teeos_mod_pthread_mutexattr_setrobust(void* attr, int32_t robustness);
int32_t libc_teeos_mod_pthread_create(void* native, void* attr, int32_t f, void* value);
int32_t libc_teeos_mod_pthread_spin_init(void* lock, int32_t pshared);
int32_t libc_teeos_mod_pthread_spin_destroy(void* lock);
int32_t libc_teeos_mod_pthread_spin_lock(void* lock);
int32_t libc_teeos_mod_pthread_spin_trylock(void* lock);
int32_t libc_teeos_mod_pthread_spin_unlock(void* lock);
int32_t libc_teeos_mod_pthread_setschedprio(uint64_t native, int32_t priority);
int32_t libc_teeos_mod_pthread_once(void* pot, void* f);
int32_t libc_teeos_mod_pthread_equal(uint64_t p1, uint64_t p2);
int32_t libc_teeos_mod_pthread_mutexattr_setprotocol(void* a, int32_t protocol);
int32_t libc_teeos_mod_pthread_attr_setstack(void* attr, void* stack, uint64_t size);
int32_t libc_teeos_mod_pthread_setaffinity_np(uint64_t td, uint64_t size, void* set);
int32_t libc_teeos_mod_pthread_getaffinity_np(uint64_t td, uint64_t size, void* set);
int32_t libc_teeos_mod_vsnprintf(char* s, uint64_t n, const char* fmt, char* ap);
int32_t libc_teeos_mod_vsprintf(char* s, const char* fmt, char* ap);
void libc_teeos_mod_abort(void);
int32_t libc_teeos_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int32_t libc_teeos_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset);
int64_t libc_teeos_mod_sysconf(int32_t name);
void* libc_teeos_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset);
int32_t libc_teeos_mod_munmap(void* addr, uint64_t len);
void* libc_teeos_mod_errno_location(void);
char* libc_teeos_mod_strerror(int32_t e);
int32_t libc_teeos_mod_clock_gettime(int32_t clock_id, void* tp);
int32_t libc_teeos_mod_getpid(void);
int32_t libc_teeos_mod_gettimeofday(void* tv, void* tz);
uint64_t libc_teeos_mod_strftime(char* restrict, uint64_t sz, const char* _restrict, void* __restrict);
int64_t libc_teeos_mod_time(void* t);
int32_t libc_teeos_mod_sem_close(void* sem);
int32_t libc_teeos_mod_sem_destroy(void* sem);
int32_t libc_teeos_mod_sem_getvalue(void* sem, void* valp);
int32_t libc_teeos_mod_sem_init(void* sem, int32_t pshared, uint32_t value);
int32_t libc_teeos_mod_sem_post(void* sem);
int32_t libc_teeos_mod_sem_unlink(const char* name);
int32_t libc_teeos_mod_sem_wait(void* sem);
char* libc_teeos_mod_setlocale(int32_t cat, const char* name);
int32_t libc_teeos_mod_strcoll(const char* l, const char* r);
uint64_t libc_teeos_mod_strxfrm(char* dest, const char* src, uint64_t n);
double libc_teeos_mod_strtod(const char* s, void* p);
uint64_t libc_teeos_mod_mbrtowc(void* wc, const char* src, uint64_t n, void* st);
uint64_t libc_teeos_mod_wcrtomb(char* s, uint32_t wc, void* st);
int32_t libc_teeos_mod_wctob(uint32_t c);
void libc_teeos_mod_srandom(uint32_t seed);
char* libc_teeos_mod_initstate(uint32_t seed, char* state, uint64_t size);
char* libc_teeos_mod_setstate(char* state);
int64_t libc_teeos_mod_random(void);
char* libc_teeos_mod_strchr(const char* s, int32_t c);
uint64_t libc_teeos_mod_strlen(const char* cs);
int32_t libc_teeos_mod_strcmp(const char* l, const char* r);
char* libc_teeos_mod_strcpy(char* dest, const char* src);
int32_t libc_teeos_mod_strncmp(const char* _l, const char* r, uint64_t n);
char* libc_teeos_mod_strncpy(char* dest, const char* src, uint64_t n);
uint64_t libc_teeos_mod_strnlen(const char* cs, uint64_t n);
char* libc_teeos_mod_strrchr(const char* s, int32_t c);
char* libc_teeos_mod_strstr(const char* h, const char* n);
void* libc_teeos_mod_wcschr(void* s, uint32_t c);
uint64_t libc_teeos_mod_wcslen(void* s);
int32_t libc_teeos_mod_isalpha(int32_t c);
int32_t libc_teeos_mod_isascii(int32_t c);
int32_t libc_teeos_mod_isdigit(int32_t c);
int32_t libc_teeos_mod_islower(int32_t c);
int32_t libc_teeos_mod_isprint(int32_t c);
int32_t libc_teeos_mod_isspace(int32_t c);
int32_t libc_teeos_mod_iswctype(uint32_t wc, uint64_t ttype);
int32_t libc_teeos_mod_iswdigit(uint32_t wc);
int32_t libc_teeos_mod_iswlower(uint32_t wc);
int32_t libc_teeos_mod_iswspace(uint32_t wc);
int32_t libc_teeos_mod_iswupper(uint32_t wc);
uint32_t libc_teeos_mod_towupper(uint32_t wc);
uint32_t libc_teeos_mod_towlower(uint32_t wc);
double libc_teeos_mod_atan(double x);
double libc_teeos_mod_ceil(double x);
float libc_teeos_mod_ceilf(float x);
double libc_teeos_mod_exp(double x);
double libc_teeos_mod_fabs(double x);
double libc_teeos_mod_floor(double x);
double libc_teeos_mod_frexp(double x, void* e);
double libc_teeos_mod_log(double x);
double libc_teeos_mod_log2(double x);
double libc_teeos_mod_pow(double x, double y);
float libc_teeos_mod_roundf(float x);
double libc_teeos_mod_scalbn(double x, int32_t n);
double libc_teeos_mod_sqrt(double x);
int32_t libc_teeos_mod_abs(int32_t x);
double libc_teeos_mod_atof(const char* s);
int32_t libc_teeos_mod_atoi(const char* s);
int64_t libc_teeos_mod_atol(const char* s);
int64_t libc_teeos_mod_atoll(const char* s);
void* libc_teeos_mod_bsearch(void* key, void* base, uint64_t nel, uint64_t width, int32_t cmp);
int32_t libc_teeos_mod_div(int32_t num, int32_t den);
char* libc_teeos_mod_ecvt(double x, int32_t n, void* dp, void* sign);
int64_t libc_teeos_mod_imaxabs(int64_t a);
int64_t libc_teeos_mod_llabs(int64_t a);
void libc_teeos_mod_qsort(void* base, uint64_t nel, uint64_t width, int32_t cmp);
uint64_t libc_teeos_mod_strtoul(const char* s, void* p, int32_t base);
int64_t libc_teeos_mod_strtol(const char* s, void* p, int32_t base);
double libc_teeos_mod_wcstod(void* s, void* p);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TEEOS_MOD_TEEOS_MOD_WRAPPER_H */
