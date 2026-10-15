// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
