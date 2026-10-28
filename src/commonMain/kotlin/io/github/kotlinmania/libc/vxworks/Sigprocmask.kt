package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int
