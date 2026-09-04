// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 requires N-API addon")
}

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires N-API addon")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires N-API addon")

