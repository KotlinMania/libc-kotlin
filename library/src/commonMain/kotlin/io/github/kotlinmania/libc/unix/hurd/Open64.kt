package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun open64(file: String?, oflag: Int, vararg args: Any?): Int
