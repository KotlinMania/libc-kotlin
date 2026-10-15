// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sctpOptInfo(sd: Int, id: UInt, opt: Int, argSize: COpaquePointer?, size: ULong?): Int
