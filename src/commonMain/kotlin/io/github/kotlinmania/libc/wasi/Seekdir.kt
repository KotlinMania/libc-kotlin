package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun seekdir(dirp: DIR?, loc: Long)
