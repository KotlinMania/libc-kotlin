@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext(oucp: Long, ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext(ucp: Long, func: Long, argc: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)
}

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl(name.rawAddress, namelen, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun getcontext(ucp: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext(ucp.rawAddress)

public actual fun setcontext(ucp: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext(ucp.rawAddress)

public actual fun swapcontext(oucp: MutPtr, ucp: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext(oucp.rawAddress, ucp.rawAddress)

public actual fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext(ucp.rawAddress, 0L, argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}
