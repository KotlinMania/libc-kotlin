// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: UInt): Long
