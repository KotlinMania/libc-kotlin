package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun mkdir(path: String?, mode: UInt): Int
