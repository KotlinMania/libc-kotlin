package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun creat(path: String?, mode: UInt): Int
