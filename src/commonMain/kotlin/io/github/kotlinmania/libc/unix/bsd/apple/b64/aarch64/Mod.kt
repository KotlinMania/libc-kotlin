// port-lint: source unix/bsd/apple/b64/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias BooleanT = CInt

public data class MallocZoneT(
    val private: List<UintptrT>,
)

public data class MaxAlignT(
    val priv: Double,
)
