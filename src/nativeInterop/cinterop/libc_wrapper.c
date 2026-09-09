#include "libc_wrapper.h"
#include <errno.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/stat.h>
#include <sys/socket.h>

/* Feature test macros for POSIX extensions (pthread_condattr_setclock, sched_*, etc.) */
#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif

/* getentropy: <sys/random.h> on Linux, <unistd.h> on macOS/BSD */
#if defined(__linux__)
#include <sys/random.h>
#endif

/* sysctl: <sys/sysctl.h> on BSD/macOS */
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
#include <sys/sysctl.h>
#endif

/* dirname/basename: <libgen.h> */
#include <libgen.h>

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

/* Auto-generated wrappers */
int libc_setvbuf(void* stream, const char* buffer, int mode, size_t size) { return setvbuf(stream, buffer, mode, size); }
size_t libc_fwrite(void* ptr, size_t size, size_t nobj, void* stream) { return fwrite(ptr, size, nobj, stream); }
int libc_fgetpos(void* stream, void* ptr) { return fgetpos(stream, ptr); }
int libc_fsetpos(void* stream, void* ptr) { return fsetpos(stream, ptr); }
size_t libc_strxfrm(const char* s, const char* ct, size_t n) { return strxfrm(s, ct, n); }
off_t libc_ftello(void* stream) { return ftello(stream); }
pid_t libc_setpgid(pid_t pid, pid_t pgid) { return setpgid(pid, pgid); }
ssize_t libc_readlink(const char* path, const char* buf, size_t bufsize) { return readlink(path, buf, bufsize); }
long libc_strtol(const char* s, void* endp, int base) { return strtol(s, endp, base); }
size_t libc_confstr(int name, const char* buf, size_t len) { return confstr(name, buf, len); }
long libc_fpathconf(int filedes, int name) { return fpathconf(filedes, name); }
off_t libc_lseek(int fd, off_t offset, int whence) { return lseek(fd, offset, whence); }
long libc_pathconf(const char* path, int name) { return pathconf(path, name); }
long libc_sysconf(int attr) { return sysconf(attr); }
int libc_strcoll(const char* cs, const char* ct) { return strcoll(cs, ct); }
int libc_linkat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath, int flags) { return linkat(olddirfd, oldpath, newdirfd, newpath, flags); }
int libc_unlinkat(int dirfd, const char* pathname, int flags) { return unlinkat(dirfd, pathname, flags); }
int libc_fileno(void* stream) { return fileno(stream); }
int libc_creat(const char* path, mode_t mode) { return creat(path, mode); }
int libc_fchown(int fd, uid_t owner, gid_t group) { return fchown(fd, owner, group); }
int libc_chown(const char* path, uid_t uid, gid_t gid) { return chown(path, uid, gid); }
int libc_truncate(const char* path, off_t length) { return truncate(path, length); }
int libc_gethostname(const char* name, size_t len) { return gethostname(name, len); }
int libc_mkfifo(const char* path, mode_t mode) { return mkfifo(path, mode); }
int libc_fseeko(void* stream, off_t offset, int whence) { return fseeko(stream, offset, whence); }
int libc_mkstemp(const char* template) { return mkstemp(template); }
int libc_symlinkat(const char* target, int newdirfd, const char* linkpath) { return symlinkat(target, newdirfd, linkpath); }
int libc_fchmodat(int dirfd, const char* pathname, mode_t mode, int flags) { return fchmodat(dirfd, pathname, mode, flags); }
int libc_ftruncate(int fd, off_t length) { return ftruncate(fd, length); }
int libc_setenv(const char* envVarName, const char* envVarValue, int overwrite) { return setenv(envVarName, envVarValue, overwrite); }
int libc_unsetenv(const char* envVarName) { return unsetenv(envVarName); }
int libc_link(const char* src, const char* dst) { return link(src, dst); }
int libc_symlink(const char* path1, const char* path2) { return symlink(path1, path2); }
int libc_chmod(const char* path, mode_t mode) { return chmod(path, mode); }
int libc_fchmod(int attr1, mode_t attr2) { return fchmod(attr1, attr2); }
int libc_closedir(void* ptr) { return closedir(ptr); }
int libc_kill(pid_t pid, int signo) { return kill(pid, signo); }
long libc_random(void) { return random(); }
int libc_isascii(int c) { return isascii(c); }
long long libc_llabs(long long a) { return llabs(a); }
long libc_labs(long i) { return labs(i); }
int libc_mkdirat(int dirfd, const char* pathname, mode_t mode) { return mkdirat(dirfd, pathname, mode); }
ssize_t libc_readlinkat(int dirfd, const char* pathname, const char* buf, size_t bufsiz) { return readlinkat(dirfd, pathname, buf, bufsiz); }
int libc_renameat(int olddirfd, const char* oldpath, int newdirfd, const char* newpath) { return renameat(olddirfd, oldpath, newdirfd, newpath); }
int libc_lchown(const char* path, uid_t uid, gid_t gid) { return lchown(path, uid, gid); }
int libc_execv(const char* prog, void* argv) { return execv(prog, argv); }
int libc_execve(const char* prog, void* argv, void* envp) { return execve(prog, argv, envp); }
int libc_execvp(const char* c, void* argv) { return execvp(c, argv); }
pid_t libc_fork(void) { return fork(); }
pid_t libc_getpgid(pid_t pid) { return getpgid(pid); }
pid_t libc_getpgrp(void) { return getpgrp(); }
pid_t libc_setsid(void) { return setsid(); }
pid_t libc_tcgetpgrp(int fd) { return tcgetpgrp(fd); }
int libc_tcsetpgrp(int fd, pid_t pgrp) { return tcsetpgrp(fd, pgrp); }
ssize_t libc_pread(int fd, void* buf, size_t count, off_t offset) { return pread(fd, buf, count, offset); }
ssize_t libc_pwrite(int fd, void* buf, size_t count, off_t offset) { return pwrite(fd, buf, count, offset); }
int libc_flock(int fd, int operation) { return flock(fd, operation); }
pid_t libc_getsid(pid_t pid) { return getsid(pid); }
int libc_tcdrain(int fd) { return tcdrain(fd); }
int libc_tcflow(int fd, int action) { return tcflow(fd, action); }
pid_t libc_tcgetsid(int fd) { return tcgetsid(fd); }
int libc_grantpt(int fd) { return grantpt(fd); }
int libc_unlockpt(int fd) { return unlockpt(fd); }
int libc_fdatasync(int fd) { return fdatasync(fd); }
int libc_dirfd(void* dirp) { return dirfd(dirp); }
int libc_setreuid(uid_t ruid, uid_t euid) { return setreuid(ruid, euid); }
int libc_setregid(gid_t rgid, gid_t egid) { return setregid(rgid, egid); }
int libc_acct(const char* filename) { return acct(filename); }
int libc_shmdt(void* shmaddr) { return shmdt(shmaddr); }
int libc_mkostemp(const char* template, int flags) { return mkostemp(template, flags); }
int libc_mkostemps(const char* template, int suffixlen, int flags) { return mkostemps(template, suffixlen, flags); }
int libc_reboot(int howTo) { return reboot(howTo); }
int libc_mkfifoat(int dirfd, const char* pathname, mode_t mode) { return mkfifoat(dirfd, pathname, mode); }
int libc_mkstemps(const char* template, int suffixlen) { return mkstemps(template, suffixlen); }
int libc_getdomainname(const char* name, size_t len) { return getdomainname(name, len); }
int libc_setdomainname(const char* name, size_t len) { return setdomainname(name, len); }
int libc_sethostname(const char* name, size_t len) { return sethostname(name, len); }
int libc_initgroups(const char* user, int group) { return initgroups(user, (gid_t)group); }
int libc_daemon(int nochdir, int noclose) { return daemon(nochdir, noclose); }
int libc_faccessat(int dirfd, const char* pathname, int mode, int flags) { return faccessat(dirfd, pathname, mode, flags); }
int libc_getc(void* arg1) { return getc(arg1); }
int libc_putc(int arg1, void* arg2) { return putc(arg1, arg2); }
int libc_ftrylockfile(void* arg1) { return ftrylockfile(arg1); }
int libc_getw(void* arg1) { return getw(arg1); }
int libc_putw(int arg1, void* arg2) { return putw(arg1, arg2); }
int libc_mblen(const char* arg1, size_t arg2) { return mblen(arg1, arg2); }
long libc_lrand48(void) { return lrand48(); }
long libc_mrand48(void) { return mrand48(); }
long libc_a64l(const char* arg1) { return a64l(arg1); }
int libc_radixsort(void* arg1, int arg2, void* arg3, unsigned int arg4) { return radixsort(arg1, arg2, arg3, arg4); }
int libc_sradixsort(void* arg1, int arg2, void* arg3, unsigned int arg4) { return sradixsort(arg1, arg2, arg3, arg4); }
size_t libc_strlcat(const char* arg1, const char* arg2, size_t arg3) { return strlcat(arg1, arg2, arg3); }
size_t libc_strlcpy(const char* arg1, const char* arg2, size_t arg3) { return strlcpy(arg1, arg2, arg3); }
int libc_ffs(int arg1) { return ffs(arg1); }
int libc_getsubopt(void* arg1, void* arg2, void* arg3) { return getsubopt(arg1, arg2, arg3); }
int libc_killpg(pid_t pgrp, int sig) { return killpg(pgrp, sig); }
int libc_chroot(const char* name) { return chroot(name); }
int libc_lockf(int fd, int cmd, off_t len) { return lockf(fd, cmd, len); }
pid_t libc_vfork(void) { return vfork(); }
long libc_gethostid(void) { return gethostid(); }
int libc_setlogin(const char* name) { return setlogin(name); }
int libc_issetugid(void) { return issetugid(); }
int libc_chflags(const char* path, unsigned int flags) { return chflags(path, flags); }
int libc_fchflags(int fd, unsigned int flags) { return fchflags(fd, flags); }
long long libc_strtonum(const char* numstr, long long minval, long long maxval, void* errstrp) { return strtonum(numstr, minval, maxval, errstrp); }
int libc_getattrlistat(int fd, const char* path, void* attrList, void* attrBuf, size_t attrBufSize, unsigned long options) { return getattrlistat(fd, path, attrList, attrBuf, attrBufSize, options); }
int libc_getattrlistbulk(int dirfd, void* attrList, void* attrBuf, size_t attrBufSize, size_t options) { return getattrlistbulk(dirfd, attrList, attrBuf, attrBufSize, options); }
int libc_execvP(const char* file, const char* searchPath, void* argv) { return execvP(file, searchPath, argv); }
int libc_exchangedata(const char* path1, const char* path2, unsigned long options) { return exchangedata(path1, path2, options); }
int libc_lchflags(const char* path, unsigned long flags) { return lchflags(path, flags); }
int libc_ffsl(long value) { return ffsl(value); }
int libc_ffsll(long long value) { return ffsll(value); }
int libc_fls(int value) { return fls(value); }
int libc_flsl(long value) { return flsl(value); }
int libc_flsll(long long value) { return flsll(value); }

