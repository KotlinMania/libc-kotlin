package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun psetGetattr(pset: Int, attr: UInt?): Int
