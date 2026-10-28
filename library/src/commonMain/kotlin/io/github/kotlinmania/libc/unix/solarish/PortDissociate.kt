package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun portDissociate(port: Int, source: Int, `object`: ULong): Int
