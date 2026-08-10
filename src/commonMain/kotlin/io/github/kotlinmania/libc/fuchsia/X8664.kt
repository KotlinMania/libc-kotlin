// port-lint: source fuchsia/x86_64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*


public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class Stat(
    val stDev: DevT,
    val stIno: Ino64T,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class McontextT(
    val private: ULongArray,
)

public data class IpcPerm(
    val ipcPermKey: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CInt,
)

public data class UcontextT(
    val ucFlags: CULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
    val private: UByteArray,
)

public const val R15: CInt = 0
public const val R14: CInt = 1
public const val R13: CInt = 2
public const val R12: CInt = 3
public const val RBP: CInt = 4
public const val RBX: CInt = 5
public const val R11: CInt = 6
public const val R10: CInt = 7
public const val R9: CInt = 8
public const val R8: CInt = 9
public const val RAX: CInt = 10
public const val RCX: CInt = 11
public const val RDX: CInt = 12
public const val RSI: CInt = 13
public const val RDI: CInt = 14
public const val ORIG_RAX: CInt = 15
public const val RIP: CInt = 16
public const val CS: CInt = 17
public const val EFLAGS: CInt = 18
public const val RSP: CInt = 19
public const val SS: CInt = 20
public const val FS_BASE: CInt = 21
public const val GS_BASE: CInt = 22
public const val DS: CInt = 23
public const val ES: CInt = 24
public const val FS: CInt = 25
public const val GS: CInt = 26
public const val MAP_32BIT: CInt = 0x0040
