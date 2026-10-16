package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun shmOpen(name: String?, oflag: Int, mode: Int): Int
