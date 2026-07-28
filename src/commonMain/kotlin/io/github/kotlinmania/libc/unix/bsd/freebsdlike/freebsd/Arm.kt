// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias GregT = CUInt
public typealias GregsetT = LongArray

    val gregs: GregsetT,
    val mcVfpSize: ULong,
    val mcVfpPtr: COpaquePointer?,
    val mcSpare: UIntArray,
)

