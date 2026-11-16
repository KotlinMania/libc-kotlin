@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.aix.powerpc64.cinterop.libcUnixAixPowerpc64Getsystemcfg

public actual fun getsystemcfg(label: CInt): CUlong =
    libcUnixAixPowerpc64Getsystemcfg(label)
