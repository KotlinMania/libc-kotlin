package io.github.kotlinmania.libc.unix.linuxlike.android.b64.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.DevT
import io.github.kotlinmania.libc.unix.linuxlike.android.InoT
import io.github.kotlinmania.libc.unix.linuxlike.android.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: CUint = 0u,
    public var stNlink: CUint = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad1: CUlong = 0uL,
    public var stSize: Off64T = 0L,
    public var stBlksize: CInt = 0,
    public var pad2: CInt = 0,
    public var stBlocks: CLong = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused4: CUint = 0u,
    public var unused5: CUint = 0u,
)

public class Stat64(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: CUint = 0u,
    public var stNlink: CUint = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad1: CUlong = 0uL,
    public var stSize: Off64T = 0L,
    public var stBlksize: CInt = 0,
    public var pad2: CInt = 0,
    public var stBlocks: CLong = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused4: CUint = 0u,
    public var unused5: CUint = 0u,
)

public data class MaxAlignT(
    public var priv: FloatArray = FloatArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (8).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}
