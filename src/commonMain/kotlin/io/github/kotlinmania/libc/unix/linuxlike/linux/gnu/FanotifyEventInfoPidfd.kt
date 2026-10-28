package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.FanotifyEventInfoHeader

public data class FanotifyEventInfoPidfd(
    val hdr: FanotifyEventInfoHeader,
    val pidfd: Int,
)
