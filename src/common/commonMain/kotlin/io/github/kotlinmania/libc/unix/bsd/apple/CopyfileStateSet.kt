package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun copyfileStateSet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, src: COpaquePointer?): Int
