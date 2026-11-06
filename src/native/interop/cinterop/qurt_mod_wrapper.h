#ifndef LIBC_QURT_MOD_QURT_MOD_WRAPPER_H
#define LIBC_QURT_MOD_QURT_MOD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_qurt_mod_opendir(const char* name);
void* libc_qurt_mod_readdir(void* dirp);
int32_t libc_qurt_mod_closedir(void* dirp);
int32_t libc_qurt_mod_mkdir(const char* path, uint32_t mode);
int32_t libc_qurt_mod_pthread_attr_getstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_qurt_mod_pthread_attr_setstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libc_qurt_mod_clock_getcpuclockid(int32_t pid, void* clock_id);
int32_t libc_qurt_mod_sem_close(void* sem);
int32_t libc_qurt_mod_sem_unlink(const char* name);
void* libc_qurt_mod_aligned_alloc(uint64_t alignment, uint64_t size);
uint64_t libc_qurt_mod_strlen(const char* s);
char* libc_qurt_mod_strcpy(char* dest, const char* src);
char* libc_qurt_mod_strncpy(char* dest, const char* src, uint64_t n);
char* libc_qurt_mod_strcat(char* dest, const char* src);
char* libc_qurt_mod_strncat(char* dest, const char* src, uint64_t n);
int32_t libc_qurt_mod_strcmp(const char* s1, const char* s2);
int32_t libc_qurt_mod_strncmp(const char* s1, const char* s2, uint64_t n);
int32_t libc_qurt_mod_strcoll(const char* s1, const char* s2);
uint64_t libc_qurt_mod_strxfrm(char* dest, const char* src, uint64_t n);
char* libc_qurt_mod_strchr(const char* s, int32_t c);
char* libc_qurt_mod_strrchr(const char* s, int32_t c);
uint64_t libc_qurt_mod_strspn(const char* s, const char* accept);
uint64_t libc_qurt_mod_strcspn(const char* s, const char* reject);
char* libc_qurt_mod_strpbrk(const char* s, const char* accept);
char* libc_qurt_mod_strstr(const char* haystack, const char* needle);
char* libc_qurt_mod_strtok(char* s, const char* delim);
char* libc_qurt_mod_strerror(int32_t errnum);
void* libc_qurt_mod_memchr(void* s, int32_t c, uint64_t n);
int32_t libc_qurt_mod_memcmp(void* s1, void* s2, uint64_t n);
void* libc_qurt_mod_memcpy(void* dest, void* src, uint64_t n);
void* libc_qurt_mod_memmove(void* dest, void* src, uint64_t n);
void* libc_qurt_mod_memset(void* s, int32_t c, uint64_t n);
int32_t libc_qurt_mod_fork(void);
int32_t libc_qurt_mod_execve(const char* filename, void* argv, void* envp);
int32_t libc_qurt_mod_isalnum(int32_t c);
int32_t libc_qurt_mod_isalpha(int32_t c);
int32_t libc_qurt_mod_iscntrl(int32_t c);
int32_t libc_qurt_mod_isdigit(int32_t c);
int32_t libc_qurt_mod_isgraph(int32_t c);
int32_t libc_qurt_mod_islower(int32_t c);
int32_t libc_qurt_mod_isprint(int32_t c);
int32_t libc_qurt_mod_ispunct(int32_t c);
int32_t libc_qurt_mod_isspace(int32_t c);
int32_t libc_qurt_mod_isupper(int32_t c);
int32_t libc_qurt_mod_isxdigit(int32_t c);
int32_t libc_qurt_mod_tolower(int32_t c);
int32_t libc_qurt_mod_toupper(int32_t c);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_QURT_MOD_QURT_MOD_WRAPPER_H */
