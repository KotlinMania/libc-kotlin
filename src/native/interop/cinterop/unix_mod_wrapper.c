#include "unix_mod_wrapper.h"
#include <errno.h>
#include <ctype.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <signal.h>
#include <time.h>
#include <locale.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#include <dirent.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/mman.h>
#include <pthread.h>
#include <dlfcn.h>
#include <poll.h>
#include <semaphore.h>
#endif

int32_t libc_unix_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_unix_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_unix_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_unix_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_unix_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_unix_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_unix_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_unix_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_unix_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_unix_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_unix_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_unix_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_unix_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_unix_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void libc_unix_mod_qsort(void* base, uint64_t num, uint64_t size, void* compar) {
    qsort(base, num, size, compar);
}

void* libc_unix_mod_bsearch(void* key, void* base, uint64_t num, uint64_t size, void* compar) {
    return (void*)bsearch(key, base, num, size, compar);
}

void* libc_unix_mod_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_unix_mod_freopen(const char* filename, const char* mode, void* file) {
    return (void*)freopen(filename, mode, (FILE*)file);
}

int32_t libc_unix_mod_fflush(void* file) {
    return (int32_t)fflush((FILE*)file);
}

int32_t libc_unix_mod_fclose(void* file) {
    return (int32_t)fclose((FILE*)file);
}

int32_t libc_unix_mod_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_unix_mod_rename(const char* oldname, const char* newname) {
    return (int32_t)rename(oldname, newname);
}

void* libc_unix_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_unix_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_unix_mod_setbuf(void* stream, char* buf) {
    setbuf((FILE*)stream, buf);
}

int32_t libc_unix_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_unix_mod_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_unix_mod_fgetc(void* stream) {
    return (int32_t)fgetc((FILE*)stream);
}

char* libc_unix_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, (FILE*)stream);
}

int32_t libc_unix_mod_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, (FILE*)stream);
}

int32_t libc_unix_mod_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, (FILE*)stream);
}

int32_t libc_unix_mod_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_unix_mod_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, (FILE*)stream);
}

uint64_t libc_unix_mod_fread(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread(ptr, size, nobj, (FILE*)stream);
}

uint64_t libc_unix_mod_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite(ptr, size, nobj, (FILE*)stream);
}

int32_t libc_unix_mod_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek((FILE*)stream, offset, whence);
}

int64_t libc_unix_mod_ftell(void* stream) {
    return (int64_t)ftell((FILE*)stream);
}

void libc_unix_mod_rewind(void* stream) {
    rewind((FILE*)stream);
}

int32_t libc_unix_mod_fgetpos(void* stream, void* ptr) {
    return (int32_t)fgetpos((FILE*)stream, ptr);
}

int32_t libc_unix_mod_fsetpos(void* stream, void* ptr) {
    return (int32_t)fsetpos((FILE*)stream, ptr);
}

int32_t libc_unix_mod_feof(void* stream) {
    return (int32_t)feof((FILE*)stream);
}

int32_t libc_unix_mod_ferror(void* stream) {
    return (int32_t)ferror((FILE*)stream);
}

void libc_unix_mod_clearerr(void* stream) {
    clearerr((FILE*)stream);
}

void libc_unix_mod_perror(const char* s) {
    perror(s);
}

double libc_unix_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_unix_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_unix_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_unix_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_unix_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_unix_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_unix_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_unix_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_unix_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_unix_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

void* libc_unix_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_unix_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_unix_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_unix_mod_free(void* p) {
    free(p);
}

void libc_unix_mod_abort(void) {
    abort();
}

void libc_unix_mod_exit(int32_t status) {
    exit(status);
}

int32_t libc_unix_mod_system(const char* s) {
#if defined(__MAC_OS_X_VERSION_MIN_REQUIRED) || defined(__linux__)
    return (int32_t)system(s);
#else
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

char* libc_unix_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

char* libc_unix_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_unix_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_unix_mod_stpcpy(char* dst, const char* src) {
    return (char*)stpcpy(dst, src);
}

char* libc_unix_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_unix_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_unix_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_unix_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_unix_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_unix_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_unix_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_unix_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_unix_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_unix_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_unix_mod_strndup(const char* cs, uint64_t n) {
    return (char*)strndup(cs, n);
}

char* libc_unix_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_unix_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

int32_t libc_unix_mod_strcasecmp(const char* s1, const char* s2) {
    return (int32_t)strcasecmp(s1, s2);
}

int32_t libc_unix_mod_strncasecmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncasecmp(s1, s2, n);
}

uint64_t libc_unix_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_unix_mod_strnlen(const char* cs, uint64_t maxlen) {
    return (uint64_t)strnlen(cs, maxlen);
}

char* libc_unix_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_unix_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

char* libc_unix_mod_strtok_r(char* s, const char* t, void* p) {
    return (char*)strtok_r(s, t, p);
}

uint64_t libc_unix_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

char* libc_unix_mod_strsignal(int32_t sig) {
    return (char*)strsignal(sig);
}

uint64_t libc_unix_mod_wcslen(void* buf) {
    return (uint64_t)wcslen(buf);
}

uint64_t libc_unix_mod_wcstombs(char* dest, void* src, uint64_t n) {
    return (uint64_t)wcstombs(dest, src, n);
}

void* libc_unix_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

void* libc_unix_mod_wmemchr(void* cx, int32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

int32_t libc_unix_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_unix_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_unix_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_unix_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

void* libc_unix_mod_memccpy(void* dest, void* src, int32_t c, uint64_t n) {
    return (void*)memccpy(dest, src, c, n);
}

void* libc_unix_mod_getpwnam(const char* name) {
    return (void*)getpwnam(name);
}

void* libc_unix_mod_getpwuid(uint16_t uid) {
    return (void*)getpwuid(uid);
}

int32_t libc_unix_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_unix_mod_putchar_unlocked(int32_t c) {
    return (int32_t)putchar_unlocked(c);
}

int32_t libc_unix_mod_socket(int32_t domain, int32_t ty, int32_t protocol) {
    return (int32_t)socket(domain, ty, protocol);
}

int32_t libc_unix_mod_connect(int32_t socket, void* address, uint32_t len) {
    return (int32_t)connect(socket, address, len);
}

int32_t libc_unix_mod_listen(int32_t socket, int32_t backlog) {
    return (int32_t)listen(socket, backlog);
}

int32_t libc_unix_mod_accept(int32_t socket, void* address, void* address_len) {
    return (int32_t)accept(socket, address, address_len);
}

int32_t libc_unix_mod_getpeername(int32_t socket, void* address, void* address_len) {
    return (int32_t)getpeername(socket, address, address_len);
}

int32_t libc_unix_mod_getsockname(int32_t socket, void* address, void* address_len) {
    return (int32_t)getsockname(socket, address, address_len);
}

int32_t libc_unix_mod_setsockopt(int32_t socket, int32_t level, int32_t name, void* value, uint32_t option_len) {
    return (int32_t)setsockopt(socket, level, name, value, option_len);
}

int32_t libc_unix_mod_socketpair(int32_t domain, int32_t type_, int32_t protocol, void* socket_vector) {
    return (int32_t)socketpair(domain, type_, protocol, socket_vector);
}

int64_t libc_unix_mod_sendto(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_unix_mod_shutdown(int32_t socket, int32_t how) {
    return (int32_t)shutdown(socket, how);
}

int32_t libc_unix_mod_chmod(const char* path, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)chmod(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_fchmod(int32_t fd, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)fchmod(fd, mode);
#else
    (void)fd;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)fstat(fildes, buf);
}

int32_t libc_unix_mod_mkdir(const char* path, uint32_t mode) {
    return (int32_t)mkdir(path, mode);
}

int32_t libc_unix_mod_stat(const char* path, void* buf) {
    return (int32_t)stat(path, buf);
}

int32_t libc_unix_mod_pclose(void* stream) {
    return (int32_t)pclose((FILE*)stream);
}

void* libc_unix_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)fdopen(fd, mode);
}

int32_t libc_unix_mod_fileno(void* stream) {
    return (int32_t)fileno((FILE*)stream);
}

int32_t libc_unix_mod_creat(const char* path, uint32_t mode) {
    return (int32_t)creat(path, mode);
}

void* libc_unix_mod_opendir(const char* dirname) {
#if !defined(_WIN32)
    return (void*)opendir(dirname);
#else
    (void)dirname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_unix_mod_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_unix_mod_closedir(void* dirp) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_unix_mod_rewinddir(void* dirp) {
#if !defined(_WIN32)
    rewinddir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
#endif
}

int32_t libc_unix_mod_fchmodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t flags) {
    return (int32_t)fchmodat(dirfd, pathname, mode, flags);
}

