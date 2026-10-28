package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun open(path: String?, oflag: Int, vararg args: Any?): Int
