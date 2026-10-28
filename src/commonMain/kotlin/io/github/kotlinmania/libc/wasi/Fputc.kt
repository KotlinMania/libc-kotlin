package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fputc(a: Int, f: FILE?): Int
