// port-lint: source new/linux_uapi/linux/can/j1939.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

/**
 * Header: `linux/can/j1939.h`.
 */

public val J1939_MAX_UNICAST_ADDR: CUChar = 0xfdu.toUByte()
public val J1939_IDLE_ADDR: CUChar = 0xfeu.toUByte()
public val J1939_NO_ADDR: CUChar = 0xffu.toUByte()
public const val J1939_NO_NAME: CULong = 0uL
public const val J1939_PGN_REQUEST: CUInt = 0x0ea00u
public const val J1939_PGN_ADDRESS_CLAIMED: CUInt = 0x0ee00u
public const val J1939_PGN_ADDRESS_COMMANDED: CUInt = 0x0fed8u
public const val J1939_PGN_PDU1_MAX: CUInt = 0x3ff00u
public const val J1939_PGN_MAX: CUInt = 0x3ffffu
public const val J1939_NO_PGN: CUInt = 0x40000u

public typealias PgnT = UInt

public typealias PriorityT = UByte

public typealias NameT = ULong

public const val SOL_CAN_J1939: CInt = SOL_CAN_BASE + CAN_J1939

public const val SO_J1939_FILTER: CInt = 1
public const val SO_J1939_PROMISC: CInt = 2
public const val SO_J1939_SEND_PRIO: CInt = 3
public const val SO_J1939_ERRQUEUE: CInt = 4

public const val SCM_J1939_DEST_ADDR: CInt = 1
public const val SCM_J1939_DEST_NAME: CInt = 2
public const val SCM_J1939_PRIO: CInt = 3
public const val SCM_J1939_ERRQUEUE: CInt = 4

public const val J1939_NLA_PAD: CInt = 0
public const val J1939_NLA_BYTES_ACKED: CInt = 1
public const val J1939_NLA_TOTAL_SIZE: CInt = 2
public const val J1939_NLA_PGN: CInt = 3
public const val J1939_NLA_SRC_NAME: CInt = 4
public const val J1939_NLA_DEST_NAME: CInt = 5
public const val J1939_NLA_SRC_ADDR: CInt = 6
public const val J1939_NLA_DEST_ADDR: CInt = 7

public const val J1939_EE_INFO_NONE: CInt = 0
public const val J1939_EE_INFO_TX_ABORT: CInt = 1
public const val J1939_EE_INFO_RX_RTS: CInt = 2
public const val J1939_EE_INFO_RX_DPO: CInt = 3
public const val J1939_EE_INFO_RX_ABORT: CInt = 4

public data class J1939Filter(
    val name: NameT,
    val nameMask: NameT,
    val pgn: PgnT,
    val pgnMask: PgnT,
    val addr: UByte,
    val addrMask: UByte,
)

public const val J1939_FILTER_MAX: CInt = 512
