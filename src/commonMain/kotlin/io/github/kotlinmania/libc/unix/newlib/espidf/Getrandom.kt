// port-lint: source unix/newlib/espidf/mod.rs
package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
