package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): Int
