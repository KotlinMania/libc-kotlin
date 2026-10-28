package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun shmOpen(name: String?, oflag: Int, mode: Int): Int
