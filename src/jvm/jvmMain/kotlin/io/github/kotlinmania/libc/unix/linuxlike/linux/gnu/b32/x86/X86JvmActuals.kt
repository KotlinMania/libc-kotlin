@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object UnixLinuxlikeLinuxGnuB32X86JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b32_x86_getcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b32_x86_setcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libc_unix_linuxlike_linux_gnu_b32_x86_getcontext((ucp?.value ?: 0L))

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libc_unix_linuxlike_linux_gnu_b32_x86_setcontext((ucp?.value ?: 0L))

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB32X86JniBridge.libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext((uocp?.value ?: 0L), (ucp?.value ?: 0L))
