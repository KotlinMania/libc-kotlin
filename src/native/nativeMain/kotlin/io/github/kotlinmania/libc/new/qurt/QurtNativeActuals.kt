@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.CChar
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcNewQurtOpendir(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcNewQurtReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: ConstPtr<DIR>): CInt =
    libcNewQurtClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcNewQurtMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcNewQurtPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    libcNewQurtPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr<ClockidT>): CInt =
    libcNewQurtClockGetcpuclockid(pid, clockId.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcNewQurtSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcNewQurtSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcNewQurtSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun strlen(s: ConstPtr<CChar>): SizeT =
    libcNewQurtStrlen(s.rawAddress.toCPointer<ByteVar>())

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStrcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcNewQurtStrncpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStrcat(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcNewQurtStrncat(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    libcNewQurtStrcmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    libcNewQurtStrncmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    libcNewQurtStrcoll(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    libcNewQurtStrxfrm(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcNewQurtStrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcNewQurtStrrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): SizeT =
    libcNewQurtStrspn(s.rawAddress.toCPointer<ByteVar>(), accept.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(s: ConstPtr<CChar>, reject: ConstPtr<CChar>): SizeT =
    libcNewQurtStrcspn(s.rawAddress.toCPointer<ByteVar>(), reject.rawAddress.toCPointer<ByteVar>())

public actual fun strpbrk(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStrpbrk(s.rawAddress.toCPointer<ByteVar>(), accept.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(haystack: ConstPtr<CChar>, needle: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStrstr(haystack.rawAddress.toCPointer<ByteVar>(), needle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStrtok(s.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strerror(errnum: CInt): MutPtr<CChar> =
    MutPtr(libcNewQurtStrerror(errnum)?.toLong() ?: 0L)

public actual fun memchr(s: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtMemchr(s.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(s1: ConstPtr<CVoid>, s2: ConstPtr<CVoid>, n: SizeT): CInt =
    libcNewQurtMemcmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(s: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtMemset(s.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun fork(): PidT =
    libcNewQurtFork()

public actual fun execve(filename: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
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
