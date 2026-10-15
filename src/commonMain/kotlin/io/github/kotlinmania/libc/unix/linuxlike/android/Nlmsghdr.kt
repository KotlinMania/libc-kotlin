// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Nlmsghdr(
    val nlmsgLen: UInt,
    val nlmsgType: UShort,
    val nlmsgFlags: UShort,
    val nlmsgSeq: UInt,
    val nlmsgPid: UInt,
)
