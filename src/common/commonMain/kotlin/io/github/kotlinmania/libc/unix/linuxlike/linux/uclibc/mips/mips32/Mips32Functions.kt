package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

public expect fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun glob64(pattern: String?, flags: CInt, errfunc: FnCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree64(pglob: COpaquePointer?)

public expect fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt
