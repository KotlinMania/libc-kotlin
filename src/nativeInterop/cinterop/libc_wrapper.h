#ifndef LIBC_WRAPPER_H
#define LIBC_WRAPPER_H

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

/* CMSG macros — exposed as functions */
void* libc_cmsg_data(void* cmsg);
void* libc_cmsg_firsthdr(void* mhdr);
void* libc_cmsg_nxthdr(void* mhdr, void* cmsg);
size_t libc_cmsg_space(size_t length);
size_t libc_cmsg_len(size_t length);
size_t libc_cmsg_align(size_t len);

/* stdlib.h wrappers */
void* libc_calloc(size_t nobj, size_t size);
void* libc_malloc(size_t size);
void* libc_realloc(void* p, size_t size);
void libc_free(void* p);
void* libc_aligned_alloc(size_t alignment, size_t size);
int libc_atoi(const char* s);
long libc_atol(const char* s);
long long libc_atoll(const char* s);
char* libc_getenv(const char* s);
char* libc_strerror(int n);
char* libc_strdup(const char* s);
int libc_abs(int n);
int libc_rand(void);
void libc_srand(unsigned int seed);
void libc_abort(void);
void libc_exit(int status);
int libc_system(const char* s);

/* string.h wrappers */
size_t libc_strlen(const char* s);
size_t libc_strnlen(const char* s, size_t n);
size_t libc_strspn(const char* s, const char* accept);
size_t libc_strcspn(const char* s, const char* reject);
char* libc_strchr(const char* s, int c);
char* libc_strrchr(const char* s, int c);
char* libc_strpbrk(const char* s, const char* accept);
char* libc_strstr(const char* s, const char* find);
char* libc_strcpy(char* dst, const char* src);
char* libc_strncpy(char* dst, const char* src, size_t n);
char* libc_strcat(char* s, const char* ct);
char* libc_strncat(char* s, const char* ct, size_t n);
int libc_strcmp(const char* s1, const char* s2);
int libc_strncmp(const char* s1, const char* s2, size_t n);
int libc_strcasecmp(const char* s1, const char* s2);
int libc_strncasecmp(const char* s1, const char* s2, size_t n);
void* libc_memchr(const void* s, int c, size_t n);
int libc_memcmp(const void* s1, const void* s2, size_t n);
void* libc_memcpy(void* dest, const void* src, size_t n);
void* libc_memccpy(void* dest, const void* src, int c, size_t n);
void* libc_memmove(void* dest, const void* src, size_t n);
void* libc_memset(void* s, int c, size_t n);

/* ctype.h wrappers */
int libc_isalnum(int c);
int libc_isalpha(int c);
int libc_iscntrl(int c);
int libc_isdigit(int c);
int libc_isgraph(int c);
int libc_islower(int c);
int libc_isprint(int c);
int libc_ispunct(int c);
int libc_isspace(int c);
int libc_isupper(int c);
int libc_isxdigit(int c);
int libc_isblank(int c);
int libc_tolower(int c);
int libc_toupper(int c);

/* stdio.h wrappers */
void* libc_fopen(const char* filename, const char* mode);
int libc_fclose(void* stream);
int libc_fflush(void* stream);
void* libc_freopen(const char* filename, const char* mode, void* stream);
void* libc_tmpfile(void);
int libc_fgetc(void* stream);
int libc_fputc(int c, void* stream);
int libc_fputs(const char* s, void* stream);
int libc_ungetc(int c, void* stream);
int libc_fseek(void* stream, long offset, int whence);
long libc_ftell(void* stream);
void libc_rewind(void* stream);
int libc_feof(void* stream);
int libc_ferror(void* stream);
void libc_clearerr(void* stream);
void* libc_fdopen(int fd, const char* mode);
int libc_remove(const char* filename);
int libc_rename(const char* oldname, const char* newname);
int libc_getchar(void);
int libc_putchar(int c);
int libc_puts(const char* s);
void libc_perror(const char* s);

/* unistd.h wrappers */
int libc_close(int fd);
int libc_dup(int fd);
int libc_dup2(int fd1, int fd2);
int libc_fsync(int fd);
int libc_fchdir(int fd);
int libc_chdir(const char* path);
int libc_rmdir(const char* path);
int libc_mkdir(const char* path, int mode);
int libc_unlink(const char* path);
int libc_access(const char* path, int mode);
int libc_isatty(int fd);
int libc_getpid(void);
int libc_getppid(void);
int libc_pause(void);
int libc_sleep(unsigned int seconds);
int libc_getuid(void);
int libc_geteuid(void);
int libc_getgid(void);
int libc_getegid(void);
int libc_setuid(int uid);
int libc_setgid(int gid);
int libc_seteuid(int uid);
int libc_setegid(int gid);

/* socket.h wrappers */
int libc_socket(int domain, int type, int protocol);
int libc_listen(int sockfd, int backlog);
int libc_shutdown(int sockfd, int how);
int libc_bind(int sockfd, void* addr, int addrlen);
int libc_connect(int sockfd, void* addr, int addrlen);

#ifdef __cplusplus
}
#endif


/* Additional wrappers */
int libc_bcmp(const void* s1, const void* s2, size_t n);
int libc_dlclose(void* handle);
char* libc_dlerror(void);
char* libc_gai_strerror(int errcode);
int libc_getdtablesize(void);
char* libc_getlogin(void);
int libc_getpagesize(void);
int libc_madvise(void* addr, size_t len, int advice);
int libc_mincore(void* addr, size_t len, unsigned char* vec);
int libc_mlock(const void* addr, size_t len);
int libc_mlockall(int flags);
int libc_mprotect(void* addr, size_t len, int prot);
int libc_msync(void* addr, size_t len, int flags);
int libc_munlock(const void* addr, size_t len);
int libc_munlockall(void);
int libc_munmap(void* addr, size_t len);
int libc_nice(int inc);
int libc_raise(int sig);
long libc_read(int fd, void* buf, size_t count);
char* libc_setlocale(int category, const char* locale);
int libc_setlogmask(int mask);
int libc_tcflush(int fd, int queue_selector);
int libc_tcsendbreak(int fd, int duration);
char* libc_ttyname(int fd);
int libc_usleep(unsigned int useconds);
long libc_write(int fd, const void* buf, size_t count);

#endif /* LIBC_WRAPPER_H */
