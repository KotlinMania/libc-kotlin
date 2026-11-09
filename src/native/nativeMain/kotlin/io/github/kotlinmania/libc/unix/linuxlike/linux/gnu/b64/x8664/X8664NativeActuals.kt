@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libc_unix_linuxlike_linux_gnu_b64_x8664_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libc_unix_linuxlike_linux_gnu_b64_x8664_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun makecontext(ucp: COpaquePointer?, func: FnCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libc_unix_linuxlike_linux_gnu_b64_x8664_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
