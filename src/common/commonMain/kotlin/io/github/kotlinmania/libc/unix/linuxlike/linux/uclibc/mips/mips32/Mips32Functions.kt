package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface Glob64ErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public expect fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt

public expect fun globfree64(pglob: MutPtr<Glob64T>)

public expect fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt
