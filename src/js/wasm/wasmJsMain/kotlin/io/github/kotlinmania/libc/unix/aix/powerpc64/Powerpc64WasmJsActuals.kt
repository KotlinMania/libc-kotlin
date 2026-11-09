@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

public actual fun getsystemcfg(label: CInt): CUlong =
    0uL
