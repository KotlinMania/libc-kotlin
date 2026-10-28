package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procLibversion(major: Int?, minor: Int?): Int
