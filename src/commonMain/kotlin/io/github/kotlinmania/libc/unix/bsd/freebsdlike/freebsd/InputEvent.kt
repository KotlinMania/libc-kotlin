// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class InputEvent(
    val time: Timeval,
    val type: UShort,
    val code: UShort,
    val value: Int,
)
