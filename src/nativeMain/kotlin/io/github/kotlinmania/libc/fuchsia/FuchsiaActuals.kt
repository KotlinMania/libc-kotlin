@file:OptIn(ExperimentalForeignApi::class)
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*
import libc.*

// FFI actuals for fuchsia/Mod.kt — delegating to real C library via cinterop

public actual fun isalnum(c: CInt): CInt = isalnum(c)
public actual fun isalpha(c: CInt): CInt = isalpha(c)
public actual fun iscntrl(c: CInt): CInt = iscntrl(c)
public actual fun isdigit(c: CInt): CInt = isdigit(c)
public actual fun isgraph(c: CInt): CInt = isgraph(c)
public actual fun islower(c: CInt): CInt = islower(c)
public actual fun isprint(c: CInt): CInt = isprint(c)
public actual fun ispunct(c: CInt): CInt = ispunct(c)
public actual fun isspace(c: CInt): CInt = isspace(c)
public actual fun isupper(c: CInt): CInt = isupper(c)
public actual fun isxdigit(c: CInt): CInt = isxdigit(c)
public actual fun isblank(c: CInt): CInt = isblank(c)
public actual fun tolower(c: CInt): CInt = tolower(c)
public actual fun toupper(c: CInt): CInt = toupper(c)
// stdio.h functions
public actual fun fopen(filename: String?, mode: String?): FILE? = fopen(filename, mode)
public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? = freopen(filename, mode, file)
public actual fun fflush(file: FILE?): CInt = fflush(file)
public actual fun fclose(file: FILE?): CInt = fclose(file)
public actual fun remove(filename: String?): CInt = remove(filename)
public actual fun rename(oldname: String?, newname: String?): CInt = rename(oldname, newname)
public actual fun tmpfile(): FILE? = tmpfile()
public actual fun getchar(): CInt = getchar()
public actual fun putchar(c: CInt): CInt = putchar(c)
public actual fun fgetc(stream: FILE?): CInt = fgetc(stream)
public actual fun fputc(c: CInt, stream: FILE?): CInt = fputc(c, stream)
public actual fun ungetc(c: CInt, stream: FILE?): CInt = ungetc(c, stream)
public actual fun feof(stream: FILE?): CInt = feof(stream)
public actual fun ferror(stream: FILE?): CInt = ferror(stream)

// stdlib.h — memory allocation
public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? = calloc(nobj, size)
public actual fun malloc(size: ULong): COpaquePointer? = malloc(size)
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? = realloc(p, size)
public actual fun free(p: COpaquePointer?) { if (p != null) free(p) }
public actual fun system(s: String?): CInt = system(s)
public actual fun getenv(s: String?): String? = getenv(s)

// string.h — string operations
public actual fun strcmp(cs: String?, ct: String?): CInt = strcmp(cs, ct)
public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt = strncmp(cs, ct, n)
public actual fun strcoll(cs: String?, ct: String?): CInt = strcoll(cs, ct)
public actual fun strspn(cs: String?, ct: String?): ULong = strspn(cs, ct)
public actual fun strcspn(cs: String?, ct: String?): ULong = strcspn(cs, ct)
public actual fun strlen(cs: String?): ULong = strlen(cs)
public actual fun strnlen(cs: String?, maxlen: ULong): ULong = strnlen(cs, maxlen)
public actual fun strerror(n: CInt): String? = strerror(n)
public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong = strxfrm(s, ct, n)

// mem* functions
public actual fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = memchr(s, c, n)
public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt = memcmp(s1, s2, n)
public actual fun memcpy(dst: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = memcpy(dst, src, n)
public actual fun memmove(dst: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = memmove(dst, src, n)
public actual fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = memset(s, c, n)
