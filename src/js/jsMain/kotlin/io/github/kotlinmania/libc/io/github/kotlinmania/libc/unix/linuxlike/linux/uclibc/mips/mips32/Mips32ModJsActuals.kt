package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree64(pglob: Glob64T?) {
    js("require('@kotlinmania/libc-native-bindings').globfree64(pglob?.toLong() ?: 0L)")
}

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt
