package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun ungetc(c: Int, stream: FILE?): Int
