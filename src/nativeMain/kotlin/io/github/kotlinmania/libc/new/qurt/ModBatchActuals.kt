// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun clockGetcpuclockid(pid: PidT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires manual FFI bridge — not yet implemented")

public actual fun strlen(s: String?): ULong =
    throw UnsupportedOperationException("strlen requires manual FFI bridge — not yet implemented")

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — not yet implemented")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — not yet implemented")

public actual fun strcat(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — not yet implemented")

public actual fun strncat(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — not yet implemented")

public actual fun strcmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcmp requires manual FFI bridge — not yet implemented")

public actual fun strncmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires manual FFI bridge — not yet implemented")

public actual fun strcoll(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcoll requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires manual FFI bridge — not yet implemented")

public actual fun strchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — not yet implemented")

public actual fun strrchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — not yet implemented")

public actual fun strspn(s: String?, accept: String?): ULong =
    throw UnsupportedOperationException("strspn requires manual FFI bridge — not yet implemented")

public actual fun strcspn(s: String?, reject: String?): ULong =
    throw UnsupportedOperationException("strcspn requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(s: String?, accept: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — not yet implemented")

public actual fun strstr(haystack: String?, needle: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — not yet implemented")

public actual fun strtok(s: String?, delim: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strerror(errnum: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — not yet implemented")

public actual fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt =
    platform.posix.memcmp(s1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), s2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — not yet implemented")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — not yet implemented")

public actual fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — not yet implemented")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork requires manual FFI bridge — not yet implemented")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires manual FFI bridge — not yet implemented")

public actual fun isalnum(c: CInt): CInt = platform.posix.isalnum(c)
public actual fun isalpha(c: CInt): CInt = platform.posix.isalpha(c)
public actual fun iscntrl(c: CInt): CInt = platform.posix.iscntrl(c)
public actual fun isdigit(c: CInt): CInt = platform.posix.isdigit(c)
public actual fun isgraph(c: CInt): CInt = platform.posix.isgraph(c)
public actual fun islower(c: CInt): CInt = platform.posix.islower(c)
public actual fun isprint(c: CInt): CInt = platform.posix.isprint(c)
public actual fun ispunct(c: CInt): CInt = platform.posix.ispunct(c)
public actual fun isspace(c: CInt): CInt = platform.posix.isspace(c)
public actual fun isupper(c: CInt): CInt = platform.posix.isupper(c)
public actual fun isxdigit(c: CInt): CInt = platform.posix.isxdigit(c)
public actual fun tolower(c: CInt): CInt = platform.posix.tolower(c)
public actual fun toupper(c: CInt): CInt = platform.posix.toupper(c)
