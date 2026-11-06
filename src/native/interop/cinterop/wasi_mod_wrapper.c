#include "wasi_mod_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <ctype.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <locale.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <unistd.h>
#include <sys/socket.h>
#include <dirent.h>
#include <poll.h>
#include <sys/ioctl.h>
#include <pthread.h>
#endif

void libc_wasi_mod_exit(int32_t code) {
    _Exit(code);
}

void libc_wasi_mod_abort(void) {
    abort();
}

void* libc_wasi_mod_aligned_alloc(uint64_t a, uint64_t b) {
    return (void*)aligned_alloc(a, b);
}

void* libc_wasi_mod_calloc(uint64_t amt, uint64_t amt2) {
    return (void*)calloc(amt, amt2);
}

void libc_wasi_mod_free(void* ptr) {
    free(ptr);
}

char* libc_wasi_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

void* libc_wasi_mod_malloc(uint64_t amt) {
    return (void*)malloc(amt);
}

uint64_t libc_wasi_mod_malloc_usable_size(void* ptr) {
    return (uint64_t)malloc_usable_size(ptr);
}

void* libc_wasi_mod_sbrk(int64_t increment) {
    return (void*)sbrk(increment);
}

int32_t libc_wasi_mod_rand(void) {
    return (int32_t)rand();
}

int64_t libc_wasi_mod_read(int32_t fd, void* ptr, uint64_t size) {
    return (int64_t)read(fd, ptr, size);
}

void* libc_wasi_mod_realloc(void* ptr, uint64_t amt) {
    return (void*)realloc(ptr, amt);
}

