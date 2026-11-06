// port-lint: source fuchsia/aarch64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.UidT

public typealias U64 = CUlonglong

public typealias WcharT = UInt

public typealias NlinkT = CUlong

public typealias BlksizeT = CLong

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad0: CUlong,
    public var stSize: OffT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var pad1: CInt,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused: List<CUint>,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad0: CUlong,
    public var stSize: OffT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var pad1: CInt,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused: List<CUint>,
)

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

// From https://cs.opensource.google/fuchsia/fuchsia/+/main:zircon/thirdParty/ulib/musl/include/bits/signal.h;l=20-21;drc=0827b18ab9540c46f8037f407d17ea15a79e9ba7
public val MINSIGSTKSZ: SizeT = 6144uL

public val SIGSTKSZ: SizeT = 12288uL
