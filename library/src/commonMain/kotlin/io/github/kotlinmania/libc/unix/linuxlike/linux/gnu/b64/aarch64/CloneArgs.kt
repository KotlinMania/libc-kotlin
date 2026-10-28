package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*

public data class CloneArgs(
    val flags: ULong,
    val pidfd: ULong,
    val childTid: ULong,
    val parentTid: ULong,
    val exitSignal: ULong,
    val stack: ULong,
    val stackSize: ULong,
    val tls: ULong,
    val setTid: ULong,
    val setTidSize: ULong,
    val cgroup: ULong,
)
