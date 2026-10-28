package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
