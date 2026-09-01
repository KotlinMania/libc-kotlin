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
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

// __pad1 is endian-dependent layout padding on 64-bit targets; omitted.
public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public fun sendmmsg(
    sockfd: CInt,
    msgvec: Mmsghdr?,
    vlen: CUInt,
    flags: CUInt,
): CInt = -1

public fun recvmmsg(
    sockfd: CInt,
    msgvec: Mmsghdr?,
    vlen: CUInt,
    flags: CUInt,
    timeout: Timespec?,
): CInt = -1

// On mips / mips64 these are re-exported from bits.socket; on every other
// architecture they are defined here.
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
