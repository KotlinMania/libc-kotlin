package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun taskInfo(host: UInt, flavor: UInt, taskInfoOut: Int?, taskInfoCount: UInt?): Int