int32_t libc_wasi_mod_setenv(const char* k, const char* v, int32_t a) {
#if !defined(_WIN32)
    return (int32_t)setenv(k, v, a);
#else
    (void)k;
    (void)v;
    (void)a;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_unsetenv(const char* k) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(k);
#else
    (void)k;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int64_t libc_wasi_mod_write(int32_t fd, void* ptr, uint64_t size) {
    return (int64_t)write(fd, ptr, size);
}

void* libc_wasi_mod_fopen(const char* a, const char* b) {
    return (void*)fopen(a, b);
}

void* libc_wasi_mod_freopen(const char* a, const char* b, void* f) {
    return (void*)freopen(a, b, (FILE*)f);
}

int32_t libc_wasi_mod_fclose(void* f) {
    return (int32_t)fclose((FILE*)f);
}

int32_t libc_wasi_mod_remove(const char* a) {
    return (int32_t)remove(a);
}

int32_t libc_wasi_mod_rename(const char* a, const char* b) {
    return (int32_t)rename(a, b);
}

int32_t libc_wasi_mod_feof(void* f) {
    return (int32_t)feof((FILE*)f);
}

int32_t libc_wasi_mod_ferror(void* f) {
    return (int32_t)ferror((FILE*)f);
}

int32_t libc_wasi_mod_fflush(void* f) {
    return (int32_t)fflush((FILE*)f);
}

void libc_wasi_mod_clearerr(void* f) {
    clearerr((FILE*)f);
}

int32_t libc_wasi_mod_fseek(void* f, int64_t b, int32_t c) {
    return (int32_t)fseek((FILE*)f, b, c);
}

int64_t libc_wasi_mod_ftell(void* f) {
    return (int64_t)ftell((FILE*)f);
}

void libc_wasi_mod_rewind(void* f) {
    rewind((FILE*)f);
}

int32_t libc_wasi_mod_fgetpos(void* f, void* pos) {
    return (int32_t)fgetpos((FILE*)f, pos);
}

int32_t libc_wasi_mod_fsetpos(void* f, void* pos) {
    return (int32_t)fsetpos((FILE*)f, pos);
}

uint64_t libc_wasi_mod_fread(void* buf, uint64_t a, uint64_t b, void* f) {
    return (uint64_t)fread(buf, a, b, (FILE*)f);
}

uint64_t libc_wasi_mod_fwrite(void* buf, uint64_t a, uint64_t b, void* f) {
    return (uint64_t)fwrite(buf, a, b, (FILE*)f);
}

int32_t libc_wasi_mod_fgetc(void* f) {
    return (int32_t)fgetc((FILE*)f);
}

int32_t libc_wasi_mod_getc(void* f) {
    return (int32_t)getc((FILE*)f);
}

int32_t libc_wasi_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_wasi_mod_ungetc(int32_t a, void* f) {
    return (int32_t)ungetc(a, (FILE*)f);
}

int32_t libc_wasi_mod_fputc(int32_t a, void* f) {
    return (int32_t)fputc(a, (FILE*)f);
}

int32_t libc_wasi_mod_putc(int32_t a, void* f) {
    return (int32_t)putc(a, (FILE*)f);
}

int32_t libc_wasi_mod_putchar(int32_t a) {
    return (int32_t)putchar(a);
}

int32_t libc_wasi_mod_fputs(const char* a, void* f) {
    return (int32_t)fputs(a, (FILE*)f);
}

int32_t libc_wasi_mod_puts(const char* a) {
    return (int32_t)puts(a);
}

void libc_wasi_mod_perror(const char* a) {
    perror(a);
}

void libc_wasi_mod_srand(uint32_t a) {
    srand(a);
}

int32_t libc_wasi_mod_atexit(int32_t a) {
    return (int32_t)atexit(a);
}

int32_t libc_wasi_mod_at_quick_exit(int32_t a) {
    return (int32_t)at_quick_exit(a);
}

void libc_wasi_mod_quick_exit(int32_t a) {
    quick_exit(a);
}

int32_t libc_wasi_mod_posix_memalign(void* a, uint64_t b, uint64_t c) {
    return (int32_t)posix_memalign(a, b, c);
}

int32_t libc_wasi_mod_rand_r(void* a) {
    return (int32_t)rand_r(a);
}

int64_t libc_wasi_mod_random(void) {
    return (int64_t)random();
}

void libc_wasi_mod_srandom(uint32_t a) {
    srandom(a);
}

int32_t libc_wasi_mod_putenv(char* a) {
    return (int32_t)putenv(a);
}

int64_t libc_wasi_mod_clock(void) {
    return (int64_t)clock();
}

int64_t libc_wasi_mod_time(void* a) {
    return (int64_t)time(a);
}

double libc_wasi_mod_difftime(int64_t a, int64_t b) {
    return (double)difftime(a, b);
}

int64_t libc_wasi_mod_mktime(void* a) {
    return (int64_t)mktime(a);
}

uint64_t libc_wasi_mod_strftime(char* a, uint64_t b, const char* c, void* d) {
    return (uint64_t)strftime(a, b, c, d);
}

void* libc_wasi_mod_gmtime(void* a) {
    return (void*)gmtime(a);
}

void* libc_wasi_mod_gmtime_r(void* a, void* b) {
    return (void*)gmtime_r(a, b);
}

void* libc_wasi_mod_localtime(void* a) {
    return (void*)localtime(a);
}

void* libc_wasi_mod_localtime_r(void* a, void* b) {
    return (void*)localtime_r(a, b);
}

char* libc_wasi_mod_asctime_r(void* a, char* b) {
    return (char*)asctime_r(a, b);
}

char* libc_wasi_mod_ctime_r(void* a, char* b) {
    return (char*)ctime_r(a, b);
}

int32_t libc_wasi_mod_nanosleep(void* a, void* b) {
    return (int32_t)nanosleep(a, b);
}

int32_t libc_wasi_mod_clock_getres(int32_t a, void* b) {
    return (int32_t)clock_getres(a, b);
}

int32_t libc_wasi_mod_clock_gettime(int32_t a, void* b) {
    return (int32_t)clock_gettime(a, b);
}

int32_t libc_wasi_mod_clock_nanosleep(int32_t a, int32_t a2, void* b, void* c) {
    return (int32_t)clock_nanosleep(a, a2, b, c);
}

int32_t libc_wasi_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_wasi_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_wasi_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_wasi_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_wasi_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_wasi_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_wasi_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_wasi_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_wasi_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_wasi_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_wasi_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_wasi_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_wasi_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_wasi_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

int32_t libc_wasi_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_wasi_mod_setbuf(void* stream, char* buf) {
    setbuf((FILE*)stream, buf);
}

char* libc_wasi_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, (FILE*)stream);
}

