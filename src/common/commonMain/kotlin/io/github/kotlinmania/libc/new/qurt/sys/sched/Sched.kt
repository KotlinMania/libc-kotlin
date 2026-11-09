// port-lint: source new/qurt/sys/sched.rs
package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

// Header: `sys / sched.h`
//
// QuRT scheduling parameters and functions.

// Scheduling policies (from QuRT sys/sched.h)
public val SCHED_FIFO: CInt = 0

public val SCHED_RR: CInt = 1

public val SCHED_SPORADIC: CInt = 2

public val SCHED_OTHER: CInt = 3

public open class SchedParam(public var unsupportedBranch: COpaquePointer?, public var schedPriority: CInt)

public expect fun schedYield(): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt
