// port-lint: source new/linux_uapi/linux/can.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

public typealias CanidT = UInt
public typealias CanErrMaskT = UInt

public data class CanFrame(
    val canId: CanidT,
    val canDlc: UByte,
    val res0: UByte,
    val len8Dlc: UByte,
    val data: UByteArray,
)

public data class CanfdFrame(
    val canId: CanidT,
    val len: UByte,
    val flags: UByte,
    val res0: UByte,
    val res1: UByte,
    val data: UByteArray,
)

public data class CanxlFrame(
    val prio: CanidT,
    val flags: UByte,
    val sdt: UByte,
    val len: UShort,
    val af: UInt,
    val data: UByteArray,
)

public data class SockaddrCan(
    val canFamily: SaFamilyT,
    val canIfindex: CInt,
    val canAddr: CAnonymousSockaddrCanCanAddr,
)

public data class CAnonymousSockaddrCanTp(
    val rxId: CanidT,
    val txId: CanidT,
)

public data class CAnonymousSockaddrCanJ1939(
    val name: ULong,
    val pgn: UInt,
    val addr: UByte,
)

public data class CanFilter(
    val canId: CanidT,
    val canMask: CanidT,
)

// C union; only one variant is valid at a time.
public data class CAnonymousSockaddrCanCanAddr(
    val tp: CAnonymousSockaddrCanTp? = null,
    val j1939: CAnonymousSockaddrCanJ1939? = null,
)

public const val CAN_EFF_FLAG: CanidT = 0x80000000u
public const val CAN_RTR_FLAG: CanidT = 0x40000000u
public const val CAN_ERR_FLAG: CanidT = 0x20000000u
public const val CAN_SFF_MASK: CanidT = 0x000007FFu
public const val CAN_EFF_MASK: CanidT = 0x1FFFFFFFu
public const val CAN_ERR_MASK: CanidT = 0x1FFFFFFFu
public const val CANXL_PRIO_MASK: CanidT = CAN_SFF_MASK
public const val CAN_SFF_ID_BITS: CInt = 11
public const val CAN_EFF_ID_BITS: CInt = 29
public const val CANXL_PRIO_BITS: CInt = CAN_SFF_ID_BITS
public const val CAN_MAX_DLC: CInt = 8
public const val CAN_MAX_DLEN: ULong = 8uL
public const val CANFD_MAX_DLC: CInt = 15
public const val CANFD_MAX_DLEN: ULong = 64uL
public const val CANXL_MIN_DLC: CInt = 0
public const val CANXL_MAX_DLC: CInt = 2047
public const val CANXL_MAX_DLC_MASK: CInt = 0x07FF
public const val CANXL_MIN_DLEN: ULong = 1uL
public const val CANXL_MAX_DLEN: ULong = 2048uL
public const val CANFD_BRS: CInt = 0x01
public const val CANFD_ESI: CInt = 0x02
public const val CANFD_FDF: CInt = 0x04
public const val CANXL_XLF: CInt = 0x80
public const val CANXL_SEC: CInt = 0x01

// CAN_MTU = size_of<CanFrame>() (struct size; computed at the FFI boundary)
// CANFD_MTU = size_of<CanfdFrame>() (struct size; computed at the FFI boundary)
public const val CANXL_MTU: ULong = 128uL
// CANXL_HDR_SIZE = offset_of(CanxlFrame, data) (field offset; computed at the FFI boundary)
public const val CANXL_HDR_SIZE: ULong = 12uL
public val CANXL_MIN_MTU: ULong = CANXL_HDR_SIZE + 64u
public const val CANXL_MAX_MTU: ULong = CANXL_MTU
public const val CAN_RAW: CInt = 1
public const val CAN_BCM: CInt = 2
public const val CAN_TP16: CInt = 3
public const val CAN_TP20: CInt = 4
public const val CAN_MCNET: CInt = 5
public const val CAN_ISOTP: CInt = 6
public const val CAN_J1939: CInt = 7
public const val CAN_NPROTO: CInt = 8
public const val SOL_CAN_BASE: CInt = 100
public const val CAN_INV_FILTER: CanidT = 0x20000000u
