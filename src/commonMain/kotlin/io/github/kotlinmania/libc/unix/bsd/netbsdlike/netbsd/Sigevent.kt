package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class Sigevent(
    val sigevNotify: Int,
    val sigevSigno: Int,
    val sigevValue: Sigval,
    val sigevNotifyAttributes: COpaquePointer?,
)
