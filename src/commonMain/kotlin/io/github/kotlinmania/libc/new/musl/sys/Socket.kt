// port-lint: source new/musl/sys/socket.rs
package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/socket.h`.
 */

// __pad1 / __pad2 are endian-dependent layout padding on 64-bit targets
// (placed before or after the adjacent field for big- vs little-endian); omitted.
public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: UInt,
    val msgFlags: Int,
)

// __pad1 is endian-dependent layout padding on 64-bit targets; omitted.
public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
)

public fun sendmmsg(
    sockfd: Int,
    msgvec: Mmsghdr?,
    vlen: UInt,
    flags: UInt,
): Int = -1

public fun recvmmsg(
    sockfd: Int,
    msgvec: Mmsghdr?,
    vlen: UInt,
    flags: UInt,
    timeout: Timespec?,
): Int = -1

// On mips / mips64 these are re-exported from bits.socket; on every other
// architecture they are defined here.
public const val SOCK_STREAM: Int = 1
public const val SOCK_DGRAM: Int = 2
