// port-lint: source unix/linux_like/linux/musl/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.x8664

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
