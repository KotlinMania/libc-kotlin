package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun clockGetres(clockId: ULong, res: Timespec?): Int
