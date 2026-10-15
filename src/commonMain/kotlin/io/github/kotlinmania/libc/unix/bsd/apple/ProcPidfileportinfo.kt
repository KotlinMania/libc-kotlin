// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procPidfileportinfo(pid: Int, fileport: UInt, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int
