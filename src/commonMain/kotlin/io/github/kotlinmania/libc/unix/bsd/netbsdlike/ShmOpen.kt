package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun shmOpen(name: String?, oflag: Int, mode: UInt): Int
