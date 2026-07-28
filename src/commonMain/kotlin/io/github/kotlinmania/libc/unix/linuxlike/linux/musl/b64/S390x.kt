// port-lint: source unix/linux_like/linux/musl/b64/s390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*

public typealias GregT = ULong

    val key: KeyT,
    val ipcPermKey: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CInt,
)

    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
)

    val fType: CUInt,
    val fBsize: CUInt,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: CUInt,
    val fFrsize: CUInt,
    val fFlags: CUInt,
    val fSpare: UIntArray,
)

public data class PswT(
    val mask: CULong,
    val addr: CULong,
)

public data class FpregsetT(
    val fpc: CUInt,
    val fprs: List<FpregT>,
)

public data class McontextT(
    val psw: PswT,
    val gregs: ULongArray,
    val aregs: UIntArray,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: CULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
)

// C union; only one variant is valid at a time.
public data class FpregT(
    val d: CDouble? = null,
    val f: CFloat? = null,
)

public const val SYS_s390_runtime_instr: CLong = 342
public const val SYS_s390_pci_mmio_write: CLong = 352
public const val SYS_s390_pci_mmio_read: CLong = 353
public const val SYS_s390_guarded_storage: CLong = 378
public const val SYS_s390_sthyi: CLong = 380
public const val SYS_cachestat: CLong = 451
public const val SYS_fchmodat2: CLong = 452
public const val SYS_mseal: CLong = 462
