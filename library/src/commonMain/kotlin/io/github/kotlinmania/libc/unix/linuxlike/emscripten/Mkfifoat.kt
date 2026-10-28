package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int
