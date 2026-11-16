package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun getcontext(ucp: MutPtr): CInt

public expect fun setcontext(ucp: ConstPtr): CInt

public expect fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt
