package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.bsd.apple.Tm

import io.github.kotlinmania.libc.*

public expect fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong
