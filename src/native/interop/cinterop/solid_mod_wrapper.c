#include "solid_mod_wrapper.h"
#include <errno.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <signal.h>
#include <time.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <locale.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <unistd.h>
#endif

int32_t libc_solid_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_solid_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_solid_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_solid_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_solid_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_solid_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_solid_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_solid_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_solid_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_solid_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_solid_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_solid_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_solid_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_solid_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void* libc_solid_mod_get_stdio_file(int32_t fileno) {
    return (void*)__get_stdio_file(fileno);
}

void libc_solid_mod_clearerr(void* arg1) {
    clearerr((FILE*)arg1);
}

int32_t libc_solid_mod_fclose(void* arg1) {
    return (int32_t)fclose((FILE*)arg1);
}

int32_t libc_solid_mod_feof(void* arg1) {
    return (int32_t)feof((FILE*)arg1);
}

int32_t libc_solid_mod_ferror(void* arg1) {
    return (int32_t)ferror((FILE*)arg1);
}

int32_t libc_solid_mod_fflush(void* arg1) {
    return (int32_t)fflush((FILE*)arg1);
}

int32_t libc_solid_mod_fgetc(void* arg1) {
    return (int32_t)fgetc((FILE*)arg1);
}

char* libc_solid_mod_fgets(char* arg1, int32_t arg2, void* arg3) {
    return (char*)fgets(arg1, arg2, (FILE*)arg3);
}

void* libc_solid_mod_fopen(const char* arg1, const char* arg2) {
    return (void*)fopen(arg1, arg2);
}

int32_t libc_solid_mod_fputc(int32_t arg1, void* arg2) {
    return (int32_t)fputc(arg1, (FILE*)arg2);
}

int32_t libc_solid_mod_fputs(const char* arg1, void* arg2) {
    return (int32_t)fputs(arg1, (FILE*)arg2);
}

uint64_t libc_solid_mod_fread(void* arg1, uint64_t arg2, uint64_t arg3, void* arg4) {
    return (uint64_t)fread(arg1, arg2, arg3, (FILE*)arg4);
}

void* libc_solid_mod_freopen(const char* arg1, const char* arg2, void* arg3) {
    return (void*)freopen(arg1, arg2, (FILE*)arg3);
}

int32_t libc_solid_mod_fseek(void* arg1, int64_t arg2, int32_t arg3) {
    return (int32_t)fseek((FILE*)arg1, arg2, arg3);
}

int64_t libc_solid_mod_ftell(void* arg1) {
    return (int64_t)ftell((FILE*)arg1);
}

uint64_t libc_solid_mod_fwrite(void* arg1, uint64_t arg2, uint64_t arg3, void* arg4) {
    return (uint64_t)fwrite(arg1, arg2, arg3, (FILE*)arg4);
}

int32_t libc_solid_mod_getc(void* arg1) {
    return (int32_t)getc((FILE*)arg1);
}

int32_t libc_solid_mod_getchar(void) {
    return (int32_t)getchar();
}

void libc_solid_mod_perror(const char* arg1) {
    perror(arg1);
}

int32_t libc_solid_mod_putc(int32_t arg1, void* arg2) {
    return (int32_t)putc(arg1, (FILE*)arg2);
}

int32_t libc_solid_mod_putchar(int32_t arg1) {
    return (int32_t)putchar(arg1);
}

int32_t libc_solid_mod_puts(const char* arg1) {
    return (int32_t)puts(arg1);
}

int32_t libc_solid_mod_remove(const char* arg1) {
    return (int32_t)remove(arg1);
}

void libc_solid_mod_rewind(void* arg1) {
    rewind((FILE*)arg1);
}

void libc_solid_mod_setbuf(void* arg1, char* arg2) {
    setbuf((FILE*)arg1, arg2);
}

int32_t libc_solid_mod_setvbuf(void* arg1, char* arg2, int32_t arg3, uint64_t arg4) {
    return (int32_t)setvbuf((FILE*)arg1, arg2, arg3, arg4);
}

void* libc_solid_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_solid_mod_ungetc(int32_t arg1, void* arg2) {
    return (int32_t)ungetc(arg1, (FILE*)arg2);
}

int32_t libc_solid_mod_vfprintf(void* arg1, const char* arg2, char* arg3) {
    return (int32_t)vfprintf((FILE*)arg1, arg2, arg3);
}

int32_t libc_solid_mod_vprintf(const char* arg1, char* arg2) {
    return (int32_t)vprintf(arg1, arg2);
}

