// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpClockCaps(
    val maxAdj: Int,
    val nAlarm: Int,
    val nExtTs: Int,
    val nPerOut: Int,
    val pps: Int,
    val nPins: Int,
    val crossTimestamping: Int,
    val adjustPhase: Int,
    val maxPhaseAdj: Int,
    val rsv: IntArray,
)
