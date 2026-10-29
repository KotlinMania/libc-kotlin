package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fputc(c: Int, stream: FILE?): Int
