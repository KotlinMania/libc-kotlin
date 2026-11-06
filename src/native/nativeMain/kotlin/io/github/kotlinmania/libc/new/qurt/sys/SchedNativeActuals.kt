@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.cinterop.libc_sched_sched_yield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.cinterop.libc_sched_sched_get_priority_max(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.cinterop.libc_sched_sched_get_priority_min(policy)
