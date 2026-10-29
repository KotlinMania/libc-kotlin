package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun dup2(src: Int, dst: Int): Int
