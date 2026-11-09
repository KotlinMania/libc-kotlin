@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

private object UnixLinuxlikeLinuxUclibcMipsMips32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64(pglob: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
}

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl((name?.value ?: 0L), namelen, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree64(pglob: COpaquePointer?) {
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64((pglob?.value ?: 0L))
}

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcMipsMips32JniBridge.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))