double libc_wasi_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_wasi_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_wasi_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_wasi_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_wasi_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_wasi_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_wasi_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_wasi_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_wasi_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_wasi_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

char* libc_wasi_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_wasi_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_wasi_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_wasi_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_wasi_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_wasi_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_wasi_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_wasi_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_wasi_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_wasi_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_wasi_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_wasi_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_wasi_mod_strndup(const char* cs, uint64_t n) {
    return (char*)strndup(cs, n);
}

char* libc_wasi_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_wasi_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

int32_t libc_wasi_mod_strcasecmp(const char* s1, const char* s2) {
    return (int32_t)strcasecmp(s1, s2);
}

int32_t libc_wasi_mod_strncasecmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncasecmp(s1, s2, n);
}

uint64_t libc_wasi_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_wasi_mod_strnlen(const char* cs, uint64_t maxlen) {
    return (uint64_t)strnlen(cs, maxlen);
}

char* libc_wasi_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_wasi_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

uint64_t libc_wasi_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

void* libc_wasi_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

int32_t libc_wasi_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_wasi_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_wasi_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_wasi_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

int32_t libc_wasi_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_wasi_mod_putchar_unlocked(int32_t c) {
    return (int32_t)putchar_unlocked(c);
}

int32_t libc_wasi_mod_shutdown(int32_t socket, int32_t how) {
    return (int32_t)shutdown(socket, how);
}

int32_t libc_wasi_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)fstat(fildes, buf);
}

int32_t libc_wasi_mod_mkdir(const char* path, uint32_t mode) {
    return (int32_t)mkdir(path, mode);
}

int32_t libc_wasi_mod_stat(const char* path, void* buf) {
    return (int32_t)stat(path, buf);
}

void* libc_wasi_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)fdopen(fd, mode);
}

int32_t libc_wasi_mod_fileno(void* stream) {
    return (int32_t)fileno((FILE*)stream);
}

int32_t libc_wasi_mod_creat(const char* path, uint32_t mode) {
    return (int32_t)creat(path, mode);
}

void* libc_wasi_mod_opendir(const char* dirname) {
#if !defined(_WIN32)
    return (void*)opendir(dirname);
#else
    (void)dirname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_wasi_mod_fdopendir(int32_t fd) {
    return (void*)fdopendir(fd);
}

void* libc_wasi_mod_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_wasi_mod_closedir(void* dirp) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_wasi_mod_rewinddir(void* dirp) {
#if !defined(_WIN32)
    rewinddir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
#endif
}

int32_t libc_wasi_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

void libc_wasi_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_wasi_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_wasi_mod_fstatat(int32_t dirfd, const char* pathname, void* buf, int32_t flags) {
    return (int32_t)fstatat(dirfd, pathname, buf, flags);
}

int32_t libc_wasi_mod_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_wasi_mod_mkdirat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkdirat(dirfd, pathname, mode);
}

int64_t libc_wasi_mod_readlinkat(int32_t dirfd, const char* pathname, char* buf, uint64_t bufsiz) {
    return (int64_t)readlinkat(dirfd, pathname, buf, bufsiz);
}

int32_t libc_wasi_mod_renameat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)renameat(olddirfd, oldpath, newdirfd, newpath);
}

int32_t libc_wasi_mod_symlinkat(const char* target, int32_t newdirfd, const char* linkpath) {
    return (int32_t)symlinkat(target, newdirfd, linkpath);
}

