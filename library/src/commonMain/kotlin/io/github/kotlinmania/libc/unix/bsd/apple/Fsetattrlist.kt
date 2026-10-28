package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fsetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int
