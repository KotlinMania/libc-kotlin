package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwEvent(
    val len: UShort,
    val cmd: UShort,
    val u: IwreqData,
)
