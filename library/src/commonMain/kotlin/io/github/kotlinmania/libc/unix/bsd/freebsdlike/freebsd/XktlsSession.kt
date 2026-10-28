package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class XktlsSession(
    val tsz: UInt,
    val fsz: UInt,
    val inpGencnt: ULong,
    val soPcb: ULong,
    val coninf: InConninfo,
    val rxVlanId: UShort,
    val rcv: XktlsSessionOnedir,
    val snd: XktlsSessionOnedir,
)
