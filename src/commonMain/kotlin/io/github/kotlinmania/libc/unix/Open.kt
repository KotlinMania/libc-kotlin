package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun open(path: String?, oflag: Int): Int

public expect fun open(path: String?, oflag: Int, mode: UInt): Int
