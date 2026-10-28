package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun open(path: String?, oflag: Int, vararg args: Any?): Int
