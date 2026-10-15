// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong)
