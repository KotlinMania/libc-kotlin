// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Ucred(
    val pid: Int,
    val uid: UInt,
    val gid: UInt,
)
