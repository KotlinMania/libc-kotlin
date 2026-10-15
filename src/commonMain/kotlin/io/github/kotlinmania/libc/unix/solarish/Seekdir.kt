package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun seekdir(dirp: DIR?, loc: Long)
