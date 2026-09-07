// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 not available on JVM — no C library access")
}

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on JVM — no C library access")


public actual fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt =
    throw UnsupportedOperationException("glob64 not available on JVM — no C library access")
