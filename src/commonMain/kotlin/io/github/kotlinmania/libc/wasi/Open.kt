package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun open(path: String?, oflag: Int, vararg args: Any?): Int
