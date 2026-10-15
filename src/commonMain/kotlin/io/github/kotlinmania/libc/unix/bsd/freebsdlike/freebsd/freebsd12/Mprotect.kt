// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd12/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int
