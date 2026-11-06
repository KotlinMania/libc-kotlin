#include "fuchsia_mod_wrapper.h"
#include <errno.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
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
#include <sys/ioctl.h>
#endif

int32_t libc_fuchsia_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_fuchsia_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_fuchsia_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_fuchsia_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_fuchsia_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_fuchsia_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_fuchsia_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_fuchsia_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_fuchsia_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_fuchsia_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_fuchsia_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_fuchsia_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_fuchsia_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_fuchsia_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void* libc_fuchsia_mod_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_fuchsia_mod_freopen(const char* filename, const char* mode, void* file) {
    return (void*)freopen(filename, mode, (FILE*)file);
}

int32_t libc_fuchsia_mod_fflush(void* file) {
    return (int32_t)fflush((FILE*)file);
}

int32_t libc_fuchsia_mod_fclose(void* file) {
    return (int32_t)fclose((FILE*)file);
}

int32_t libc_fuchsia_mod_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_fuchsia_mod_rename(const char* oldname, const char* newname) {
    return (int32_t)rename(oldname, newname);
}

void* libc_fuchsia_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_fuchsia_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_fuchsia_mod_setbuf(void* stream, char* buf) {
    setbuf((FILE*)stream, buf);
}

int32_t libc_fuchsia_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_fuchsia_mod_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_fuchsia_mod_fgetc(void* stream) {
    return (int32_t)fgetc((FILE*)stream);
}

char* libc_fuchsia_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, (FILE*)stream);
}

int32_t libc_fuchsia_mod_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, (FILE*)stream);
}

int32_t libc_fuchsia_mod_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, (FILE*)stream);
}

int32_t libc_fuchsia_mod_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_fuchsia_mod_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, (FILE*)stream);
}

uint64_t libc_fuchsia_mod_fread(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread(ptr, size, nobj, (FILE*)stream);
}

uint64_t libc_fuchsia_mod_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite(ptr, size, nobj, (FILE*)stream);
}

int32_t libc_fuchsia_mod_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek((FILE*)stream, offset, whence);
}

int64_t libc_fuchsia_mod_ftell(void* stream) {
    return (int64_t)ftell((FILE*)stream);
}

void libc_fuchsia_mod_rewind(void* stream) {
    rewind((FILE*)stream);
}

int32_t libc_fuchsia_mod_fgetpos(void* stream, void* ptr) {
    return (int32_t)fgetpos((FILE*)stream, ptr);
}

int32_t libc_fuchsia_mod_fsetpos(void* stream, void* ptr) {
    return (int32_t)fsetpos((FILE*)stream, ptr);
}

int32_t libc_fuchsia_mod_feof(void* stream) {
    return (int32_t)feof((FILE*)stream);
}

int32_t libc_fuchsia_mod_ferror(void* stream) {
    return (int32_t)ferror((FILE*)stream);
}

void libc_fuchsia_mod_perror(const char* s) {
    perror(s);
}

double libc_fuchsia_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_fuchsia_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_fuchsia_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_fuchsia_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_fuchsia_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_fuchsia_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_fuchsia_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_fuchsia_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_fuchsia_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_fuchsia_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

void* libc_fuchsia_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_fuchsia_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

void* libc_fuchsia_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_fuchsia_mod_free(void* p) {
    free(p);
}

void libc_fuchsia_mod_abort(void) {
    abort();
}

void libc_fuchsia_mod_exit(int32_t status) {
    exit(status);
}

int32_t libc_fuchsia_mod_atexit(int32_t cb) {
    return (int32_t)atexit(cb);
}

int32_t libc_fuchsia_mod_system(const char* s) {
    return (int32_t)system(s);
}

char* libc_fuchsia_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

char* libc_fuchsia_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_fuchsia_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_fuchsia_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_fuchsia_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_fuchsia_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_fuchsia_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_fuchsia_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_fuchsia_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_fuchsia_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_fuchsia_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_fuchsia_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_fuchsia_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_fuchsia_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_fuchsia_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

uint64_t libc_fuchsia_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_fuchsia_mod_strnlen(const char* cs, uint64_t maxlen) {
    return (uint64_t)strnlen(cs, maxlen);
}

char* libc_fuchsia_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_fuchsia_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

uint64_t libc_fuchsia_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

uint64_t libc_fuchsia_mod_wcslen(void* buf) {
    return (uint64_t)wcslen(buf);
}

uint64_t libc_fuchsia_mod_wcstombs(char* dest, void* src, uint64_t n) {
    return (uint64_t)wcstombs(dest, src, n);
}

void* libc_fuchsia_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

void* libc_fuchsia_mod_wmemchr(void* cx, int32_t c, uint64_t n) {
    return (void*)wmemchr(cx, c, n);
}

int32_t libc_fuchsia_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_fuchsia_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_fuchsia_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_fuchsia_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

int32_t libc_fuchsia_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_fuchsia_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_fuchsia_mod_rand(void) {
    return (int32_t)rand();
}

void libc_fuchsia_mod_srand(uint32_t seed) {
    srand(seed);
}

void* libc_fuchsia_mod_getpwnam(const char* name) {
    return (void*)getpwnam(name);
}

void* libc_fuchsia_mod_getpwuid(uint32_t uid) {
    return (void*)getpwuid(uid);
}

int32_t libc_fuchsia_mod_getchar_unlocked(void) {
    return (int32_t)getchar_unlocked();
}

int32_t libc_fuchsia_mod_putchar_unlocked(int32_t c) {
    return (int32_t)putchar_unlocked(c);
}

int32_t libc_fuchsia_mod_socket(int32_t domain, int32_t ty, int32_t protocol) {
    return (int32_t)socket(domain, ty, protocol);
}

int32_t libc_fuchsia_mod_connect(int32_t socket, void* address, uint32_t len) {
    return (int32_t)connect(socket, address, len);
}

int32_t libc_fuchsia_mod_listen(int32_t socket, int32_t backlog) {
    return (int32_t)listen(socket, backlog);
}

int32_t libc_fuchsia_mod_accept(int32_t socket, void* address, void* address_len) {
    return (int32_t)accept(socket, address, address_len);
}

int32_t libc_fuchsia_mod_getpeername(int32_t socket, void* address, void* address_len) {
    return (int32_t)getpeername(socket, address, address_len);
}

int32_t libc_fuchsia_mod_getsockname(int32_t socket, void* address, void* address_len) {
    return (int32_t)getsockname(socket, address, address_len);
}

int32_t libc_fuchsia_mod_setsockopt(int32_t socket, int32_t level, int32_t name, void* value, uint32_t option_len) {
    return (int32_t)setsockopt(socket, level, name, value, option_len);
}

int32_t libc_fuchsia_mod_socketpair(int32_t domain, int32_t type_, int32_t protocol, void* socket_vector) {
    return (int32_t)socketpair(domain, type_, protocol, socket_vector);
}

int64_t libc_fuchsia_mod_sendto(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_fuchsia_mod_shutdown(int32_t socket, int32_t how) {
    return (int32_t)shutdown(socket, how);
}

int32_t libc_fuchsia_mod_chmod(const char* path, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)chmod(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_fchmod(int32_t fd, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)fchmod(fd, mode);
#else
    (void)fd;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)fstat(fildes, buf);
}

int32_t libc_fuchsia_mod_mkdir(const char* path, uint32_t mode) {
    return (int32_t)mkdir(path, mode);
}

