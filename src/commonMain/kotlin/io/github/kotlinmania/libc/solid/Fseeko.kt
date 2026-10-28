package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun fseeko(stream: FILE?, offset: Long, whence: Int): Int
