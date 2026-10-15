// port-lint: source new/linux_uapi/linux/can.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

public const val CAN_EFF_FLAG: UInt = 0x80000000u
public const val CAN_RTR_FLAG: UInt = 0x40000000u
public const val CAN_ERR_FLAG: UInt = 0x20000000u

public const val CAN_SFF_MASK: UInt = 0x000007FFu
public const val CAN_EFF_MASK: UInt = 0x1FFFFFFFu
public const val CAN_ERR_MASK: UInt = 0x1FFFFFFFu
public const val CANXL_PRIO_MASK: UInt = CAN_SFF_MASK

public const val CAN_SFF_ID_BITS: Int = 11
public const val CAN_EFF_ID_BITS: Int = 29
public const val CANXL_PRIO_BITS: Int = CAN_SFF_ID_BITS

public const val CAN_MAX_DLC: Int = 8
public const val CAN_MAX_DLEN: Int = 8

public const val CANFD_MAX_DLC: Int = 15
public const val CANFD_MAX_DLEN: Int = 64

public const val CANXL_MIN_DLC: Int = 0
public const val CANXL_MAX_DLC: Int = 2047
public const val CANXL_MAX_DLC_MASK: Int = 0x07FF
public const val CANXL_MIN_DLEN: Int = 1
public const val CANXL_MAX_DLEN: Int = 2048

// can_dlc was renamed to `len` in Linux 5.11. __pad / __res0 are layout padding.
public data class CanFrame(
    val canId: UInt,
    val canDlc: UByte,
    val len8Dlc: UByte,
    val data: ByteArray,
) {
    init {
        require(data.size == CAN_MAX_DLEN) { "can_frame data must be $CAN_MAX_DLEN bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as CanFrame
        if (canId != other.canId) return false
        if (canDlc != other.canDlc) return false
        if (len8Dlc != other.len8Dlc) return false
        if (!data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = canId.hashCode()
        result = 31 * result + canDlc.hashCode()
        result = 31 * result + len8Dlc.hashCode()
        result = 31 * result + data.contentHashCode()
        return result
    }
}

public const val CANFD_BRS: Int = 0x01
public const val CANFD_ESI: Int = 0x02
public const val CANFD_FDF: Int = 0x04

// __res0 / __res1 are layout padding.
public data class CanfdFrame(
    val canId: UInt,
    val len: UByte,
    val flags: UByte,
    val data: ByteArray,
) {
    init {
        require(data.size == CANFD_MAX_DLEN) { "canfd_frame data must be $CANFD_MAX_DLEN bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as CanfdFrame
        if (canId != other.canId) return false
        if (len != other.len) return false
        if (flags != other.flags) return false
        if (!data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = canId.hashCode()
        result = 31 * result + len.hashCode()
        result = 31 * result + flags.hashCode()
        result = 31 * result + data.contentHashCode()
        return result
    }
}

public const val CANXL_XLF: Int = 0x80
public const val CANXL_SEC: Int = 0x01

public data class CanxlFrame(
    val prio: UInt,
    val flags: UByte,
    val sdt: UByte,
    val len: UShort,
    val af: UInt,
    val data: ByteArray,
) {
    init {
        require(data.size == CANXL_MAX_DLEN) { "canxl_frame data must be $CANXL_MAX_DLEN bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as CanxlFrame
        if (prio != other.prio) return false
        if (flags != other.flags) return false
        if (sdt != other.sdt) return false
        if (len != other.len) return false
        if (af != other.af) return false
        if (!data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = prio.hashCode()
        result = 31 * result + flags.hashCode()
        result = 31 * result + sdt.hashCode()
        result = 31 * result + len.hashCode()
        result = 31 * result + af.hashCode()
        result = 31 * result + data.contentHashCode()
        return result
    }
}

// CAN_MTU / CANFD_MTU / CANXL_MTU / CANXL_MAX_MTU are `size_of::<...>()` of the
// frame structs; the C struct size cannot be computed in common Kotlin.
public const val CANXL_HDR_SIZE: Int = 12
public const val CANXL_MIN_MTU: Int = CANXL_HDR_SIZE + 64

public const val CAN_RAW: Int = 1
public const val CAN_BCM: Int = 2
public const val CAN_TP16: Int = 3
public const val CAN_TP20: Int = 4
public const val CAN_MCNET: Int = 5
public const val CAN_ISOTP: Int = 6
public const val CAN_J1939: Int = 7
public const val CAN_NPROTO: Int = 8

public const val SOL_CAN_BASE: Int = 100

public data class SockaddrCan(
    val canFamily: UShort,
    val canIfindex: Int,
    val canAddr: CAnonymousSockaddrCanCanAddr,
)

// C union of tp / j1939; only one variant is valid at a time.
public data class CAnonymousSockaddrCanCanAddr(
    val tp: CAnonymousSockaddrCanTp? = null,
    val j1939: CAnonymousSockaddrCanJ1939? = null,
)

public data class CAnonymousSockaddrCanTp(
    val rxId: UInt,
    val txId: UInt,
)

public data class CAnonymousSockaddrCanJ1939(
    val name: ULong,
    val pgn: UInt,
    val addr: UByte,
)

public data class CanFilter(
    val canId: UInt,
    val canMask: UInt,
)

public const val CAN_INV_FILTER: UInt = 0x20000000u
