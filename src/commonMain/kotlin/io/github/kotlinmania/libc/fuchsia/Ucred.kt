// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Ucred(
    val pid: Int,
    val uid: UInt,
    val gid: UInt,
)
