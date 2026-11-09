@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

private object UnixAixPowerpc64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_aix_powerpc64_getsystemcfg(label: Int): Long
}

public actual fun getsystemcfg(label: CInt): CUlong =
    UnixAixPowerpc64JniBridge.libc_unix_aix_powerpc64_getsystemcfg(label).toULong()
