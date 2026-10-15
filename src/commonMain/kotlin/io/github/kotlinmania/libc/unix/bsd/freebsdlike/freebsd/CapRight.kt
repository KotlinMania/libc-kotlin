// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

internal fun capRight(idx: Int, bit: ULong): ULong =
    (1uL shl (57 + idx)) or bit
