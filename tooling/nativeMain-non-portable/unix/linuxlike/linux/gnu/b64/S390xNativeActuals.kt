@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.cinterop.libc_s390x_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun getcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.cinterop.libc_s390x_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.cinterop.libc_s390x_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun swapcontext(uocp: io.github.kotlinmania.libc.UcontextT?, ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.cinterop.libc_s390x_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
