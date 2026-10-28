package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class ThreadAttr(
    val flags: Int,
    val stacksize: ULong,
    val stackaddr: COpaquePointer?,
    val exitfunc: ThreadExitHandler?,
    val policy: Int,
    val param: SchedParam,
    val guardsize: UInt,
    val prealloc: UInt,
    val spare: IntArray,
)
