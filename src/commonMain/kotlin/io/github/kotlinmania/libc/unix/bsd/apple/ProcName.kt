package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procName(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int