char* libc_solid_mod_gets(char* arg1) {
    return (char*)gets(arg1);
}

char* libc_solid_mod_tmpnam(const char* arg1) {
    return (char*)tmpnam(arg1);
}

int32_t libc_solid_mod_vsprintf(char* arg1, const char* arg2, char* arg3) {
    return (int32_t)vsprintf(arg1, arg2, arg3);
}

int32_t libc_solid_mod_rename(const char* arg1, const char* arg2) {
    return (int32_t)rename(arg1, arg2);
}

int32_t libc_solid_mod_vasiprintf(void* arg1, const char* arg2, char* arg3) {
    return (int32_t)vasiprintf(arg1, arg2, arg3);
}

int32_t libc_solid_mod_vfiprintf(void* arg1, const char* arg2, char* arg3) {
    return (int32_t)vfiprintf((FILE*)arg1, arg2, arg3);
}

int32_t libc_solid_mod_vfiscanf(void* arg1, const char* arg2, char* arg3) {
    return (int32_t)vfiscanf((FILE*)arg1, arg2, arg3);
}

int32_t libc_solid_mod_viprintf(const char* arg1, char* arg2) {
    return (int32_t)viprintf(arg1, arg2);
}

int32_t libc_solid_mod_viscanf(const char* arg1, char* arg2) {
    return (int32_t)viscanf(arg1, arg2);
}

int32_t libc_solid_mod_vsiprintf(char* arg1, const char* arg2, char* arg3) {
    return (int32_t)vsiprintf(arg1, arg2, arg3);
}

int32_t libc_solid_mod_vsiscanf(const char* arg1, const char* arg2, char* arg3) {
    return (int32_t)vsiscanf(arg1, arg2, arg3);
}

