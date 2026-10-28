package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int
