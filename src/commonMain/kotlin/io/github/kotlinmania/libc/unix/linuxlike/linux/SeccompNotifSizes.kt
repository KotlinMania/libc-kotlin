package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SeccompNotifSizes(
    val seccompNotif: UShort,
    val seccompNotifResp: UShort,
    val seccompData: UShort,
)
