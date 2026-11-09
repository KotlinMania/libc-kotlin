@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.CInt

public actual fun opendir(name: String?): DIR? =
    null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    null

public actual fun closedir(dirp: DIR?): CInt =
    0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun strlen(s: String?): SizeT =
    0uL

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcmp(s1: String?, s2: String?): CInt =
    0

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    0

public actual fun strcoll(s1: String?, s2: String?): CInt =
    0

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    0uL

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun strspn(s: String?, accept: String?): SizeT =
    0uL

public actual fun strcspn(s: String?, reject: String?): SizeT =
    0uL

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    null

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    null

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    null

public actual fun strerror(errnum: CInt): COpaquePointer? =
    null

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun fork(): PidT =
    0

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    0

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun iscntrl(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun isgraph(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun ispunct(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun isupper(c: CInt): CInt =
    0

public actual fun isxdigit(c: CInt): CInt =
    0

public actual fun tolower(c: CInt): CInt =
    0

public actual fun toupper(c: CInt): CInt =
    0
