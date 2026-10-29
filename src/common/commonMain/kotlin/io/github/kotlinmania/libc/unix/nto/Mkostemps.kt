package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int
