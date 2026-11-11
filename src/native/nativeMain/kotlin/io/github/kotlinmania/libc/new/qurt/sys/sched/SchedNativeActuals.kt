@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libc_new_qurt_sys_sched_schedGetPriorityMax
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libc_new_qurt_sys_sched_schedGetPriorityMin
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libc_new_qurt_sys_sched_schedYield

public actual fun schedYield(): CInt =
    libc_new_qurt_sys_sched_schedYield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_new_qurt_sys_sched_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_new_qurt_sys_sched_schedGetPriorityMin(policy)
