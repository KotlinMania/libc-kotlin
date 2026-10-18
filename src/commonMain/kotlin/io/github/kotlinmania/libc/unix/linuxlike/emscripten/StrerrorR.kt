package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int
