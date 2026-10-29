package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String?
