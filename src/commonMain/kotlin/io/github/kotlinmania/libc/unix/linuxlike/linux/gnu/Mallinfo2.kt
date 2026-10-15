// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Mallinfo2(
    val arena: ULong,
    val ordblks: ULong,
    val smblks: ULong,
    val hblks: ULong,
    val hblkhd: ULong,
    val usmblks: ULong,
    val fsmblks: ULong,
    val uordblks: ULong,
    val fordblks: ULong,
    val keepcost: ULong,
)
