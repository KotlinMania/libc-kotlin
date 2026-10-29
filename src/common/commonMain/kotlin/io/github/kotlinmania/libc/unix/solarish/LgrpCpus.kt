package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun lgrpCpus(cookie: ULong, lgrp: Int, cpuids: Int?, count: UInt, content: UInt): Int
