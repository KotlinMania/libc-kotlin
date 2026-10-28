package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun sysctlnametomib(sname: String?, name: Int?, namelenp: ULong?): Int
