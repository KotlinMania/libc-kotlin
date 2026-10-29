package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun clockGettime(clockId: Int, tp: Timespec?): Int
