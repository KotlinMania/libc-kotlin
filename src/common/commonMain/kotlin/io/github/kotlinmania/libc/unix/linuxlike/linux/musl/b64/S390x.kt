// port-lint: source unix/linux_like/linux/musl/b64/s390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*

public typealias GregT = ULong

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

public data class FpregT(
    val d: Double? = null,
    val f: Float? = null,
)

public const val SYS_S390_RUNTIME_INSTR: Long = 342
public const val SYS_S390_PCI_MMIO_WRITE: Long = 352
public const val SYS_S390_PCI_MMIO_READ: Long = 353
public const val SYS_S390_GUARDED_STORAGE: Long = 378
public const val SYS_S390_STHYI: Long = 380
public const val SYS_CACHESTAT: Long = 451
public const val SYS_FCHMODAT2: Long = 452
public const val SYS_MSEAL: Long = 462
