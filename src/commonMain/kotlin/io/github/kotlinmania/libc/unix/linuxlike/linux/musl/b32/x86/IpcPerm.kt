// port-lint: source unix/linux_like/linux/musl/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.x86

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val key: Int,
    val ipcPermKey: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: Int,
)
