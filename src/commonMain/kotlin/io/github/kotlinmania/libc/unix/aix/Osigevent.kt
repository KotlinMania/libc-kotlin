// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Osigevent(
    val sevtValue: COpaquePointer?,
    val sevtSigno: Int,
)
