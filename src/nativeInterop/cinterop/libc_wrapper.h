#ifndef LIBC_WRAPPER_H
#define LIBC_WRAPPER_H

#include <stdint.h>
#include <stddef.h>
#include <sys/types.h>
#include <time.h>
#include <sys/stat.h>
#include <sys/socket.h>
#include <signal.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <dirent.h>
#include <pthread.h>
#include <semaphore.h>
#include <poll.h>
#include <sched.h>
#include <netdb.h>
#include <fcntl.h>
#include <grp.h>
#include <pwd.h>
#include <dlfcn.h>
#include <locale.h>
#include <wchar.h>
#include <wctype.h>
#include <termios.h>
#include <syslog.h>
#include <sys/file.h>
#include <sys/mman.h>
#include <sys/wait.h>
#include <sys/resource.h>
#include <sys/times.h>
#include <sys/uio.h>
#include <sys/select.h>
#include <sys/ioctl.h>
#include <sys/utsname.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/msg.h>
#include <sys/sem.h>
#include <sys/xattr.h>
#include <net/if.h>
#include <utime.h>
#include <glob.h>
#include <ctype.h>
#include <mach/mach_time.h>
#include <mach-o/dyld.h>


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


/* Auto-generated wrappers */
int libc_setvbuf(void* stream, const char* buffer, int mode, size_t size);
size_t libc_fwrite(void* ptr, size_t size, size_t nobj, void* stream);
int libc_fgetpos(void* stream, void* ptr);
int libc_fsetpos(void* stream, void* ptr);
size_t libc_strxfrm(const char* s, const char* ct, size_t n);
off_t libc_ftello(void* stream);
pid_t libc_setpgid(pid_t pid, pid_t pgid);
ssize_t libc_readlink(const char* path, const char* buf, size_t bufsize);
long libc_strtol(const char* s, void* endp, int base);
size_t libc_confstr(int name, const char* buf, size_t len);
long libc_fpathconf(int filedes, int name);
off_t libc_lseek(int fd, off_t offset, int whence);
long libc_pathconf(const char* path, int name);
long libc_sysconf(int attr);
int libc_strcoll(const char* cs, const char* ct);
int libc_linkat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath, int flags);
int libc_unlinkat(int dirfd, const char* pathname, int flags);
int libc_fileno(void* stream);
int libc_creat(const char* path, mode_t mode);
int libc_fchown(int fd, uid_t owner, gid_t group);
int libc_chown(const char* path, uid_t uid, gid_t gid);
int libc_truncate(const char* path, off_t length);
int libc_gethostname(const char* name, size_t len);
int libc_mkfifo(const char* path, mode_t mode);
int libc_fseeko(void* stream, off_t offset, int whence);
int libc_mkstemp(const char* template);
int libc_symlinkat(const char* target, int newdirfd, const char* linkpath);
int libc_fchmodat(int dirfd, const char* pathname, mode_t mode, int flags);
int libc_ftruncate(int fd, off_t length);
int libc_setenv(const char* envVarName, const char* envVarValue, int overwrite);
int libc_unsetenv(const char* envVarName);
int libc_link(const char* src, const char* dst);
int libc_symlink(const char* path1, const char* path2);
int libc_chmod(const char* path, mode_t mode);
int libc_fchmod(int attr1, mode_t attr2);
int libc_closedir(void* ptr);
int libc_kill(pid_t pid, int signo);
long libc_random(void);
int libc_isascii(int c);
long long libc_llabs(long long a);
long libc_labs(long i);
int libc_mkdirat(int dirfd, const char* pathname, mode_t mode);
ssize_t libc_readlinkat(int dirfd, const char* pathname, const char* buf, size_t bufsiz);
int libc_renameat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath);
int libc_lchown(const char* path, uid_t uid, gid_t gid);
int libc_execv(const char* prog, void* argv);
int libc_execve(const char* prog, void* argv, void* envp);
int libc_execvp(const char* c, void* argv);
pid_t libc_fork(void);
pid_t libc_getpgid(pid_t pid);
pid_t libc_getpgrp(void);
pid_t libc_setsid(void);
pid_t libc_tcgetpgrp(int fd);
int libc_tcsetpgrp(int fd, pid_t pgrp);
ssize_t libc_pread(int fd, void* buf, size_t count, off_t offset);
ssize_t libc_pwrite(int fd, void* buf, size_t count, off_t offset);
int libc_flock(int fd, int operation);
pid_t libc_getsid(pid_t pid);
int libc_tcdrain(int fd);
int libc_tcflow(int fd, int action);
pid_t libc_tcgetsid(int fd);
int libc_grantpt(int fd);
int libc_unlockpt(int fd);
int libc_fdatasync(int fd);
int libc_dirfd(void* dirp);
int libc_setreuid(uid_t ruid, uid_t euid);
int libc_setregid(gid_t rgid, gid_t egid);
int libc_acct(const char* filename);
int libc_shmdt(void* shmaddr);
int libc_mkostemp(const char* template, int flags);
int libc_mkostemps(const char* template, int suffixlen, int flags);
int libc_reboot(int howTo);
int libc_mkfifoat(int dirfd, const char* pathname, mode_t mode);
int libc_mkstemps(const char* template, int suffixlen);
int libc_getdomainname(const char* name, size_t len);
int libc_setdomainname(const char* name, size_t len);
int libc_sethostname(const char* name, size_t len);
int libc_initgroups(const char* user, gid_t group);
int libc_daemon(int nochdir, int noclose);
int libc_faccessat(int dirfd, const char* pathname, int mode, int flags);
int libc_getc(void* arg1);
int libc_putc(int arg1, void* arg2);
int libc_ftrylockfile(void* arg1);
int libc_getw(void* arg1);
int libc_putw(int arg1, void* arg2);
int libc_mblen(const char* arg1, size_t arg2);
long libc_lrand48(void);
long libc_mrand48(void);
long libc_a64l(const char* arg1);
int libc_radixsort(void* arg1, int arg2, void* arg3, unsigned int arg4);
int libc_sradixsort(void* arg1, int arg2, void* arg3, unsigned int arg4);
size_t libc_strlcat(const char* arg1, const char* arg2, size_t arg3);
size_t libc_strlcpy(const char* arg1, const char* arg2, size_t arg3);
int libc_ffs(int arg1);
int libc_getsubopt(void* arg1, void* arg2, void* arg3);
int libc_killpg(pid_t pgrp, int sig);
int libc_chroot(const char* name);
int libc_lockf(int fd, int cmd, off_t len);
pid_t libc_vfork(void);
long libc_gethostid(void);
int libc_setlogin(const char* name);
int libc_issetugid(void);
int libc_chflags(const char* path, unsigned int flags);
int libc_fchflags(int fd, unsigned int flags);
long long libc_strtonum(const char* numstr, long long minval, long long maxval, void* errstrp);
int libc_getattrlistat(int fd, const char* path, void* attrList, void* attrBuf, size_t attrBufSize, unsigned long options);
int libc_getattrlistbulk(int dirfd, void* attrList, void* attrBuf, size_t attrBufSize, size_t options);
int libc_execvP(const char* file, const char* searchPath, void* argv);
int libc_exchangedata(const char* path1, const char* path2, unsigned long options);
int libc_lchflags(const char* path, unsigned long flags);
int libc_ffsl(long value);
int libc_ffsll(long long value);
int libc_fls(int value);
int libc_flsl(long value);
int libc_flsll(long long value);

#endif /* LIBC_WRAPPER_H */
