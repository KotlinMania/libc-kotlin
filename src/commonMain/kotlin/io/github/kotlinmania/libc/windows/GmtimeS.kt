package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun gmtimeS(destTime: Tm?, srcTime: Long?): Int
