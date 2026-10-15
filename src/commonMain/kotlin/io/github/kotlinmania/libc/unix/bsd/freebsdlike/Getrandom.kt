// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