/* Socket / signal / sched / pthread / pty wrappers — void* for struct params */
int libc_getnameinfo(void* sa, unsigned int salen, char* host, unsigned int hostlen, char* serv, unsigned int servlen, int flags) {
    return getnameinfo((const struct sockaddr*)sa, (socklen_t)salen, host, (socklen_t)hostlen, serv, (socklen_t)servlen, flags);
}
int libc_recvfrom(int socket, void* buf, size_t len, int flags, void* addr, void* addrlen) {
    return (int)recvfrom(socket, buf, len, flags, (struct sockaddr*)addr, (socklen_t*)addrlen);
}
int libc_recvmsg(int fd, void* msg, int flags) {
    return (int)recvmsg(fd, (struct msghdr*)msg, flags);
}
ssize_t libc_sendmsg(int fd, void* msg, int flags) {
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
    return pthread_condattr_setclock((pthread_condattr_t*)attr, (clockid_t)clockId);
#else
    (void)attr; (void)clockId;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_pthread_condattr_getclock(void* attr, int* clockId) {
#if defined(__linux__)
    return pthread_condattr_getclock((const pthread_condattr_t*)attr, (clockid_t*)clockId);
#else
    (void)attr; (void)clockId;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_pthread_setschedparam(void* thread, int policy, void* param) {
    return pthread_setschedparam((pthread_t)thread, policy, (const struct sched_param*)param);
}
int libc_sched_setparam(pid_t pid, void* param) {
#if defined(__linux__)
    return sched_setparam(pid, (const struct sched_param*)param);
#else
    (void)pid; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sched_getparam(pid_t pid, void* param) {
#if defined(__linux__)
    return sched_getparam(pid, (struct sched_param*)param);
#else
    (void)pid; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sched_setscheduler(pid_t pid, int policy, void* param) {
#if defined(__linux__)
    return sched_setscheduler(pid, policy, (const struct sched_param*)param);
#else
    (void)pid; (void)policy; (void)param;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_waitid(int idtype, id_t id, void* infop, int options) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__sun)
    return waitid((idtype_t)idtype, id, (siginfo_t*)infop, options);
#else
    (void)idtype; (void)id; (void)infop; (void)options;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_openpty(int* amaster, int* aslave, char* name, void* termp, void* winp) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__linux__)
    return openpty(amaster, aslave, name, (const struct termios*)termp, (const struct winsize*)winp);
#else
    (void)amaster; (void)aslave; (void)name; (void)termp; (void)winp;
    errno = ENOSYS;
    return -1;
#endif
}
pid_t libc_forkpty(int* amaster, char* name, void* termp, void* winp) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__linux__)
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
int libc_clock_gettime(clockid_t clk_id, void* tp) {
    return clock_gettime(clk_id, (struct timespec*)tp);
}
int libc_futimens(int fd, void* times) {
    return futimens(fd, (const struct timespec*)times);
}
ssize_t libc_pwritev(int fd, void* iov, int iovcnt, off_t offset) {
    return pwritev(fd, (const struct iovec*)iov, iovcnt, offset);
}
ssize_t libc_preadv(int fd, void* iov, int iovcnt, off_t offset) {
    return preadv(fd, (const struct iovec*)iov, iovcnt, offset);
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
ssize_t libc_readv(int fd, void* iov, int iovcnt) {
    return readv(fd, (const struct iovec*)iov, iovcnt);
}
ssize_t libc_writev(int fd, void* iov, int iovcnt) {
    return writev(fd, (const struct iovec*)iov, iovcnt);
}
int libc_clock_getres(clockid_t clk_id, void* res) {
    return clock_getres(clk_id, (struct timespec*)res);
}
int libc_utimensat(int dirfd, const char* path, void* times, int flags) {
    return utimensat(dirfd, path, (const struct timespec*)times, flags);
}
int libc_clock_settime(clockid_t clk_id, void* tp) {
    return clock_settime(clk_id, (const struct timespec*)tp);
}
int libc_clock_nanosleep(clockid_t clock_id, int flags, void* rqtp, void* rmtp) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return clock_nanosleep(clock_id, flags, (const struct timespec*)rqtp, (struct timespec*)rmtp);
#else
    (void)clock_id; (void)flags; (void)rqtp; (void)rmtp;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sigtimedwait(void* set, void* info, void* timeout) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__APPLE__)
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
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__APPLE__) || defined(__CYGWIN__)
    return pthread_mutex_timedlock((pthread_mutex_t*)mutex, (const struct timespec*)abstime);
