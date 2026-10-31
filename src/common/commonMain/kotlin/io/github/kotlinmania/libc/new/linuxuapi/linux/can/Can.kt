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

public typealias CanidT = UInt

public const val CAN_SFF_ID_BITS: Int = 11
public const val CAN_EFF_ID_BITS: Int = 29
public const val CANXL_PRIO_BITS: Int = CAN_SFF_ID_BITS

public typealias CanErrMaskT = UInt

public const val CAN_MAX_DLC: Int = 8
public const val CAN_MAX_DLEN: Int = 8

public const val CANFD_MAX_DLC: Int = 15
public const val CANFD_MAX_DLEN: Int = 64

public const val CANXL_MIN_DLC: Int = 0
public const val CANXL_MAX_DLC: Int = 2047
public const val CANXL_MAX_DLC_MASK: Int = 0x07FF
public const val CANXL_MIN_DLEN: Int = 1
public const val CANXL_MAX_DLEN: Int = 2048

public data class CanFrame(
    val canId: UInt,
    val canDlc: UByte,
    val len8Dlc: UByte,
    val data: List<UByte>,
)

public const val CANFD_BRS: Int = 0x01
public const val CANFD_ESI: Int = 0x02
public const val CANFD_FDF: Int = 0x04

public data class CanfdFrame(
    val canId: UInt,
    val len: UByte,
    val flags: UByte,
    val data: List<UByte>,
)

public const val CANXL_XLF: Int = 0x80
public const val CANXL_SEC: Int = 0x01

public data class CanxlFrame(
    val prio: UInt,
    val flags: UByte,
    val sdt: UByte,
    val len: UShort,
    val af: UInt,
    val data: List<UByte>,
)

public const val CAN_MTU: Int = 16
public const val CANFD_MTU: Int = 72
public const val CANXL_MTU: Int = 2060
public const val CANXL_HDR_SIZE: Int = 12
public const val CANXL_MIN_MTU: Int = CANXL_HDR_SIZE + 64
public const val CANXL_MAX_MTU: Int = CANXL_MTU

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
