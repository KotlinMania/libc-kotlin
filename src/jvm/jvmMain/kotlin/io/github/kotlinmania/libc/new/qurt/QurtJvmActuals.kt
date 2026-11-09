@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewQurtJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_opendir(name: String?): Long

    @JvmStatic
    external fun libc_new_qurt_readdir(dirp: Long): Long

    @JvmStatic
    external fun libc_new_qurt_closedir(dirp: Long): Int

    @JvmStatic
    external fun libc_new_qurt_mkdir(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_new_qurt_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_qurt_clockGetcpuclockid(pid: Int, clockId: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_new_qurt_alignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libc_new_qurt_strlen(s: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strcpy(dest: Long, src: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strncpy(dest: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_strcat(dest: Long, src: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strncat(dest: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_strcmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_new_qurt_strncmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_new_qurt_strcoll(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_new_qurt_strxfrm(dest: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_strchr(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_new_qurt_strrchr(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_new_qurt_strspn(s: String?, accept: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strcspn(s: String?, reject: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strpbrk(s: String?, accept: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strstr(haystack: String?, needle: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strtok(s: Long, delim: String?): Long

    @JvmStatic
    external fun libc_new_qurt_strerror(errnum: Int): Long

    @JvmStatic
    external fun libc_new_qurt_memchr(s: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_memcmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libc_new_qurt_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_memset(s: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_new_qurt_fork(): Int

    @JvmStatic
    external fun libc_new_qurt_execve(filename: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_new_qurt_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_islower(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isprint(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isspace(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isupper(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_tolower(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_toupper(c: Int): Int
}

public actual fun opendir(name: String?): DIR? =
    NewQurtJniBridge.libc_new_qurt_opendir(name).let { if (it == 0L) null else DIR(it) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_readdir((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun closedir(dirp: DIR?): CInt =
    NewQurtJniBridge.libc_new_qurt_closedir((dirp?.handle ?: 0L))

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    NewQurtJniBridge.libc_new_qurt_mkdir(path, mode.toInt())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    NewQurtJniBridge.libc_new_qurt_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    NewQurtJniBridge.libc_new_qurt_pthreadAttrSetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), stacksize.toLong())

public actual fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt =
    NewQurtJniBridge.libc_new_qurt_clockGetcpuclockid(pid, (clockId?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semClose(sem: COpaquePointer?): CInt =
    NewQurtJniBridge.libc_new_qurt_semClose((sem?.value ?: 0L))

public actual fun semUnlink(name: String?): CInt =
    NewQurtJniBridge.libc_new_qurt_semUnlink(name)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_alignedAlloc(alignment.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(s: String?): SizeT =
    NewQurtJniBridge.libc_new_qurt_strlen(s).toULong()

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strcpy((dest?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strncpy((dest?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strcat((dest?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strncat((dest?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(s1: String?, s2: String?): CInt =
    NewQurtJniBridge.libc_new_qurt_strcmp(s1, s2)

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    NewQurtJniBridge.libc_new_qurt_strncmp(s1, s2, n.toLong())

public actual fun strcoll(s1: String?, s2: String?): CInt =
    NewQurtJniBridge.libc_new_qurt_strcoll(s1, s2)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    NewQurtJniBridge.libc_new_qurt_strxfrm((dest?.value ?: 0L), src, n.toLong()).toULong()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strrchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(s: String?, accept: String?): SizeT =
    NewQurtJniBridge.libc_new_qurt_strspn(s, accept).toULong()

public actual fun strcspn(s: String?, reject: String?): SizeT =
    NewQurtJniBridge.libc_new_qurt_strcspn(s, reject).toULong()

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strpbrk(s, accept).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strstr(haystack, needle).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strtok((s?.value ?: 0L), delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerror(errnum: CInt): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_strerror(errnum).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_memchr((s?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    NewQurtJniBridge.libc_new_qurt_memcmp((s1?.value ?: 0L), (s2?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    NewQurtJniBridge.libc_new_qurt_memset((s?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fork(): PidT =
    NewQurtJniBridge.libc_new_qurt_fork()

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NewQurtJniBridge.libc_new_qurt_execve(filename, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun isalnum(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isgraph(c)

public actual fun islower(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_islower(c)

public actual fun isprint(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isspace(c)

public actual fun isupper(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_isxdigit(c)

public actual fun tolower(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_tolower(c)

public actual fun toupper(c: CInt): CInt =
    NewQurtJniBridge.libc_new_qurt_toupper(c)
