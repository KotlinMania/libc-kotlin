package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun truncate(path: String?, length: Long): Int
