// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int
