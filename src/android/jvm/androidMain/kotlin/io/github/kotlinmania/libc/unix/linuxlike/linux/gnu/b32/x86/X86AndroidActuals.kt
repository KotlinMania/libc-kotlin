@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuB32X86JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB32X86Getcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB32X86Setcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB32X86Makecontext(ucp: Long, func: Long, argc: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB32X86Swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libcUnixLinuxlikeLinuxGnuB32X86Getcontext(ucp.rawAddress)

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libcUnixLinuxlikeLinuxGnuB32X86Setcontext(ucp.rawAddress)

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libcUnixLinuxlikeLinuxGnuB32X86Makecontext(ucp.rawAddress, 0L, argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libcUnixLinuxlikeLinuxGnuB32X86Swapcontext(uocp.rawAddress, ucp.rawAddress)
