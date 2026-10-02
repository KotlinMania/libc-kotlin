#define _DARWIN_C_SOURCE
#define _BSD_SOURCE
#define _GNU_SOURCE
#include "libc_wrapper.h"
#ifdef __APPLE__
int getentropy(void*, uint64_t);
#endif

#include <errno.h>
#include <limits.h>
#include <stdlib.h>
#include <string.h>
#ifndef _WIN32
#include <fnmatch.h>
#endif
#include <ctype.h>
#include <stdio.h>
#ifndef _WIN32
#include <unistd.h>
#endif
#include <sys/stat.h>
#include <sys/stat.h>
#ifndef _WIN32
#include <sys/socket.h>
#endif

/* Feature test macros for POSIX extensions (pthread_condattr_setclock, sched_*, etc.) */
#ifndef _GNU_SOURCE
#define _BSD_SOURCE
#define _GNU_SOURCE
#endif

/* getentropy: <sys/random.h> on Linux, <unistd.h> on macOS/BSD */
#if defined(__linux__) && defined(__has_include)
#if __has_include(<sys/random.h>)
#include <sys/random.h>
#endif
#elif defined(__linux__)
#include <sys/random.h>
#endif

/* sysctl: <sys/sysctl.h> on BSD/macOS */
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
#include <sys/sysctl.h>
#endif

/* dirname/basename: <libgen.h> */
#ifndef _WIN32
#include <libgen.h>
#endif

/* The runner's glibc headers can redirect parsers to C23 entry points that
 * are absent from the Kotlin/Native link sysroot. Bind the existing ABI
 * symbols explicitly instead of depending on glibc feature-macro internals. */
#if defined(__linux__) && defined(__GLIBC__)
extern long libc_legacy_strtol(const char*, char**, int) __asm__("strtol");
extern long long libc_legacy_strtoll(const char*, char**, int) __asm__("strtoll");
extern unsigned long libc_legacy_strtoul(const char*, char**, int) __asm__("strtoul");
extern unsigned long long libc_legacy_strtoull(const char*, char**, int) __asm__("strtoull");
#else
#define libc_legacy_strtol strtol
#define libc_legacy_strtoll strtoll
#define libc_legacy_strtoul strtoul
#define libc_legacy_strtoull strtoull
#endif

/* CMSG macros */
void* libc_cmsg_data(void* cmsg) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_DATA((WSACMSGHDR*)cmsg);
#else
    return CMSG_DATA((struct cmsghdr*)cmsg);
#endif
}
void* libc_cmsg_firsthdr(void* mhdr) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_FIRSTHDR((WSAMSG*)mhdr);
#else
    return CMSG_FIRSTHDR((struct msghdr*)mhdr);
#endif
}
void* libc_cmsg_nxthdr(void* mhdr, void* cmsg) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_NXTHDR((WSAMSG*)mhdr, (WSACMSGHDR*)cmsg);
#else
    return CMSG_NXTHDR((struct msghdr*)mhdr, (struct cmsghdr*)cmsg);
#endif
}
uint64_t libc_cmsg_space(uint64_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_SPACE(length);
#else
    return CMSG_SPACE(length);
#endif
}
uint64_t libc_cmsg_len(uint64_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_LEN(length);
#else
    return CMSG_LEN(length);
#endif
}
uint64_t libc_cmsg_align(uint64_t len) {
    return (len + sizeof(uint64_t) - 1) & ~(sizeof(uint64_t) - 1);
}

/* stdlib.h */
void* libc_calloc(uint64_t nobj, uint64_t size) { return calloc((uint64_t)nobj, (uint64_t)size); }
void* libc_malloc(uint64_t size) { return malloc((uint64_t)size); }
void* libc_realloc(void* p, uint64_t size) { return realloc(p, (uint64_t)size); }
void libc_free(void* p) { free(p); }
void libc_aligned_free(void* p) {
#ifdef _WIN32
    _aligned_free(p);
#else
    free(p);
#endif
}
void* libc_aligned_realloc(void* p, uint64_t size, uint64_t alignment) {
#ifdef _WIN32
    return _aligned_realloc(p, (size_t)size, (size_t)alignment);
#else
    (void)alignment;
    return realloc(p, (size_t)size);
#endif
}
void* libc_aligned_alloc(uint64_t alignment, uint64_t size) {
#ifdef _WIN32
    return _aligned_malloc((uint64_t)size, (uint64_t)alignment);
#elif defined(__ANDROID__)
    return memalign((size_t)alignment, (size_t)size);
#else
    return aligned_alloc((uint64_t)alignment, (uint64_t)size);
#endif
}
int libc_atoi(const char* s) { return atoi(s); }
int64_t libc_atol(const char* s) { return (int64_t)atol(s); }
int64_t libc_atoll(const char* s) { return (int64_t)atoll(s); }
char* libc_getenv(const char* s) { return getenv(s); }
char* libc_strerror(int n) { return strerror(n); }
char* libc_strdup(const char* s) {
#ifdef _WIN32
    return _strdup(s);
#else
    return strdup(s);
#endif
}
int libc_abs(int n) { return abs(n); }
int libc_rand(void) { return rand(); }
void libc_srand(unsigned int seed) { srand(seed); }
void libc_abort(void) { abort(); }
void libc_exit(int status) { exit(status); }
int libc_system(const char* s) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return system(s);
#else
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

/* string.h */
uint64_t libc_strlen(const char* s) { return (uint64_t)strlen(s); }
uint64_t libc_strnlen(const char* s, uint64_t n) { return (uint64_t)strnlen(s, (uint64_t)n); }
uint64_t libc_strspn(const char* s, const char* accept) { return (uint64_t)strspn(s, accept); }
uint64_t libc_strcspn(const char* s, const char* reject) { return (uint64_t)strcspn(s, reject); }
char* libc_strchr(const char* s, int c) { return strchr(s, c); }
char* libc_strrchr(const char* s, int c) { return strrchr(s, c); }
char* libc_strpbrk(const char* s, const char* accept) { return strpbrk(s, accept); }
char* libc_strstr(const char* s, const char* find) { return strstr(s, find); }
char* libc_strcpy(char* dst, const char* src) { return strcpy(dst, src); }
char* libc_strncpy(char* dst, const char* src, uint64_t n) { return strncpy(dst, src, n); }
char* libc_strcat(char* s, const char* ct) { return strcat(s, ct); }
char* libc_strncat(char* s, const char* ct, uint64_t n) { return strncat(s, ct, n); }
char* libc_strtok(char* s, const char* delim) {
    return strtok(s, delim);
}
char* libc_getcwd(char* buf, uint64_t size) {
#ifdef _WIN32
    return _getcwd(buf, (int)size);
#else
    return getcwd(buf, size);
#endif
}
char* libc_realpath(const char* pathname, char* resolved) {
#ifdef _WIN32
    return _fullpath(resolved, pathname, _MAX_PATH);
#else
    return realpath(pathname, resolved);
#endif
}
char* libc_tmpnam(char* buf) {
#ifdef _WIN32
    return tmpnam(buf);
#else
    return tmpnam(buf);
#endif
}
char* libc_mkdtemp(char* tmpl) {
#ifdef _WIN32
    return _mktemp(tmpl);
#else
    return mkdtemp(tmpl);
#endif
}
int libc_strcmp(const char* s1, const char* s2) { return strcmp(s1, s2); }
int libc_strncmp(const char* s1, const char* s2, uint64_t n) { return strncmp(s1, s2, n); }
int libc_strcasecmp(const char* s1, const char* s2) {
#ifdef _WIN32
    return _stricmp(s1, s2);
#else
    return strcasecmp(s1, s2);
#endif
}
int libc_strncasecmp(const char* s1, const char* s2, uint64_t n) {
#ifdef _WIN32
    return _strnicmp(s1, s2, n);
#else
    return strncasecmp(s1, s2, n);
#endif
}
void* libc_memchr(const void* s, int c, uint64_t n) { return memchr(s, c, n); }
int libc_memcmp(const void* s1, const void* s2, uint64_t n) { return memcmp(s1, s2, n); }
void* libc_memcpy(void* dest, const void* src, uint64_t n) { return memcpy(dest, src, n); }
void* libc_memccpy(void* dest, const void* src, int c, uint64_t n) { return memccpy(dest, src, c, n); }
void* libc_memmove(void* dest, const void* src, uint64_t n) { return memmove(dest, src, n); }
void* libc_memset(void* s, int c, uint64_t n) { return memset(s, c, n); }

