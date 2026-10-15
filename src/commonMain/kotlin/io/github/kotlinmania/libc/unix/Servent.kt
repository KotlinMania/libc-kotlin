// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Servent(
    val sName: String?,
    val sAliases: COpaquePointer?,
    val sPort: Short,
    val sPort2: Int,
    val sProto: String?,
)
