#ifndef LIBC_NEW_QURT_STDIO_NEW_QURT_STDIO_WRAPPER_H
#define LIBC_NEW_QURT_STDIO_NEW_QURT_STDIO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewQurtStdioFopen(const char* filename, const char* mode);
void* libcNewQurtStdioFreopen(const char* filename, const char* mode, void* stream);
int32_t libcNewQurtStdioFclose(void* stream);
int32_t libcNewQurtStdioFflush(void* stream);
uint64_t libcNewQurtStdioFread(void* ptr, uint64_t size, uint64_t nmemb, void* stream);
uint64_t libcNewQurtStdioFwrite(void* ptr, uint64_t size, uint64_t nmemb, void* stream);
int32_t libcNewQurtStdioFgetc(void* stream);
int32_t libcNewQurtStdioFputc(int32_t c, void* stream);
int32_t libcNewQurtStdioGetchar(void);
int32_t libcNewQurtStdioPutchar(int32_t c);
int32_t libcNewQurtStdioUngetc(int32_t c, void* stream);
char* libcNewQurtStdioFgets(char* s, int32_t size, void* stream);
int32_t libcNewQurtStdioFputs(const char* s, void* stream);
char* libcNewQurtStdioGets(char* s);
int32_t libcNewQurtStdioPuts(const char* s);
int32_t libcNewQurtStdioPrintf(const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioFprintf(void* stream, const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioSprintf(char* s, const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioSnprintf(char* s, uint64_t n, const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioVprintf(const char* format, char* ap);
int32_t libcNewQurtStdioVfprintf(void* stream, const char* format, char* ap);
int32_t libcNewQurtStdioVsprintf(char* s, const char* format, char* ap);
int32_t libcNewQurtStdioVsnprintf(char* s, uint64_t n, const char* format, char* ap);
int32_t libcNewQurtStdioScanf(const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioFscanf(void* stream, const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioSscanf(const char* s, const char* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t libcNewQurtStdioFseek(void* stream, int64_t offset, int32_t whence);
int64_t libcNewQurtStdioFtell(void* stream);
void libcNewQurtStdioRewind(void* stream);
int32_t libcNewQurtStdioFgetpos(void* stream, void* pos);
int32_t libcNewQurtStdioFsetpos(void* stream, void* pos);
void libcNewQurtStdioClearerr(void* stream);
int32_t libcNewQurtStdioFeof(void* stream);
int32_t libcNewQurtStdioFerror(void* stream);
void libcNewQurtStdioPerror(const char* s);
int32_t libcNewQurtStdioRemove(const char* filename);
int32_t libcNewQurtStdioRename(const char* old, const char* arg1New);
void* libcNewQurtStdioTmpfile(void);
char* libcNewQurtStdioTmpnam(char* s);
int32_t libcNewQurtStdioSetvbuf(void* stream, char* buffer, int32_t mode, uint64_t size);
void libcNewQurtStdioSetbuf(void* stream, char* buffer);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_STDIO_NEW_QURT_STDIO_WRAPPER_H */
