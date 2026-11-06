// port-lint: source fuchsia/x86_64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

public typealias WcharT = Int

public typealias NlinkT = ULong

public typealias BlksizeT = CLong

public typealias U64 = CUlonglong

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

public open class Stat64(
    public var stDev: DevT,
    public var stIno: Ino64T,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: Blkcnt64T,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var reserved: List<CLong>,
)

public open class McontextT(public var private: List<ULong>)

public open class IpcPerm(
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CInt,
    public var unused1: CLong,
    public var unused2: CLong,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmask: SigsetT,
    public var private: List<UByte>,
)

// offsets in userRegsStructs, from sys/reg.h
public val R15: CInt = 0

public val R14: CInt = 1

public val R13: CInt = 2

public val R12: CInt = 3

public val RBP: CInt = 4

public val RBX: CInt = 5

public val R11: CInt = 6

public val R10: CInt = 7

public val R9: CInt = 8

public val R8: CInt = 9

public val RAX: CInt = 10

public val RCX: CInt = 11

public val RDX: CInt = 12

public val RSI: CInt = 13

public val RDI: CInt = 14

public val ORIG_RAX: CInt = 15

public val RIP: CInt = 16

public val CS: CInt = 17

public val EFLAGS: CInt = 18

public val RSP: CInt = 19

public val SS: CInt = 20

public val FS_BASE: CInt = 21

public val GS_BASE: CInt = 22

public val DS: CInt = 23

public val ES: CInt = 24

public val FS: CInt = 25

public val GS: CInt = 26

public val MAP_32BIT: CInt = 0x0040

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL
