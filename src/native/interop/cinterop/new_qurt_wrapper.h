#ifndef LIBC_NEW_QURT_NEW_QURT_WRAPPER_H
#define LIBC_NEW_QURT_NEW_QURT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_new_qurt_opendir(const char* name);
void* libc_new_qurt_readdir(void* dirp);
int32_t libc_new_qurt_closedir(void* dirp);
int32_t libc_new_qurt_mkdir(const char* path, uint32_t mode);
int32_t libc_new_qurt_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_new_qurt_pthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libc_new_qurt_clockGetcpuclockid(int32_t pid, void* clock_id);
int32_t libc_new_qurt_semClose(void* sem);
int32_t libc_new_qurt_semUnlink(const char* name);
void* libc_new_qurt_alignedAlloc(uint64_t alignment, uint64_t size);
uint64_t libc_new_qurt_strlen(const char* s);
char* libc_new_qurt_strcpy(char* dest, const char* src);
char* libc_new_qurt_strncpy(char* dest, const char* src, uint64_t n);
char* libc_new_qurt_strcat(char* dest, const char* src);
char* libc_new_qurt_strncat(char* dest, const char* src, uint64_t n);
int32_t libc_new_qurt_strcmp(const char* s1, const char* s2);
int32_t libc_new_qurt_strncmp(const char* s1, const char* s2, uint64_t n);
int32_t libc_new_qurt_strcoll(const char* s1, const char* s2);
uint64_t libc_new_qurt_strxfrm(char* dest, const char* src, uint64_t n);
char* libc_new_qurt_strchr(const char* s, int32_t c);
char* libc_new_qurt_strrchr(const char* s, int32_t c);
uint64_t libc_new_qurt_strspn(const char* s, const char* arg_1_accept);
uint64_t libc_new_qurt_strcspn(const char* s, const char* reject);
char* libc_new_qurt_strpbrk(const char* s, const char* arg_1_accept);
char* libc_new_qurt_strstr(const char* haystack, const char* needle);
char* libc_new_qurt_strtok(char* s, const char* delim);
char* libc_new_qurt_strerror(int32_t errnum);
void* libc_new_qurt_memchr(void* s, int32_t c, uint64_t n);
int32_t libc_new_qurt_memcmp(void* s1, void* s2, uint64_t n);
void* libc_new_qurt_memcpy(void* dest, void* src, uint64_t n);
void* libc_new_qurt_memmove(void* dest, void* src, uint64_t n);
void* libc_new_qurt_memset(void* s, int32_t c, uint64_t n);
int32_t libc_new_qurt_fork(void);
int32_t libc_new_qurt_execve(const char* filename, void* argv, void* envp);
int32_t libc_new_qurt_isalnum(int32_t c);
int32_t libc_new_qurt_isalpha(int32_t c);
int32_t libc_new_qurt_iscntrl(int32_t c);
int32_t libc_new_qurt_isdigit(int32_t c);
int32_t libc_new_qurt_isgraph(int32_t c);
int32_t libc_new_qurt_islower(int32_t c);
int32_t libc_new_qurt_isprint(int32_t c);
int32_t libc_new_qurt_ispunct(int32_t c);
int32_t libc_new_qurt_isspace(int32_t c);
int32_t libc_new_qurt_isupper(int32_t c);
int32_t libc_new_qurt_isxdigit(int32_t c);
int32_t libc_new_qurt_tolower(int32_t c);
int32_t libc_new_qurt_toupper(int32_t c);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_NEW_QURT_WRAPPER_H */
