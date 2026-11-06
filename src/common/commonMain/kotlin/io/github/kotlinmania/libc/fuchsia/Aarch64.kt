// port-lint: source fuchsia/aarch64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

public typealias U64 = CUlonglong

public typealias WcharT = UInt

public typealias NlinkT = CUlong

public typealias BlksizeT = CLong

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad0: CUlong,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
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
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad0: CUlong,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
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
