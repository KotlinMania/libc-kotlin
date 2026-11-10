// port-lint: source fuchsia/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia.aarch64

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
import io.github.kotlinmania.libc.fuchsia.SizeT
import io.github.kotlinmania.libc.fuchsia.TimeT
import io.github.kotlinmania.libc.fuchsia.UidT

public typealias U64 = CUlonglong

public typealias WcharT = UInt

public typealias NlinkT = CUlong

public typealias BlksizeT = CLong

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad0: CUlong = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var pad1: CInt = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: UIntArray = UIntArray(2),
)

public class Stat64(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad0: CUlong = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var pad1: CInt = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: UIntArray = UIntArray(2),
)

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

// From https://cs.opensource.google/fuchsia/fuchsia/+/main:zircon/thirdParty/ulib/musl/include/bits/signal.h;l=20-21;drc=0827b18ab9540c46f8037f407d17ea15a79e9ba7
public val MINSIGSTKSZ: SizeT = 6144uL

public val SIGSTKSZ: SizeT = 12288uL
