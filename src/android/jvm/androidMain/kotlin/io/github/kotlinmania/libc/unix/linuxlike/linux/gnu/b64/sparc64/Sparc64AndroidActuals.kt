@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.sparc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuB64Sparc64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Sparc64Sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
}

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuB64Sparc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Sparc64Sysctl(name.rawAddress, namelen, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())
