// port-lint: source new/linux_uapi/linux/can.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.SaFamilyT
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Header: `uapi / linux / can.h`

public val CAN_EFF_FLAG: CanidT = 0x80000000u

public val CAN_RTR_FLAG: CanidT = 0x40000000u

public val CAN_ERR_FLAG: CanidT = 0x20000000u

public val CAN_SFF_MASK: CanidT = 0x000007FFu

public val CAN_EFF_MASK: CanidT = 0x1FFFFFFFu

public val CAN_ERR_MASK: CanidT = 0x1FFFFFFFu

public val CANXL_PRIO_MASK: CanidT = CAN_SFF_MASK

public typealias CanidT = UInt

public val CAN_SFF_ID_BITS: CInt = 11

public val CAN_EFF_ID_BITS: CInt = 29

public val CANXL_PRIO_BITS: CInt = CAN_SFF_ID_BITS

public typealias CanErrMaskT = UInt

public val CAN_MAX_DLC: CInt = 8

public val CAN_MAX_DLEN: Int = 8

public val CANFD_MAX_DLC: CInt = 15

public val CANFD_MAX_DLEN: Int = 64

public val CANXL_MIN_DLC: CInt = 0

public val CANXL_MAX_DLC: CInt = 2047

public val CANXL_MAX_DLC_MASK: CInt = 0x07FF

public val CANXL_MIN_DLEN: Int = 1

public val CANXL_MAX_DLEN: Int = 2048

public data class CanFrame(
    public var canId: CanidT = 0u,
    // Note(1.0): this field was renamed to `len` in Linux 5.11
    public var canDlc: UByte = 0u,
    public var pad: UByte = 0u,
    public var res0: UByte = 0u,
    public var len8Dlc: UByte = 0u,
    public var data: UByteArray = UByteArray(CAN_MAX_DLEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CanFrame) return false
        if (this.canId != other.canId) return false
        if (this.canDlc != other.canDlc) return false
        if (this.pad != other.pad) return false
        if (this.res0 != other.res0) return false
        if (this.len8Dlc != other.len8Dlc) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.canId.hashCode()
        result = 31 * result + this.canDlc.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.res0.hashCode()
        result = 31 * result + this.len8Dlc.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public val CANFD_BRS: CInt = 0x01

public val CANFD_ESI: CInt = 0x02

public val CANFD_FDF: CInt = 0x04

public data class CanfdFrame(
    public var canId: CanidT = 0u,
    public var len: UByte = 0u,
    public var flags: UByte = 0u,
    public var res0: UByte = 0u,
    public var res1: UByte = 0u,
    public var data: UByteArray = UByteArray(CANFD_MAX_DLEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CanfdFrame) return false
        if (this.canId != other.canId) return false
        if (this.len != other.len) return false
        if (this.flags != other.flags) return false
        if (this.res0 != other.res0) return false
        if (this.res1 != other.res1) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.canId.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.res0.hashCode()
        result = 31 * result + this.res1.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanfdFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanfdFrame> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(8L, 1L) + ((CANFD_MAX_DLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)
                            ),
                            maxOf(maxOf(8L, 4L), 1L),
                        )
                override val alignBytes: Long = maxOf(maxOf(8L, 4L), 1L)
                override fun readNative(addr: Long): CanfdFrame =
                    CanfdFrame(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (CANFD_MAX_DLEN).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(8L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: CanfdFrame) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.canId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.res0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.res1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (CANFD_MAX_DLEN).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(8L, 1L),
                        value.data,
                    )
                }
            }
    }
}

public val CANXL_XLF: CInt = 0x80

public val CANXL_SEC: CInt = 0x01

public data class CanxlFrame(
    public var prio: CanidT = 0u,
    public var flags: UByte = 0u,
    public var sdt: UByte = 0u,
    public var len: UShort = 0u,
    public var af: UInt = 0u,
    public var data: UByteArray = UByteArray(CANXL_MAX_DLEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CanxlFrame) return false
        if (this.prio != other.prio) return false
        if (this.flags != other.flags) return false
        if (this.sdt != other.sdt) return false
        if (this.len != other.len) return false
        if (this.af != other.af) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prio.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sdt.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.af.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanxlFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanxlFrame> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(12L, 1L) + ((CANXL_MAX_DLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)
                            ),
                            maxOf(maxOf(4L, 1L), 2L),
                        )
                override val alignBytes: Long = maxOf(maxOf(4L, 1L), 2L)
                override fun readNative(addr: Long): CanxlFrame =
                    CanxlFrame(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (CANXL_MAX_DLEN).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(12L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: CanxlFrame) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.prio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.sdt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.af)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (CANXL_MAX_DLEN).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(12L, 1L),
                        value.data,
                    )
                }
            }
    }
}

// Note(offsetOf): use `core.mem.offsetOf` once that is available
// https://github.com/rust-lang/rfcs/pull/3308
// pub const CANXL_HDR_SIZE: Int = core.mem.offsetOf(canxlFrame, data);
public val CANXL_HDR_SIZE: Int = 12

public val CANXL_MIN_MTU: Int = CANXL_HDR_SIZE + 64

public val CANXL_MTU: Int = sizeOf<CanxlFrame>(typeLayoutT = CanxlFrame.typeLayout())

public val CANXL_MAX_MTU: Int = CANXL_MTU

public val CAN_RAW: CInt = 1

public val CAN_BCM: CInt = 2

public val CAN_TP16: CInt = 3

public val CAN_TP20: CInt = 4

public val CAN_MCNET: CInt = 5

public val CAN_ISOTP: CInt = 6

public val CAN_J1939: CInt = 7

public val CAN_NPROTO: CInt = 8

public val SOL_CAN_BASE: CInt = 100

public val CAN_INV_FILTER: CanidT = 0x20000000u

public val CAN_MTU: Int = sizeOf<CanFrame>(typeLayoutT = ObjectSlotLayout<CanFrame>())

public data class SockaddrCan(
    public var canFamily: SaFamilyT = 0u,
    public var canIfindex: CInt = 0,
    public var canAddr: CAnonymousSockaddrCanCanAddr = CAnonymousSockaddrCanCanAddr(),
)

public data class CAnonymousSockaddrCanCanAddr(
    public var tp: CAnonymousSockaddrCanTp = CAnonymousSockaddrCanTp(),
    public var j1939: CAnonymousSockaddrCanJ1939 = CAnonymousSockaddrCanJ1939(),
)

public data class CAnonymousSockaddrCanTp(
    public var rxId: CanidT = 0u,
    public var txId: CanidT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSockaddrCanTp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSockaddrCanTp> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousSockaddrCanTp =
                    CAnonymousSockaddrCanTp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousSockaddrCanTp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rxId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.txId)
                }
            }
    }
}

public data class CAnonymousSockaddrCanJ1939(
    public var name: ULong = 0uL,
    public var pgn: UInt = 0u,
    public var addr: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSockaddrCanJ1939> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSockaddrCanJ1939> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousSockaddrCanJ1939 =
                    CAnonymousSockaddrCanJ1939(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousSockaddrCanJ1939) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pgn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.addr)
                }
            }
    }
}

public data class CanFilter(
    public var canId: CanidT = 0u,
    public var canMask: CanidT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CanFilter> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CanFilter =
                    CanFilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CanFilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.canId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.canMask)
                }
            }
    }
}

public val CANFD_MTU: Int = sizeOf<CanfdFrame>(typeLayoutT = CanfdFrame.typeLayout())
