@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun opendir(name: String?): DIR? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_opendir(name)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): Dirent? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_mkdir(path, mode)

public actual fun pthreadAttrGetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_pthread_attr_setstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun clockGetcpuclockid(pid: PidT, clockId: CInt?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_clock_getcpuclockid(pid, clockId?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: CUint?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_sem_unlink(name)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(s: String?): SizeT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strlen(s)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strcpy(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strncpy(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strcat(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strncat(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strcmp(s1, s2)

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strncmp(s1, s2, n)

public actual fun strcoll(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strcoll(s1, s2)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strxfrm(dest?.value?.toCPointer<ByteVar>(), src, n)

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strrchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(s: String?, accept: String?): SizeT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strspn(s, accept)

public actual fun strcspn(s: String?, reject: String?): SizeT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strcspn(s, reject)

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strpbrk(s, accept)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strstr(haystack, needle)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strtok(s?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun strerror(errnum: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_strerror(errnum)?.let { COpaquePointer(it.toLong()) }

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_memchr(s?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_memcmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_memset(s?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun fork(): PidT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_fork()

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_execve(filename, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_isxdigit(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_qurt_mod_toupper(c)
