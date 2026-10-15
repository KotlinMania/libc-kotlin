// port-lint: source Mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on JVM — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on JVM — no C library access")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir not available on JVM — no C library access")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: UInt?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetstack(attr: UInt?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on JVM — no C library access")

public actual fun clockGetcpuclockid(pid: Int, clockId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): UInt? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun semClose(sem: UInt?): Int =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun semUnlink(name: String?): Int =
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

public actual fun strcmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strncmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strcoll(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun strchr(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr not available on JVM — no C library access")

public actual fun strrchr(s: String?, c: Int): String? =
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

public actual fun strerror(errnum: Int): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun memchr(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on JVM — no C library access")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on JVM — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on JVM — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on JVM — no C library access")

public actual fun memset(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on JVM — no C library access")

public actual fun fork(): Int =
    throw UnsupportedOperationException("fork not available on JVM — no C library access")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve not available on JVM — no C library access")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on JVM — no C library access")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on JVM — no C library access")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on JVM — no C library access")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on JVM — no C library access")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on JVM — no C library access")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on JVM — no C library access")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on JVM — no C library access")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on JVM — no C library access")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on JVM — no C library access")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on JVM — no C library access")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on JVM — no C library access")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on JVM — no C library access")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on JVM — no C library access")
