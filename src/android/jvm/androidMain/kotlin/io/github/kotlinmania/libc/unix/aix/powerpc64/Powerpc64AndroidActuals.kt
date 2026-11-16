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
    external fun libcUnixAixPowerpc64Getsystemcfg(label: Int): Long
}

public actual fun getsystemcfg(label: CInt): CUlong =
    UnixAixPowerpc64JniBridge.libcUnixAixPowerpc64Getsystemcfg(label).toULong()
