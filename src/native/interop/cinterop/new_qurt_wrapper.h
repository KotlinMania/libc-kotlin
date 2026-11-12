#ifndef LIBC_NEW_QURT_NEW_QURT_WRAPPER_H
#define LIBC_NEW_QURT_NEW_QURT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewQurtOpendir(const char* name);
void* libcNewQurtReaddir(void* dirp);
int32_t libcNewQurtClosedir(void* dirp);
int32_t libcNewQurtMkdir(const char* path, uint32_t mode);
int32_t libcNewQurtPthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libcNewQurtPthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libcNewQurtClockGetcpuclockid(int32_t pid, void* clockId);
void* libcNewQurtSemOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtSemClose(void* sem);
int32_t libcNewQurtSemUnlink(const char* name);
void* libcNewQurtAlignedAlloc(uint64_t alignment, uint64_t size);
uint64_t libcNewQurtStrlen(const char* s);
char* libcNewQurtStrcpy(char* dest, const char* src);
char* libcNewQurtStrncpy(char* dest, const char* src, uint64_t n);
char* libcNewQurtStrcat(char* dest, const char* src);
char* libcNewQurtStrncat(char* dest, const char* src, uint64_t n);
int32_t libcNewQurtStrcmp(const char* s1, const char* s2);
int32_t libcNewQurtStrncmp(const char* s1, const char* s2, uint64_t n);
int32_t libcNewQurtStrcoll(const char* s1, const char* s2);
uint64_t libcNewQurtStrxfrm(char* dest, const char* src, uint64_t n);
char* libcNewQurtStrchr(const char* s, int32_t c);
char* libcNewQurtStrrchr(const char* s, int32_t c);
uint64_t libcNewQurtStrspn(const char* s, const char* arg1Accept);
uint64_t libcNewQurtStrcspn(const char* s, const char* reject);
char* libcNewQurtStrpbrk(const char* s, const char* arg1Accept);
char* libcNewQurtStrstr(const char* haystack, const char* needle);
char* libcNewQurtStrtok(char* s, const char* delim);
char* libcNewQurtStrerror(int32_t errnum);
void* libcNewQurtMemchr(void* s, int32_t c, uint64_t n);
int32_t libcNewQurtMemcmp(void* s1, void* s2, uint64_t n);
void* libcNewQurtMemcpy(void* dest, void* src, uint64_t n);
void* libcNewQurtMemmove(void* dest, void* src, uint64_t n);
void* libcNewQurtMemset(void* s, int32_t c, uint64_t n);
int32_t libcNewQurtFork(void);
int32_t libcNewQurtExecve(const char* filename, void* argv, void* envp);
int32_t libcNewQurtIsalnum(int32_t c);
int32_t libcNewQurtIsalpha(int32_t c);
int32_t libcNewQurtIscntrl(int32_t c);
int32_t libcNewQurtIsdigit(int32_t c);
int32_t libcNewQurtIsgraph(int32_t c);
int32_t libcNewQurtIslower(int32_t c);
int32_t libcNewQurtIsprint(int32_t c);
int32_t libcNewQurtIspunct(int32_t c);
int32_t libcNewQurtIsspace(int32_t c);
int32_t libcNewQurtIsupper(int32_t c);
int32_t libcNewQurtIsxdigit(int32_t c);
int32_t libcNewQurtTolower(int32_t c);
int32_t libcNewQurtToupper(int32_t c);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_NEW_QURT_WRAPPER_H */
