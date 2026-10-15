// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Mallinfo(
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