int32_t libc_wasi_mod_unlinkat(int32_t dirfd, const char* pathname, int32_t flags) {
    return (int32_t)unlinkat(dirfd, pathname, flags);
}

int32_t libc_wasi_mod_access(const char* path, int32_t amode) {
    return (int32_t)access(path, amode);
}

int32_t libc_wasi_mod_close(int32_t fd) {
    return (int32_t)close(fd);
}

int64_t libc_wasi_mod_fpathconf(int32_t filedes, int32_t name) {
    return (int64_t)fpathconf(filedes, name);
}

int32_t libc_wasi_mod_getopt(int32_t argc, void* argv, const char* optstr) {
    return (int32_t)getopt(argc, argv, optstr);
}

int32_t libc_wasi_mod_isatty(int32_t fd) {
    return (int32_t)isatty(fd);
}

int32_t libc_wasi_mod_link(const char* src, const char* dst) {
#if !defined(_WIN32)
    return (int32_t)link(src, dst);
#else
    (void)src;
    (void)dst;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_wasi_mod_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_wasi_mod_pathconf(const char* path, int32_t name) {
    return (int64_t)pathconf(path, name);
}

int32_t libc_wasi_mod_rmdir(const char* path) {
    return (int32_t)rmdir(path);
}

uint32_t libc_wasi_mod_sleep(uint32_t secs) {
#if !defined(_WIN32)
    return (uint32_t)sleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_wasi_mod_unlink(const char* c) {
    return (int32_t)unlink(c);
}

int64_t libc_wasi_mod_pread(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread(fd, buf, count, offset);
}

int64_t libc_wasi_mod_pwrite(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite(fd, buf, count, offset);
}

int32_t libc_wasi_mod_lstat(const char* path, void* buf) {
#if !defined(_WIN32)
    return (int32_t)lstat(path, buf);
#else
    (void)path;
    (void)buf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_fsync(int32_t fd) {
    return (int32_t)fsync(fd);
}

int32_t libc_wasi_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_wasi_mod_symlink(const char* path1, const char* path2) {
#if !defined(_WIN32)
    return (int32_t)symlink(path1, path2);
#else
    (void)path1;
    (void)path2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_truncate(const char* path, int64_t length) {
    return (int32_t)truncate(path, length);
}

int32_t libc_wasi_mod_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

int32_t libc_wasi_mod_getrusage(int32_t resource, void* usage) {
    return (int32_t)getrusage(resource, usage);
}

int32_t libc_wasi_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int64_t libc_wasi_mod_times(void* buf) {
    return (int64_t)times(buf);
}

int32_t libc_wasi_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_wasi_mod_usleep(uint32_t secs) {
#if !defined(_WIN32)
    return (int32_t)usleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_wasi_mod_send(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)send(socket, buf, len, flags);
}

int64_t libc_wasi_mod_recv(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)recv(socket, buf, len, flags);
}

int32_t libc_wasi_mod_poll(void* fds, uint64_t nfds, int32_t timeout) {
#if !defined(_WIN32)
    return (int32_t)poll(fds, nfds, timeout);
#else
    (void)fds;
    (void)nfds;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_wasi_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_wasi_mod_localeconv(void) {
    return (void*)localeconv();
}

int64_t libc_wasi_mod_readlink(const char* path, char* buf, uint64_t bufsz) {
#if !defined(_WIN32)
    return (int64_t)readlink(path, buf, bufsz);
#else
    (void)path;
    (void)buf;
    (void)bufsz;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_wasi_mod_timegm(void* tm) {
    return (int64_t)timegm(tm);
}

int64_t libc_wasi_mod_sysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko((FILE*)stream, offset, whence);
}

int64_t libc_wasi_mod_ftello(void* stream) {
    return (int64_t)ftello((FILE*)stream);
}

int32_t libc_wasi_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

char* libc_wasi_mod_strcasestr(const char* cs, const char* ct) {
    return (char*)strcasestr(cs, ct);
}

int64_t libc_wasi_mod_getline(void* lineptr, void* n, void* stream) {
    return (int64_t)getline(lineptr, n, (FILE*)stream);
}

int32_t libc_wasi_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int64_t libc_wasi_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_wasi_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_wasi_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_wasi_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_wasi_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_wasi_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_wasi_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

int32_t libc_wasi_mod_getentropy(void* buf, uint64_t buflen) {
    return (int32_t)getentropy(buf, buflen);
}

void* libc_wasi_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_wasi_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_wasi_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

void* libc_wasi_mod_duplocale(void* base) {
    return (void*)duplocale(base);
}

void libc_wasi_mod_freelocale(void* loc) {
    freelocale(loc);
}

void* libc_wasi_mod_newlocale(int32_t mask, const char* locale, void* base) {
    return (void*)newlocale(mask, locale, base);
}

void* libc_wasi_mod_uselocale(void* loc) {
    return (void*)uselocale(loc);
}

int32_t libc_wasi_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

char* libc_wasi_mod_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

int32_t libc_wasi_mod_chdir(const char* dir) {
    return (int32_t)chdir(dir);
}

char* libc_wasi_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

char* libc_wasi_mod_nl_langinfo_l(int32_t item, void* loc) {
    return (char*)nl_langinfo_l(item, loc);
}

int32_t libc_wasi_mod_select(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout) {
    return (int32_t)select(nfds, readfds, writefds, errorfds, timeout);
}

int32_t libc_wasi_mod_wasilibc_register_preopened_fd(int32_t fd, const char* path) {
    return (int32_t)__wasilibc_register_preopened_fd(fd, path);
}

int32_t libc_wasi_mod_wasilibc_fd_renumber(int32_t fd, int32_t newfd) {
    return (int32_t)__wasilibc_fd_renumber(fd, newfd);
}

int32_t libc_wasi_mod_wasilibc_unlinkat(int32_t fd, const char* path) {
    return (int32_t)__wasilibc_unlinkat(fd, path);
}

int32_t libc_wasi_mod_wasilibc_rmdirat(int32_t fd, const char* path) {
    return (int32_t)__wasilibc_rmdirat(fd, path);
}

int32_t libc_wasi_mod_wasilibc_find_relpath(const char* path, void* abs_prefix, void* relative_path, uint64_t relative_path_len) {
    return (int32_t)__wasilibc_find_relpath(path, abs_prefix, relative_path, relative_path_len);
}

int64_t libc_wasi_mod_wasilibc_tell(int32_t fd) {
    return (int64_t)__wasilibc_tell(fd);
}

int32_t libc_wasi_mod_wasilibc_nocwd_wasilibc_unlinkat(int32_t dirfd, const char* path) {
    return (int32_t)__wasilibc_nocwd___wasilibc_unlinkat(dirfd, path);
}

int32_t libc_wasi_mod_wasilibc_nocwd_wasilibc_rmdirat(int32_t dirfd, const char* path) {
    return (int32_t)__wasilibc_nocwd___wasilibc_rmdirat(dirfd, path);
}

int32_t libc_wasi_mod_wasilibc_nocwd_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)__wasilibc_nocwd_linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_wasi_mod_wasilibc_nocwd_symlinkat(const char* target, int32_t dirfd, const char* path) {
    return (int32_t)__wasilibc_nocwd_symlinkat(target, dirfd, path);
}

int64_t libc_wasi_mod_wasilibc_nocwd_readlinkat(int32_t dirfd, const char* path, char* buf, uint64_t bufsize) {
    return (int64_t)__wasilibc_nocwd_readlinkat(dirfd, path, buf, bufsize);
}

int32_t libc_wasi_mod_wasilibc_nocwd_faccessat(int32_t dirfd, const char* path, int32_t mode, int32_t flags) {
    return (int32_t)__wasilibc_nocwd_faccessat(dirfd, path, mode, flags);
}

int32_t libc_wasi_mod_wasilibc_nocwd_renameat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)__wasilibc_nocwd_renameat(olddirfd, oldpath, newdirfd, newpath);
}

int32_t libc_wasi_mod_wasilibc_nocwd_openat_nomode(int32_t dirfd, const char* path, int32_t flags) {
    return (int32_t)__wasilibc_nocwd_openat_nomode(dirfd, path, flags);
}

int32_t libc_wasi_mod_wasilibc_nocwd_fstatat(int32_t dirfd, const char* path, void* buf, int32_t flags) {
    return (int32_t)__wasilibc_nocwd_fstatat(dirfd, path, buf, flags);
}

int32_t libc_wasi_mod_wasilibc_nocwd_mkdirat_nomode(int32_t dirfd, const char* path) {
    return (int32_t)__wasilibc_nocwd_mkdirat_nomode(dirfd, path);
}

int32_t libc_wasi_mod_wasilibc_nocwd_utimensat(int32_t dirfd, const char* path, void* times, int32_t flags) {
    return (int32_t)__wasilibc_nocwd_utimensat(dirfd, path, times, flags);
}

void* libc_wasi_mod_wasilibc_nocwd_opendirat(int32_t dirfd, const char* path) {
    return (void*)__wasilibc_nocwd_opendirat(dirfd, path);
}

int32_t libc_wasi_mod_wasilibc_access(const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)__wasilibc_access(pathname, mode, flags);
}

