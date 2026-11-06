// port-lint: source unix/bsd/netbsdlike/openbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias UcontextT = Sigcontext

public open class Sigcontext(
    public var scUnused: CInt,
    public var scMask: CInt,
    public var scRa: CLong,
    public var scSp: CLong,
    public var scGp: CLong,
    public var scTp: CLong,
    public var scT: List<CLong>,
    public var scS: List<CLong>,
    public var scA: List<CLong>,
    public var scSepc: CLong,
    public var scF: List<CLong>,
    public var scFcsr: CLong,
    public var scCookie: CLong,
)

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u
