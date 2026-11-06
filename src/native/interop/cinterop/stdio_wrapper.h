#ifndef LIBC_STDIO_STDIO_WRAPPER_H
#define LIBC_STDIO_STDIO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_stdio_fopen(const char* filename, const char* mode);
void* libc_stdio_freopen(const char* filename, const char* mode, void* stream);
int32_t libc_stdio_fclose(void* stream);
int32_t libc_stdio_fflush(void* stream);
uint64_t libc_stdio_fread(void* ptr, uint64_t size, uint64_t nmemb, void* stream);
uint64_t libc_stdio_fwrite(void* ptr, uint64_t size, uint64_t nmemb, void* stream);
int32_t libc_stdio_fgetc(void* stream);
int32_t libc_stdio_fputc(int32_t c, void* stream);
int32_t libc_stdio_getchar(void);
int32_t libc_stdio_putchar(int32_t c);
int32_t libc_stdio_ungetc(int32_t c, void* stream);
char* libc_stdio_fgets(char* s, int32_t size, void* stream);
int32_t libc_stdio_fputs(const char* s, void* stream);
char* libc_stdio_gets(char* s);
int32_t libc_stdio_puts(const char* s);
int32_t libc_stdio_vprintf(const char* format, void* ap);
int32_t libc_stdio_vfprintf(void* stream, const char* format, void* ap);
int32_t libc_stdio_vsprintf(char* s, const char* format, void* ap);
int32_t libc_stdio_vsnprintf(char* s, uint64_t n, const char* format, void* ap);
int32_t libc_stdio_fseek(void* stream, int64_t offset, int32_t whence);
int64_t libc_stdio_ftell(void* stream);
void libc_stdio_rewind(void* stream);
int32_t libc_stdio_fgetpos(void* stream, void* pos);
int32_t libc_stdio_fsetpos(void* stream, void* pos);
void libc_stdio_clearerr(void* stream);
int32_t libc_stdio_feof(void* stream);
int32_t libc_stdio_ferror(void* stream);
void libc_stdio_perror(const char* s);
int32_t libc_stdio_remove(const char* filename);
int32_t libc_stdio_rename(const char* old, const char* new);
void* libc_stdio_tmpfile(void);
char* libc_stdio_tmpnam(char* s);
int32_t libc_stdio_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size);
void libc_stdio_setbuf(void* stream, char* buffer);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_STDIO_STDIO_WRAPPER_H */
