package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun chmod(path: String?, mode: UInt): Int
