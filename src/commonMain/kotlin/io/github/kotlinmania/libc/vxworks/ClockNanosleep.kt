package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun clockNanosleep(clockId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int
