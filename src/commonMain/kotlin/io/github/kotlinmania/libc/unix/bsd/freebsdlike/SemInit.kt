// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int
