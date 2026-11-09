// port-lint: source new/openbsd/sys/ipc.rs
package io.github.kotlinmania.libc.new.openbsd.sys.ipc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.GidT
import io.github.kotlinmania.libc.new.qurt.ModeT
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.KeyT

// Header: `sys / ipc.h`
//
// <https://github.com/openbsd/src/blob/master/sys/sys/ipc.h>

public open class IpcPerm(
    public var cuid: UidT,
    public var cgid: GidT,
    public var uid: UidT,
    public var gid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
    public var key: KeyT,
)
