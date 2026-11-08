#include "stdio_wrapper.h"
#include <errno.h>
#include <stdio.h>
#include <stdarg.h>
#if defined(__APPLE__)
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#endif

void* libc_stdio_fopen(const char* filename, const char* mode) {
    return (void*)fopen(filename, mode);
}

void* libc_stdio_freopen(const char* filename, const char* mode, void* stream) {
    return (void*)freopen(filename, mode, (FILE*)stream);
}

int32_t libc_stdio_fclose(void* stream) {
    return (int32_t)fclose((FILE*)stream);
}

int32_t libc_stdio_fflush(void* stream) {
    return (int32_t)fflush((FILE*)stream);
}

uint64_t libc_stdio_fread(void* ptr, uint64_t size, uint64_t nmemb, void* stream) {
    return (uint64_t)fread(ptr, size, nmemb, (FILE*)stream);
}

uint64_t libc_stdio_fwrite(void* ptr, uint64_t size, uint64_t nmemb, void* stream) {
    return (uint64_t)fwrite(ptr, size, nmemb, (FILE*)stream);
}

int32_t libc_stdio_fgetc(void* stream) {
    return (int32_t)fgetc((FILE*)stream);
}

int32_t libc_stdio_fputc(int32_t c, void* stream) {
    return (int32_t)fputc(c, (FILE*)stream);
}

int32_t libc_stdio_getchar(void) {
    return (int32_t)getchar();
}

int32_t libc_stdio_putchar(int32_t c) {
    return (int32_t)putchar(c);
}

int32_t libc_stdio_ungetc(int32_t c, void* stream) {
    return (int32_t)ungetc(c, (FILE*)stream);
}

char* libc_stdio_fgets(char* s, int32_t size, void* stream) {
    return (char*)fgets(s, size, (FILE*)stream);
}

int32_t libc_stdio_fputs(const char* s, void* stream) {
    return (int32_t)fputs(s, (FILE*)stream);
}

char* libc_stdio_gets(char* s) {
    return (char*)gets(s);
}

int32_t libc_stdio_puts(const char* s) {
    return (int32_t)puts(s);
}

int32_t libc_stdio_vprintf(const char* format, void* ap) {
    return (int32_t)vprintf(format, *(va_list*)ap);
}

int32_t libc_stdio_vfprintf(void* stream, const char* format, void* ap) {
    return (int32_t)vfprintf((FILE*)stream, format, *(va_list*)ap);
}

int32_t libc_stdio_vsprintf(char* s, const char* format, void* ap) {
    return (int32_t)vsprintf(s, format, *(va_list*)ap);
}

int32_t libc_stdio_vsnprintf(char* s, uint64_t n, const char* format, void* ap) {
    return (int32_t)vsnprintf(s, n, format, *(va_list*)ap);
}

int32_t libc_stdio_fseek(void* stream, int64_t offset, int32_t whence) {
    return (int32_t)fseek((FILE*)stream, offset, whence);
}

int64_t libc_stdio_ftell(void* stream) {
    return (int64_t)ftell((FILE*)stream);
}

void libc_stdio_rewind(void* stream) {
    rewind((FILE*)stream);
}

int32_t libc_stdio_fgetpos(void* stream, void* pos) {
    return (int32_t)fgetpos((FILE*)stream, pos);
}

int32_t libc_stdio_fsetpos(void* stream, void* pos) {
    return (int32_t)fsetpos((FILE*)stream, pos);
}

void libc_stdio_clearerr(void* stream) {
    clearerr((FILE*)stream);
}

int32_t libc_stdio_feof(void* stream) {
    return (int32_t)feof((FILE*)stream);
}

int32_t libc_stdio_ferror(void* stream) {
    return (int32_t)ferror((FILE*)stream);
}

void libc_stdio_perror(const char* s) {
    perror(s);
}

int32_t libc_stdio_remove(const char* filename) {
    return (int32_t)remove(filename);
}

int32_t libc_stdio_rename(const char* old, const char* new) {
    return (int32_t)rename(old, new);
}

void* libc_stdio_tmpfile(void) {
    return (void*)tmpfile();
}

char* libc_stdio_tmpnam(char* s) {
    return (char*)tmpnam(s);
}

int32_t libc_stdio_setvbuf(void* stream, char* buffer, int32_t mode, uint64_t size) {
    return (int32_t)setvbuf((FILE*)stream, buffer, mode, size);
}

void libc_stdio_setbuf(void* stream, char* buffer) {
    setbuf((FILE*)stream, buffer);
}

