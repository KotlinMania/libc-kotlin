package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procRegionfilename(pid: Int, address: ULong, buffer: COpaquePointer?, buffersize: UInt): Int
