package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun clonefile(src: String?, dst: String?, flags: UInt): Int
