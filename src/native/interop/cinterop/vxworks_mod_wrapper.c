#include "vxworks_mod_wrapper.h"
#include <errno.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <time.h>
#include <locale.h>
#include <signal.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <dirent.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/mman.h>
#include <pthread.h>
#include <poll.h>
#include <sys/socket.h>
#include <sys/ioctl.h>
#endif

int32_t libc_vxworks_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_vxworks_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_vxworks_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_vxworks_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_vxworks_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_vxworks_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_vxworks_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_vxworks_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_vxworks_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_vxworks_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_vxworks_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_vxworks_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_vxworks_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_vxworks_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void* libc_vxworks_mod_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_vxworks_mod_freopen(const char* filename, const char* mode, void* file) {
    return (void*)freopen(filename, mode, (FILE*)file);
}

int32_t libc_vxworks_mod_fflush(void* file) {
    return (int32_t)fflush((FILE*)file);
}

int32_t libc_vxworks_mod_fclose(void* file) {
    return (int32_t)fclose((FILE*)file);
}

int32_t libc_vxworks_mod_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_vxworks_mod_rename(const char* oldname, const char* newname) {
    return (int32_t)rename(oldname, newname);
}

void* libc_vxworks_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_vxworks_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_vxworks_mod_setbuf(void* stream, char* buf) {
    setbuf((FILE*)stream, buf);
}

int32_t libc_vxworks_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_vxworks_mod_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_vxworks_mod_fgetc(void* stream) {
    return (int32_t)fgetc((FILE*)stream);
}

char* libc_vxworks_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, (FILE*)stream);
}

int32_t libc_vxworks_mod_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, (FILE*)stream);
}

int32_t libc_vxworks_mod_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, (FILE*)stream);
}

int32_t libc_vxworks_mod_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_vxworks_mod_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, (FILE*)stream);
}

uint64_t libc_vxworks_mod_fread(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread(ptr, size, nobj, (FILE*)stream);
}

uint64_t libc_vxworks_mod_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite(ptr, size, nobj, (FILE*)stream);
}

int32_t libc_vxworks_mod_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek((FILE*)stream, offset, whence);
}

int64_t libc_vxworks_mod_ftell(void* stream) {
    return (int64_t)ftell((FILE*)stream);
}

void libc_vxworks_mod_rewind(void* stream) {
    rewind((FILE*)stream);
}

int32_t libc_vxworks_mod_fgetpos(void* stream, void* ptr) {
    return (int32_t)fgetpos((FILE*)stream, ptr);
}

int32_t libc_vxworks_mod_fsetpos(void* stream, void* ptr) {
    return (int32_t)fsetpos((FILE*)stream, ptr);
}

int32_t libc_vxworks_mod_feof(void* stream) {
    return (int32_t)feof((FILE*)stream);
}

int32_t libc_vxworks_mod_ferror(void* stream) {
    return (int32_t)ferror((FILE*)stream);
}

void libc_vxworks_mod_perror(const char* s) {
    perror(s);
}

double libc_vxworks_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_vxworks_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_vxworks_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_vxworks_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_vxworks_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_vxworks_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_vxworks_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_vxworks_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_vxworks_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_vxworks_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

void* libc_vxworks_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_vxworks_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_vxworks_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_vxworks_mod_free(void* p) {
    free(p);
}

void libc_vxworks_mod_abort(void) {
    abort();
}

void libc_vxworks_mod_exit(int32_t status) {
    exit(status);
}

int32_t libc_vxworks_mod_atexit(int32_t cb) {
    return (int32_t)atexit(cb);
}

int32_t libc_vxworks_mod_system(const char* s) {
    return (int32_t)system(s);
}

char* libc_vxworks_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

uint32_t libc_vxworks_mod_cfgetospeed(void* termios) {
    return (uint32_t)cfgetospeed(termios);
}

int32_t libc_vxworks_mod_cfmakeraw(void* termios) {
    return (int32_t)cfmakeraw(termios);
}

int32_t libc_vxworks_mod_cfsetispeed(void* termios, uint32_t speed) {
    return (int32_t)cfsetispeed(termios, speed);
}

int32_t libc_vxworks_mod_cfsetospeed(void* termios, uint32_t speed) {
    return (int32_t)cfsetospeed(termios, speed);
}

char* libc_vxworks_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_vxworks_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_vxworks_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_vxworks_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_vxworks_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_vxworks_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_vxworks_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_vxworks_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_vxworks_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_vxworks_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_vxworks_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_vxworks_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_vxworks_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_vxworks_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

int32_t libc_vxworks_mod_strcasecmp(const char* s1, const char* s2) {
    return (int32_t)strcasecmp(s1, s2);
}