/* ctype.h */
int libc_isalnum(int c) { return isalnum(c); }
int libc_isalpha(int c) { return isalpha(c); }
int libc_iscntrl(int c) { return iscntrl(c); }
int libc_isdigit(int c) { return isdigit(c); }
int libc_isgraph(int c) { return isgraph(c); }
int libc_islower(int c) { return islower(c); }
int libc_isprint(int c) { return isprint(c); }
int libc_ispunct(int c) { return ispunct(c); }
int libc_isspace(int c) { return isspace(c); }
int libc_isupper(int c) { return isupper(c); }
int libc_isxdigit(int c) { return isxdigit(c); }
int libc_isblank(int c) { return isblank(c); }
int libc_tolower(int c) { return tolower(c); }
int libc_toupper(int c) { return toupper(c); }

/* stdio.h */
void* libc_fopen(const char* filename, const char* mode) { return fopen(filename, mode); }
int libc_fclose(void* stream) { return fclose((FILE*)stream); }
int libc_fflush(void* stream) { return fflush((FILE*)stream); }
void* libc_freopen(const char* filename, const char* mode, void* stream) { return freopen(filename, mode, (FILE*)stream); }
void* libc_tmpfile(void) { return tmpfile(); }
int libc_fgetc(void* stream) { return fgetc((FILE*)stream); }
int libc_fputc(int c, void* stream) { return fputc(c, (FILE*)stream); }
int libc_fputs(const char* s, void* stream) { return fputs(s, (FILE*)stream); }
int libc_ungetc(int c, void* stream) { return ungetc(c, (FILE*)stream); }
int libc_fseek(void* stream, int64_t offset, int whence) { return fseek((FILE*)stream, (long)offset, whence); }
int64_t libc_ftell(void* stream) { return ftell((FILE*)stream); }
void libc_rewind(void* stream) { rewind((FILE*)stream); }
int libc_feof(void* stream) { return feof((FILE*)stream); }
int libc_ferror(void* stream) { return ferror((FILE*)stream); }
void libc_clearerr(void* stream) { clearerr((FILE*)stream); }
void* libc_fdopen(int fd, const char* mode) { return fdopen(fd, mode); }
int libc_remove(const char* filename) { return remove(filename); }
int libc_rename(const char* oldname, const char* newname) { return rename(oldname, newname); }
int libc_getchar(void) { return getchar(); }
int libc_putchar(int c) { return putchar(c); }
int libc_puts(const char* s) { return puts(s); }
void libc_perror(const char* s) { perror(s); }

/* unistd.h — Windows uses _-prefixed names from <io.h>/<direct.h> */
int libc_close(int fd) {
#ifdef _WIN32
    return _close(fd);
#else
    return close(fd);
#endif
}
int libc_dup(int fd) {
#ifdef _WIN32
    return _dup(fd);
#else
    return dup(fd);
#endif
}
int libc_dup2(int fd1, int fd2) {
#ifdef _WIN32
    return _dup2(fd1, fd2);
#else
    return dup2(fd1, fd2);
#endif
}
#ifndef _WIN32
int libc_fsync(int fd) { return fsync(fd); }
#endif
#ifndef _WIN32
int libc_fchdir(int fd) { return fchdir(fd); }
#endif
int libc_chdir(const char* path) {
#ifdef _WIN32
    return _chdir(path);
#else
    return chdir(path);
#endif
}
int libc_rmdir(const char* path) {
#ifdef _WIN32
    return _rmdir(path);
#else
    return rmdir(path);
#endif
}
#ifdef _WIN32
int libc_mkdir(const char* path, int mode) { (void)mode; return _mkdir(path); }
#else
int libc_mkdir(const char* path, int mode) { return mkdir(path, mode); }
#endif
int libc_unlink(const char* path) {
#ifdef _WIN32
    return _unlink(path);
#else
    return unlink(path);
#endif
}
int libc_access(const char* path, int mode) {
#ifdef _WIN32
    return _access(path, mode);
#else
    return access(path, mode);
#endif
}
int libc_isatty(int fd) {
#ifdef _WIN32
    return _isatty(fd);
#else
    return isatty(fd);
#endif
}
int libc_getpid(void) {
#ifdef _WIN32
    return _getpid();
#else
    return getpid();
#endif
}
#ifndef _WIN32
int libc_getppid(void) { return getppid(); }
#endif
#ifndef _WIN32
int libc_pause(void) { return pause(); }
#endif
int libc_sleep(unsigned int seconds) {
#ifdef _WIN32
    while (seconds > 4294967u) { Sleep(4294967000u); seconds -= 4294967u; }
    Sleep(seconds * 1000u); return 0;
#else
    return sleep(seconds);
#endif
}
#ifndef _WIN32
int libc_getuid(void) { return getuid(); }
#endif
#ifndef _WIN32
int libc_geteuid(void) { return geteuid(); }
#endif
#ifndef _WIN32
int libc_getgid(void) { return getgid(); }
#endif
#ifndef _WIN32
int libc_getegid(void) { return getegid(); }
#endif
#ifndef _WIN32
int libc_setuid(int uid) { return setuid(uid); }
#endif
#ifndef _WIN32
int libc_setgid(int gid) { return setgid(gid); }
#endif
#ifndef _WIN32
int libc_seteuid(int uid) { return seteuid(uid); }
#endif
#ifndef _WIN32
int libc_setegid(int gid) { return setegid(gid); }
#endif

/* socket.h */
int libc_socket(int domain, int type, int protocol) { return socket(domain, type, protocol); }
int libc_listen(int sockfd, int backlog) { return listen(sockfd, backlog); }
int libc_shutdown(int sockfd, int how) { return shutdown(sockfd, how); }
int libc_bind(int sockfd, void* addr, int addrlen) { return bind(sockfd, (struct sockaddr*)addr, addrlen); }

