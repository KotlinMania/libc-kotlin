package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class DeviceSelection(
    val deviceNumber: UInt,
    val deviceName: ByteArray,
    val unitNumber: Int,
    val selected: Int,
    val bytes: ULong,
    val position: Int,
)
