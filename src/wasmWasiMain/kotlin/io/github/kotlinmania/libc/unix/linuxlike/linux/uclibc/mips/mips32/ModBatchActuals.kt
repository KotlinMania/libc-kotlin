// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")

public actual fun globfree64(pglob: Glob64T?): Unit = throw UnsupportedOperationException("globfree64 not available on WASI — no C library access")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on WASI — no C library access")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on WASI — no C library access")

public actual fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int =
    throw UnsupportedOperationException("glob64 not available on WASI — no C library access")
