// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: Int): ULong
