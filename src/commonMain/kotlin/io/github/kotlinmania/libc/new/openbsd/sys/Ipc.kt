// port-lint: source libc/src/new/openbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.openbsd.sys

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val cuid: UidT,
    val cgid: GidT,
    val uid: UidT,
    val gid: GidT,
    val mode: ModeT,
    val seq: CUShort,
    val key: KeyT,
)
