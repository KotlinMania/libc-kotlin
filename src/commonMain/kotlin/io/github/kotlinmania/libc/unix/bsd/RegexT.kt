// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class RegexT(
    val reMagic: Int,
    val reNsub: ULong,
    val reEndp: String?,
    val reG: COpaquePointer?,
)