int32_t libc_fuchsia_mod_stat(const char* path, void* buf) {
    return (int32_t)stat(path, buf);
}

int32_t libc_fuchsia_mod_pclose(void* stream) {
    return (int32_t)pclose((FILE*)stream);
}

void* libc_fuchsia_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)fdopen(fd, mode);
}

int32_t libc_fuchsia_mod_fileno(void* stream) {
    return (int32_t)fileno((FILE*)stream);
}

int32_t libc_fuchsia_mod_creat(const char* path, uint32_t mode) {
    return (int32_t)creat(path, mode);
}

void* libc_fuchsia_mod_opendir(const char* dirname) {
#if !defined(_WIN32)
    return (void*)opendir(dirname);
#else
    (void)dirname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_fuchsia_mod_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_fuchsia_mod_readdir_r(void* dirp, void* entry, void* result) {
    return (int32_t)readdir_r((DIR*)dirp, entry, result);
}

int32_t libc_fuchsia_mod_closedir(void* dirp) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_fuchsia_mod_rewinddir(void* dirp) {
#if !defined(_WIN32)
    rewinddir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
#endif
}

int32_t libc_fuchsia_mod_fchmodat(int32_t dirfd, const char* pathname, uint32_t mode, int32_t flags) {
    return (int32_t)fchmodat(dirfd, pathname, mode, flags);
}

int32_t libc_fuchsia_mod_fchown(int32_t fd, uint32_t owner, uint32_t group) {
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

int32_t libc_fuchsia_mod_fchownat(int32_t dirfd, const char* pathname, uint32_t owner, uint32_t group, int32_t flags) {
    return (int32_t)fchownat(dirfd, pathname, owner, group, flags);
}

int32_t libc_fuchsia_mod_fstatat(int32_t dirfd, const char* pathname, void* buf, int32_t flags) {
    return (int32_t)fstatat(dirfd, pathname, buf, flags);
}

int32_t libc_fuchsia_mod_linkat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath, int32_t flags) {
    return (int32_t)linkat(olddirfd, oldpath, newdirfd, newpath, flags);
}

int32_t libc_fuchsia_mod_mkdirat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkdirat(dirfd, pathname, mode);
}

int64_t libc_fuchsia_mod_readlinkat(int32_t dirfd, const char* pathname, char* buf, uint64_t bufsiz) {
    return (int64_t)readlinkat(dirfd, pathname, buf, bufsiz);
}

int32_t libc_fuchsia_mod_renameat(int32_t olddirfd, const char* oldpath, int32_t newdirfd, const char* newpath) {
    return (int32_t)renameat(olddirfd, oldpath, newdirfd, newpath);
}

int32_t libc_fuchsia_mod_symlinkat(const char* target, int32_t newdirfd, const char* linkpath) {
    return (int32_t)symlinkat(target, newdirfd, linkpath);
}

int32_t libc_fuchsia_mod_unlinkat(int32_t dirfd, const char* pathname, int32_t flags) {
    return (int32_t)unlinkat(dirfd, pathname, flags);
}

int32_t libc_fuchsia_mod_access(const char* path, int32_t amode) {
    return (int32_t)access(path, amode);
}

uint32_t libc_fuchsia_mod_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_fuchsia_mod_chdir(const char* dir) {
    return (int32_t)chdir(dir);
}

