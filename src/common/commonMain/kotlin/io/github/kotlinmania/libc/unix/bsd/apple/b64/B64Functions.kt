package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public expect fun exchangedata(path1: ConstPtr, path2: ConstPtr, options: CUint): CInt
