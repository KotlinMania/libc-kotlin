// port-lint: source fuchsia/riscv64.rs
package io.github.kotlinmania.libc.fuchsia.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.fuchsia.BlkcntT
import io.github.kotlinmania.libc.fuchsia.DevT
import io.github.kotlinmania.libc.fuchsia.GidT
import io.github.kotlinmania.libc.fuchsia.InoT
import io.github.kotlinmania.libc.fuchsia.KeyT
import io.github.kotlinmania.libc.fuchsia.ModeT
import io.github.kotlinmania.libc.fuchsia.OffT
import io.github.kotlinmania.libc.fuchsia.TimeT
import io.github.kotlinmania.libc.fuchsia.UidT

// From psABI Calling Convention for RV64
public typealias U64 = CUlonglong

public typealias WcharT = Int

public typealias NlinkT = CUlong

public typealias BlksizeT = CLong

public typealias Stat64 = Stat

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var pad0: CInt = 0,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: LongArray = LongArray(3),
)

// Not actually used, IPC calls just return ENOSYS
public data class IpcPerm(
    public var ipcPermKey: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)
