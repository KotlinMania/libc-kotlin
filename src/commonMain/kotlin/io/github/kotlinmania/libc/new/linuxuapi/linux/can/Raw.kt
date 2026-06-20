// port-lint: source new/linux_uapi/linux/can/raw.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

/**
 * Header: `linux/can/raw.h`.
 */

public const val SOL_CAN_RAW: CInt = SOL_CAN_BASE + CAN_RAW
public const val CAN_RAW_FILTER_MAX: CInt = 512

public const val CAN_RAW_FILTER: CInt = 1
public const val CAN_RAW_ERR_FILTER: CInt = 2
public const val CAN_RAW_LOOPBACK: CInt = 3
public const val CAN_RAW_RECV_OWN_MSGS: CInt = 4
public const val CAN_RAW_FD_FRAMES: CInt = 5
public const val CAN_RAW_JOIN_FILTERS: CInt = 6
public const val CAN_RAW_XL_FRAMES: CInt = 7
