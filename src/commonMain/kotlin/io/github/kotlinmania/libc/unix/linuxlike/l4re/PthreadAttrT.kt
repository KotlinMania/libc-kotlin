package io.github.kotlinmania.libc.unix.linuxlike.l4re
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

import io.github.kotlinmania.libc.*

public data class PthreadAttrT(
    val detachstate: Int,
    val schedpolicy: Int,
    val schedparam: SchedParam,
    val inheritsched: Int,
    val scope: Int,
    val guardsize: ULong,
    val stackaddrSet: Int,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
    val affinity: L4SchedCpuSetT,
    val createFlags: UInt,
)
