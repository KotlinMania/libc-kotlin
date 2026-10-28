package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadAttr(
    val schedparam: SchedParam,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
    val guardsize: ULong,
    val detachstate: UInt,
    val inheritsched: UInt,
    val contentionscope: UInt,
    val schedpolicy: Int,
)
