#include "windows_mod_wrapper.h"
#include <errno.h>
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include <signal.h>
#include <time.h>
#include <locale.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#endif

int32_t libc_windows_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_windows_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_windows_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_windows_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_windows_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_windows_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_windows_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_windows_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_windows_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_windows_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_windows_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_windows_mod_isblank(int32_t c) {
    return (int32_t)isblank(c);
}

int32_t libc_windows_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_windows_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

void libc_windows_mod_qsort(void* base, uint64_t num, uint64_t size, void* compar) {
    qsort(base, num, size, compar);
}

void libc_windows_mod_qsort_s(void* base, uint64_t num, uint64_t size, void* compar, void* arg) {
    qsort_s(base, num, size, compar, arg);
}

void* libc_windows_mod_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_windows_mod_freopen(const char* filename, const char* mode, void* file) {
    return (void*)freopen(filename, mode, (FILE*)file);
}

int32_t libc_windows_mod_fflush(void* file) {
    return (int32_t)fflush((FILE*)file);
}

int32_t libc_windows_mod_fclose(void* file) {
    return (int32_t)fclose((FILE*)file);
}

int32_t libc_windows_mod_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_windows_mod_rename(const char* oldname, const char* newname) {
    return (int32_t)rename(oldname, newname);
}

void* libc_windows_mod_tmpfile(void) {
    return (void*)tmpfile();
}

int32_t libc_windows_mod_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_windows_mod_setbuf(void* stream, char* buf) {
    setbuf((FILE*)stream, buf);
}

int32_t libc_windows_mod_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_windows_mod_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_windows_mod_fgetc(void* stream) {
    return (int32_t)fgetc((FILE*)stream);
}

char* libc_windows_mod_fgets(char* buf, int32_t n, void* stream) {
    return (char*)fgets(buf, n, (FILE*)stream);
}

int32_t libc_windows_mod_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, (FILE*)stream);
}

int32_t libc_windows_mod_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, (FILE*)stream);
}

int32_t libc_windows_mod_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_windows_mod_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, (FILE*)stream);
}

uint64_t libc_windows_mod_fread(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fread(ptr, size, nobj, (FILE*)stream);
}

uint64_t libc_windows_mod_fwrite(void* ptr, uint64_t size, uint64_t nobj, void* stream) {
    return (uint64_t)fwrite(ptr, size, nobj, (FILE*)stream);
}

int32_t libc_windows_mod_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek((FILE*)stream, offset, whence);
}

int64_t libc_windows_mod_ftell(void* stream) {
    return (int64_t)ftell((FILE*)stream);
}

void libc_windows_mod_rewind(void* stream) {
    rewind((FILE*)stream);
}

int32_t libc_windows_mod_fgetpos(void* stream, void* ptr) {
    return (int32_t)fgetpos((FILE*)stream, ptr);
}

int32_t libc_windows_mod_fsetpos(void* stream, void* ptr) {
    return (int32_t)fsetpos((FILE*)stream, ptr);
}

int32_t libc_windows_mod_feof(void* stream) {
    return (int32_t)feof((FILE*)stream);
}

int32_t libc_windows_mod_ferror(void* stream) {
    return (int32_t)ferror((FILE*)stream);
}

void libc_windows_mod_perror(const char* s) {
    perror(s);
}

double libc_windows_mod_atof(const char* s) {
    return (double)atof(s);
}

int32_t libc_windows_mod_atoi(const char* s) {
    return (int32_t)atoi(s);
}

int64_t libc_windows_mod_atol(const char* s) {
    return (int64_t)atol(s);
}

int64_t libc_windows_mod_atoll(const char* s) {
    return (int64_t)atoll(s);
}

double libc_windows_mod_strtod(const char* s, void* endp) {
    return (double)strtod(s, endp);
}

float libc_windows_mod_strtof(const char* s, void* endp) {
    return (float)strtof(s, endp);
}

int64_t libc_windows_mod_strtol(const char* s, void* endp, int32_t base) {
    return (int64_t)strtol(s, endp, base);
}

int64_t libc_windows_mod_strtoll(const char* s, void* endp, int32_t base) {
    return (int64_t)strtoll(s, endp, base);
}

uint64_t libc_windows_mod_strtoul(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoul(s, endp, base);
}

uint64_t libc_windows_mod_strtoull(const char* s, void* endp, int32_t base) {
    return (uint64_t)strtoull(s, endp, base);
}

void* libc_windows_mod_calloc(uint64_t nobj, uint64_t size) {
    return (void*)calloc(nobj, size);
}

void* libc_windows_mod_malloc(uint64_t size) {
    return (void*)malloc(size);
}

uint64_t libc_windows_mod_msize(void* p) {
    return (uint64_t)_msize(p);
}

