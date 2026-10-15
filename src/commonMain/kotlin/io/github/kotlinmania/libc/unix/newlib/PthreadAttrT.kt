package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class PthreadAttrT(
    val size: UByteArray,
    val isInitialized: Int,
    val stackaddr: COpaquePointer?,
    val stacksize: Int,
    val contentionscope: Int,
    val inheritsched: Int,
    val schedpolicy: Int,
    val schedparam: Int,
    val detachstate: Int,
)
