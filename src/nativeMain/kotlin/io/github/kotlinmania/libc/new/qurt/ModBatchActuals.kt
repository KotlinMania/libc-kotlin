// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.CPointer
import libc.cinterop.libc_fork
import libc.cinterop.libc_iscntrl
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strncpy
import libc.cinterop.libc_aligned_alloc
import libc.cinterop.libc_strxfrm
import libc.cinterop.libc_isupper
import libc.cinterop.libc_sem_close
import libc.cinterop.libc_memchr
import libc.cinterop.libc_strcspn
import libc.cinterop.libc_strspn
import libc.cinterop.libc_memmove
import libc.cinterop.libc_strncat
import libc.cinterop.libc_tolower
import libc.cinterop.libc_isprint
import libc.cinterop.libc_isdigit
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_toupper
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_isalnum
import libc.cinterop.libc_isalpha
import libc.cinterop.libc_strcat
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_isgraph
import libc.cinterop.libc_islower
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_strerror
import libc.cinterop.libc_isspace
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_memset
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_execve
import libc.cinterop.libc_ispunct
import libc.cinterop.libc_isxdigit
import libc.cinterop.libc_memcmp
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strrchr

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires manual FFI bridge — type mismatch")
public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkdir(path, mode.toInt())
public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun clockGetcpuclockid(pid: PidT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    libc.cinterop.libc_sem_close(sem?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires FFI bridge")

public actual fun strlen(s: String?): ULong =
    libc.cinterop.libc_strlen(s)
public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires FFI bridge")
public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires FFI bridge")
public actual fun strcat(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcat requires FFI bridge")
public actual fun strncat(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires FFI bridge")
public actual fun strcmp(s1: String?, s2: String?): CInt =
    libc.cinterop.libc_strcmp(s1, s2)
public actual fun strncmp(s1: String?, s2: String?, n: ULong): CInt =
    libc.cinterop.libc_strncmp(s1, s2, n)
public actual fun strcoll(s1: String?, s2: String?): CInt =
    libc.cinterop.libc_strcoll(s1, s2)
public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    libc.cinterop.libc_strxfrm(dest, src, n)
public actual fun strchr(s: String?, c: CInt): String? {
    val result = libc_strchr(s, c)
    return result?.toKString()
}
public actual fun strrchr(s: String?, c: CInt): String? {
    val result = libc_strrchr(s, c)
    return result?.toKString()
}
public actual fun strspn(s: String?, accept: String?): ULong =
    libc.cinterop.libc_strspn(s, accept)
public actual fun strcspn(s: String?, reject: String?): ULong =
    libc.cinterop.libc_strcspn(s, reject)
public actual fun strpbrk(s: String?, accept: String?): String? =
    throw UnsupportedOperationException("strpbrk requires FFI bridge")
public actual fun strstr(haystack: String?, needle: String?): String? =
    throw UnsupportedOperationException("strstr requires FFI bridge")
public actual fun strtok(s: String?, delim: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strerror(errnum: CInt): String? =
    throw UnsupportedOperationException("strerror requires FFI bridge")
public actual fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires FFI bridge")
public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires FFI bridge")
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memcpy(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memmove(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires FFI bridge")
public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork requires FFI bridge")
public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc.cinterop.libc_execve(filename, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), envp?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun isalnum(c: CInt): CInt = libc.cinterop.libc_isalnum(c)
public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun iscntrl(c: CInt): CInt = libc.cinterop.libc_iscntrl(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun isgraph(c: CInt): CInt = libc.cinterop.libc_isgraph(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun ispunct(c: CInt): CInt = libc.cinterop.libc_ispunct(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun isupper(c: CInt): CInt = libc.cinterop.libc_isupper(c)
public actual fun isxdigit(c: CInt): CInt = libc.cinterop.libc_isxdigit(c)
public actual fun tolower(c: CInt): CInt = libc.cinterop.libc_tolower(c)
public actual fun toupper(c: CInt): CInt = libc.cinterop.libc_toupper(c)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires FFI bridge")