#else
    (void)mutex; (void)abstime;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_sem_timedwait(void* sem, void* abstime) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__APPLE__) || defined(__CYGWIN__)
    return sem_timedwait((sem_t*)sem, (const struct timespec*)abstime);
#else
    (void)sem; (void)abstime;
    errno = ENOSYS;
    return -1;
#endif
}

/* COpaquePointer-param wrappers — void* for pointer params */
int libc_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return pthread_attr_getstack((pthread_attr_t*)attr, stackaddr, (size_t*)stacksize);
}
int libc_getentropy(void* buf, size_t buflen) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return getentropy(buf, buflen);
#else
    (void)buf; (void)buflen;
    errno = ENOSYS;
    return -1;
#endif
}
ssize_t libc_getrandom(void* buf, size_t buflen, unsigned int flags) {
#if defined(__linux__)
    return getrandom(buf, buflen, flags);
#else
    (void)buf; (void)buflen; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_posix_madvise(void* addr, size_t len, int advice) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return posix_madvise(addr, len, advice);
#else
    (void)addr; (void)len; (void)advice;
    errno = ENOSYS;
    return -1;
#endif
}
void* libc_memmem(const void* haystack, size_t haystacklen, const void* needle, size_t needlelen) {
#if defined(__linux__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__APPLE__) || defined(__CYGWIN__)
    return memmem(haystack, haystacklen, needle, needlelen);
#else
    (void)haystack; (void)haystacklen; (void)needle; (void)needlelen;
    return NULL;
#endif
}
int libc_sysctl(int* name, unsigned int namelen, void* oldp, void* oldlenp, void* newp, size_t newlen) {
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return sysctl(name, namelen, oldp, (size_t*)oldlenp, newp, newlen);
#else
    (void)name; (void)namelen; (void)oldp; (void)oldlenp; (void)newp; (void)newlen;
    errno = ENOSYS;
    return -1;
#endif
}

