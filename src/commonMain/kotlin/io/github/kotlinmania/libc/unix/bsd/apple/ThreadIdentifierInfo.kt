// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ThreadIdentifierInfo(
    val threadId: ULong,
    val threadHandle: ULong,
    val dispatchQaddr: ULong,
)
