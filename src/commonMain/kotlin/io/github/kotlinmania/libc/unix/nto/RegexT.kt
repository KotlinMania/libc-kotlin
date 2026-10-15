// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class RegexT(
    val reMagic: Int,
    val reNsub: ULong,
    val reEndp: String?,
    val reG: COpaquePointer?,
)
