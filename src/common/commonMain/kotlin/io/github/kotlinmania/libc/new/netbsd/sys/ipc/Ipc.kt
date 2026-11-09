// port-lint: source new/netbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.netbsd.sys.ipc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.GidT
import io.github.kotlinmania.libc.new.qurt.ModeT
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.KeyT

// Header: `sys / ipc.h`
//
// <https://github.com/NetBSD/src/blob/trunk/sys/sys/ipc.h>

public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var key: KeyT = 0,
)
