package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object QurtModRawLibc {
    external fun opendir(name: String?): Long?
    external fun readdir(dirp: Long): Long?
    external fun closedir(dirp: Long): Int
    external fun mkdir(path: String?, mode: Int): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun clockGetcpuclockid(pid: Int, clockId: Long): Int
    external fun semClose(sem: Long): Int
    external fun semUnlink(name: String?): Int
    external fun alignedAlloc(alignment: Long, size: Long): Long?
    external fun strlen(s: String?): Long
    external fun strcpy(dest: Long, src: String?): Long?
    external fun strncpy(dest: Long, src: String?, n: Long): Long?
    external fun strcat(dest: Long, src: String?): Long?
    external fun strncat(dest: Long, src: String?, n: Long): Long?
    external fun strcmp(s1: String?, s2: String?): Int
    external fun strncmp(s1: String?, s2: String?, n: Long): Int
    external fun strcoll(s1: String?, s2: String?): Int
    external fun strxfrm(dest: Long, src: String?, n: Long): Long
    external fun strchr(s: String?, c: Int): Long?
    external fun strrchr(s: String?, c: Int): Long?
    external fun strspn(s: String?, accept: String?): Long
    external fun strcspn(s: String?, reject: String?): Long
    external fun strpbrk(s: String?, accept: String?): Long?
    external fun strstr(haystack: String?, needle: String?): Long?
    external fun strtok(s: Long, delim: String?): Long?
    external fun strerror(errnum: Int): Long?
    external fun memchr(s: Long, c: Int, n: Long): Long?
    external fun memcmp(s1: Long, s2: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(s: Long, c: Int, n: Long): Long?
    external fun fork(): Int
    external fun execve(filename: String?, argv: Long, envp: Long): Int
    external fun isalnum(c: Int): Int
    external fun isalpha(c: Int): Int
    external fun iscntrl(c: Int): Int
    external fun isdigit(c: Int): Int
    external fun isgraph(c: Int): Int
    external fun islower(c: Int): Int
    external fun isprint(c: Int): Int
    external fun ispunct(c: Int): Int
    external fun isspace(c: Int): Int
    external fun isupper(c: Int): Int
    external fun isxdigit(c: Int): Int
    external fun tolower(c: Int): Int
    external fun toupper(c: Int): Int
}

public actual fun opendir(name: String?): DIR? =
    QurtModRawLibc.opendir(name)

public actual fun readdir(dirp: DIR?): Dirent? =
    QurtModRawLibc.readdir(dirp?.toLong() ?: 0L)

public actual fun closedir(dirp: DIR?): CInt =
    QurtModRawLibc.closedir(dirp?.toLong() ?: 0L)

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    QurtModRawLibc.mkdir(path, mode)

public actual fun pthreadAttrGetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    QurtModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    QurtModRawLibc.pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)

public actual fun clockGetcpuclockid(pid: PidT, clockId: CInt?): CInt =
    QurtModRawLibc.clockGetcpuclockid(pid, clockId?.toLong() ?: 0L)

public actual fun semClose(sem: CUint?): CInt =
    QurtModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun semUnlink(name: String?): CInt =
    QurtModRawLibc.semUnlink(name)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    QurtModRawLibc.alignedAlloc(alignment, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(s: String?): SizeT =
    QurtModRawLibc.strlen(s)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    QurtModRawLibc.strcpy(dest?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    QurtModRawLibc.strncpy(dest?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    QurtModRawLibc.strcat(dest?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    QurtModRawLibc.strncat(dest?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(s1: String?, s2: String?): CInt =
    QurtModRawLibc.strcmp(s1, s2)

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    QurtModRawLibc.strncmp(s1, s2, n)

public actual fun strcoll(s1: String?, s2: String?): CInt =
    QurtModRawLibc.strcoll(s1, s2)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    QurtModRawLibc.strxfrm(dest?.value ?: 0L, src, n)

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    QurtModRawLibc.strchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    QurtModRawLibc.strrchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(s: String?, accept: String?): SizeT =
    QurtModRawLibc.strspn(s, accept)

public actual fun strcspn(s: String?, reject: String?): SizeT =
    QurtModRawLibc.strcspn(s, reject)

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    QurtModRawLibc.strpbrk(s, accept).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    QurtModRawLibc.strstr(haystack, needle).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    QurtModRawLibc.strtok(s?.value ?: 0L, delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerror(errnum: CInt): COpaquePointer? =
    QurtModRawLibc.strerror(errnum).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    QurtModRawLibc.memchr(s?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    QurtModRawLibc.memcmp(s1?.value ?: 0L, s2?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    QurtModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    QurtModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    QurtModRawLibc.memset(s?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fork(): PidT =
    QurtModRawLibc.fork()

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    QurtModRawLibc.execve(filename, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun isalnum(c: CInt): CInt =
    QurtModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    QurtModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    QurtModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    QurtModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    QurtModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    QurtModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    QurtModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    QurtModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    QurtModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    QurtModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    QurtModRawLibc.isxdigit(c)

public actual fun tolower(c: CInt): CInt =
    QurtModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    QurtModRawLibc.toupper(c)
