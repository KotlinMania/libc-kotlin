@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuB64Aarch64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Aarch64Sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Aarch64Getcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Aarch64Setcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Aarch64Makecontext(ucp: Long, func: Long, argc: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Aarch64Swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libcUnixLinuxlikeLinuxGnuB64Aarch64Sysctl(name.rawAddress, namelen, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libcUnixLinuxlikeLinuxGnuB64Aarch64Getcontext(ucp.rawAddress)

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libcUnixLinuxlikeLinuxGnuB64Aarch64Setcontext(ucp.rawAddress)

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libcUnixLinuxlikeLinuxGnuB64Aarch64Makecontext(ucp.rawAddress, 0L, argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libcUnixLinuxlikeLinuxGnuB64Aarch64Swapcontext(uocp.rawAddress, ucp.rawAddress)
