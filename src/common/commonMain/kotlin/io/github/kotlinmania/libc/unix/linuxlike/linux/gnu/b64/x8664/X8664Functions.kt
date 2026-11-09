package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public expect fun getcontext(ucp: COpaquePointer?): CInt

public expect fun setcontext(ucp: COpaquePointer?): CInt

public expect fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt
