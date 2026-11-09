@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

public actual fun getsystemcfg(label: CInt): CUlong =
    io.github.kotlinmania.libc.unix.aix.powerpc64.cinterop.libc_unix_aix_powerpc64_getsystemcfg(label)
