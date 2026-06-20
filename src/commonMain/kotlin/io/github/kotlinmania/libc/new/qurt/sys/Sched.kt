// port-lint: source new/qurt/sys/sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `sys/sched.h`.
 */

public const val SCHED_FIFO: CInt = 0
public const val SCHED_RR: CInt = 1
public const val SCHED_SPORADIC: CInt = 2
public const val SCHED_OTHER: CInt = 3

public data class SchedParam(
    val unimplemented: COpaquePointer?,
    val schedPriority: CInt,
)

public expect fun schedYield(): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt
