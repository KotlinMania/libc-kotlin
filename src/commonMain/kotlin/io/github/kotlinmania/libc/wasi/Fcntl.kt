package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int
