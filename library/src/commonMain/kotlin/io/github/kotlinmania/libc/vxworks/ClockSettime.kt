package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun clockSettime(clockId: Int, tp: Timespec?): Int
