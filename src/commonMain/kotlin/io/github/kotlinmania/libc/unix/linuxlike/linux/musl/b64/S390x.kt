// port-lint: source unix/linux_like/linux/musl/b64/s390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*

public typealias GregT = ULong

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