#ifndef _WIN32
/* Additional wrappers */
#ifndef _WIN32
#include <dlfcn.h>
#endif
#ifndef _WIN32
#include <netdb.h>
#endif
#include <locale.h>
#ifndef _WIN32
#include <sys/mman.h>
#endif
#ifndef _WIN32
#include <termios.h>
#endif
#include <signal.h>
#ifndef _WIN32
#include <sys/shm.h>
#endif
#ifdef __APPLE__
#include <execinfo.h>
#include <util.h>
#include <mach/mach_time.h>
#endif
#ifndef _WIN32
#include <sys/syslog.h>
#endif
#include <sys/time.h>
#include <time.h>
#ifndef _WIN32
#include <sched.h>
#endif
#ifndef _WIN32
#include <pthread.h>
#endif
#ifndef _WIN32
#include <sys/wait.h>
#endif
#ifndef _WIN32
#include <sys/uio.h>
#endif
#ifndef _WIN32
#include <sys/resource.h>
#endif
#ifndef _WIN32
#include <sys/utsname.h>
#endif
#ifndef _WIN32
#include <strings.h>
#endif
#ifdef __linux__
#include <malloc.h>
#endif
#ifndef _WIN32
#include <langinfo.h>
#endif

int libc_bcmp(const void* s1, const void* s2, uint64_t n) {
#if defined(__ANDROID__) || defined(_WIN32)
    return memcmp(s1, s2, (size_t)n);
#else
    return bcmp(s1, s2, (size_t)n);
#endif
}
int libc_dlclose(void* handle) {
#ifndef _WIN32
    return dlclose(handle);
#else
    (void)handle;
    return -1;
#endif
}
char* libc_dlerror(void) {
#ifndef _WIN32
    return dlerror();
#else
    return NULL;
#endif
}
void* libc_dlopen(const char* filename, int flag) {
#ifndef _WIN32
    return dlopen(filename, flag);
#else
    (void)filename; (void)flag;
    return NULL;
#endif
}
void* libc_dlsym(void* handle, const char* symbol) {
#ifndef _WIN32
    return dlsym(handle, symbol);
#else
    (void)handle; (void)symbol;
    return NULL;
#endif
}
char* libc_gai_strerror(int errcode) { return gai_strerror(errcode); }
int libc_getdtablesize(void) {
#if defined(__ANDROID__)
    return (int)sysconf(_SC_OPEN_MAX);
#elif defined(_WIN32)
    return 512;
#else
    return getdtablesize();
#endif
}
char* libc_getlogin(void) { return getlogin(); }
int libc_getpagesize(void) { return getpagesize(); }
int libc_madvise(void* addr, uint64_t len, int advice) { return madvise(addr, len, advice); }
int libc_mincore(void* addr, uint64_t len, unsigned char* vec) { return mincore(addr, len, vec); }
int libc_mlock(const void* addr, uint64_t len) { return mlock(addr, len); }
int libc_mlockall(int flags) { return mlockall(flags); }
int libc_mprotect(void* addr, uint64_t len, int prot) { return mprotect(addr, len, prot); }
int libc_msync(void* addr, uint64_t len, int flags) { return msync(addr, len, flags); }
int libc_munlock(const void* addr, uint64_t len) { return munlock(addr, len); }
int libc_munlockall(void) { return munlockall(); }
int libc_munmap(void* addr, uint64_t len) { return munmap(addr, len); }
int libc_nice(int inc) { return nice(inc); }
int libc_raise(int sig) { return raise(sig); }
int64_t libc_read(int fd, void* buf, uint64_t count) { return (long)read(fd, buf, count); }
char* libc_setlocale(int category, const char* locale) { return setlocale(category, locale); }
int libc_setlogmask(int mask) { return setlogmask(mask); }
int libc_tcflush(int fd, int queue_selector) { return tcflush(fd, queue_selector); }
int libc_tcsendbreak(int fd, int duration) { return tcsendbreak(fd, duration); }
char* libc_ttyname(int fd) { return ttyname(fd); }
int libc_usleep(unsigned int useconds) { return usleep(useconds); }

/* Auto-generated wrappers */
int libc_setvbuf(void* stream, const char* buffer, int mode, uint64_t size) { return setvbuf(stream, buffer, mode, size); }
uint64_t libc_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) { return (uint64_t)fwrite(ptr, (uint64_t)size, (uint64_t)nobj, stream); }
int libc_fgetpos(void* stream, void* ptr) { return fgetpos(stream, ptr); }
int libc_fsetpos(void* stream, void* ptr) { return fsetpos(stream, ptr); }
uint64_t libc_strxfrm(char* s, const char* ct, uint64_t n) { return (uint64_t)strxfrm(s, ct, n); }
int64_t libc_ftello(void* stream) { return (int64_t)ftello((FILE*)stream); }
int32_t libc_setpgid(int32_t pid, int32_t pgid) { return setpgid(pid, pgid); }
int64_t libc_readlink(const char* path, void* buf, uint64_t bufsize) {
#ifndef _WIN32
    return readlink(path, (char*)buf, (size_t)bufsize);
#else
    (void)path; (void)buf; (void)bufsize; errno = ENOSYS; return -1;
#endif
}
int64_t libc_strtol(const char* s, void* endp, int base) {
    return libc_legacy_strtol(s, (char**)endp, base);
}
uint64_t libc_confstr(int name, void* buf, uint64_t len) {
#if !defined(_WIN32) && !defined(__ANDROID__)
    return (uint64_t)confstr(name, (char*)buf, (size_t)len);
#else
    (void)name; (void)buf; (void)len; errno = ENOSYS; return 0;
#endif
}
int64_t libc_fpathconf(int filedes, int name) { return fpathconf(filedes, name); }
int64_t libc_lseek(int fd, int64_t offset, int whence) { return lseek(fd, offset, whence); }
int64_t libc_pathconf(const char* path, int name) { return pathconf(path, name); }
int64_t libc_sysconf(int attr) { return sysconf(attr); }
int libc_strcoll(const char* cs, const char* ct) { return strcoll(cs, ct); }
int libc_linkat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath, int flags) { return linkat(olddirfd, oldpath, newdirfd, newpath, flags); }
int libc_unlinkat(int dirfd, const char* pathname, int flags) { return unlinkat(dirfd, pathname, flags); }
int libc_fileno(void* stream) { return fileno(stream); }
int libc_creat(const char* path, uint32_t mode) { return creat(path, mode); }
int libc_fchown(int fd, uint32_t owner, uint32_t group) { return fchown(fd, owner, group); }
int libc_chown(const char* path, uint32_t uid, uint32_t gid) { return chown(path, uid, gid); }
int libc_truncate(const char* path, int64_t length) { return truncate(path, length); }
int libc_gethostname(void* name, uint64_t len) { return gethostname((char*)name, (size_t)len); }
int libc_mkfifo(const char* path, uint32_t mode) { return mkfifo(path, mode); }
int libc_fseeko(void* stream, int64_t offset, int whence) { return fseeko((FILE*)stream, (int64_t)offset, whence); }
int libc_mkstemp(const char* template) { return mkstemp(template); }
int libc_symlinkat(const char* target, int newdirfd, const char* linkpath) { return symlinkat(target, newdirfd, linkpath); }
int libc_fchmodat(int dirfd, const char* pathname, uint32_t mode, int flags) { return fchmodat(dirfd, pathname, (uint32_t)mode, flags); }
int libc_ftruncate(int fd, int64_t length) { return ftruncate(fd, length); }
int libc_setenv(const char* envVarName, const char* envVarValue, int overwrite) { return setenv(envVarName, envVarValue, overwrite); }
int libc_unsetenv(const char* envVarName) { return unsetenv(envVarName); }
int libc_link(const char* src, const char* dst) { return link(src, dst); }
int libc_symlink(const char* path1, const char* path2) { return symlink(path1, path2); }
int libc_chmod(const char* path, uint32_t mode) { return chmod(path, (uint32_t)mode); }
int libc_fchmod(int attr1, uint32_t attr2) { return fchmod(attr1, (uint32_t)attr2); }
int libc_closedir(void* ptr) { return closedir(ptr); }
int libc_kill(int32_t pid, int signo) { return kill(pid, signo); }
int64_t libc_random(void) { return random(); }
int libc_isascii(int c) { return isascii(c); }
int64_t libc_llabs(int64_t a) { return llabs(a); }
int64_t libc_labs(int64_t i) { return labs(i); }
int libc_mkdirat(int dirfd, const char* pathname, uint32_t mode) { return mkdirat(dirfd, pathname, mode); }
int64_t libc_readlinkat(int dirfd, const char* pathname, void* buf, uint64_t bufsiz) {
#ifndef _WIN32
    return readlinkat(dirfd, pathname, (char*)buf, (size_t)bufsiz);
#else
    (void)dirfd; (void)pathname; (void)buf; (void)bufsiz; errno = ENOSYS; return -1;
#endif
}
int libc_renameat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath) { return renameat(olddirfd, oldpath, newdirfd, newpath); }
int libc_lchown(const char* path, uint32_t uid, uint32_t gid) { return lchown(path, uid, gid); }
int libc_execv(const char* prog, void* argv) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return execv(prog, argv);
#else
    (void)prog; (void)argv;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_execve(const char* prog, void* argv, void* envp) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return execve(prog, argv, envp);
