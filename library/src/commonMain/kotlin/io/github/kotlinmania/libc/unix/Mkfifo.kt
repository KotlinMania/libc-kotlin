package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun mkfifo(path: String?, mode: UInt): Int
