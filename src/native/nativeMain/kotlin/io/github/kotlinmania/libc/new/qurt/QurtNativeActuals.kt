@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_alignedAlloc
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_clockGetcpuclockid
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_closedir
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_execve
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_fork
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isalnum
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isalpha
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_iscntrl
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isdigit
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isgraph
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_islower
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isprint
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_ispunct
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isspace
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isupper
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_isxdigit
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_memchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_memcmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_memcpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_memmove
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_memset
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_mkdir
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_opendir
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_pthreadAttrGetstack
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_pthreadAttrSetstack
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_readdir
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_semClose
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_semOpen
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_semUnlink
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strcat
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strcmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strcoll
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strcpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strcspn
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strerror
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strlen
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strncat
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strncmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strncpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strpbrk
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strrchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strspn
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strstr
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strtok
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_strxfrm
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_tolower
import io.github.kotlinmania.libc.new.qurt.cinterop.libc_new_qurt_toupper
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun opendir(name: String?): DIR? =
    libc_new_qurt_opendir(name)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    libc_new_qurt_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    libc_new_qurt_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc_new_qurt_mkdir(path, mode)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_new_qurt_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    libc_new_qurt_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt =
    libc_new_qurt_clockGetcpuclockid(pid, clockId?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_new_qurt_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_new_qurt_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    libc_new_qurt_semUnlink(name)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    libc_new_qurt_alignedAlloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(s: String?): SizeT =
    libc_new_qurt_strlen(s)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    libc_new_qurt_strcpy(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_new_qurt_strncpy(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    libc_new_qurt_strcat(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_new_qurt_strncat(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(s1: String?, s2: String?): CInt =
    libc_new_qurt_strcmp(s1, s2)

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    libc_new_qurt_strncmp(s1, s2, n)

public actual fun strcoll(s1: String?, s2: String?): CInt =
    libc_new_qurt_strcoll(s1, s2)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    libc_new_qurt_strxfrm(dest?.value?.toCPointer<ByteVar>(), src, n)

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    libc_new_qurt_strchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    libc_new_qurt_strrchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(s: String?, accept: String?): SizeT =
    libc_new_qurt_strspn(s, accept)

public actual fun strcspn(s: String?, reject: String?): SizeT =
    libc_new_qurt_strcspn(s, reject)

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    libc_new_qurt_strpbrk(s, accept)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    libc_new_qurt_strstr(haystack, needle)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    libc_new_qurt_strtok(s?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun strerror(errnum: CInt): COpaquePointer? =
    libc_new_qurt_strerror(errnum)?.let { COpaquePointer(it.toLong()) }

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_new_qurt_memchr(s?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    libc_new_qurt_memcmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_new_qurt_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_new_qurt_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_new_qurt_memset(s?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun fork(): PidT =
    libc_new_qurt_fork()

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_new_qurt_execve(filename, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun isalnum(c: CInt): CInt =
    libc_new_qurt_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_new_qurt_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_new_qurt_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_new_qurt_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_new_qurt_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_new_qurt_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_new_qurt_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_new_qurt_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_new_qurt_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_new_qurt_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_new_qurt_isxdigit(c)

public actual fun tolower(c: CInt): CInt =
    libc_new_qurt_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_new_qurt_toupper(c)
