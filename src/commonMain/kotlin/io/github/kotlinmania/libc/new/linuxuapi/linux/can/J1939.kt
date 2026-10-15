// port-lint: source new/linux_uapi/linux/can/j1939.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

public data class J1939Filter(
    val name: ULong,
    val nameMask: ULong,
    val pgn: UInt,
    val pgnMask: UInt,
    val addr: UByte,
    val addrMask: UByte,
)

public val J1939_MAX_UNICAST_ADDR: UByte = (0xfd).toUByte()
public val J1939_IDLE_ADDR: UByte = (0xfe).toUByte()
public val J1939_NO_ADDR: UByte = (0xff).toUByte()
public const val J1939_NO_NAME: ULong = 0uL
public const val J1939_PGN_REQUEST: UInt = 0x0ea00u
public const val J1939_PGN_ADDRESS_CLAIMED: UInt = 0x0ee00u
public const val J1939_PGN_ADDRESS_COMMANDED: UInt = 0x0fed8u
public const val J1939_PGN_PDU1_MAX: UInt = 0x3ff00u
public const val J1939_PGN_MAX: UInt = 0x3ffffu
public const val J1939_NO_PGN: UInt = 0x40000u
public const val SOL_CAN_J1939: Int = SOL_CAN_BASE + CAN_J1939
public const val SO_J1939_FILTER: Int = 1
public const val SO_J1939_PROMISC: Int = 2
public const val SO_J1939_SEND_PRIO: Int = 3
public const val SO_J1939_ERRQUEUE: Int = 4
public const val SCM_J1939_DEST_ADDR: Int = 1
public const val SCM_J1939_DEST_NAME: Int = 2
public const val SCM_J1939_PRIO: Int = 3
public const val SCM_J1939_ERRQUEUE: Int = 4
public const val J1939_NLA_PAD: Int = 0
public const val J1939_NLA_BYTES_ACKED: Int = 1
public const val J1939_NLA_TOTAL_SIZE: Int = 2
public const val J1939_NLA_PGN: Int = 3
public const val J1939_NLA_SRC_NAME: Int = 4
public const val J1939_NLA_DEST_NAME: Int = 5
public const val J1939_NLA_SRC_ADDR: Int = 6
public const val J1939_NLA_DEST_ADDR: Int = 7
public const val J1939_EE_INFO_NONE: Int = 0
public const val J1939_EE_INFO_TX_ABORT: Int = 1
public const val J1939_EE_INFO_RX_RTS: Int = 2
public const val J1939_EE_INFO_RX_DPO: Int = 3
public const val J1939_EE_INFO_RX_ABORT: Int = 4
public const val J1939_FILTER_MAX: Int = 512
