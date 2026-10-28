// port-lint: source new/openbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.openbsd.sys

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val cuid: UInt,
    val cgid: UInt,
    val uid: UInt,
    val gid: UInt,
    val mode: UInt,
    val seq: UShort,
    val key: Int,
)
