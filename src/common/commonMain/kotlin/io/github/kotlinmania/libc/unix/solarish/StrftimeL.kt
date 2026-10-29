package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: io.github.kotlinmania.libc.COpaquePointer?): ULong