int32_t libc_fuchsia_mod_chown(const char* path, uint32_t uid, uint32_t gid) {
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

int32_t libc_fuchsia_mod_lchown(const char* path, uint32_t uid, uint32_t gid) {
    return (int32_t)lchown(path, uid, gid);
}

int32_t libc_fuchsia_mod_close(int32_t fd) {
    return (int32_t)close(fd);
}

int32_t libc_fuchsia_mod_dup(int32_t fd) {
    return (int32_t)dup(fd);
}

int32_t libc_fuchsia_mod_dup2(int32_t src, int32_t dst) {
    return (int32_t)dup2(src, dst);
}

int32_t libc_fuchsia_mod_execv(const char* prog, void* argv) {
    return (int32_t)execv(prog, argv);
}

int32_t libc_fuchsia_mod_execve(const char* prog, void* argv, void* envp) {
    return (int32_t)execve(prog, argv, envp);
}

int32_t libc_fuchsia_mod_execvp(const char* c, void* argv) {
    return (int32_t)execvp(c, argv);
}

int32_t libc_fuchsia_mod_fork(void) {
#if !defined(_WIN32)
    return (int32_t)fork();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_fuchsia_mod_fpathconf(int32_t filedes, int32_t name) {
    return (int64_t)fpathconf(filedes, name);
}

char* libc_fuchsia_mod_getcwd(char* buf, uint64_t size) {
    return (char*)getcwd(buf, size);
}

uint32_t libc_fuchsia_mod_getegid(void) {
#if !defined(_WIN32)
    return (uint32_t)getegid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t libc_fuchsia_mod_geteuid(void) {
#if !defined(_WIN32)
    return (uint32_t)geteuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t libc_fuchsia_mod_getgid(void) {
#if !defined(_WIN32)
    return (uint32_t)getgid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_fuchsia_mod_getgroups(int32_t ngroups_max, void* groups) {
    return (int32_t)getgroups(ngroups_max, groups);
}

char* libc_fuchsia_mod_getlogin(void) {
    return (char*)getlogin();
}

int32_t libc_fuchsia_mod_getopt(int32_t argc, void* argv, const char* optstr) {
    return (int32_t)getopt(argc, argv, optstr);
}

int32_t libc_fuchsia_mod_getpgid(int32_t pid) {
    return (int32_t)getpgid(pid);
}

int32_t libc_fuchsia_mod_getpgrp(void) {
    return (int32_t)getpgrp();
}

int32_t libc_fuchsia_mod_getpid(void) {
    return (int32_t)getpid();
}

int32_t libc_fuchsia_mod_getppid(void) {
    return (int32_t)getppid();
}

uint32_t libc_fuchsia_mod_getuid(void) {
#if !defined(_WIN32)
    return (uint32_t)getuid();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_fuchsia_mod_isatty(int32_t fd) {
    return (int32_t)isatty(fd);
}

int32_t libc_fuchsia_mod_link(const char* src, const char* dst) {
#if !defined(_WIN32)
    return (int32_t)link(src, dst);
#else
    (void)src;
    (void)dst;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_fuchsia_mod_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)lseek(fd, offset, whence);
}

int64_t libc_fuchsia_mod_pathconf(const char* path, int32_t name) {
    return (int64_t)pathconf(path, name);
}

int32_t libc_fuchsia_mod_pause(void) {
    return (int32_t)pause();
}

int32_t libc_fuchsia_mod_pipe(void* fds) {
#if !defined(_WIN32)
    return (int32_t)pipe(fds);
#else
    (void)fds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_posix_memalign(void* memptr, uint64_t align, uint64_t size) {
    return (int32_t)posix_memalign(memptr, align, size);
}

int64_t libc_fuchsia_mod_read(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)read(fd, buf, count);
}

int32_t libc_fuchsia_mod_rmdir(const char* path) {
    return (int32_t)rmdir(path);
}

int32_t libc_fuchsia_mod_seteuid(uint32_t uid) {
    return (int32_t)seteuid(uid);
}

int32_t libc_fuchsia_mod_setegid(uint32_t gid) {
    return (int32_t)setegid(gid);
}

int32_t libc_fuchsia_mod_setgid(uint32_t gid) {
    return (int32_t)setgid(gid);
}

int32_t libc_fuchsia_mod_setpgid(int32_t pid, int32_t pgid) {
    return (int32_t)setpgid(pid, pgid);
}

int32_t libc_fuchsia_mod_setsid(void) {
    return (int32_t)setsid();
}

int32_t libc_fuchsia_mod_setuid(uint32_t uid) {
    return (int32_t)setuid(uid);
}

uint32_t libc_fuchsia_mod_sleep(uint32_t secs) {
#if !defined(_WIN32)
    return (uint32_t)sleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_fuchsia_mod_nanosleep(void* rqtp, void* rmtp) {
    return (int32_t)nanosleep(rqtp, rmtp);
}

int32_t libc_fuchsia_mod_tcgetpgrp(int32_t fd) {
    return (int32_t)tcgetpgrp(fd);
}

int32_t libc_fuchsia_mod_tcsetpgrp(int32_t fd, int32_t pgrp) {
    return (int32_t)tcsetpgrp(fd, pgrp);
}

char* libc_fuchsia_mod_ttyname(int32_t fd) {
    return (char*)ttyname(fd);
}

int32_t libc_fuchsia_mod_unlink(const char* c) {
    return (int32_t)unlink(c);
}

int32_t libc_fuchsia_mod_wait(void* status) {
#if !defined(_WIN32)
    return (int32_t)wait(status);
#else
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_waitpid(int32_t pid, void* status, int32_t options) {
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

int64_t libc_fuchsia_mod_write(int32_t fd, void* buf, uint64_t count) {
    return (int64_t)write(fd, buf, count);
}

int64_t libc_fuchsia_mod_pread(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pread(fd, buf, count, offset);
}

int64_t libc_fuchsia_mod_pwrite(int32_t fd, void* buf, uint64_t count, int64_t offset) {
    return (int64_t)pwrite(fd, buf, count, offset);
}

uint32_t libc_fuchsia_mod_umask(uint32_t mask) {
    return (uint32_t)umask(mask);
}

int32_t libc_fuchsia_mod_utime(const char* file, void* buf) {
    return (int32_t)utime(file, buf);
}

int32_t libc_fuchsia_mod_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_fuchsia_mod_mlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)mlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_munlock(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munlock(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_mlockall(int32_t flags) {
    return (int32_t)mlockall(flags);
}

int32_t libc_fuchsia_mod_munlockall(void) {
    return (int32_t)munlockall();
}

void* libc_fuchsia_mod_mmap(void* addr, uint64_t len, int32_t prot, int32_t flags, int32_t fd, int64_t offset) {
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

int32_t libc_fuchsia_mod_munmap(void* addr, uint64_t len) {
#if !defined(_WIN32)
    return (int32_t)munmap(addr, len);
#else
    (void)addr;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t libc_fuchsia_mod_if_nametoindex(const char* ifname) {
    return (uint32_t)if_nametoindex(ifname);
}

char* libc_fuchsia_mod_if_indextoname(uint32_t ifindex, char* ifname) {
    return (char*)if_indextoname(ifindex, ifname);
}

int32_t libc_fuchsia_mod_lstat(const char* path, void* buf) {
#if !defined(_WIN32)
    return (int32_t)lstat(path, buf);
#else
    (void)path;
    (void)buf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_fsync(int32_t fd) {
    return (int32_t)fsync(fd);
}

int32_t libc_fuchsia_mod_setenv(const char* name, const char* val, int32_t overwrite) {
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

int32_t libc_fuchsia_mod_unsetenv(const char* name) {
#if !defined(_WIN32)
    return (int32_t)unsetenv(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_symlink(const char* path1, const char* path2) {
#if !defined(_WIN32)
    return (int32_t)symlink(path1, path2);
#else
    (void)path1;
    (void)path2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_ftruncate(int32_t fd, int64_t length) {
    return (int32_t)ftruncate(fd, length);
}

uint64_t libc_fuchsia_mod_signal(int32_t signum, uint64_t handler) {
    return (uint64_t)signal(signum, handler);
}

char* libc_fuchsia_mod_realpath(const char* pathname, char* resolved) {
    return (char*)realpath(pathname, resolved);
}

int32_t libc_fuchsia_mod_flock(int32_t fd, int32_t operation) {
    return (int32_t)flock(fd, operation);
}

int32_t libc_fuchsia_mod_gettimeofday(void* tp, void* tz) {
    return (int32_t)gettimeofday(tp, tz);
}

int64_t libc_fuchsia_mod_times(void* buf) {
    return (int64_t)times(buf);
}

uint64_t libc_fuchsia_mod_pthread_self(void) {
#if !defined(_WIN32)
    return (uint64_t)pthread_self();
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_fuchsia_mod_pthread_join(uint64_t native, void* value) {
#if !defined(_WIN32)
    return (int32_t)pthread_join(native, value);
#else
    (void)native;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void libc_fuchsia_mod_pthread_exit(void* value) {
    pthread_exit(value);
}

int32_t libc_fuchsia_mod_pthread_attr_init(void* attr) {
    return (int32_t)pthread_attr_init(attr);
}

int32_t libc_fuchsia_mod_pthread_attr_destroy(void* attr) {
    return (int32_t)pthread_attr_destroy(attr);
}

int32_t libc_fuchsia_mod_pthread_attr_getstacksize(void* attr, void* stacksize) {
    return (int32_t)pthread_attr_getstacksize(attr, stacksize);
}

int32_t libc_fuchsia_mod_pthread_attr_setstacksize(void* attr, uint64_t stack_size) {
    return (int32_t)pthread_attr_setstacksize(attr, stack_size);
}

int32_t libc_fuchsia_mod_pthread_attr_setdetachstate(void* attr, int32_t state) {
    return (int32_t)pthread_attr_setdetachstate(attr, state);
}

int32_t libc_fuchsia_mod_pthread_detach(uint64_t thread) {
#if !defined(_WIN32)
    return (int32_t)pthread_detach(thread);
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sched_yield(void) {
    return (int32_t)sched_yield();
}

int32_t libc_fuchsia_mod_pthread_key_create(void* key, void* dtor) {
    return (int32_t)pthread_key_create(key, dtor);
}

int32_t libc_fuchsia_mod_pthread_key_delete(uint32_t key) {
    return (int32_t)pthread_key_delete(key);
}

void* libc_fuchsia_mod_pthread_getspecific(uint32_t key) {
    return (void*)pthread_getspecific(key);
}

int32_t libc_fuchsia_mod_pthread_setspecific(uint32_t key, void* value) {
    return (int32_t)pthread_setspecific(key, value);
}

int32_t libc_fuchsia_mod_pthread_mutex_init(void* lock, void* attr) {
    return (int32_t)pthread_mutex_init(lock, attr);
}

int32_t libc_fuchsia_mod_pthread_mutex_destroy(void* lock) {
    return (int32_t)pthread_mutex_destroy(lock);
}

int32_t libc_fuchsia_mod_pthread_mutex_lock(void* lock) {
    return (int32_t)pthread_mutex_lock(lock);
}

int32_t libc_fuchsia_mod_pthread_mutex_trylock(void* lock) {
    return (int32_t)pthread_mutex_trylock(lock);
}

int32_t libc_fuchsia_mod_pthread_mutex_unlock(void* lock) {
    return (int32_t)pthread_mutex_unlock(lock);
}

int32_t libc_fuchsia_mod_pthread_mutexattr_init(void* attr) {
    return (int32_t)pthread_mutexattr_init(attr);
}

int32_t libc_fuchsia_mod_pthread_mutexattr_destroy(void* attr) {
    return (int32_t)pthread_mutexattr_destroy(attr);
}

int32_t libc_fuchsia_mod_pthread_mutexattr_settype(void* attr, int32_t _type) {
    return (int32_t)pthread_mutexattr_settype(attr, _type);
}

int32_t libc_fuchsia_mod_pthread_cond_init(void* cond, void* attr) {
    return (int32_t)pthread_cond_init(cond, attr);
}

int32_t libc_fuchsia_mod_pthread_cond_wait(void* cond, void* lock) {
    return (int32_t)pthread_cond_wait(cond, lock);
}

int32_t libc_fuchsia_mod_pthread_cond_timedwait(void* cond, void* lock, void* abstime) {
    return (int32_t)pthread_cond_timedwait(cond, lock, abstime);
}

int32_t libc_fuchsia_mod_pthread_cond_signal(void* cond) {
    return (int32_t)pthread_cond_signal(cond);
}

int32_t libc_fuchsia_mod_pthread_cond_broadcast(void* cond) {
    return (int32_t)pthread_cond_broadcast(cond);
}

int32_t libc_fuchsia_mod_pthread_cond_destroy(void* cond) {
    return (int32_t)pthread_cond_destroy(cond);
}

int32_t libc_fuchsia_mod_pthread_condattr_init(void* attr) {
    return (int32_t)pthread_condattr_init(attr);
}

int32_t libc_fuchsia_mod_pthread_condattr_destroy(void* attr) {
    return (int32_t)pthread_condattr_destroy(attr);
}

int32_t libc_fuchsia_mod_pthread_rwlock_init(void* lock, void* attr) {
    return (int32_t)pthread_rwlock_init(lock, attr);
}

int32_t libc_fuchsia_mod_pthread_rwlock_destroy(void* lock) {
    return (int32_t)pthread_rwlock_destroy(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlock_rdlock(void* lock) {
    return (int32_t)pthread_rwlock_rdlock(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlock_tryrdlock(void* lock) {
    return (int32_t)pthread_rwlock_tryrdlock(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlock_wrlock(void* lock) {
    return (int32_t)pthread_rwlock_wrlock(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlock_trywrlock(void* lock) {
    return (int32_t)pthread_rwlock_trywrlock(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlock_unlock(void* lock) {
    return (int32_t)pthread_rwlock_unlock(lock);
}

int32_t libc_fuchsia_mod_pthread_rwlockattr_init(void* attr) {
    return (int32_t)pthread_rwlockattr_init(attr);
}

int32_t libc_fuchsia_mod_pthread_rwlockattr_destroy(void* attr) {
    return (int32_t)pthread_rwlockattr_destroy(attr);
}

int32_t libc_fuchsia_mod_pthread_getname_np(uint64_t thread, char* name, uint64_t len) {
    return (int32_t)pthread_getname_np(thread, name, len);
}

int32_t libc_fuchsia_mod_pthread_setname_np(uint64_t thread, const char* name) {
    return (int32_t)pthread_setname_np(thread, name);
}

int32_t libc_fuchsia_mod_strerror_r(int32_t errnum, char* buf, uint64_t buflen) {
    return (int32_t)strerror_r(errnum, buf, buflen);
}

int32_t libc_fuchsia_mod_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_fuchsia_mod_raise(int32_t signum) {
    return (int32_t)raise(signum);
}

int32_t libc_fuchsia_mod_sigaction(int32_t signum, void* act, void* oldact) {
    return (int32_t)sigaction(signum, act, oldact);
}

int32_t libc_fuchsia_mod_utimes(const char* filename, void* times) {
    return (int32_t)utimes(filename, times);
}

void* libc_fuchsia_mod_dlopen(const char* filename, int32_t flag) {
#if !defined(_WIN32)
    return (void*)dlopen(filename, flag);
#else
    (void)filename;
    (void)flag;
    errno = ENOSYS;
    return NULL;
#endif
}

char* libc_fuchsia_mod_dlerror(void) {
#if !defined(_WIN32)
    return (char*)dlerror();
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_fuchsia_mod_dlsym(void* handle, const char* symbol) {
#if !defined(_WIN32)
    return (void*)dlsym(handle, symbol);
#else
    (void)handle;
    (void)symbol;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_fuchsia_mod_dlclose(void* handle) {
#if !defined(_WIN32)
    return (int32_t)dlclose(handle);
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_dladdr(void* addr, void* info) {
    return (int32_t)dladdr(addr, info);
}

int32_t libc_fuchsia_mod_getaddrinfo(const char* node, const char* service, void* hints, void* res) {
    return (int32_t)getaddrinfo(node, service, hints, res);
}

void libc_fuchsia_mod_freeaddrinfo(void* res) {
    freeaddrinfo(res);
}

const char* libc_fuchsia_mod_gai_strerror(int32_t errcode) {
    return (const char*)gai_strerror(errcode);
}

int32_t libc_fuchsia_mod_res_init(void) {
    return (int32_t)res_init();
}

void* libc_fuchsia_mod_gmtime_r(void* time_p, void* result) {
    return (void*)gmtime_r(time_p, result);
}

void* libc_fuchsia_mod_localtime_r(void* time_p, void* result) {
    return (void*)localtime_r(time_p, result);
}

int64_t libc_fuchsia_mod_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

int64_t libc_fuchsia_mod_time(void* time) {
    return (int64_t)time(time);
}

void* libc_fuchsia_mod_gmtime(void* time_p) {
    return (void*)gmtime(time_p);
}

void* libc_fuchsia_mod_localtime(void* time_p) {
    return (void*)localtime(time_p);
}

int32_t libc_fuchsia_mod_mknod(const char* pathname, uint32_t mode, uint64_t dev) {
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

int32_t libc_fuchsia_mod_uname(void* buf) {
    return (int32_t)uname(buf);
}

int32_t libc_fuchsia_mod_gethostname(char* name, uint64_t len) {
    return (int32_t)gethostname(name, len);
}

void* libc_fuchsia_mod_getservbyname(const char* name, const char* proto) {
    return (void*)getservbyname(name, proto);
}

void* libc_fuchsia_mod_getprotobyname(const char* name) {
    return (void*)getprotobyname(name);
}

void* libc_fuchsia_mod_getprotobynumber(int32_t proto) {
    return (void*)getprotobynumber(proto);
}

int32_t libc_fuchsia_mod_usleep(uint32_t secs) {
#if !defined(_WIN32)
    return (int32_t)usleep(secs);
#else
    (void)secs;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_fuchsia_mod_send(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)send(socket, buf, len, flags);
}

int64_t libc_fuchsia_mod_recv(int32_t socket, void* buf, uint64_t len, int32_t flags) {
    return (int64_t)recv(socket, buf, len, flags);
}

int32_t libc_fuchsia_mod_putenv(char* string) {
    return (int32_t)putenv(string);
}

int32_t libc_fuchsia_mod_poll(void* fds, uint64_t nfds, int32_t timeout) {
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

int32_t libc_fuchsia_mod_select(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout) {
    return (int32_t)select(nfds, readfds, writefds, errorfds, timeout);
}

char* libc_fuchsia_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_fuchsia_mod_localeconv(void) {
    return (void*)localeconv();
}

int32_t libc_fuchsia_mod_sem_destroy(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_destroy(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sem_wait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_wait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sem_trywait(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_trywait(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sem_post(void* sem) {
#if !defined(_WIN32)
    return (int32_t)sem_post(sem);
#else
    (void)sem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sem_init(void* sem, int32_t pshared, uint32_t value) {
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

int32_t libc_fuchsia_mod_statvfs(const char* path, void* buf) {
    return (int32_t)statvfs(path, buf);
}

int32_t libc_fuchsia_mod_fstatvfs(int32_t fd, void* buf) {
    return (int32_t)fstatvfs(fd, buf);
}

int64_t libc_fuchsia_mod_readlink(const char* path, char* buf, uint64_t bufsz) {
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

int32_t libc_fuchsia_mod_sigemptyset(void* set) {
    return (int32_t)sigemptyset(set);
}

int32_t libc_fuchsia_mod_sigaddset(void* set, int32_t signum) {
    return (int32_t)sigaddset(set, signum);
}

int32_t libc_fuchsia_mod_sigfillset(void* set) {
    return (int32_t)sigfillset(set);
}

int32_t libc_fuchsia_mod_sigdelset(void* set, int32_t signum) {
    return (int32_t)sigdelset(set, signum);
}

int32_t libc_fuchsia_mod_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember(set, signum);
}

int32_t libc_fuchsia_mod_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, set, oldset);
}

int32_t libc_fuchsia_mod_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int64_t libc_fuchsia_mod_timegm(void* tm) {
    return (int64_t)timegm(tm);
}

int32_t libc_fuchsia_mod_getsid(int32_t pid) {
    return (int32_t)getsid(pid);
}

int64_t libc_fuchsia_mod_sysconf(int32_t name) {
#if !defined(_WIN32)
    return (int64_t)sysconf(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_mkfifo(const char* path, uint32_t mode) {
#if !defined(_WIN32)
    return (int32_t)mkfifo(path, mode);
#else
    (void)path;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_pselect(int32_t nfds, void* readfds, void* writefds, void* errorfds, void* timeout, void* sigmask) {
    return (int32_t)pselect(nfds, readfds, writefds, errorfds, timeout, sigmask);
}

int32_t libc_fuchsia_mod_fseeko(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseeko((FILE*)stream, offset, whence);
}

int64_t libc_fuchsia_mod_ftello(void* stream) {
    return (int64_t)ftello((FILE*)stream);
}

int32_t libc_fuchsia_mod_tcdrain(int32_t fd) {
    return (int32_t)tcdrain(fd);
}

uint32_t libc_fuchsia_mod_cfgetispeed(void* termios) {
    return (uint32_t)cfgetispeed(termios);
}

uint32_t libc_fuchsia_mod_cfgetospeed(void* termios) {
    return (uint32_t)cfgetospeed(termios);
}

void libc_fuchsia_mod_cfmakeraw(void* termios) {
    cfmakeraw(termios);
}

int32_t libc_fuchsia_mod_cfsetispeed(void* termios, uint32_t speed) {
    return (int32_t)cfsetispeed(termios, speed);
}

int32_t libc_fuchsia_mod_cfsetospeed(void* termios, uint32_t speed) {
    return (int32_t)cfsetospeed(termios, speed);
}

int32_t libc_fuchsia_mod_cfsetspeed(void* termios, uint32_t speed) {
    return (int32_t)cfsetspeed(termios, speed);
}

int32_t libc_fuchsia_mod_tcgetattr(int32_t fd, void* termios) {
    return (int32_t)tcgetattr(fd, termios);
}

int32_t libc_fuchsia_mod_tcsetattr(int32_t fd, int32_t optional_actions, void* termios) {
    return (int32_t)tcsetattr(fd, optional_actions, termios);
}

int32_t libc_fuchsia_mod_tcflow(int32_t fd, int32_t action) {
    return (int32_t)tcflow(fd, action);
}

int32_t libc_fuchsia_mod_tcflush(int32_t fd, int32_t action) {
    return (int32_t)tcflush(fd, action);
}

int32_t libc_fuchsia_mod_tcgetsid(int32_t fd) {
    return (int32_t)tcgetsid(fd);
}

int32_t libc_fuchsia_mod_tcsendbreak(int32_t fd, int32_t duration) {
    return (int32_t)tcsendbreak(fd, duration);
}

int32_t libc_fuchsia_mod_mkstemp(char* template) {
    return (int32_t)mkstemp(template);
}

char* libc_fuchsia_mod_mkdtemp(char* template) {
    return (char*)mkdtemp(template);
}

char* libc_fuchsia_mod_tmpnam(char* ptr) {
    return (char*)tmpnam(ptr);
}

void libc_fuchsia_mod_openlog(const char* ident, int32_t logopt, int32_t facility) {
    openlog(ident, logopt, facility);
}

void libc_fuchsia_mod_closelog(void) {
    closelog();
}

int32_t libc_fuchsia_mod_setlogmask(int32_t maskpri) {
    return (int32_t)setlogmask(maskpri);
}

int32_t libc_fuchsia_mod_grantpt(int32_t fd) {
    return (int32_t)grantpt(fd);
}

int32_t libc_fuchsia_mod_posix_openpt(int32_t flags) {
    return (int32_t)posix_openpt(flags);
}

char* libc_fuchsia_mod_ptsname(int32_t fd) {
    return (char*)ptsname(fd);
}

int32_t libc_fuchsia_mod_unlockpt(int32_t fd) {
    return (int32_t)unlockpt(fd);
}

int32_t libc_fuchsia_mod_fdatasync(int32_t fd) {
    return (int32_t)fdatasync(fd);
}

int32_t libc_fuchsia_mod_clock_getres(int32_t clk_id, void* tp) {
    return (int32_t)clock_getres(clk_id, tp);
}

int32_t libc_fuchsia_mod_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_fuchsia_mod_clock_settime(int32_t clk_id, void* tp) {
    return (int32_t)clock_settime(clk_id, tp);
}

int32_t libc_fuchsia_mod_dirfd(void* dirp) {
    return (int32_t)dirfd((DIR*)dirp);
}

int32_t libc_fuchsia_mod_pthread_getattr_np(uint64_t native, void* attr) {
    return (int32_t)pthread_getattr_np(native, attr);
}

int32_t libc_fuchsia_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

void* libc_fuchsia_mod_memalign(uint64_t align, uint64_t size) {
    return (void*)memalign(align, size);
}

int32_t libc_fuchsia_mod_setgroups(uint64_t ngroups, void* ptr) {
    return (int32_t)setgroups(ngroups, ptr);
}

int32_t libc_fuchsia_mod_pipe2(void* fds, int32_t flags) {
    return (int32_t)pipe2(fds, flags);
}

int32_t libc_fuchsia_mod_statfs(const char* path, void* buf) {
    return (int32_t)statfs(path, buf);
}

int32_t libc_fuchsia_mod_fstatfs(int32_t fd, void* buf) {
    return (int32_t)fstatfs(fd, buf);
}

void* libc_fuchsia_mod_memrchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memrchr(cx, c, n);
}

int32_t libc_fuchsia_mod_posix_fadvise(int32_t fd, int64_t offset, int64_t len, int32_t advise) {
    return (int32_t)posix_fadvise(fd, offset, len, advise);
}

int32_t libc_fuchsia_mod_futimens(int32_t fd, void* times) {
    return (int32_t)futimens(fd, times);
}

int32_t libc_fuchsia_mod_utimensat(int32_t dirfd, const char* path, void* times, int32_t flag) {
    return (int32_t)utimensat(dirfd, path, times, flag);
}

void* libc_fuchsia_mod_duplocale(void* base) {
    return (void*)duplocale(base);
}

void libc_fuchsia_mod_freelocale(void* loc) {
    freelocale(loc);
}

void* libc_fuchsia_mod_newlocale(int32_t mask, const char* locale, void* base) {
    return (void*)newlocale(mask, locale, base);
}

void* libc_fuchsia_mod_uselocale(void* loc) {
    return (void*)uselocale(loc);
}

void* libc_fuchsia_mod_fdopendir(int32_t fd) {
    return (void*)fdopendir(fd);
}

int32_t libc_fuchsia_mod_mknodat(int32_t dirfd, const char* pathname, uint32_t mode, uint64_t dev) {
    return (int32_t)mknodat(dirfd, pathname, mode, dev);
}

int32_t libc_fuchsia_mod_pthread_condattr_getclock(void* attr, void* clock_id) {
    return (int32_t)pthread_condattr_getclock(attr, clock_id);
}

int32_t libc_fuchsia_mod_pthread_condattr_setclock(void* attr, int32_t clock_id) {
    return (int32_t)pthread_condattr_setclock(attr, clock_id);
}

int32_t libc_fuchsia_mod_accept4(int32_t fd, void* addr, void* len, int32_t flg) {
    return (int32_t)accept4(fd, addr, len, flg);
}

int32_t libc_fuchsia_mod_ptsname_r(int32_t fd, char* buf, uint64_t buflen) {
    return (int32_t)ptsname_r(fd, buf, buflen);
}

int32_t libc_fuchsia_mod_clearenv(void) {
    return (int32_t)clearenv();
}

int32_t libc_fuchsia_mod_waitid(uint32_t idtype, uint32_t id, void* infop, int32_t options) {
    return (int32_t)waitid(idtype, id, infop, options);
}

int32_t libc_fuchsia_mod_setreuid(uint32_t ruid, uint32_t euid) {
    return (int32_t)setreuid(ruid, euid);
}

int32_t libc_fuchsia_mod_setregid(uint32_t rgid, uint32_t egid) {
    return (int32_t)setregid(rgid, egid);
}

int32_t libc_fuchsia_mod_getresuid(void* ruid, void* euid, void* suid) {
    return (int32_t)getresuid(ruid, euid, suid);
}

int32_t libc_fuchsia_mod_getresgid(void* rgid, void* egid, void* sgid) {
    return (int32_t)getresgid(rgid, egid, sgid);
}

int32_t libc_fuchsia_mod_acct(const char* filename) {
    return (int32_t)acct(filename);
}

int32_t libc_fuchsia_mod_brk(void* addr) {
    return (int32_t)brk(addr);
}

int32_t libc_fuchsia_mod_setresgid(uint32_t rgid, uint32_t egid, uint32_t sgid) {
    return (int32_t)setresgid(rgid, egid, sgid);
}

int32_t libc_fuchsia_mod_setresuid(uint32_t ruid, uint32_t euid, uint32_t suid) {
    return (int32_t)setresuid(ruid, euid, suid);
}

int32_t libc_fuchsia_mod_openpty(void* amaster, void* aslave, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amaster, aslave, name, termp, winp);
}

int32_t libc_fuchsia_mod_execvpe(const char* file, void* argv, void* envp) {
    return (int32_t)execvpe(file, argv, envp);
}

int32_t libc_fuchsia_mod_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_fuchsia_mod_lutimes(const char* file, void* times) {
    return (int32_t)lutimes(file, times);
}

void libc_fuchsia_mod_setpwent(void) {
    setpwent();
}

void libc_fuchsia_mod_endpwent(void) {
    endpwent();
}

void* libc_fuchsia_mod_getpwent(void) {
    return (void*)getpwent();
}

int32_t libc_fuchsia_mod_shm_open(const char* name, int32_t oflag, uint32_t mode) {
    return (int32_t)shm_open(name, oflag, mode);
}

int32_t libc_fuchsia_mod_shmget(int32_t key, uint64_t size, int32_t shmflg) {
    return (int32_t)shmget(key, size, shmflg);
}

void* libc_fuchsia_mod_shmat(int32_t shmid, void* shmaddr, int32_t shmflg) {
    return (void*)shmat(shmid, shmaddr, shmflg);
}

int32_t libc_fuchsia_mod_shmdt(void* shmaddr) {
    return (int32_t)shmdt(shmaddr);
}

int32_t libc_fuchsia_mod_shmctl(int32_t shmid, int32_t cmd, void* buf) {
    return (int32_t)shmctl(shmid, cmd, buf);
}

int32_t libc_fuchsia_mod_ftok(const char* pathname, int32_t proj_id) {
    return (int32_t)ftok(pathname, proj_id);
}

int32_t libc_fuchsia_mod_semget(int32_t key, int32_t nsems, int32_t semflag) {
    return (int32_t)semget(key, nsems, semflag);
}

int32_t libc_fuchsia_mod_semop(int32_t semid, void* sops, uint64_t nsops) {
    return (int32_t)semop(semid, sops, nsops);
}

int32_t libc_fuchsia_mod_msgctl(int32_t msqid, int32_t cmd, void* buf) {
    return (int32_t)msgctl(msqid, cmd, buf);
}

int32_t libc_fuchsia_mod_msgget(int32_t key, int32_t msgflg) {
    return (int32_t)msgget(key, msgflg);
}

int64_t libc_fuchsia_mod_msgrcv(int32_t msqid, void* msgp, uint64_t msgsz, int64_t msgtyp, int32_t msgflg) {
    return (int64_t)msgrcv(msqid, msgp, msgsz, msgtyp, msgflg);
}

int32_t libc_fuchsia_mod_msgsnd(int32_t msqid, void* msgp, uint64_t msgsz, int32_t msgflg) {
    return (int32_t)msgsnd(msqid, msgp, msgsz, msgflg);
}

int32_t libc_fuchsia_mod_mprotect(void* addr, uint64_t len, int32_t prot) {
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

void* libc_fuchsia_mod_errno_location(void) {
    return (void*)__errno_location();
}

int32_t libc_fuchsia_mod_fallocate(int32_t fd, int32_t mode, int64_t offset, int64_t len) {
    return (int32_t)fallocate(fd, mode, offset, len);
}

int32_t libc_fuchsia_mod_posix_fallocate(int32_t fd, int64_t offset, int64_t len) {
    return (int32_t)posix_fallocate(fd, offset, len);
}

int64_t libc_fuchsia_mod_readahead(int32_t fd, int64_t offset, uint64_t count) {
    return (int64_t)readahead(fd, offset, count);
}

int32_t libc_fuchsia_mod_signalfd(int32_t fd, void* mask, int32_t flags) {
#if defined(__linux__)
    return (int32_t)signalfd(fd, mask, flags);
#else
    (void)fd;
    (void)mask;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_timerfd_create(int32_t clockid, int32_t flags) {
#if defined(__linux__)
    return (int32_t)timerfd_create(clockid, flags);
#else
    (void)clockid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_timerfd_gettime(int32_t fd, void* curr_value) {
#if defined(__linux__)
    return (int32_t)timerfd_gettime(fd, curr_value);
#else
    (void)fd;
    (void)curr_value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_timerfd_settime(int32_t fd, int32_t flags, void* new_value, void* old_value) {
#if defined(__linux__)
    return (int32_t)timerfd_settime(fd, flags, new_value, old_value);
#else
    (void)fd;
    (void)flags;
    (void)new_value;
    (void)old_value;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t libc_fuchsia_mod_pwritev(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)pwritev(fd, iov, iovcnt, offset);
}

int64_t libc_fuchsia_mod_preadv(int32_t fd, void* iov, int32_t iovcnt, int64_t offset) {
    return (int64_t)preadv(fd, iov, iovcnt, offset);
}

int32_t libc_fuchsia_mod_quotactl(int32_t cmd, const char* special, int32_t id, char* data) {
    return (int32_t)quotactl(cmd, special, id, data);
}

int32_t libc_fuchsia_mod_dup3(int32_t oldfd, int32_t newfd, int32_t flags) {
    return (int32_t)dup3(oldfd, newfd, flags);
}

int32_t libc_fuchsia_mod_mkostemp(char* template, int32_t flags) {
    return (int32_t)mkostemp(template, flags);
}

int32_t libc_fuchsia_mod_mkostemps(char* template, int32_t suffixlen, int32_t flags) {
    return (int32_t)mkostemps(template, suffixlen, flags);
}

int32_t libc_fuchsia_mod_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

int32_t libc_fuchsia_mod_sigwaitinfo(void* set, void* info) {
    return (int32_t)sigwaitinfo(set, info);
}

char* libc_fuchsia_mod_nl_langinfo_l(int32_t item, void* locale) {
    return (char*)nl_langinfo_l(item, locale);
}

int32_t libc_fuchsia_mod_getnameinfo(void* sa, uint32_t salen, char* host, uint32_t hostlen, char* serv, uint32_t servlen, int32_t flags) {
    return (int32_t)getnameinfo(sa, salen, host, hostlen, serv, servlen, flags);
}

int32_t libc_fuchsia_mod_reboot(int32_t how_to) {
    return (int32_t)reboot(how_to);
}

int32_t libc_fuchsia_mod_setfsgid(uint32_t gid) {
    return (int32_t)setfsgid(gid);
}

int32_t libc_fuchsia_mod_setfsuid(uint32_t uid) {
    return (int32_t)setfsuid(uid);
}

int32_t libc_fuchsia_mod_mkfifoat(int32_t dirfd, const char* pathname, uint32_t mode) {
    return (int32_t)mkfifoat(dirfd, pathname, mode);
}

void* libc_fuchsia_mod_if_nameindex(void) {
    return (void*)if_nameindex();
}

void libc_fuchsia_mod_if_freenameindex(void* ptr) {
    if_freenameindex(ptr);
}

int32_t libc_fuchsia_mod_sync_file_range(int32_t fd, int64_t offset, int64_t nbytes, uint32_t flags) {
    return (int32_t)sync_file_range(fd, offset, nbytes, flags);
}

int32_t libc_fuchsia_mod_getifaddrs(void* ifap) {
    return (int32_t)getifaddrs(ifap);
}

void libc_fuchsia_mod_freeifaddrs(void* ifa) {
    freeifaddrs(ifa);
}

int32_t libc_fuchsia_mod_glob(const char* pattern, int32_t flags, void* errfunc, void* pglob) {
    return (int32_t)glob(pattern, flags, errfunc, pglob);
}

void libc_fuchsia_mod_globfree(void* pglob) {
    globfree(pglob);
}

int32_t libc_fuchsia_mod_posix_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)posix_madvise(addr, len, advice);
}

int32_t libc_fuchsia_mod_shm_unlink(const char* name) {
    return (int32_t)shm_unlink(name);
}

void libc_fuchsia_mod_seekdir(void* dirp, int64_t loc) {
    seekdir((DIR*)dirp, loc);
}

int64_t libc_fuchsia_mod_telldir(void* dirp) {
    return (int64_t)telldir((DIR*)dirp);
}

int32_t libc_fuchsia_mod_madvise(void* addr, uint64_t len, int32_t advice) {
    return (int32_t)madvise(addr, len, advice);
}

int32_t libc_fuchsia_mod_msync(void* addr, uint64_t len, int32_t flags) {
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

int64_t libc_fuchsia_mod_recvfrom(int32_t socket, void* buf, uint64_t len, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(socket, buf, len, flags, addr, addrlen);
}

int32_t libc_fuchsia_mod_mkstemps(char* template, int32_t suffixlen) {
    return (int32_t)mkstemps(template, suffixlen);
}

int32_t libc_fuchsia_mod_futimes(int32_t fd, void* times) {
    return (int32_t)futimes(fd, times);
}

char* libc_fuchsia_mod_nl_langinfo(int32_t item) {
    return (char*)nl_langinfo(item);
}

int32_t libc_fuchsia_mod_bind(int32_t socket, void* address, uint32_t address_len) {
    return (int32_t)bind(socket, address, address_len);
}

int64_t libc_fuchsia_mod_writev(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)writev(fd, iov, iovcnt);
}

int64_t libc_fuchsia_mod_readv(int32_t fd, void* iov, int32_t iovcnt) {
    return (int64_t)readv(fd, iov, iovcnt);
}

int64_t libc_fuchsia_mod_sendmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)sendmsg(fd, msg, flags);
}

int64_t libc_fuchsia_mod_recvmsg(int32_t fd, void* msg, int32_t flags) {
    return (int64_t)recvmsg(fd, msg, flags);
}

int32_t libc_fuchsia_mod_getdomainname(char* name, uint64_t len) {
    return (int32_t)getdomainname(name, len);
}

int32_t libc_fuchsia_mod_setdomainname(const char* name, uint64_t len) {
    return (int32_t)setdomainname(name, len);
}

int32_t libc_fuchsia_mod_vhangup(void) {
    return (int32_t)vhangup();
}

int32_t libc_fuchsia_mod_sendmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags) {
    return (int32_t)sendmmsg(sockfd, msgvec, vlen, flags);
}

int32_t libc_fuchsia_mod_recvmmsg(int32_t sockfd, void* msgvec, uint32_t vlen, int32_t flags, void* timeout) {
    return (int32_t)recvmmsg(sockfd, msgvec, vlen, flags, timeout);
}

void libc_fuchsia_mod_sync(void) {
    sync();
}

int32_t libc_fuchsia_mod_sched_getaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_getaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_fuchsia_mod_sched_setaffinity(int32_t pid, uint64_t cpusetsize, void* cpuset) {
    return (int32_t)sched_setaffinity(pid, cpusetsize, cpuset);
}

int32_t libc_fuchsia_mod_umount(const char* target) {
    return (int32_t)umount(target);
}

int32_t libc_fuchsia_mod_sched_get_priority_max(int32_t policy) {
    return (int32_t)sched_get_priority_max(policy);
}

int64_t libc_fuchsia_mod_tee(int32_t fd_in, int32_t fd_out, uint64_t len, uint32_t flags) {
    return (int64_t)tee(fd_in, fd_out, len, flags);
}

int32_t libc_fuchsia_mod_settimeofday(void* tv, void* tz) {
    return (int32_t)settimeofday(tv, tz);
}

int64_t libc_fuchsia_mod_splice(int32_t fd_in, void* off_in, int32_t fd_out, void* off_out, uint64_t len, uint32_t flags) {
    return (int64_t)splice(fd_in, off_in, fd_out, off_out, len, flags);
}

int32_t libc_fuchsia_mod_eventfd(uint32_t initval, int32_t flags) {
#if defined(__linux__)
    return (int32_t)eventfd(initval, flags);
#else
    (void)initval;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sched_rr_get_interval(int32_t pid, void* tp) {
    return (int32_t)sched_rr_get_interval(pid, tp);
}

int32_t libc_fuchsia_mod_sem_timedwait(void* sem, void* abstime) {
    return (int32_t)sem_timedwait(sem, abstime);
}

int32_t libc_fuchsia_mod_sem_getvalue(void* sem, void* sval) {
    return (int32_t)sem_getvalue(sem, sval);
}

int32_t libc_fuchsia_mod_sched_setparam(int32_t pid, void* param) {
    return (int32_t)sched_setparam(pid, param);
}

int32_t libc_fuchsia_mod_swapoff(const char* puath) {
    return (int32_t)swapoff(puath);
}

int64_t libc_fuchsia_mod_vmsplice(int32_t fd, void* iov, uint64_t nr_segs, uint32_t flags) {
    return (int64_t)vmsplice(fd, iov, nr_segs, flags);
}

int32_t libc_fuchsia_mod_mount(const char* src, const char* target, const char* fstype, uint64_t flags, void* data) {
    return (int32_t)mount(src, target, fstype, flags, data);
}

int32_t libc_fuchsia_mod_personality(uint64_t persona) {
    return (int32_t)personality(persona);
}

int32_t libc_fuchsia_mod_sched_getparam(int32_t pid, void* param) {
    return (int32_t)sched_getparam(pid, param);
}

int32_t libc_fuchsia_mod_ppoll(void* fds, uint64_t nfds, void* timeout, void* sigmask) {
    return (int32_t)ppoll(fds, nfds, timeout, sigmask);
}

int32_t libc_fuchsia_mod_pthread_mutex_timedlock(void* lock, void* abstime) {
    return (int32_t)pthread_mutex_timedlock(lock, abstime);
}

int32_t libc_fuchsia_mod_sched_getscheduler(int32_t pid) {
    return (int32_t)sched_getscheduler(pid);
}

int32_t libc_fuchsia_mod_clock_nanosleep(int32_t clk_id, int32_t flags, void* rqtp, void* rmtp) {
    return (int32_t)clock_nanosleep(clk_id, flags, rqtp, rmtp);
}

int32_t libc_fuchsia_mod_pthread_attr_getguardsize(void* attr, void* guardsize) {
    return (int32_t)pthread_attr_getguardsize(attr, guardsize);
}

int32_t libc_fuchsia_mod_pthread_attr_setguardsize(void* attr, uint64_t guardsize) {
    return (int32_t)pthread_attr_setguardsize(attr, guardsize);
}

int32_t libc_fuchsia_mod_sethostname(const char* name, uint64_t len) {
    return (int32_t)sethostname(name, len);
}

int32_t libc_fuchsia_mod_sched_get_priority_min(int32_t policy) {
    return (int32_t)sched_get_priority_min(policy);
}

int32_t libc_fuchsia_mod_umount2(const char* target, int32_t flags) {
    return (int32_t)umount2(target, flags);
}

int32_t libc_fuchsia_mod_swapon(const char* path, int32_t swapflags) {
    return (int32_t)swapon(path, swapflags);
}

int32_t libc_fuchsia_mod_sched_setscheduler(int32_t pid, int32_t policy, void* param) {
    return (int32_t)sched_setscheduler(pid, policy, param);
}

int32_t libc_fuchsia_mod_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_fuchsia_mod_getgrgid_r(uint32_t gid, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrgid_r(gid, grp, buf, buflen, result);
}

int32_t libc_fuchsia_mod_sigaltstack(void* ss, void* oss) {
    return (int32_t)sigaltstack(ss, oss);
}

int32_t libc_fuchsia_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_fuchsia_mod_getdtablesize(void) {
    return (int32_t)getdtablesize();
}

int32_t libc_fuchsia_mod_getgrnam_r(const char* name, void* grp, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getgrnam_r(name, grp, buf, buflen, result);
}

int32_t libc_fuchsia_mod_initgroups(const char* user, uint32_t group) {
    return (int32_t)initgroups(user, group);
}

int32_t libc_fuchsia_mod_pthread_sigmask(int32_t how, void* set, void* oldset) {
    return (int32_t)pthread_sigmask(how, set, oldset);
}

void* libc_fuchsia_mod_getgrnam(const char* name) {
    return (void*)getgrnam(name);
}

int32_t libc_fuchsia_mod_pthread_cancel(uint64_t thread) {
    return (int32_t)pthread_cancel(thread);
}

int32_t libc_fuchsia_mod_pthread_kill(uint64_t thread, int32_t sig) {
#if !defined(_WIN32)
    return (int32_t)pthread_kill(thread, sig);
#else
    (void)thread;
    (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_fuchsia_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

int32_t libc_fuchsia_mod_daemon(int32_t nochdir, int32_t noclose) {
    return (int32_t)daemon(nochdir, noclose);
}

int32_t libc_fuchsia_mod_getpwnam_r(const char* name, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwnam_r(name, pwd, buf, buflen, result);
}

int32_t libc_fuchsia_mod_getpwuid_r(uint32_t uid, void* pwd, char* buf, uint64_t buflen, void* result) {
    return (int32_t)getpwuid_r(uid, pwd, buf, buflen, result);
}

int32_t libc_fuchsia_mod_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_fuchsia_mod_pthread_atfork(void* prepare, void* parent, void* child) {
    return (int32_t)pthread_atfork(prepare, parent, child);
}

void* libc_fuchsia_mod_getgrgid(uint32_t gid) {
    return (void*)getgrgid(gid);
}

void libc_fuchsia_mod_setgrent(void) {
    setgrent();
}

void libc_fuchsia_mod_endgrent(void) {
    endgrent();
}

void* libc_fuchsia_mod_getgrent(void) {
    return (void*)getgrent();
}

int32_t libc_fuchsia_mod_getgrouplist(const char* user, uint32_t group, void* groups, void* ngroups) {
    return (int32_t)getgrouplist(user, group, groups, ngroups);
}

void* libc_fuchsia_mod_popen(const char* command, const char* mode) {
    return (void*)popen(command, mode);
}

int32_t libc_fuchsia_mod_faccessat(int32_t dirfd, const char* pathname, int32_t mode, int32_t flags) {
    return (int32_t)faccessat(dirfd, pathname, mode, flags);
}

int32_t libc_fuchsia_mod_pthread_create(void* native, void* attr, int32_t f, void* value) {
    return (int32_t)pthread_create(native, attr, f, value);
}

int32_t libc_fuchsia_mod_dl_iterate_phdr(void* callback, void* data) {
    return (int32_t)dl_iterate_phdr(callback, data);
}

