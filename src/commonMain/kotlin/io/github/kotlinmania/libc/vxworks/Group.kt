// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: Int,
    val grMem: COpaquePointer?,
)
