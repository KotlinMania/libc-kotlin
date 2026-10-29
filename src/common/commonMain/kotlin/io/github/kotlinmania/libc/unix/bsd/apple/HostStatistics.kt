package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun hostStatistics(hostPriv: UInt, flavor: Int, hostInfoOut: Int?, hostInfoOutCnt: UInt?): Int
