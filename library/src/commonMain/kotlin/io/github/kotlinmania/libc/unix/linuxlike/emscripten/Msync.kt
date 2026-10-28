package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int
