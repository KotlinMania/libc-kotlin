package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int
