package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Stat

public expect fun fstat(fildes: Int, buf: Stat?): Int
