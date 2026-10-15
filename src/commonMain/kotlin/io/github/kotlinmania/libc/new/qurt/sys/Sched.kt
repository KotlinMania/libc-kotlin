// port-lint: source new/qurt/sys/sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val unimplemented: COpaquePointer?,
    val schedPriority: Int,
)

public const val SCHED_FIFO: Int = 0
public const val SCHED_RR: Int = 1
public const val SCHED_SPORADIC: Int = 2
public const val SCHED_OTHER: Int = 3

public expect fun schedYield(): Int

public expect fun schedGetPriorityMax(policy: Int): Int

public expect fun schedGetPriorityMin(policy: Int): Int
