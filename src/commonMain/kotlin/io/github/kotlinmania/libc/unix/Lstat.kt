package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Stat

public expect fun lstat(path: String?, buf: Stat?): Int
