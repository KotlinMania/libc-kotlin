package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fseek(stream: FILE?, offset: Long, whence: Int): Int