void* libc_windows_mod_realloc(void* p, uint64_t size) {
    return (void*)realloc(p, size);
}

void libc_windows_mod_free(void* p) {
    free(p);
}

void libc_windows_mod_abort(void) {
    abort();
}

void libc_windows_mod_exit(int32_t status) {
    exit(status);
}

int32_t libc_windows_mod_atexit(int32_t cb) {
    return (int32_t)atexit(cb);
}

int32_t libc_windows_mod_system(const char* s) {
    return (int32_t)system(s);
}

char* libc_windows_mod_getenv(const char* s) {
    return (char*)getenv(s);
}

char* libc_windows_mod_strcpy(char* dst, const char* src) {
    return (char*)strcpy(dst, src);
}

char* libc_windows_mod_strncpy(char* dst, const char* src, uint64_t n) {
    return (char*)strncpy(dst, src, n);
}

char* libc_windows_mod_strcat(char* s, const char* ct) {
    return (char*)strcat(s, ct);
}

char* libc_windows_mod_strncat(char* s, const char* ct, uint64_t n) {
    return (char*)strncat(s, ct, n);
}

int32_t libc_windows_mod_strcmp(const char* cs, const char* ct) {
    return (int32_t)strcmp(cs, ct);
}

int32_t libc_windows_mod_strncmp(const char* cs, const char* ct, uint64_t n) {
    return (int32_t)strncmp(cs, ct, n);
}

int32_t libc_windows_mod_strcoll(const char* cs, const char* ct) {
    return (int32_t)strcoll(cs, ct);
}

char* libc_windows_mod_strchr(const char* cs, int32_t c) {
    return (char*)strchr(cs, c);
}

char* libc_windows_mod_strrchr(const char* cs, int32_t c) {
    return (char*)strrchr(cs, c);
}

uint64_t libc_windows_mod_strspn(const char* cs, const char* ct) {
    return (uint64_t)strspn(cs, ct);
}

uint64_t libc_windows_mod_strcspn(const char* cs, const char* ct) {
    return (uint64_t)strcspn(cs, ct);
}

char* libc_windows_mod_strdup(const char* cs) {
    return (char*)strdup(cs);
}

char* libc_windows_mod_strpbrk(const char* cs, const char* ct) {
    return (char*)strpbrk(cs, ct);
}

char* libc_windows_mod_strstr(const char* cs, const char* ct) {
    return (char*)strstr(cs, ct);
}

uint64_t libc_windows_mod_strlen(const char* cs) {
    return (uint64_t)strlen(cs);
}

uint64_t libc_windows_mod_strnlen(const char* cs, uint64_t maxlen) {
    return (uint64_t)strnlen(cs, maxlen);
}

char* libc_windows_mod_strerror(int32_t n) {
    return (char*)strerror(n);
}

char* libc_windows_mod_strtok(char* s, const char* t) {
    return (char*)strtok(s, t);
}

uint64_t libc_windows_mod_strxfrm(char* s, const char* ct, uint64_t n) {
    return (uint64_t)strxfrm(s, ct, n);
}

uint64_t libc_windows_mod_wcslen(void* buf) {
    return (uint64_t)wcslen(buf);
}

uint64_t libc_windows_mod_wcsnlen(void* str, uint64_t numberOfElements) {
    return (uint64_t)wcsnlen(str, numberOfElements);
}

uint64_t libc_windows_mod_wcstombs(char* dest, void* src, uint64_t n) {
    return (uint64_t)wcstombs(dest, src, n);
}

void* libc_windows_mod_memchr(void* cx, int32_t c, uint64_t n) {
    return (void*)memchr(cx, c, n);
}

int32_t libc_windows_mod_memcmp(void* cx, void* ct, uint64_t n) {
    return (int32_t)memcmp(cx, ct, n);
}

void* libc_windows_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_windows_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_windows_mod_memset(void* dest, int32_t c, uint64_t n) {
    return (void*)memset(dest, c, n);
}

int32_t libc_windows_mod_abs(int32_t i) {
    return (int32_t)abs(i);
}

int64_t libc_windows_mod_labs(int64_t i) {
    return (int64_t)labs(i);
}

int32_t libc_windows_mod_rand(void) {
    return (int32_t)rand();
}

void libc_windows_mod_srand(uint32_t seed) {
    srand(seed);
}

uint64_t libc_windows_mod_signal(int32_t signum, uint64_t handler) {
    return (uint64_t)signal(signum, (void (*)(int))handler);
}

int32_t libc_windows_mod_raise(int32_t signum) {
    return (int32_t)raise(signum);
}

int32_t libc_windows_mod_clock(void) {
    return (int32_t)clock();
}

char* libc_windows_mod_ctime(void* sourceTime) {
    return (char*)ctime(sourceTime);
}

