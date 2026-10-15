package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun access(path: String?, amode: Int): Int
