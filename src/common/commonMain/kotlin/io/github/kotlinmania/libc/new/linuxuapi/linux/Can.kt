// port-lint: source new/linux_uapi/linux/can.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.SaFamilyT

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

public open class CanFrame(
    public var canId: CanidT,
    // Note(1.0): this field was renamed to `len` in Linux 5.11
    public var canDlc: UByte,
    public var pad: UByte,
    public var res0: UByte,
    public var len8Dlc: UByte,
    public var data: List<UByte>,
)

public val CANFD_BRS: CInt = 0x01

public val CANFD_ESI: CInt = 0x02

public val CANFD_FDF: CInt = 0x04

public open class CanfdFrame(
    public var canId: CanidT,
    public var len: UByte,
    public var flags: UByte,
    public var res0: UByte,
    public var res1: UByte,
    public var data: List<UByte>,
)

public val CANXL_XLF: CInt = 0x80

public val CANXL_SEC: CInt = 0x01

public open class CanxlFrame(
    public var prio: CanidT,
    public var flags: UByte,
    public var sdt: UByte,
    public var len: UShort,
    public var af: UInt,
    public var data: List<UByte>,
)

public val CAN_MTU: Int = sizeOf<CanFrame>()

public val CANFD_MTU: Int = sizeOf<CanfdFrame>()

public val CANXL_MTU: Int = sizeOf<CanxlFrame>()

// Note(offsetOf): use `core.mem.offsetOf !` once that is available
// https://github.com/rust-lang/rfcs/pull/3308
// pub const CANXL_HDR_SIZE: Int = core::mem::offsetOf(canxlFrame, data);
public val CANXL_HDR_SIZE: Int = 12

public val CANXL_MIN_MTU: Int = CANXL_HDR_SIZE + 64

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

public open class SockaddrCan(
    public var canFamily: SaFamilyT,
    public var canIfindex: CInt,
    public var canAddr: CAnonymousSockaddrCanCanAddr,
)

public open class CAnonymousSockaddrCanCanAddr(public var tp: CAnonymousSockaddrCanTp? = null, public var j1939: CAnonymousSockaddrCanJ1939? = null)

public open class CAnonymousSockaddrCanTp(public var rxId: CanidT, public var txId: CanidT)

public open class CAnonymousSockaddrCanJ1939(
    public var name: ULong,
    public var pgn: UInt,
    public var addr: UByte,
)

public open class CanFilter(public var canId: CanidT, public var canMask: CanidT)

public val CAN_INV_FILTER: CanidT = 0x20000000u