double libc_windows_mod_difftime(int64_t timeEnd, int64_t timeStart) {
    return (double)difftime(timeEnd, timeStart);
}

int32_t libc_windows_mod_gmtime_s(void* destTime, void* srcTime) {
    return (int32_t)_gmtime64_s(destTime, srcTime);
}

int32_t libc_windows_mod_get_daylight(void* hours) {
    return (int32_t)_get_daylight(hours);
}

int32_t libc_windows_mod_get_dstbias(void* seconds) {
    return (int32_t)_get_dstbias(seconds);
}

int32_t libc_windows_mod_get_timezone(void* seconds) {
    return (int32_t)_get_timezone(seconds);
}

int32_t libc_windows_mod_get_tzname(void* p_return_value, char* time_zone_name, uint64_t size_in_bytes, int32_t index) {
    return (int32_t)_get_tzname(p_return_value, time_zone_name, size_in_bytes, index);
}

int32_t libc_windows_mod_localtime_s(void* tmDest, void* sourceTime) {
    return (int32_t)_localtime64_s(tmDest, sourceTime);
}

int64_t libc_windows_mod_time(void* destTime) {
    return (int64_t)_time64(destTime);
}

void libc_windows_mod_tzset(void) {
    _tzset();
}

int32_t libc_windows_mod_chmod(const char* path, int32_t mode) {
    return (int32_t)_chmod(path, mode);
}

int32_t libc_windows_mod_wchmod(void* path, int32_t mode) {
    return (int32_t)_wchmod(path, mode);
}

int32_t libc_windows_mod_mkdir(const char* path) {
    return (int32_t)_mkdir(path);
}

int32_t libc_windows_mod_wrmdir(void* path) {
    return (int32_t)_wrmdir(path);
}

int32_t libc_windows_mod_fstat(int32_t fildes, void* buf) {
    return (int32_t)_fstat64(fildes, buf);
}

int32_t libc_windows_mod_stat(const char* path, void* buf) {
    return (int32_t)_stat64(path, buf);
}

int32_t libc_windows_mod_wstat(void* path, void* buf) {
    return (int32_t)_wstat64(path, buf);
}

int32_t libc_windows_mod_wutime(void* file, void* buf) {
    return (int32_t)_wutime64(file, buf);
}

void* libc_windows_mod_popen(const char* command, const char* mode) {
    return (void*)_popen(command, mode);
}

int32_t libc_windows_mod_pclose(void* stream) {
    return (int32_t)_pclose((FILE*)stream);
}

void* libc_windows_mod_fdopen(int32_t fd, const char* mode) {
    return (void*)_fdopen(fd, mode);
}

int32_t libc_windows_mod_fileno(void* stream) {
    return (int32_t)_fileno((FILE*)stream);
}

int32_t libc_windows_mod_creat(const char* path, int32_t mode) {
    return (int32_t)_creat(path, mode);
}

int32_t libc_windows_mod_access(const char* path, int32_t amode) {
    return (int32_t)_access(path, amode);
}

int32_t libc_windows_mod_chdir(const char* dir) {
    return (int32_t)_chdir(dir);
}

int32_t libc_windows_mod_close(int32_t fd) {
    return (int32_t)_close(fd);
}

int32_t libc_windows_mod_dup(int32_t fd) {
    return (int32_t)_dup(fd);
}

int32_t libc_windows_mod_dup2(int32_t src, int32_t dst) {
    return (int32_t)_dup2(src, dst);
}

int64_t libc_windows_mod_execv(const char* prog, void* argv) {
    return (int64_t)_execv(prog, argv);
}

int32_t libc_windows_mod_execve(const char* prog, void* argv, void* envp) {
    return (int32_t)_execve(prog, argv, envp);
}

int32_t libc_windows_mod_execvp(const char* c, void* argv) {
    return (int32_t)_execvp(c, argv);
}

int32_t libc_windows_mod_execvpe(const char* c, void* argv, void* envp) {
    return (int32_t)_execvpe(c, argv, envp);
}

int64_t libc_windows_mod_wexecv(void* prog, void* argv) {
    return (int64_t)_wexecv(prog, argv);
}

int64_t libc_windows_mod_wexecve(void* prog, void* argv, void* envp) {
    return (int64_t)_wexecve(prog, argv, envp);
}

int64_t libc_windows_mod_wexecvp(void* c, void* argv) {
    return (int64_t)_wexecvp(c, argv);
}

int64_t libc_windows_mod_wexecvpe(void* c, void* argv, void* envp) {
    return (int64_t)_wexecvpe(c, argv, envp);
}

char* libc_windows_mod_getcwd(char* buf, int32_t size) {
    return (char*)_getcwd(buf, size);
}

