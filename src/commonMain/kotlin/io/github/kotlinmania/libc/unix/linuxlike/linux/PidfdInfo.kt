package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PidfdInfo(
    val mask: ULong,
    val cgroupid: ULong,
    val pid: UInt,
    val tgid: UInt,
    val ppid: UInt,
    val ruid: UInt,
    val rgid: UInt,
    val euid: UInt,
    val egid: UInt,
    val suid: UInt,
    val sgid: UInt,
    val fsuid: UInt,
    val fsgid: UInt,
    val exitCode: Int,
)
