@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object UnixLinuxlikeLinuxGnuB64X8664JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_x8664_getcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_x8664_setcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_x8664_swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64X8664JniBridge.libc_unix_linuxlike_linux_gnu_b64_x8664_getcontext((ucp?.value ?: 0L))

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64X8664JniBridge.libc_unix_linuxlike_linux_gnu_b64_x8664_setcontext((ucp?.value ?: 0L))

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64X8664JniBridge.libc_unix_linuxlike_linux_gnu_b64_x8664_swapcontext((uocp?.value ?: 0L), (ucp?.value ?: 0L))
