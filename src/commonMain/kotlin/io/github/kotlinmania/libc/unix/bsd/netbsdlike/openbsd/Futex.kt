// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun futex(uaddr: UInt?, op: Int, `val`: Int, timeout: Timespec?, uaddr2: UInt?): Int
