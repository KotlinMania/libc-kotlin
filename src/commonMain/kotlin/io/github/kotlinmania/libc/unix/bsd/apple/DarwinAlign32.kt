// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

// Aligns to a four-byte boundary.
public fun darwinAlign32(p: ULong): ULong = (p + 3uL) and (3uL).inv()
