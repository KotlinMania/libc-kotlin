package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun ungetc(c: Int, stream: FILE?): Int
