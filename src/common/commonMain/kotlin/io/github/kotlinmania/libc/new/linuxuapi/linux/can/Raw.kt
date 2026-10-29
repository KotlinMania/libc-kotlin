// port-lint: source new/linux_uapi/linux/can/raw.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

public const val SOL_CAN_RAW: Int = SOL_CAN_BASE + CAN_RAW
public const val CAN_RAW_FILTER_MAX: Int = 512
public const val CAN_RAW_FILTER: Int = 1
public const val CAN_RAW_ERR_FILTER: Int = 2
public const val CAN_RAW_LOOPBACK: Int = 3
public const val CAN_RAW_RECV_OWN_MSGS: Int = 4
public const val CAN_RAW_FD_FRAMES: Int = 5
public const val CAN_RAW_JOIN_FILTERS: Int = 6
public const val CAN_RAW_XL_FRAMES: Int = 7
