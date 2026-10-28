package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int
