package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Tm

public expect fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong
