package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun seekdir(dirp: DIR?, loc: Long)
