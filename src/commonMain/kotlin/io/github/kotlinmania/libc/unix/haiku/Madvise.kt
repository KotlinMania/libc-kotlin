// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int
