package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): Int
