// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)
