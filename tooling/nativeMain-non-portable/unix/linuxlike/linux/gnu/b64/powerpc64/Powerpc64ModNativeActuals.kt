@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libc_powerpc64_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun getcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libc_powerpc64_mod_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libc_powerpc64_mod_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun swapcontext(oucp: UcontextT?, ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libc_powerpc64_mod_swapcontext(oucp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
