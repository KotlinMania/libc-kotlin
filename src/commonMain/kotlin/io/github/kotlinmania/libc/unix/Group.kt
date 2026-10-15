// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: UInt,
    val grMem: COpaquePointer?,
)
