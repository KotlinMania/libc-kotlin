@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtOpendir(name: Long): Long

    @JvmStatic
    external fun libcNewQurtReaddir(dirp: Long): Long

    @JvmStatic
    external fun libcNewQurtClosedir(dirp: Long): Int

    @JvmStatic
    external fun libcNewQurtMkdir(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcNewQurtPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewQurtClockGetcpuclockid(pid: Int, clockId: Long): Int

    @JvmStatic
    external fun libcNewQurtSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcNewQurtSemClose(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcNewQurtAlignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libcNewQurtStrlen(s: Long): Long

    @JvmStatic
    external fun libcNewQurtStrcpy(dest: Long, src: Long): Long

    @JvmStatic
    external fun libcNewQurtStrncpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcNewQurtStrcat(dest: Long, src: Long): Long

    @JvmStatic
    external fun libcNewQurtStrncat(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcNewQurtStrcmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcNewQurtStrncmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcNewQurtStrcoll(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcNewQurtStrxfrm(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcNewQurtStrchr(s: Long, c: Int): Long

    @JvmStatic
    external fun libcNewQurtStrrchr(s: Long, c: Int): Long

    @JvmStatic
    external fun libcNewQurtStrspn(s: Long, accept: Long): Long

    @JvmStatic
    external fun libcNewQurtStrcspn(s: Long, reject: Long): Long

    @JvmStatic
    external fun libcNewQurtStrpbrk(s: Long, accept: Long): Long

    @JvmStatic
    external fun libcNewQurtStrstr(haystack: Long, needle: Long): Long

    @JvmStatic
    external fun libcNewQurtStrtok(s: Long, delim: Long): Long

    @JvmStatic
    external fun libcNewQurtStrerror(errnum: Int): Long

    @JvmStatic
    external fun libcNewQurtMemchr(s: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcNewQurtMemcmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcNewQurtMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcNewQurtMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcNewQurtMemset(s: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcNewQurtFork(): Int

    @JvmStatic
    external fun libcNewQurtExecve(filename: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcNewQurtIsalnum(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsalpha(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIscntrl(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsdigit(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsgraph(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIslower(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsprint(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIspunct(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsspace(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsupper(c: Int): Int

    @JvmStatic
    external fun libcNewQurtIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcNewQurtTolower(c: Int): Int

    @JvmStatic
    external fun libcNewQurtToupper(c: Int): Int
}

public actual fun opendir(name: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtOpendir(name.rawAddress))

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtReaddir(dirp.rawAddress))

public actual fun closedir(dirp: ConstPtr): CInt =
    NewQurtJniBridge.libcNewQurtClosedir(dirp.rawAddress)

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    NewQurtJniBridge.libcNewQurtMkdir(path.rawAddress, mode.toInt())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    NewQurtJniBridge.libcNewQurtPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    NewQurtJniBridge.libcNewQurtPthreadAttrSetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.toLong())

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr): CInt =
    NewQurtJniBridge.libcNewQurtClockGetcpuclockid(pid, clockId.rawAddress)

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun semClose(sem: MutPtr): CInt =
    NewQurtJniBridge.libcNewQurtSemClose(sem.rawAddress)

public actual fun semUnlink(name: ConstPtr): CInt =
    NewQurtJniBridge.libcNewQurtSemUnlink(name.rawAddress)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtAlignedAlloc(alignment.toLong(), size.toLong()))

public actual fun strlen(s: ConstPtr): SizeT =
    NewQurtJniBridge.libcNewQurtStrlen(s.rawAddress).toULong()

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrcpy(dest.rawAddress, src.rawAddress))

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrncpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcat(dest: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrcat(dest.rawAddress, src.rawAddress))

public actual fun strncat(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrncat(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcmp(s1: ConstPtr, s2: ConstPtr): CInt =
    NewQurtJniBridge.libcNewQurtStrcmp(s1.rawAddress, s2.rawAddress)

public actual fun strncmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    NewQurtJniBridge.libcNewQurtStrncmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun strcoll(s1: ConstPtr, s2: ConstPtr): CInt =
    NewQurtJniBridge.libcNewQurtStrcoll(s1.rawAddress, s2.rawAddress)

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    NewQurtJniBridge.libcNewQurtStrxfrm(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrchr(s.rawAddress, c))

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrrchr(s.rawAddress, c))

public actual fun strspn(s: ConstPtr, accept: ConstPtr): SizeT =
    NewQurtJniBridge.libcNewQurtStrspn(s.rawAddress, accept.rawAddress).toULong()

public actual fun strcspn(s: ConstPtr, reject: ConstPtr): SizeT =
    NewQurtJniBridge.libcNewQurtStrcspn(s.rawAddress, reject.rawAddress).toULong()

public actual fun strpbrk(s: ConstPtr, accept: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrpbrk(s.rawAddress, accept.rawAddress))

public actual fun strstr(haystack: ConstPtr, needle: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrstr(haystack.rawAddress, needle.rawAddress))

public actual fun strtok(s: MutPtr, delim: ConstPtr): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrtok(s.rawAddress, delim.rawAddress))

public actual fun strerror(errnum: CInt): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtStrerror(errnum))

public actual fun memchr(s: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtMemchr(s.rawAddress, c, n.toLong()))

public actual fun memcmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    NewQurtJniBridge.libcNewQurtMemcmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(s: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(NewQurtJniBridge.libcNewQurtMemset(s.rawAddress, c, n.toLong()))

public actual fun fork(): PidT =
    NewQurtJniBridge.libcNewQurtFork()

public actual fun execve(filename: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    NewQurtJniBridge.libcNewQurtExecve(filename.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun isalnum(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsgraph(c)

public actual fun islower(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIslower(c)

public actual fun isprint(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIspunct(c)

public actual fun isspace(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsspace(c)

public actual fun isupper(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtIsxdigit(c)

public actual fun tolower(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtTolower(c)

public actual fun toupper(c: CInt): CInt =
    NewQurtJniBridge.libcNewQurtToupper(c)
