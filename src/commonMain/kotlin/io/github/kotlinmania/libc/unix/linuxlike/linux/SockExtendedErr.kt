// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SockExtendedErr(
    val eeErrno: UInt,
    val eeOrigin: UByte,
    val eeType: UByte,
    val eeCode: UByte,
    val eePad: UByte,
    val eeInfo: UInt,
    val eeData: UInt,
)
