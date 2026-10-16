package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun mkstemps(template: String?, suffixlen: Int): Int
