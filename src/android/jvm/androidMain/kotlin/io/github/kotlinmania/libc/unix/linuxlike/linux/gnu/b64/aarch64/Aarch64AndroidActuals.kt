@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

private object UnixLinuxlikeLinuxGnuB64Aarch64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_aarch64_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_aarch64_getcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_aarch64_setcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_b64_aarch64_swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libc_unix_linuxlike_linux_gnu_b64_aarch64_sysctl((name?.value ?: 0L), namelen, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libc_unix_linuxlike_linux_gnu_b64_aarch64_getcontext((ucp?.value ?: 0L))

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libc_unix_linuxlike_linux_gnu_b64_aarch64_setcontext((ucp?.value ?: 0L))

public actual fun makecontext(ucp: COpaquePointer?, func: FnCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuB64Aarch64JniBridge.libc_unix_linuxlike_linux_gnu_b64_aarch64_swapcontext((uocp?.value ?: 0L), (ucp?.value ?: 0L))
