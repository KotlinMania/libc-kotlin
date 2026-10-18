package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.bsd.apple.Stat

import io.github.kotlinmania.libc.*

public expect fun lstat(path: String?, buf: Stat?): Int
