#include "libc_wrapper.h"
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/stat.h>
#include <sys/socket.h>

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
size_t libc_cmsg_space(size_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_SPACE(length);
#else
    return CMSG_SPACE(length);
#endif
}
size_t libc_cmsg_len(size_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_LEN(length);
#else
    return CMSG_LEN(length);
#endif
}
size_t libc_cmsg_align(size_t len) {
    return (len + sizeof(size_t) - 1) & ~(sizeof(size_t) - 1);
}

/* stdlib.h */
void* libc_calloc(size_t nobj, size_t size) { return calloc(nobj, size); }
void* libc_malloc(size_t size) { return malloc(size); }
void* libc_realloc(void* p, size_t size) { return realloc(p, size); }
void libc_free(void* p) { free(p); }
void* libc_aligned_alloc(size_t alignment, size_t size) { return aligned_alloc(alignment, size); }
int libc_atoi(const char* s) { return atoi(s); }
long libc_atol(const char* s) { return atol(s); }
long long libc_atoll(const char* s) { return atoll(s); }
char* libc_getenv(const char* s) { return getenv(s); }
char* libc_strerror(int n) { return strerror(n); }
char* libc_strdup(const char* s) { return strdup(s); }
int libc_abs(int n) { return abs(n); }
int libc_rand(void) { return rand(); }
void libc_srand(unsigned int seed) { srand(seed); }
void libc_abort(void) { abort(); }
void libc_exit(int status) { exit(status); }
int libc_system(const char* s) { return system(s); }

/* string.h */
size_t libc_strlen(const char* s) { return strlen(s); }
size_t libc_strnlen(const char* s, size_t n) { return strnlen(s, n); }
size_t libc_strspn(const char* s, const char* accept) { return strspn(s, accept); }
size_t libc_strcspn(const char* s, const char* reject) { return strcspn(s, reject); }
char* libc_strchr(const char* s, int c) { return strchr(s, c); }
char* libc_strrchr(const char* s, int c) { return strrchr(s, c); }
char* libc_strpbrk(const char* s, const char* accept) { return strpbrk(s, accept); }
char* libc_strstr(const char* s, const char* find) { return strstr(s, find); }
char* libc_strcpy(char* dst, const char* src) { return strcpy(dst, src); }
char* libc_strncpy(char* dst, const char* src, size_t n) { return strncpy(dst, src, n); }
char* libc_strcat(char* s, const char* ct) { return strcat(s, ct); }
char* libc_strncat(char* s, const char* ct, size_t n) { return strncat(s, ct, n); }
int libc_strcmp(const char* s1, const char* s2) { return strcmp(s1, s2); }
int libc_strncmp(const char* s1, const char* s2, size_t n) { return strncmp(s1, s2, n); }
int libc_strcasecmp(const char* s1, const char* s2) { return strcasecmp(s1, s2); }
int libc_strncasecmp(const char* s1, const char* s2, size_t n) { return strncasecmp(s1, s2, n); }
void* libc_memchr(const void* s, int c, size_t n) { return memchr(s, c, n); }
int libc_memcmp(const void* s1, const void* s2, size_t n) { return memcmp(s1, s2, n); }
void* libc_memcpy(void* dest, const void* src, size_t n) { return memcpy(dest, src, n); }
void* libc_memccpy(void* dest, const void* src, int c, size_t n) { return memccpy(dest, src, c, n); }
void* libc_memmove(void* dest, const void* src, size_t n) { return memmove(dest, src, n); }
void* libc_memset(void* s, int c, size_t n) { return memset(s, c, n); }

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
int libc_fseek(void* stream, long offset, int whence) { return fseek((FILE*)stream, offset, whence); }
long libc_ftell(void* stream) { return ftell((FILE*)stream); }
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

