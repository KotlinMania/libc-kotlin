package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcFdRenumber(fd: Int, newfd: Int): Int