int32_t libc_unix_mod_fchown(int32_t fd, uint16_t owner, uint16_t group) {
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

int32_t libc_unix_mod_fchownat(int32_t dirfd, const char* pathname, uint16_t owner, uint16_t group, int32_t flags) {
    return (int32_t)fchownat(dirfd, pathname, owner, group, flags);
}

int32_t libc_unix_mod_fstatat(int32_t dirfd, const char* pathname, void* buf, int32_t flags) {
    return (int32_t)fstatat(dirfd, pathname, buf, flags);
}

int32_t libc_unix_mod_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_unix_mod_renameat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)renameat(olddirfd, oldpath, newdirfd, newpath);
}

int32_t libc_unix_mod_symlinkat(const char* target, int32_t newdirfd, const char* linkpath) {
    return (int32_t)symlinkat(target, newdirfd, linkpath);
}

int32_t libc_unix_mod_unlinkat(int32_t dirfd, const char* pathname, int32_t flags) {
    return (int32_t)unlinkat(dirfd, pathname, flags);
}

int32_t libc_unix_mod_access(const char* path, int32_t amode) {
    return (int32_t)access(path, amode);
}

uint32_t libc_unix_mod_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_unix_mod_chdir(const char* dir) {
    return (int32_t)chdir(dir);
}

int32_t libc_unix_mod_fchdir(int32_t dirfd) {
    return (int32_t)fchdir(dirfd);
}

