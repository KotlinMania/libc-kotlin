package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun mkstemps(template: String?, suffixlen: Int): Int
