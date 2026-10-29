package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun pthreadAttrGetstack(attr: UInt?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadAttrSetstack(attr: UInt?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun clockGetcpuclockid(pid: Int, clockId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): UInt? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semClose(sem: UInt?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun strlen(s: String?): ULong =
    strlenNapi(s)

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(s1: String?, s2: String?): Int =
    strcmpNapi(s1, s2)

public actual fun strncmp(s1: String?, s2: String?, n: ULong): Int =
    strncmpNapi(s1, s2, n)

public actual fun strcoll(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun strchr(s: String?, c: Int): String? =
    if (s == null) {
        null
    } else {
        val idx = s.indexOf(c.toChar())
        if (idx >= 0) s.substring(idx) else null
    }

public actual fun strrchr(s: String?, c: Int): String? =
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

public actual fun strerror(errnum: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun memchr(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): Int =
    LibcNative.memcmp(s1?.value, s2?.value, n.toInt())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memcpy(dest?.value, src?.value, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memset(s?.value, c, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun fork(): Int =
    throw UnsupportedOperationException("fork requires N-API addon")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")
