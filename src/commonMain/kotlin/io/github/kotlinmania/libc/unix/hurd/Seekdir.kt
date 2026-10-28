package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun seekdir(dirp: DIR?, loc: Long)