/* String-param function wrappers */
int libc_shm_open(const char* name, int oflag, int mode) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    return shm_open(name, oflag, (mode_t)mode);
#else
    (void)name; (void)oflag; (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_shm_unlink(const char* name) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
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
    return mknodat(dirfd, pathname, (mode_t)mode, (dev_t)dev);
#else
    (void)dirfd; (void)pathname; (void)mode; (void)dev;
    errno = ENOSYS;
    return -1;
#endif
}
int libc_mkfifoat_int(int dirfd, const char* pathname, int mode) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__) || defined(__HAIKU__)
    return mkfifoat(dirfd, pathname, (mode_t)mode);
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
char* libc_strerror_r(int errnum, char* buf, size_t buflen) {
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
size_t libc_strftime(char* s, size_t max, const char* format, void* tm) {
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
int libc_pthread_getname_np(void* thread, char* name, unsigned long len) {
#if defined(__linux__) || defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
    return pthread_getname_np((pthread_t)thread, name, len);
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
    return getgrouplist(user, (gid_t)group, (gid_t*)groups, ngroups);
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
int libc_sched_getscheduler(pid_t pid) { return sched_getscheduler(pid); }
int libc_sched_get_priority_max(int policy) { return sched_get_priority_max(policy); }
int libc_sched_get_priority_min(int policy) { return sched_get_priority_min(policy); }
int libc_pthread_kill(void* thread, int sig) { return pthread_kill((pthread_t)thread, sig); }
int libc_pthread_spin_init(void* lock, int pshared) { return pthread_spin_init((pthread_spinlock_t*)lock, pshared); }
int libc_pthread_spin_destroy(void* lock) { return pthread_spin_destroy((pthread_spinlock_t*)lock); }
int libc_pthread_spin_lock(void* lock) { return pthread_spin_lock((pthread_spinlock_t*)lock); }
int libc_pthread_spin_trylock(void* lock) { return pthread_spin_trylock((pthread_spinlock_t*)lock); }
int libc_pthread_spin_unlock(void* lock) { return pthread_spin_unlock((pthread_spinlock_t*)lock); }
int libc_posix_fallocate(int fd, long offset, long len) { return posix_fallocate(fd, (off_t)offset, (off_t)len); }
void* libc_memalign(size_t alignment, size_t size) { return memalign(alignment, size); }
long libc_telldir(void* dirp) { return (long)telldir((DIR*)dirp); }
void* libc_duplocale(void* base) { return (void*)duplocale((locale_t)base); }
char* libc_nl_langinfo(int item) { return nl_langinfo(item); }
void* libc_getpwent(void) { return (void*)getpwent(); }
void* libc_getgrent(void) { return (void*)getgrent(); }
void libc_endpwent(void) { endpwent(); }
void libc_endgrent(void) { endgrent(); }
void libc_setpwent(void) { setpwent(); }
void libc_setgrent(void) { setgrent(); }
void* libc_getgrgid(int gid) { return (void*)getgrgid((gid_t)gid); }
void* libc_getpwuid(int uid) { return (void*)getpwuid((uid_t)uid); }
void* libc_getpwnam(const char* name) { return (void*)getpwnam(name); }
void* libc_getgrnam(const char* name) { return (void*)getgrnam(name); }
int libc_pthread_setspecific(unsigned long key, const void* value) { return pthread_setspecific((pthread_key_t)key, value); }
void* libc_pthread_getspecific(unsigned long key) { return (void*)pthread_getspecific((pthread_key_t)key); }
