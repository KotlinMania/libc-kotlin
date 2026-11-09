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

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused: List<CLong>,
)

// Not actually used, IPC calls just return ENOSYS
public open class IpcPerm(
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)
