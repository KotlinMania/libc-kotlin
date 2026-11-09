@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    0

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    0

public actual fun makecontext(ucp: COpaquePointer?, func: FnCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    0
