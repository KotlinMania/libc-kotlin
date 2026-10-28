package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun lgrpResources(cookie: ULong, lgrp: Int, lgrps: Int?, count: UInt, tpe: Int): Int
