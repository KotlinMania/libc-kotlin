@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_x86_mod_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_x86_mod_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86.cinterop.libc_x86_mod_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
