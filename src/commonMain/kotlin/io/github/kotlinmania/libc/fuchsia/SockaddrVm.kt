// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class SockaddrVm(
    val svmFamily: UShort,
    val svmPort: UShort,
    val svmCid: UInt,
    val svmZero: UByteArray,
)
