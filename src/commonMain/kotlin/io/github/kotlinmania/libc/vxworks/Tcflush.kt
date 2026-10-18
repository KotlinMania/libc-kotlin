package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun tcflush(fd: Int, action: Int): Int
