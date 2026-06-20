// port-lint: source new/linux_uapi/linux/can/bcm.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

/**
 * Header: `linux/can/bcm.h`.
 */

public data class BcmTimeval(
    val tvSec: CLong,
    val tvUsec: CLong,
)

// frames is a C flexible array member (`[can_frame; 0]`).
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

// Anonymous BCM opcode enum (repr u32), values auto-incremented from 1.
public const val TX_SETUP: UInt = 1u
public const val TX_DELETE: UInt = 2u
public const val TX_READ: UInt = 3u
public const val TX_SEND: UInt = 4u
public const val RX_SETUP: UInt = 5u
public const val RX_DELETE: UInt = 6u
public const val RX_READ: UInt = 7u
public const val TX_STATUS: UInt = 8u
public const val TX_EXPIRED: UInt = 9u
public const val RX_STATUS: UInt = 10u
public const val RX_TIMEOUT: UInt = 11u
public const val RX_CHANGED: UInt = 12u

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
