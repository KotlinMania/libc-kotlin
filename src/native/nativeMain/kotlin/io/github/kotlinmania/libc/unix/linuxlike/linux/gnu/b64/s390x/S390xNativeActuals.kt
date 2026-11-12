@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libcUnixLinuxlikeLinuxGnuB64S390xGetcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libcUnixLinuxlikeLinuxGnuB64S390xMakecontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libcUnixLinuxlikeLinuxGnuB64S390xSetcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libcUnixLinuxlikeLinuxGnuB64S390xSwapcontext
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x.cinterop.libcUnixLinuxlikeLinuxGnuB64S390xSysctl
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuB64S390xSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun getcontext(ucp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64S390xGetcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun setcontext(ucp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64S390xSetcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    libcUnixLinuxlikeLinuxGnuB64S390xMakecontext(ucp.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuB64S390xSwapcontext(uocp.rawAddress.toCPointer<ByteVar>(), ucp.rawAddress.toCPointer<ByteVar>())
