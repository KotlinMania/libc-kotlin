@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64.cinterop.libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun swapcontext(oucp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext(oucp.rawAddress.toCPointer<ByteVar>(), ucp.rawAddress.toCPointer<ByteVar>())

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext(ucp.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}
