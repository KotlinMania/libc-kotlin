@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxUclibcMipsMips32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
}

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name.rawAddress, namelen, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree64(pglob: MutPtr) {
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob.rawAddress)
}

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)
