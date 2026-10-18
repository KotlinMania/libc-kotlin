package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun hostStatistics64(hostPriv: UInt, flavor: Int, hostInfo64Out: Int?, hostInfo64OutCnt: UInt?): Int
