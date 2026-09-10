// port-lint: source Mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on JVM — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on JVM — no C library access")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir not available on JVM — no C library access")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on JVM — no C library access")

public actual fun clockGetcpuclockid(pid: PidT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on JVM — no C library access")

public actual fun strlen(s: String?): ULong =
    throw UnsupportedOperationException("strlen not available on JVM — no C library access")

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on JVM — no C library access")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on JVM — no C library access")

public actual fun strcat(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcat not available on JVM — no C library access")

public actual fun strncat(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on JVM — no C library access")

public actual fun strcmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strncmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strcoll(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun strchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on JVM — no C library access")

public actual fun strrchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on JVM — no C library access")

public actual fun strspn(s: String?, accept: String?): ULong =
    throw UnsupportedOperationException("strspn not available on JVM — no C library access")

public actual fun strcspn(s: String?, reject: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on JVM — no C library access")

public actual fun strpbrk(s: String?, accept: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on JVM — no C library access")

public actual fun strstr(haystack: String?, needle: String?): String? =
    throw UnsupportedOperationException("strstr not available on JVM — no C library access")

public actual fun strtok(s: String?, delim: String?): String? =
    throw UnsupportedOperationException("strtok not available on JVM — no C library access")

public actual fun strerror(errnum: CInt): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on JVM — no C library access")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on JVM — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on JVM — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on JVM — no C library access")

public actual fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on JVM — no C library access")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork not available on JVM — no C library access")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve not available on JVM — no C library access")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on JVM — no C library access")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on JVM — no C library access")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on JVM — no C library access")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on JVM — no C library access")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on JVM — no C library access")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on JVM — no C library access")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on JVM — no C library access")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on JVM — no C library access")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on JVM — no C library access")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on JVM — no C library access")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on JVM — no C library access")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on JVM — no C library access")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on JVM — no C library access")

