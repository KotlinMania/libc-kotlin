package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun getpriority(which: Int, who: UInt): Int
