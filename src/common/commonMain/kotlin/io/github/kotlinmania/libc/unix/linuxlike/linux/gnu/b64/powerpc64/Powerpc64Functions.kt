package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun getcontext(ucp: MutPtr): CInt

public expect fun setcontext(ucp: ConstPtr): CInt

public expect fun swapcontext(oucp: MutPtr, ucp: ConstPtr): CInt

public expect fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long)
