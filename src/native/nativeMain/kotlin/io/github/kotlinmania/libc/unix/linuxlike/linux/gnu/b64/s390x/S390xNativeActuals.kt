@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libc_unix_linuxlike_linux_gnu_b64_s390x_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libc_unix_linuxlike_linux_gnu_b64_s390x_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libc_unix_linuxlike_linux_gnu_b64_s390x_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libc_unix_linuxlike_linux_gnu_b64_s390x_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())
