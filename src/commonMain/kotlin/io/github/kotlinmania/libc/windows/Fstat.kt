package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun fstat(fildes: Int, buf: Stat?): Int
