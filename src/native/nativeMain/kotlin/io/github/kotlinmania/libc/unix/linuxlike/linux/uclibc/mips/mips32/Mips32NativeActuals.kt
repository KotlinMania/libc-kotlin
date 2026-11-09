@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun glob64(pattern: String?, flags: CInt, errfunc: FnCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())
