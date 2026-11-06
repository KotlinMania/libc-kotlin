// port-lint: source new/linux_uapi/linux/can/j1939.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

// `linux / can / j1939.h`

public val J1939_MAX_UNICAST_ADDR: CUchar = 0xfdu

public val J1939_IDLE_ADDR: CUchar = 0xfeu

public val J1939_NO_ADDR: CUchar = 0xffu

public val J1939_NO_NAME: CUlong = 0uL

public val J1939_PGN_REQUEST: CUint = 0x0ea00u

public val J1939_PGN_ADDRESS_CLAIMED: CUint = 0x0ee00u

public val J1939_PGN_ADDRESS_COMMANDED: CUint = 0x0fed8u

public val J1939_PGN_PDU1_MAX: CUint = 0x3ff00u

public val J1939_PGN_MAX: CUint = 0x3ffffu

public val J1939_NO_PGN: CUint = 0x40000u

public typealias PgnT = UInt

public typealias PriorityT = UByte

public typealias NameT = ULong

public val SOL_CAN_J1939: CInt = SOL_CAN_BASE + CAN_J1939

// Note(cleanup): these could use cEnum if it can accept anonymous enums.
public val SO_J1939_FILTER: CInt = 1

public val SO_J1939_PROMISC: CInt = 2

public val SO_J1939_SEND_PRIO: CInt = 3

public val SO_J1939_ERRQUEUE: CInt = 4

public val SCM_J1939_DEST_ADDR: CInt = 1

public val SCM_J1939_DEST_NAME: CInt = 2

public val SCM_J1939_PRIO: CInt = 3

public val SCM_J1939_ERRQUEUE: CInt = 4

public val J1939_NLA_PAD: CInt = 0

public val J1939_NLA_BYTES_ACKED: CInt = 1

public val J1939_NLA_TOTAL_SIZE: CInt = 2

public val J1939_NLA_PGN: CInt = 3

public val J1939_NLA_SRC_NAME: CInt = 4

public val J1939_NLA_DEST_NAME: CInt = 5

public val J1939_NLA_SRC_ADDR: CInt = 6

public val J1939_NLA_DEST_ADDR: CInt = 7

public val J1939_EE_INFO_NONE: CInt = 0

public val J1939_EE_INFO_TX_ABORT: CInt = 1

public val J1939_EE_INFO_RX_RTS: CInt = 2

public val J1939_EE_INFO_RX_DPO: CInt = 3

public val J1939_EE_INFO_RX_ABORT: CInt = 4

public open class J1939Filter(
    public var name: NameT,
    public var nameMask: NameT,
    public var pgn: PgnT,
    public var pgnMask: PgnT,
    public var addr: UByte,
    public var addrMask: UByte,
)

public val J1939_FILTER_MAX: CInt = 512
