// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int
