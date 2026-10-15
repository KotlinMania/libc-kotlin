package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Mallinfo(
    val arena: Int,
    val ordblks: Int,
    val smblks: Int,
    val hblks: Int,
    val hblkhd: Int,
    val usmblks: Int,
    val fsmblks: Int,
    val uordblks: Int,
    val fordblks: Int,
    val keepcost: Int,
)
