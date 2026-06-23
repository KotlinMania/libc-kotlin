// port-lint: source new/linux_uapi/linux/can/bcm.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class BcmTimeval(
    val tvSec: CLong,
    val tvUsec: CLong,
)

public data class BcmMsgHead(
    val opcode: UInt,
    val flags: UInt,
    val count: UInt,
    val ival1: BcmTimeval,
    val ival2: BcmTimeval,
    val canId: CanidT,
    val nframes: UInt,
    val frames: List<CanFrame>,
)

public const val SETTIMER: UInt = 0x0001u
public const val STARTTIMER: UInt = 0x0002u
public const val TX_COUNTEVT: UInt = 0x0004u
public const val TX_ANNOUNCE: UInt = 0x0008u
public const val TX_CP_CAN_ID: UInt = 0x0010u
public const val RX_FILTER_ID: UInt = 0x0020u
public const val RX_CHECK_DLC: UInt = 0x0040u
public const val RX_NO_AUTOTIMER: UInt = 0x0080u
public const val RX_ANNOUNCE_RESUME: UInt = 0x0100u
public const val TX_RESET_MULTI_IDX: UInt = 0x0200u
public const val RX_RTR_FRAME: UInt = 0x0400u
public const val CAN_FD_FRAME: UInt = 0x0800u