int32_t libc_vxworks_mod_strncasecmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncasecmp(s1, s2, n);
}

uint64_t libc_vxworks_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_vxworks_mod_strnlen(const char* cs, uint64_t n) {
    return (uint64_t)strnlen(cs, n);
}

char* libc_vxworks_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_vxworks_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

uint64_t libc_vxworks_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

uint64_t libc_vxworks_mod_wcslen(void* buf) {
    return (uint64_t)wcslen(buf);
}

uint64_t libc_vxworks_mod_wcstombs(char* dest, void* src, uint64_t n) {
    return (uint64_t)wcstombs(dest, src, n);
}

void* libc_vxworks_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

void* libc_vxworks_mod_wmemchr(void* cx, int32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

int32_t libc_vxworks_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_vxworks_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_vxworks_mod_memccpy(void* dest, void* src, int32_t c, uint64_t n) {
    return (void*)memccpy(dest, src, c, n);
}

void* libc_vxworks_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_vxworks_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

void* libc_vxworks_mod_aligned_alloc(uint64_t alignment, uint64_t size) {
    return (void*)aligned_alloc(alignment, size);
}

int32_t libc_vxworks_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int64_t libc_vxworks_mod_times(void* buf) {
    return (int64_t)times(buf);
}

int32_t libc_vxworks_mod_tcflush(int32_t fd, int32_t action) {
    return (int32_t)tcflush(fd, action);
}

int32_t libc_vxworks_mod_pclose(void* stream) {
    return (int32_t)pclose((FILE*)stream);
}

char* libc_vxworks_mod_mkdtemp(char* template) {
    return (char*)mkdtemp(template);
}

int32_t libc_vxworks_mod_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_vxworks_mod_unlinkat(int32_t dirfd, const char* pathname, int32_t flags) {
    return (int32_t)unlinkat(dirfd, pathname, flags);
}

void* libc_vxworks_mod_getprotobyname(const char* name) {
    return (void*)getprotobyname(name);
}

void* libc_vxworks_mod_getprotobynumber(int32_t proto) {
    return (void*)getprotobynumber(proto);
}

void* libc_vxworks_mod_getservbyname(const char* name, const char* proto) {
    return (void*)getservbyname(name, proto);
}

int32_t libc_vxworks_mod_fchownat(int32_t dirfd, const char* pathname, uint16_t owner, uint16_t group, int32_t flags) {
    return (int32_t)fchownat(dirfd, pathname, owner, group, flags);
}

int32_t libc_vxworks_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_vxworks_mod_putchar_unlocked(int32_t c) {
    return (int32_t)putchar_unlocked(c);
}

int32_t libc_vxworks_mod_stat(const char* path, void* buf) {
    return (int32_t)stat(path, buf);
}

void* libc_vxworks_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)fdopen(fd, mode);
}

int32_t libc_vxworks_mod_fileno(void* stream) {
    return (int32_t)fileno((FILE*)stream);
}

int32_t libc_vxworks_mod_creat(const char* path, int32_t mode) {
    return (int32_t)creat(path, mode);
}

void libc_vxworks_mod_rewinddir(void* dirp) {
#if !defined(_WIN32)
    rewinddir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
#endif
}

