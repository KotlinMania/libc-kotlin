// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int
