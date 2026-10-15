// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)
