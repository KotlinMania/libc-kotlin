package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: Int): Int
