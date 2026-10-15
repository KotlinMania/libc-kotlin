// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun umtxOp(obj: COpaquePointer?, op: Int, `val`: ULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): Int