#else
    (void)prog; (void)argv; (void)envp;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_execvp(const char* c, void* argv) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return execvp(c, argv);
#else
    (void)c; (void)argv;
    errno = ENOSYS;
    return -1;
#endif
}
int32_t libc_fork(void) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return fork();
#else
    errno = ENOSYS;
    return -1;
#endif
}
int32_t libc_getpgid(int32_t pid) { return getpgid(pid); }
int32_t libc_getpgrp(void) { return getpgrp(); }
int32_t libc_setsid(void) { return setsid(); }
int32_t libc_tcgetpgrp(int fd) { return tcgetpgrp(fd); }
int libc_tcsetpgrp(int fd, int32_t pgrp) { return tcsetpgrp(fd, pgrp); }
int64_t libc_pread(int fd, void* buf, uint64_t count, int64_t offset) { return pread(fd, buf, count, offset); }
int64_t libc_pwrite(int fd, void* buf, uint64_t count, int64_t offset) { return pwrite(fd, buf, count, offset); }
int libc_flock(int fd, int operation) { return flock(fd, operation); }
int32_t libc_getsid(int32_t pid) { return getsid(pid); }
int libc_tcdrain(int fd) { return tcdrain(fd); }
int libc_tcflow(int fd, int action) { return tcflow(fd, action); }
int32_t libc_tcgetsid(int fd) { return tcgetsid(fd); }
int libc_grantpt(int fd) { return grantpt(fd); }
int libc_unlockpt(int fd) { return unlockpt(fd); }
int libc_fdatasync(int fd) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return fdatasync(fd);
#else
    (void)fd;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_dirfd(void* dirp) { return dirfd(dirp); }
int libc_setreuid(uint32_t ruid, uint32_t euid) { return setreuid(ruid, euid); }
int libc_setregid(uint32_t rgid, uint32_t egid) { return setregid(rgid, egid); }
int libc_acct(const char* filename) { return acct(filename); }
int libc_shmdt(void* shmaddr) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return shmdt(shmaddr);
#else
    (void)shmaddr;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_mkostemp(const char* template, int flags) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return mkostemp((char*)template, flags);
#else
    (void)template; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_mkostemps(const char* template, int suffixlen, int flags) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return mkostemps((char*)template, suffixlen, flags);
#else
    (void)template; (void)suffixlen; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}
#ifdef __APPLE__
int libc_reboot(int howTo) { return reboot(howTo); }
int libc_mkfifoat(int dirfd, const char* pathname, uint32_t mode) { return mkfifoat(dirfd, pathname, mode); }
#endif
int libc_mkstemps(const char* template, int suffixlen) { return mkstemps(template, suffixlen); }
int libc_getdomainname(const char* name, uint64_t len) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return getdomainname((char*)name, (size_t)len);
#else
    (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_setdomainname(const char* name, uint64_t len) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return setdomainname(name, (size_t)len);
#else
    (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sethostname(const char* name, uint64_t len) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return sethostname(name, (size_t)len);
#else
    (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_initgroups(const char* user, int group) { return initgroups(user, (uint32_t)group); }
int libc_daemon(int nochdir, int noclose) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return daemon(nochdir, noclose);
#else
    (void)nochdir; (void)noclose;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_faccessat(int dirfd, const char* pathname, int mode, int flags) { return faccessat(dirfd, pathname, mode, flags); }
int libc_getc(void* arg1) { return getc(arg1); }
int libc_putc(int arg1, void* arg2) { return putc(arg1, arg2); }
int libc_ftrylockfile(void* arg1) { return ftrylockfile(arg1); }
int libc_getw(void* arg1) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return getw((FILE*)arg1);
#else
    int w;
    if (fread(&w, sizeof(int), 1, (FILE*)arg1) == 1) return w;
    return EOF;
#endif
}
int libc_putw(int arg1, void* arg2) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return putw(arg1, (FILE*)arg2);
#else
    if (fwrite(&arg1, sizeof(int), 1, (FILE*)arg2) == 1) return 0;
    return EOF;
#endif
}
int libc_mblen(const char* arg1, uint64_t arg2) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return mblen(arg1, (size_t)arg2);
#else
    (void)arg1; (void)arg2;
    errno = ENOSYS;
    return -1;
#endif
}
int64_t libc_lrand48(void) { return lrand48(); }
int64_t libc_mrand48(void) { return mrand48(); }
int64_t libc_a64l(const char* arg1) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return (int64_t)a64l(arg1);
#else
    (void)arg1;
    return 0;
