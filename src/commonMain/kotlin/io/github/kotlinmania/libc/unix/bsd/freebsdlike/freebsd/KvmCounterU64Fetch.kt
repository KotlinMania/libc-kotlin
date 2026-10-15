// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmCounterU64Fetch(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong): ULong