int32_t libc_vxworks_mod_fchown(int32_t fd, uint16_t owner, uint16_t group) {
#if !defined(_WIN32)
    return (int32_t)fchown(fd, owner, group);
#else
    (void)fd;
    (void)owner;
    (void)group;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_access(const char* path, int32_t amode) {
    return (int32_t)access(path, amode);
}

uint32_t libc_vxworks_mod_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_vxworks_mod_fchdir(int32_t dirfd) {
    return (int32_t)fchdir(dirfd);
}

int32_t libc_vxworks_mod_chown(const char* path, uint16_t uid, uint16_t gid) {
#if !defined(_WIN32)
    return (int32_t)chown(path, uid, gid);
#else
    (void)path;
    (void)uid;
    (void)gid;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_vxworks_mod_fpathconf(int32_t filedes, int32_t name) {
    return (int64_t)fpathconf(filedes, name);
}

uint16_t libc_vxworks_mod_getegid(void) {
#if !defined(_WIN32)
    return (uint16_t)getegid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t libc_vxworks_mod_geteuid(void) {
#if !defined(_WIN32)
    return (uint16_t)geteuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_vxworks_mod_getgroups(int32_t ngroups_max, void* groups) {
    return (int32_t)getgroups(ngroups_max, groups);
}

char* libc_vxworks_mod_getlogin(void) {
    return (char*)getlogin();
}

int32_t libc_vxworks_mod_getopt(int32_t argc, void* argv, const char* optstr) {
    return (int32_t)getopt(argc, argv, optstr);
}

int64_t libc_vxworks_mod_pathconf(const char* path, int32_t name) {
    return (int64_t)pathconf(path, name);
}

int32_t libc_vxworks_mod_pause(void) {
    return (int32_t)pause();
}

int32_t libc_vxworks_mod_seteuid(uint16_t uid) {
    return (int32_t)seteuid(uid);
}

int32_t libc_vxworks_mod_setegid(uint16_t gid) {
    return (int32_t)setegid(gid);
}

uint32_t libc_vxworks_mod_sleep(uint32_t secs) {
#if !defined(_WIN32)
    return (uint32_t)sleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return 0;
#endif
}

char* libc_vxworks_mod_ttyname(int32_t fd) {
    return (char*)ttyname(fd);
}

int32_t libc_vxworks_mod_wait(void* status) {
#if !defined(_WIN32)
    return (int32_t)wait(status);
#else
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_umask(int32_t mask) {
    return (int32_t)umask(mask);
}

int32_t libc_vxworks_mod_mlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)mlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_vxworks_mod_munlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_munlockall(void) {
    return (int32_t)munlockall();
}

void* libc_vxworks_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
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

int32_t libc_vxworks_mod_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

int32_t libc_vxworks_mod_msync(void* addr, uint64_t len, int32_t flags) {
#if !defined(_WIN32)
    return (int32_t)msync(addr, len, flags);
#else
    (void)addr;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_truncate(const char* path, int64_t length) {
    return (int32_t)truncate(path, length);
}

int32_t libc_vxworks_mod_shm_open(const char* name, int32_t oflag, int32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_vxworks_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

int32_t libc_vxworks_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

void libc_vxworks_mod_pthread_exit(void* value) {
    pthread_exit(value);
}

int32_t libc_vxworks_mod_pthread_attr_setdetachstate(void* attr, int32_t state) {
    return (int32_t)pthread_attr_setdetachstate(attr, state);
}

int32_t libc_vxworks_mod_pthread_equal(uint64_t t1, uint64_t t2) {
#if !defined(_WIN32)
    return (int32_t)pthread_equal(t1, t2);
#else
    (void)t1;
    (void)t2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_vxworks_mod_sigaddset(void* set, int32_t signum) {
    return (int32_t)sigaddset(set, signum);
}

int32_t libc_vxworks_mod_sigaction(int32_t signum, void* act, void* oldact) {
    return (int32_t)sigaction(signum, act, oldact);
}

int32_t libc_vxworks_mod_utimes(const char* filename, void* times) {
    return (int32_t)utimes(filename, times);
}

int32_t libc_vxworks_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_vxworks_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

void* libc_vxworks_mod_dlopen(const char* filename, int32_t flag) {
    return (void*)_rtld_dlopen(filename, flag);
}

char* libc_vxworks_mod_dlerror(void) {
    return (char*)_rtld_dlerror();
}

void* libc_vxworks_mod_dlsym(void* handle, const char* symbol) {
    return (void*)_rtld_dlsym(handle, symbol);
}

int32_t libc_vxworks_mod_dlclose(void* handle) {
    return (int32_t)_rtld_dlclose(handle);
}

int32_t libc_vxworks_mod_dladdr(void* addr, void* info) {
    return (int32_t)_rtld_dladdr(addr, info);
}

void* libc_vxworks_mod_gmtime_r(void* time_p, void* result) {
    return (void*)gmtime_r(time_p, result);
}

void* libc_vxworks_mod_localtime_r(void* time_p, void* result) {
    return (void*)localtime_r(time_p, result);
}

int64_t libc_vxworks_mod_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

int64_t libc_vxworks_mod_time(void* time) {
    return (int64_t)time(time);
}

void* libc_vxworks_mod_gmtime(void* time_p) {
    return (void*)gmtime(time_p);
}

void* libc_vxworks_mod_localtime(void* time_p) {
    return (void*)localtime(time_p);
}

int64_t libc_vxworks_mod_timegm(void* tm) {
    return (int64_t)timegm(tm);
}

double libc_vxworks_mod_difftime(int64_t time1, int64_t time0) {
    return (double)difftime(time1, time0);
}

int32_t libc_vxworks_mod_gethostname(char* name, uint64_t len) {
    return (int32_t)gethostname(name, len);
}

int32_t libc_vxworks_mod_usleep(uint64_t secs) {
#if !defined(_WIN32)
    return (int32_t)usleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_putenv(char* string) {
    return (int32_t)putenv(string);
}

char* libc_vxworks_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_vxworks_mod_localeconv(void) {
    return (void*)localeconv();
}

int32_t libc_vxworks_mod_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, set, oldset);
}

int32_t libc_vxworks_mod_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int32_t libc_vxworks_mod_mkfifo(const char* path, int32_t mode) {
#if !defined(_WIN32)
    return (int32_t)mkfifo(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko((FILE*)stream, offset, whence);
}

int64_t libc_vxworks_mod_ftello(void* stream) {
    return (int64_t)ftello((FILE*)stream);
}

int32_t libc_vxworks_mod_mkstemp(char* template) {
    return (int32_t)mkstemp(template);
}

char* libc_vxworks_mod_tmpnam(char* ptr) {
    return (char*)tmpnam(ptr);
}

void libc_vxworks_mod_openlog(const char* ident, int32_t logopt, int32_t facility) {
    openlog(ident, logopt, facility);
}

void libc_vxworks_mod_closelog(void) {
    closelog();
}

int32_t libc_vxworks_mod_setlogmask(int32_t maskpri) {
    return (int32_t)setlogmask(maskpri);
}

int64_t libc_vxworks_mod_getline(void* lineptr, void* n, void* stream) {
    return (int64_t)getline(lineptr, n, (FILE*)stream);
}

int32_t libc_vxworks_mod_tcsetattr(int32_t fd, int32_t optional_actions, void* termios) {
    return (int32_t)tcsetattr(fd, optional_actions, termios);
}

int32_t libc_vxworks_mod_tcgetattr(int32_t fd, void* termios) {
    return (int32_t)tcgetattr(fd, termios);
}

int32_t libc_vxworks_mod_tcsendbreak(int32_t fd, int32_t duration) {
    return (int32_t)tcsendbreak(fd, duration);
}

uint64_t libc_vxworks_mod_confstr(int32_t name, char* buf, uint64_t len) {
    return (uint64_t)confstr(name, buf, len);
}

int32_t libc_vxworks_mod_fnmatch(const char* pattern, const char* name, int32_t flags) {
    return (int32_t)fnmatch(pattern, name, flags);
}

int32_t libc_vxworks_mod_symlinkat(const char* target, int32_t newdirfd, const char* linkpath) {
    return (int32_t)symlinkat(target, newdirfd, linkpath);
}

int32_t libc_vxworks_mod_fchmodat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)fchmodat(dirfd, pathname, mode, flags);
}

int32_t libc_vxworks_mod_utime(const char* file, void* buf) {
    return (int32_t)utime(file, buf);
}

void* libc_vxworks_mod_memalign(uint64_t block_size, uint64_t size_arg) {
    return (void*)memalign(block_size, size_arg);
}

char* libc_vxworks_mod_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

int32_t libc_vxworks_mod_chdir(const char* attr) {
    return (int32_t)chdir(attr);
}

int32_t libc_vxworks_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_vxworks_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_vxworks_mod_pthread_mutexattr_settype(void* pAttr, int32_t pType) {
    return (int32_t)pthread_mutexattr_settype(pAttr, pType);
}

int32_t libc_vxworks_mod_pthread_mutex_init(void* mutex, void* attr) {
    return (int32_t)pthread_mutex_init(mutex, attr);
}

int32_t libc_vxworks_mod_pthread_mutex_destroy(void* mutex) {
    return (int32_t)pthread_mutex_destroy(mutex);
}

int32_t libc_vxworks_mod_pthread_mutex_lock(void* mutex) {
    return (int32_t)pthread_mutex_lock(mutex);
}

int32_t libc_vxworks_mod_pthread_mutex_trylock(void* mutex) {
    return (int32_t)pthread_mutex_trylock(mutex);
}

int32_t libc_vxworks_mod_pthread_mutex_timedlock(void* attr, void* spec) {
    return (int32_t)pthread_mutex_timedlock(attr, spec);
}

int32_t libc_vxworks_mod_pthread_mutex_unlock(void* mutex) {
    return (int32_t)pthread_mutex_unlock(mutex);
}

int32_t libc_vxworks_mod_pthread_attr_setname(void* pAttr, char* name) {
    return (int32_t)pthread_attr_setname(pAttr, name);
}

int32_t libc_vxworks_mod_pthread_attr_setstacksize(void* attr, uint64_t stacksize) {
    return (int32_t)pthread_attr_setstacksize(attr, stacksize);
}

int32_t libc_vxworks_mod_pthread_attr_getstacksize(void* attr, void* size) {
    return (int32_t)pthread_attr_getstacksize(attr, size);
}

int32_t libc_vxworks_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_vxworks_mod_pthread_create(void* pThread, void* pAttr, int32_t start_routine, void* value) {
    return (int32_t)pthread_create(pThread, pAttr, start_routine, value);
}

int32_t libc_vxworks_mod_pthread_setschedparam(uint64_t native, int32_t policy, void* param) {
    return (int32_t)pthread_setschedparam(native, policy, param);
}

int32_t libc_vxworks_mod_pthread_getschedparam(uint64_t native, void* policy, void* param) {
    return (int32_t)pthread_getschedparam(native, policy, param);
}

int32_t libc_vxworks_mod_pthread_attr_setinheritsched(void* attr, int32_t inheritsched) {
    return (int32_t)pthread_attr_setinheritsched(attr, inheritsched);
}

int32_t libc_vxworks_mod_pthread_attr_setschedpolicy(void* attr, int32_t policy) {
    return (int32_t)pthread_attr_setschedpolicy(attr, policy);
}

int32_t libc_vxworks_mod_pthread_attr_destroy(void* thread) {
    return (int32_t)pthread_attr_destroy(thread);
}

int32_t libc_vxworks_mod_pthread_detach(uint64_t thread) {
#if !defined(_WIN32)
    return (int32_t)pthread_detach(thread);
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

int32_t libc_vxworks_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)fstat(fildes, buf);
}

int32_t libc_vxworks_mod_lstat(const char* path, void* buf) {
#if !defined(_WIN32)
    return (int32_t)lstat(path, buf);
#else
    (void)path;
    (void)buf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

int32_t libc_vxworks_mod_readdir_r(void* pDir, void* entry, void* result) {
    return (int32_t)readdir_r((DIR*)pDir, entry, result);
}

void* libc_vxworks_mod_readdir(void* pDir) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)pDir);
#else
    (void)pDir;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_vxworks_mod_poll(void* fds, uint32_t nfds, int32_t timeout) {
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

int32_t libc_vxworks_mod_pthread_condattr_init(void* attr) {
    return (int32_t)pthread_condattr_init(attr);
}

int32_t libc_vxworks_mod_pthread_condattr_destroy(void* attr) {
    return (int32_t)pthread_condattr_destroy(attr);
}

int32_t libc_vxworks_mod_pthread_condattr_getclock(void* pAttr, void* pClockId) {
    return (int32_t)pthread_condattr_getclock(pAttr, pClockId);
}

int32_t libc_vxworks_mod_pthread_condattr_setclock(void* pAttr, int32_t clockId) {
    return (int32_t)pthread_condattr_setclock(pAttr, clockId);
}

int32_t libc_vxworks_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_vxworks_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_vxworks_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_vxworks_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_vxworks_mod_pthread_cond_wait(void* cond, void* mutex) {
    return (int32_t)pthread_cond_wait(cond, mutex);
}

int32_t libc_vxworks_mod_pthread_rwlockattr_init(void* attr) {
    return (int32_t)pthread_rwlockattr_init(attr);
}

int32_t libc_vxworks_mod_pthread_rwlockattr_destroy(void* attr) {
    return (int32_t)pthread_rwlockattr_destroy(attr);
}

int32_t libc_vxworks_mod_pthread_rwlockattr_setmaxreaders(void* attr, uint32_t attr2) {
    return (int32_t)pthread_rwlockattr_setmaxreaders(attr, attr2);
}

int32_t libc_vxworks_mod_pthread_rwlock_init(void* attr, void* host) {
    return (int32_t)pthread_rwlock_init(attr, host);
}

int32_t libc_vxworks_mod_pthread_rwlock_destroy(void* attr) {
    return (int32_t)pthread_rwlock_destroy(attr);
}

int32_t libc_vxworks_mod_pthread_rwlock_rdlock(void* attr) {
    return (int32_t)pthread_rwlock_rdlock(attr);
}

int32_t libc_vxworks_mod_pthread_rwlock_tryrdlock(void* attr) {
    return (int32_t)pthread_rwlock_tryrdlock(attr);
}

int32_t libc_vxworks_mod_pthread_rwlock_timedrdlock(void* attr, void* host) {
    return (int32_t)pthread_rwlock_timedrdlock(attr, host);
}

int32_t libc_vxworks_mod_pthread_rwlock_wrlock(void* attr) {
    return (int32_t)pthread_rwlock_wrlock(attr);
}

int32_t libc_vxworks_mod_pthread_rwlock_trywrlock(void* attr) {
    return (int32_t)pthread_rwlock_trywrlock(attr);
}

int32_t libc_vxworks_mod_pthread_rwlock_timedwrlock(void* attr, void* host) {
    return (int32_t)pthread_rwlock_timedwrlock(attr, host);
}

int32_t libc_vxworks_mod_pthread_rwlock_unlock(void* attr) {
    return (int32_t)pthread_rwlock_unlock(attr);
}

int32_t libc_vxworks_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_vxworks_mod_pthread_key_delete(uint64_t key) {
    return (int32_t)pthread_key_delete(key);
}

int32_t libc_vxworks_mod_pthread_setspecific(uint64_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

void* libc_vxworks_mod_pthread_getspecific(uint64_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_vxworks_mod_pthread_cond_timedwait(void* cond, void* mutex, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, mutex, abstime);
}

int32_t libc_vxworks_mod_pthread_attr_getname(void* attr, void* name) {
    return (int32_t)pthread_attr_getname(attr, name);
}

int32_t libc_vxworks_mod_pthread_join(uint64_t thread, void* status) {
#if !defined(_WIN32)
    return (int32_t)pthread_join(thread, status);
#else
    (void)thread;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t libc_vxworks_mod_pthread_self(void) {
#if !defined(_WIN32)
    return (uint64_t)pthread_self();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_vxworks_mod_clock_gettime(int32_t clock_id, void* tp) {
    return (int32_t)clock_gettime(clock_id, tp);
}

int32_t libc_vxworks_mod_clock_settime(int32_t clock_id, void* tp) {
    return (int32_t)clock_settime(clock_id, tp);
}

int32_t libc_vxworks_mod_clock_getres(int32_t clock_id, void* res) {
    return (int32_t)clock_getres(clock_id, res);
}

int32_t libc_vxworks_mod_clock_nanosleep(int32_t clock_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clock_id, flags, rqtp, rmtp);
}

int32_t libc_vxworks_mod_nanosleep(void* rqtp, void* rmtp) {
    return (int32_t)nanosleep(rqtp, rmtp);
}

int32_t libc_vxworks_mod_accept(int32_t s, void* addr, void* addrlen) {
    return (int32_t)accept(s, addr, addrlen);
}

int32_t libc_vxworks_mod_bind(int32_t fd, void* addr, uint32_t len) {
    return (int32_t)bind(fd, addr, len);
}

int32_t libc_vxworks_mod_connect(int32_t s, void* name, uint32_t namelen) {
    return (int32_t)connect(s, name, namelen);
}

int32_t libc_vxworks_mod_getpeername(int32_t s, void* name, void* namelen) {
    return (int32_t)getpeername(s, name, namelen);
}

int32_t libc_vxworks_mod_getsockname(int32_t socket, void* address, void* address_len) {
    return (int32_t)getsockname(socket, address, address_len);
}

int32_t libc_vxworks_mod_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_vxworks_mod_listen(int32_t socket, int32_t backlog) {
    return (int32_t)listen(socket, backlog);
}

int64_t libc_vxworks_mod_recv(int32_t s, void* buf, uint64_t bufLen, int32_t flags) {
    return (int64_t)recv(s, buf, bufLen, flags);
}

int64_t libc_vxworks_mod_recvfrom(int32_t s, void* buf, uint64_t bufLen, int32_t flags, void* from, void* pFromLen) {
    return (int64_t)recvfrom(s, buf, bufLen, flags, from, pFromLen);
}

int64_t libc_vxworks_mod_recvmsg(int32_t socket, void* mp, int32_t flags) {
    return (int64_t)recvmsg(socket, mp, flags);
}

int64_t libc_vxworks_mod_send(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)send(socket, buf, len, flags);
}

int64_t libc_vxworks_mod_sendmsg(int32_t socket, void* mp, int32_t flags) {
    return (int64_t)sendmsg(socket, mp, flags);
}

int64_t libc_vxworks_mod_sendto(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_vxworks_mod_setsockopt(int32_t socket, int32_t level, int32_t name, void* value, uint32_t option_len) {
    return (int32_t)setsockopt(socket, level, name, value, option_len);
}

int32_t libc_vxworks_mod_shutdown(int32_t s, int32_t how) {
    return (int32_t)shutdown(s, how);
}

int32_t libc_vxworks_mod_socket(int32_t domain, int32_t _type, int32_t protocol) {
    return (int32_t)socket(domain, _type, protocol);
}

char* libc_vxworks_mod_gai_strerror(int32_t errcode) {
    return (char*)gai_strerror(errcode);
}

int32_t libc_vxworks_mod_close(int32_t fd) {
    return (int32_t)close(fd);
}

int64_t libc_vxworks_mod_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int64_t libc_vxworks_mod_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int32_t libc_vxworks_mod_isatty(int32_t fd) {
    return (int32_t)isatty(fd);
}

int32_t libc_vxworks_mod_dup(int32_t src) {
    return (int32_t)dup(src);
}

int32_t libc_vxworks_mod_dup2(int32_t src, int32_t dst) {
    return (int32_t)dup2(src, dst);
}

int32_t libc_vxworks_mod_pipe(void* fds) {
#if !defined(_WIN32)
    return (int32_t)pipe(fds);
#else
    (void)fds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_unlink(const char* pathname) {
    return (int32_t)unlink(pathname);
}

int64_t libc_vxworks_mod_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int32_t libc_vxworks_mod_getaddrinfo(const char* node, const char* service, void* hints, void* res) {
    return (int32_t)getaddrinfo(node, service, hints, res);
}

void libc_vxworks_mod_freeaddrinfo(void* res) {
    freeaddrinfo(res);
}

uint64_t libc_vxworks_mod_signal(int32_t signum, uint64_t handler) {
    return (uint64_t)signal(signum, handler);
}

int32_t libc_vxworks_mod_getpid(void) {
    return (int32_t)getpid();
}

int32_t libc_vxworks_mod_getppid(void) {
    return (int32_t)getppid();
}

int32_t libc_vxworks_mod_setpgid(int32_t pid, int32_t pgid) {
    return (int32_t)setpgid(pid, pgid);
}

int32_t libc_vxworks_mod_waitpid(int32_t pid, void* status, int32_t options) {
#if !defined(_WIN32)
    return (int32_t)waitpid(pid, status, options);
#else
    (void)pid;
    (void)status;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_vxworks_mod_sysconf(int32_t attr) {
#if !defined(_WIN32)
    return (int64_t)sysconf(attr);
#else
    (void)attr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_setenv(const char* envVarName, const char* envVarValue, int32_t overwrite) {
#if !defined(_WIN32)
    return (int32_t)setenv(envVarName, envVarValue, overwrite);
#else
    (void)envVarName;
    (void)envVarValue;
    (void)overwrite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_unsetenv(const char* envVarName) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(envVarName);
#else
    (void)envVarName;
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_vxworks_mod_realpath(const char* fileName, char* resolvedName) {
    return (char*)realpath(fileName, resolvedName);
}

int32_t libc_vxworks_mod_link(const char* src, const char* dst) {
#if !defined(_WIN32)
    return (int32_t)link(src, dst);
#else
    (void)src;
    (void)dst;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_vxworks_mod_readlink(const char* path, char* buf, uint64_t bufsize) {
#if !defined(_WIN32)
    return (int64_t)readlink(path, buf, bufsize);
#else
    (void)path;
    (void)buf;
    (void)bufsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_symlink(const char* path1, const char* path2) {
#if !defined(_WIN32)
    return (int32_t)symlink(path1, path2);
#else
    (void)path1;
    (void)path2;
    errno = ENOSYS;
    return -1;
#endif
}

void* libc_vxworks_mod_opendir(const char* name) {
#if !defined(_WIN32)
    return (void*)opendir(name);
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_vxworks_mod_rmdir(const char* path) {
    return (int32_t)rmdir(path);
}

int32_t libc_vxworks_mod_mkdir(const char* dirName, int32_t mode) {
    return (int32_t)mkdir(dirName, mode);
}

int32_t libc_vxworks_mod_chmod(const char* path, int32_t mode) {
#if !defined(_WIN32)
    return (int32_t)chmod(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_fchmod(int32_t attr1, int32_t attr2) {
#if !defined(_WIN32)
    return (int32_t)fchmod(attr1, attr2);
#else
    (void)attr1;
    (void)attr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_fsync(int32_t fd) {
    return (int32_t)fsync(fd);
}

int32_t libc_vxworks_mod_closedir(void* ptr) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)ptr);
#else
    (void)ptr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_vxworks_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int32_t libc_vxworks_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_vxworks_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_vxworks_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_vxworks_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_vxworks_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_vxworks_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_vxworks_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_vxworks_mod_errno_set(int32_t err) {
    return (int32_t)errnoSet(err);
}

int32_t libc_vxworks_mod_errno_get(void) {
    return (int32_t)errnoGet();
}

int32_t libc_vxworks_mod_setgid(uint16_t gid) {
    return (int32_t)setgid(gid);
}

uint16_t libc_vxworks_mod_getgid(void) {
#if !defined(_WIN32)
    return (uint16_t)getgid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_vxworks_mod_setuid(uint16_t uid) {
    return (int32_t)setuid(uid);
}

uint16_t libc_vxworks_mod_getuid(void) {
#if !defined(_WIN32)
    return (uint16_t)getuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_vxworks_mod_sigemptyset(void* __set) {
    return (int32_t)sigemptyset(__set);
}

int32_t libc_vxworks_mod_sigfillset(void* set) {
    return (int32_t)sigfillset(set);
}

int32_t libc_vxworks_mod_sigdelset(void* set, int32_t signum) {
    return (int32_t)sigdelset(set, signum);
}

int32_t libc_vxworks_mod_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember(set, signum);
}

int32_t libc_vxworks_mod_pthread_sigmask(int32_t __how, void* __set, void* __oset) {
    return (int32_t)pthread_sigmask(__how, __set, __oset);
}

int32_t libc_vxworks_mod_kill(int32_t __pid, int32_t __signo) {
    return (int32_t)kill(__pid, __signo);
}

int32_t libc_vxworks_mod_sigqueue(int32_t __pid, int32_t __signo, int32_t __value) {
    return (int32_t)sigqueue(__pid, __signo, __value);
}

int32_t libc_vxworks_mod_task_kill(int32_t taskId, int32_t signo) {
    return (int32_t)taskKill(taskId, signo);
}

int32_t libc_vxworks_mod_raise(int32_t __signo) {
    return (int32_t)raise(__signo);
}

int32_t libc_vxworks_mod_task_id_self(void) {
    return (int32_t)taskIdSelf();
}

int32_t libc_vxworks_mod_task_delay(uint32_t ticks) {
    return (int32_t)taskDelay(ticks);
}

int32_t libc_vxworks_mod_task_name_set(int32_t task_id, char* task_name) {
    return (int32_t)taskNameSet(task_id, task_name);
}

int32_t libc_vxworks_mod_task_name_get(int32_t task_id, char* buf_name, uint64_t bufsize) {
    return (int32_t)taskNameGet(task_id, buf_name, bufsize);
}

int32_t libc_vxworks_mod_rtp_info_get(int32_t rtpId, void* rtpStruct) {
    return (int32_t)rtpInfoGet(rtpId, rtpStruct);
}

int32_t libc_vxworks_mod_rtp_spawn(const char* pubrtpFileName, void* argv, void* envp, int32_t priority, uint64_t uStackSize, int32_t options, int32_t taskOptions) {
    return (int32_t)rtpSpawn(pubrtpFileName, argv, envp, priority, uStackSize, options, taskOptions);
}

int32_t libc_vxworks_mod_path_is_absolute(const char* filepath, void* pNameTail) {
    return (int32_t)_pathIsAbsolute(filepath, pNameTail);
}

int64_t libc_vxworks_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_vxworks_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int32_t libc_vxworks_mod_rand_bytes(void* buf, int32_t length) {
    return (int32_t)randBytes(buf, length);
}

int32_t libc_vxworks_mod_rand_abytes(void* buf, int32_t length) {
    return (int32_t)randABytes(buf, length);
}

int32_t libc_vxworks_mod_rand_ubytes(void* buf, int32_t length) {
    return (int32_t)randUBytes(buf, length);
}

int32_t libc_vxworks_mod_rand_secure(void) {
    return (int32_t)randSecure();
}

int32_t libc_vxworks_mod_mq_close(int32_t mqd) {
    return (int32_t)mq_close(mqd);
}

int32_t libc_vxworks_mod_mq_unlink(const char* name) {
    return (int32_t)mq_unlink(name);
}

int64_t libc_vxworks_mod_mq_receive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio) {
    return (int64_t)mq_receive(mqd, msg_ptr, msg_len, msg_prio);
}

int64_t libc_vxworks_mod_mq_timedreceive(int32_t mqd, char* msg_ptr, uint64_t msg_len, void* msg_prio, void* abs_timeout) {
    return (int64_t)mq_timedreceive(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_vxworks_mod_mq_send(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio) {
    return (int32_t)mq_send(mqd, msg_ptr, msg_len, msg_prio);
}

int32_t libc_vxworks_mod_mq_timedsend(int32_t mqd, const char* msg_ptr, uint64_t msg_len, uint32_t msg_prio, void* abs_timeout) {
    return (int32_t)mq_timedsend(mqd, msg_ptr, msg_len, msg_prio, abs_timeout);
}

int32_t libc_vxworks_mod_mq_getattr(int32_t mqd, void* attr) {
    return (int32_t)mq_getattr(mqd, attr);
}

int32_t libc_vxworks_mod_mq_setattr(int32_t mqd, void* newattr, void* oldattr) {
    return (int32_t)mq_setattr(mqd, newattr, oldattr);
}

uint32_t libc_vxworks_mod_vx_cpu_enabled_get(void) {
    return (uint32_t)vxCpuEnabledGet();
}

uint32_t libc_vxworks_mod_vx_cpu_configured_get(void) {
    return (uint32_t)vxCpuConfiguredGet();
}