int32_t libc_solid_mod_vsniprintf(char* arg1, uint64_t arg2, const char* arg3, char* arg4) {
    return (int32_t)vsniprintf(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_vdiprintf(int32_t arg1, const char* arg2, char* arg3) {
    return (int32_t)vdiprintf(arg1, arg2, arg3);
}

int32_t libc_solid_mod_fgetpos(void* arg1, void* arg2) {
    return (int32_t)fgetpos((FILE*)arg1, arg2);
}

int32_t libc_solid_mod_fsetpos(void* arg1, void* arg2) {
    return (int32_t)fsetpos((FILE*)arg1, arg2);
}

void* libc_solid_mod_fdopen(int32_t arg1, const char* arg2) {
    return (void*)fdopen(arg1, arg2);
}

int32_t libc_solid_mod_fileno(void* arg1) {
    return (int32_t)fileno((FILE*)arg1);
}

void libc_solid_mod_flockfile(void* arg1) {
    flockfile((FILE*)arg1);
}

int32_t libc_solid_mod_ftrylockfile(void* arg1) {
    return (int32_t)ftrylockfile((FILE*)arg1);
}

void libc_solid_mod_funlockfile(void* arg1) {
    funlockfile((FILE*)arg1);
}

int32_t libc_solid_mod_getc_unlocked(void* arg1) {
    return (int32_t)getc_unlocked((FILE*)arg1);
}

int32_t libc_solid_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_solid_mod_putc_unlocked(int32_t arg1, void* arg2) {
    return (int32_t)putc_unlocked(arg1, (FILE*)arg2);
}

int32_t libc_solid_mod_putchar_unlocked(int32_t arg1) {
    return (int32_t)putchar_unlocked(arg1);
}

int32_t libc_solid_mod_vsnprintf(char* arg1, uint64_t arg2, const char* arg3, char* arg4) {
    return (int32_t)vsnprintf(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_getw(void* arg1) {
    return (int32_t)getw((FILE*)arg1);
}

int32_t libc_solid_mod_putw(int32_t arg1, void* arg2) {
    return (int32_t)putw(arg1, (FILE*)arg2);
}

char* libc_solid_mod_tempnam(const char* arg1, const char* arg2) {
    return (char*)tempnam(arg1, arg2);
}

int32_t libc_solid_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko((FILE*)stream, offset, whence);
}

int64_t libc_solid_mod_ftello(void* stream) {
    return (int64_t)ftello((FILE*)stream);
}

double libc_solid_mod_atof(const char* arg1) {
    return (double)atof(arg1);
}

double libc_solid_mod_strtod(const char* arg1, void* arg2) {
    return (double)strtod(arg1, arg2);
}

double libc_solid_mod_drand48(void) {
    return (double)drand48();
}

double libc_solid_mod_erand48(void* arg1) {
    return (double)erand48(arg1);
}

float libc_solid_mod_strtof(const char* arg1, void* arg2) {
    return (float)strtof(arg1, arg2);
}

double libc_solid_mod_strtold(const char* arg1, void* arg2) {
    return (double)strtold(arg1, arg2);
}

double libc_solid_mod_strtod_l(const char* arg1, void* arg2, uint64_t arg3) {
    return (double)strtod_l(arg1, arg2, arg3);
}

float libc_solid_mod_strtof_l(const char* arg1, void* arg2, uint64_t arg3) {
    return (float)strtof_l(arg1, arg2, arg3);
}

double libc_solid_mod_strtold_l(const char* arg1, void* arg2, uint64_t arg3) {
    return (double)strtold_l(arg1, arg2, arg3);
}

void libc_solid_mod_exit(int32_t arg1) {
    _Exit(arg1);
}

void libc_solid_mod_abort(void) {
    abort();
}

int32_t libc_solid_mod_abs(int32_t arg1) {
    return (int32_t)abs(arg1);
}

int32_t libc_solid_mod_atexit(void* arg1) {
    return (int32_t)atexit(arg1);
}

int32_t libc_solid_mod_atoi(const char* arg1) {
    return (int32_t)atoi(arg1);
}

int64_t libc_solid_mod_atol(const char* arg1) {
    return (int64_t)atol(arg1);
}

char* libc_solid_mod_itoa(int32_t arg1, char* arg2, int32_t arg3) {
    return (char*)itoa(arg1, arg2, arg3);
}

char* libc_solid_mod_ltoa(int64_t arg1, char* arg2, int32_t arg3) {
    return (char*)ltoa(arg1, arg2, arg3);
}

char* libc_solid_mod_ultoa(uint64_t arg1, char* arg2, int32_t arg3) {
    return (char*)ultoa(arg1, arg2, arg3);
}

void* libc_solid_mod_bsearch(void* arg1, void* arg2, uint64_t arg3, uint64_t arg4, void* arg5) {
    return (void*)bsearch(arg1, arg2, arg3, arg4, arg5);
}

void* libc_solid_mod_calloc(uint64_t arg1, uint64_t arg2) {
    return (void*)calloc(arg1, arg2);
}

int32_t libc_solid_mod_div(int32_t arg1, int32_t arg2) {
    return (int32_t)div(arg1, arg2);
}

void libc_solid_mod_free(void* arg1) {
    free(arg1);
}

char* libc_solid_mod_getenv(const char* arg1) {
    return (char*)getenv(arg1);
}

int64_t libc_solid_mod_labs(int64_t arg1) {
    return (int64_t)labs(arg1);
}

int32_t libc_solid_mod_ldiv(int64_t arg1, int64_t arg2) {
    return (int32_t)ldiv(arg1, arg2);
}

void* libc_solid_mod_malloc(uint64_t arg1) {
    return (void*)malloc(arg1);
}

void libc_solid_mod_qsort(void* arg1, uint64_t arg2, uint64_t arg3, void* arg4) {
    qsort(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_rand(void) {
    return (int32_t)rand();
}

void* libc_solid_mod_realloc(void* arg1, uint64_t arg2) {
    return (void*)realloc(arg1, arg2);
}

void libc_solid_mod_srand(uint32_t arg1) {
    srand(arg1);
}

int64_t libc_solid_mod_strtol(const char* arg1, void* arg2, int32_t arg3) {
    return (int64_t)strtol(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strtoul(const char* arg1, void* arg2, int32_t arg3) {
    return (uint64_t)strtoul(arg1, arg2, arg3);
}

int32_t libc_solid_mod_mblen(const char* arg1, uint64_t arg2) {
    return (int32_t)mblen(arg1, arg2);
}

uint64_t libc_solid_mod_mbstowcs(void* arg1, const char* arg2, uint64_t arg3) {
    return (uint64_t)mbstowcs(arg1, arg2, arg3);
}

int32_t libc_solid_mod_wctomb(char* arg1, int32_t arg2) {
    return (int32_t)wctomb(arg1, arg2);
}

int32_t libc_solid_mod_mbtowc(void* arg1, const char* arg2, uint64_t arg3) {
    return (int32_t)mbtowc(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_wcstombs(char* arg1, void* arg2, uint64_t arg3) {
    return (uint64_t)wcstombs(arg1, arg2, arg3);
}

int32_t libc_solid_mod_rand_r(void* arg1) {
    return (int32_t)rand_r(arg1);
}

int64_t libc_solid_mod_jrand48(void* arg1) {
    return (int64_t)jrand48(arg1);
}

void libc_solid_mod_lcong48(void* arg1) {
    lcong48(arg1);
}

int64_t libc_solid_mod_lrand48(void) {
    return (int64_t)lrand48();
}

int64_t libc_solid_mod_mrand48(void) {
    return (int64_t)mrand48();
}

int64_t libc_solid_mod_nrand48(void* arg1) {
    return (int64_t)nrand48(arg1);
}

void* libc_solid_mod_seed48(void* arg1) {
    return (void*)seed48(arg1);
}

void libc_solid_mod_srand48(int64_t arg1) {
    srand48(arg1);
}

int32_t libc_solid_mod_putenv(char* arg1) {
    return (int32_t)putenv(arg1);
}

int64_t libc_solid_mod_a64l(const char* arg1) {
    return (int64_t)a64l(arg1);
}

char* libc_solid_mod_l64a(int64_t arg1) {
    return (char*)l64a(arg1);
}

int64_t libc_solid_mod_random(void) {
    return (int64_t)random();
}

char* libc_solid_mod_setstate(char* arg1) {
    return (char*)setstate(arg1);
}

char* libc_solid_mod_initstate(uint32_t arg1, char* arg2, uint64_t arg3) {
    return (char*)initstate(arg1, arg2, arg3);
}

void libc_solid_mod_srandom(uint32_t arg1) {
    srandom(arg1);
}

int32_t libc_solid_mod_mkostemp(char* arg1, int32_t arg2) {
    return (int32_t)mkostemp(arg1, arg2);
}

int32_t libc_solid_mod_mkostemps(char* arg1, int32_t arg2, int32_t arg3) {
    return (int32_t)mkostemps(arg1, arg2, arg3);
}

char* libc_solid_mod_mkdtemp(char* arg1) {
    return (char*)mkdtemp(arg1);
}

int32_t libc_solid_mod_mkstemp(char* arg1) {
    return (int32_t)mkstemp(arg1);
}

char* libc_solid_mod_mktemp(char* arg1) {
    return (char*)mktemp(arg1);
}

int64_t libc_solid_mod_atoll(const char* arg1) {
    return (int64_t)atoll(arg1);
}

int64_t libc_solid_mod_llabs(int64_t arg1) {
    return (int64_t)llabs(arg1);
}

int32_t libc_solid_mod_lldiv(int64_t arg1, int64_t arg2) {
    return (int32_t)lldiv(arg1, arg2);
}

int64_t libc_solid_mod_strtoll(const char* arg1, void* arg2, int32_t arg3) {
    return (int64_t)strtoll(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strtoull(const char* arg1, void* arg2, int32_t arg3) {
    return (uint64_t)strtoull(arg1, arg2, arg3);
}

void* libc_solid_mod_aligned_alloc(uint64_t arg1, uint64_t arg2) {
    return (void*)aligned_alloc(arg1, arg2);
}

int32_t libc_solid_mod_at_quick_exit(void* arg1) {
    return (int32_t)at_quick_exit(arg1);
}

void libc_solid_mod_quick_exit(int32_t arg1) {
    quick_exit(arg1);
}

int32_t libc_solid_mod_setenv(const char* arg1, const char* arg2, int32_t arg3) {
#if !defined(_WIN32)
    return (int32_t)setenv(arg1, arg2, arg3);
#else
    (void)arg1;
    (void)arg2;
    (void)arg3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solid_mod_unsetenv(const char* arg1) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(arg1);
#else
    (void)arg1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solid_mod_humanize_number(char* arg1, uint64_t arg2, int64_t arg3, const char* arg4, int32_t arg5, int32_t arg6) {
    return (int32_t)humanize_number(arg1, arg2, arg3, arg4, arg5, arg6);
}

int32_t libc_solid_mod_dehumanize_number(const char* arg1, void* arg2) {
    return (int32_t)dehumanize_number(arg1, arg2);
}

int32_t libc_solid_mod_getenv_r(const char* arg1, char* arg2, uint64_t arg3) {
    return (int32_t)getenv_r(arg1, arg2, arg3);
}

int32_t libc_solid_mod_heapsort(void* arg1, uint64_t arg2, uint64_t arg3, void* arg4) {
    return (int32_t)heapsort(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_mergesort(void* arg1, uint64_t arg2, uint64_t arg3, void* arg4) {
    return (int32_t)mergesort(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_radixsort(void* arg1, int32_t arg2, void* arg3, uint32_t arg4) {
    return (int32_t)radixsort(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_sradixsort(void* arg1, int32_t arg2, void* arg3, uint32_t arg4) {
    return (int32_t)sradixsort(arg1, arg2, arg3, arg4);
}

const char* libc_solid_mod_getprogname(void) {
    return (const char*)getprogname();
}

void libc_solid_mod_setprogname(const char* arg1) {
    setprogname(arg1);
}

int64_t libc_solid_mod_qabs(int64_t arg1) {
    return (int64_t)qabs(arg1);
}

int64_t libc_solid_mod_strtoq(const char* arg1, void* arg2, int32_t arg3) {
    return (int64_t)strtoq(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strtouq(const char* arg1, void* arg2, int32_t arg3) {
    return (uint64_t)strtouq(arg1, arg2, arg3);
}

int64_t libc_solid_mod_strsuftoll(const char* arg1, const char* arg2, int64_t arg3, int64_t arg4) {
    return (int64_t)strsuftoll(arg1, arg2, arg3, arg4);
}

int64_t libc_solid_mod_strsuftollx(const char* arg1, const char* arg2, int64_t arg3, int64_t arg4, char* arg5, uint64_t arg6) {
    return (int64_t)strsuftollx(arg1, arg2, arg3, arg4, arg5, arg6);
}

int32_t libc_solid_mod_l64a_r(int64_t arg1, char* arg2, int32_t arg3) {
    return (int32_t)l64a_r(arg1, arg2, arg3);
}

int32_t libc_solid_mod_qdiv(int64_t arg1, int64_t arg2) {
    return (int32_t)qdiv(arg1, arg2);
}

int64_t libc_solid_mod_strtol_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (int64_t)strtol_l(arg1, arg2, arg3, arg4);
}

uint64_t libc_solid_mod_strtoul_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (uint64_t)strtoul_l(arg1, arg2, arg3, arg4);
}

int64_t libc_solid_mod_strtoll_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (int64_t)strtoll_l(arg1, arg2, arg3, arg4);
}

uint64_t libc_solid_mod_strtoull_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (uint64_t)strtoull_l(arg1, arg2, arg3, arg4);
}

int64_t libc_solid_mod_strtoq_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (int64_t)strtoq_l(arg1, arg2, arg3, arg4);
}

uint64_t libc_solid_mod_strtouq_l(const char* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (uint64_t)strtouq_l(arg1, arg2, arg3, arg4);
}

uint64_t libc_solid_mod_mb_cur_max_l(uint64_t arg1) {
    return (uint64_t)_mb_cur_max_l(arg1);
}

int32_t libc_solid_mod_mblen_l(const char* arg1, uint64_t arg2, uint64_t arg3) {
    return (int32_t)mblen_l(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_mbstowcs_l(void* arg1, const char* arg2, uint64_t arg3, uint64_t arg4) {
    return (uint64_t)mbstowcs_l(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_wctomb_l(char* arg1, int32_t arg2, uint64_t arg3) {
    return (int32_t)wctomb_l(arg1, arg2, arg3);
}

int32_t libc_solid_mod_mbtowc_l(void* arg1, const char* arg2, uint64_t arg3, uint64_t arg4) {
    return (int32_t)mbtowc_l(arg1, arg2, arg3, arg4);
}

uint64_t libc_solid_mod_wcstombs_l(char* arg1, void* arg2, uint64_t arg3, uint64_t arg4) {
    return (uint64_t)wcstombs_l(arg1, arg2, arg3, arg4);
}

void* libc_solid_mod_memchr(void* arg1, int32_t arg2, uint64_t arg3) {
    return (void*)memchr(arg1, arg2, arg3);
}

int32_t libc_solid_mod_memcmp(void* arg1, void* arg2, uint64_t arg3) {
    return (int32_t)memcmp(arg1, arg2, arg3);
}

void* libc_solid_mod_memcpy(void* arg1, void* arg2, uint64_t arg3) {
    return (void*)memcpy(arg1, arg2, arg3);
}

void* libc_solid_mod_memmove(void* arg1, void* arg2, uint64_t arg3) {
    return (void*)memmove(arg1, arg2, arg3);
}

void* libc_solid_mod_memset(void* arg1, int32_t arg2, uint64_t arg3) {
    return (void*)memset(arg1, arg2, arg3);
}

char* libc_solid_mod_strcat(char* arg1, const char* arg2) {
    return (char*)strcat(arg1, arg2);
}

char* libc_solid_mod_strchr(const char* arg1, int32_t arg2) {
    return (char*)strchr(arg1, arg2);
}

int32_t libc_solid_mod_strcmp(const char* arg1, const char* arg2) {
    return (int32_t)strcmp(arg1, arg2);
}

int32_t libc_solid_mod_strcoll(const char* arg1, const char* arg2) {
    return (int32_t)strcoll(arg1, arg2);
}

char* libc_solid_mod_strcpy(char* arg1, const char* arg2) {
    return (char*)strcpy(arg1, arg2);
}

uint64_t libc_solid_mod_strcspn(const char* arg1, const char* arg2) {
    return (uint64_t)strcspn(arg1, arg2);
}

char* libc_solid_mod_strerror(int32_t arg1) {
    return (char*)strerror(arg1);
}

uint64_t libc_solid_mod_strlen(const char* arg1) {
    return (uint64_t)strlen(arg1);
}

char* libc_solid_mod_strncat(char* arg1, const char* arg2, uint64_t arg3) {
    return (char*)strncat(arg1, arg2, arg3);
}

int32_t libc_solid_mod_strncmp(const char* arg1, const char* arg2, uint64_t arg3) {
    return (int32_t)strncmp(arg1, arg2, arg3);
}

char* libc_solid_mod_strncpy(char* arg1, const char* arg2, uint64_t arg3) {
    return (char*)strncpy(arg1, arg2, arg3);
}

char* libc_solid_mod_strpbrk(const char* arg1, const char* arg2) {
    return (char*)strpbrk(arg1, arg2);
}

char* libc_solid_mod_strrchr(const char* arg1, int32_t arg2) {
    return (char*)strrchr(arg1, arg2);
}

uint64_t libc_solid_mod_strspn(const char* arg1, const char* arg2) {
    return (uint64_t)strspn(arg1, arg2);
}

char* libc_solid_mod_strstr(const char* arg1, const char* arg2) {
    return (char*)strstr(arg1, arg2);
}

char* libc_solid_mod_strtok(char* arg1, const char* arg2) {
    return (char*)strtok(arg1, arg2);
}

char* libc_solid_mod_strtok_r(char* arg1, const char* arg2, void* arg3) {
    return (char*)strtok_r(arg1, arg2, arg3);
}

int32_t libc_solid_mod_strerror_r(int32_t arg1, char* arg2, uint64_t arg3) {
    return (int32_t)strerror_r(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strxfrm(char* arg1, const char* arg2, uint64_t arg3) {
    return (uint64_t)strxfrm(arg1, arg2, arg3);
}

void* libc_solid_mod_memccpy(void* arg1, void* arg2, int32_t arg3, uint64_t arg4) {
    return (void*)memccpy(arg1, arg2, arg3, arg4);
}

char* libc_solid_mod_strdup(const char* arg1) {
    return (char*)strdup(arg1);
}

char* libc_solid_mod_stpcpy(char* arg1, const char* arg2) {
    return (char*)stpcpy(arg1, arg2);
}

char* libc_solid_mod_stpncpy(char* arg1, const char* arg2, uint64_t arg3) {
    return (char*)stpncpy(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strnlen(const char* arg1, uint64_t arg2) {
    return (uint64_t)strnlen(arg1, arg2);
}

void* libc_solid_mod_memmem(void* arg1, uint64_t arg2, void* arg3, uint64_t arg4) {
    return (void*)memmem(arg1, arg2, arg3, arg4);
}

char* libc_solid_mod_strcasestr(const char* arg1, const char* arg2) {
    return (char*)strcasestr(arg1, arg2);
}

uint64_t libc_solid_mod_strlcat(char* arg1, const char* arg2, uint64_t arg3) {
    return (uint64_t)strlcat(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strlcpy(char* arg1, const char* arg2, uint64_t arg3) {
    return (uint64_t)strlcpy(arg1, arg2, arg3);
}

char* libc_solid_mod_strsep(void* arg1, const char* arg2) {
    return (char*)strsep(arg1, arg2);
}

char* libc_solid_mod_stresep(void* arg1, const char* arg2, int32_t arg3) {
    return (char*)stresep(arg1, arg2, arg3);
}

char* libc_solid_mod_strndup(const char* arg1, uint64_t arg2) {
    return (char*)strndup(arg1, arg2);
}

void* libc_solid_mod_memrchr(void* arg1, int32_t arg2, uint64_t arg3) {
    return (void*)memrchr(arg1, arg2, arg3);
}

void* libc_solid_mod_explicit_memset(void* arg1, int32_t arg2, uint64_t arg3) {
    return (void*)explicit_memset(arg1, arg2, arg3);
}

int32_t libc_solid_mod_consttime_memequal(void* arg1, void* arg2, uint64_t arg3) {
    return (int32_t)consttime_memequal(arg1, arg2, arg3);
}

int32_t libc_solid_mod_strcoll_l(const char* arg1, const char* arg2, uint64_t arg3) {
    return (int32_t)strcoll_l(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_strxfrm_l(char* arg1, const char* arg2, uint64_t arg3, uint64_t arg4) {
    return (uint64_t)strxfrm_l(arg1, arg2, arg3, arg4);
}

char* libc_solid_mod_strerror_l(int32_t arg1, uint64_t arg2) {
    return (char*)strerror_l(arg1, arg2);
}

int32_t libc_solid_mod_bcmp(void* arg1, void* arg2, uint64_t arg3) {
    return (int32_t)bcmp(arg1, arg2, arg3);
}

void libc_solid_mod_bcopy(void* arg1, void* arg2, uint64_t arg3) {
    bcopy(arg1, arg2, arg3);
}

void libc_solid_mod_bzero(void* arg1, uint64_t arg2) {
    bzero(arg1, arg2);
}

int32_t libc_solid_mod_ffs(int32_t arg1) {
    return (int32_t)ffs(arg1);
}

uint32_t libc_solid_mod_popcount(uint32_t arg1) {
    return (uint32_t)popcount(arg1);
}

uint32_t libc_solid_mod_popcountl(uint64_t arg1) {
    return (uint32_t)popcountl(arg1);
}

uint32_t libc_solid_mod_popcountll(uint64_t arg1) {
    return (uint32_t)popcountll(arg1);
}

uint32_t libc_solid_mod_popcount32(uint32_t arg1) {
    return (uint32_t)popcount32(arg1);
}

uint32_t libc_solid_mod_popcount64(uint64_t arg1) {
    return (uint32_t)popcount64(arg1);
}

char* libc_solid_mod_rindex(const char* arg1, int32_t arg2) {
    return (char*)rindex(arg1, arg2);
}

int32_t libc_solid_mod_strcasecmp(const char* arg1, const char* arg2) {
    return (int32_t)strcasecmp(arg1, arg2);
}

int32_t libc_solid_mod_strncasecmp(const char* arg1, const char* arg2, uint64_t arg3) {
    return (int32_t)strncasecmp(arg1, arg2, arg3);
}

uint64_t libc_solid_mod_signal(int32_t arg1, uint64_t arg2) {
    return (uint64_t)signal(arg1, arg2);
}

int32_t libc_solid_mod_raise(int32_t arg1) {
    return (int32_t)raise(arg1);
}

char* libc_solid_mod_asctime(void* arg1) {
    return (char*)asctime(arg1);
}

uint32_t libc_solid_mod_clock(void) {
    return (uint32_t)clock();
}

char* libc_solid_mod_ctime(void* arg1) {
    return (char*)ctime(arg1);
}

double libc_solid_mod_difftime(int64_t arg1, int64_t arg2) {
    return (double)difftime(arg1, arg2);
}

void* libc_solid_mod_gmtime(void* arg1) {
    return (void*)gmtime(arg1);
}

void* libc_solid_mod_localtime(void* arg1) {
    return (void*)localtime(arg1);
}

int64_t libc_solid_mod_time(void* arg1) {
    return (int64_t)time(arg1);
}

int64_t libc_solid_mod_mktime(void* arg1) {
    return (int64_t)mktime(arg1);
}

uint64_t libc_solid_mod_strftime(char* arg1, uint64_t arg2, const char* arg3, void* arg4) {
    return (uint64_t)strftime(arg1, arg2, arg3, arg4);
}

int32_t libc_solid_mod_utime(const char* arg1, void* arg2) {
    return (int32_t)utime(arg1, arg2);
}

char* libc_solid_mod_asctime_r(void* arg1, char* arg2) {
    return (char*)asctime_r(arg1, arg2);
}

char* libc_solid_mod_ctime_r(void* arg1, char* arg2) {
    return (char*)ctime_r(arg1, arg2);
}

void* libc_solid_mod_gmtime_r(void* arg1, void* arg2) {
    return (void*)gmtime_r(arg1, arg2);
}

void* libc_solid_mod_localtime_r(void* arg1, void* arg2) {
    return (void*)localtime_r(arg1, arg2);
}

int32_t libc_solid_mod_stat(const char* arg1, void* arg2) {
    return (int32_t)stat(arg1, arg2);
}

int32_t libc_solid_mod_lstat(const char* arg1, void* arg2) {
#if !defined(_WIN32)
    return (int32_t)lstat(arg1, arg2);
#else
    (void)arg1;
    (void)arg2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solid_mod_fstat(int32_t arg1, void* arg2) {
    return (int32_t)fstat(arg1, arg2);
}

int32_t libc_solid_mod_chmod(const char* arg1, uint32_t arg2) {
#if !defined(_WIN32)
    return (int32_t)chmod(arg1, arg2);
#else
    (void)arg1;
    (void)arg2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_solid_mod_mkdir(const char* arg1, uint32_t arg2) {
    return (int32_t)mkdir(arg1, arg2);
}

int32_t libc_solid_mod_creat(const char* arg1, int32_t arg2) {
    return (int32_t)creat(arg1, arg2);
}

int32_t libc_solid_mod_close(int32_t arg1) {
    return (int32_t)close(arg1);
}

int32_t libc_solid_mod_read(int32_t arg1, void* arg2, int32_t arg3) {
    return (int32_t)read(arg1, arg2, arg3);
}

int32_t libc_solid_mod_write(int32_t arg1, void* arg2, int32_t arg3) {
    return (int32_t)write(arg1, arg2, arg3);
}

int32_t libc_solid_mod_unlink(const char* arg1) {
    return (int32_t)unlink(arg1);
}

int64_t libc_solid_mod_tell(int32_t arg1) {
    return (int64_t)tell(arg1);
}

int32_t libc_solid_mod_dup(int32_t arg1) {
    return (int32_t)dup(arg1);
}

int32_t libc_solid_mod_dup2(int32_t arg1, int32_t arg2) {
    return (int32_t)dup2(arg1, arg2);
}

int32_t libc_solid_mod_access(const char* arg1, int32_t arg2) {
    return (int32_t)access(arg1, arg2);
}

int32_t libc_solid_mod_rmdir(const char* arg1) {
    return (int32_t)rmdir(arg1);
}

int32_t libc_solid_mod_chdir(const char* arg1) {
    return (int32_t)chdir(arg1);
}

char* libc_solid_mod_getwd(char* arg1) {
    return (char*)getwd(arg1);
}

char* libc_solid_mod_getcwd(char* arg1, uint64_t arg2) {
    return (char*)getcwd(arg1, arg2);
}

int32_t libc_solid_mod_getopt(int32_t arg1, void* arg2, const char* arg3) {
    return (int32_t)getopt(arg1, arg2, arg3);
}

int32_t libc_solid_mod_getsubopt(void* arg1, void* arg2, void* arg3) {
    return (int32_t)getsubopt(arg1, arg2, arg3);
}

int32_t libc_solid_mod_getpid(void) {
    return (int32_t)getpid();
}

uint32_t libc_solid_mod_sleep(uint32_t arg1) {
#if !defined(_WIN32)
    return (uint32_t)sleep(arg1);
#else
    (void)arg1;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_solid_mod_usleep(uint32_t arg1) {
#if !defined(_WIN32)
    return (int32_t)usleep(arg1);
#else
    (void)arg1;
    errno = ENOSYS;
    return -1;
#endif
}

void* libc_solid_mod_localeconv(void) {
    return (void*)localeconv();
}

char* libc_solid_mod_setlocale(int32_t arg1, const char* arg2) {
    return (char*)setlocale(arg1, arg2);
}

uint64_t libc_solid_mod_duplocale(uint64_t arg1) {
    return (uint64_t)duplocale(arg1);
}

void libc_solid_mod_freelocale(uint64_t arg1) {
    freelocale(arg1);
}

void* libc_solid_mod_localeconv_l(uint64_t arg1) {
    return (void*)localeconv_l(arg1);
}

uint64_t libc_solid_mod_newlocale(int32_t arg1, const char* arg2, uint64_t arg3) {
    return (uint64_t)newlocale(arg1, arg2, arg3);
}

char* libc_solid_mod_nl_langinfo(int64_t item) {
    return (char*)nl_langinfo(item);
}

char* libc_solid_mod_nl_langinfo_l(int64_t item, uint64_t locale) {
    return (char*)nl_langinfo_l(item, locale);
}

void* libc_solid_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int64_t libc_solid_mod_lseek(int32_t arg1, int64_t arg2, int32_t arg3) {
    return (int64_t)lseek(arg1, arg2, arg3);
}

