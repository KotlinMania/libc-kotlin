package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Mallinfo(
    val arena: ULong,
    val ordblks: Int,
    val smblks: Int,
    val hblks: Int,
    val hblkhd: Int,
    val usmblks: ULong,
    val fsmblks: ULong,
    val uordblks: ULong,
    val fordblks: ULong,
    val keepcost: Int,
)
