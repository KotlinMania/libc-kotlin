// port-lint: source new/qurt/sys/sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `sys / sched.h`
//
// QuRT scheduling parameters and functions.

// Scheduling policies (from QuRT sys/sched.h)
public val SCHED_FIFO: CInt = 0

public val SCHED_RR: CInt = 1

public val SCHED_SPORADIC: CInt = 2

public val SCHED_OTHER: CInt = 3

public open class SchedParam(public var unsupportedBranch: COpaquePointer?, public var schedPriority: CInt)

public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}
