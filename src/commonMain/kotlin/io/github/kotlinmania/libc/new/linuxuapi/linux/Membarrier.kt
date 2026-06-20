// port-lint: source new/linux_uapi/linux/membarrier.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

/**
 * Header: `uapi/linux/membarrier.h`.
 *
 * `membarrier_cmd` command values.
 */
public val MEMBARRIER_CMD_QUERY: CInt = 0
public val MEMBARRIER_CMD_GLOBAL: CInt = 1 shl 0
public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: CInt = 1 shl 1
public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: CInt = 1 shl 2
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: CInt = 1 shl 3
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: CInt = 1 shl 4
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 5
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 6
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 7
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 8
