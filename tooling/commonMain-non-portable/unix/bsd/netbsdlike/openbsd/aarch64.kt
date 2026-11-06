// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias UcontextT = Sigcontext

public open class Sigcontext(
    public var scUnused: CInt,
    public var scMask: CInt,
    public var scSp: CUlong,
    public var scLr: CUlong,
    public var scElr: CUlong,
    public var scSpsr: CUlong,
    public var scX: List<CUlong>,
    public var scCookie: CLong,
)

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u
