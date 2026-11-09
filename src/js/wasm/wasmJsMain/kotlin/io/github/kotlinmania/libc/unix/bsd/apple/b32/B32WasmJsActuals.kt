@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    0
