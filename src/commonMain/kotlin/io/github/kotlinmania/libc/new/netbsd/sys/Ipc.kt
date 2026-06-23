// port-lint: source new/netbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class IpcPerm(
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUShort,
    val key: KeyT,
)
