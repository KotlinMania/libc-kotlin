// port-lint: source new/musl/sys/socket.rs
package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr

/**
 * Header: `sys/socket.h`.
 */

// Endian-dependent layout padding on 64-bit targets is omitted in Kotlin.
public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: UInt,
    val msgFlags: Int,
)

// Endian-dependent layout padding on 64-bit targets is omitted in Kotlin.
public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
)

public expect fun sendmmsg(
    sockfd: Int,
    msgvec: Mmsghdr?,
    vlen: UInt,
    flags: UInt,
): Int

public expect fun recvmmsg(
    sockfd: Int,
    msgvec: Mmsghdr?,
    vlen: UInt,
    flags: UInt,
    timeout: Timespec?,
): Int

// On mips / mips64 these are re-exported from bits.socket; on every other
// architecture they are defined here.
public const val SOCK_STREAM: Int = 1
public const val SOCK_DGRAM: Int = 2
