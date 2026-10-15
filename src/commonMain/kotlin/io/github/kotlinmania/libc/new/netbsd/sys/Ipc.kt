// port-lint: source new/netbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: UShort,
    val key: Int,
)
