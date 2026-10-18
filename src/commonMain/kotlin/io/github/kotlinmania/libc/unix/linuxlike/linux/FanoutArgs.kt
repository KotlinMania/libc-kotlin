package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class FanoutArgs(
    val id: UShort,
    val typeFlags: UShort,
    val id2: UShort,
    val maxNumMembers: UInt,
)
