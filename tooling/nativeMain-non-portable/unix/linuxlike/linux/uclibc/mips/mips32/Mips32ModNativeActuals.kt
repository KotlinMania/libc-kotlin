@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_mips32_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_mips32_mod_glob64(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: Glob64T?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_mips32_mod_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_mips32_mod_pthread_attr_getaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32.cinterop.libc_mips32_mod_pthread_attr_setaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())
