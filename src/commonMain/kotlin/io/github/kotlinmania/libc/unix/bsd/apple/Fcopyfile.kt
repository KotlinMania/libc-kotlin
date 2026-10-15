// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fcopyfile(from: Int, to: Int, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int
