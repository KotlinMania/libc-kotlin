package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun clockGetres(clockId: Int, res: Timespec?): Int
