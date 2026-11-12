@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtAlignedAlloc
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtClockGetcpuclockid
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtClosedir
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtExecve
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtFork
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsalnum
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsalpha
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIscntrl
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsdigit
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsgraph
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIslower
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsprint
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIspunct
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsspace
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsupper
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtIsxdigit
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMemchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMemcmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMemcpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMemmove
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMemset
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtMkdir
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtOpendir
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtPthreadAttrGetstack
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtPthreadAttrSetstack
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtReaddir
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtSemClose
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtSemOpen
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtSemUnlink
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrcat
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrcmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrcoll
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrcpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrcspn
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrerror
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrlen
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrncat
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrncmp
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrncpy
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrpbrk
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrrchr
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrspn
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrstr
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrtok
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtStrxfrm
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtTolower
import io.github.kotlinmania.libc.new.qurt.cinterop.libcNewQurtToupper
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun opendir(name: ConstPtr): MutPtr =
    MutPtr(libcNewQurtOpendir(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(libcNewQurtReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: ConstPtr): CInt =
    libcNewQurtClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    libcNewQurtMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcNewQurtPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    libcNewQurtPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr): CInt =
    libcNewQurtClockGetcpuclockid(pid, clockId.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcNewQurtSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semClose(sem: MutPtr): CInt =
    libcNewQurtSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr): CInt =
    libcNewQurtSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(libcNewQurtAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun strlen(s: ConstPtr): SizeT =
    libcNewQurtStrlen(s.rawAddress.toCPointer<ByteVar>())

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcNewQurtStrcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcNewQurtStrncpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(dest: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcNewQurtStrcat(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcNewQurtStrncat(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcNewQurtStrcmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcNewQurtStrncmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(s1: ConstPtr, s2: ConstPtr): CInt =
    libcNewQurtStrcoll(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    libcNewQurtStrxfrm(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcNewQurtStrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcNewQurtStrrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(s: ConstPtr, accept: ConstPtr): SizeT =
    libcNewQurtStrspn(s.rawAddress.toCPointer<ByteVar>(), accept.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(s: ConstPtr, reject: ConstPtr): SizeT =
    libcNewQurtStrcspn(s.rawAddress.toCPointer<ByteVar>(), reject.rawAddress.toCPointer<ByteVar>())

public actual fun strpbrk(s: ConstPtr, accept: ConstPtr): MutPtr =
    MutPtr(libcNewQurtStrpbrk(s.rawAddress.toCPointer<ByteVar>(), accept.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(haystack: ConstPtr, needle: ConstPtr): MutPtr =
    MutPtr(libcNewQurtStrstr(haystack.rawAddress.toCPointer<ByteVar>(), needle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr, delim: ConstPtr): MutPtr =
    MutPtr(libcNewQurtStrtok(s.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strerror(errnum: CInt): MutPtr =
    MutPtr(libcNewQurtStrerror(errnum)?.toLong() ?: 0L)

public actual fun memchr(s: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcNewQurtMemchr(s.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcNewQurtMemcmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcNewQurtMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcNewQurtMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(s: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcNewQurtMemset(s.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun fork(): PidT =
    libcNewQurtFork()

public actual fun execve(filename: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcNewQurtExecve(filename.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun isalnum(c: CInt): CInt =
    libcNewQurtIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcNewQurtIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcNewQurtIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcNewQurtIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcNewQurtIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcNewQurtIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcNewQurtIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcNewQurtIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcNewQurtIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcNewQurtIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcNewQurtIsxdigit(c)

public actual fun tolower(c: CInt): CInt =
    libcNewQurtTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcNewQurtToupper(c)
