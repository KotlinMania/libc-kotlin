package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public expect fun exchangedata(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>, options: CUlong): CInt
