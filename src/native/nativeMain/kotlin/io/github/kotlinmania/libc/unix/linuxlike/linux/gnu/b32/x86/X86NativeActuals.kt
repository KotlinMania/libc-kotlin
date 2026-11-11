@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_unix_linuxlike_linux_gnu_b32_x86_getcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_unix_linuxlike_linux_gnu_b32_x86_makecontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_unix_linuxlike_linux_gnu_b32_x86_setcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_gnu_b32_x86_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_gnu_b32_x86_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    libc_unix_linuxlike_linux_gnu_b32_x86_makecontext(ucp?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
