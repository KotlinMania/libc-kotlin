// port-lint: source new/linux_uapi/linux/membarrier.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.membarrier

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// Header: `uapi / linux / membarrier.h`

public typealias MembarrierCmd = CInt

public val MEMBARRIER_CMD_QUERY: MembarrierCmd = 0

public val MEMBARRIER_CMD_GLOBAL: MembarrierCmd = 1 shl 0

public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: MembarrierCmd = 1 shl 1

public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: MembarrierCmd = 1 shl 2

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: MembarrierCmd = 1 shl 3

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: MembarrierCmd = 1 shl 4

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: MembarrierCmd = 1 shl 5

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: MembarrierCmd = 1 shl 6

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: MembarrierCmd = 1 shl 7

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: MembarrierCmd = 1 shl 8
