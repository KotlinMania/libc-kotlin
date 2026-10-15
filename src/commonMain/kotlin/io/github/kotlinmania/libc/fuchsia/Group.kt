// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: UInt,
    val grMem: COpaquePointer?,
)
