package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockGetres(clockId: ULong, res: Timespec?): Int
