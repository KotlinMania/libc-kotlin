package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fputc(c: Int, stream: FILE?): Int
