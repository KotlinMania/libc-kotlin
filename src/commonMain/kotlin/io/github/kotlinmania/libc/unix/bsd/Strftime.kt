package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Tm

public expect fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong
