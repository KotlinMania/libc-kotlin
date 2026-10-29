package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun setenv(k: String?, v: String?, a: Int): Int
