// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int
