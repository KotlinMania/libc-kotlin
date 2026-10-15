// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Filedesc(
    val fdFiles: Fdescenttbl?,
    val fdMap: ULong?,
    val fdFreefile: Int,
    val fdRefcnt: Int,
    val fdHoldcnt: Int,
    val fdSx: Sx,
    val fdKqlist: Kqlist,
    val fdHoldleaderscount: Int,
    val fdHoldleaderswakeup: Int,
)