int32_t libc_wasi_mod_wasilibc_stat(const char* pathname, void* buf, int32_t flags) {
    return (int32_t)__wasilibc_stat(pathname, buf, flags);
}

int32_t libc_wasi_mod_wasilibc_utimens(const char* pathname, void* times, int32_t flags) {
    return (int32_t)__wasilibc_utimens(pathname, times, flags);
}

int32_t libc_wasi_mod_wasilibc_link(const char* oldpath, const char* newpath, int32_t flags) {
    return (int32_t)__wasilibc_link(oldpath, newpath, flags);
}

int32_t libc_wasi_mod_wasilibc_link_oldat(int32_t olddirfd, const char* oldpath, const char* newpath, int32_t flags) {
    return (int32_t)__wasilibc_link_oldat(olddirfd, oldpath, newpath, flags);
}

int32_t libc_wasi_mod_wasilibc_link_newat(const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)__wasilibc_link_newat(oldpath, newdirfd, newpath, flags);
}

int32_t libc_wasi_mod_wasilibc_rename_oldat(int32_t olddirfd, const char* oldpath, const char* newpath) {
    return (int32_t)__wasilibc_rename_oldat(olddirfd, oldpath, newpath);
}

int32_t libc_wasi_mod_wasilibc_rename_newat(const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)__wasilibc_rename_newat(oldpath, newdirfd, newpath);
}

