package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.COpaquePointer

internal object Mips32ModRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree64(pglob: Long)
    external fun pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    Mips32ModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    Mips32ModRawLibc.glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree64(pglob: Glob64T?) {
    Mips32ModRawLibc.globfree64(pglob?.toLong() ?: 0L)
}

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    Mips32ModRawLibc.pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    Mips32ModRawLibc.pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)
