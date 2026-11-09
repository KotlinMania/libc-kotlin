// port-lint: source new/linux_uapi/linux/can/raw.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can.raw

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.linuxuapi.linux.can.CAN_RAW
import io.github.kotlinmania.libc.new.linuxuapi.linux.can.SOL_CAN_BASE

// Header: `linux / can / raw.h`

public val SOL_CAN_RAW: CInt = SOL_CAN_BASE + CAN_RAW

public val CAN_RAW_FILTER_MAX: CInt = 512

// Note(cleanup): use `cEnum !`, which needs to be adapted to allow omitting a type.
public val CAN_RAW_FILTER: CInt = 1

public val CAN_RAW_ERR_FILTER: CInt = 2

public val CAN_RAW_LOOPBACK: CInt = 3

public val CAN_RAW_RECV_OWN_MSGS: CInt = 4

public val CAN_RAW_FD_FRAMES: CInt = 5

public val CAN_RAW_JOIN_FILTERS: CInt = 6

public val CAN_RAW_XL_FRAMES: CInt = 7
