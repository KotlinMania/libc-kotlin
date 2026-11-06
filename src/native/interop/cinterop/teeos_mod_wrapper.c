#include "teeos_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>
#include <ctype.h>
#include <math.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <pthread.h>
#include <unistd.h>
#include <sys/mman.h>
#include <semaphore.h>
#endif

void* libc_teeos_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_teeos_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_teeos_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void* libc_teeos_mod_aligned_alloc(uint64_t align, uint64_t len) {
    return (void*)aligned_alloc(align, len);
}

void libc_teeos_mod_free(void* p) {
    free(p);
}

int32_t libc_teeos_mod_posix_memalign(void* memptr, uint64_t align, uint64_t size) {
    return (int32_t)posix_memalign(memptr, align, size);
}

void* libc_teeos_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

void* libc_teeos_mod_wmemchr(void* cx, uint32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

int32_t libc_teeos_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_teeos_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_teeos_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_teeos_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

uint64_t libc_teeos_mod_pthread_self(void) {
#if !defined(_WIN32)
    return (uint64_t)pthread_self();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_teeos_mod_pthread_join(uint64_t native, void* value) {
#if !defined(_WIN32)
    return (int32_t)pthread_join(native, value);
#else
    (void)native;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_teeos_mod_pthread_exit(void* value) {
    pthread_exit(value);
}

int32_t libc_teeos_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_teeos_mod_pthread_attr_destroy(void* attr) {
    return (int32_t)pthread_attr_destroy(attr);
}

int32_t libc_teeos_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_teeos_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size) {
    return (int32_t)pthread_attr_setstacksize(attr, stack_size);
}

int32_t libc_teeos_mod_pthread_attr_getstacksize(void* attr, void* size) {
    return (int32_t)pthread_attr_getstacksize(attr, size);
}

int32_t libc_teeos_mod_pthread_attr_settee(void* attr, int32_t ca, int32_t task_id, int32_t shadow) {
    return (int32_t)pthread_attr_settee(attr, ca, task_id, shadow);
}

int32_t libc_teeos_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_teeos_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_teeos_mod_pthread_key_delete(uint32_t key) {
    return (int32_t)pthread_key_delete(key);
}

void* libc_teeos_mod_pthread_getspecific(uint32_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_teeos_mod_pthread_setspecific(uint32_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

int32_t libc_teeos_mod_pthread_mutex_destroy(void* lock) {
    return (int32_t)pthread_mutex_destroy(lock);
}

int32_t libc_teeos_mod_pthread_mutex_init(void* lock, void* attr) {
    return (int32_t)pthread_mutex_init(lock, attr);
}

int32_t libc_teeos_mod_pthread_mutex_lock(void* lock) {
    return (int32_t)pthread_mutex_lock(lock);
}

int32_t libc_teeos_mod_pthread_mutex_trylock(void* lock) {
    return (int32_t)pthread_mutex_trylock(lock);
}

int32_t libc_teeos_mod_pthread_mutex_unlock(void* lock) {
    return (int32_t)pthread_mutex_unlock(lock);
}

int32_t libc_teeos_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_teeos_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_teeos_mod_pthread_mutexattr_settype(void* attr, int32_t _type) {
    return (int32_t)pthread_mutexattr_settype(attr, _type);
}

int32_t libc_teeos_mod_pthread_mutexattr_setpshared(void* attr, int32_t pshared) {
    return (int32_t)pthread_mutexattr_setpshared(attr, pshared);
}

int32_t libc_teeos_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_teeos_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_teeos_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_teeos_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_teeos_mod_pthread_cond_wait(void* cond, void* lock) {
    return (int32_t)pthread_cond_wait(cond, lock);
}

int32_t libc_teeos_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, lock, abstime);
}

int32_t libc_teeos_mod_pthread_mutexattr_setrobust(void* attr, int32_t robustness) {
    return (int32_t)pthread_mutexattr_setrobust(attr, robustness);
}

int32_t libc_teeos_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_teeos_mod_pthread_spin_init(void* lock, int32_t pshared) {
    return (int32_t)pthread_spin_init(lock, pshared);
}

int32_t libc_teeos_mod_pthread_spin_destroy(void* lock) {
    return (int32_t)pthread_spin_destroy(lock);
}

int32_t libc_teeos_mod_pthread_spin_lock(void* lock) {
    return (int32_t)pthread_spin_lock(lock);
}

int32_t libc_teeos_mod_pthread_spin_trylock(void* lock) {
    return (int32_t)pthread_spin_trylock(lock);
}

int32_t libc_teeos_mod_pthread_spin_unlock(void* lock) {
    return (int32_t)pthread_spin_unlock(lock);
}

int32_t libc_teeos_mod_pthread_setschedprio(uint64_t native, int32_t priority) {
    return (int32_t)pthread_setschedprio(native, priority);
}

int32_t libc_teeos_mod_pthread_once(void* pot, void* f) {
    return (int32_t)pthread_once(pot, f);
}

int32_t libc_teeos_mod_pthread_equal(uint64_t p1, uint64_t p2) {
#if !defined(_WIN32)
    return (int32_t)pthread_equal(p1, p2);
#else
    (void)p1;
    (void)p2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_teeos_mod_pthread_mutexattr_setprotocol(void* a, int32_t protocol) {
    return (int32_t)pthread_mutexattr_setprotocol(a, protocol);
}

int32_t libc_teeos_mod_pthread_attr_setstack(void* attr, void* stack, uint64_t size) {
    return (int32_t)pthread_attr_setstack(attr, stack, size);
}

int32_t libc_teeos_mod_pthread_setaffinity_np(uint64_t td, uint64_t size, void* set) {
    return (int32_t)pthread_setaffinity_np(td, size, set);
}

int32_t libc_teeos_mod_pthread_getaffinity_np(uint64_t td, uint64_t size, void* set) {
    return (int32_t)pthread_getaffinity_np(td, size, set);
}

int32_t libc_teeos_mod_vsnprintf(char* s, uint64_t n, const char* fmt, char* ap) {
    return (int32_t)vsnprintf(s, n, fmt, ap);
}

int32_t libc_teeos_mod_vsprintf(char* s, const char* fmt, char* ap) {
    return (int32_t)vsprintf(s, fmt, ap);
}

void libc_teeos_mod_abort(void) {
    abort();
}

int32_t libc_teeos_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_teeos_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, cpuset);
}

int64_t libc_teeos_mod_sysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

void* libc_teeos_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
#if !defined(_WIN32)
    return (void*)mmap(addr, len, prot, flags, fd, offset);
#else
    (void)addr;
    (void)len;
    (void)prot;
    (void)flags;
    (void)fd;
    (void)offset;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_teeos_mod_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

void* libc_teeos_mod_errno_location(void) {
    return (void*)__errno_location();
}

char* libc_teeos_mod_strerror(int32_t e) {
    return (char*)strerror(e);
}

int32_t libc_teeos_mod_clock_gettime(int32_t clock_id, void* tp) {
    return (int32_t)clock_gettime(clock_id, tp);
}

int32_t libc_teeos_mod_getpid(void) {
    return (int32_t)getpid();
}

int32_t libc_teeos_mod_gettimeofday(void* tv, void* tz) {
    return (int32_t)gettimeofday(tv, tz);
}

uint64_t libc_teeos_mod_strftime(char* restrict, uint64_t sz, const char* _restrict, void* __restrict) {
    return (uint64_t)strftime(restrict, sz, _restrict, __restrict);
}

int64_t libc_teeos_mod_time(void* t) {
    return (int64_t)time(t);
}

int32_t libc_teeos_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_teeos_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_teeos_mod_sem_getvalue(void* sem, void* valp) {
    return (int32_t)sem_getvalue(sem, valp);
}

int32_t libc_teeos_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
#if !defined(_WIN32)
    return (int32_t)sem_init(sem, pshared, value);
#else
    (void)sem;
    (void)pshared;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_teeos_mod_sem_post(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_post(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_teeos_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_teeos_mod_sem_wait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_wait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_teeos_mod_setlocale(int32_t cat, const char* name) {
    return (char*)setlocale(cat, name);
}

int32_t libc_teeos_mod_strcoll(const char* l, const char* r) {
    return (int32_t)strcoll(l, r);
}

uint64_t libc_teeos_mod_strxfrm(char* dest, const char* src, uint64_t n) {
    return (uint64_t)strxfrm(dest, src, n);
}

double libc_teeos_mod_strtod(const char* s, void* p) {
    return (double)strtod(s, p);
}

uint64_t libc_teeos_mod_mbrtowc(void* wc, const char* src, uint64_t n, void* st) {
    return (uint64_t)mbrtowc(wc, src, n, st);
}

uint64_t libc_teeos_mod_wcrtomb(char* s, uint32_t wc, void* st) {
    return (uint64_t)wcrtomb(s, wc, st);
}

int32_t libc_teeos_mod_wctob(uint32_t c) {
    return (int32_t)wctob(c);
}

void libc_teeos_mod_srandom(uint32_t seed) {
    srandom(seed);
}

char* libc_teeos_mod_initstate(uint32_t seed, char* state, uint64_t size) {
    return (char*)initstate(seed, state, size);
}

char* libc_teeos_mod_setstate(char* state) {
    return (char*)setstate(state);
}

int64_t libc_teeos_mod_random(void) {
    return (int64_t)random();
}

char* libc_teeos_mod_strchr(const char* s, int32_t c) {
    return (char*)strchr(s, c);
}

uint64_t libc_teeos_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

int32_t libc_teeos_mod_strcmp(const char* l, const char* r) {
    return (int32_t)strcmp(l, r);
}

char* libc_teeos_mod_strcpy(char* dest, const char* src) {
    return (char*)strcpy(dest, src);
}

int32_t libc_teeos_mod_strncmp(const char* _l, const char* r, uint64_t n) {
    return (int32_t)strncmp(_l, r, n);
}

char* libc_teeos_mod_strncpy(char* dest, const char* src, uint64_t n) {
    return (char*)strncpy(dest, src, n);
}

uint64_t libc_teeos_mod_strnlen(const char* cs, uint64_t n) {
    return (uint64_t)strnlen(cs, n);
}

char* libc_teeos_mod_strrchr(const char* s, int32_t c) {
    return (char*)strrchr(s, c);
}

char* libc_teeos_mod_strstr(const char* h, const char* n) {
    return (char*)strstr(h, n);
}

void* libc_teeos_mod_wcschr(void* s, uint32_t c) {
    return (void*)wcschr(s, c);
}

uint64_t libc_teeos_mod_wcslen(void* s) {
    return (uint64_t)wcslen(s);
}

int32_t libc_teeos_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_teeos_mod_isascii(int32_t c) {
    return (int32_t)isascii(c);
}

int32_t libc_teeos_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_teeos_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_teeos_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_teeos_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_teeos_mod_iswctype(uint32_t wc, uint64_t ttype) {
    return (int32_t)iswctype(wc, ttype);
}

int32_t libc_teeos_mod_iswdigit(uint32_t wc) {
    return (int32_t)iswdigit(wc);
}

int32_t libc_teeos_mod_iswlower(uint32_t wc) {
    return (int32_t)iswlower(wc);
}

int32_t libc_teeos_mod_iswspace(uint32_t wc) {
    return (int32_t)iswspace(wc);
}

int32_t libc_teeos_mod_iswupper(uint32_t wc) {
    return (int32_t)iswupper(wc);
}

uint32_t libc_teeos_mod_towupper(uint32_t wc) {
    return (uint32_t)towupper(wc);
}

uint32_t libc_teeos_mod_towlower(uint32_t wc) {
    return (uint32_t)towlower(wc);
}

double libc_teeos_mod_atan(double x) {
    return (double)atan(x);
}

double libc_teeos_mod_ceil(double x) {
    return (double)ceil(x);
}

float libc_teeos_mod_ceilf(float x) {
    return (float)ceilf(x);
}

double libc_teeos_mod_exp(double x) {
    return (double)exp(x);
}

double libc_teeos_mod_fabs(double x) {
    return (double)fabs(x);
}

double libc_teeos_mod_floor(double x) {
    return (double)floor(x);
}

double libc_teeos_mod_frexp(double x, void* e) {
    return (double)frexp(x, e);
}

double libc_teeos_mod_log(double x) {
    return (double)log(x);
}

double libc_teeos_mod_log2(double x) {
    return (double)log2(x);
}

double libc_teeos_mod_pow(double x, double y) {
    return (double)pow(x, y);
}

float libc_teeos_mod_roundf(float x) {
    return (float)roundf(x);
}

double libc_teeos_mod_scalbn(double x, int32_t n) {
    return (double)scalbn(x, n);
}

double libc_teeos_mod_sqrt(double x) {
    return (double)sqrt(x);
}

int32_t libc_teeos_mod_abs(int32_t x) {
    return (int32_t)abs(x);
}

double libc_teeos_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_teeos_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_teeos_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_teeos_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

void* libc_teeos_mod_bsearch(void* key, void* base, uint64_t nel, uint64_t width, int32_t cmp) {
    return (void*)bsearch(key, base, nel, width, cmp);
}

int32_t libc_teeos_mod_div(int32_t num, int32_t den) {
    return div(num, den).quot;
}

char* libc_teeos_mod_ecvt(double x, int32_t n, void* dp, void* sign) {
    return (char*)ecvt(x, n, dp, sign);
}

int64_t libc_teeos_mod_imaxabs(int64_t a) {
    return (int64_t)imaxabs(a);
}

int64_t libc_teeos_mod_llabs(int64_t a) {
    return (int64_t)llabs(a);
}

void libc_teeos_mod_qsort(void* base, uint64_t nel, uint64_t width, int32_t cmp) {
    qsort(base, nel, width, cmp);
}

uint64_t libc_teeos_mod_strtoul(const char* s, void* p, int32_t base) {
    return (uint64_t)strtoul(s, p, base);
}

int64_t libc_teeos_mod_strtol(const char* s, void* p, int32_t base) {
    return (int64_t)strtol(s, p, base);
}

double libc_teeos_mod_wcstod(void* s, void* p) {
    return (double)wcstod(s, p);
}

