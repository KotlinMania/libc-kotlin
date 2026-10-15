package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: Int,
    val sigevNotify: Int,
    val sigevNotifyThreadId: Int,
)