uint32_t libc_wasi_mod_arc4random(void) {
    return (uint32_t)arc4random();
}

void libc_wasi_mod_arc4random_buf(void* a, uint64_t b) {
    arc4random_buf(a, b);
}

uint32_t libc_wasi_mod_arc4random_uniform(uint32_t a) {
    return (uint32_t)arc4random_uniform(a);
}

void* libc_wasi_mod_errno_location(void) {
    return (void*)__errno_location();
}

int32_t libc_wasi_mod_chmod(const char* path, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)chmod(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_fchmod(int32_t fd, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)fchmod(fd, mode);
#else
    (void)fd;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_wasi_mod_realpath(const char* pathname, char* resolved) {
    return (char*)realpath(pathname, resolved);
}

void* libc_wasi_mod_pthread_self(void) {
#if !defined(_WIN32)
    return (void*)pthread_self();
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_wasi_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_wasi_mod_pthread_equal(void* t1, void* t2) {
#if !defined(_WIN32)
    return (int32_t)pthread_equal(t1, t2);
#else
    (void)t1;
    (void)t2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_pthread_join(void* native, void* value) {
#if !defined(_WIN32)
    return (int32_t)pthread_join(native, value);
#else
    (void)native;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_wasi_mod_pthread_attr_destroy(void* attr) {
    return (int32_t)pthread_attr_destroy(attr);
}

int32_t libc_wasi_mod_pthread_attr_getstacksize(void* attr, void* stacksize) {
    return (int32_t)pthread_attr_getstacksize(attr, stacksize);
}

int32_t libc_wasi_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size) {
    return (int32_t)pthread_attr_setstacksize(attr, stack_size);
}

int32_t libc_wasi_mod_pthread_attr_setdetachstate(void* attr, int32_t state) {
    return (int32_t)pthread_attr_setdetachstate(attr, state);
}

int32_t libc_wasi_mod_pthread_detach(void* thread) {
#if !defined(_WIN32)
    return (int32_t)pthread_detach(thread);
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_wasi_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_wasi_mod_pthread_key_delete(uint32_t key) {
    return (int32_t)pthread_key_delete(key);
}

void* libc_wasi_mod_pthread_getspecific(uint32_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_wasi_mod_pthread_setspecific(uint32_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

int32_t libc_wasi_mod_pthread_mutex_init(void* lock, void* attr) {
    return (int32_t)pthread_mutex_init(lock, attr);
}

int32_t libc_wasi_mod_pthread_mutex_destroy(void* lock) {
    return (int32_t)pthread_mutex_destroy(lock);
}

int32_t libc_wasi_mod_pthread_mutex_lock(void* lock) {
    return (int32_t)pthread_mutex_lock(lock);
}

int32_t libc_wasi_mod_pthread_mutex_trylock(void* lock) {
    return (int32_t)pthread_mutex_trylock(lock);
}

int32_t libc_wasi_mod_pthread_mutex_unlock(void* lock) {
    return (int32_t)pthread_mutex_unlock(lock);
}

int32_t libc_wasi_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_wasi_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_wasi_mod_pthread_mutexattr_settype(void* attr, int32_t _type) {
    return (int32_t)pthread_mutexattr_settype(attr, _type);
}

int32_t libc_wasi_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_wasi_mod_pthread_cond_wait(void* cond, void* lock) {
    return (int32_t)pthread_cond_wait(cond, lock);
}

int32_t libc_wasi_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, lock, abstime);
}

int32_t libc_wasi_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_wasi_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_wasi_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_wasi_mod_pthread_condattr_init(void* attr) {
    return (int32_t)pthread_condattr_init(attr);
}

int32_t libc_wasi_mod_pthread_condattr_destroy(void* attr) {
    return (int32_t)pthread_condattr_destroy(attr);
}

int32_t libc_wasi_mod_pthread_rwlock_init(void* lock, void* attr) {
    return (int32_t)pthread_rwlock_init(lock, attr);
}

int32_t libc_wasi_mod_pthread_rwlock_destroy(void* lock) {
    return (int32_t)pthread_rwlock_destroy(lock);
}

int32_t libc_wasi_mod_pthread_rwlock_rdlock(void* lock) {
    return (int32_t)pthread_rwlock_rdlock(lock);
}

int32_t libc_wasi_mod_pthread_rwlock_tryrdlock(void* lock) {
    return (int32_t)pthread_rwlock_tryrdlock(lock);
}

int32_t libc_wasi_mod_pthread_rwlock_wrlock(void* lock) {
    return (int32_t)pthread_rwlock_wrlock(lock);
}

int32_t libc_wasi_mod_pthread_rwlock_trywrlock(void* lock) {
    return (int32_t)pthread_rwlock_trywrlock(lock);
}

int32_t libc_wasi_mod_pthread_rwlock_unlock(void* lock) {
    return (int32_t)pthread_rwlock_unlock(lock);
}

int32_t libc_wasi_mod_pthread_rwlockattr_init(void* attr) {
    return (int32_t)pthread_rwlockattr_init(attr);
}

int32_t libc_wasi_mod_pthread_rwlockattr_destroy(void* attr) {
    return (int32_t)pthread_rwlockattr_destroy(attr);
}

