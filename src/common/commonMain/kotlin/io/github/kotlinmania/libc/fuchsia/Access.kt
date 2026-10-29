package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun access(path: String?, amode: Int): Int
