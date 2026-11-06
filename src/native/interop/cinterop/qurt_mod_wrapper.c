#include "qurt_mod_wrapper.h"
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#ifdef _WIN32
#include <io.h>
#include <process.h>
#include <direct.h>
#endif
#if !defined(_WIN32)
#include <dirent.h>
#include <unistd.h>
#endif

void* libc_qurt_mod_opendir(const char* name) {
#if !defined(_WIN32)
    return (void*)opendir(name);
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_qurt_mod_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_qurt_mod_closedir(void* dirp) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_qurt_mod_mkdir(const char* path, uint32_t mode) {
    return (int32_t)mkdir(path, mode);
}

int32_t libc_qurt_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize) {
    return (int32_t)pthread_attr_getstack(attr, stackaddr, stacksize);
}

int32_t libc_qurt_mod_pthread_attr_setstack(void* attr, void* stackaddr, uint64_t stacksize) {
    return (int32_t)pthread_attr_setstack(attr, stackaddr, stacksize);
}

int32_t libc_qurt_mod_clock_getcpuclockid(int32_t pid, void* clock_id) {
    return (int32_t)clock_getcpuclockid(pid, clock_id);
}

int32_t libc_qurt_mod_sem_close(void* sem) {
    return (int32_t)sem_close(sem);
}

int32_t libc_qurt_mod_sem_unlink(const char* name) {
    return (int32_t)sem_unlink(name);
}

void* libc_qurt_mod_aligned_alloc(uint64_t alignment, uint64_t size) {
    return (void*)aligned_alloc(alignment, size);
}

uint64_t libc_qurt_mod_strlen(const char* s) {
    return (uint64_t)strlen(s);
}

char* libc_qurt_mod_strcpy(char* dest, const char* src) {
    return (char*)strcpy(dest, src);
}

char* libc_qurt_mod_strncpy(char* dest, const char* src, uint64_t n) {
    return (char*)strncpy(dest, src, n);
}

char* libc_qurt_mod_strcat(char* dest, const char* src) {
    return (char*)strcat(dest, src);
}

char* libc_qurt_mod_strncat(char* dest, const char* src, uint64_t n) {
    return (char*)strncat(dest, src, n);
}

int32_t libc_qurt_mod_strcmp(const char* s1, const char* s2) {
    return (int32_t)strcmp(s1, s2);
}

int32_t libc_qurt_mod_strncmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncmp(s1, s2, n);
}

int32_t libc_qurt_mod_strcoll(const char* s1, const char* s2) {
    return (int32_t)strcoll(s1, s2);
}

uint64_t libc_qurt_mod_strxfrm(char* dest, const char* src, uint64_t n) {
    return (uint64_t)strxfrm(dest, src, n);
}

char* libc_qurt_mod_strchr(const char* s, int32_t c) {
    return (char*)strchr(s, c);
}

char* libc_qurt_mod_strrchr(const char* s, int32_t c) {
    return (char*)strrchr(s, c);
}

uint64_t libc_qurt_mod_strspn(const char* s, const char* accept) {
    return (uint64_t)strspn(s, accept);
}

uint64_t libc_qurt_mod_strcspn(const char* s, const char* reject) {
    return (uint64_t)strcspn(s, reject);
}

char* libc_qurt_mod_strpbrk(const char* s, const char* accept) {
    return (char*)strpbrk(s, accept);
}

char* libc_qurt_mod_strstr(const char* haystack, const char* needle) {
    return (char*)strstr(haystack, needle);
}

char* libc_qurt_mod_strtok(char* s, const char* delim) {
    return (char*)strtok(s, delim);
}

char* libc_qurt_mod_strerror(int32_t errnum) {
    return (char*)strerror(errnum);
}

void* libc_qurt_mod_memchr(void* s, int32_t c, uint64_t n) {
    return (void*)memchr(s, c, n);
}

int32_t libc_qurt_mod_memcmp(void* s1, void* s2, uint64_t n) {
    return (int32_t)memcmp(s1, s2, n);
}

void* libc_qurt_mod_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_qurt_mod_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_qurt_mod_memset(void* s, int32_t c, uint64_t n) {
    return (void*)memset(s, c, n);
}

int32_t libc_qurt_mod_fork(void) {
#if !defined(_WIN32)
    return (int32_t)fork();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_qurt_mod_execve(const char* filename, void* argv, void* envp) {
    return (int32_t)execve(filename, argv, envp);
}

int32_t libc_qurt_mod_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_qurt_mod_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_qurt_mod_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_qurt_mod_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_qurt_mod_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_qurt_mod_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_qurt_mod_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_qurt_mod_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_qurt_mod_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_qurt_mod_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_qurt_mod_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_qurt_mod_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_qurt_mod_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

