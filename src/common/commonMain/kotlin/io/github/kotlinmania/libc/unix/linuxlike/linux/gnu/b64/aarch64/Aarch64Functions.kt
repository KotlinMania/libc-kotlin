package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun getcontext(ucp: MutPtr<UcontextT>): CInt

public expect fun setcontext(ucp: ConstPtr<UcontextT>): CInt

public expect fun makecontext(ucp: MutPtr<UcontextT>, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt
