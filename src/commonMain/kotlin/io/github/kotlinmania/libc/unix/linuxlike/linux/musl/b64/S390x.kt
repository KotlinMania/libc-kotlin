// port-lint: source unix/linux_like/linux/musl/b64/s390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*

// IpcPerm, Stat, Statfs are defined in Mips64.kt (first definitions in this package).

public data class PswT(
    val mask: ULong,
    val addr: ULong,
)

public data class FpregsetT(
    val fpc: UInt,
    val fprs: List<FpregT>,
)

public data class McontextT(
    val psw: PswT,
    val gregs: ULongArray,
    val aregs: UIntArray,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
)

// C union; only one variant is valid at a time.
public data class FpregT(
    val d: Double? = null,
    val f: Float? = null,
)

public const val SYS_s390_runtime_instr: Long = 342
public const val SYS_s390_pci_mmio_write: Long = 352
public const val SYS_s390_pci_mmio_read: Long = 353
public const val SYS_s390_guarded_storage: Long = 378
public const val SYS_s390_sthyi: Long = 380
public const val SYS_cachestat: Long = 451
public const val SYS_fchmodat2: Long = 452
public const val SYS_mseal: Long = 462
