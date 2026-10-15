// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun recv(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int): Long
