// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mallocZoneMalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer?
