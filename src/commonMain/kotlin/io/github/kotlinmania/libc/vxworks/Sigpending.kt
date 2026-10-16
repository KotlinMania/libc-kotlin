package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun sigpending(set: ULong?): Int
