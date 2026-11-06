@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.aix

public actual fun getsystemcfg(label: CInt): CUlong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_powerpc64_getsystemcfg(label)
