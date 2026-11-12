@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())
