package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun open64(path: String?, oflag: Int, vararg args: Any?): Int
