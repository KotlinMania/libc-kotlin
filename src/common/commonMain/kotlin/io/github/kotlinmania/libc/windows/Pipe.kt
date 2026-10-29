package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun pipe(fds: Int?, psize: UInt, textmode: Int): Int
