package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public data class IwMlme(
    val cmd: UShort,
    val reasonCode: UShort,
    val addr: Sockaddr,
)
