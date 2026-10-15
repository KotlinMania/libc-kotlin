// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun getattrlistat(fd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int
