package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class Timeval32(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval32> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timeval32 =
                    Timeval32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timeval32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tvUsec)
                }
            }
    }
}

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiTypelen: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiUnused1: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiBaudrate: UInt = 0u,
    public var ifiIpackets: UInt = 0u,
    public var ifiIerrors: UInt = 0u,
    public var ifiOpackets: UInt = 0u,
    public var ifiOerrors: UInt = 0u,
    public var ifiCollisions: UInt = 0u,
    public var ifiIbytes: UInt = 0u,
    public var ifiObytes: UInt = 0u,
    public var ifiImcasts: UInt = 0u,
    public var ifiOmcasts: UInt = 0u,
    public var ifiIqdrops: UInt = 0u,
    public var ifiNoproto: UInt = 0u,
    public var ifiRecvtiming: UInt = 0u,
    public var ifiXmittiming: UInt = 0u,
    public var ifiLastchange: Timeval32 = Timeval32(),
    public var ifiUnused2: UInt = 0u,
    public var ifiHwassist: UInt = 0u,
    public var ifiReserved1: UInt = 0u,
    public var ifiReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfData> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfData =
                    IfData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (Timeval32.typeLayout()).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: IfData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ifiType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ifiTypelen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifiPhysical)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifiAddrlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.ifiHdrlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.ifiRecvquota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.ifiXmitquota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.ifiUnused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ifiMtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ifiMetric)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ifiBaudrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ifiIpackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ifiIerrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ifiOpackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ifiOerrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ifiCollisions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ifiIbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ifiObytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ifiImcasts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ifiOmcasts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ifiIqdrops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ifiNoproto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ifiRecvtiming)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ifiXmittiming)
                    (Timeval32.typeLayout()).writeNative(addr + 72L, value.ifiLastchange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ifiUnused2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.ifiHwassist)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.ifiReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.ifiReserved2)
                }
            }
    }
}

public data class BpfHdr(
    public var bhTstamp: Timeval32 = Timeval32(),
    public var bhCaplen: UInt = 0u,
    public var bhDatalen: UInt = 0u,
    public var bhHdrlen: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfHdr> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): BpfHdr =
                    BpfHdr(
                        (Timeval32.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BpfHdr) {
                    (Timeval32.typeLayout()).writeNative(addr, value.bhTstamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bhCaplen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bhDatalen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.bhHdrlen)
                }
            }
    }
}
