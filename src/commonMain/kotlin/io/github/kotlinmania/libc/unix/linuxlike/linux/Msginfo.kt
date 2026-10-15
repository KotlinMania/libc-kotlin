// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Msginfo(
    val msgpool: Int,
    val msgmap: Int,
    val msgmax: Int,
    val msgmnb: Int,
    val msgmni: Int,
    val msgssz: Int,
    val msgtql: Int,
    val msgseg: UShort,
)