int32_t libc_unix_mod_chown(const char* path, uint16_t uid, uint16_t gid) {
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

int32_t libc_unix_mod_lchown(const char* path, uint16_t uid, uint16_t gid) {
    return (int32_t)lchown(path, uid, gid);
}

int32_t libc_unix_mod_close(int32_t fd) {
    return (int32_t)close(fd);
}

int32_t libc_unix_mod_dup(int32_t fd) {
    return (int32_t)dup(fd);
}

int32_t libc_unix_mod_dup2(int32_t src, int32_t dst) {
    return (int32_t)dup2(src, dst);
}

int32_t libc_unix_mod_execv(const char* prog, void* argv) {
    return (int32_t)execv(prog, argv);
}

int32_t libc_unix_mod_execve(const char* prog, void* argv, void* envp) {
    return (int32_t)execve(prog, argv, envp);
}

int32_t libc_unix_mod_execvp(const char* c, void* argv) {
    return (int32_t)execvp(c, argv);
}

int32_t libc_unix_mod_fork(void) {
#if !defined(_WIN32)
    return (int32_t)fork();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_unix_mod_fpathconf(int32_t filedes, int32_t name) {
    return (int64_t)fpathconf(filedes, name);
}

char* libc_unix_mod_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

uint16_t libc_unix_mod_getegid(void) {
#if !defined(_WIN32)
    return (uint16_t)getegid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t libc_unix_mod_geteuid(void) {
#if !defined(_WIN32)
    return (uint16_t)geteuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t libc_unix_mod_getgid(void) {
#if !defined(_WIN32)
    return (uint16_t)getgid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_unix_mod_getgroups(int32_t ngroups_max, void* groups) {
    return (int32_t)getgroups(ngroups_max, groups);
}

char* libc_unix_mod_getlogin(void) {
    return (char*)getlogin();
}

int32_t libc_unix_mod_getopt(int32_t argc, void* argv, const char* optstr) {
    return (int32_t)getopt(argc, argv, optstr);
}

int32_t libc_unix_mod_getpgid(int32_t pid) {
    return (int32_t)getpgid(pid);
}

int32_t libc_unix_mod_getpgrp(void) {
    return (int32_t)getpgrp();
}

int32_t libc_unix_mod_getpid(void) {
    return (int32_t)getpid();
}

int32_t libc_unix_mod_getppid(void) {
    return (int32_t)getppid();
}

uint16_t libc_unix_mod_getuid(void) {
#if !defined(_WIN32)
    return (uint16_t)getuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_unix_mod_isatty(int32_t fd) {
    return (int32_t)isatty(fd);
}

int32_t libc_unix_mod_link(const char* src, const char* dst) {
#if !defined(_WIN32)
    return (int32_t)link(src, dst);
#else
    (void)src;
    (void)dst;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_unix_mod_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_unix_mod_pathconf(const char* path, int32_t name) {
    return (int64_t)pathconf(path, name);
}

int32_t libc_unix_mod_pipe(void* fds) {
#if !defined(_WIN32)
    return (int32_t)pipe(fds);
#else
    (void)fds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_posix_memalign(void* memptr, uint64_t align, uint64_t size) {
    return (int32_t)posix_memalign(memptr, align, size);
}

void* libc_unix_mod_aligned_alloc(uint64_t alignment, uint64_t size) {
    return (void*)aligned_alloc(alignment, size);
}

int64_t libc_unix_mod_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int32_t libc_unix_mod_rmdir(const char* path) {
    return (int32_t)rmdir(path);
}

int32_t libc_unix_mod_seteuid(uint16_t uid) {
    return (int32_t)seteuid(uid);
}

int32_t libc_unix_mod_setegid(uint16_t gid) {
    return (int32_t)setegid(gid);
}

int32_t libc_unix_mod_setgid(uint16_t gid) {
    return (int32_t)setgid(gid);
}

int32_t libc_unix_mod_setpgid(int32_t pid, int32_t pgid) {
    return (int32_t)setpgid(pid, pgid);
}

int32_t libc_unix_mod_setsid(void) {
    return (int32_t)setsid();
}

int32_t libc_unix_mod_setuid(uint16_t uid) {
    return (int32_t)setuid(uid);
}

int32_t libc_unix_mod_setreuid(uint16_t ruid, uint16_t euid) {
    return (int32_t)setreuid(ruid, euid);
}

int32_t libc_unix_mod_setregid(uint16_t rgid, uint16_t egid) {
    return (int32_t)setregid(rgid, egid);
}

uint32_t libc_unix_mod_sleep(uint32_t secs) {
#if !defined(_WIN32)
    return (uint32_t)sleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_unix_mod_nanosleep(void* rqtp, void* rmtp) {
    return (int32_t)nanosleep(rqtp, rmtp);
}

int32_t libc_unix_mod_tcgetpgrp(int32_t fd) {
    return (int32_t)tcgetpgrp(fd);
}

int32_t libc_unix_mod_tcsetpgrp(int32_t fd, int32_t pgrp) {
    return (int32_t)tcsetpgrp(fd, pgrp);
}

char* libc_unix_mod_ttyname(int32_t fd) {
    return (char*)ttyname(fd);
}

int32_t libc_unix_mod_ttyname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ttyname_r(fd, buf, buflen);
}

int32_t libc_unix_mod_unlink(const char* c) {
    return (int32_t)unlink(c);
}

int32_t libc_unix_mod_wait(void* status) {
#if !defined(_WIN32)
    return (int32_t)wait(status);
#else
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_waitpid(int32_t pid, void* status, int32_t options) {
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

int64_t libc_unix_mod_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int64_t libc_unix_mod_pread(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread(fd, buf, count, offset);
}

int64_t libc_unix_mod_pwrite(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite(fd, buf, count, offset);
}

uint32_t libc_unix_mod_umask(uint32_t mask) {
    return (uint32_t)umask(mask);
}

int32_t libc_unix_mod_utime(const char* file, void* buf) {
    return (int32_t)utime(file, buf);
}

int32_t libc_unix_mod_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_unix_mod_killpg(int32_t pgrp, int32_t sig) {
    return (int32_t)killpg(pgrp, sig);
}

int32_t libc_unix_mod_mlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)mlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_munlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_unix_mod_munlockall(void) {
    return (int32_t)munlockall();
}

void* libc_unix_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
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

int32_t libc_unix_mod_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t libc_unix_mod_if_nametoindex(const char* ifname) {
    return (uint32_t)if_nametoindex(ifname);
}

char* libc_unix_mod_if_indextoname(uint32_t ifindex, char* ifname) {
    return (char*)if_indextoname(ifindex, ifname);
}

int32_t libc_unix_mod_lstat(const char* path, void* buf) {
#if !defined(_WIN32)
    return (int32_t)lstat(path, buf);
#else
    (void)path;
    (void)buf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_fsync(int32_t fd) {
    return (int32_t)fsync(fd);
}

int32_t libc_unix_mod_setenv(const char* name, const char* val, int32_t overwrite) {
#if !defined(_WIN32)
    return (int32_t)setenv(name, val, overwrite);
#else
    (void)name;
    (void)val;
    (void)overwrite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_unsetenv(const char* name) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_symlink(const char* path1, const char* path2) {
#if !defined(_WIN32)
    return (int32_t)symlink(path1, path2);
#else
    (void)path1;
    (void)path2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_truncate(const char* path, int64_t length) {
    return (int32_t)truncate(path, length);
}

int32_t libc_unix_mod_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

uint64_t libc_unix_mod_signal(int32_t signum, uint64_t handler) {
    return (uint64_t)signal(signum, (void (*)(int))handler);
}

int32_t libc_unix_mod_getrusage(int32_t resource, void* usage) {
    return (int32_t)getrusage(resource, usage);
}

char* libc_unix_mod_realpath(const char* pathname, char* resolved) {
    return (char*)realpath(pathname, resolved);
}

int32_t libc_unix_mod_times(void* buf) {
    return (int32_t)times(buf);
}

int32_t libc_unix_mod_pthread_self(void) {
#if !defined(_WIN32)
    return (int32_t)pthread_self();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_pthread_equal(int32_t t1, int32_t t2) {
#if !defined(_WIN32)
    return (int32_t)pthread_equal(t1, t2);
#else
    (void)t1;
    (void)t2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_pthread_join(int32_t native, void* value) {
#if !defined(_WIN32)
    return (int32_t)pthread_join(native, value);
#else
    (void)native;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_unix_mod_pthread_exit(void* value) {
    pthread_exit(value);
}

int32_t libc_unix_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_unix_mod_pthread_attr_destroy(void* attr) {
    return (int32_t)pthread_attr_destroy(attr);
}

int32_t libc_unix_mod_pthread_attr_getstacksize(void* attr, void* stacksize) {
    return (int32_t)pthread_attr_getstacksize(attr, stacksize);
}

int32_t libc_unix_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size) {
    return (int32_t)pthread_attr_setstacksize(attr, stack_size);
}

int32_t libc_unix_mod_pthread_attr_setdetachstate(void* attr, int32_t state) {
    return (int32_t)pthread_attr_setdetachstate(attr, state);
}

int32_t libc_unix_mod_pthread_detach(int32_t thread) {
#if !defined(_WIN32)
    return (int32_t)pthread_detach(thread);
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_unix_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_unix_mod_pthread_key_delete(int32_t key) {
    return (int32_t)pthread_key_delete(key);
}

void* libc_unix_mod_pthread_getspecific(int32_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_unix_mod_pthread_setspecific(int32_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

int32_t libc_unix_mod_pthread_mutex_init(void* lock, void* attr) {
    return (int32_t)pthread_mutex_init(lock, attr);
}

int32_t libc_unix_mod_pthread_mutex_destroy(void* lock) {
    return (int32_t)pthread_mutex_destroy(lock);
}

int32_t libc_unix_mod_pthread_mutex_lock(void* lock) {
    return (int32_t)pthread_mutex_lock(lock);
}

int32_t libc_unix_mod_pthread_mutex_trylock(void* lock) {
    return (int32_t)pthread_mutex_trylock(lock);
}

int32_t libc_unix_mod_pthread_mutex_unlock(void* lock) {
    return (int32_t)pthread_mutex_unlock(lock);
}

int32_t libc_unix_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_unix_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_unix_mod_pthread_mutexattr_settype(void* attr, int32_t _type) {
    return (int32_t)pthread_mutexattr_settype(attr, _type);
}

int32_t libc_unix_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_unix_mod_pthread_cond_wait(void* cond, void* lock) {
    return (int32_t)pthread_cond_wait(cond, lock);
}

int32_t libc_unix_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, lock, abstime);
}

int32_t libc_unix_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_unix_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_unix_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_unix_mod_pthread_condattr_init(void* attr) {
    return (int32_t)pthread_condattr_init(attr);
}

int32_t libc_unix_mod_pthread_condattr_destroy(void* attr) {
    return (int32_t)pthread_condattr_destroy(attr);
}

int32_t libc_unix_mod_pthread_rwlock_init(void* lock, void* attr) {
    return (int32_t)pthread_rwlock_init(lock, attr);
}

int32_t libc_unix_mod_pthread_rwlock_destroy(void* lock) {
    return (int32_t)pthread_rwlock_destroy(lock);
}

int32_t libc_unix_mod_pthread_rwlock_rdlock(void* lock) {
    return (int32_t)pthread_rwlock_rdlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_tryrdlock(void* lock) {
    return (int32_t)pthread_rwlock_tryrdlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_wrlock(void* lock) {
    return (int32_t)pthread_rwlock_wrlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_trywrlock(void* lock) {
    return (int32_t)pthread_rwlock_trywrlock(lock);
}

int32_t libc_unix_mod_pthread_rwlock_unlock(void* lock) {
    return (int32_t)pthread_rwlock_unlock(lock);
}

int32_t libc_unix_mod_pthread_rwlockattr_init(void* attr) {
    return (int32_t)pthread_rwlockattr_init(attr);
}

int32_t libc_unix_mod_pthread_rwlockattr_destroy(void* attr) {
    return (int32_t)pthread_rwlockattr_destroy(attr);
}

int32_t libc_unix_mod_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_unix_mod_raise(int32_t signum) {
    return (int32_t)raise(signum);
}

int32_t libc_unix_mod_utimes(const char* filename, void* times) {
    return (int32_t)utimes(filename, times);
}

void* libc_unix_mod_dlopen(const char* filename, int32_t flag) {
#if !defined(_WIN32)
    return (void*)dlopen(filename, flag);
#else
    (void)filename;
    (void)flag;
    errno = ENOSYS;
    return NULL;
#endif
}

char* libc_unix_mod_dlerror(void) {
#if !defined(_WIN32)
    return (char*)dlerror();
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_unix_mod_dlsym(void* handle, const char* symbol) {
#if !defined(_WIN32)
    return (void*)dlsym(handle, symbol);
#else
    (void)handle;
    (void)symbol;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_unix_mod_dlclose(void* handle) {
#if !defined(_WIN32)
    return (int32_t)dlclose(handle);
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_getaddrinfo(const char* node, const char* service, void* hints, void* res) {
    return (int32_t)getaddrinfo(node, service, hints, res);
}

void libc_unix_mod_freeaddrinfo(void* res) {
    freeaddrinfo(res);
}

const char* libc_unix_mod_hstrerror(int32_t errcode) {
    return (const char*)hstrerror(errcode);
}

const char* libc_unix_mod_gai_strerror(int32_t errcode) {
    return (const char*)gai_strerror(errcode);
}

int32_t libc_unix_mod_res_init(void) {
    return (int32_t)res_init();
}

void* libc_unix_mod_gmtime_r(void* time_p, void* result) {
    return (void*)gmtime_r(time_p, result);
}

void* libc_unix_mod_localtime_r(void* time_p, void* result) {
    return (void*)localtime_r(time_p, result);
}

int64_t libc_unix_mod_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

int64_t libc_unix_mod_time(void* time_p) {
    return (int64_t)time((time_t*)time_p);
}

void* libc_unix_mod_gmtime(void* time_p) {
    return (void*)gmtime(time_p);
}

void* libc_unix_mod_localtime(void* time_p) {
    return (void*)localtime(time_p);
}

double libc_unix_mod_difftime(int64_t time1, int64_t time0) {
    return (double)difftime(time1, time0);
}

int64_t libc_unix_mod_timegm(void* tm) {
    return (int64_t)timegm(tm);
}

int32_t libc_unix_mod_mknod(const char* pathname, uint32_t mode, int32_t dev) {
#if !defined(_WIN32)
    return (int32_t)mknod(pathname, mode, dev);
#else
    (void)pathname;
    (void)mode;
    (void)dev;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_gethostname(char* name, uint64_t len) {
    return (int32_t)gethostname(name, len);
}

void libc_unix_mod_endservent(void) {
    endservent();
}

void* libc_unix_mod_getservbyname(const char* name, const char* proto) {
    return (void*)getservbyname(name, proto);
}

void* libc_unix_mod_getservbyport(int32_t port, const char* proto) {
    return (void*)getservbyport(port, proto);
}

void* libc_unix_mod_getservent(void) {
    return (void*)getservent();
}

void libc_unix_mod_setservent(int32_t stayopen) {
    setservent(stayopen);
}

void* libc_unix_mod_getprotobyname(const char* name) {
    return (void*)getprotobyname(name);
}

void* libc_unix_mod_getprotobynumber(int32_t proto) {
    return (void*)getprotobynumber(proto);
}

int32_t libc_unix_mod_chroot(const char* name) {
    return (int32_t)chroot(name);
}

int32_t libc_unix_mod_usleep(int32_t secs) {
#if !defined(_WIN32)
    return (int32_t)usleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_unix_mod_send(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)send(socket, buf, len, flags);
}

int64_t libc_unix_mod_recv(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)recv(socket, buf, len, flags);
}

int32_t libc_unix_mod_putenv(char* string) {
    return (int32_t)putenv(string);
}

int32_t libc_unix_mod_poll(void* fds, int32_t nfds, int32_t timeout) {
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

int32_t libc_unix_mod_select(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout) {
    return (int32_t)select(nfds, readfds, writefds, errorfds, timeout);
}

char* libc_unix_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_unix_mod_localeconv(void) {
    return (void*)localeconv();
}

int32_t libc_unix_mod_sem_wait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_wait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_sem_trywait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_trywait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_sem_post(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_post(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_statvfs(const char* path, void* buf) {
    return (int32_t)statvfs(path, buf);
}

int32_t libc_unix_mod_fstatvfs(int32_t fd, void* buf) {
    return (int32_t)fstatvfs(fd, buf);
}

int32_t libc_unix_mod_sigemptyset(void* set) {
    return (int32_t)sigemptyset((sigset_t*)set);
}

int32_t libc_unix_mod_sigaddset(void* set, int32_t signum) {
    return (int32_t)sigaddset((sigset_t*)set, signum);
}

int32_t libc_unix_mod_sigfillset(void* set) {
    return (int32_t)sigfillset((sigset_t*)set);
}

int32_t libc_unix_mod_sigdelset(void* set, int32_t signum) {
    return (int32_t)sigdelset((sigset_t*)set, signum);
}

int32_t libc_unix_mod_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember((sigset_t*)set, signum);
}

int32_t libc_unix_mod_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, (sigset_t*)set, (sigset_t*)oldset);
}

int32_t libc_unix_mod_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int64_t libc_unix_mod_sysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_mkfifo(const char* path, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)mkfifo(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko((FILE*)stream, offset, whence);
}

int64_t libc_unix_mod_ftello(void* stream) {
    return (int64_t)ftello((FILE*)stream);
}

int32_t libc_unix_mod_tcdrain(int32_t fd) {
    return (int32_t)tcdrain(fd);
}

int32_t libc_unix_mod_cfgetispeed(void* termios) {
    return (int32_t)cfgetispeed(termios);
}

int32_t libc_unix_mod_cfgetospeed(void* termios) {
    return (int32_t)cfgetospeed(termios);
}

int32_t libc_unix_mod_cfsetispeed(void* termios, int32_t speed) {
    return (int32_t)cfsetispeed(termios, speed);
}

int32_t libc_unix_mod_cfsetospeed(void* termios, int32_t speed) {
    return (int32_t)cfsetospeed(termios, speed);
}

int32_t libc_unix_mod_tcgetattr(int32_t fd, void* termios) {
    return (int32_t)tcgetattr(fd, termios);
}

int32_t libc_unix_mod_tcsetattr(int32_t fd, int32_t optional_actions, void* termios) {
    return (int32_t)tcsetattr(fd, optional_actions, termios);
}

int32_t libc_unix_mod_tcflow(int32_t fd, int32_t action) {
    return (int32_t)tcflow(fd, action);
}

int32_t libc_unix_mod_tcflush(int32_t fd, int32_t action) {
    return (int32_t)tcflush(fd, action);
}

int32_t libc_unix_mod_tcgetsid(int32_t fd) {
    return (int32_t)tcgetsid(fd);
}

int32_t libc_unix_mod_tcsendbreak(int32_t fd, int32_t duration) {
    return (int32_t)tcsendbreak(fd, duration);
}

int32_t libc_unix_mod_mkstemp(char* template) {
    return (int32_t)mkstemp(template);
}

char* libc_unix_mod_mkdtemp(char* template) {
    return (char*)mkdtemp(template);
}

char* libc_unix_mod_tmpnam(char* ptr) {
    return (char*)tmpnam(ptr);
}

void libc_unix_mod_openlog(const char* ident, int32_t logopt, int32_t facility) {
    openlog(ident, logopt, facility);
}

void libc_unix_mod_closelog(void) {
    closelog();
}

int32_t libc_unix_mod_setlogmask(int32_t maskpri) {
    return (int32_t)setlogmask(maskpri);
}

int32_t libc_unix_mod_nice(int32_t incr) {
    return (int32_t)nice(incr);
}

int32_t libc_unix_mod_grantpt(int32_t fd) {
    return (int32_t)grantpt(fd);
}

int32_t libc_unix_mod_posix_openpt(int32_t flags) {
    return (int32_t)posix_openpt(flags);
}

char* libc_unix_mod_ptsname(int32_t fd) {
    return (char*)ptsname(fd);
}

int32_t libc_unix_mod_unlockpt(int32_t fd) {
    return (int32_t)unlockpt(fd);
}

char* libc_unix_mod_strcasestr(const char* cs, const char* ct) {
    return (char*)strcasestr(cs, ct);
}

int64_t libc_unix_mod_getline(void* lineptr, void* n, void* stream) {
    return (int64_t)getline(lineptr, n, (FILE*)stream);
}

int32_t libc_unix_mod_lockf(int32_t fd, int32_t cmd, int64_t len) {
    return (int32_t)lockf(fd, cmd, len);
}

int32_t libc_unix_mod_adjtime(void* delta, void* olddelta) {
    return (int32_t)adjtime(delta, olddelta);
}

char* libc_unix_mod_stpncpy(char* dst, const char* src, uint64_t n) {
    return (char*)stpncpy(dst, src, n);
}

int32_t libc_unix_mod_sigqueue(int32_t pid, int32_t sig, int32_t value) {
    return (int32_t)sigqueue(pid, sig, value);
}

uint64_t libc_unix_mod_confstr(int32_t name, char* buf, uint64_t len) {
    return (uint64_t)confstr(name, buf, len);
}

int32_t libc_unix_mod_dladdr(void* addr, void* info) {
    return (int32_t)dladdr(addr, info);
}

int32_t libc_unix_mod_flock(int32_t fd, int32_t operation) {
    return (int32_t)flock(fd, operation);
}

void* libc_unix_mod_open_wmemstream(void* ptr, void* sizeloc) {
    return (void*)open_wmemstream(ptr, sizeloc);
}

int32_t libc_unix_mod_getsid(int32_t pid) {
    return (int32_t)getsid(pid);
}

int32_t libc_unix_mod_pause(void) {
    return (int32_t)pause();
}

int32_t libc_unix_mod_mkdirat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkdirat(dirfd, pathname, mode);
}

void* libc_unix_mod_fdopendir(int32_t fd) {
    return (void*)fdopendir(fd);
}

int32_t libc_unix_mod_readdir_r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir_r((DIR*)dirp, entry, result);
}

int32_t libc_unix_mod_readlinkat(int32_t dirfd, const char* pathname, char* buf, uint64_t bufsiz) {
    return (int32_t)readlinkat(dirfd, pathname, buf, bufsiz);
}

int32_t libc_unix_mod_readlink(const char* path, char* buf, uint64_t bufsz) {
#if !defined(_WIN32)
    return (int32_t)readlink(path, buf, bufsz);
#else
    (void)path;
    (void)buf;
    (void)bufsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_unix_mod_pselect(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout, void* sigmask) {
    return (int32_t)pselect(nfds, readfds, writefds, errorfds, timeout, sigmask);
}

int32_t libc_unix_mod_sigaction(int32_t signum, void* act, void* oldact) {
    return (int32_t)sigaction(signum, act, oldact);
}

void* libc_unix_mod_fmemopen(void* buf, uint64_t size, const char* mode) {
    return (void*)fmemopen(buf, size, mode);
}

void* libc_unix_mod_open_memstream(void* ptr, void* sizeloc) {
    return (void*)open_memstream(ptr, sizeloc);
}

int32_t libc_unix_mod_atexit(int32_t cb) {
    return (int32_t)atexit(cb);
}

int32_t libc_unix_mod_cfmakeraw(void* termios) {
    return (int32_t)cfmakeraw(termios);
}

int32_t libc_unix_mod_cfsetspeed(void* termios, int32_t speed) {
    return (int32_t)cfsetspeed(termios, speed);
}

int32_t libc_unix_mod_fnmatch(const char* pattern, const char* name, int32_t flags) {
    return (int32_t)fnmatch(pattern, name, flags);
}

