package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun meminfo(inaddr: ULong?, addrCount: Int, infoReq: UInt?, infoCount: Int, outdata: ULong?, validity: UInt?): Int
