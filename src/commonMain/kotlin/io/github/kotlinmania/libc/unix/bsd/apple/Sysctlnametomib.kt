package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun sysctlnametomib(name: String?, mibp: Int?, sizep: ULong?): Int