#endif
}
#ifdef __APPLE__
int libc_radixsort(void* arg1, int arg2, void* arg3, unsigned int arg4) { return radixsort(arg1, arg2, arg3, arg4); }
int libc_sradixsort(void* arg1, int arg2, void* arg3, unsigned int arg4) { return sradixsort(arg1, arg2, arg3, arg4); }
#endif
/* strlcat/strlcpy are BSD-only, not available on Linux */
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
uint64_t libc_strlcat(const char* arg1, const char* arg2, uint64_t arg3) { return (uint64_t)strlcat(arg1, arg2, arg3); }
uint64_t libc_strlcpy(const char* arg1, const char* arg2, uint64_t arg3) { return (uint64_t)strlcpy(arg1, arg2, arg3); }
#endif
int libc_ffs(int arg1) { return ffs(arg1); }
int libc_getsubopt(void* arg1, void* arg2, void* arg3) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return getsubopt((char**)arg1, (char* const*)arg2, (char**)arg3);
#else
    (void)arg1; (void)arg2; (void)arg3;
    return -1;
#endif
}
int libc_killpg(int32_t pgrp, int sig) { return killpg(pgrp, sig); }
int libc_chroot(const char* name) { return chroot(name); }
int libc_lockf(int fd, int cmd, int64_t len) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return lockf(fd, cmd, (off_t)len);
#else
    (void)fd; (void)cmd; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}
int32_t libc_vfork(void) {
#if !defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE
    return vfork();
#else
    errno = ENOSYS;
    return -1;
#endif
}
int64_t libc_gethostid(void) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return (int64_t)gethostid();
#else
    return 0;