/* unistd.h */
int libc_close(int fd) { return close(fd); }
int libc_dup(int fd) { return dup(fd); }
int libc_dup2(int fd1, int fd2) { return dup2(fd1, fd2); }
int libc_fsync(int fd) { return fsync(fd); }
int libc_fchdir(int fd) { return fchdir(fd); }
int libc_chdir(const char* path) { return chdir(path); }
int libc_rmdir(const char* path) { return rmdir(path); }
int libc_mkdir(const char* path, int mode) { return mkdir(path, mode); }
int libc_unlink(const char* path) { return unlink(path); }
int libc_access(const char* path, int mode) { return access(path, mode); }
int libc_isatty(int fd) { return isatty(fd); }
int libc_getpid(void) { return getpid(); }
int libc_getppid(void) { return getppid(); }
int libc_pause(void) { return pause(); }
int libc_sleep(unsigned int seconds) { return sleep(seconds); }
int libc_getuid(void) { return getuid(); }
int libc_geteuid(void) { return geteuid(); }
int libc_getgid(void) { return getgid(); }
int libc_getegid(void) { return getegid(); }
int libc_setuid(int uid) { return setuid(uid); }
int libc_setgid(int gid) { return setgid(gid); }
int libc_seteuid(int uid) { return seteuid(uid); }
int libc_setegid(int gid) { return setegid(gid); }

/* socket.h */
int libc_socket(int domain, int type, int protocol) { return socket(domain, type, protocol); }
int libc_listen(int sockfd, int backlog) { return listen(sockfd, backlog); }
int libc_shutdown(int sockfd, int how) { return shutdown(sockfd, how); }
int libc_bind(int sockfd, void* addr, int addrlen) { return bind(sockfd, (struct sockaddr*)addr, addrlen); }
int libc_connect(int sockfd, void* addr, int addrlen) { return connect(sockfd, (struct sockaddr*)addr, addrlen); }

/* Additional wrappers */
#include <dlfcn.h>
#include <netdb.h>
#include <locale.h>
#include <sys/mman.h>
#include <termios.h>
#include <signal.h>
#include <sys/syslog.h>
#include <sys/time.h>

int libc_bcmp(const void* s1, const void* s2, size_t n) { return bcmp(s1, s2, n); }
int libc_dlclose(void* handle) { return dlclose(handle); }
char* libc_dlerror(void) { return dlerror(); }
char* libc_gai_strerror(int errcode) { return gai_strerror(errcode); }
int libc_getdtablesize(void) { return getdtablesize(); }
char* libc_getlogin(void) { return getlogin(); }
int libc_getpagesize(void) { return getpagesize(); }
int libc_madvise(void* addr, size_t len, int advice) { return madvise(addr, len, advice); }
int libc_mincore(void* addr, size_t len, unsigned char* vec) { return mincore(addr, len, vec); }
int libc_mlock(const void* addr, size_t len) { return mlock(addr, len); }
int libc_mlockall(int flags) { return mlockall(flags); }
int libc_mprotect(void* addr, size_t len, int prot) { return mprotect(addr, len, prot); }
int libc_msync(void* addr, size_t len, int flags) { return msync(addr, len, flags); }
int libc_munlock(const void* addr, size_t len) { return munlock(addr, len); }
int libc_munlockall(void) { return munlockall(); }
int libc_munmap(void* addr, size_t len) { return munmap(addr, len); }
int libc_nice(int inc) { return nice(inc); }
int libc_raise(int sig) { return raise(sig); }
long libc_read(int fd, void* buf, size_t count) { return (long)read(fd, buf, count); }
char* libc_setlocale(int category, const char* locale) { return setlocale(category, locale); }
int libc_setlogmask(int mask) { return setlogmask(mask); }
int libc_tcflush(int fd, int queue_selector) { return tcflush(fd, queue_selector); }
int libc_tcsendbreak(int fd, int duration) { return tcsendbreak(fd, duration); }
char* libc_ttyname(int fd) { return ttyname(fd); }
int libc_usleep(unsigned int useconds) { return usleep(useconds); }
long libc_write(int fd, const void* buf, size_t count) { return (long)write(fd, buf, count); }
