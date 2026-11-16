@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr) {
    libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())
