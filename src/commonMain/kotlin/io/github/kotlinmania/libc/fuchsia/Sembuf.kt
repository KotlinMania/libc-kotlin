// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)
