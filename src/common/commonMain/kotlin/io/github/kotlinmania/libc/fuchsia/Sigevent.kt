package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: Int,
    val sigevNotify: Int,
    val sigevNotifyFunction: io.github.kotlinmania.libc.unix.SignalNotification?,
    val sigevNotifyAttributes: PthreadAttrT?,
    val pad: ByteArray,
)
