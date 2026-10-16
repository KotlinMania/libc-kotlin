package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun psetInfo(pset: Int, tpe: Int?, numcpus: UInt?, cpulist: Int?): Int
