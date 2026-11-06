// port-lint: source new/linux_uapi/linux/can/bcm.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.linuxuapi.linux.CanFrame
import io.github.kotlinmania.libc.new.linuxuapi.linux.CanidT

// Header: `linux / can / bcm.h`

public open class BcmTimeval(public var tvSec: CLong, public var tvUsec: CLong)

public open class BcmMsgHead(
    public var opcode: UInt,
    public var flags: UInt,
    public var count: UInt,
    public var ival1: BcmTimeval,
    public var ival2: BcmTimeval,
    public var canId: CanidT,
    public var nframes: UInt,
    public var frames: List<CanFrame>,
)

public val TX_SETUP: UInt = 1u

public val TX_DELETE: UInt = TX_SETUP + 1u

public val TX_READ: UInt = TX_DELETE + 1u

public val TX_SEND: UInt = TX_READ + 1u

public val RX_SETUP: UInt = TX_SEND + 1u

public val RX_DELETE: UInt = RX_SETUP + 1u

public val RX_READ: UInt = RX_DELETE + 1u

public val TX_STATUS: UInt = RX_READ + 1u

public val TX_EXPIRED: UInt = TX_STATUS + 1u

public val RX_STATUS: UInt = TX_EXPIRED + 1u

public val RX_TIMEOUT: UInt = RX_STATUS + 1u

public val RX_CHANGED: UInt = RX_TIMEOUT + 1u

public val SETTIMER: UInt = 0x0001u

public val STARTTIMER: UInt = 0x0002u

public val TX_COUNTEVT: UInt = 0x0004u

public val TX_ANNOUNCE: UInt = 0x0008u

public val TX_CP_CAN_ID: UInt = 0x0010u

public val RX_FILTER_ID: UInt = 0x0020u

public val RX_CHECK_DLC: UInt = 0x0040u

public val RX_NO_AUTOTIMER: UInt = 0x0080u

public val RX_ANNOUNCE_RESUME: UInt = 0x0100u

public val TX_RESET_MULTI_IDX: UInt = 0x0200u

public val RX_RTR_FRAME: UInt = 0x0400u

public val CAN_FD_FRAME: UInt = 0x0800u
