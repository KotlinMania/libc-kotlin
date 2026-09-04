// port-lint: source Mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun strlen(s: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun strchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strrchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strspn(s: String?, accept: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(s: String?, reject: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strpbrk(s: String?, accept: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strstr(haystack: String?, needle: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strtok(s: String?, delim: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strerror(errnum: CInt): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork requires N-API addon")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires N-API addon")