int32_t libc_windows_mod_getpid(void) {
    return (int32_t)_getpid();
}

int32_t libc_windows_mod_isatty(int32_t fd) {
    return (int32_t)_isatty(fd);
}

int64_t libc_windows_mod_lseek(int32_t fd, int64_t offset, int32_t origin) {
    return (int64_t)_lseek(fd, offset, origin);
}

int64_t libc_windows_mod_lseek64(int32_t fd, int64_t offset, int32_t origin) {
    return (int64_t)_lseeki64(fd, offset, origin);
}

int32_t libc_windows_mod_pipe(void* fds, uint32_t psize, int32_t textmode) {
    return (int32_t)_pipe(fds, psize, textmode);
}

int32_t libc_windows_mod_read(int32_t fd, void* buf, uint32_t count) {
    return (int32_t)_read(fd, buf, count);
}

int32_t libc_windows_mod_rmdir(const char* path) {
    return (int32_t)_rmdir(path);
}

int32_t libc_windows_mod_unlink(const char* c) {
    return (int32_t)_unlink(c);
}

int32_t libc_windows_mod_write(int32_t fd, void* buf, uint32_t count) {
    return (int32_t)_write(fd, buf, count);
}

int32_t libc_windows_mod_commit(int32_t fd) {
    return (int32_t)_commit(fd);
}

int64_t libc_windows_mod_get_osfhandle(int32_t fd) {
    return (int64_t)_get_osfhandle(fd);
}

int32_t libc_windows_mod_open_osfhandle(int64_t osfhandle, int32_t flags) {
    return (int32_t)_open_osfhandle(osfhandle, flags);
}

char* libc_windows_mod_setlocale(int32_t category, const char* locale) {
    return (char*)setlocale(category, locale);
}

void* libc_windows_mod_wsetlocale(int32_t category, void* locale) {
    return (void*)_wsetlocale(category, locale);
}

void* libc_windows_mod_aligned_malloc(uint64_t size, uint64_t alignment) {
    return (void*)_aligned_malloc(size, alignment);
}

void libc_windows_mod_aligned_free(void* ptr) {
    _aligned_free(ptr);
}

void* libc_windows_mod_aligned_realloc(void* memblock, uint64_t size, uint64_t alignment) {
    return (void*)_aligned_realloc(memblock, size, alignment);
}

int32_t libc_windows_mod_putenv(const char* envstring) {
    return (int32_t)_putenv(envstring);
}

int32_t libc_windows_mod_wputenv(void* envstring) {
    return (int32_t)_wputenv(envstring);
}

int32_t libc_windows_mod_putenv_s(const char* envstring, const char* value_string) {
    return (int32_t)_putenv_s(envstring, value_string);
}

int32_t libc_windows_mod_wputenv_s(void* envstring, void* value_string) {
    return (int32_t)_wputenv_s(envstring, value_string);
}

int32_t libc_windows_mod_listen(uint64_t s, int32_t backlog) {
    return (int32_t)listen(s, backlog);
}

uint64_t libc_windows_mod_accept(uint64_t s, void* addr, void* addrlen) {
    return (uint64_t)accept(s, addr, addrlen);
}

int32_t libc_windows_mod_bind(uint64_t s, void* name, int32_t namelen) {
    return (int32_t)bind(s, name, namelen);
}

int32_t libc_windows_mod_connect(uint64_t s, void* name, int32_t namelen) {
    return (int32_t)connect(s, name, namelen);
}

int32_t libc_windows_mod_getpeername(uint64_t s, void* name, void* nameln) {
    return (int32_t)getpeername(s, name, nameln);
}

int32_t libc_windows_mod_getsockname(uint64_t s, void* name, void* nameln) {
    return (int32_t)getsockname(s, name, nameln);
}

int32_t libc_windows_mod_getsockopt(uint64_t s, int32_t level, int32_t optname, char* optval, void* optlen) {
    return (int32_t)getsockopt(s, level, optname, optval, optlen);
}

int32_t libc_windows_mod_recvfrom(uint64_t s, char* buf, int32_t len, int32_t flags, void* from, void* fromlen) {
    return (int32_t)recvfrom(s, buf, len, flags, from, fromlen);
}

int32_t libc_windows_mod_sendto(uint64_t s, const char* buf, int32_t len, int32_t flags, void* to, int32_t tolen) {
    return (int32_t)sendto(s, buf, len, flags, to, tolen);
}

int32_t libc_windows_mod_setsockopt(uint64_t s, int32_t level, int32_t optname, const char* optval, int32_t optlen) {
    return (int32_t)setsockopt(s, level, optname, optval, optlen);
}

uint64_t libc_windows_mod_socket(int32_t af, int32_t socket_type, int32_t protocol) {
    return (uint64_t)socket(af, socket_type, protocol);
}