#endif
}
int libc_setlogin(const char* name) {
#if !defined(__ANDROID__) && !defined(_WIN32)
    return setlogin(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
#ifdef __APPLE__
int libc_issetugid(void) { return issetugid(); }
int libc_chflags(const char* path, unsigned int flags) { return chflags(path, flags); }
#endif
#ifdef __APPLE__
int libc_fchflags(int fd, unsigned int flags) { return fchflags(fd, flags); }
int64_t libc_strtonum(const char* numstr, int64_t minval, int64_t maxval, void* errstrp) { return (int64_t)strtonum(numstr, minval, maxval, errstrp); }
#endif
#ifdef __APPLE__
int libc_getattrlistat(int fd, const char* path, void* attrList, void* attrBuf, uint64_t attrBufSize, uint64_t options) { return getattrlistat(fd, path, attrList, attrBuf, attrBufSize, (unsigned long)options); }
int libc_getattrlistbulk(int dirfd, void* attrList, void* attrBuf, uint64_t attrBufSize, uint64_t options) { return getattrlistbulk(dirfd, attrList, attrBuf, attrBufSize, options); }
#endif
int libc_execvP(const char* file, const char* searchPath, void* argv) {
#if defined(__APPLE__) && (!defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE)
    return execvP(file, searchPath, argv);
#else
    (void)file; (void)searchPath; (void)argv;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_exchangedata(const char* path1, const char* path2, uint64_t options) {
#if defined(__APPLE__) && (!defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE)
    return exchangedata(path1, path2, (unsigned long)options);
#else
    (void)path1; (void)path2; (void)options;
    errno = ENOSYS;
    return -1;
#endif
}
#ifdef __APPLE__
int libc_lchflags(const char* path, uint64_t flags) { return lchflags(path, flags); }
#endif
int libc_ffsl(int64_t value) {
#if defined(__ANDROID__) || defined(_WIN32)
    return __builtin_ffsl((long)value);
#else
    return ffsl((long)value);
#endif
}
int libc_ffsll(int64_t value) {
#if defined(__ANDROID__) || defined(_WIN32)
    return __builtin_ffsll((long long)value);
#else
    return ffsll((long long)value);
#endif
}
#ifdef __APPLE__
int libc_fls(int value) { return fls(value); }
int libc_flsl(int64_t value) { return flsl((long)value); }
#endif
#ifdef __APPLE__
int libc_flsll(int64_t value) { return flsll((long long)value); }

#endif
/* Socket / signal / sched / pthread / pty wrappers — void* for struct params */
int libc_getnameinfo(void* sa, unsigned int salen, char* host, unsigned int hostlen, char* serv, unsigned int servlen, int flags) {
    return getnameinfo((const struct sockaddr*)sa, (socklen_t)salen, host, (socklen_t)hostlen, serv, (socklen_t)servlen, flags);
}
int libc_recvfrom(int socket, void* buf, uint64_t len, int flags, void* addr, void* addrlen) {
    return (int)recvfrom(socket, buf, len, flags, (struct sockaddr*)addr, (socklen_t*)addrlen);
}
int libc_recvmsg(int fd, void* msg, int flags) {
    return (int)recvmsg(fd, (struct msghdr*)msg, flags);
}
int64_t libc_sendmsg(int fd, void* msg, int flags) {
    return sendmsg(fd, (const struct msghdr*)msg, flags);
}
int libc_accept4(int fd, void* addr, void* len, int flg) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return accept4(fd, (struct sockaddr*)addr, (socklen_t*)len, flg);
#else
    (void)fd; (void)addr; (void)len; (void)flg;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_sigwait(void* set, int* sig) {
    return sigwait((const sigset_t*)set, sig);
}
int libc_sigsuspend(void* mask) {
    return sigsuspend((const sigset_t*)mask);
}
int libc_pthread_sigmask(int how, void* set, void* oldset) {
    return pthread_sigmask(how, (const sigset_t*)set, (sigset_t*)oldset);
}
int libc_pthread_condattr_setclock(void* attr, int clockId) {
#if defined(__linux__)
    return pthread_condattr_setclock((pthread_condattr_t*)attr, (int32_t)clockId);
#else
    (void)attr; (void)clockId;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_pthread_condattr_getclock(void* attr, int* clockId) {
#if defined(__linux__)
    return pthread_condattr_getclock((const pthread_condattr_t*)attr, (int32_t*)clockId);
#else
    (void)attr; (void)clockId;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_pthread_setschedparam(void* thread, int policy, void* param) {
    return pthread_setschedparam((pthread_t)thread, policy, (const struct sched_param*)param);
}
int libc_sched_setparam(int32_t pid, void* param) {
#if defined(__linux__)
    return sched_setparam(pid, (const struct sched_param*)param);
#else
    (void)pid; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_sched_getparam(int32_t pid, void* param) {
#if defined(__linux__)
    return sched_getparam(pid, (struct sched_param*)param);
#else
    (void)pid; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_sched_setscheduler(int32_t pid, int policy, void* param) {
#if defined(__linux__)
    return sched_setscheduler(pid, policy, (const struct sched_param*)param);
#else
    (void)pid; (void)policy; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}

#ifndef _WIN32
int libc_waitid(int idtype, int32_t id, void* infop, int options) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__sun)
    return waitid((idtype_t)idtype, (id_t)id, (siginfo_t*)infop, options);
#else
    (void)idtype; (void)id; (void)infop; (void)options;
    errno = ENOSYS;
    return -1;
#endif
}
#endif
int libc_openpty(int* amaster, int* aslave, char* name, void* termp, void* winp) {
#if !defined(__ANDROID__) && (defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__linux__))
    return openpty(amaster, aslave, name, (const struct termios*)termp, (const struct winsize*)winp);
#else
    (void)amaster; (void)aslave; (void)name; (void)termp; (void)winp;
    errno = ENOSYS;
    return -1;
#endif
}
int32_t libc_forkpty(int* amaster, char* name, void* termp, void* winp) {
#if !defined(__ANDROID__) && (defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__linux__))
    return forkpty(amaster, name, (const struct termios*)termp, (const struct winsize*)winp);
#else
    (void)amaster; (void)name; (void)termp; (void)winp;
    errno = ENOSYS;
    return -1;
#endif
}

/* Struct-param function wrappers — void* for struct pointer params */
int libc_gettimeofday(void* tp, void* tz) {
    return gettimeofday((struct timeval*)tp, tz);
}
int libc_clock_gettime(int32_t clk_id, void* tp) {
    return clock_gettime((int32_t)clk_id, (struct timespec*)tp);
}
int libc_futimens(int fd, void* times) {
    return futimens(fd, (const struct timespec*)times);
}
int64_t libc_pwritev(int fd, void* iov, int iovcnt, int64_t offset) {
#if !defined(__ANDROID__)
    return pwritev(fd, (const struct iovec*)iov, iovcnt, offset);
#else
    (void)fd; (void)iov; (void)iovcnt; (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}
int64_t libc_preadv(int fd, void* iov, int iovcnt, int64_t offset) {
#if !defined(__ANDROID__)
    return preadv(fd, (const struct iovec*)iov, iovcnt, offset);
#else
    (void)fd; (void)iov; (void)iovcnt; (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_uname(void* buf) {
    return uname((struct utsname*)buf);
}
int libc_getrlimit(int resource, void* rlim) {
    return getrlimit(resource, (struct rlimit*)rlim);
}
int libc_setrlimit(int resource, void* rlim) {
    return setrlimit(resource, (const struct rlimit*)rlim);
}
int64_t libc_readv(int fd, void* iov, int iovcnt) {
    return readv(fd, (const struct iovec*)iov, iovcnt);
}
int64_t libc_writev(int fd, void* iov, int iovcnt) {
    return writev(fd, (const struct iovec*)iov, iovcnt);
}
int libc_clock_getres(int32_t clk_id, void* res) {
    return clock_getres(clk_id, (struct timespec*)res);
}
int libc_utimensat(int dirfd, const char* path, void* times, int flags) {
    return utimensat(dirfd, path, (const struct timespec*)times, flags);
}
int libc_clock_settime(int32_t clk_id, void* tp) {
#if (!defined(TARGET_OS_IPHONE) || !TARGET_OS_IPHONE) && !defined(_WIN32)
    return clock_settime(clk_id, (const struct timespec*)tp);
#else
    (void)clk_id; (void)tp;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_clock_nanosleep(int32_t clock_id, int flags, void* rqtp, void* rmtp) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return clock_nanosleep(clock_id, flags, (const struct timespec*)rqtp, (struct timespec*)rmtp);
#else
    (void)clock_id; (void)flags; (void)rqtp; (void)rmtp;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_sigtimedwait(void* set, void* info, void* timeout) {
#if (!defined(__ANDROID__) && defined(__linux__)) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return sigtimedwait((const sigset_t*)set, (siginfo_t*)info, (const struct timespec*)timeout);
#else
    (void)set; (void)info; (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_settimeofday(void* tv, void* tz) {
    return settimeofday((const struct timeval*)tv, tz);
}
int libc_pthread_mutex_timedlock(void* mutex, void* abstime) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__CYGWIN__)
    return pthread_mutex_timedlock((pthread_mutex_t*)mutex, (const struct timespec*)abstime);
#else
    (void)mutex; (void)abstime;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_sem_timedwait(void* sem, void* abstime) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__CYGWIN__)
    return sem_timedwait((sem_t*)sem, (const struct timespec*)abstime);
#else
    (void)sem; (void)abstime;
    errno = ENOSYS;
    return -1;
#endif
}


/* COpaquePointer-param wrappers — void* for pointer params */
int libc_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return pthread_attr_getstack((pthread_attr_t*)attr, stackaddr, (uint64_t*)stacksize);
}
#if defined(__APPLE__)
int libc_getentropy(void* buf, uint64_t buflen) {
    return getentropy(buf, buflen);
}
#else
int libc_getentropy(void* buf, uint64_t buflen) { (void)buf; (void)buflen; return -1; }
#endif
int64_t libc_getrandom(void* buf, uint64_t buflen, unsigned int flags) {
    (void)buf; (void)buflen; (void)flags;
    errno = ENOSYS;
    return -1;
}
int libc_posix_madvise(void* addr, uint64_t len, int advice) {
#if defined(__ANDROID__)
    return madvise(addr, len, advice);
#elif defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return posix_madvise(addr, len, advice);
#else
    (void)addr; (void)len; (void)advice;
    errno = ENOSYS;
    return -1;
#endif
}
void* libc_memmem(const void* haystack, uint64_t haystacklen, const void* needle, uint64_t needlelen) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__APPLE__) || defined(__CYGWIN__)
    return memmem(haystack, haystacklen, needle, needlelen);
#else
    (void)haystack; (void)haystacklen; (void)needle; (void)needlelen;
    return NULL;
#endif
}
int libc_sysctl(int* name, unsigned int namelen, void* oldp, void* oldlenp, void* newp, uint64_t newlen) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return sysctl(name, namelen, oldp, (uint64_t*)oldlenp, newp, newlen);
#else
    (void)name; (void)namelen; (void)oldp; (void)oldlenp; (void)newp; (void)newlen;
    errno = ENOSYS;
    return -1;
#endif
}

/* String-param function wrappers */
int libc_shm_open(const char* name, int oflag, int mode) {
#if (!defined(__ANDROID__) && defined(__linux__)) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return shm_open(name, oflag, (uint32_t)mode);
#else
    (void)name; (void)oflag; (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_shm_unlink(const char* name) {
#if (!defined(__ANDROID__) && defined(__linux__)) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return shm_unlink(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sem_unlink(const char* name) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__HAIKU__)
    return sem_unlink(name);
#else
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_mknodat(int dirfd, const char* pathname, int mode, unsigned long long dev) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__DragonFly__)
    return mknodat(dirfd, pathname, (uint32_t)mode, (dev_t)dev);
#else
    (void)dirfd; (void)pathname; (void)mode; (void)dev;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_mkfifoat_int(int dirfd, const char* pathname, int mode) {
#if (!defined(__ANDROID__) && defined(__linux__)) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__HAIKU__)
    return mkfifoat(dirfd, pathname, (uint32_t)mode);
#else
    (void)dirfd; (void)pathname; (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}
char* libc_dirname(const char* path) {
    /* dirname may modify its argument; copy to a mutable buffer */
    static char buf[4096];
    if (path == NULL) return NULL;
    strncpy(buf, path, sizeof(buf) - 1);
    buf[sizeof(buf) - 1] = '\0';
    return dirname(buf);
}
char* libc_basename(const char* path) {
    /* basename may modify its argument; copy to a mutable buffer */
    static char buf[4096];
    if (path == NULL) return NULL;
    strncpy(buf, path, sizeof(buf) - 1);
    buf[sizeof(buf) - 1] = '\0';
    return basename(buf);
}
char* libc_strerror_r(int errnum, char* buf, uint64_t buflen) {
#if defined(__linux__) && defined(__GNU_LIBRARY__)
    /* GNU strerror_r returns char* */
    return strerror_r(errnum, buf, buflen);
#elif defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    /* XSI strerror_r returns int; convert to char* on success */
    int rc = strerror_r(errnum, buf, buflen);
    (void)rc;
    return buf;
#else
    (void)errnum; (void)buflen;
    if (buf) buf[0] = '\0';
    return buf;
#endif
}
uint64_t libc_strftime(char* s, uint64_t max, const char* format, void* tm) {
    return strftime(s, max, format, (const struct tm*)tm);
}
void* libc_popen(const char* command, const char* mode) {
    return popen(command, mode);
}
void* libc_newlocale(int mask, const char* locale, void* base) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return newlocale(mask, locale, (locale_t)base);
#else
    (void)mask; (void)locale; (void)base;
    errno = ENOSYS;
    return NULL;
#endif
}
int libc_pthread_getname_np(void* thread, char* name, uint64_t len) {
#if (!defined(__ANDROID__) && defined(__linux__)) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return pthread_getname_np((pthread_t)thread, name, (size_t)len);
#else
    (void)thread; (void)name; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_pthread_setname_np(void* thread, const char* name) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__HAIKU__)
    return pthread_setname_np((pthread_t)thread, name);
#elif defined(__APPLE__)
    /* macOS pthread_setname_np takes only the name, not the thread */
    (void)thread;
    return pthread_setname_np(name);
#else
    (void)thread; (void)name;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_getgrouplist(const char* user, int group, void* groups, int* ngroups) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__HAIKU__)
    return getgrouplist(user, (uint32_t)group, (uint32_t*)groups, ngroups);
#else
    (void)user; (void)group; (void)groups; (void)ngroups;
    errno = ENOSYS;
    return -1;
#endif
}

/* Simple integer-param wrappers */
int libc_getpriority(int which, int who) { return getpriority(which, who); }
int libc_setpriority(int which, int who, int prio) { return setpriority(which, who, prio); }
int libc_sem_destroy(void* sem) { return sem_destroy((sem_t*)sem); }
int libc_sem_init(void* sem, int pshared, unsigned int value) { return sem_init((sem_t*)sem, pshared, value); }
int libc_sem_close(void* sem) { return sem_close((sem_t*)sem); }
int libc_sem_getvalue(void* sem, int* sval) { return sem_getvalue((sem_t*)sem, sval); }
/* sched_getscheduler is Linux-only; provide stub for other platforms. */
int libc_sched_getscheduler(int32_t pid) {
#ifdef __linux__
    return sched_getscheduler(pid);
#else
    (void)pid;
    errno = ENOSYS;
    return -1;
#endif
}
#ifndef _WIN32
int libc_sched_get_priority_max(int policy) { return sched_get_priority_max(policy); }
int libc_sched_get_priority_min(int policy) { return sched_get_priority_min(policy); }
#else
int libc_sched_get_priority_max(int policy) { (void)policy; errno = ENOSYS; return -1; }
int libc_sched_get_priority_min(int policy) { (void)policy; errno = ENOSYS; return -1; }
#endif

int libc_pthread_cancel(void* thread) {
#if defined(__ANDROID__) || defined(_WIN32)
    (void)thread;
    errno = ENOSYS;
    return 38;
#else
    return pthread_cancel((pthread_t)thread);
#endif
}

int libc_pthread_kill(void* thread, int sig) {
#ifndef _WIN32
    return pthread_kill((pthread_t)thread, sig);
#else
    (void)thread; (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_pthread_setschedprio(void* thread, int priority) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_setschedprio((pthread_t)thread, priority);
#else
    (void)thread; (void)priority;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_barrier_init(void* barrier, void* attr, unsigned int count) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_barrier_init((pthread_barrier_t*)barrier, (const pthread_barrierattr_t*)attr, count);
#else
    (void)barrier; (void)attr; (void)count;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_barrier_destroy(void* barrier) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_barrier_destroy((pthread_barrier_t*)barrier);
#else
    (void)barrier;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_barrier_wait(void* barrier) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_barrier_wait((pthread_barrier_t*)barrier);
#else
    (void)barrier;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_barrierattr_init(void* attr) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_barrierattr_init((pthread_barrierattr_t*)attr);
#else
    (void)attr;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_barrierattr_destroy(void* attr) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_barrierattr_destroy((pthread_barrierattr_t*)attr);
#else
    (void)attr;
    errno = ENOSYS;
    return 38;
#endif
}

int libc_pthread_mutex_consistent(void* mutex) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_mutex_consistent((pthread_mutex_t*)mutex);
#else
    (void)mutex;
    errno = ENOSYS;
    return 38;
#endif
}
int libc_pthread_spin_init(void* lock, int pshared) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_spin_init((pthread_spinlock_t*)lock, pshared);
#else
    (void)lock; (void)pshared;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_pthread_spin_destroy(void* lock) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_spin_destroy((pthread_spinlock_t*)lock);
#else
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_pthread_spin_lock(void* lock) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_spin_lock((pthread_spinlock_t*)lock);
#else
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_pthread_spin_trylock(void* lock) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_spin_trylock((pthread_spinlock_t*)lock);
#else
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}

int libc_pthread_spin_unlock(void* lock) {
#if defined(__linux__) && !defined(__ANDROID__)
    return pthread_spin_unlock((pthread_spinlock_t*)lock);
#else
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_posix_fallocate(int fd, int64_t offset, int64_t len) {
#ifdef __linux__
    return posix_fallocate(fd, offset, len);
#else
    (void)fd; (void)offset; (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

void* libc_memalign(uint64_t alignment, uint64_t size) {
#ifdef __linux__
    return memalign((size_t)alignment, (size_t)size);
#else
    (void)alignment; (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}
#if !defined(__ANDROID__)
int64_t libc_telldir(void* dirp) { return (long)telldir((DIR*)dirp); }
void* libc_duplocale(void* base) { return (void*)duplocale((locale_t)base); }
char* libc_nl_langinfo(int item) { return nl_langinfo(item); }
void* libc_getpwent(void) { return (void*)getpwent(); }
void* libc_getgrent(void) { return (void*)getgrent(); }
void libc_endpwent(void) { endpwent(); }
void libc_endgrent(void) { endgrent(); }
void libc_setpwent(void) { setpwent(); }
void libc_setgrent(void) { setgrent(); }
#else
int64_t libc_telldir(void* dirp) { (void)dirp; errno = ENOSYS; return -1; }
void* libc_duplocale(void* base) { return base; }
char* libc_nl_langinfo(int item) { (void)item; return ""; }
void* libc_getpwent(void) { return NULL; }
void* libc_getgrent(void) { return NULL; }
void libc_endpwent(void) {}
void libc_endgrent(void) {}
void libc_setpwent(void) {}
void libc_setgrent(void) {}
#endif
void* libc_getgrgid(int gid) { return (void*)getgrgid((uint32_t)gid); }
void* libc_getpwuid(int uid) { return (void*)getpwuid((uint32_t)uid); }
void* libc_getpwnam(const char* name) { return (void*)getpwnam(name); }
void* libc_getgrnam(const char* name) { return (void*)getgrnam(name); }
int libc_pthread_setspecific(uint64_t key, const void* value) { return pthread_setspecific((pthread_key_t)key, value); }
void* libc_pthread_getspecific(uint64_t key) { return (void*)pthread_getspecific((pthread_key_t)key); }

#endif /* _WIN32 */

#ifdef _WIN32
int64_t libc_readlink(const char* path, void* buf, uint64_t bufsize) {
    (void)path; (void)buf; (void)bufsize;
    errno = ENOSYS;
    return -1;
}

int libc_symlink(const char* path1, const char* path2) {
    (void)path1; (void)path2;
    errno = ENOSYS;
    return -1;
}

int libc_gethostname(void* name, uint64_t len) {
    if (gethostname((char*)name, (int)len) == 0) {
        return 0;
    }
    DWORD size = (DWORD)len;
    if (GetComputerNameA((char*)name, &size)) {
        return 0;
    }
    return -1;
}

int libc_clock_gettime(int32_t clk_id, void* tp) {
    (void)clk_id;
    if (!tp) { errno = EINVAL; return -1; }
    FILETIME ft;
    GetSystemTimeAsFileTime(&ft);
    ULARGE_INTEGER uli;
    uli.LowPart = ft.dwLowDateTime;
    uli.HighPart = ft.dwHighDateTime;
    uint64_t intervals = uli.QuadPart - 116444736000000000ULL;
    struct { int64_t tv_sec; int64_t tv_nsec; } *ts = (void*)tp;
    ts->tv_sec = (int64_t)(intervals / 10000000ULL);
    ts->tv_nsec = (int64_t)((intervals % 10000000ULL) * 100);
    return 0;
}

void* libc_pthread_getspecific(uint64_t key) {
    return TlsGetValue((DWORD)key);
}

int libc_pthread_setspecific(uint64_t key, const void* value) {
    return TlsSetValue((DWORD)key, (LPVOID)value) ? 0 : -1;
}

int64_t libc_strtol(const char* s, void* endp, int base) {
    return (int64_t)strtol(s, (char**)endp, base);
}

uint64_t libc_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, (size_t)n);
}
#endif



int libc_sched_yield(void) {
#ifdef _WIN32
    SwitchToThread();
    return 0;
#else
    return sched_yield();
#endif
}
int64_t libc_write(int fd, const void* buf, uint64_t count) {
#ifdef _WIN32
    if (count > UINT_MAX) { errno = EINVAL; return -1; }
    return _write(fd, buf, (unsigned int)count);
#else
    return write(fd, buf, (size_t)count);
#endif
}
int libc_putenv(const char* string) {
    if (!string) return -1;
#ifdef _WIN32
    return _putenv(_strdup(string));
#else
    return putenv(strdup(string));
#endif
}
int libc_poll_single(int fd, short events, short* revents, int timeout) {
#ifndef _WIN32
    struct pollfd pfd;
    pfd.fd = fd;
    pfd.events = events;
    pfd.revents = 0;
    int res = poll(&pfd, 1, timeout);
    if (revents) *revents = pfd.revents;
    return res;
#else
    (void)fd; (void)events; (void)revents; (void)timeout;
    errno = ENOSYS; return -1;
#endif
}
int libc_fnmatch(const char* pattern, const char* name, int flags) {
#ifndef _WIN32
    return fnmatch(pattern, name, flags);
#else
    (void)pattern; (void)name; (void)flags;
    errno = ENOSYS; return -1;
#endif
}
char* libc_strndup(const char* s, uint64_t n) {
#ifdef _WIN32
    size_t len = strnlen(s, (size_t)n);
    char* result = malloc(len + 1);
    if (result != NULL) { memcpy(result, s, len); result[len] = '\0'; }
    return result;
#else
    return strndup(s, (size_t)n);
#endif
}
int64_t libc_strtoll(const char* s, void* endp, int base) { return libc_legacy_strtoll(s, (char**)endp, base); }
uint64_t libc_strtoul(const char* s, void* endp, int base) { return libc_legacy_strtoul(s, (char**)endp, base); }
uint64_t libc_strtoull(const char* s, void* endp, int base) { return libc_legacy_strtoull(s, (char**)endp, base); }
int libc_mknod(const char* pathname, uint32_t mode, uint64_t dev) {
#ifndef _WIN32
    return mknod(pathname, (mode_t)mode, (dev_t)dev);
#else
    (void)pathname; (void)mode; (void)dev; errno = ENOSYS; return -1;
#endif
}
const char* libc_strsignal(int sig) {
#ifndef _WIN32
    return strsignal(sig);
#else
    (void)sig; errno = ENOSYS; return NULL;
#endif
}
int libc_pipe(int* fds) {
#ifndef _WIN32
    return pipe(fds);
#else
    (void)fds; errno = ENOSYS; return -1;
#endif
}
int libc_poll(void* fds, uint32_t nfds, int timeout) {
#ifndef _WIN32
    return poll((struct pollfd*)fds, nfds, timeout);
#else
    (void)fds; (void)nfds; (void)timeout; errno = ENOSYS; return -1;
#endif
}
const char* libc_hstrerror(int errcode) {
#ifndef _WIN32
    return hstrerror(errcode);
#else
    (void)errcode; errno = ENOSYS; return NULL;
#endif
}

uint64_t libc_mach_absolute_time(void) {
#ifdef __APPLE__
    return mach_absolute_time();
#else
    errno = ENOSYS; return 0;
#endif
}
int libc_pthread_setname_np_apple(const char* name) {
#ifdef __APPLE__
    return pthread_setname_np(name);
#else
    (void)name; return ENOSYS;
#endif
}
int libc_pthread_main_np(void) {
#ifdef __APPLE__
    return pthread_main_np();
#else
    errno = ENOSYS; return -1;
#endif
}
int libc_login_tty(int fd) {
#ifdef __APPLE__
    return login_tty(fd);
#else
    (void)fd; errno = ENOSYS; return -1;
#endif
}
int libc_backtrace(void** buf, int sz) {
#ifdef __APPLE__
    return backtrace(buf, sz);
#else
    (void)buf; (void)sz; errno = ENOSYS; return -1;
#endif
}
void* libc_brk(const void* addr) {
#if defined(__APPLE__) && TARGET_OS_OSX
    return brk(addr);
#else
    (void)addr; errno = ENOSYS; return (void*)-1;
#endif
}
void* libc_shmat(int shmid, const void* shmaddr, int shmflg) {
#if defined(__APPLE__) && TARGET_OS_OSX
    return shmat(shmid, (void*)shmaddr, shmflg);
#else
    (void)shmid; (void)shmaddr; (void)shmflg; errno = ENOSYS; return (void*)-1;
#endif
}
