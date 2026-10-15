// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: Int): Int
