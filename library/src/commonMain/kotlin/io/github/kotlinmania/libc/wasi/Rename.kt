package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun rename(a: String?, b: String?): Int
