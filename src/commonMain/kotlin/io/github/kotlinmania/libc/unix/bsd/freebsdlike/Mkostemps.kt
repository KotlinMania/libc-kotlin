package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int
