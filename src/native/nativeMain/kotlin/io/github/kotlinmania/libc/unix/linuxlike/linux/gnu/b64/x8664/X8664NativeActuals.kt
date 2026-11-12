@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libcUnixLinuxlikeLinuxGnuB64X8664Getcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libcUnixLinuxlikeLinuxGnuB64X8664Makecontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libcUnixLinuxlikeLinuxGnuB64X8664Setcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libcUnixLinuxlikeLinuxGnuB64X8664Swapcontext
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getcontext(ucp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64X8664Getcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun setcontext(ucp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64X8664Setcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    libcUnixLinuxlikeLinuxGnuB64X8664Makecontext(ucp.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64X8664Swapcontext(uocp.rawAddress.toCPointer<ByteVar>(), ucp.rawAddress.toCPointer<ByteVar>())
